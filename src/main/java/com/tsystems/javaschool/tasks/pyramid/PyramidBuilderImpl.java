package com.tsystems.javaschool.tasks.pyramid;

import java.util.Comparator;
import java.util.List;

public class PyramidBuilderImpl implements  PyramidBuilder {



        public int[][] buildPyramid(List<Integer> inputNumbers) {


            if (inputNumbers.contains(null)) {
                throw new CannotBuildPyramidException();
            }

            int iterationNumber = checkArray(inputNumbers);

            if (iterationNumber == -1) {
                throw new CannotBuildPyramidException();
            }

            int width = 2 * iterationNumber - 1;
            int[][] array = new int[iterationNumber][width];
            int index = 0, middle = width / 2;

            inputNumbers.sort(Comparator.naturalOrder());

            for (int i = 0; i < iterationNumber; i++) {
                for (int j = middle - i; j <= middle + i; j += 2) {
                    array[i][j] = inputNumbers.get(index++);
                }
            }

            return array;
        }

        private int checkArray(List<Integer> inputNumber) {
            int length = inputNumber.size();
            int iterationNumber = 0;
            long i = 1;

            for (long j = 2; i < inputNumber.size(); i += j, j++) {
                iterationNumber++;
            }

            return i != length ? -1 : ++iterationNumber;
        }

}
