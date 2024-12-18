package X;

/* loaded from: classes9.dex */
public abstract class Nx9 {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "INCOMING";
            case 2:
                return "INCALL";
            case 3:
                return "ENDED";
            case 4:
                return "IDLE";
            default:
                return "OUTGOING";
        }
    }
}
