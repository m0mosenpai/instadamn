package X;

import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.Lvz, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49606Lvz implements InterfaceC150976qx {
    public final /* synthetic */ C148396m9 A00;

    public C49606Lvz(C148396m9 c148396m9) {
        this.A00 = c148396m9;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        IgFrameLayout igFrameLayout;
        int i;
        C148396m9 c148396m9 = this.A00;
        if (c148396m9.A00 == 0) {
            if (f >= 0.4f) {
                igFrameLayout = c148396m9.A01;
                i = 0;
            } else {
                return;
            }
        } else {
            if (f < 0.25f) {
                return;
            }
            igFrameLayout = c148396m9.A01;
            i = 8;
        }
        igFrameLayout.setVisibility(i);
    }
}
