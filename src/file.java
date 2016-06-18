import java.io.*;

public class file
{

  static Writer writer = null;

  public static void open(String file_name)
  {

    try
    {

      writer = new BufferedWriter(

        new OutputStreamWriter(

          new FileOutputStream(file_name), "utf-8"

      ));

    }
    catch(IOException e)
    {

      System.out.println("IOException - " + e.getMessage());

    }

  }

  public static void write(String data)
  {

    try
    {

      file myFile = new file();

      if(myFile.writer != null)
      {

        myFile.writer.write(data);

      }

    }
    catch(IOException e)
    {

      System.out.println("IOException - " + e.getMessage());

    }

  }

  public static void close()
  {

    try
    {

      file myFile = new file();

      if(myFile.writer != null)
      {

        myFile.writer.close();

      }

    }
    catch(Exception e)
    {

      System.out.println("Exception - " + e.getMessage());

    }

  }

  public static void main(String[] args)
  {

    /*************
     * Code Here *
     *************
     */

  }

}
