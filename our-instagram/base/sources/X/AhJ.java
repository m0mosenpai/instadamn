package X;

import android.widget.ProgressBar;

/* loaded from: classes4.dex */
public final class AhJ implements InterfaceC190038bM {
    public final /* synthetic */ C8JT A00;

    public AhJ(C8JT c8jt) {
        this.A00 = c8jt;
    }

    @Override // X.InterfaceC190038bM
    public final void Cxz(double d) {
        C86Q c86q = this.A00.A1d;
        int i = (int) (100.0d * d);
        ProgressBar progressBar = c86q.A01;
        if (progressBar != null) {
            progressBar.post(new Aw3(c86q, i));
        }
    }
}
