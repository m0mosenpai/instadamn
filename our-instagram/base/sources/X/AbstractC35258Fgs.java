package X;

import android.app.Activity;
import android.os.Bundle;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.nux.common.HowItWorksNuxFragment$Row;

/* renamed from: X.Fgs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35258Fgs {
    public static final void A03(Activity activity, UserSession userSession, InterfaceC1119153d interfaceC1119153d) {
        C32334EMg c32334EMg = new C32334EMg();
        C189448aO A0X = AbstractC31177DnL.A0X(userSession, false);
        A0X.A0g = activity.getString(2131968948);
        A0X.A0v = true;
        A0X.A0U = interfaceC1119153d;
        AbstractC31173DnH.A0w(activity, c32334EMg, A0X);
    }

    public static final void A04(Activity activity, UserSession userSession, Integer num, String str, String str2) {
        String str3;
        Bundle A0E = AbstractC31174DnI.A0E(userSession, 0);
        if (num.intValue() != 0) {
            str3 = "ADD_PEOPLE";
        } else {
            str3 = "CREATION";
        }
        A0E.putString("hall_pass_audience_picker_mode", str3);
        A0E.putString("hall_pass_id", str);
        A0E.putString("hall_pass_name", str2);
        A0E.putBoolean("campfire_has_story_to_share", false);
        AbstractC31177DnL.A0n(activity, A0E, userSession, ModalActivity.class, "campfire_audience_picker");
    }

    public static final void A05(Activity activity, UserSession userSession, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        AbstractC167027dH.A13(activity, str, str2);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("hall_pass_id", str);
        A0b.putString("hall_pass_name", str2);
        A0b.putBoolean("should_show_add_story_button", false);
        AbstractC31177DnL.A0n(activity, A0b, userSession, ModalActivity.class, "campfire_member_list");
    }

    public static final void A06(Activity activity, UserSession userSession, String str, String str2, boolean z) {
        AbstractC167007dF.A1E(userSession, 0, str2);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("hall_pass_id", str);
        A0b.putString("hall_pass_name", str2);
        A0b.putBoolean("should_show_add_story_button", z);
        AbstractC31177DnL.A0n(activity, A0b, userSession, ModalActivity.class, "hall_pass_member_list");
    }

    public static final EIS A00(UserSession userSession, String str) {
        return FWN.A01(userSession, str, AbstractC16960so.A1M(new HowItWorksNuxFragment$Row(2131954733, 2131954732, Integer.valueOf(R.drawable.instagram_lock_pano_outline_24), null), AbstractC31175DnJ.A0Q(2131954722, 2131954721, R.drawable.instagram_user_circle_pano_outline_24), AbstractC31175DnJ.A0Q(2131954724, 2131954723, R.drawable.instagram_eye_pano_outline_24)));
    }

    public static final void A01(Activity activity, C22P c22p, UserSession userSession, String str, String str2, boolean z, boolean z2) {
        AbstractC167017dG.A1O(userSession, str);
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(672), str);
        A0b.putString(AbstractC111324zv.A00(673), str2);
        A0b.putBoolean(AbstractC111324zv.A00(674), z2);
        A0b.putBoolean(AbstractC111324zv.A00(675), z);
        A0b.putSerializable(AbstractC111324zv.A00(671), c22p);
        AbstractC31173DnH.A0v(activity, A0b, userSession, TransparentModalActivity.class, AbstractC111324zv.A00(2968));
    }

    public static final void A02(Activity activity, UserSession userSession, InterfaceC37173GZk interfaceC37173GZk, String str, String str2) {
        EOS A00 = F84.A00(userSession, interfaceC37173GZk, str, str2, AbstractC167017dG.A1a(userSession, activity));
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        A0y.A0U = A00;
        A0y.A0T = A00;
        AbstractC31173DnH.A0w(activity, A00, A0y);
    }

    public static final void A07(C22P c22p, AbstractC59962oe abstractC59962oe, UserSession userSession, String str, String str2) {
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString(AbstractC111324zv.A00(672), str);
        A0b.putString(AbstractC111324zv.A00(673), str2);
        A0b.putBoolean(AbstractC111324zv.A00(674), false);
        A0b.putBoolean(AbstractC111324zv.A00(675), true);
        A0b.putSerializable(AbstractC111324zv.A00(671), c22p);
        AbstractC31173DnH.A0Z(abstractC59962oe.getRootActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(2968)).A0D(abstractC59962oe, 73438);
    }

    public static final void A08(UserSession userSession, EOS eos, BottomSheetFragment bottomSheetFragment, String str, String str2) {
        Bundle A0C = AbstractC31177DnL.A0C(userSession);
        AbstractC60492pY.A03(A0C, userSession);
        A0C.putString("hall_pass_id", str);
        A0C.putString("hall_pass_primary_button_text", str2);
        EIH eih = new EIH();
        eih.setArguments(A0C);
        eih.A00 = eos;
        C189478aR c189478aR = bottomSheetFragment.A02;
        if (c189478aR != null) {
            c189478aR.A0F(eih, AbstractC25225BEi.A0y(userSession));
        }
    }
}
