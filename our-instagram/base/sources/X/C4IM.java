package X;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.4IM, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4IM implements Executor {
    public final InterfaceC14020nS A00;

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        C14360o3.A0B(runnable, 0);
        this.A00.ATO(new AbstractRunnableC14200nk() { // from class: X.4JU
            @Override // java.lang.Runnable
            public final void run() {
                runnable.run();
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1269778608, 3, true, true);
            }
        });
    }

    public /* synthetic */ C4IM(DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A00 = A00;
    }

    public C4IM() {
        InterfaceC14020nS A00 = C14120nc.A00();
        C14360o3.A07(A00);
        this.A00 = A00;
    }
}
