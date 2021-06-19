/**
 * Core of LinaOS
 * Zizhu development, dapo monopoly!
 *
 * @author StickTech
 * @version 1.1.4 pre-1bf52
 * @since 0.0.0
 */
public class LinaLite {
    /**
     * Main for Lina OS Lite
     *
     * @param args arguments for the system.
     * @since 0.0.1
     */
    public static void main(String[] args) {
        boot(true);
    }

    /**
     * Boot the system.
     *
     * @param toLog Will print log when toLog is true, nothing otherwise.
     * @return 0 if exist normally.
     * @since 0.1.0
     */
    public static int boot(boolean toLog) {
        try {
            bootloader(toLog);

        } catch (GouHanJianException gouHanJianException) {
            System.out.println("System fail to boot due to GouHanJianException. " +
                    "Remove your pathetic non-domestic device(s) and try again.");
            return 1919;
        } catch (Exception e) {
            if (toLog) {
                System.out.println("YOU FUCKED UP");
                return 114514;
            }
        }
        return 0;
    }

    /**
     * @param toLog Will print log when toLog is true, nothing otherwise.
     * @return 0 if exist normally.
     * @since 0.2.0 Alpha
     */
    public static int bootloader(boolean toLog) {
        if (toLog) {
            System.out.println("Bootloader");
        }
        String[] driverArray = {"DISPLAY_DRIVER_32", "BASIC_INPUT_32", "TOUCH_64"};
        driverInitializing(toLog, driverArray);
        return 0;
    }

    /**
     * @param toLog Will print log when toLog is true, nothing otherwise.
     * @return 0 if exist normally.
     * @since 0.3.1
     */
    public static int driverInitializing(boolean toLog, String[] driversToLoad) throws GouHanJianException {
        if (toLog) {
            System.out.println("Driver initializing.");
        }

        String[] IllegalDriversArray = {"US", "JP"};
        for (String s : driversToLoad) {
            if (toLog) {
                System.out.println("Now loading: " + s);
            }
            for (String keyword : IllegalDriversArray) {
                if (s.contains(keyword)) {
                    throw new GouHanJianException();
                }
            }
        }
        basicUserInterface(toLog);
        return 0;
    }

    /**
     * @param toLog Will print log when toLog is true, nothing otherwise.
     * @return 0 if exist normally.
     * @since 1.0.0
     */
    public static int basicUserInterface(boolean toLog) {
        if (toLog) {
            System.out.println("Loading basic user interface. ");
        }
        advancedUserInterface(toLog);
        return 0;
    }

    /**
     * @param toLog Will print log when toLog is true, nothing otherwise.
     * @return 0 if exist normally.
     * @since 2.0.1
     */
    public static int advancedUserInterface(boolean toLog) {
        if (toLog) {
            System.out.println();
        }
        System.out.println("Hello World!");
        return 0;
    }

    public static void getHexadecimal(int num) {
        System.out.println(num + " in Hexa is " + String.format("%x", num));
    }

