package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.VNu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68360VNu {
    public static final void A00(UserSession userSession, String str, String str2, String str3, String str4, Map map) {
        C18920wW A01 = AbstractC12220kQ.A01(new C19270xB("fb_story_to_ig_story_mentions"), userSession);
        InterfaceC02590Ai A00 = A01.A00(A01.A00, "xav_navigable_mentions");
        if (A00.isSampled()) {
            A00.AAP("event", str);
            A00.A9K("ig_userid", AbstractC25233BEq.A0n(str2));
            A00.AAP("mentioned_type", str3);
            A00.AAP("ig_story_id", str4);
            A00.A9M("extra", map);
            A00.Cht();
        }
    }
}
