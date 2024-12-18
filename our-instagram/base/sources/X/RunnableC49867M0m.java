package X;

import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.M0m, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49867M0m implements Runnable {
    public final /* synthetic */ C44668JqD A00;

    public RunnableC49867M0m(C44668JqD c44668JqD) {
        this.A00 = c44668JqD;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C44668JqD c44668JqD = this.A00;
        int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
        IgTextView igTextView = c44668JqD.A01;
        C7MU.A00(igTextView.getBackground(), igTextView.getTop());
    }
}
