package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class V45 extends C131555wr {
    public int A00;
    public int A01;
    public C135266Ab A02;
    public C6FG A03;

    public static final boolean A00(V45 v45) {
        C135266Ab c135266Ab = v45.A02;
        C6FG c6fg = v45.A03;
        if (c135266Ab != null && c6fg != null) {
            C79243gV c79243gV = c135266Ab.A01;
            if (v45.A01 != 0 && v45.A00 != 0 && (c79243gV.A01() != v45.A01 || c79243gV.A00() != v45.A00)) {
                C135276Ac c135276Ac = C135266Ab.A04;
                C135266Ab A03 = c135276Ac.A03(c135276Ac.A01(c6fg.A00, v45.A02, c6fg, AbstractC135256Aa.A00(v45.A03), -1), c135266Ab.A00, null, AbstractC78403f6.A00(View.MeasureSpec.makeMeasureSpec(v45.A01, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(v45.A00, AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO)));
                v45.A02 = A03;
                super.setRenderTree(A03.A01);
                return true;
            }
        }
        return false;
    }

    public final void setRenderResult(C135266Ab c135266Ab, C6FG c6fg) {
        C79243gV c79243gV;
        this.A03 = c6fg;
        this.A02 = c135266Ab;
        if (!A00(this)) {
            if (c135266Ab != null) {
                c79243gV = c135266Ab.A01;
            } else {
                c79243gV = null;
            }
            super.setRenderTree(c79243gV);
        }
    }

    @Override // X.C131565ws, X.InterfaceC131575wt
    public void setRenderTree(C79243gV c79243gV) {
        throw new UnsupportedOperationException("setRenderTree should only be called in conjunction with also setting the BloksModel");
    }
}
