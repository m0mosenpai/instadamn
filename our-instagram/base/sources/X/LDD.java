package X;

/* loaded from: classes8.dex */
public abstract class LDD {
    public static final String[] A00 = {"cache", "files", "databases"};

    public static final String A00(String str) {
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            int i2 = length;
            if (!z) {
                i2 = i;
            }
            boolean A1b = AbstractC31179DnN.A1b(str, i2);
            if (!z) {
                if (!A1b) {
                    z = true;
                } else {
                    i++;
                }
            } else {
                if (!A1b) {
                    break;
                }
                length--;
            }
        }
        String A002 = new C11L("/+$").A00(new C11L("^/+").A00(AbstractC31177DnL.A0g(str, length, i), ""), "");
        int length2 = A002.length() - 1;
        int i3 = 0;
        boolean z2 = false;
        while (i3 <= length2) {
            int i4 = length2;
            if (!z2) {
                i4 = i3;
            }
            boolean A1b2 = AbstractC31179DnN.A1b(A002, i4);
            if (!z2) {
                if (!A1b2) {
                    z2 = true;
                } else {
                    i3++;
                }
            } else {
                if (!A1b2) {
                    break;
                }
                length2--;
            }
        }
        return AbstractC31177DnL.A0g(A002, length2, i3);
    }
}
