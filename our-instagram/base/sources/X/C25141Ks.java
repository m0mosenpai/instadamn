package X;

import java.util.concurrent.Executor;

/* renamed from: X.1Ks, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C25141Ks {
    public static final C25141Ks A03 = new C25141Ks();
    public C25141Ks A00;
    public final Runnable A01;
    public final Executor A02;

    public C25141Ks(Runnable task, Executor executor) {
        this.A01 = task;
        this.A02 = executor;
    }

    public C25141Ks() {
        this.A01 = null;
        this.A02 = null;
    }
}
