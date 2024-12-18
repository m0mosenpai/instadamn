package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.XFBFXIGPCEntryPoint;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FQ8 {
    public boolean A00;
    public boolean A01;
    public final UserSession A04;
    public final InterfaceC41501vz A03 = C31650DvG.A00(this, 0);
    public boolean A02 = true;

    public final void A00(FragmentActivity fragmentActivity, boolean z) {
        if (this.A02) {
            this.A02 = false;
            UserSession userSession = this.A04;
            C14360o3.A0B(userSession, 1);
            XFBFXIGPCEntryPoint xFBFXIGPCEntryPoint = XFBFXIGPCEntryPoint.A06;
            C32545EUv c32545EUv = new C32545EUv(0, this, fragmentActivity, z);
            try {
                C1ON A00 = AbstractC33657Eu7.A00(new C51756Mtf(xFBFXIGPCEntryPoint), userSession);
                A00.A00 = c32545EUv;
                C1GJ.A03(A00);
            } catch (Exception e) {
                String obj = xFBFXIGPCEntryPoint.toString();
                String A0z = AbstractC166997dE.A0z("Failed to check user eligibility for IGPC to AC Upsell! \n%s", AbstractC166997dE.A1b(e.getMessage(), 1));
                AbstractC167017dG.A1N(userSession, obj);
                C35191Ffj.A01(userSession, "generic_error", obj, A0z);
            }
        }
    }

    public FQ8(UserSession userSession) {
        this.A04 = userSession;
    }
}
