package X;

import android.view.View;

/* loaded from: classes11.dex */
public final class WlP implements GZF {
    public final int A00;
    public final Object A01;

    @Override // X.GZF
    public final void EDy(View view, C32098E8w c32098E8w) {
        C14360o3.A0B(view, 0);
        ((AbstractC67878V0j) this.A01).A0e.ECz(view, c32098E8w);
    }

    public WlP(AbstractC67878V0j abstractC67878V0j, int i) {
        this.A00 = i;
        this.A01 = abstractC67878V0j;
    }

    @Override // X.GZF
    public final void DcC(C32098E8w c32098E8w) {
        if (this.A00 != 0) {
            AbstractC67878V0j.A02(c32098E8w, (AbstractC67878V0j) this.A01, true);
        } else {
            AbstractC67878V0j.A02(c32098E8w, (AbstractC67878V0j) this.A01, false);
        }
    }
}
