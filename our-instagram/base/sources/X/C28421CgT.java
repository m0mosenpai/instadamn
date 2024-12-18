package X;

import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.CgT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28421CgT {
    public final InterfaceC02550Ad A00;
    public final C8k A01;
    public final EnumC72434Xde A02;
    public final FoaUserSession A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Map A08;

    public C28421CgT(C8k c8k, EnumC72434Xde enumC72434Xde, FoaUserSession foaUserSession, String str, String str2, String str3, String str4, Map map) {
        C14360o3.A0B(foaUserSession, 1);
        this.A03 = foaUserSession;
        this.A06 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A08 = map;
        this.A01 = c8k;
        this.A07 = str4;
        this.A02 = enumC72434Xde;
        this.A00 = AbstractC12220kQ.A02(((IgMetaSessionImpl) foaUserSession).A00);
    }

    public static final void A01(C8o c8o, C8l c8l, EnumC53350Nj0 enumC53350Nj0, C28421CgT c28421CgT, Integer num, boolean z) {
        A00(c8o, null, null, c8l, enumC53350Nj0, c28421CgT, num, null, null, null, z);
    }

    public static final void A02(C8o c8o, C28421CgT c28421CgT) {
        A00(c8o, null, null, null, null, c28421CgT, null, null, null, null, false);
    }

    public static final void A00(C8o c8o, C8Q c8q, C8b c8b, C8l c8l, EnumC53350Nj0 enumC53350Nj0, C28421CgT c28421CgT, Integer num, Integer num2, Integer num3, JSONArray jSONArray, boolean z) {
        String str;
        EnumC33483ErI enumC33483ErI;
        Long l;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) c28421CgT.A00, AbstractC111324zv.A00(1111));
        if (A0f.isSampled()) {
            JSONObject jSONObject = new JSONObject();
            if (z) {
                jSONObject.put("has_extended_capture_photos", z);
            }
            if (num2 != null) {
                jSONObject.put("success_count", num2.intValue());
            }
            if (num3 != null) {
                jSONObject.put(AbstractC43591JPw.A00(483), num3.intValue());
            }
            if (jSONArray != null) {
                jSONObject.put("verification_results", jSONArray);
            }
            A0f.A8R(c8o, "event_type");
            A0f.AAP("surface_session_id", c28421CgT.A06);
            A0f.AAP("bottom_sheet_session_id", c28421CgT.A04);
            A0f.AAP("intent_session_id", c28421CgT.A05);
            Map map = c28421CgT.A08;
            A0f.A9M("app_context_data", map);
            String str2 = null;
            if (map != null) {
                str = (String) map.get("thread_type");
            } else {
                str = null;
            }
            A0f.AAP("thread_type", str);
            String str3 = c28421CgT.A07;
            if (str3 != null) {
                if (str3.equals("AI_BOT")) {
                    enumC33483ErI = EnumC33483ErI.AI_BOT;
                } else if (str3.equals("GROUP")) {
                    enumC33483ErI = EnumC33483ErI.GROUP;
                } else {
                    enumC33483ErI = EnumC33483ErI.ONE_TO_ONE;
                }
            } else {
                enumC33483ErI = null;
            }
            A0f.A8R(enumC33483ErI, "thread_type_enum");
            A0f.A8R(c28421CgT.A01, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0f.AAP("entry_point_string_override", null);
            A0f.A8R(c8l, MSV.A00(204));
            A0f.A8R(enumC53350Nj0, "onboarding_result");
            A0f.A8R(c8b, AbstractC43591JPw.A00(316));
            if (num != null) {
                l = AbstractC25229BEm.A0n(num);
            } else {
                l = null;
            }
            A0f.A9K("num_images_selected", l);
            A0f.A8R(c8q, "action_result");
            if (jSONObject.length() > 0) {
                str2 = jSONObject.toString();
            }
            A0f.AAP("extended_capture_extras", str2);
            A0f.A8R(c28421CgT.A02, "surface");
            A0f.AAP("surface_string_override", null);
            A0f.Cht();
        }
    }
}
