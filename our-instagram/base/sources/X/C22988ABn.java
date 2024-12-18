package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.ABn, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C22988ABn {
    public final Activity A00;
    public final UserSession A01;
    public final C193328hC A02;
    public final C23031Ai A03;
    public final InterfaceC16620sF A04;
    public final InterfaceC16620sF A05;
    public final InterfaceC16620sF A06;

    public C22988ABn(Activity activity) {
        this.A00 = activity;
        UserSession A08 = C023409i.A0A.A08(activity);
        this.A01 = A08;
        this.A03 = AbstractC23021Ah.A00(A08);
        C30496Dbf c30496Dbf = new C30496Dbf(this, 30);
        this.A06 = c30496Dbf;
        C30496Dbf c30496Dbf2 = new C30496Dbf(this, 28);
        this.A04 = c30496Dbf2;
        C30496Dbf c30496Dbf3 = new C30496Dbf(this, 29);
        this.A05 = c30496Dbf3;
        C193328hC c193328hC = new C193328hC(activity);
        c193328hC.A0s(true);
        c193328hC.A09(2131965684);
        c193328hC.A0A(2131965685);
        c193328hC.A0t(true);
        c193328hC.A0K(new AOD(c30496Dbf, 10), 2131965683);
        c193328hC.A0H(new AOD(c30496Dbf2, 10), 2131965682);
        c193328hC.A0I(new AOD(c30496Dbf3, 10), 2131965681);
        c193328hC.A08(R.drawable.ig_illustrations_illo_camera_permissions_refresh);
        this.A02 = c193328hC;
    }

    public final void A00(boolean z) {
        InterfaceC02590Ai A0f;
        String str;
        Activity activity = this.A00;
        UserSession userSession = this.A01;
        if (AbstractC172747mk.A00(activity, userSession).A00()) {
            C180257zF c180257zF = C180257zF.A00;
            C23031Ai c23031Ai = this.A03;
            if (!c180257zF.A02(activity, userSession, c23031Ai)) {
                AbstractC166987dD.A1W(this.A02);
                InterfaceC19630xq interfaceC19630xq = c23031Ai.A01;
                String A00 = AbstractC43591JPw.A00(211);
                if (!interfaceC19630xq.getBoolean(A00, false)) {
                    InterfaceC19610xo ARD = interfaceC19630xq.ARD();
                    ARD.E77(A00, true);
                    ARD.apply();
                }
                OTM A002 = A1G.A00(activity, userSession);
                boolean A003 = OTM.A00(A002);
                if (z) {
                    if (A003) {
                        A0f = AbstractC166987dD.A0f((C18920wW) A002.A01.getValue(), "ig_lock_screen_shortcuts");
                        if (A0f.isSampled()) {
                            str = "onboarding_dialog_imp_via_nux";
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    if (!A003) {
                        return;
                    }
                    A0f = AbstractC166987dD.A0f((C18920wW) A002.A01.getValue(), "ig_lock_screen_shortcuts");
                    if (!A0f.isSampled()) {
                        return;
                    } else {
                        str = "onboarding_dialog_imp_via_camera_settings";
                    }
                }
                A0f.AAP("action", str);
                A0f.Cht();
            }
        }
    }
}
