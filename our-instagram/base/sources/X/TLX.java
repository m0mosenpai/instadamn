package X;

import androidx.fragment.app.FragmentActivity;

/* loaded from: classes10.dex */
public final class TLX implements Runnable {
    public final /* synthetic */ FragmentActivity A00;

    public TLX(FragmentActivity fragmentActivity) {
        this.A00 = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.onBackPressed();
    }
}
