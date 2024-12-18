package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Ekv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33207Ekv extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "HelpOptionsFragment";
    public UserSession A00;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "settings_help_options";
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        interfaceC56362iU.Efu(2131964531);
        AbstractC10360h2 abstractC10360h2 = this.mFragmentManager;
        abstractC10360h2.getClass();
        interfaceC56362iU.EkS(AbstractC167007dF.A1O(abstractC10360h2.A0L()));
        C35026Fbz c35026Fbz = new C35026Fbz(C05F.A00);
        c35026Fbz.A06 = AbstractC31174DnI.A09(requireContext(), AbstractC53242c7.A08(requireContext()));
        C35026Fbz.A00(interfaceC56362iU, c35026Fbz);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-1914170046);
        super.onCreate(bundle);
        this.A00 = AbstractC31176DnK.A0S(this);
        C0f9.A09(-1251962069, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(1054470077);
        super.onResume();
        C0f9.A09(-1398256309, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C34944FaU c34944FaU = new C34944FaU(this.A00, this);
        ArrayList A1E = AbstractC166987dD.A1E();
        AbstractC33235ElU abstractC33235ElU = c34944FaU.A02;
        AbstractC33235ElU.A06(abstractC33235ElU.requireContext(), c34944FaU, A1E, 69, 2131972403);
        UserSession userSession = c34944FaU.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36312930580432432L)) {
            AbstractC25235BEs.A1C(abstractC33235ElU.requireContext(), ViewOnClickListenerC35689FpO.A00(c34944FaU, 1), A1E, 2131957243);
        }
        AbstractC25235BEs.A1C(abstractC33235ElU.requireContext(), ViewOnClickListenerC35689FpO.A00(c34944FaU, 0), A1E, 2131964532);
        boolean A00 = AbstractC1565371b.A00(userSession);
        GHY A002 = GHY.A00(abstractC33235ElU.requireContext(), new ViewOnClickListenerC35669Fp4(15, c34944FaU, A00), 2131975001);
        A002.A09 = A00;
        AbstractC33235ElU.A06(AbstractC31173DnH.A07(abstractC33235ElU, A002, A1E), c34944FaU, A1E, 70, 2131969921);
        if (C18U.A06(c06090Tz, userSession, 36312887630759457L) && C2E7.A01(AbstractC166987dD.A10(userSession))) {
            C14360o3.A0B(userSession, 0);
            C34668FPd c34668FPd = (C34668FPd) userSession.A01(C34668FPd.class, new C57526Pg0(userSession, 14));
            c34668FPd.A00("monetization_help", "impression", "entrypoint");
            AbstractC25235BEs.A1C(abstractC33235ElU.requireContext(), new ViewOnClickListenerC35687FpM(46, c34944FaU, c34668FPd), A1E, 2131966867);
        }
        setItems(A1E);
    }
}
