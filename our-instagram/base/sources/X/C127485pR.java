package X;

import java.util.concurrent.Executor;

/* renamed from: X.5pR, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C127485pR {
    public C127485pR A00;
    public final Runnable A01;
    public final Executor A02;

    public C127485pR(C127485pR runnable, Runnable executor, Executor next) {
        this.A01 = executor;
        this.A02 = next;
        this.A00 = runnable;
    }
}
