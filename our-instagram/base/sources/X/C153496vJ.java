package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6vJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C153496vJ implements InterfaceC156026zW {
    public boolean A00 = true;
    public InterfaceC154386wo A01;
    public final Context A02;
    public final UserSession A03;
    public final User A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public C153496vJ(Context context, UserSession userSession, User user, String str, String str2, String str3, String str4) {
        this.A02 = context;
        this.A03 = userSession;
        this.A04 = user;
        this.A06 = str;
        this.A07 = str2;
        this.A08 = str3;
        this.A05 = str4;
    }

    @Override // X.InterfaceC156026zW
    public final View ANH(ViewGroup viewGroup, String str, int i) {
        C14360o3.A0B(viewGroup, 0);
        C14360o3.A0B(str, 1);
        InterfaceC154386wo A00 = AbstractC154376wm.A00(viewGroup, str, i);
        Context context = this.A02;
        Drawable drawable = context.getDrawable(R.drawable.instagram_reels_pano_outline_24);
        if (drawable != null) {
            A00.setIcon(drawable);
        }
        A00.setActiveIcon(context.getDrawable(R.drawable.instagram_reels_pano_filled_24));
        String string = context.getString(2131955686);
        C14360o3.A07(string);
        A00.setTitle(string);
        View view = A00.getView();
        String string2 = context.getString(2131955686);
        C14360o3.A07(string2);
        view.setContentDescription(string2);
        this.A01 = A00;
        return view;
    }

    @Override // X.InterfaceC156026zW
    public final String Abf() {
        return "clips";
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
    public final String C4o() {
        return "profile_clips";
    }

    @Override // X.InterfaceC156026zW
    public final String C4q() {
        return "tap_clips_tab";
    }

    @Override // X.InterfaceC156026zW
    public final InterfaceC152836uD AMq(boolean z) {
        UserSession userSession = this.A03;
        User user = this.A04;
        String str = this.A06;
        String str2 = this.A07;
        String str3 = this.A08;
        String str4 = this.A05;
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("ClipsProfileTabFragment.ARGS_PROFILE_USER_ID", user.getId());
        bundle.putString("source_media_id", str);
        bundle.putString("source_ranking_info_token", str2);
        bundle.putBoolean("is_profile_side_panel", z);
        bundle.putString("profile_starting_tab", str3);
        bundle.putBoolean("is_group_profile", false);
        bundle.putString("from_module", str4);
        C153506vL c153506vL = new C153506vL();
        c153506vL.setArguments(bundle);
        return c153506vL;
    }

    @Override // X.InterfaceC156026zW
    public final void Dro(boolean z) {
        InterfaceC154386wo interfaceC154386wo;
        if (z) {
            UserSession userSession = this.A03;
            if (C18U.A06(C06090Tz.A05, userSession, 36330905018582087L) && (interfaceC154386wo = this.A01) != null) {
                Context context = this.A02;
                interfaceC154386wo.setEndIcon(context.getDrawable(R.drawable.instagram_chevron_up_pano_filled_12));
                String string = context.getString(2131955681);
                C14360o3.A07(string);
                C199928sw c199928sw = new C199928sw(null, null, null, new C70937Wkg(this), null, string, 0, 0, 0, false, false, this.A00, true, false, false, false);
                String string2 = context.getString(2131955682);
                C14360o3.A07(string2);
                C199928sw c199928sw2 = new C199928sw(null, null, null, new C70938Wkh(this), null, string2, 0, 0, 0, false, false, !this.A00, true, false, false, false);
                C8QJ c8qj = new C8QJ(context, userSession, null, false);
                c8qj.A02(AbstractC16960so.A1Q(c199928sw, c199928sw2));
                c8qj.setOnDismissListener(new WP3(interfaceC154386wo, this));
                c8qj.A01(interfaceC154386wo.getView());
            }
        }
    }

    @Override // X.InterfaceC156026zW
    public final void Drp() {
        InterfaceC154386wo interfaceC154386wo = this.A01;
        if (interfaceC154386wo != null) {
            interfaceC154386wo.setEndIcon(null);
        }
    }

    @Override // X.InterfaceC156026zW
    public final void Drv(boolean z) {
        InterfaceC154386wo interfaceC154386wo;
        if (C18U.A06(C06090Tz.A05, this.A03, 36330905018582087L) && (interfaceC154386wo = this.A01) != null) {
            interfaceC154386wo.setEndIcon(this.A02.getDrawable(R.drawable.instagram_chevron_down_pano_filled_12));
        }
    }
}
