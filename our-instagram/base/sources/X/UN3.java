package X;

import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes11.dex */
public final class UN3 extends AbstractC59202nL {
    public final /* synthetic */ UM2 A00;
    public final /* synthetic */ AbstractC59202nL A01;

    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    public final void DH2(Drawable drawable, C59392ni c59392ni, C2nP c2nP, C3QB c3qb, int i, long j) {
        A00(c3qb);
        this.A01.DH2(drawable, c59392ni, c2nP, c3qb, i, j);
    }

    public UN3(UM2 um2, AbstractC59202nL abstractC59202nL) {
        this.A01 = abstractC59202nL;
        this.A00 = um2;
    }

    private final void A00(C3QB c3qb) {
        View view;
        int width;
        if (c3qb != null && (view = this.A00.A00) != null) {
            int width2 = c3qb.getWidth();
            Integer valueOf = Integer.valueOf(width2);
            if (width2 != 0 && valueOf != null && view.getMinimumHeight() != (width = (view.getWidth() * c3qb.getHeight()) / width2)) {
                view.setMinimumHeight(width);
            }
        }
    }

    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    public final void DGC(Drawable drawable, C59392ni c59392ni, C2nP c2nP, Throwable th, long j) {
        this.A00.A01();
        this.A01.DGC(drawable, c59392ni, c2nP, th, j);
    }

    @Override // X.AbstractC59202nL, X.InterfaceC59212nM
    public final void DMv(C2nP c2nP, C3QB c3qb, long j) {
        A00(c3qb);
        this.A01.DMv(c2nP, c3qb, j);
    }
}
