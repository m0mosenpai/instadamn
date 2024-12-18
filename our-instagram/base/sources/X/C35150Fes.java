package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.Fes, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35150Fes {
    public boolean A00;
    public final FragmentActivity A01;
    public final AbstractC59962oe A02;
    public final BusinessFlowAnalyticsLogger A03;
    public final InterfaceC37191Ga2 A04 = new C35928Ftm(this);
    public final InterfaceC41501vz A05;
    public final InterfaceC41501vz A06;
    public final UserSession A07;

    public static void A01(C35150Fes c35150Fes) {
        c35150Fes.A03.Cm3(new Y7A("switch_back", "setting", "cancel", null, null, null, null, null));
    }

    public C35150Fes(AbstractC59962oe abstractC59962oe, UserSession userSession) {
        C36155FxU c36155FxU = new C36155FxU(this, 16);
        this.A06 = c36155FxU;
        C36155FxU c36155FxU2 = new C36155FxU(this, 17);
        this.A05 = c36155FxU2;
        this.A07 = userSession;
        this.A02 = abstractC59962oe;
        this.A01 = abstractC59962oe.requireActivity();
        BusinessFlowAnalyticsLogger A01 = AbstractC151606s6.A01(EnumC151596s5.A04, userSession, "business_conversion_controller", null);
        A01.getClass();
        this.A03 = A01;
        if (abstractC59962oe.mView != null) {
            AbstractC25651Mw.A00(userSession).A01(c36155FxU, AbstractC36052Fvo.class);
            AbstractC25651Mw.A00(userSession).A01(c36155FxU2, C36061Fvx.class);
            abstractC59962oe.registerLifecycleListener(new C31426DrW(this, 2));
        }
    }

    public static void A00(EnumC193348hE enumC193348hE, C35150Fes c35150Fes, int i) {
        C193328hC A0H = AbstractC31171DnF.A0H(c35150Fes.A01);
        A0H.A0A(2131975084);
        A0H.A09(i);
        A0H.A0R(DialogInterfaceOnClickListenerC35454FkB.A00(c35150Fes, 66), enumC193348hE, 2131975083);
        AbstractC31176DnK.A14(DialogInterfaceOnClickListenerC35454FkB.A00(c35150Fes, 67), A0H);
    }

    public final void A02(EnumC151596s5 enumC151596s5) {
        int i;
        int ordinal = enumC151596s5.ordinal();
        if (ordinal != 2) {
            if (ordinal == 5) {
                i = 12;
            } else {
                throw AbstractC166987dD.A12("unsupported flow type");
            }
        } else {
            i = 11;
        }
        F0G.A00();
        FragmentActivity fragmentActivity = this.A01;
        C14360o3.A0B(fragmentActivity, 0);
        Intent A08 = AbstractC31173DnH.A08(fragmentActivity);
        AbstractC59962oe abstractC59962oe = this.A02;
        Bundle requireArguments = abstractC59962oe.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "setting");
        requireArguments.putInt("intro_entry_position", 0);
        AbstractC31174DnI.A1A(A08, enumC151596s5.A00, requireArguments);
        C12260kU.A06(abstractC59962oe, A08, i);
    }
}
