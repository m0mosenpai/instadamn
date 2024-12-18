package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.ItP, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42606ItP implements InterfaceC30995Dju {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;

    @Override // X.InterfaceC30995Dju
    public final void D3W(String str) {
        Context context = this.A00.getContext();
        if (context != null) {
            C38801rC c38801rC = C38321qM.A0h;
            Long A0j = AbstractC25231BEo.A0j(0, C38801rC.A06(str));
            if (A0j != null) {
                AbstractC31179DnN.A1M(AbstractC12220kQ.A01(this.A02, this.A01), A0j, "ig_coauthor_invite_cta_tap", "accept_flow_entrypoint_other");
            }
            UserSession userSession = this.A01;
            boolean A06 = C18U.A06(C06090Tz.A05, userSession, 36324299358941269L);
            InterfaceC60442pS interfaceC60442pS = this.A02;
            if (A06) {
                HashMap A00 = C76833cV.A00(userSession, interfaceC60442pS, str);
                if (A00 != null) {
                    C66277U6x.A01("com.instagram.creator_connections.screens.collab_accept_bottom_sheet_screen.component.view", A00).A05(context, AbstractC31171DnF.A0C(userSession));
                    return;
                }
                return;
            }
            C76833cV.A03(context, userSession, interfaceC60442pS, str);
        }
    }

    @Override // X.InterfaceC30995Dju
    public final void D45(C38321qM c38321qM) {
        Fragment fragment = this.A00;
        if (fragment.getContext() != null) {
            AbstractC55229Oez.A09(fragment, this.A01, c38321qM, this.A02, null, null, false, true);
        }
    }

    public C42606ItP(Fragment fragment, UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = interfaceC60442pS;
    }
}
