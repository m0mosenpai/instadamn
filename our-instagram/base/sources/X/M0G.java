package X;

import android.app.ProgressDialog;

/* loaded from: classes8.dex */
public final class M0G implements Runnable {
    public final /* synthetic */ M7O A00;

    public M0G(M7O m7o) {
        this.A00 = m7o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        M7O m7o = this.A00;
        m7o.A02.A0M.remove(m7o);
        ProgressDialog progressDialog = m7o.A00;
        if (progressDialog.getWindow() != null) {
            progressDialog.dismiss();
        }
    }
}
