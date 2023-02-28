import java.util.ArrayList;

public class ArrayListAlgorithms
{
    public static void removeDuplicates(ArrayList<Integer> intList)
    {
        for (int i=0; i< intList.size(); i++)
        {
            for (int j= i+1; j<intList.size(); j++)
            {
                if (intList.get(i) == intList.get(j))
                {
                    intList.remove(j);
                    j--;
                }
            }
        }

    }

    public static void moveBWords(ArrayList<String> wordList)
    {
        int ind =0;
        for (int i = 0; i< wordList.size(); i++)
        {
            if (wordList.get(i).indexOf("b") ==0)
            {
                String remWord = wordList.remove(i);
                wordList.add(ind, remWord);
                ind++;
            }
        }
    }

    public static ArrayList<Integer> modes(int[] numList) {
        ArrayList<Integer> modes = new ArrayList<>();
        int maxCount = 0;
        for (int i = 0; i < numList.length; i++) {
            int count = 0;
            for (int j = 0; j < numList.length; j++) {
                if (numList[i] == numList[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                modes.clear();
                modes.add(numList[i]);
            } else if (count == maxCount) {
                modes.add(numList[i]);
            }
        }
        if (modes.size() == numList.length) {
            modes.clear();
        }
        return modes;
    }

    public static void sortStudents(ArrayList<Student> studentsToSort)
    {
        for (int i=1; i< studentsToSort.size(); i++)
        {
            Student current = studentsToSort.get(i);
            int j = i-1;

            while (j>= 0 && studentsToSort.get(j).getLastName().compareTo(current.getLastName()) >0)
            {
                studentsToSort.set(j+1, studentsToSort.get(j));
                j--;
            }
            studentsToSort.set(j+1, current);
        }

        for (int i=1; i< studentsToSort.size(); i++)
        {
            Student current = studentsToSort.get(i);
            int j = i-1;

            while (j>= 0 && (studentsToSort.get(j).getLastName().equals(current.getLastName()) && studentsToSort.get(j).getFirstName().compareTo(current.getFirstName()) >0))
            {
                studentsToSort.set(j+1, studentsToSort.get(j));
                j--;
            }
            studentsToSort.set(j+1, current);
        }

        for (int i=1; i< studentsToSort.size(); i++)
        {
            Student current = studentsToSort.get(i);
            int j = i-1;

            while (j>= 0 && (studentsToSort.get(j).getLastName().equals(current.getLastName()) && (studentsToSort.get(j).getFirstName().equals(current.getFirstName())&& studentsToSort.get(j).getGpa()< (current.getGpa()))))
            {
                studentsToSort.set(j+1, studentsToSort.get(j));
                j--;
            }
            studentsToSort.set(j+1, current);
        }


    }


}





