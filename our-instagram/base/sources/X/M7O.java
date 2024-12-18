package X;

import android.app.ProgressDialog;
import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public final class M7O implements Runnable {
    public final ProgressDialog A00;
    public final Handler A01;
    public final C45490KCf A02;
    public final Runnable A03;
    public final Runnable A04;

    public M7O(ProgressDialog progressDialog, Handler handler, C45490KCf c45490KCf, Runnable runnable) {
        C14360o3.A0B(progressDialog, 3);
        this.A02 = c45490KCf;
        this.A04 = runnable;
        this.A00 = progressDialog;
        this.A03 = new M0G(this);
        ArrayList arrayList = c45490KCf.A0M;
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        this.A01 = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A04.run();
        } finally {
            this.A01.post(this.A03);
        }
    }

    public M7O() {
    }
}
