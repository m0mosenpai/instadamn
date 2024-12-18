package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;

/* renamed from: X.24r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C448724r extends C22F {
    public final void A0R(EnumC114925Hg enumC114925Hg, AnonymousClass249 anonymousClass249, Boolean bool, String str, String str2, String str3) {
        C22M c22m = this.A04;
        c22m.A0U = UUID.randomUUID().toString();
        c22m.A0X.clear();
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A2X, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_OPEN_STICKER_TRAY");
            String str4 = c22m.A0L;
            if (str4 == null) {
                str4 = "";
            }
            A00.AAP("camera_session_id", str4);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(EnumC50631MWs.A0I, "surface");
            A00.AAP("module", C22F.A08.getModuleName());
            A00.AAP("sticker_tray_entry_point", str);
            if (enumC114925Hg == null) {
                enumC114925Hg = A0J();
            }
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.AAk("camera_tools_struct", A0N(0));
            A00.A8R(anonymousClass249, "media_type");
            UserSession userSession = this.A03;
            A00.A7v("is_organic_product_tagging_eligible_user", Boolean.valueOf(AbstractC199308rX.A05(userSession, false)));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(this.A00, userSession), "system_info");
            A00.A7v("is_panavision", Boolean.valueOf(c22m.A0W));
            A00.A7v("ads_mode_boost_story_enabled", bool);
            A00.AAP("ads_mode_error_id", str2);
            A00.AAP("ads_mode_error_message", str3);
            A00.Cht();
        }
    }

    public final void A0T(C22P c22p, String str, String str2) {
        C14360o3.A0B(c22p, 2);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            A00.A8R(C81X.A1H, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_INVITE_COLLABORATOR_TAP");
            C22M c22m = this.A04;
            String str3 = c22m.A0L;
            if (str3 == null) {
                str3 = "";
            }
            A00.AAP("camera_session_id", str3);
            A00.AAP("camera_session_id", str);
            A00.A8R(A0J(), "camera_destination");
            A00.A8R(A0I(), "capture_type");
            A00.A8R(c22p, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("module", str2);
            A00.A8R(EnumC50631MWs.A0L, "surface");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.Cht();
        }
    }

    @Deprecated(message = "Use logPublishScreenToolTap instead")
    public final void A0U(EnumC53380NjV enumC53380NjV, EnumC50631MWs enumC50631MWs, String str) {
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled() && A0J() != null) {
            A00.A8R(C81X.A2l, "tool_type");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_CLIPS_SHARE_SHEET_ENTITY_TAP");
            C22M c22m = this.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(A0J(), "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", str);
            A00.A8R(enumC53380NjV, "share_sheet_entity");
            A00.A8R(enumC50631MWs, "surface");
            A00.A8R(A0I(), "capture_type");
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(this.A00, this.A03), "system_info");
            A00.Cht();
        }
    }

    public final void A0V(EnumC53380NjV enumC53380NjV, C81X c81x, String str, boolean z) {
        C14360o3.A0B(c81x, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        EnumC114925Hg A0J = A0J();
        if (A00.isSampled() && A0J != null) {
            A00.A8R(c81x, "tool_type");
            C22M c22m = this.A04;
            String str2 = c22m.A0L;
            if (str2 == null) {
                str2 = "";
            }
            A00.AAP("camera_session_id", str2);
            A00.A8R(A0J, "camera_destination");
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(EnumC50631MWs.A0L, "surface");
            A00.A8R(A0I(), "capture_type");
            A00.A8p("event_type", 2);
            A00.A8R(c22m.A0A, "media_type");
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            A00.AAQ(AbstractC449424y.A07(this.A00, this.A03), "system_info");
            if (z || enumC53380NjV != null) {
                A00.AAP("legacy_falco_event_name", str);
                if (enumC53380NjV != null) {
                    A00.A8R(enumC53380NjV, "share_sheet_entity");
                }
            }
            A00.Cht();
        }
    }

    public final void A0S(EnumC114925Hg enumC114925Hg, EnumC203578zI enumC203578zI, C81W c81w, List list, int i, int i2) {
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_camera_ui_tool_click");
        if (A00.isSampled()) {
            ArrayList A0N = A0N(i2);
            C81X c81x = c81w.A00;
            C22M c22m = this.A04;
            C1810981l c1810981l = c22m.A0E;
            if (c1810981l != null) {
                A0N.add(C22F.A0E(c81w, c1810981l, i2));
            }
            A00.A8R(c81x, "tool_type");
            A00.A8R(enumC203578zI, "surface_element");
            A00.AAP("legacy_falco_event_name", "IG_CAMERA_SELECT_TOOL");
            String str = c22m.A0L;
            if (str == null) {
                str = "";
            }
            A00.AAP("camera_session_id", str);
            A00.A8R(c22m.A09, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.A8p("event_type", 2);
            A00.AAP("module", C22F.A08.getModuleName());
            A00.A8R(c22m.A0C, "surface");
            A00.A8R(enumC114925Hg, "camera_destination");
            A00.A8R(c81x, "camera_tool");
            A00.AAk("camera_tools_struct", A0N);
            A00.A9K("selected_index", Long.valueOf(i));
            A00.AAP("nav_chain", C1QM.A00.A02.A00);
            EnumC174597pt enumC174597pt = c22m.A06;
            if (enumC174597pt != null) {
                A00.A8R(enumC174597pt, "folding_state");
            }
            if (list != null) {
                A00.AAk("creative_tool_source", list);
            }
            A00.Cht();
        }
    }
}
