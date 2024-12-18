package X;

/* renamed from: X.Nsb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53902Nsb {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PROCESS";
            case 2:
                return "CONFIRM";
            case 3:
                return "COMPLETE";
            case 4:
                return AbstractC111324zv.A00(1516);
            case 5:
                return "FAILED";
            default:
                return "INACTIVE";
        }
    }
}
