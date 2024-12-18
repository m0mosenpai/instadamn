package X;

import android.app.Activity;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public abstract class CJA {
    public static final void A00(Activity activity, EnumC33510Erj enumC33510Erj, UserSession userSession, boolean z, boolean z2) {
        String string;
        boolean A1b = AbstractC25233BEq.A1b(userSession, activity, enumC33510Erj);
        C189448aO A0y = AbstractC25225BEi.A0y(userSession);
        AbstractC25225BEi.A1Q(A0y, A1b);
        A0y.A03 = 0.7f;
        A0y.A0x = A1b;
        if (enumC33510Erj.ordinal() == 16 && (string = activity.getResources().getString(2131974652)) != null) {
            A0y.A0d = string;
            A0y.A0D = R.style.PrivacyTextStyle;
        }
        boolean A01 = C54P.A01(activity, userSession);
        C189478aR A00 = A0y.A00();
        String obj = enumC33510Erj.toString();
        C14360o3.A0B(obj, 0);
        C26838Bt0 c26838Bt0 = new C26838Bt0();
        c26838Bt0.setArguments(AbstractC167027dH.A09(AbstractC111324zv.A00(1036), Boolean.valueOf(A01), AbstractC166987dD.A1L("invite_location", obj), AbstractC166987dD.A1L(AbstractC111324zv.A00(1267), Boolean.valueOf(z)), AbstractC166987dD.A1L("is_photo_enabled", Boolean.valueOf(z2))));
        A00.A02(activity, c26838Bt0);
    }
}
