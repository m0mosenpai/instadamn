package X;

import java.io.File;

/* loaded from: classes9.dex */
public final class NGW extends AbstractRunnableC14200nk {
    public final /* synthetic */ C49602Pt A00;
    public final /* synthetic */ java.util.Set A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NGW(C49602Pt c49602Pt, java.util.Set set) {
        super(95, 5, false, false);
        this.A00 = c49602Pt;
        this.A01 = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        File C5c = this.A00.C5c();
        AbstractC13530mf.A01(new C55801OqC(2, this.A01, C5c), C5c.getPath(), null);
    }
}
