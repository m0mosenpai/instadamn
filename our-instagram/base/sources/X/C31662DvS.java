package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DvS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31662DvS implements InterfaceC37228Gad {
    public KWi A00;
    public final UserSession A01;
    public final Context A02;
    public final InterfaceC11380iw A03;
    public final C41761wQ A04 = AbstractC31174DnI.A0S();
    public final C6JX A05;

    @Override // X.InterfaceC37228Gad
    public final void AVz(Map map) {
    }

    @Override // X.InterfaceC37228Gad
    public final void Cpw(C32071E6x c32071E6x, Map map) {
    }

    @Override // X.InterfaceC37228Gad
    public final void CqI(List list) {
    }

    @Override // X.InterfaceC37228Gad
    public final void F9A(Map map) {
    }

    @Override // X.InterfaceC37228Gad
    public final void F9P(List list) {
    }

    @Override // X.InterfaceC37228Gad
    public final void AOn(List list) {
        KWi kWi = new KWi(this.A02, this.A01);
        this.A00 = kWi;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kWi.A04((C3o9) it.next(), false);
        }
    }

    @Override // X.InterfaceC37228Gad
    public final void CnJ(Map map) {
        C99Q.A01("markThreadsAsUnread").execute(new GO1(this, map));
    }

    public C31662DvS(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A02 = context;
        this.A01 = userSession;
        this.A03 = interfaceC11380iw;
        this.A05 = C6JW.A00(userSession, "MsysInboxMultiThreadActionController");
    }

    @Override // X.InterfaceC37228Gad
    public final void CqF(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LIu.A01(this.A01).A02(AbstractC31179DnN.A03((C3o9) it.next()));
        }
    }

    @Override // X.InterfaceC37228Gad
    public final void CqN(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC46876KoJ.A00(this.A01).A00(AbstractC31179DnN.A03((C3o9) it.next()), -1L);
        }
    }

    @Override // X.InterfaceC37228Gad
    public final void F9N(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A04.A02(this.A05.A00.A07(AbstractC31179DnN.A03((C3o9) it.next())), GKC.A00);
        }
    }

    @Override // X.InterfaceC37228Gad
    public final void F9S(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC31181DnP.A0x(this.A01, (C3o9) it.next());
        }
    }
}
