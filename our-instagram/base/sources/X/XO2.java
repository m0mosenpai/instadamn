package X;

import android.graphics.Color;
import java.nio.FloatBuffer;

/* loaded from: classes12.dex */
public final class XO2 extends AbstractC72243XZy {
    public final FloatBuffer A00;

    public final void A00(float f, float f2, float f3, float f4) {
        FloatBuffer floatBuffer = this.A00;
        floatBuffer.put(0, f);
        floatBuffer.put(1, f2);
        floatBuffer.put(2, f3);
        floatBuffer.put(3, f4);
        ((AbstractC72243XZy) this).A00 = true;
    }

    public XO2(int i) {
        super(i, 35666);
        this.A00 = FloatBuffer.allocate(4);
    }

    public final void A01(int i, float f) {
        A00((Color.red(i) * f) / 255.0f, (Color.green(i) * f) / 255.0f, (Color.blue(i) * f) / 255.0f, f);
    }
}
