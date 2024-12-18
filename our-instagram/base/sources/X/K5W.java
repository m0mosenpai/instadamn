package X;

import android.content.Context;
import com.facebook.smartcapture.logging.SelfieCaptureLogger;
import com.facebook.smartcapture.logging.SelfieCaptureLoggerActivity;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public abstract class K5W extends AbstractC44444JlB {
    public SelfieCaptureLogger A00;

    public final void A03() {
        K5V k5v = (K5V) this;
        if ("ig_age_verification".equals(k5v.A0D)) {
            UserSession userSession = k5v.A0B;
            if (userSession != null) {
                AbstractC25651Mw.A00(userSession).E4s(new C36106Fwg(AbstractC62241S3m.A00(k5v.A0E), "fbap", false));
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A04(java.lang.Integer r9) {
        /*
            r8 = this;
            r7 = r8
            X.K5V r7 = (X.K5V) r7
            java.lang.Integer r0 = r7.A0C
            if (r9 == r0) goto L73
            r7.A0C = r9
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r0 = r7.A09
            if (r0 == 0) goto L5b
            r0.A03()
            X.RgH r0 = r7.A06
            X.K5V.A01(r0, r7, r9)
            java.lang.Integer r0 = X.C05F.A0Y
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r6 = r7.A09
            if (r9 != r0) goto L57
            if (r6 == 0) goto L5b
            r5 = 1065353216(0x3f800000, float:1.0)
        L1f:
            r1 = 250(0xfa, double:1.235E-321)
            android.animation.ObjectAnimator r0 = r6.A01
            if (r0 == 0) goto L28
            r0.cancel()
        L28:
            android.util.Property r4 = com.facebook.smartcapture.ui.view.FaceCaptureProgressView.A0K
            r0 = 1
            float[] r3 = new float[r0]
            r0 = 0
            r3[r0] = r5
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r6, r4, r3)
            android.animation.ObjectAnimator r3 = r0.setDuration(r1)
            r6.A01 = r3
            X.C14360o3.A0A(r3)
            r0 = 3
            X.JX2.A00(r3, r6, r0)
            android.animation.ObjectAnimator r0 = r6.A01
            X.C14360o3.A0A(r0)
            r0.start()
            com.facebook.smartcapture.ui.view.ArrowHintView r0 = r7.A08
            if (r0 != 0) goto L5e
            java.lang.String r0 = "arrowHintView"
        L4f:
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L57:
            if (r6 == 0) goto L5b
            r5 = 0
            goto L1f
        L5b:
            java.lang.String r0 = "captureProgressView"
            goto L4f
        L5e:
            android.view.ViewPropertyAnimator r0 = r0.animate()
            if (r0 == 0) goto L73
            android.view.ViewPropertyAnimator r0 = r0.alpha(r5)
            if (r0 == 0) goto L73
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r1)
            if (r0 == 0) goto L73
            r0.start()
        L73:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5W.A04(java.lang.Integer):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC44444JlB, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        C14360o3.A0B(context, 0);
        super.onAttach(context);
        if (context instanceof SelfieCaptureLoggerActivity) {
            this.A00 = ((SelfieCaptureLoggerActivity) context).getLogger();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int A02 = C0f9.A02(1549287516);
        super.onDestroy();
        this.A00 = null;
        C0f9.A09(1400291696, A02);
    }
}
