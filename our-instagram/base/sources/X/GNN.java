package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes6.dex */
public final class GNN implements Runnable {
    public final /* synthetic */ C141956bE A00;

    public GNN(C141956bE c141956bE) {
        this.A00 = c141956bE;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Fragment fragment = (Fragment) this.A00.A08.get();
        if (fragment != null) {
            AbstractC25231BEo.A16(fragment);
        }
    }
}
