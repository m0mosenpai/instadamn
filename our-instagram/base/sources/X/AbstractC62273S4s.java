package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.S4s, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62273S4s {
    public static final void A00(AbstractC12990ll abstractC12990ll, String str, String str2, HashMap hashMap, boolean z) {
        if (abstractC12990ll instanceof UserSession) {
            InterfaceC02590Ai A0f = AbstractC166987dD.A0f(AbstractC12220kQ.A02(abstractC12990ll), "ig_facebook_connect");
            A0f.AAP("event_name", str);
            A0f.A7v("is_cal", Boolean.valueOf(z));
            A0f.AAP("location", str2);
            A0f.A9M(AbstractC43591JPw.A00(359), hashMap);
            A0f.Cht();
        }
    }
}
