package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.BlockingQueue;

/* renamed from: X.TOm, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class RunnableC64655TOm implements Runnable {
    public final /* synthetic */ ListenableFuture A00;
    public final /* synthetic */ BlockingQueue A01;

    public RunnableC64655TOm(final ListenableFuture val$queue, final BlockingQueue val$future) {
        this.A01 = val$future;
        this.A00 = val$queue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A01.add(this.A00);
    }
}
