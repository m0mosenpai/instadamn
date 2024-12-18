package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GkC, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37797GkC {
    public static final C23711Eb A02(UserSession userSession, int i) {
        C23711Eb c23711Eb = new C23711Eb(userSession, i, 1, false);
        c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C37410Gdq.class, true, true);
        return c23711Eb;
    }

    public static final C25621Ms A00(UserSession userSession) {
        C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
        AbstractC37302Gc3.A1M(A0q, userSession, C37410Gdq.class);
        return A0q;
    }

    public static final C23711Eb A01(UserSession userSession) {
        C23711Eb c23711Eb = new C23711Eb(userSession, 1617547344, 1, false);
        c23711Eb.A01 = new C23751Eh(new C07510aQ(userSession), new C25611Mr(null), C41307IPw.class, true, true);
        return c23711Eb;
    }

    public static final C1ON A03(C1OL c1ol, UserSession userSession, String str) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0R(C124275jh.class, C37410Gdq.class);
        A0D.A0B("clips/items/");
        A0D.A0H("clips_media_ids", str);
        if (c1ol != null) {
            A0D.A00 = c1ol;
        }
        return A0D.A0N();
    }

    public static final C1ON A04(UserSession userSession, String str, String str2, String str3) {
        C25621Ms A0D = AbstractC31179DnN.A0D(userSession);
        A0D.A0R(C38874H9w.class, C37854Gl8.class);
        A0D.A0B("clips/item/");
        A0D.A0H("clips_media_id", str);
        A0D.A0H("clips_media_shortcode", str2);
        A0D.A0H("selected_clips_spin_id", str3);
        return A0D.A0N();
    }
}
