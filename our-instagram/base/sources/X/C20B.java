package X;

import java.util.concurrent.Executor;

/* renamed from: X.20B, reason: invalid class name */
/* loaded from: classes.dex */
public final class C20B implements Executor {
    public static final C20B A00 = new C20B();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            AnonymousClass206.A0G.A01(runnable);
        }
    }
}
