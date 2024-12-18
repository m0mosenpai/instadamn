package X;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.facebook.R;
import com.facebookpay.expresscheckout.handler.ECPHandler;
import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;

/* renamed from: X.Uwq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67724Uwq extends AbstractC66388UEw implements XCE {
    public ContextThemeWrapper A00;
    public View A01;
    public Button A02;
    public C66421UGq A03;
    public UFI A04;
    public ECPHandler A05;
    public LoggingContext A06;

    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c2, code lost:
    
        if (r1 != false) goto L53;
     */
    @Override // X.AbstractC66388UEw, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67724Uwq.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A01(LoggingContext loggingContext, C67724Uwq c67724Uwq, String str, String str2) {
        Wap wap = C2FP.A01().A04;
        UFI ufi = c67724Uwq.A04;
        if (ufi == null) {
            C14360o3.A0F("confirmationViewModel");
            throw C00O.createAndThrow();
        }
        LinkedHashMap A01 = UFS.A01(ufi.A07);
        if (str2 != null) {
            A01.put("upsell_action_type", str2);
        }
        Wap.A02(new C25531Mh(MSY.A0H(wap.A00, "user_click_ecpconfirmation_atomic"), 398), loggingContext, A01, str, 10);
    }

    @Override // X.XCE
    public final /* synthetic */ boolean D1o(LoggingContext loggingContext, Integer num) {
        return false;
    }

    @Override // X.XCE
    public final void ETZ(ECPHandler eCPHandler) {
        this.A05 = eCPHandler;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = C0f9.A02(1397617637);
        ContextThemeWrapper A00 = AbstractC66388UEw.A00(this, layoutInflater);
        this.A00 = A00;
        View inflate = layoutInflater.cloneInContext(A00).inflate(R.layout.ecp_confirmation_fragment, viewGroup, false);
        C0f9.A09(-1225890251, A02);
        return inflate;
    }
}
