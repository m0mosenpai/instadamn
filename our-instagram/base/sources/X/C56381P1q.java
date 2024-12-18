package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.P1q, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56381P1q implements MQ5 {
    public final Context A00;
    public final UserSession A01;
    public final InterfaceC40171tl A02;
    public final String A03;

    public C56381P1q(Context context, UserSession userSession, InterfaceC40171tl interfaceC40171tl, String str) {
        C14360o3.A0B(str, 3);
        this.A00 = context;
        this.A01 = userSession;
        this.A03 = str;
        this.A02 = interfaceC40171tl;
    }

    @Override // X.MQ5
    public final void AJ9(C47Z c47z) {
        C40121td.A0G.A01(this.A00, this.A01).A0E(c47z, this.A02, ShareType.A0V);
    }

    @Override // X.MQ5
    public final String BcD() {
        return this.A03;
    }
}
