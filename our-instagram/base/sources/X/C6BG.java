package X;

/* renamed from: X.6BG, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6BG {
    public static Integer A01(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return C05F.A0N;
                    }
                    throw new IllegalArgumentException(AnonymousClass001.A0O("Unknown enum value: ", i));
                }
                return C05F.A0C;
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static int A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return 3;
        }
    }

    public static String A02(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "LEFT";
            case 1:
                return "TOP";
            case 2:
                return "RIGHT";
            default:
                return "BOTTOM";
        }
    }
}
