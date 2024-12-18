package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.5N9, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5N9 {
    public static final C24531Hw A00(C1ET c1et, UserSession userSession, C3G5 c3g5, String str, Map map, java.util.Set set, boolean z) {
        C14360o3.A0B(c1et, 6);
        C23711Eb c23711Eb = new C23711Eb(userSession, 433402163, 1, false);
        c23711Eb.A09(C05F.A01);
        c23711Eb.A0B("feed/reels_media_stream/");
        c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C85733s2.class, true, false);
        c23711Eb.A0R = true;
        c23711Eb.A0D("batch_size", (int) C18U.A01(C06090Tz.A05, userSession, 36595191536224339L));
        c23711Eb.A9s("reason", c3g5.toString());
        Integer num = c1et.A00;
        if (num != null) {
            c23711Eb.A0G("X-IG-Accept-Hint", AbstractC23791Em.A00(num));
        }
        C5NA.A00.A00(c23711Eb, userSession, str, map, set, z);
        return c23711Eb.A0N();
    }
}
