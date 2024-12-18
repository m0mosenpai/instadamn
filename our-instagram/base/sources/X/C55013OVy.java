package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.widget.FrameLayout;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;

/* renamed from: X.OVy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55013OVy {
    public FrameLayout A00;
    public C55601Omh A01;
    public BBN A02;
    public C23432Aa5 A03;
    public boolean A04;
    public final Context A05;
    public final C54498O6a A06;
    public final AESelfieCaptureConfig A07;
    public final C54923OQz A08;

    public static final Activity A00(Context context, C55013OVy c55013OVy) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            C14360o3.A07(baseContext);
            return A00(baseContext, c55013OVy);
        }
        return null;
    }

    public final void A01() {
        C23432Aa5 c23432Aa5 = this.A03;
        if (c23432Aa5 != null) {
            c23432Aa5.pause();
        }
        AbstractC25230BEn.A1N(A00(this.A05, this), AbstractC50523MSb.A0e(), 19);
    }

    public C55013OVy(Context context, C54498O6a c54498O6a, C54923OQz c54923OQz, AESelfieCaptureConfig aESelfieCaptureConfig) {
        AbstractC37302Gc3.A1U(c54498O6a, c54923OQz);
        this.A05 = context;
        this.A07 = aESelfieCaptureConfig;
        this.A06 = c54498O6a;
        this.A08 = c54923OQz;
    }
}
