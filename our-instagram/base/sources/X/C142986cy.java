package X;

import java.util.concurrent.ThreadFactory;

/* renamed from: X.6cy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C142986cy {
    public long A00;
    public final int A01;
    public final C142966cw[] A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C142986cy(int i, ThreadFactory threadFactory) {
        this.A01 = i;
        this.A02 = new C142966cw[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.A02[i2] = new C142976cx(threadFactory);
        }
    }
}
