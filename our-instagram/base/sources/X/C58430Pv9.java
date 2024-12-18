package X;

import java.util.concurrent.Executor;

/* renamed from: X.Pv9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58430Pv9 {
    public InterfaceC65376Tj9 A00;
    public final Object A01 = new Object();
    public final Executor A02;

    public C58430Pv9(InterfaceC65376Tj9 interfaceC65376Tj9, Executor executor) {
        if (executor != null) {
            this.A02 = executor;
            this.A00 = interfaceC65376Tj9;
            return;
        }
        throw new IllegalArgumentException("executor is null");
    }
}
