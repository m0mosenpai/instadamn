package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.El8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33220El8 extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "ShoppingOptionsFragment";
    public UserSession A00;
    public FN8 A01;
    public FHW A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "shopping_business_settings";
    }

    public static void A00(FN8 fn8, AbstractCollection abstractCollection, int i, int i2) {
        abstractCollection.add(new C34966Faq(new ViewOnClickListenerC35689FpO(fn8, i), i2));
    }

    public static void A01(C33220El8 c33220El8) {
        ArrayList A1E = AbstractC166987dD.A1E();
        FN8 fn8 = c33220El8.A01;
        UserSession userSession = c33220El8.A00;
        C08730cb c08730cb = C17060sy.A01;
        User A01 = c08730cb.A01(userSession);
        UserSession userSession2 = fn8.A02;
        List A05 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A05 != null && A05.contains("POLICY_MIGRATION_SHOPPING_SETTINGS")) {
            A00(fn8, A1E, 19, 2131974003);
        }
        List A052 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A052 != null && A052.contains("DOMAIN_CHANGE_SHOPPING_SETTINGS")) {
            A00(fn8, A1E, 20, 2131974007);
        }
        Fragment fragment = fn8.A00;
        FragmentActivity fragmentActivity = fn8.A01;
        if (AbstractC199308rX.A04(userSession2)) {
            C1XJ.A00.A0E(userSession2).A00(fragment, fragmentActivity);
        }
        List A053 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A053 != null && A053.contains("SHOP_INVENTORY_SHOPPING_SETTINGS")) {
            A00(fn8, A1E, 18, 2131974000);
            C35246Fgf.A02(A1E, 2131974001);
        }
        if (C18U.A06(C06090Tz.A05, userSession2, 36314631387941624L)) {
            A00(fn8, A1E, 24, 2131974004);
        }
        A00(fn8, A1E, 25, 2131974002);
        if (AbstractC82393m2.A00(userSession2)) {
            A1E.add(new C34966Faq(new ViewOnClickListenerC35687FpM(50, fn8, A01), 2131962404));
            String string = fragment.getString(2131965052);
            A1E.add(new C35246Fgf(AnonymousClass773.A00(AbstractC08820cl.A03(AbstractC111324zv.A00(217)), string, AbstractC31174DnI.A0w(fragment, string, 2131962399))));
        }
        List A054 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A054 != null && A054.contains("CHECKOUT_SETUP_SHOPPING_SETTINGS")) {
            C34969Fat c34969Fat = new C34969Fat(new ViewOnClickListenerC35689FpO(fn8, 21), 2131974005);
            c34969Fat.A03 = AbstractC31173DnH.A02(fragmentActivity);
            c34969Fat.A06 = fragment.getString(2131974006);
            A1E.add(c34969Fat);
        }
        List A055 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A055 != null && A055.contains("CHECKOUT_DEFERRED_PAYOUT_SHOPPING_SETTINGS")) {
            C34969Fat c34969Fat2 = new C34969Fat(new ViewOnClickListenerC35689FpO(fn8, 22), 2131973998);
            c34969Fat2.A03 = AbstractC31173DnH.A02(fragmentActivity);
            c34969Fat2.A06 = fragment.getString(2131973999);
            A1E.add(c34969Fat2);
        }
        List A056 = AbstractC33235ElU.A05(userSession2, c08730cb);
        if (A056 != null && A056.contains("CHECKOUT_UPSELL_SHOPPING_SETTINGS")) {
            C34969Fat c34969Fat3 = new C34969Fat(new ViewOnClickListenerC35689FpO(fn8, 23), 2131974005);
            c34969Fat3.A03 = AbstractC31173DnH.A02(fragmentActivity);
            c34969Fat3.A06 = fragment.getString(2131974006);
            A1E.add(c34969Fat3);
        }
        c33220El8.setItems(A1E);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC33235ElU.A08(this, interfaceC56362iU, 2131973948);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(-226012055);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        FHW fhw = new FHW(this, A0S);
        this.A02 = fhw;
        this.A01 = new FN8(this, this.A00, this, fhw);
        C0f9.A09(-604336376, A02);
    }

    @Override // X.AbstractC60672pq, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onResume() {
        int A02 = C0f9.A02(-2129169730);
        super.onResume();
        A01(this);
        AbstractC31175DnJ.A1N(this.A02.A00, "shopping_business_settings_opened");
        Context requireContext = requireContext();
        C08790ch A00 = AbstractC018607g.A00(this);
        UserSession userSession = this.A00;
        GG7 gg7 = new GG7(this, 1);
        C14360o3.A0B(userSession, 2);
        C1GJ.A00(requireContext, A00, FA5.A00(userSession, new FHT(gg7)));
        C0f9.A09(-1302382251, A02);
    }
}
