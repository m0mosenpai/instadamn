package X;

import com.facebook.browser.lite.BrowserLiteFragment;

/* renamed from: X.SqH, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63609SqH implements InterfaceC09670ek {
    public final /* synthetic */ BrowserLiteFragment A02;
    public final /* synthetic */ C63305ShB A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;
    public boolean A01 = false;
    public Long A00 = AbstractC31173DnH.A0g();

    public C63609SqH(BrowserLiteFragment browserLiteFragment, C63305ShB c63305ShB, String str, boolean z) {
        this.A02 = browserLiteFragment;
        this.A03 = c63305ShB;
        this.A05 = z;
        this.A04 = str;
    }

    @Override // X.InterfaceC09670ek
    public final void DoQ(C07R c07r, C07X c07x) {
        String str;
        BrowserLiteFragment browserLiteFragment = this.A02;
        if (browserLiteFragment.getIntent() == null || (str = browserLiteFragment.getIntent().getStringExtra("BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID")) == null) {
            str = "";
        }
        if (c07r == C07R.ON_PAUSE) {
            C63305ShB c63305ShB = this.A03;
            boolean z = this.A05;
            C63305ShB.A02(new QDh(browserLiteFragment.A09, c63305ShB, "mai_play_store_launched", str, 0L, z), c63305ShB, false);
            C63305ShB.A02(new QDf(browserLiteFragment.A09, c63305ShB, this.A04, str, z), c63305ShB, false);
            this.A01 = true;
            return;
        }
        if (c07r != C07R.ON_RESUME || !this.A01) {
            return;
        }
        C63305ShB c63305ShB2 = this.A03;
        C63305ShB.A02(new QDh(browserLiteFragment.A09, c63305ShB2, "mai_play_store_dismissed", str, System.currentTimeMillis() - this.A00.longValue(), this.A05), c63305ShB2, false);
        c07x.getLifecycle().A0A(this);
    }
}
