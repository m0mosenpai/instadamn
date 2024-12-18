package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class AXC implements Reference {
    public InterfaceC179337xj A00;
    public Object A01;
    public final AtomicInteger A02 = new AtomicInteger(1);

    public final AXB A00() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 != 0) {
                if (atomicInteger.compareAndSet(i2, i2 + 1)) {
                    return new AXB(this);
                }
                i++;
            } else {
                throw AbstractC166987dD.A14("Trying to lock already released reference.");
            }
        } while (i < 10);
        throw AbstractC166987dD.A18("WTF: Could not lock the reference after multiple tries.");
    }

    @Override // com.facebook.cameracore.util.Reference
    public final void release() {
        int i = 0;
        do {
            AtomicInteger atomicInteger = this.A02;
            int i2 = atomicInteger.get();
            if (i2 != 0) {
                if (atomicInteger.compareAndSet(i2, i2 - 1)) {
                    if (i2 == 1) {
                        this.A00.DeY(this, this.A01);
                        return;
                    }
                    return;
                }
                i++;
            } else {
                throw AbstractC166987dD.A14("Too many calls to CountedReference#release");
            }
        } while (i < 10);
        throw AbstractC166987dD.A18("WTF: Could not release the reference after multiple tries.");
    }

    public final void finalize() {
        if (this.A02.getAndSet(0) > 0) {
            this.A00.DeY(this, this.A01);
        }
    }

    @Override // com.facebook.cameracore.util.Reference
    public final Object get() {
        if (this.A02.get() > 0) {
            return this.A01;
        }
        throw AbstractC166987dD.A14("Accessing released reference.");
    }

    public AXC(Reference reference) {
        this.A01 = reference.get();
        this.A00 = new AXG(reference, this);
    }

    public AXC(InterfaceC179337xj interfaceC179337xj, Object obj) {
        this.A01 = obj;
        this.A00 = interfaceC179337xj;
    }
}
