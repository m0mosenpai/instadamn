package X;

import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: X.PwF, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC58488PwF implements Runnable {
    public final /* synthetic */ RunnableC58496PwO A00;
    public final /* synthetic */ ListenableFuture A01;
    public final /* synthetic */ String A02;

    public RunnableC58488PwF(RunnableC58496PwO runnableC58496PwO, ListenableFuture listenableFuture, String str) {
        this.A00 = runnableC58496PwO;
        this.A02 = str;
        this.A01 = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC58496PwO runnableC58496PwO = this.A00;
        runnableC58496PwO.A01.A03.remove(this.A02);
        ListenableFuture listenableFuture = this.A01;
        if (!listenableFuture.isCancelled()) {
            try {
                listenableFuture.get();
            } catch (Exception e) {
                runnableC58496PwO.A00.A07(e);
            }
        }
    }
}
