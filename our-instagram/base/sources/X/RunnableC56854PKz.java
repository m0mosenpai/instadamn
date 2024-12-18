package X;

import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;

/* renamed from: X.PKz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56854PKz implements Runnable {
    public final /* synthetic */ InstagramConsentFlowHostActivity A00;

    public RunnableC56854PKz(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity) {
        this.A00 = instagramConsentFlowHostActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InstagramConsentFlowHostActivity instagramConsentFlowHostActivity = this.A00;
        super/*android.app.Activity*/.finish();
        instagramConsentFlowHostActivity.overridePendingTransition(0, 0);
    }
}
