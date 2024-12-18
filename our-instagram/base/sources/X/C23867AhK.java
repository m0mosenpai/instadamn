package X;

import android.widget.ProgressBar;

/* renamed from: X.AhK, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23867AhK implements InterfaceC190038bM {
    public final /* synthetic */ C8JT A00;

    public C23867AhK(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // X.InterfaceC190038bM
    public final void Cxz(double d) {
        C86Q c86q = this.A00.A1d;
        int i = (int) (100.0d * d);
        ProgressBar progressBar = c86q.A02;
        if (progressBar != null) {
            progressBar.post(new Aw4(c86q, i));
        }
    }
}
