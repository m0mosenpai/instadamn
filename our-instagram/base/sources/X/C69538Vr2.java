package X;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Vr2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69538Vr2 {
    public final InterfaceC71877X8k A00;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();

    public final XE1 A00(Object... objArr) {
        Constructor AqT;
        AtomicBoolean atomicBoolean = this.A01;
        synchronized (atomicBoolean) {
            if (!atomicBoolean.get()) {
                try {
                    AqT = this.A00.AqT();
                } catch (ClassNotFoundException unused) {
                    atomicBoolean.set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            AqT = null;
        }
        if (AqT == null) {
            return null;
        }
        try {
            return (XE1) AqT.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }

    public C69538Vr2(InterfaceC71877X8k interfaceC71877X8k) {
        this.A00 = interfaceC71877X8k;
    }
}
