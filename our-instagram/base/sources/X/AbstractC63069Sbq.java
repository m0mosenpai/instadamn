package X;

/* renamed from: X.Sbq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63069Sbq {
    public static String A00(String str, int i, int i2) {
        Object[] A1a;
        String str2;
        if (i < 0) {
            A1a = AbstractC25228BEl.A1Z(str, i);
            str2 = "%s (%s) must not be negative";
        } else if (i2 >= 0) {
            A1a = AbstractC58320PtC.A1a(str, i, i2);
            str2 = "%s (%s) must not be greater than size (%s)";
        } else {
            throw AbstractC166987dD.A12(AbstractC58320PtC.A12("negative size: ", AbstractC58318PtA.A0q(26), i2));
        }
        return AbstractC62211S2g.A00(str2, A1a);
    }

    public static void A01(int i, int i2) {
        Object[] A1Z;
        String str;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                throw AbstractC166987dD.A12(AbstractC58320PtC.A12("negative size: ", AbstractC58318PtA.A0q(26), i2));
            }
            A1Z = AbstractC58320PtC.A1a("index", i, i2);
            str = "%s (%s) must be less than size (%s)";
        } else {
            A1Z = AbstractC25228BEl.A1Z("index", i);
            str = "%s (%s) must not be negative";
        }
        throw AbstractC58318PtA.A0a(AbstractC62211S2g.A00(str, A1Z));
    }

    public static void A02(int i, int i2, int i3) {
        String A00;
        if (i >= 0) {
            if (i2 >= i && i2 <= i3) {
                return;
            }
            if (i <= i3) {
                if (i2 >= 0 && i2 <= i3) {
                    A00 = AbstractC62211S2g.A00("end index (%s) must not be less than start index (%s)", AbstractC25228BEl.A1Z(Integer.valueOf(i2), i));
                } else {
                    A00 = A00("end index", i2, i3);
                }
                throw AbstractC58318PtA.A0a(A00);
            }
        }
        A00 = A00("start index", i, i3);
        throw AbstractC58318PtA.A0a(A00);
    }
}
