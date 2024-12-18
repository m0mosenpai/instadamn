package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.user.model.UpcomingEvent;
import java.util.List;

/* renamed from: X.CxR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29394CxR implements InterfaceC31076DlJ {
    public final Fragment A00;
    public final AbstractC10360h2 A01;
    public final InterfaceC11380iw A02;
    public final UserSession A03;
    public final InterfaceC60442pS A04;
    public final String A05;
    public final InterfaceC686136y A06;
    public final C33P A07;
    public final C1M1 A08;
    public final String A09;

    public C29394CxR(Fragment fragment, AbstractC10360h2 abstractC10360h2, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, C33P c33p, C1M1 c1m1, String str, String str2) {
        AbstractC167007dF.A1J(interfaceC11380iw, 5, c1m1);
        this.A06 = interfaceC686136y;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = interfaceC60442pS;
        this.A02 = interfaceC11380iw;
        this.A00 = fragment;
        this.A09 = str2;
        this.A07 = c33p;
        this.A08 = c1m1;
        this.A01 = abstractC10360h2;
    }

    @Override // X.InterfaceC31076DlJ
    public final void D5R(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            UserSession userSession = this.A03;
            AbstractC55229Oez.A0C(fragment, userSession, c38321qM, interfaceC60442pS, fragment.getString(2131975629), c38321qM.A3u(userSession));
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void D8f(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DFC(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DJ4(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DOH() {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DTX(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void Djp(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwK(C38321qM c38321qM, C75113Zb c75113Zb, Integer num, boolean z) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwL(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwM(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwP() {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwQ(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwR(List list, String str) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwS(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwT(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwU(C38321qM c38321qM) {
        UserSession userSession = this.A03;
        UpcomingEvent A2B = c38321qM.A2B(userSession);
        if (A2B != null) {
            InterfaceC60442pS interfaceC60442pS = this.A04;
            AbstractC40640Hzy.A00(userSession, c38321qM, interfaceC60442pS, A2B);
            AbstractC22762A2g.A00().A01(this.A00.requireContext(), userSession, interfaceC60442pS, null, A2B, c38321qM.A1g(userSession).getId(), interfaceC60442pS.getModuleName(), AbstractC111324zv.A00(537), false, false);
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwV(C38321qM c38321qM, C75113Zb c75113Zb) {
        String str;
        if (!(!C06P.A01(this.A01))) {
            CreativeConfigIntf Asm = c38321qM.A0C.Asm();
            if (Asm != null) {
                List<EffectPreviewIntf> B0S = Asm.B0S();
                if (B0S != null) {
                    if (B0S.size() > 1) {
                        Fragment fragment = this.A00;
                        Context requireContext = fragment.requireContext();
                        UserSession userSession = this.A03;
                        C50674MYs c50674MYs = new C50674MYs(requireContext, userSession);
                        c50674MYs.A00(2131961693);
                        for (EffectPreviewIntf effectPreviewIntf : B0S) {
                            c50674MYs.A0B(effectPreviewIntf.getName(), new ViewOnClickListenerC28651Ckz(5, this, c38321qM, effectPreviewIntf, c75113Zb));
                        }
                        new C31727DwY(c50674MYs).A05(fragment.requireActivity());
                        InterfaceC60442pS interfaceC60442pS = this.A04;
                        EnumC39652Hih enumC39652Hih = EnumC39652Hih.A0E;
                        C1M1 c1m1 = this.A08;
                        if (c1m1 instanceof InterfaceC43589JPu) {
                            C14360o3.A0C(c1m1, "null cannot be cast to non-null type com.instagram.util.session.ChainingAndViewerSessionIdProvider");
                            str = ((InterfaceC43589JPu) c1m1).CGJ();
                        } else {
                            str = "";
                        }
                        AbstractC37670Gi3.A0R(enumC39652Hih, userSession, c38321qM, interfaceC60442pS, str, c38321qM.getId(), c75113Zb.getPosition());
                        return;
                    }
                    if (!B0S.isEmpty()) {
                        AbstractC40638Hzw.A00(this.A00.requireActivity(), this.A02, this.A03, (EffectPreviewIntf) B0S.get(0), c38321qM, this.A04, c75113Zb);
                        return;
                    }
                    return;
                }
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwW(C38321qM c38321qM, C75113Zb c75113Zb) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwX(C38321qM c38321qM, C75113Zb c75113Zb, boolean z, boolean z2) {
        C14360o3.A0B(c38321qM, 0);
        Fragment fragment = this.A00;
        if (fragment.getActivity() != null) {
            if (c38321qM.A10() == 1) {
                AbstractC55229Oez.A0B(fragment, this.A03, c38321qM, this.A04, this.A05);
            } else {
                AbstractC55229Oez.A09(fragment, this.A03, c38321qM, this.A04, null, null, z, false);
            }
        }
    }

    @Override // X.InterfaceC31076DlJ
    public final void DwZ(C38321qM c38321qM, C75113Zb c75113Zb) {
        InterfaceC60442pS interfaceC60442pS = this.A04;
        UserSession userSession = this.A03;
        String str = this.A05;
        AbstractC41775Ier.A0B(userSession, c38321qM, interfaceC60442pS, str, false);
        C1XJ.A00.A0t(this.A00.requireActivity(), userSession, c38321qM, interfaceC60442pS, c75113Zb, null, str, this.A09, null);
    }

    @Override // X.InterfaceC31076DlJ
    public final void Dwa(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void Dwb(C38321qM c38321qM) {
    }

    @Override // X.InterfaceC31076DlJ
    public final void D5J(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A06.C56().D5J(c38321qM, c75113Zb);
    }

    @Override // X.InterfaceC31076DlJ
    public final void DX3(C38321qM c38321qM, C75113Zb c75113Zb) {
        this.A06.C56().DX3(c38321qM, c75113Zb);
    }
}
