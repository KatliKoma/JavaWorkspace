public class NumberOfDaysInMonth {
    // write your code here
    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year>=1&&year<=9999&&year % 4 == 0) {
            if (year>=1&&year<=9999&&year % 100 == 0) {
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            } else
                isLeapYear = true;
        } else {
            isLeapYear = false;
        }

        return isLeapYear;
    }

    public static int getDaysInMonth(int months, int year) {
        Boolean isLeapYear = isLeapYear(year);
        int answer = 0;
        if (months >=1 && months <= 12 && year >= 1 && year <= 9999) {

            if (isLeapYear == true) {
                switch (months) {
                    case 1:
                        answer= 31;
                    break;
                    case 2:
                        answer= 29;
                    break;
                    case 3:
                        answer= 31;
                    break;
                    case 4:
                        answer= 30;
                    break;
                    case 5:
                        answer= 31;
                    break;
                    case 6:
                        answer= 30;
                    break;
                    case 7:
                        answer= 31;
                    break;
                    case 8:
                        answer= 31;
                    break;
                    case 9:
                        answer= 30;
                    break;
                    case 10:
                        answer= 31;
                    break;
                    case 11:
                        answer= 30;
                    break;
                    case 12:
                        answer= 31;
                    break;
                }
            }

                else if (isLeapYear == false)
                {
                    switch (months) {
                        case 1:
                            answer= 31;
                        break;
                        case 2:
                            answer= 28;
                        break;
                        case 3:
                            answer= 31;
                        break;
                        case 4:
                            answer= 30;
                        break;
                        case 5:
                            answer= 31;
                        break;
                        case 6:
                            answer= 30;
                        break;
                        case 7:
                            answer= 31;
                        break;
                        case 8:
                            answer= 31;
                        break;
                        case 9:
                            answer= 30;
                        break;
                        case 10:
                            answer= 31;
                        break;
                        case 11:
                            answer= 30;
                        break;
                        case 12:
                            answer= 31;
                        break;
                    }

                }

        }
        else
        {
            answer= -1;
        }

        return answer;
    }

}