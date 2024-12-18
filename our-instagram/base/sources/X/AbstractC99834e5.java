package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.4e5, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC99834e5 {
    public static final void A00(View view, final InterfaceC11380iw interfaceC11380iw, UserSession userSession, C38321qM c38321qM) {
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC11380iw, 3);
        A01(view, userSession, c38321qM, new InterfaceC60442pS() { // from class: X.6Wy
            public static final String __redex_internal_original_name = "GnvTrackingDataHelper$attachTrackingData$1";

            @Override // X.InterfaceC60442pS
            public final boolean isOrganicEligible() {
                return false;
            }

            @Override // X.InterfaceC60442pS
            public final boolean isSponsoredEligible() {
                return false;
            }

            @Override // X.InterfaceC11380iw
            public final String getModuleName() {
                return InterfaceC11380iw.this.getModuleName();
            }
        }, false);
    }

    public static final void A01(View view, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, boolean z) {
        C79623hD c79623hD;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(interfaceC60442pS, 3);
        C71313Hs A00 = C71313Hs.A00(userSession);
        C14360o3.A07(A00);
        if (z) {
            Context context = view.getContext();
            C14360o3.A07(context);
            c79623hD = new C79623hD(new C86933u7(context, new C75113Zb(c38321qM.A0p(), c38321qM.A4w()), userSession, c38321qM), userSession, c38321qM, interfaceC60442pS, "in_app_browser_v2", C16910sj.A00);
        } else {
            c79623hD = new C79623hD(null, userSession, c38321qM, interfaceC60442pS);
        }
        A00.A0A(view, c79623hD);
    }

    public static final void A02(View view, UserSession userSession, String str) {
        final long j;
        C14360o3.A0B(view, 0);
        C14360o3.A0B(userSession, 1);
        if (C3K8.A01(userSession)) {
            Long A0k = AbstractC003100w.A0k(10, str);
            if (A0k != null) {
                j = A0k.longValue();
            } else {
                j = 0;
            }
            C71313Hs A00 = C71313Hs.A00(userSession);
            C14360o3.A07(A00);
            A00.A0A(view, new InterfaceC79643hF() { // from class: X.53i
                @Override // X.InterfaceC79643hF
                public final C93574Hy AWp() {
                    return null;
                }

                @Override // X.InterfaceC79643hF
                public final String AWz() {
                    return null;
                }

                @Override // X.InterfaceC79643hF
                public final C5H2 AX1() {
                    return null;
                }

                @Override // X.InterfaceC79643hF
                public final C5H3 AX0() {
                    return new C23296AUh(j);
                }
            });
        }
    }
}
