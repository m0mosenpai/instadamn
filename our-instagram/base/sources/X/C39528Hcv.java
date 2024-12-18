package X;

import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* renamed from: X.Hcv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39528Hcv extends Enum {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ C39528Hcv[] A01;
    public static final C39528Hcv A02;

    public final boolean A00(UserSession userSession, C32S c32s, C1PC c1pc) {
        Integer num;
        C14360o3.A0B(userSession, 0);
        if (c1pc.equals(C1PB.A00)) {
            AnonymousClass318 A03 = C1PH.A00(userSession).A03(c1pc);
            Boolean bool = A03.A07;
            Long l = A03.A0I;
            if (!AbstractC166997dE.A1Z(bool, true)) {
                num = C05F.A01;
            } else {
                if (l != null && C18U.A01(C06090Tz.A05, userSession, 36592013265338500L) >= System.currentTimeMillis() - l.longValue()) {
                    return true;
                }
                num = C05F.A00;
            }
            if (num == C05F.A00) {
                c32s.A0X.CiB(c32s.A0Y.A03(), "hp0_unavailable", AbstractC43591JPw.A00(482));
            }
        }
        return false;
    }

    static {
        C39528Hcv c39528Hcv = new C39528Hcv();
        A02 = c39528Hcv;
        C39528Hcv[] c39528HcvArr = {c39528Hcv};
        A01 = c39528HcvArr;
        A00 = AbstractC12190kN.A00(c39528HcvArr);
    }

    public C39528Hcv() {
        super("STORIES_HP1", 0);
    }
}
