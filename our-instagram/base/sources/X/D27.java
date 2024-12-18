package X;

import com.instagram.direct.model.DirectThreadThemeInfo;

/* loaded from: classes5.dex */
public final class D27 implements Runnable {
    public final /* synthetic */ C26828Bsq A00;
    public final /* synthetic */ DirectThreadThemeInfo A01;
    public final /* synthetic */ boolean A02;

    public D27(C26828Bsq c26828Bsq, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        this.A00 = c26828Bsq;
        this.A01 = directThreadThemeInfo;
        this.A02 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C26828Bsq c26828Bsq = this.A00;
        C28457Ch7 c28457Ch7 = c26828Bsq.A00;
        if (c28457Ch7 != null) {
            DirectThreadThemeInfo directThreadThemeInfo = this.A01;
            c28457Ch7.A05(directThreadThemeInfo.A0o);
            C28457Ch7 c28457Ch72 = c26828Bsq.A00;
            if (c28457Ch72 != null) {
                c28457Ch72.A04(directThreadThemeInfo.A0o);
                C26828Bsq.A03(c26828Bsq, directThreadThemeInfo, this.A02);
                return;
            }
        }
        C14360o3.A0F("aiThemesLogger");
        throw C00O.createAndThrow();
    }
}
