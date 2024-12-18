package X;

import androidx.fragment.app.Fragment;

/* loaded from: classes7.dex */
public final class J4O implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C42277Io1 A01;

    public J4O(Fragment fragment, C42277Io1 c42277Io1) {
        this.A00 = fragment;
        this.A01 = c42277Io1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.A00.isResumed()) {
            C42277Io1 c42277Io1 = this.A01;
            c42277Io1.A01().A0T();
            C42277Io1.A00(c42277Io1);
            AbstractC56932jR.A02(c42277Io1.A01().A0Q());
        }
    }
}
