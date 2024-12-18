package X;

/* renamed from: X.OXe, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55027OXe {
    public static Integer A02(String str) {
        if (str.equals("OFF")) {
            return C05F.A00;
        }
        if (str.equals("RADIAL")) {
            return C05F.A01;
        }
        if (str.equals("LINEAR")) {
            return C05F.A0C;
        }
        throw AbstractC166987dD.A12(str);
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 0;
            default:
                return -1;
        }
    }

    public static int A01(Integer num) {
        switch (num.intValue()) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 0;
        }
    }
}
