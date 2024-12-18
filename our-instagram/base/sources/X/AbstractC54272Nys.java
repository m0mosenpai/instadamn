package X;

import android.media.AudioRecord;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nys, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54272Nys {
    public static final boolean A00(UserSession userSession) {
        C06090Tz A0U = AbstractC166997dE.A0U(userSession);
        if (C18U.A06(A0U, userSession, 36311594845930114L) && AudioRecord.getMinBufferSize(AbstractC25225BEi.A07(A0U, userSession, 36593069822509993L), 12, 2) >= 0) {
            return true;
        }
        return false;
    }
}
