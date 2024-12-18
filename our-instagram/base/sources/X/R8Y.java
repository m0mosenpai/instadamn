package X;

import android.util.Base64;
import androidx.fragment.app.FragmentActivity;
import com.facebookpay.offsite.base.CheckoutHandler;
import com.facebookpay.offsite.models.message.GsonUtils;
import com.facebookpay.offsite.models.message.MessageType$Companion;
import com.facebookpay.offsite.models.message.ScriptOverrideRequest;
import com.facebookpay.offsite.models.message.StartCheckoutRequest;
import com.instagram.common.session.UserSession;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class R8Y extends T2U {
    public final InterfaceC58362lv A00;
    public final InterfaceC172717mh A01;
    public final InterfaceC172717mh A02;
    public final UserSession A03;
    public final SM1 A04;
    public final String A05;
    public final ArrayList A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0ps, java.lang.Object] */
    @Override // X.T2U, com.facebookpay.offsite.models.message.MessageHandler
    public final void handleMessage(String str, String str2) {
        C14360o3.A0B(str, 0);
        byte[] decode = Base64.decode(str, 0);
        C14360o3.A07(decode);
        Charset charset = StandardCharsets.UTF_8;
        C14360o3.A08(charset);
        String A0m = AbstractC58318PtA.A0m(charset, decode);
        GsonUtils gsonUtils = GsonUtils.INSTANCE;
        String messageType = gsonUtils.getMessageType(A0m);
        if (C14360o3.A0K(messageType, MessageType$Companion.START_CHECKOUT)) {
            StartCheckoutRequest toOffsiteStartCheckoutRequest = gsonUtils.getToOffsiteStartCheckoutRequest(A0m);
            ?? obj = new Object();
            FragmentActivity activity = this.A02.getActivity();
            if (activity != null) {
                activity.runOnUiThread(new TQ1(toOffsiteStartCheckoutRequest, this, obj));
                return;
            }
            return;
        }
        if (C14360o3.A0K(messageType, MessageType$Companion.SCRIPT_OVERRIDE)) {
            if (!C2FP.A0D().A03() || str2 == null) {
                return;
            }
            ScriptOverrideRequest toScriptOverrideRequest = gsonUtils.getToScriptOverrideRequest(A0m);
            InterfaceC09390do interfaceC09390do = this.A08;
            ((CheckoutHandler) interfaceC09390do.getValue()).A0C = toScriptOverrideRequest.script;
            ((CheckoutHandler) interfaceC09390do.getValue()).A0D = str2;
            return;
        }
        super.handleMessage(str, str2);
    }

    public final String A02() {
        InterfaceC09390do interfaceC09390do = this.A0A;
        String A00 = SVS.A00((SVS) interfaceC09390do.getValue());
        UserSession userSession = this.A03;
        C38321qM A0h = AbstractC25229BEm.A0h(userSession, A00);
        String string = ((SVS) interfaceC09390do.getValue()).A00.getString("TrackingInfo.ARG_AD_ID");
        if (string == null && A0h != null) {
            return AbstractC41071vF.A07(userSession, A0h);
        }
        return string;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public R8Y(X.SNG r3, X.InterfaceC172717mh r4, com.facebook.iabadscontext.IABAdsContext r5, com.instagram.common.session.UserSession r6, java.util.ArrayList r7, X.InterfaceC09390do r8) {
        /*
            r2 = this;
            X.AbstractC37302Gc3.A1U(r6, r7)
            X.SM1 r1 = new X.SM1
            r1.<init>(r4, r5, r6)
            androidx.fragment.app.FragmentActivity r0 = r4.getActivity()
            r2.<init>(r0, r3, r1, r8)
            r2.A02 = r4
            r2.A08 = r8
            r2.A04 = r1
            android.content.Intent r1 = r4.getIntent()
            if (r1 == 0) goto L59
            java.lang.String r0 = "BrowserLiteIntent.IABLoggingExtras.IAB_SESSION_ID"
            java.lang.String r0 = r1.getStringExtra(r0)
        L21:
            r2.A05 = r0
            r0 = 22
            X.Sqa r0 = X.C63628Sqa.A00(r3, r0)
            r2.A00 = r0
            r2.A01 = r4
            r2.A03 = r6
            r2.A06 = r7
            r1 = 20
            X.GUj r0 = new X.GUj
            r0.<init>(r2, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r2.A0A = r0
            r1 = 19
            X.GUj r0 = new X.GUj
            r0.<init>(r2, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r2.A09 = r0
            r1 = 18
            X.GUj r0 = new X.GUj
            r0.<init>(r2, r1)
            X.0sx r0 = X.AbstractC09440dt.A01(r0)
            r2.A07 = r0
            return
        L59:
            r0 = 0
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.R8Y.<init>(X.SNG, X.7mh, com.facebook.iabadscontext.IABAdsContext, com.instagram.common.session.UserSession, java.util.ArrayList, X.0do):void");
    }
}
