package X;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes6.dex */
public final class EHP extends AbstractC72473Mu {
    public String A00 = "";

    private final void A01() {
        AbstractC41776Ies.A06(requireActivity(), null, EnumC906041v.AD_DESTINATION_APP_STORE, null, this.A00, null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            C0w9.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_error_code", 1);
            A01();
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.0Qc, X.0bI] */
    @Override // X.C0SG, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String string;
        C07980bI c07980bI;
        int A02 = C0f9.A02(-22516741);
        super.onCreate(bundle);
        try {
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null && (string = bundle2.getString(AbstractC111324zv.A00(1602))) != null) {
                this.A00 = string;
                Intent A04 = AbstractC31171DnF.A04();
                A04.setComponent(new ComponentName("com.facebook.katana", "com.facebook.googleplaystore.GooglePlaystoreOverlayExternalActivity"));
                A04.putExtra("IG_GPS_AD_CONTENT", this.A00);
                C0b3 c0b3 = C12260kU.A00;
                synchronized (c0b3) {
                    try {
                        C05300Qc c05300Qc = c0b3.A02;
                        C05300Qc c05300Qc2 = c05300Qc;
                        if (c05300Qc == null) {
                            ?? c07980bI2 = new C07980bI(c0b3.A0C(), null, c0b3.A0H, c0b3.A0I);
                            c0b3.A02 = c07980bI2;
                            c05300Qc2 = c07980bI2;
                        }
                        c07980bI = new C07980bI(c05300Qc2.A01, "IG_GOOGLE_PLAYSTORE_FRAGMENT", c05300Qc2.A03, c05300Qc2.A04);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!c07980bI.A0H(A04, this, 0)) {
                    C0w9.A04("ig_fb_google_play_store_overlay_fragment", "fallback_to_gps_on_activity_not_launched", 1);
                    A01();
                } else {
                    C0w9.A04("ig_fb_google_play_store_overlay_fragment", "launched", 1);
                }
                C0f9.A09(-2140105867, A02);
                return;
            }
            IllegalStateException A14 = AbstractC166987dD.A14("Received url is empty");
            C0f9.A09(-499854164, A02);
            throw A14;
        } catch (AnonymousClass060 | ActivityNotFoundException | IllegalAccessException | IllegalStateException | NullPointerException e) {
            C0w9.A08("ig_fb_google_play_store_overlay_fragment", e);
            A01();
            C0f9.A09(-199764421, A02);
        }
    }
}
