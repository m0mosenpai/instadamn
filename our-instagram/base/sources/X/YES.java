package X;

import android.util.SparseArray;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YES implements InterfaceC62872tQ {
    public final UserSession A00;

    public YES(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    @Override // X.InterfaceC62872tQ
    public final SparseArray AMf() {
        return new SparseArray();
    }

    @Override // X.InterfaceC62872tQ
    public final InterfaceC63212ty AgS() {
        return new C63202tx(null, null, new C63182tv(this.A00), null, C63162tt.A00, null);
    }
}
