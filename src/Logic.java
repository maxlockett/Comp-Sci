class Logic {
    private Information info = new Information();

    int infoNum(int section, int subsection) {
        int infoNumber = 0;
        switch (section) {
            case 1:
                switch (subsection) {
                    case 1:
                        infoNumber = 1;
                        break;
                    case 2:
                        infoNumber = 2;
                        break;
                    case 3:
                        infoNumber = 3;
                        break;
                    case 4:
                        infoNumber = 4;
                        break;
                }
                break;
            case 2:
                switch (subsection) {
                    case 1:
                        infoNumber = 5;
                        break;
                    case 2:
                        infoNumber = 6;
                        break;
                    case 3:
                        infoNumber = 7;
                        break;
                    case 4:
                        infoNumber = 8;
                        break;
                }
                break;
            case 3:
                switch (subsection) {
                    case 1:
                        infoNumber = 9;
                        break;
                    case 2:
                        infoNumber = 10;
                        break;
                    case 3:
                        infoNumber = 11;
                        break;
                    case 4:
                        infoNumber = 12;
                        break;
                }
                break;
            case 4:
                switch (subsection) {
                    case 1:
                        infoNumber = 13;
                        break;
                    case 2:
                        infoNumber = 14;
                        break;
                    case 3:
                        infoNumber = 15;
                        break;
                    case 4:
                        infoNumber = 16;
                        break;
                }
                break;
        }
        return infoNumber;
    }

    void returnInfo(int infoNum) {
        switch (infoNum) {
            case 1:
                info.one();
                break;
            case 2:
                info.two();
                break;
            case 3:
                info.three();
                break;
            case 4:
                info.four();
                break;
            case 5:
                info.five();
                break;
            case 6:
                info.six();
                break;
            case 7:
                info.seven();
                break;
            case 8:
                info.eight();
                break;
            case 9:
                info.nine();
                break;
            case 10:
                info.ten();
                break;
            case 11:
                info.eleven();
                break;
            case 12:
                info.twelve();
                break;
            case 13:
                info.thirteen();
                break;
            case 14:
                info.fourteen();
                break;
            case 15:
                info.fifteen();
                break;
            case 16:
                info.sixteen();
                break;
        }
    }
}
