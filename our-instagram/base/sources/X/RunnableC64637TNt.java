package X;

import com.facebook.react.bridge.Callback;

/* renamed from: X.TNt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64637TNt implements Runnable {
    public final /* synthetic */ Callback A00;
    public final /* synthetic */ SZp A01;

    public RunnableC64637TNt(Callback callback, SZp sZp) {
        this.A01 = sZp;
        this.A00 = callback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC58321PtD.A1K(this.A00, Boolean.TRUE);
    }
}
