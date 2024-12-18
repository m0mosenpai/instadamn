package X;

import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* loaded from: classes9.dex */
public final class OZu {
    public static final OZu A00 = new Object();

    public final boolean A01(UserSession userSession, InterfaceC914447a interfaceC914447a) {
        C14360o3.A0B(userSession, 0);
        return C14360o3.A0K(A00(userSession, interfaceC914447a), NLN.A00);
    }

    public static final AbstractC53473Nl0 A00(UserSession userSession, InterfaceC914447a interfaceC914447a) {
        ArrayList A1E = AbstractC166987dD.A1E();
        if (interfaceC914447a == null) {
            A1E.add(EnumC53188Nfk.A09);
        } else {
            if ("com.instagram.barcelona".equals(interfaceC914447a.BRy().A03) && !C18U.A06(C06090Tz.A05, userSession, 36319970031837049L)) {
                A1E.add(EnumC53188Nfk.A0D);
            }
            if (interfaceC914447a.AdS() == EnumC76383bi.A04) {
                A1E.add(EnumC53188Nfk.A04);
            }
            if (interfaceC914447a.AdS() == EnumC76383bi.A07) {
                A1E.add(EnumC53188Nfk.A07);
            }
            if (interfaceC914447a.AdS() != EnumC76383bi.A06) {
                A1E.add(EnumC53188Nfk.A02);
            }
            if (interfaceC914447a.CL0()) {
                A1E.add(EnumC53188Nfk.A08);
            }
            if (interfaceC914447a.CKm()) {
                A1E.add(EnumC53188Nfk.A03);
            }
            if (interfaceC914447a.BuB()) {
                A1E.add(EnumC53188Nfk.A0B);
            }
            boolean A1U = MSX.A1U(CallerContext.A01("FeedXpostContentEligibilityUtil"), C196068lw.A00(userSession));
            if (interfaceC914447a.CKo() && A1U && !C18U.A06(C06090Tz.A05, userSession, 36329328765583630L)) {
                A1E.add(EnumC53188Nfk.A0C);
            }
            if (A1E.isEmpty()) {
                return NLN.A00;
            }
        }
        return new NLM(A1E);
    }
}
