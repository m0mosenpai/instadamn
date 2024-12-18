package X;

import com.instagram.ui.widget.drawing.common.Point2;

/* renamed from: X.WnR, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71069WnR implements YQQ {
    public C69609VsC A00;

    @Override // X.YQQ
    public final void EV5(W92 w92) {
        C14360o3.A0B(w92, 0);
        C69609VsC c69609VsC = this.A00;
        C14360o3.A0A(c69609VsC);
        c69609VsC.A00(w92.A04, w92.A03);
    }

    @Override // X.YQQ
    public final void En3(W92 w92) {
        C14360o3.A0B(w92, 0);
        this.A00 = new C69609VsC(w92.A04, w92.A03);
    }

    @Override // X.YQQ
    public final void AIm(long j) {
        C69609VsC c69609VsC = this.A00;
        C14360o3.A0A(c69609VsC);
        Point2 point2 = c69609VsC.A00;
        if (point2 != c69609VsC.A01) {
            c69609VsC.A00(point2, j);
            c69609VsC.A01 = c69609VsC.A00;
        }
    }

    @Override // X.YQQ
    public final W5C BuO() {
        C69609VsC c69609VsC = this.A00;
        C14360o3.A0A(c69609VsC);
        W5C w5c = c69609VsC.A02;
        C14360o3.A07(w5c);
        return w5c;
    }
}
