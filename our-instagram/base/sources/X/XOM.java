package X;

import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public final class XOM extends AbstractC72243XZy {
    public final FloatBuffer A00;

    public XOM(int i) {
        super(i, 5126);
        this.A00 = FloatBuffer.allocate(1);
    }

    public final void A00(float f) {
        this.A00.put(0, f);
        ((AbstractC72243XZy) this).A00 = true;
    }
}
