package X;

/* loaded from: classes9.dex */
public abstract class O18 {
    public static final String[] A00 = {"-r4096", "-n3"};
    public static final String[] A01;
    public static final String[] A02;

    static {
        String[] strArr = {"-v", "threadtime,year,zone", "msys", "*:S"};
        A02 = strArr;
        A01 = (String[]) AbstractC06960Yn.A0b(new String[]{"logcat", "-d"}, strArr);
    }
}
