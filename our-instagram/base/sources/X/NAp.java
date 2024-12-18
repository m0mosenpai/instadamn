package X;

import android.content.Intent;
import androidx.fragment.app.Fragment;

/* loaded from: classes9.dex */
public final class NAp extends AbstractC60592pi {
    public final int A00;
    public final Object A01;

    public NAp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.AbstractC60592pi, X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
        ((Fragment) this.A01).onActivityResult(i, i2, intent);
    }
}
