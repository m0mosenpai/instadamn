package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.We4, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70626We4 implements XA6 {
    public final /* synthetic */ V16 A00;
    public final /* synthetic */ C70654Wea A01;

    public C70626We4(V16 v16, C70654Wea c70654Wea) {
        this.A00 = v16;
        this.A01 = c70654Wea;
    }

    @Override // X.XA6
    public final void onComplete() {
        V16 v16 = this.A00;
        FragmentActivity requireActivity = v16.requireActivity();
        UserSession session = v16.getSession();
        String str = this.A01.A0B;
        if (str != null) {
            W6I w6i = v16.A07;
            if (w6i == null) {
                C14360o3.A0F("adsManagerLogger");
                throw C00O.createAndThrow();
            }
            String A00 = w6i.A00();
            Bundle A0E = AbstractC31174DnI.A0E(session, 1);
            A0E.putString("paymentAccountID", str);
            A0E.putString("placement", "ig_boost");
            A0E.putString("wizardName", "PAY_NOW");
            A0E.putString("externalFlowID", A00);
            AbstractC27401Ut.getInstance();
            C64501TGn c64501TGn = new C64501TGn(session);
            c64501TGn.A07 = requireActivity.getString(2131970724);
            c64501TGn.A00(A0E);
            c64501TGn.A01("BillingWizardIGRoute");
            c64501TGn.EqV(requireActivity).A04();
            return;
        }
        throw new IllegalStateException("ad account ID should not be null, if payment_anomaly is not null");
    }
}
