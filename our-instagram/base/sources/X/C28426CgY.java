package X;

import com.instagram.foa.session.IgMetaSessionImpl;
import com.meta.foa.session.FoaUserSession;
import java.util.LinkedHashMap;

/* renamed from: X.CgY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28426CgY {
    public final InterfaceC02550Ad A00;
    public final CWR A01;
    public final C28172CbJ A02;
    public final C01U A03;

    public static final void A02(C28426CgY c28426CgY, String str, String str2, int i, boolean z) {
        A01(null, c28426CgY, str, str2, null, i, false, z, false, false);
    }

    public final void A04(String str, String str2, int i, boolean z, boolean z2) {
        C14360o3.A0B(str, 0);
        A01(null, this, "imagine_media_tap", str, str2, i, false, z, z2, false);
    }

    public /* synthetic */ C28426CgY(FoaUserSession foaUserSession, CWR cwr) {
        C28172CbJ c28172CbJ = new C28172CbJ(foaUserSession, cwr.A05);
        this.A01 = cwr;
        this.A02 = c28172CbJ;
        C14360o3.A0B(foaUserSession, 0);
        this.A00 = AbstractC12220kQ.A02(((IgMetaSessionImpl) foaUserSession).A00);
        this.A03 = new C01U(AbstractC166987dD.A1J(AbstractC166997dE.A0o()));
    }

    public static EnumC72434Xde A00(C28426CgY c28426CgY) {
        return AbstractC72653Xjv.A00(c28426CgY.A01.A02);
    }

    public static final void A01(C8Y c8y, C28426CgY c28426CgY, String str, String str2, String str3, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        CWR cwr = c28426CgY.A01;
        CVW cvw = cwr.A05;
        C09530e4 A1L = AbstractC166987dD.A1L("app_session_id", null);
        String str4 = cvw.A01;
        C09530e4 A1L2 = AbstractC166987dD.A1L("surface_session_id", str4);
        EnumC53326Ni5 enumC53326Ni5 = cwr.A02;
        LinkedHashMap A1F = AbstractC25232BEp.A1F("entrypoint", enumC53326Ni5.A00, A1L, A1L2);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f((C18920wW) c28426CgY.A00, "meta_ai_intents_image_creation_events");
        if (A0f.isSampled()) {
            A0f.AAP("event_name", str);
            A0f.A8R(AbstractC72653Xjv.A00(enumC53326Ni5), "surface");
            String str5 = (String) c28426CgY.A03.A0R();
            if (str5 == null) {
                str5 = "";
            }
            A0f.AAP("intent_session_id", str5);
            A0f.AAP("bottom_sheet_session_id", cvw.A00);
            if (str4 == null) {
                str4 = "";
            }
            A0f.AAP("surface_session_id", str4);
            A0f.AAP(AbstractC58317Pt9.A00(126), str2);
            if (str3 == null) {
                str3 = "";
            }
            A0f.AAP("flash_session_id", str3);
            A0f.A7v("is_e2ee", AbstractC166997dE.A0a());
            A0f.A7v(MSV.A00(488), Boolean.valueOf(z));
            A0f.A7v(MSV.A00(1353), Boolean.valueOf(z2));
            A0f.A9M("app_context_data", A1F);
            A0f.AAP("surface_string_override", null);
            A0f.A7v("is_ig_interest_personalized", Boolean.valueOf(z3));
            A0f.A9K("image_index", Long.valueOf(i));
            A0f.A8R(c8y, "current_screen");
            A0f.A7v("is_spotlight", Boolean.valueOf(z4));
            A0f.Cht();
        }
    }

    public final void A03(C8Y c8y, boolean z) {
        A01(c8y, this, "scroll_content", "suggested", null, -1, false, false, false, z);
    }
}
