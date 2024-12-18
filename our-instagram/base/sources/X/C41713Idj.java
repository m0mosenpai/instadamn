package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Idj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41713Idj {
    public static final C41713Idj A00 = new Object();

    public static final C1ON A01(UserSession userSession, String str, String str2, String str3, String str4, String str5) {
        return A00(userSession, null, AbstractC167007dF.A0d(), str, str2, str3, str4, str5, null, null);
    }

    public static final C1ON A00(UserSession userSession, Integer num, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
        A0c.A0E = str;
        AbstractC37300Gc1.A0y(A0c, str5);
        A0c.A0H("session_info", str3);
        AbstractC37301Gc2.A1N(A0c, "seen_reels", str4, str2);
        A0c.A0H("chaining_media_id", str6);
        A0c.A0H("media_note_author_id", str7);
        A0c.A0A(num, AbstractC111324zv.A00(806));
        A0c.A0R(C124275jh.class, C37410Gdq.class);
        if (l != null) {
            long longValue = l.longValue();
            if (longValue > 0) {
                A0c.A04();
                String str8 = "";
                if (str2 == null) {
                    str2 = "";
                }
                if (str6 == null) {
                    str6 = "";
                }
                if (str7 != null) {
                    str8 = str7;
                }
                A0c.A0A = AnonymousClass001.A0u(str, str2, str6, str8);
                ((AbstractC23721Ec) A0c).A01 = TimeUnit.DAYS.toMillis(1L);
                ((AbstractC23721Ec) A0c).A00 = longValue;
            }
        }
        return A0c.A0N();
    }
}
