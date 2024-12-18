package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ewd, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC33813Ewd {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        String A0e = AbstractC31177DnL.A0e(c6fw, 0);
        boolean A01 = C6DZ.A01(c6fw.A03(1));
        InterfaceC103384lE A0H = AbstractC31175DnJ.A0H(c6fw);
        String A0Q = AnonymousClass001.A0Q("", System.currentTimeMillis());
        AbstractC12990ll A0B = C6BQ.A0B(c6fq);
        if (!(A0B instanceof UserSession)) {
            C6FX A0s = AbstractC25225BEi.A0s();
            A0s.A03(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, 0);
            A0s.A03("", 1);
            AbstractC25227BEk.A1M(c6fq, A0s, A0H);
            return null;
        }
        C6BS c6bs = C6BS.A02;
        android.net.Uri A012 = C6BX.A01(AbstractC25227BEk.A0B(A0e), true);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C1AD.A06(c06090Tz, 18309501417762481L)) {
            if (C18U.A06(c06090Tz, A0B, 36327378850560553L) && !OO1.A01(A012, AbstractC12220kQ.A02(A0B))) {
                throw new SecurityException("Invalid MimeType");
            }
            if (OO1.A00(A012)) {
                throw new SecurityException("E2EE file path detected");
            }
        }
        C32531EUh c32531EUh = new C32531EUh(A0H, c6fq, A0Q, 1);
        Context context = C1LZ.A00().A00;
        UserSession userSession = (UserSession) A0B;
        C14360o3.A0B(userSession, 1);
        String valueOf = String.valueOf(System.currentTimeMillis());
        C121275eQ A013 = AbstractC34756FSv.A01(context, A012, userSession, valueOf, 1);
        C1Ee c1Ee = new C1Ee();
        c1Ee.A05("share_to_feed", String.valueOf(A01));
        A013.A00 = new EZ6(c32531EUh, c1Ee, userSession, valueOf);
        C1GJ.A01().schedule(A013);
        return null;
    }
}
