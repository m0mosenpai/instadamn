package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.Ed5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32863Ed5 extends AbstractC46516KiF {
    public final UserSession A00;
    public final Capabilities A01;
    public final C31227DoA A02;
    public final C83693oE A03;

    @Override // X.AbstractC46516KiF
    public final C42221xC A00(C42221xC c42221xC) {
        C14360o3.A0B(c42221xC, 0);
        return c42221xC.A0L(new C36226Fyf(this, 4));
    }

    public C32863Ed5(Context context, UserSession userSession, Capabilities capabilities, C83693oE c83693oE) {
        this.A00 = userSession;
        this.A03 = c83693oE;
        this.A01 = capabilities;
        this.A02 = AbstractC31273Dov.A00(context, userSession);
    }

    @Override // X.AbstractC46516KiF
    public final Class A01() {
        return G5R.class;
    }
}
