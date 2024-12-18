package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.El4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33216El4 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "DataSaverOptionsFragment";
    public UserSession A00;
    public C34966Faq A01;

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        C14360o3.A0B(interfaceC56362iU, 0);
        AbstractC25229BEm.A1G(interfaceC56362iU, 2131957508);
    }

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "data_saver_options";
    }

    public static final void A00(C33216El4 c33216El4, boolean z) {
        C34966Faq c34966Faq = c33216El4.A01;
        if (c34966Faq != null) {
            c34966Faq.A05 = z;
            C2UU c2uu = (C2UU) AbstractC31175DnJ.A0P(c33216El4);
            if (c2uu != null) {
                c2uu.notifyDataSetChanged();
                return;
            }
            throw AbstractC166987dD.A14("Required value was null.");
        }
        throw AbstractC166987dD.A14("Required value was null.");
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1623371727);
        super.onCreate(bundle);
        this.A00 = AbstractC31177DnL.A0R(this);
        C0f9.A09(985407814, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int i;
        int A02 = C0f9.A02(1601501263);
        super.onResume();
        ArrayList A1E = AbstractC166987dD.A1E();
        UserSession userSession = this.A00;
        if (userSession != null) {
            C23031Ai A00 = AbstractC23021Ah.A00(userSession);
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                boolean A01 = C1QA.A00(userSession2).A01();
                C31335Dq0.A03(A1E, 2131957515);
                C34966Faq c34966Faq = new C34966Faq(getString(2131957514), ViewOnClickListenerC35689FpO.A00(this, 65));
                this.A01 = c34966Faq;
                UserSession userSession3 = this.A00;
                if (userSession3 != null) {
                    int A002 = C1QA.A00(userSession3).A00();
                    if (A002 != 0) {
                        if (A002 != 1) {
                            if (A002 == 2) {
                                i = 2131957512;
                            } else {
                                throw AbstractC166987dD.A12("Unrecognized network setting");
                            }
                        } else {
                            i = 2131957513;
                        }
                    } else {
                        i = 2131957509;
                    }
                    c34966Faq.A03 = getString(i);
                    A00(this, !A01);
                    A1E.add(C36731GHa.A02(new C35730FqD(15, this, A00), 2131957510, A01));
                    C35246Fgf.A01(this, A1E, 2131957511);
                    A1E.add(this.A01);
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, this.A00, 36316087381397454L)) {
                        boolean A20 = A00.A20();
                        C31335Dq0.A03(A1E, 2131963564);
                        A1E.add(C36731GHa.A02(new C35730FqD(16, this, A00), 2131963563, A20));
                        C35246Fgf.A02(A1E, 2131963562);
                    }
                    setItems(A1E);
                    C0f9.A09(1684619959, A02);
                    return;
                }
                throw AbstractC166997dE.A0g();
            }
            throw AbstractC166997dE.A0g();
        }
        throw AbstractC166997dE.A0g();
    }
}
