package chapter_twelve;

import java.io.File;

/**
 * **12.29 (Rename files) Suppose you have several files in a directory named Exercisei_j,
 * where i and j are digits. Write a program that pads a 0 before j if j is a single
 * digit. For example, a file named Exercise2_1 in a directory will be renamed to
 * Exercise2_01. In Java, when you pass the symbol * from the command line,
 * it refers to all files in the directory (see Supplement III.V). Use the following
 * command to run your program:
 * java Exercise12_29 *
 *
 * @ Mojtaba Sayadi
 * */
public class Problem$29
{
    public static void main(String[] args)
    {
        String path = args[0];
        if (path.equals("*"))
            // current directory
            path = System.getProperty("user.dir");

        File directory = new File(path);

        if (!directory.exists())
        {
            System.out.println("the directory is not exist :[");
            System.exit(-1);
        }

        File[] files = getAllFiles(directory);

        for (File file: files)
            renameFile(file);
    }

    public static void renameFile(File file)
    {
        String fileName = file.getName();

        try
        {
            String type = fileName.substring(fileName.lastIndexOf("."));
            String[] component = fileName.split("_");
            String modifiedLine = "Exercise";

            String i = component[0].replace("Exercise", ""),
                    j = component[1].replace(type, "");

            if (j.length() < 2)
                j = 0 + j;

            File newFile = new File(modifiedLine + i + "_" + j + type);

            if (!file.renameTo(newFile))
                System.out.println("file name " + newFile.getName() + " is already exist.");
        }
        catch (Exception exception)
        {
            System.out.println("file name " + fileName + " is not in the right format");
        }
    }

    public static File[] getAllFiles(File file)
    {
        if (file.isDirectory())
            return file.listFiles();
        return new File[]{file};
    }
}


class Drive
{
    public static void main(String[] args)
    {
        Problem$29.main(new String[] {"src/chapter_twelve/test"});
    }
}
