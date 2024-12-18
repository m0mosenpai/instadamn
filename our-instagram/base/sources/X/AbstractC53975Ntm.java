package X;

/* renamed from: X.Ntm, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53975Ntm {
    public static final Integer A00(String str) {
        String str2;
        for (Integer num : C05F.A00(2)) {
            if (1 - num.intValue() != 0) {
                str2 = "blocking";
            } else {
                str2 = "nonmentionable";
            }
            if (str2.equals(str)) {
                return num;
            }
        }
        return null;
    }
}
