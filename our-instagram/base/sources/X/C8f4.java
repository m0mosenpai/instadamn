package X;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.8f4, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8f4 extends C8f5 {
    public final C8f3 A00;
    public final C8f2 A01;
    public final AtomicBoolean A02;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.8f1, android.os.Handler] */
    public C8f4(C191978et c191978et, C8f3 c8f3, C8f2 c8f2) {
        super(c191978et, c8f3, new Handler(AbstractC191958er.A01));
        this.A02 = new AtomicBoolean(false);
        this.A01 = c8f2;
        this.A00 = c8f3;
    }

    public static void A00(C8f4 c8f4) {
        if (c8f4.A02.compareAndSet(false, true)) {
            final C8f2 c8f2 = c8f4.A01;
            InterfaceC192058f1 interfaceC192058f1 = c8f2.A02;
            if (!interfaceC192058f1.CZZ()) {
                interfaceC192058f1.E4t(new Runnable() { // from class: X.8f7
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                }, "Emitter_onAttach");
            }
        }
    }
}
