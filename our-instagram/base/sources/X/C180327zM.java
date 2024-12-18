package X;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: X.7zM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C180327zM {
    public final int A00;
    public final FloatBuffer A01;

    public C180327zM(float[] fArr) {
        int length = fArr.length;
        if (length % 2 == 0) {
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            asFloatBuffer.put(fArr);
            this.A01 = (FloatBuffer) asFloatBuffer.position(0);
            this.A00 = 2;
            return;
        }
        throw new IllegalArgumentException();
    }
}
