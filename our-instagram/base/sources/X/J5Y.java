package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes7.dex */
public final class J5Y implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C189448aO A01;
    public final /* synthetic */ C37675GiC A02;

    public J5Y(Fragment fragment, C189448aO c189448aO, C37675GiC c37675GiC) {
        this.A01 = c189448aO;
        this.A02 = c37675GiC;
        this.A00 = fragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.A00().A02(this.A02.A07, this.A00);
    }
}
