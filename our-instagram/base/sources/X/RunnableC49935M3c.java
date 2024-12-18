package X;

import java.lang.ref.WeakReference;

/* renamed from: X.M3c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49935M3c implements Runnable {
    public final /* synthetic */ String A00;
    public final /* synthetic */ WeakReference A01;

    public RunnableC49935M3c(String str, WeakReference weakReference) {
        this.A01 = weakReference;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C45513KDd c45513KDd = (C45513KDd) this.A01.get();
        if (c45513KDd != null) {
            c45513KDd.A03(this.A00);
        }
    }
}
