package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;
import java.util.concurrent.Executor;

/* renamed from: X.99R, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C99R implements Executor {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AccountSession A01;
    public final /* synthetic */ String A02;

    public C99R(AccountSession accountSession, String str, int i) {
        this.A01 = accountSession;
        this.A00 = i;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        final String str = this.A02;
        Execution.executePossiblySync(new AbstractRunnableC94874Os(str) { // from class: X.99T
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }
        }, this.A01, this.A00);
    }
}
