package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* loaded from: classes5.dex */
public final class D26 implements Runnable {
    public final /* synthetic */ C26828Bsq A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public D26(C26828Bsq c26828Bsq, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = c26828Bsq;
        this.A01 = directThreadThemeInfo;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26828Bsq.A03(this.A00, this.A01, this.A02);
    }
}
