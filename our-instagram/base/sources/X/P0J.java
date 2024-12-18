package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;
import com.instagram.quickpromotion.intf.QuickPromotionSlot;
import java.util.HashMap;

/* loaded from: classes9.dex */
public final class P0J implements InterfaceC58168PqY {
    public C64842wi A00;
    public final UserSession A01;
    public final C64742wY A02;
    public final AbstractC59962oe A03;
    public final InterfaceC11380iw A04;

    @Override // X.InterfaceC58168PqY
    public final void ED5(View view, QPTooltipAnchor qPTooltipAnchor) {
        C14360o3.A0B(qPTooltipAnchor, 0);
        C64742wY c64742wY = this.A02;
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
        this.A02.A07.remove(qPTooltipAnchor);
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
        this.A03.registerLifecycleListener(this.A02);
    }

    @Override // X.InterfaceC58168PqY
    public final void F9a() {
        this.A03.unregisterLifecycleListener(this.A02);
    }

    public P0J(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A03 = abstractC59962oe;
        this.A01 = userSession;
        this.A04 = interfaceC11380iw;
        C27961Xa A00 = AbstractC54912fq.A00();
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put(QPTooltipAnchor.A1K, new P7D());
        A1G.put(QPTooltipAnchor.A1J, new P7E());
        A1G.put(QPTooltipAnchor.A04, new P7B());
        A1G.put(QPTooltipAnchor.A05, new P7B());
        A1G.put(QPTooltipAnchor.A08, new P7C());
        C64742wY A05 = A00.A05(userSession, A1G);
        this.A02 = A05;
        C27961Xa A002 = AbstractC54912fq.A00();
        QuickPromotionSlot quickPromotionSlot = QuickPromotionSlot.A0v;
        C54922fr A0S = AbstractC31175DnJ.A0S();
        A0S.A01(new P73(this, 0), A05);
        this.A00 = A002.A02(abstractC59962oe, interfaceC11380iw, userSession, A0S.A00(), quickPromotionSlot);
    }
}
