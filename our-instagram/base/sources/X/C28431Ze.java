package X;

import android.R;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.facebook.systrace.Systrace;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.1Ze, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28431Ze {
    public final Context A00;

    public final Bundle A01(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        C14360o3.A0B(userSession, 0);
        A00(userSession, userDetailLaunchConfig);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfileLaunchConstants.LAUNCH_CONFIG", userDetailLaunchConfig);
        return bundle;
    }

    public final Fragment A02(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        C207849Hq c207849Hq;
        InterfaceC018407e interfaceC018407e;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(userDetailLaunchConfig, 1);
        boolean z = userDetailLaunchConfig.A0Z;
        C2ZI c2zi = C2ZI.A00;
        if (z) {
            c2zi.A0D("self_profile", "profileFactoryNewSelfFragment", false);
        } else {
            c2zi.A0D("profile", "profileFactoryNewOtherFragment", true);
        }
        synchronized (C207849Hq.A02) {
            c207849Hq = C207849Hq.A01;
            if (c207849Hq == null) {
                c207849Hq = new C207849Hq();
                C207849Hq.A01 = c207849Hq;
            }
        }
        String str = userDetailLaunchConfig.A0A;
        C14360o3.A0B(str, 0);
        Map map = c207849Hq.A00;
        Integer valueOf = Integer.valueOf(R.xml.bookmarks);
        if (map.containsKey(valueOf)) {
            if (map.remove(valueOf) != null) {
                C006802i.A0p.markerEnd(R.xml.bookmarks, (short) 111);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        map.put(valueOf, new XN7());
        C006802i.A0p.markerStart(R.xml.bookmarks);
        C006802i.A0p.markerAnnotate(R.xml.bookmarks, "trigger", str);
        A00(userSession, userDetailLaunchConfig);
        Context context = this.A00;
        OUB oub = null;
        if (z) {
            if (AbstractC53242c7.A0L(context, com.facebook.R.attr.canAccessSelfProfile, true)) {
                if (userDetailLaunchConfig.A0T) {
                    interfaceC018407e = new C53I();
                } else {
                    interfaceC018407e = new C53K();
                }
                UserDetailFragment userDetailFragment = (Fragment) interfaceC018407e;
                Bundle bundle = new Bundle();
                bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userDetailLaunchConfig.A0Q);
                bundle.putParcelable("ProfileLaunchConstants.LAUNCH_CONFIG", userDetailLaunchConfig);
                userDetailFragment.setArguments(bundle);
                return userDetailFragment;
            }
        } else if (C18U.A06(C06090Tz.A05, userSession, 36328117585132730L)) {
            if (Systrace.A0E(1L)) {
                C0fO.A01("UserDetailFragmentPrimer.primeIfApplicable.prime", -1972099354);
            }
            try {
                oub = new OUB(userSession, userDetailLaunchConfig);
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-177142410);
                }
            } catch (Throwable th) {
                if (Systrace.A0E(1L)) {
                    C0fO.A00(-510638176);
                }
                throw th;
            }
        }
        if (!userDetailLaunchConfig.A0U) {
            UserDetailFragment userDetailFragment2 = new UserDetailFragment();
            userDetailFragment2.A0y = oub;
            interfaceC018407e = userDetailFragment2;
            UserDetailFragment userDetailFragment3 = (Fragment) interfaceC018407e;
            Bundle bundle2 = new Bundle();
            bundle2.putString("IgSessionManager.SESSION_TOKEN_KEY", userDetailLaunchConfig.A0Q);
            bundle2.putParcelable("ProfileLaunchConstants.LAUNCH_CONFIG", userDetailLaunchConfig);
            userDetailFragment3.setArguments(bundle2);
            return userDetailFragment3;
        }
        throw new IllegalStateException("Editing another user's profile pic is not allowed");
    }

    public final C32281EJs A05(User user, String str, String str2, String str3, boolean z, boolean z2) {
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        Bundle bundle = new Bundle();
        bundle.putString("full_name", str);
        bundle.putBoolean("is_pending_review", z);
        bundle.putBoolean("should_show_confirmation_dialog", z2);
        bundle.putString("confirmation_dialog_text", str2);
        bundle.putString("disclaimer_text", str3);
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "edit_profile");
        if (user != null) {
            bundle.putParcelable("display_user", user);
        }
        C32281EJs c32281EJs = new C32281EJs();
        c32281EJs.setArguments(bundle);
        return c32281EJs;
    }

    public final HDJ A08(EnumC33341Eoa enumC33341Eoa, Integer num, String str, String str2, boolean z) {
        String str3;
        C14360o3.A0B(str, 0);
        Bundle bundle = new Bundle();
        bundle.putString("ManageTaggedMediaFragment.USER_ID", str);
        bundle.putString("ManageTaggedMediaFragment.USERNAME", str2);
        bundle.putSerializable("ManageTaggedMediaFragment.MODE", enumC33341Eoa);
        bundle.putBoolean("ManageTaggedMediaFragment.IS_EDIT_ONLY_MODE", false);
        bundle.putBoolean("ManageTaggedMediaFragment.ARGUMENT_SHOULD_SHOW_PTE_TAGGED_SELLER_NUX", z);
        if (num != null) {
            switch (num.intValue()) {
                case 1:
                    str3 = "TAGGED_POSTS_BLOKS_SETTINGS";
                    break;
                case 2:
                    str3 = "EDIT_TAG_PROFILE";
                    break;
                case 3:
                    str3 = "PHOTOS_OF_YOU";
                    break;
                case 4:
                    str3 = "TAGGED_POSTS_NATIVE_SETTINGS";
                    break;
                case 5:
                    str3 = "YOUR_ACTIVITY_TAGS_MENU";
                    break;
                default:
                    str3 = "PENDING_TAGS_NOTIFICATION";
                    break;
            }
            bundle.putString("ManageTaggedMediaFragment.ARGUMENT_ENTRYPOINT", str3);
        }
        HDJ hdj = new HDJ();
        hdj.setArguments(bundle);
        return hdj;
    }

    public final C32259EIt A09(UserSession userSession, InterfaceC37186GZx interfaceC37186GZx, String str, String str2) {
        C14360o3.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("MuteSettingsFragment.ARG_DISPLAYED_USER_ID", str);
        bundle.putString("MuteSettingsFragment.ARG_SELECTED_FROM", str2);
        C32259EIt c32259EIt = new C32259EIt();
        c32259EIt.setArguments(bundle);
        c32259EIt.A01 = interfaceC37186GZx;
        return c32259EIt;
    }

    private final void A00(UserSession userSession, UserDetailLaunchConfig userDetailLaunchConfig) {
        EnumC2045493n enumC2045493n;
        String str = userDetailLaunchConfig.A0O;
        if (str != null) {
            C06090Tz c06090Tz = C06090Tz.A05;
            if (C18U.A06(c06090Tz, userSession, 36327597894089431L)) {
                C2045093j.A07(AbstractC2044993i.A00(userSession), str, userDetailLaunchConfig.A0C, userDetailLaunchConfig.A0A, true);
            }
            if (C18U.A06(c06090Tz, userSession, 36327597894154968L)) {
                C2045093j A00 = AbstractC2044993i.A00(userSession);
                Context context = this.A00;
                if (A00.A02) {
                    enumC2045493n = EnumC2045493n.A09;
                } else {
                    enumC2045493n = EnumC2045493n.A0B;
                }
                if (!A00.A0D(enumC2045493n, str)) {
                    C2045093j.A01(context, A00, enumC2045493n, str, true, false);
                }
            }
        }
    }

    public final C31721DwQ A04(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("edit_profile_entry", str);
        C31721DwQ c31721DwQ = new C31721DwQ();
        c31721DwQ.setArguments(bundle);
        return c31721DwQ;
    }

    public final C32278EJo A07(User user, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        String A01 = AbstractC58410Puo.A01(43, 8, 117);
        C14360o3.A0B(str, 0);
        C14360o3.A0B(str3, 5);
        C14360o3.A0B(str4, 6);
        C14360o3.A0B(user, 7);
        Bundle bundle = new Bundle();
        bundle.putString(A01, str);
        bundle.putString("trusted_username", str2);
        bundle.putInt("trusted_days", i);
        bundle.putBoolean("is_pending_review", z);
        bundle.putBoolean("should_show_confirmation_dialog", z2);
        bundle.putString("confirmation_dialog_text", str3);
        bundle.putString("disclaimer_text", str4);
        bundle.putParcelable("displayed_user", user);
        C32278EJo c32278EJo = new C32278EJo();
        c32278EJo.setArguments(bundle);
        return c32278EJo;
    }

    public C28431Ze(Context context) {
        this.A00 = context;
    }

    public final EK2 A03(String str, String str2) {
        C14360o3.A0B(str, 0);
        Bundle bundle = new Bundle();
        bundle.putString("email", str);
        bundle.putString("send_source", str2);
        EK2 ek2 = new EK2();
        ek2.setArguments(bundle);
        return ek2;
    }

    public final HighlightsMigrationFragment A06(boolean z) {
        Bundle A00 = AbstractC61636Rr0.A00(new C09530e4("ARGUMENT_NAVIGATING_FROM_FORCED_MIGRATION_BOTTOM_SHEET", Boolean.valueOf(z)));
        HighlightsMigrationFragment highlightsMigrationFragment = new HighlightsMigrationFragment();
        highlightsMigrationFragment.setArguments(A00);
        return highlightsMigrationFragment;
    }
}
