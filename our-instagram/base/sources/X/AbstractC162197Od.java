package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.7Od, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC162197Od extends AbstractC162207Oe {
    public final C162237Oh A00;

    @Override // X.AbstractC162207Oe
    public final boolean A03(C9C9 c9c9) {
        if (super.A03(c9c9)) {
            return this.A00.A04(c9c9.A01, System.currentTimeMillis());
        }
        return false;
    }

    public AbstractC162197Od(UserSession userSession, C162237Oh c162237Oh) {
        super(userSession);
        this.A00 = c162237Oh;
    }
}
