package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes7.dex */
public final class J56 implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ IN9 A01;

    public J56(Fragment fragment, IN9 in9) {
        this.A01 = in9;
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        IN9 in9 = this.A01;
        C189478aR c189478aR = in9.A03;
        if (c189478aR != null) {
            z = c189478aR.A02.A1G;
        } else {
            z = false;
        }
        in9.A00(null, this.A00, in9.A07, z);
    }
}
