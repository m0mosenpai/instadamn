package X;

import android.util.SparseArray;
import com.facebook.R;
import com.instagram.common.session.UserSession;

/* loaded from: classes12.dex */
public final class YER implements InterfaceC62872tQ {
    public UserSession A00;

    @Override // X.InterfaceC62872tQ
    public final SparseArray AMf() {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.bloks_ig_session, this.A00);
        return sparseArray;
    }

    @Override // X.InterfaceC62872tQ
    public final InterfaceC63212ty AgS() {
        return new C63202tx(null, null, new C63182tv(this.A00), null, C63162tt.A00, null);
    }
}
