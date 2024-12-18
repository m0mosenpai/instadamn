package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class P0K implements InterfaceC58168PqY {
    public C64842wi A00;
    public final C64742wY A01;
    public final AbstractC59962oe A02;
    public final InterfaceC11380iw A03;
    public final UserSession A04;

    public P0K(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        AbstractC167027dH.A13(abstractC59962oe, userSession, interfaceC11380iw);
        this.A02 = abstractC59962oe;
        this.A04 = userSession;
        this.A03 = interfaceC11380iw;
        C27961Xa A00 = AbstractC54912fq.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        C64712wV c64712wV = new C64712wV();
        A1G.put(QPTooltipAnchor.A1K, c64712wV);
        A1G.put(QPTooltipAnchor.A0F, c64712wV);
        A1G.put(QPTooltipAnchor.A16, c64712wV);
        C64742wY A05 = A00.A05(userSession, A1G);
        this.A01 = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0E;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new P73(this, 1), A05);
        this.A00 = A002.A02(abstractC59962oe, interfaceC11380iw, userSession, A0S.A00(), quickPromotionSlot);
    }

    @Override // X.InterfaceC58168PqY
    public final void ED5(View view, QPTooltipAnchor qPTooltipAnchor) {
        C14360o3.A0B(qPTooltipAnchor, 0);
        C64742wY c64742wY = this.A01;
        C64842wi c64842wi = this.A00;
        if (c64842wi == null) {
            C14360o3.A0F("qpFragmentPresenter");
            throw C00O.createAndThrow();
        }
        c64742wY.A00(view, qPTooltipAnchor, c64842wi);
    }

    @Override // X.InterfaceC58168PqY
    public final void F9U(QPTooltipAnchor qPTooltipAnchor) {
        C14360o3.A0B(qPTooltipAnchor, 0);
        this.A01.A07.remove(qPTooltipAnchor);
    }

    @Override // X.InterfaceC58168PqY
    public final void DiZ() {
        C64842wi c64842wi = this.A00;
        if (c64842wi == null) {
            C14360o3.A0F("qpFragmentPresenter");
            throw C00O.createAndThrow();
        }
        c64842wi.DiZ();
    }

    @Override // X.InterfaceC58168PqY
    public final void EDN() {
        this.A02.registerLifecycleListener(this.A01);
    }

    @Override // X.InterfaceC58168PqY
    public final void F9a() {
        this.A02.unregisterLifecycleListener(this.A01);
    }
}
