package X;

/* renamed from: X.Rrm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61672Rrm {
    public static final String A00(Integer num) {
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue == 2) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    A1C.append('(');
                    A1C.append(A00(C05F.A00));
                    A1C.append(" OR ");
                    return AbstractC25236BEt.A0Y(A00(C05F.A01), A1C);
                }
                throw B4Z.A00();
            }
            return "media_type = 3";
        }
        return "media_type = 1";
    }
}
