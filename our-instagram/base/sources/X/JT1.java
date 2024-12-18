package X;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public abstract class JT1 extends AbstractFutureC44236Jgg implements ListenableFuture {
    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable listener, Executor exec) {
        ((AbstractC43665JSx) this).A00.addListener(listener, exec);
    }
}
