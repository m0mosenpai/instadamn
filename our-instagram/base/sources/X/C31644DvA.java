package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Collection;
import java.util.List;

/* renamed from: X.DvA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31644DvA implements InterfaceC37234Gaj {
    public KWi A00;
    public final UserSession A01;
    public final Context A02;
    public final AbstractC59962oe A03;
    public final InterfaceC11380iw A04;
    public final C41761wQ A05 = AbstractC31174DnI.A0S();
    public final C6JX A06;

    @Override // X.InterfaceC37234Gaj
    public final void A7B(InterfaceC37158GYv interfaceC37158GYv, C2EC c2ec, C3o9 c3o9, boolean z) {
        Collection collection;
        List list;
        Context context = this.A02;
        UserSession userSession = this.A01;
        String C7I = c2ec.C7I();
        if (C7I != null) {
            collection = AbstractC166987dD.A1J(C7I);
        } else {
            collection = C16930sl.A00;
        }
        InterfaceC11380iw interfaceC11380iw = this.A04;
        C32071E6x c32071E6x = new C32071E6x(c2ec.B7A());
        C32900Edh c32900Edh = new C32900Edh(interfaceC37158GYv, c2ec);
        List Axh = c2ec.Axh();
        if (Axh != null) {
            list = AbstractC166987dD.A1J(Axh);
        } else {
            list = C16930sl.A00;
        }
        C35250Fgj.A00(context, c32071E6x, interfaceC11380iw, userSession, c32900Edh, collection, list, true, z);
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOm(C3o9 c3o9) {
        C14360o3.A0B(c3o9, 0);
        UserSession userSession = this.A01;
        C162337Ov.A0j(userSession, c3o9);
        KWi kWi = new KWi(this.A02, userSession);
        this.A00 = kWi;
        kWi.A04(c3o9, true);
    }

    @Override // X.InterfaceC37234Gaj
    public final void E31(C3o9 c3o9, boolean z) {
        Activity A04 = AbstractC31172DnG.A04(this.A03);
        String valueOf = String.valueOf(AbstractC31179DnN.A03(c3o9));
        C14360o3.A0B(A04, 0);
        C193328hC A0H = AbstractC31171DnF.A0H(A04);
        A0H.A0e(null, "Ok");
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Is Instamadillo cutover thread: ");
        A1C.append(z);
        A1C.append("\nIs legacy Armadillo thread: ");
        A1C.append(true);
        A1C.append("\nThreadId: ");
        A0H.A0r(AbstractC166997dE.A0x(valueOf, A1C));
        AbstractC166987dD.A1W(A0H);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9K(C3o9 c3o9) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A05(this.A04, A05, AbstractC31179DnN.A0U(A05), false);
        }
        this.A05.A02(this.A06.A00.A08(AbstractC31179DnN.A03(c3o9)), GKF.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9M(C3o9 c3o9) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A04(this.A04, A05, AbstractC31179DnN.A0U(A05), false);
        }
        UserSession userSession = this.A01;
        LIu.A01(userSession).A02(AbstractC31179DnN.A03(c3o9));
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9R(C3o9 c3o9) {
        UserSession userSession = this.A01;
        C35165FfF A00 = AbstractC34136F4m.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            A00.A06(interfaceC11380iw, A05, AbstractC166997dE.A0b(), false);
            AbstractC31181DnP.A0x(userSession, c3o9);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    @Override // X.InterfaceC37234Gaj
    public final void AOl(InterfaceC37158GYv interfaceC37158GYv, C3o9 c3o9, boolean z) {
        AbstractC34188F6m.A00(this.A02, this.A01, new G6W(3, this, c3o9), c3o9, C05F.A0N);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CMQ(C3o9 c3o9, boolean z) {
        throw new C141786av(AnonymousClass001.A0R(AbstractC58317Pt9.A00(32), "Not yet implemented"));
    }

    @Override // X.InterfaceC37234Gaj
    public final void CnI(C3o9 c3o9, Integer num, boolean z) {
        C99Q.A01("markThreadAsUnread").execute(new GO2(this, c3o9));
    }

    @Override // X.InterfaceC37234Gaj
    public final void CoH(C32071E6x c32071E6x, C3o9 c3o9, Integer num, boolean z) {
        final int i = c32071E6x.A00;
        boolean A1N = AbstractC167007dF.A1N(i);
        C6JY c6jy = this.A06.A00;
        final long A03 = AbstractC31179DnN.A03(c3o9);
        C42221xC c42221xC = c6jy.A01;
        final int i2 = A1N ? 1 : 0;
        this.A05.A02(AbstractC31180DnO.A0I(c42221xC.A0L(new C6D2() { // from class: X.Fyh
            @Override // X.C6D2
            public final Object apply(Object obj) {
                final long j = A03;
                final int i3 = i2;
                final int i4 = i;
                final K3Z k3z = (K3Z) obj;
                return C42221xC.A07(new InterfaceC1345866i() { // from class: X.Lc4
                    @Override // X.InterfaceC1345866i
                    public final void EpD(C1346766r c1346766r) {
                        K3Z k3z2 = K3Z.this;
                        long j2 = j;
                        int i5 = i3;
                        int i6 = i4;
                        Integer valueOf = Integer.valueOf(i5);
                        Integer valueOf2 = Integer.valueOf(i6);
                        C48169LTt c48169LTt = new C48169LTt(c1346766r);
                        InterfaceExecutorC135866Co ASj = k3z2.mMailboxApiHandleMetaProvider.ASj(0);
                        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(ASj, c48169LTt);
                        AbstractC25231BEo.A1C(ASj, new C48183LUh(0, j2, A0I, k3z2, valueOf, valueOf2), A0I);
                    }
                }, AbstractC137146It.A00("tam_move_ig_folder"));
            }
        }), "tam_move_ig_folder"), GKD.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqM(C3o9 c3o9, int i) {
        UserSession userSession = this.A01;
        C35165FfF A00 = AbstractC34136F4m.A00(userSession);
        InterfaceC11380iw interfaceC11380iw = this.A04;
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            A00.A06(interfaceC11380iw, A05, true, true);
            AbstractC46876KoJ.A00(userSession).A00(AbstractC31179DnN.A03(c3o9), i * 1000);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C31644DvA(Context context, AbstractC59962oe abstractC59962oe, UserSession userSession) {
        this.A02 = context;
        this.A03 = abstractC59962oe;
        this.A01 = userSession;
        this.A06 = C6JW.A00(userSession, "MsysInboxSecureThreadActionController");
        this.A04 = abstractC59962oe;
    }

    @Override // X.InterfaceC37234Gaj
    public final void AE5(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void ANk(DirectThreadKey directThreadKey) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void APj(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void AVy(C3o9 c3o9, boolean z) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqB(C3o9 c3o9) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A05(this.A04, A05, AbstractC31179DnN.A0U(A05), true);
        }
        this.A05.A02(this.A06.A00.A06(AbstractC31179DnN.A03(c3o9)), GKE.A00);
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqD(C3o9 c3o9) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A04(this.A04, A05, AbstractC31179DnN.A0U(A05), true);
        }
        LIu.A01(this.A01).A02(AbstractC31179DnN.A03(c3o9));
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqE(C3o9 c3o9, int i) {
        InterfaceC83733oI A05 = JRE.A05(c3o9);
        if (A05 != null) {
            AbstractC34136F4m.A00(this.A01).A02(this.A04, A05, AbstractC31179DnN.A0U(A05), i);
        }
        LEB.A01.A02(this.A01, i, AbstractC31179DnN.A03(c3o9));
    }

    @Override // X.InterfaceC37234Gaj
    public final void CqH(C3o9 c3o9) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void E2y(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void E4M(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGA(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void EGQ(C2EC c2ec, Integer num) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void EI0(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void EKc(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void ElU(C2EC c2ec) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F7x(C2EC c2ec, boolean z) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F99(C3o9 c3o9, boolean z) {
        throw AbstractC31179DnN.A0V();
    }

    @Override // X.InterfaceC37234Gaj
    public final void F9O(C3o9 c3o9) {
        throw AbstractC31179DnN.A0V();
    }
}
