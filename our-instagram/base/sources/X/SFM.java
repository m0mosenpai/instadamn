package X;

import androidx.work.multiprocess.IWorkManagerImplCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes10.dex */
public abstract class SFM {
    public final IWorkManagerImplCallback A00;
    public final ListenableFuture A01;
    public final Executor A02;

    public SFM(IWorkManagerImplCallback iWorkManagerImplCallback, ListenableFuture listenableFuture, Executor executor) {
        this.A02 = executor;
        this.A00 = iWorkManagerImplCallback;
        this.A01 = listenableFuture;
    }
}
