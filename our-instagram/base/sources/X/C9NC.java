package X;

import java.nio.FloatBuffer;

/* renamed from: X.9NC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9NC {
    public float A00 = 0.5f;
    public final C9N2 A01;

    public C9NC() {
        C9N2 A00 = C9N1.A00();
        this.A01 = A00;
        FloatBuffer floatBuffer = A00.A01;
        floatBuffer.put(C9N1.A02(1.0f, 1.0f, this.A00));
        floatBuffer.position(0);
        FloatBuffer floatBuffer2 = A00.A02;
        floatBuffer2.put(C9N1.A00[0]);
        floatBuffer2.position(0);
    }
}
