package X;

import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.List;

/* renamed from: X.3Aw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C69623Aw {
    public final InterfaceC11380iw A00;
    public final C18920wW A01;
    public final UserSession A02;

    public C69623Aw(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A02 = userSession;
        this.A00 = interfaceC11380iw;
        this.A01 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }

    public final void A00(EnumC33481ErG enumC33481ErG, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String str8;
        Long l;
        Long l2;
        Long l3;
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "ig_shared_list_entity_tap");
        Object obj = str2;
        if (A00.isSampled()) {
            if (str2 != null) {
                List A0R = AbstractC001900j.A0R(str2, new String[]{"_"}, 0);
                obj = str2;
                if (A0R.size() > 0) {
                    obj = A0R.get(0);
                }
            }
            switch (num.intValue()) {
                case 0:
                    str8 = "cta_tap";
                    break;
                case 1:
                    str8 = "pog_tap";
                    break;
                case 2:
                    str8 = "tap";
                    break;
                case 3:
                    str8 = "view_members_tap";
                    break;
                case 4:
                    str8 = "long_press";
                    break;
                case 5:
                    str8 = "swipe";
                    break;
                case 6:
                    str8 = "right_swipe";
                    break;
                default:
                    str8 = "view_members";
                    break;
            }
            A00.AAP("action", str8);
            Long l4 = null;
            if (str != null) {
                l = AbstractC003100w.A0k(10, str);
            } else {
                l = null;
            }
            A00.A9K("media_owner_id", l);
            String str9 = (String) obj;
            if (str9 != null) {
                l2 = AbstractC003100w.A0k(10, str9);
            } else {
                l2 = null;
            }
            A00.A9K("media_id", l2);
            A00.AAP("tray_session_id", str3);
            A00.AAP("viewer_session_id", str4);
            if (str5 != null) {
                l3 = AbstractC003100w.A0k(10, str5);
            } else {
                l3 = null;
            }
            A00.A9K("audience_list_id", l3);
            A00.AAP("audience_list_name", str6);
            if (num2 != null) {
                l4 = Long.valueOf(num2.intValue());
            }
            A00.A9K("num_of_pogs_visible", l4);
            A00.AAP("tapped_entity", str7);
            A00.A8R(enumC33481ErG, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A00.Cht();
        }
    }

    public final void A01(EnumC33481ErG enumC33481ErG, String str) {
        String A00 = AbstractC111324zv.A00(2495);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A002 = c18920wW.A00(c18920wW.A00, "ig_shared_lists_impressions");
        if (A002.isSampled()) {
            A002.AAP("action", "impression");
            A002.A8R(enumC33481ErG, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A002.A9K("media_owner_id", null);
            A002.A9K("media_id", null);
            A002.AAP("tray_session_id", null);
            A002.AAP("viewer_session_id", null);
            A002.AAP("nav_chain", str);
            A002.A9K("audience_list_id", null);
            A002.AAP("audience_list_name", null);
            A002.A9K("num_of_pogs_visible", null);
            A002.AAP("tapped_entity", A00);
            A002.Cht();
        }
    }

    public final void A02(Integer num, String str, boolean z) {
        Long l;
        Integer num2;
        String str2;
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = this.A01;
        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "reel_tray_impression");
        if (A00.isSampled()) {
            if (num != null) {
                l = Long.valueOf(num.intValue());
            } else {
                l = null;
            }
            A00.A9K("tray_position", l);
            A00.AAP("tray_session_id", str);
            if (z) {
                num2 = C05F.A00;
            } else {
                num2 = C05F.A01;
            }
            if (num2.intValue() != 0) {
                str2 = "group_story_no_faceswarm_peek_nux";
            } else {
                str2 = "group_story_faceswarm_peek_nux";
            }
            A00.AAP("reel_type", str2);
            A00.A7v("is_group_story_pog", true);
            A00.Cht();
        }
    }

    public final void A03(String str, String str2) {
        A00(null, C05F.A0C, null, null, null, str, null, null, null, str2);
    }
}
