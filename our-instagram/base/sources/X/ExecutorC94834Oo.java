package X;

import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

/* renamed from: X.4Oo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC94834Oo implements Executor {
    public static final ExecutorC94834Oo A00 = new ExecutorC94834Oo();

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        Execution.executePossiblySync(new AbstractRunnableC94874Os() { // from class: X.4Oq
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super("MqttXplatNativeClient");
            }

            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        }, null, 3);
    }
}
