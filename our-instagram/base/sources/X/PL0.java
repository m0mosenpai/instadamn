package X;

import com.facebook.privacy.consent.bloks.instagram.InstagramConsentFlowHostActivity;

/* loaded from: classes9.dex */
public final class PL0 implements Runnable {
    public final /* synthetic */ InstagramConsentFlowHostActivity A00;

    public PL0(InstagramConsentFlowHostActivity instagramConsentFlowHostActivity) {
        this.A00 = instagramConsentFlowHostActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC167007dF.A0J().postDelayed(new RunnableC56854PKz(this.A00), 200L);
    }
}
