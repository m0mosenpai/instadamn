package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.AutoLaunchReelParams;
import com.instagram.user.model.User;

/* renamed from: X.P6s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56498P6s implements InterfaceC156026zW {
    public final Context A00;
    public final UserSession A01;
    public final AutoLaunchReelParams A02;
    public final User A03;

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return "highlights";
    }

    @Override // X.InterfaceC156026zW
    public final String BN1() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final EnumC125765mR BiA() {
        return null;
    }

    @Override // X.InterfaceC156026zW
    public final void Dro(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final void Drp() {
    }

    @Override // X.InterfaceC156026zW
    public final void Drv(boolean z) {
    }

    @Override // X.InterfaceC156026zW
    public final InterfaceC152836uD AMq(boolean z) {
        UserSession userSession = this.A01;
        User user = this.A03;
        AutoLaunchReelParams autoLaunchReelParams = this.A02;
        Bundle A08 = MSX.A08(userSession);
        A08.putString("viewed_user_id", user.getId());
        A08.putBoolean("has_highlights", user.A1n());
        A08.putParcelable("ARGS_AUTO_LAUNCH_REEL_PARAMS", autoLaunchReelParams);
        C52167N6w c52167N6w = new C52167N6w();
        c52167N6w.setArguments(A08);
        return c52167N6w;
    }

    @Override // X.InterfaceC156026zW
    public final String C4o() {
        return "profile_highlights";
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return "tap_highlights_tab";
    }

    public C56498P6s(Context context, UserSession userSession, AutoLaunchReelParams autoLaunchReelParams, User user) {
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = user;
        this.A02 = autoLaunchReelParams;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        AbstractC167017dG.A1N(viewGroup, str);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A00;
        Drawable drawable = context.getDrawable(R.drawable.instagram_story_highlight_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(R.drawable.instagram_story_highlight_pano_filled_24));
        A00.setTitle(AbstractC166997dE.A0p(context, 2131970167));
        View view = A00.getView();
        view.setContentDescription(AbstractC166997dE.A0p(context, 2131970167));
        return view;
    }
}
