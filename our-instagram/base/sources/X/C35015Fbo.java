package X;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import org.webrtc.CameraEnumerationAndroid;

/* renamed from: X.Fbo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35015Fbo {
    public static final C35188Ffg A00 = new Object();

    public final void A00(Context context, EnumC1579076z enumC1579076z, EnumC33464Eqz enumC33464Eqz, C18920wW c18920wW, UserSession userSession, User user, InterfaceC37213GaO interfaceC37213GaO, EnumC33371Ep4 enumC33371Ep4, InterfaceC37142GYd interfaceC37142GYd, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        AbstractC167017dG.A1Q(context, str);
        C35188Ffg.A01(context, enumC1579076z, enumC33464Eqz, c18920wW, userSession, null, null, user, interfaceC37213GaO, enumC33371Ep4, interfaceC37142GYd, str, str2, null, false);
    }

    public final void A01(Fragment fragment, C18920wW c18920wW, UserSession userSession, User user) {
        Context context;
        Drawable drawable;
        if (fragment.isAdded() && (context = fragment.getContext()) != null && (drawable = context.getDrawable(R.drawable.restrict_snackbar_icon)) != null && !user.CQf() && (!user.isRestricted()) && 3 > AbstractC31172DnG.A01(AbstractC166987dD.A0x(userSession), "restrict_block_upsell_snackbar_shown_count")) {
            drawable.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
            C146106i8 A0K = AbstractC31171DnF.A0K();
            AbstractC25226BEj.A1N(context, A0K, 2131972507);
            A0K.A04 = drawable;
            A0K.A02();
            AbstractC31175DnJ.A0l(context, A0K, 2131965052);
            A0K.A0A(new C36523G8v(2, userSession, fragment, c18920wW, user));
            A0K.A0L = true;
            A0K.A01 = CameraEnumerationAndroid.AnonymousClass1.MIN_FPS_THRESHOLD;
            AbstractC25233BEq.A1F(A0K);
        }
    }
}
