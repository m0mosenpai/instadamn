package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.G3u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36393G3u implements GXY {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C3BV A01;
    public final /* synthetic */ String A02;

    public C36393G3u(C3BV c3bv, String str, long j) {
        this.A01 = c3bv;
        this.A02 = str;
        this.A00 = j;
    }

    @Override // X.GXY
    public final void Dsp() {
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        C3BV c3bv = this.A01;
        C18920wW c18920wW = (C18920wW) c3bv.A0J.getValue();
        String str = this.A02;
        long j = this.A00;
        AbstractC167017dG.A1N(c18920wW, str);
        AbstractC66181U2w.A02(c18920wW, str, "ig_home_feed_donut", "", "", j, seconds);
        UserSession userSession = c3bv.A0E;
        if (C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36327950082325499L)) {
            AbstractC35257Fgr.A08(userSession, c3bv.A0B, EnumC33519Ers.A0A.toString());
        }
    }
}
