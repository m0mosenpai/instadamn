package X;

import android.content.Context;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;

/* renamed from: X.ABk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22985ABk {
    public BCG A00;
    public final C1815383g A01;
    public final C25671My A02;
    public final InterfaceC41501vz A03;
    public final String A04;
    public final boolean A05;

    public C22985ABk(Context context, UserSession userSession, BCG bcg, String str) {
        InterfaceC149836oc interfaceC149836oc;
        C14360o3.A0B(userSession, 2);
        this.A00 = bcg;
        C9HR c9hr = new C9HR(this, 4);
        this.A03 = c9hr;
        boolean z = C04100Kb.A00(context) >= 2011;
        this.A05 = z;
        C23564AcI c23564AcI = new C23564AcI();
        EnumC142606cM enumC142606cM = EnumC142606cM.A01;
        if (C6PX.A00(AbstractC166987dD.A0O(context))) {
            interfaceC149836oc = C149816oa.A00(AbstractC166987dD.A0O(context), enumC142606cM, AbstractC149806oZ.A00(userSession), null, userSession);
        } else {
            interfaceC149836oc = null;
        }
        C1813282k c1813282k = new C1813282k(context, null, userSession);
        this.A01 = new C1815383g(context, null, c23564AcI, c1813282k, new IgCameraEffectsController(context.getApplicationContext(), c23564AcI, c1813282k, interfaceC149836oc, userSession, null, null, "instagram_live"), interfaceC149836oc, null, userSession, null, null, null, null, AbstractC09440dt.A01(new D8L(2, context, userSession)));
        if (z) {
            if (str != null) {
                AbstractC12120kG.A07("CameraEffectFacade", AnonymousClass001.A0R("Attempting to set unknown effect: ", str), null);
            }
            this.A04 = str;
            C25671My A00 = AbstractC25651Mw.A00(userSession);
            A00.A01(c9hr, C199898st.class);
            this.A02 = A00;
        }
    }

    public final boolean A00() {
        IgCameraEffectsController igCameraEffectsController;
        InterfaceC149836oc interfaceC149836oc;
        if (this.A05 && (interfaceC149836oc = (igCameraEffectsController = this.A01.A05).A0L) != null && interfaceC149836oc.B0c().A01(igCameraEffectsController.A0N)) {
            return true;
        }
        return false;
    }
}
