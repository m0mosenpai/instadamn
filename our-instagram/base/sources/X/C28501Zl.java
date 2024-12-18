package X;

import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.avatar.stickers.intf.DirectAvatarTrayFragmentConfig;
import com.instagram.direct.messagethread.nullstate.threaddata.theme.ThemeViewModelDelegate;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1Zl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28501Zl {
    public final EEG A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        String moduleName = interfaceC11380iw.getModuleName();
        C14360o3.A0B(moduleName, 3);
        EEG eeg = new EEG();
        Bundle A00 = AbstractC61636Rr0.A00(new C09530e4("preview_url", str), new C09530e4("has_avatar", Boolean.valueOf(z2)), new C09530e4("is_sender", Boolean.valueOf(z)), new C09530e4("is_from_nux", Boolean.valueOf(z3)), new C09530e4("sticker_template_id", null), new C09530e4("args_editor_logging_surface", "ig_direct_thread"), new C09530e4("args_editor_logging_mechanism", "ig_direct_thread_sticker_tray"), new C09530e4("args_previous_module_name", moduleName), new C09530e4("args_is_restricted_logging", Boolean.valueOf(z4)));
        AbstractC60492pY.A04(A00, userSession);
        eeg.setArguments(A00);
        return eeg;
    }

    public final C32282EJt A03(C35003Fba c35003Fba, String str, String str2, java.util.Set set, boolean z) {
        C14360o3.A0B(c35003Fba, 1);
        C14360o3.A0B(set, 2);
        C32282EJt c32282EJt = new C32282EJt();
        c32282EJt.A0C.addAll(set);
        C32282EJt.A02(c32282EJt, c35003Fba);
        Bundle bundle = new Bundle();
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_ID", str);
        bundle.putString(AbstractC31670Dva.A00(), str2);
        bundle.putBoolean("is_public_channel", z);
        c32282EJt.setArguments(bundle);
        return c32282EJt;
    }

    public final KDM A04(UserSession userSession, ThemeViewModelDelegate themeViewModelDelegate, C3o9 c3o9, String str, int i, int i2, boolean z, boolean z2, boolean z3) {
        C14360o3.A0B(themeViewModelDelegate, 1);
        C14360o3.A0B(c3o9, 2);
        Bundle bundle = new Bundle();
        bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_CURRENT_THEME", themeViewModelDelegate);
        if (c3o9 instanceof Parcelable) {
            bundle.putParcelable("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_KEY", (Parcelable) c3o9);
        }
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THREAD_SUBTYPE", i);
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_INTEROP_THREAD", z);
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IN_SHH_MODE", z2);
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_INSTAMADILLO_CUTOVER", z3);
        bundle.putInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_AUDIENCE_TYPE", i2);
        bundle.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_IN_ACCOUNT_THEME_PICKER_MODE", false);
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THEME_PICKER_ENTRYPOINT", str);
        bundle.putString("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_ACCOUNT_THEME_PICKER_ENTRYPOINT", null);
        AbstractC03240Dh.A00(bundle, userSession);
        KDM kdm = new KDM();
        kdm.setArguments(bundle);
        return kdm;
    }

    public final KD8 A05(UserSession userSession, DirectShareTarget directShareTarget, int i, int i2, boolean z, boolean z2) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(directShareTarget, 1);
        KD8 kd8 = new KD8();
        Bundle A00 = AbstractC61636Rr0.A00(new C09530e4("bundle_extra_share_target", directShareTarget), new C09530e4("bottom_sheet_top_y", Integer.valueOf(i)), new C09530e4("bottom_sheet_bottom_y", Integer.valueOf(i2)), new C09530e4("should_show_back_button", Boolean.valueOf(z)), new C09530e4("should_show_drag_handle", Boolean.valueOf(z2)));
        AbstractC03240Dh.A00(A00, userSession);
        kd8.setArguments(A00);
        return kd8;
    }

    public final C34725FRo A06(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(interfaceC11380iw, 1);
        C34725FRo c34725FRo = new C34725FRo();
        Bundle bundle = c34725FRo.A01;
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        bundle.putString("DirectReplyModalFragment.source_module_name", interfaceC11380iw.getModuleName());
        c34725FRo.A01(str);
        return c34725FRo;
    }

    public final C34726FRp A07(InterfaceC11380iw interfaceC11380iw, UserSession userSession, C2EY c2ey) {
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(c2ey, 1);
        C14360o3.A0B(interfaceC11380iw, 2);
        return new C34726FRp(userSession, c2ey, interfaceC11380iw.getModuleName());
    }

    public final C34726FRp A08(UserSession userSession, C2EY c2ey, String str) {
        C14360o3.A0B(userSession, 0);
        return new C34726FRp(userSession, c2ey, str);
    }

    public final C45446KAh A01(UserSession userSession, DirectAvatarTrayFragmentConfig directAvatarTrayFragmentConfig, MQX mqx, EnumC46186KcO enumC46186KcO, DirectThreadKey directThreadKey, String str, List list, boolean z) {
        List list2 = list;
        C14360o3.A0B(userSession, 0);
        C14360o3.A0B(enumC46186KcO, 2);
        C45446KAh c45446KAh = new C45446KAh();
        C09530e4 c09530e4 = new C09530e4("IgSessionManager.SESSION_TOKEN_KEY", userSession.token);
        C09530e4 c09530e42 = new C09530e4("args_previous_module_name", "ig_direct_thread");
        C09530e4 c09530e43 = new C09530e4("args_tray_config", directAvatarTrayFragmentConfig);
        C09530e4 c09530e44 = new C09530e4("args_entrypoint", enumC46186KcO);
        if (list == null) {
            list2 = C16930sl.A00;
        }
        c45446KAh.setArguments(AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4("args_social_stickers_user_ids", new ArrayList(list2)), new C09530e4("args_is_msys_thread", Boolean.valueOf(z)), new C09530e4("args_thread_key", directThreadKey), new C09530e4("args_logging_session_id", str)));
        c45446KAh.A00 = mqx;
        return c45446KAh;
    }

    public final KCJ A02(String str, String str2) {
        KCJ kcj = new KCJ();
        Bundle bundle = new Bundle();
        bundle.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, str);
        bundle.putString("saved_reply_id", str2);
        kcj.setArguments(bundle);
        return kcj;
    }

    public final JR3 A09(String str, String str2, boolean z) {
        JR3 jr3 = new JR3();
        Bundle bundle = new Bundle();
        if (str2 != null) {
            bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", str2);
        }
        if (str != null) {
            bundle.putString("DirectFragment.TRIGGER_ACTION", str);
        }
        bundle.putBoolean("direct_inbox_fragment_is_main_tab", z);
        jr3.setArguments(bundle);
        return jr3;
    }
}
