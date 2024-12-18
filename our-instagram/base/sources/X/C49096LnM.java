package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LnM, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49096LnM implements InterfaceC165317aK, InterfaceC165587al {
    public final C7XS A00;
    public final AbstractC59962oe A01;
    public final UserSession A02;
    public final C163867Va A03;
    public final C49617LwA A04;
    public final InterfaceC16820sZ A05;
    public final InterfaceC16820sZ A06;
    public final InterfaceC16820sZ A07;

    public C49096LnM(AbstractC59962oe abstractC59962oe, UserSession userSession, C163867Va c163867Va, C7XS c7xs, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3) {
        AbstractC25234BEr.A0j(2, abstractC59962oe, c7xs, c163867Va, interfaceC16820sZ);
        this.A02 = userSession;
        this.A01 = abstractC59962oe;
        this.A00 = c7xs;
        this.A03 = c163867Va;
        this.A07 = interfaceC16820sZ;
        this.A06 = interfaceC16820sZ2;
        this.A05 = interfaceC16820sZ3;
        this.A04 = new C49617LwA(this);
    }

    @Override // X.InterfaceC165587al
    public final void ASs(boolean z) {
        C77K c77k = (C77K) this.A05.invoke();
        if (c77k != null) {
            c77k.A00();
        }
    }

    @Override // X.InterfaceC165317aK
    public final void Elc() {
        UserSession userSession = this.A02;
        InterfaceC19630xq A0x = AbstractC166987dD.A0x(userSession);
        AbstractC167017dG.A1L(A0x.ARD(), A0x, AbstractC111324zv.A00(4300), 0);
        Object invoke = this.A07.invoke();
        if (invoke != null) {
            C2EF c2ef = (C2EF) invoke;
            boolean A02 = C161867Mw.A02(c2ef.Aic());
            boolean Cd4 = c2ef.Cd4();
            Bundle A05 = AbstractC31178DnM.A05(userSession);
            A05.putBoolean("IS_SHH_REPLAY_ENABLED", Cd4);
            A05.putBoolean("IS_CUTOVER_THREAD", A02);
            C45512KDb c45512KDb = new C45512KDb();
            c45512KDb.setArguments(A05);
            AbstractC59962oe abstractC59962oe = this.A01;
            Context requireContext = abstractC59962oe.requireContext();
            InterfaceC16820sZ interfaceC16820sZ = this.A06;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(requireContext, ((C7IM) interfaceC16820sZ.invoke()).A07.A0E);
            C189448aO A0y = AbstractC25225BEi.A0y(userSession);
            AbstractC25225BEi.A1Q(A0y, true);
            A0y.A05(abstractC59962oe.requireContext(), R.dimen.browser_actions_context_menu_max_width);
            A0y.A06 = AbstractC53242c7.A0F(contextThemeWrapper, R.attr.elevatedBackgroundColor);
            A0y.A0U = this.A04;
            C189478aR A00 = A0y.A00();
            C7IM c7im = (C7IM) interfaceC16820sZ.invoke();
            C14360o3.A0B(c7im, 0);
            c45512KDb.A00 = c7im;
            C45512KDb.A00(c45512KDb);
            this.A03.CMc();
            Activity rootActivity = abstractC59962oe.getRootActivity();
            C14360o3.A0A(rootActivity);
            A00.A02(rootActivity, c45512KDb);
            this.A00.D0E();
            return;
        }
        throw AbstractC166997dE.A0g();
    }
}
