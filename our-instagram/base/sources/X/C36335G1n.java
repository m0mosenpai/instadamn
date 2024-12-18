package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* renamed from: X.G1n, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36335G1n implements GXQ {
    public final UserSession A00;
    public final boolean A01;

    @Override // X.GXQ
    public final void Cq8(Bundle bundle) {
        int i;
        C14360o3.A0B(bundle, 0);
        if (this.A01) {
            i = 5;
        } else {
            UserSession userSession = this.A00;
            if ((AbstractC2051496e.A01(userSession) && !C7HD.A00(userSession)) || !AbstractC31269Dor.A00(userSession)) {
                bundle.putInt("interest_based_channel_implicit_audience_type", 0);
                return;
            }
            i = 2;
        }
        bundle.putInt("interest_based_channel_implicit_audience_type", i);
    }

    public C36335G1n(UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A01 = z;
    }
}
