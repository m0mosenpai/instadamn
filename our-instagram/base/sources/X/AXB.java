package X;

import com.facebook.cameracore.util.Reference;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class AXB implements Reference {
    public final AXC A00;
    public final AtomicBoolean A01 = AbstractC166997dE.A17();

    public final void finalize() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
        }
    }

    @Override // com.facebook.cameracore.util.Reference
    public final Object get() {
        if (!this.A01.get()) {
            return this.A00.get();
        }
        throw AbstractC166987dD.A14("Accessing released reference.");
    }

    @Override // com.facebook.cameracore.util.Reference
    public final void release() {
        if (!this.A01.getAndSet(true)) {
            this.A00.release();
            return;
        }
        throw AbstractC166987dD.A14("Reference was already released.");
    }

    public AXB(AXC axc) {
        this.A00 = axc;
    }
}
