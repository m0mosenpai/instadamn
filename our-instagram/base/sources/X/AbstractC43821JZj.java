package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.JZj, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC43821JZj {
    public static final void A00(InterfaceC11380iw interfaceC11380iw, UserSession userSession, Long l, String str, String str2, String str3, String str4, Map map) {
        String A14;
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A01(interfaceC11380iw, userSession), "instagram_remix_reactions");
        if (A0f.isSampled() && (A14 = AbstractC25225BEi.A14()) != null) {
            A0f.AAP("event_type", str);
            AbstractC31171DnF.A1C(A0f, str2);
            A0f.AAP("surface", str3);
            A0f.AAP("ref_surface", null);
            A0f.AAP("story_id", str4);
            AbstractC25225BEi.A1N(A0f, A14);
            A0f.A9K("duration_seconds", l);
            A0f.AAP("audio_mode", null);
            A0f.A9M(AbstractC111324zv.A00(2339), map);
            A0f.Cht();
        }
    }

    public static final void A01(InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, String str3) {
        A00(interfaceC11380iw, userSession, null, str, str2, str3, null, null);
    }
}
