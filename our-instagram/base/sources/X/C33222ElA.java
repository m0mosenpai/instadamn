package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

/* renamed from: X.ElA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33222ElA extends AbstractC33235ElU implements InterfaceC60122ou {
    public static final String __redex_internal_original_name = "SecurityOptionsFragment";
    public UserSession A00;
    public E5C A01;
    public FLI A02;

    @Override // X.InterfaceC11380iw
    public final String getModuleName() {
        return "security_options";
    }

    public static GHY A00(Context context, FLI fli, int i, int i2) {
        return new GHY(context, new ViewOnClickListenerC35689FpO(fli, i), i2);
    }

    public static void A01(C33222ElA c33222ElA) {
        FragmentActivity fragmentActivity;
        int i;
        int i2;
        User user;
        ArrayList A1E = AbstractC166987dD.A1E();
        FLI fli = c33222ElA.A02;
        C31335Dq0.A03(A1E, 2131973588);
        UserSession userSession = fli.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36314352214608406L)) {
            fragmentActivity = fli.A00;
            i = 2131963157;
            i2 = 47;
        } else {
            AccountFamily A0H = AbstractC31176DnK.A0H(C2049995m.A01(userSession), userSession);
            if (A0H != null && (user = A0H.A01) != null && user.A03.BCL() == HasPasswordState.A04 && C1AD.A06(c06090Tz, 18296612220567962L)) {
                fragmentActivity = fli.A00;
                i = 2131956971;
                i2 = 48;
            } else {
                boolean A1a = AbstractC31172DnG.A1a(AbstractC31174DnI.A0f(), "has_one_clicked_logged_in");
                fragmentActivity = fli.A00;
                i = 2131963157;
                i2 = 50;
                if (A1a) {
                    i2 = 49;
                }
            }
        }
        GHY A00 = A00(fragmentActivity, fli, i2, i);
        A00.A03 = R.drawable.instagram_key_pano_outline_24;
        A1E.add(A00);
        GHY A002 = A00(fragmentActivity, fli, 53, 2131965727);
        A002.A03 = R.drawable.instagram_location_pano_outline_24;
        A1E.add(A002);
        GHY A003 = A00(fragmentActivity, fli, 51, 2131966019);
        A003.A03 = R.drawable.instagram_keyhole_pano_outline_24;
        A1E.add(A003);
        GHY A004 = A00(fragmentActivity, fli, 52, 2131965774);
        A004.A03 = R.drawable.instagram_authentication_pano_outline_24;
        A1E.add(A004);
        GHY A005 = A00(fragmentActivity, fli, 54, 2131961716);
        A005.A03 = R.drawable.instagram_mail_pano_outline_24;
        A1E.add(A005);
        GHY A006 = A00(fragmentActivity, fli, 45, 2131973154);
        A006.A03 = R.drawable.instagram_shield_pano_outline_24;
        A1E.add(A006);
        C35119FeM.A00(A1E, true);
        C31335Dq0.A03(A1E, 2131973574);
        GHY A007 = A00(fragmentActivity, fli, 46, 2131953127);
        A007.A03 = R.drawable.instagram_device_mixed_pano_outline_24;
        A1E.add(A007);
        c33222ElA.setItems(A1E);
    }

    @Override // X.InterfaceC60122ou
    public final void configureActionBar(InterfaceC56362iU interfaceC56362iU) {
        AbstractC33235ElU.A08(this, interfaceC56362iU, 2131973165);
    }

    @Override // X.AbstractC59962oe
    public final AbstractC18680vv getSession() {
        return this.A00;
    }

    @Override // X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 7 && intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("password_updated_key", false)) {
            A01(this);
        }
    }

    @Override // X.AbstractC33235ElU, X.AbstractC60672pq, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        int A02 = C0f9.A02(1762878008);
        super.onCreate(bundle);
        UserSession A0S = AbstractC31176DnK.A0S(this);
        this.A00 = A0S;
        this.A02 = new FLI(A0S, this);
        C0f9.A09(-608960045, A02);
    }

    @Override // X.AbstractC33235ElU, X.AbstractC59962oe, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C907442n c907442n = new C907442n(AbstractC25225BEi.A0b(), E5E.class, "FxSettingsSecurityTransition", false);
        UserSession userSession = this.A00;
        C14360o3.A0B(userSession, 0);
        C31702Dw7.A00(this, AbstractC31178DnM.A0H(c907442n, userSession), 46);
        A01(this);
        C006802i c006802i = C006802i.A0p;
        c006802i.markerAnnotate(857808781, "node_identifier", "security_and_login");
        c006802i.markerEnd(857808781, (short) 2);
        C19270xB A0D = AbstractC31171DnF.A0D("contact_point_update");
        C37091o7.A00().Cof(requireContext(), A0D, this.A00, EnumC39589Hdz.A0P);
    }
}
