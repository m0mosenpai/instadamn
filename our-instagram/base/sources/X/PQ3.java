package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public final class PQ3 implements Runnable {
    public final /* synthetic */ C56771PHo A00;
    public final /* synthetic */ C7XU A01;

    public PQ3(C56771PHo c56771PHo, C7XU c7xu) {
        this.A00 = c56771PHo;
        this.A01 = c7xu;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C56771PHo c56771PHo = this.A00;
        C3DN c3dn = (C3DN) c56771PHo.A03;
        c3dn.A0J((Fragment) c56771PHo.A02);
        c3dn.A0Q(this.A01);
    }
}
