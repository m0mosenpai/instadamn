package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;

/* renamed from: X.7Oe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162207Oe {
    public final UserSession A00;
    public final java.util.Set A01;

    public void A01(C9C9 c9c9) {
        ((AbstractC162197Od) this).A00.A03(c9c9.A01, System.currentTimeMillis());
    }

    public void A02(C9C9 c9c9) {
        ((AbstractC162197Od) this).A00.A02(c9c9.A01);
    }

    public boolean A03(C9C9 c9c9) {
        if (!AbstractC001800i.A0u(this.A01, c9c9.A00)) {
            return true;
        }
        if (!C18U.A06(C06090Tz.A05, this.A00, 36318634297989497L)) {
            return true;
        }
        return false;
    }

    public AbstractC162207Oe(UserSession userSession) {
        this.A00 = userSession;
        java.util.Set singleton = Collections.singleton(AbstractC43591JPw.A00(343));
        C14360o3.A07(singleton);
        this.A01 = singleton;
    }
}
