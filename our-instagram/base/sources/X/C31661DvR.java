package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DvR, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31661DvR implements InterfaceC37228Gad {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final C31605DuX A03;

    @Override // X.InterfaceC37228Gad
    public final void Cpw(C32071E6x c32071E6x, Map map) {
        int A01 = FUH.A01(AbstractC31180DnO.A0n(map));
        UserSession userSession = this.A02;
        Iterator it = AbstractC166987dD.A1F(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A01(c32071E6x, userSession, str);
            }
        }
        InterfaceC11380iw interfaceC11380iw = this.A01;
        int i = c32071E6x.A00;
        int size = map.size();
        boolean A1M = AbstractC167007dF.A1M(A01);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "direct_thread_move_multiple");
        A0f.A9K("folder", AbstractC31171DnF.A0V(i));
        A0f.A9K(AbstractC43591JPw.A00(218), AbstractC31171DnF.A0V(size));
        A0f.A9K("interop_thread_count", AbstractC31171DnF.A0V(A01));
        AbstractC31180DnO.A1J(A0f, A1M);
        A0f.Cht();
        FUF.A01(this.A00, c32071E6x, userSession, null, map.size(), true);
    }

    public static void A00(InterfaceC02590Ai interfaceC02590Ai, String str, int i) {
        interfaceC02590Ai.AAP("action", str);
        interfaceC02590Ai.A9K(AbstractC43591JPw.A00(218), Long.valueOf(i));
    }

    @Override // X.InterfaceC37228Gad
    public final void AOn(List list) {
        C31605DuX c31605DuX = this.A03;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C31605DuX.A00(c31605DuX, (C3o9) it.next(), false);
        }
        UserSession userSession = this.A02;
        int size = list.size();
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_deleted", size);
        A07.Cht();
    }

    @Override // X.InterfaceC37228Gad
    public final void AVz(Map map) {
        UserSession userSession = this.A02;
        boolean z = true;
        Iterator it = AbstractC166987dD.A1F(map.keySet()).iterator();
        while (it.hasNext()) {
            F5G.A00(userSession, AbstractC31180DnO.A0Q(it), true);
        }
        int A01 = FUH.A01(AbstractC31180DnO.A0n(map));
        int size = map.size();
        if (A01 == 0) {
            z = false;
        }
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_flag", size);
        AbstractC31180DnO.A1J(A07, z);
        A07.A9K("interop_thread_count", AbstractC31171DnF.A0V(A01));
        A07.Cht();
    }

    @Override // X.InterfaceC37228Gad
    public final void CqF(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A04(interfaceC11380iw, userSession, str, true);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C162337Ov.A0f(userSession, list.size());
    }

    @Override // X.InterfaceC37228Gad
    public final void CqI(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A05(interfaceC11380iw, userSession, str, true);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C162337Ov.A0f(userSession, list.size());
    }

    @Override // X.InterfaceC37228Gad
    public final void CqN(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A06(interfaceC11380iw, userSession, str, true);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        int size = list.size();
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_muted_video_chat", size);
        A07.Cht();
    }

    @Override // X.InterfaceC37228Gad
    public final void F9A(Map map) {
        UserSession userSession = this.A02;
        boolean z = false;
        Iterator it = AbstractC166987dD.A1F(map.keySet()).iterator();
        while (it.hasNext()) {
            F5G.A00(userSession, AbstractC31180DnO.A0Q(it), false);
        }
        int A01 = FUH.A01(AbstractC31180DnO.A0n(map));
        int size = map.size();
        if (A01 != 0) {
            z = true;
        }
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_unflag", size);
        AbstractC31180DnO.A1J(A07, z);
        A07.A9K("interop_thread_count", AbstractC31171DnF.A0V(A01));
        A07.Cht();
    }

    @Override // X.InterfaceC37228Gad
    public final void F9N(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A04(interfaceC11380iw, userSession, str, false);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        int size = list.size();
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_unmuted_messages", size);
        A07.Cht();
    }

    @Override // X.InterfaceC37228Gad
    public final void F9P(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A05(interfaceC11380iw, userSession, str, false);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        C162337Ov.A0f(userSession, list.size());
    }

    @Override // X.InterfaceC37228Gad
    public final void F9S(List list) {
        UserSession userSession = this.A02;
        InterfaceC11380iw interfaceC11380iw = this.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = AbstractC31180DnO.A0Q(it).A00;
            if (str != null) {
                AbstractC31278Dp0.A06(interfaceC11380iw, userSession, str, false);
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        int size = list.size();
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_unmuted_video_chat", size);
        A07.Cht();
    }

    public C31661DvR(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = interfaceC11380iw;
        this.A03 = new C31605DuX(context, userSession);
    }

    @Override // X.InterfaceC37228Gad
    public final void CnJ(Map map) {
        int A01 = FUH.A01(AbstractC31180DnO.A0n(map));
        UserSession userSession = this.A02;
        boolean z = true;
        Iterator it = AbstractC166987dD.A1F(map.keySet()).iterator();
        while (it.hasNext()) {
            AbstractC31278Dp0.A0C(userSession, AbstractC31180DnO.A0Q(it), true);
        }
        int size = map.size();
        if (A01 == 0) {
            z = false;
        }
        InterfaceC02590Ai A07 = AbstractC31181DnP.A07(userSession);
        A00(A07, "multiple_thread_mark_unread", size);
        AbstractC31180DnO.A1J(A07, z);
        A07.A9K("interop_thread_count", AbstractC31171DnF.A0V(A01));
        A07.Cht();
    }
}
