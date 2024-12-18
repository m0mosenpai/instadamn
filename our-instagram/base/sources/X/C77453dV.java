package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.reshare.model.ClipsCelebrationReshareViewModel;
import com.instagram.modal.ModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.3dV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C77453dV {
    public static boolean A00 = true;
    public static int A01;
    public static C54971OTd A02;
    public static C65972yZ A03;
    public static boolean A04;
    public static final C77453dV A05 = new Object();

    public static final void A02(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, ClipsCelebrationReshareViewModel clipsCelebrationReshareViewModel, C38321qM c38321qM, String str, boolean z) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(activity, 1);
        C14360o3.A0B(fragment, 2);
        C14360o3.A0B(c38321qM, 3);
        C23096AGg.A00.A00(activity, fragment, c22p, userSession, null, clipsCelebrationReshareViewModel, c38321qM, str, z);
    }

    public static final void A03(Activity activity, Fragment fragment, C22P c22p, UserSession userSession, C5JK c5jk, PendingRecipient pendingRecipient, String str, boolean z) {
        C19L A022;
        C14360o3.A0B(activity, 0);
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        if (fragment != null) {
            A022 = C07Y.A00(fragment.getViewLifecycleOwner());
        } else {
            A022 = AnonymousClass194.A02(C12L.A00.AOT(1566600651, 3));
        }
        AbstractC23641Du.A05(AnonymousClass191.A00, new B5c(activity, c22p, userSession, c5jk, pendingRecipient, str, null, z), A022);
    }

    public static final void A04(Activity activity, Fragment fragment, UserSession userSession, PendingRecipient pendingRecipient, String str, String str2, boolean z, boolean z2) {
        C19L A022;
        C14360o3.A0B(userSession, 2);
        C14360o3.A0B(str, 3);
        if (fragment != null) {
            A022 = C07Y.A00(fragment.getViewLifecycleOwner());
        } else {
            A022 = AnonymousClass194.A02(C12L.A00.AOT(1566600651, 3));
        }
        MB2 mb2 = new MB2(activity, fragment, userSession, pendingRecipient, str, str2, null, z, z2);
        AbstractC23641Du.A03(C05F.A00, AnonymousClass191.A00, mb2, A022);
    }

    public static final void A06(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, int i) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(fragmentActivity, 1);
        C14360o3.A0B(clipsViewerConfig, 2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "clips_feed_viewer");
        c6xj.A0H = !C18U.A06(C06090Tz.A05, userSession, 36317534785705304L);
        c6xj.A08();
        c6xj.A0A(fragmentActivity, i);
    }

    public final void A09(UserSession userSession, Context context, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(context, 1);
        C14360o3.A0B(str, 2);
        if (C18U.A06(C06090Tz.A05, userSession, 36328151946575108L) && str.equals(ClipsPrefetchTriggerType.A05.A00) && A01 > 0) {
            return;
        }
        C5R5 A012 = A01(ClipsViewerSource.A0g, userSession, "clips_viewer_clips_tab");
        boolean z = !A00;
        boolean z2 = A04;
        if (!(A012 instanceof C5R4)) {
            return;
        }
        ((C5R4) A012).AQ9(context, userSession, "clips_viewer_clips_tab", str, z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5 A[LOOP:1: B:28:0x00af->B:30:0x00b5, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle A00(X.C22P r76, com.instagram.common.session.UserSession r77, com.instagram.music.common.config.MusicAttributionConfig r78, com.instagram.pendingmedia.model.recipients.PendingRecipient r79, java.lang.String r80, java.lang.String r81, java.lang.String r82, java.util.List r83, boolean r84, boolean r85) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77453dV.A00(X.22P, com.instagram.common.session.UserSession, com.instagram.music.common.config.MusicAttributionConfig, com.instagram.pendingmedia.model.recipients.PendingRecipient, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public static final C5R5 A01(ClipsViewerSource clipsViewerSource, UserSession userSession, String str) {
        return AbstractC116935Qz.A00(null, new C116915Qx(), new C116875Qr(clipsViewerSource, userSession).A00(), userSession, null, null, new C5Qu(userSession), null, str, null);
    }

    public static final void A05(Fragment fragment, ClipsViewerConfig clipsViewerConfig, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        C6XJ c6xj = new C6XJ(fragment.requireActivity(), bundle, userSession, ModalActivity.class, "clips_feed_viewer");
        c6xj.A0H = !C18U.A06(C06090Tz.A05, userSession, 36317534785705304L);
        c6xj.A08();
        c6xj.A0D(fragment, 9689);
    }

    public static final void A07(FragmentActivity fragmentActivity, ClipsViewerConfig clipsViewerConfig, UserSession userSession, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ClipsViewerLauncher.KEY_CONFIG", clipsViewerConfig);
        if (z) {
            C6XJ c6xj = new C6XJ(fragmentActivity, bundle, userSession, ModalActivity.class, "clips_feed_viewer");
            c6xj.A0H = !C18U.A06(C06090Tz.A05, userSession, 36317534785705304L);
            if (z2) {
                c6xj.A0J = ModalActivity.A08;
            } else {
                c6xj.A08();
            }
            c6xj.A0C(fragmentActivity);
            return;
        }
        C140966Yy c140966Yy = new C140966Yy(fragmentActivity, userSession);
        C59952od c59952od = new C59952od();
        Bundle bundle2 = new Bundle();
        bundle2.putString("media_list", clipsViewerConfig.A0x);
        c59952od.EU2(bundle2);
        c140966Yy.A0B(bundle, c59952od);
        if (clipsViewerConfig.A27) {
            c140966Yy.A0E = true;
        } else if (!clipsViewerConfig.A1l) {
            if (clipsViewerConfig.A1X) {
                c140966Yy.A0H = true;
            } else {
                c140966Yy.A08();
            }
        }
        if ((!C18U.A06(C06090Tz.A05, userSession, 36317478950868170L) || C06P.A01(c140966Yy.A06)) && fragmentActivity.getLifecycle().A07().A00(C07S.INITIALIZED)) {
            if (clipsViewerConfig.A1l) {
                c140966Yy.A03();
                return;
            } else {
                c140966Yy.A04();
                return;
            }
        }
        C0f5 AEp = C18950wb.A01.AEp("ClipsPluginImpl", 817905066);
        AEp.ABW("Clips navigation", "Prevent navigation to the clips fragment if the activity is in the process of being destroyed");
        AEp.report();
    }

    public static final void A08(UserSession userSession, InterfaceC60442pS interfaceC60442pS) {
        C54971OTd c54971OTd;
        if ((interfaceC60442pS != null && C18U.A06(C06090Tz.A05, userSession, 36314837546765137L)) || (c54971OTd = A02) == null) {
            return;
        }
        C41451vu.A01.E4s(new C3KI(c54971OTd));
        A02 = null;
    }
}
