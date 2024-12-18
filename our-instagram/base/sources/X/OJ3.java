package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OJ3 {
    public C54471O4z A00;
    public final C55095Ob6 A01;
    public final Context A02;
    public final UserSession A03;

    public OJ3(Context context, UserSession userSession, C55095Ob6 c55095Ob6) {
        C14360o3.A0B(c55095Ob6, 3);
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = c55095Ob6;
    }

    public final void A00(String str) {
        C14360o3.A0B(str, 0);
        C25621Ms A0M = AbstractC31177DnL.A0M(this.A03);
        A0M.A0B("video_call/cowatch/clips_media_feed/");
        C1ON A0e = AbstractC25227BEk.A0e(A0M, C124275jh.class, C37410Gdq.class);
        A0e.A00 = new C52236N9z(str, this, 5);
        C1GJ.A03(A0e);
    }
}
