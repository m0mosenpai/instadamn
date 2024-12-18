package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PSX implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C152146sz A02;

    public PSX(Fragment fragment, UserSession userSession, C152146sz c152146sz) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = c152146sz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = this.A00;
        if (fragment.isVisible()) {
            C36780GJd c36780GJd = new C36780GJd(4);
            C28301Yr A00 = AbstractC34213F7l.A00();
            UserSession userSession = this.A01;
            A00.A01(fragment, userSession, c36780GJd).A06("ig_profile_photo_change_chaining", AbstractC149576oA.A00(userSession).A08("ig_profile_photo_change_chaining"));
            this.A02.A00 = true;
            if (C18U.A06(C06090Tz.A05, userSession, 36319716629552746L)) {
                new MWX(userSession).A01("IG_PROFILE_PHOTO_CHANGE_CHAINING");
            } else {
                InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
                A0e.E77("fx_cal_profile_photo_chaining_ac_upsell_seen", true);
                A0e.apply();
            }
            AbstractC35174FfR.A02(EnumC72435Xdf.A0K, userSession, "upsell_impressions", null, 2);
        }
    }
}