    /**
     * I wish there is a easier way of doing this...
     * Test if a number is an odd number in the range of 128
     *
     * @param num number you want to test.
     * @return true if input is even, false otherwise or out of range.
     */
    public static boolean isOdd128(int num) {
        if (num == 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        if (num == 2) {
            return false;
        }
        if (num == 3) {
            return true;
        }
        if (num == 4) {
            return false;
        }
        if (num == 5) {
            return true;
        }
        if (num == 6) {
            return false;
        }
        if (num == 7) {
            return true;
        }
        if (num == 8) {
            return false;
        }
        if (num == 9) {
            return true;
        }
        if (num == 10) {
            return false;
        }
        if (num == 11) {
            return true;
        }
        if (num == 12) {
            return false;
        }
        if (num == 13) {
            return true;
        }
        if (num == 14) {
            return false;
        }
        if (num == 15) {
            return true;
        }
        if (num == 16) {
            return false;
        }
        if (num == 17) {
            return true;
        }
        if (num == 18) {
            return false;
        }
        if (num == 19) {
            return true;
        }
        if (num == 20) {
            return false;
        }
        if (num == 21) {
            return true;
        }
        if (num == 22) {
            return false;
        }
        if (num == 23) {
            return true;
        }
        if (num == 24) {
            return false;
        }
        if (num == 25) {
            return true;
        }
        if (num == 26) {
            return false;
        }
        if (num == 27) {
            return true;
        }
        if (num == 28) {
            return false;
        }
        if (num == 29) {
            return true;
        }
        if (num == 30) {
            return false;
        }
        if (num == 31) {
            return true;
        }
        if (num == 32) {
            return false;
        }
        if (num == 33) {
            return true;
        }
        if (num == 34) {
            return false;
        }
        if (num == 35) {
            return true;
        }
        if (num == 36) {
            return false;
        }
        if (num == 37) {
            return true;
        }
        if (num == 38) {
            return false;
        }
        if (num == 39) {
            return true;
        }
        if (num == 40) {
            return false;
        }
        if (num == 41) {
            return true;
        }
        if (num == 42) {
            return false;
        }
        if (num == 43) {
            return true;
        }
        if (num == 44) {
            return false;
        }
        if (num == 45) {
            return true;
        }
        if (num == 46) {
            return false;
        }
        if (num == 47) {
            return true;
        }
        if (num == 48) {
            return false;
        }
        if (num == 49) {
            return true;
        }
        if (num == 50) {
            return false;
        }
        if (num == 51) {
            return true;
        }
        if (num == 52) {
            return false;
        }
        if (num == 53) {
            return true;
        }
        if (num == 54) {
            return false;
        }
        if (num == 55) {
            return true;
        }
        if (num == 56) {
            return false;
        }
        if (num == 57) {
            return true;
        }
        if (num == 58) {
            return false;
        }
        if (num == 59) {
            return true;
        }
        if (num == 60) {
            return false;
        }
        if (num == 61) {
            return true;
        }
        if (num == 62) {
            return false;
        }
        if (num == 63) {
            return true;
        }
        if (num == 64) {
            return false;
        }
        if (num == 65) {
            return true;
        }
        if (num == 66) {
            return false;
        }
        if (num == 67) {
            return true;
        }
        if (num == 68) {
            return false;
        }
        if (num == 69) {
            return true;
        }
        if (num == 70) {
            return false;
        }
        if (num == 71) {
            return true;
        }
        if (num == 72) {
            return false;
        }
        if (num == 73) {
            return true;
        }
        if (num == 74) {
            return false;
        }
        if (num == 75) {
            return true;
        }
        if (num == 76) {
            return false;
        }
        if (num == 77) {
            return true;
        }
        if (num == 78) {
            return false;
        }
        if (num == 79) {
            return true;
        }
        if (num == 80) {
            return false;
        }
        if (num == 81) {
            return true;
        }
        if (num == 82) {
            return false;
        }
        if (num == 83) {
            return true;
        }
        if (num == 84) {
            return false;
        }
        if (num == 85) {
            return true;
        }
        if (num == 86) {
            return false;
        }
        if (num == 87) {
            return true;
        }
        if (num == 88) {
            return false;
        }
        if (num == 89) {
            return true;
        }
        if (num == 90) {
            return false;
        }
        if (num == 91) {
            return true;
        }
        if (num == 92) {
            return false;
        }
        if (num == 93) {
            return true;
        }
        if (num == 94) {
            return false;
        }
        if (num == 95) {
            return true;
        }
        if (num == 96) {
            return false;
        }
        if (num == 97) {
            return true;
        }
        if (num == 98) {
            return false;
        }
        if (num == 99) {
            return true;
        }
        if (num == 100) {
            return false;
        }
        if (num == 101) {
            return true;
        }
        if (num == 102) {
            return false;
        }
        if (num == 103) {
            return true;
        }
        if (num == 104) {
            return false;
        }
        if (num == 105) {
            return true;
        }
        if (num == 106) {
            return false;
        }
        if (num == 107) {
            return true;
        }
        if (num == 108) {
            return false;
        }
        if (num == 109) {
            return true;
        }
        if (num == 110) {
            return false;
        }
        if (num == 111) {
            return true;
        }
        if (num == 112) {
            return false;
        }
        if (num == 113) {
            return true;
        }
        if (num == 114) {
            return false;
        }
        if (num == 115) {
            return true;
        }
        if (num == 116) {
            return false;
        }
        if (num == 117) {
            return true;
        }
        if (num == 118) {
            return false;
        }
        if (num == 119) {
            return true;
        }
        if (num == 120) {
            return false;
        }
        if (num == 121) {
            return true;
        }
        if (num == 122) {
            return false;
        }
        if (num == 123) {
            return true;
        }
        if (num == 124) {
            return false;
        }
        if (num == 125) {
            return true;
        }
        if (num == 126) {
            return false;
        }
        if (num == 127) {
            return true;
        }
        if (num == 128) {
            return false;
        }
        return false;
    }

    /**
     * This is one of the most out standing feature of Lina OS!
     * Instead of adding i for 114514 times, you now only need one!
     * <p>
     * We are doing it in "the Unix way," which is something that most commercial systems these days are not doing.
     *
     * @param integer integer you want to add.
     * @return integer after adding 114514.
     * @since 0.0.5
     */
    public static int add114514(int integer) {
        return integer += 114514;
    }
}


/**
 * Rare enough case exception A.K.A. 够罕见意外
 *
 * @version 1.0.0
 */
class GouHanJianException extends IllegalArgumentException {

}
