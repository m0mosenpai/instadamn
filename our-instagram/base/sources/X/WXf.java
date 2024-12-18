package X;

import android.content.Context;

/* loaded from: classes11.dex */
public final class WXf implements X9M {
    public final C102884kP A00;
    public final Context A01;
    public final C6FG A02;
    public final AbstractC79173gO[] A03;

    @Override // X.X9M
    public final C135266Ab Bmg(C135266Ab c135266Ab, long j) {
        Object obj;
        C135276Ac c135276Ac = C135266Ab.A04;
        C6FG c6fg = this.A02;
        if (c6fg != null) {
            C78473fD A01 = c135276Ac.A01(this.A01, c135266Ab, c6fg, this.A03, -1);
            C103054kg A00 = AbstractC103044kf.A00();
            if (A00 != null) {
                C140056Vj c140056Vj = null;
                if (c135266Ab != null) {
                    obj = c135266Ab.A02;
                } else {
                    obj = null;
                }
                if (obj instanceof C140056Vj) {
                    c140056Vj = (C140056Vj) obj;
                }
                return (C135266Ab) AbstractC103044kf.A01(EnumC103014kc.A03, A00.A01(c140056Vj), new ME6(0, j, this, A00, A01));
            }
            return c135276Ac.A03(A01, this.A00, null, j);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public WXf(Context context, C6FG c6fg, C102884kP c102884kP, AbstractC79173gO[] abstractC79173gOArr) {
        this.A01 = context;
        this.A03 = abstractC79173gOArr;
        this.A02 = c6fg;
        this.A00 = c102884kP;
    }
}
