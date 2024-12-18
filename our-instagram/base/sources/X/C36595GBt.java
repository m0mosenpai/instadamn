package X;

import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.GBt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36595GBt implements C5OV {
    public final UserSession A00;

    @Override // X.C5OV
    public final boolean E3b(C5OW c5ow) {
        UserSession userSession = this.A00;
        long j = AbstractC31174DnI.A0g(C1AT.A01(userSession), C1AV.A19, this).getLong("IGD_PARENTAL_ACCESS_CONTROL_EDUCATION_REMIND_ME_LATER_TIMESTAMP_KEY", 0L);
        if (j == 0) {
            return false;
        }
        if (TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - j) < C18U.A01(C06090Tz.A05, userSession, 36607616876877432L)) {
            return false;
        }
        return true;
    }

    public C36595GBt(UserSession userSession) {
        this.A00 = userSession;
    }
}
