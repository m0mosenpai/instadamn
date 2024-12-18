package X;

import java.nio.IntBuffer;

/* loaded from: classes12.dex */
public final class XOB extends AbstractC72243XZy {
    public final IntBuffer A00;

    public XOB(int i) {
        super(i, 5124);
        this.A00 = IntBuffer.allocate(1);
    }

    public final void A00(boolean z) {
        this.A00.put(0, z ? 1 : 0);
        ((AbstractC72243XZy) this).A00 = true;
    }
}
