package X;

/* loaded from: classes11.dex */
public abstract class VSG {
    public static final boolean A00(long j) {
        C140056Vj c140056Vj;
        C140126Vq A00;
        C103054kg A002 = AbstractC103044kf.A00();
        if (A002 != null) {
            C140056Vj c140056Vj2 = A002.A03;
            if (c140056Vj2.A00(j) == null && (c140056Vj = A002.A04) != null && (A00 = c140056Vj.A00(j)) != null) {
                boolean booleanValue = ((Boolean) AbstractC103044kf.A01(EnumC103014kc.A05, A002, new C29899DGn(12, A002, A00))).booleanValue();
                if (booleanValue) {
                    c140056Vj2.A01(A00, j, false);
                }
                return !booleanValue;
            }
        }
        return false;
    }
}
