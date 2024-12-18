package X;

import java.nio.ByteBuffer;

/* renamed from: X.68g, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C68g extends C3LS implements C68Y {
    @Override // X.C68Y
    public final void ANn(ByteBuffer byteBuffer, int i) {
        float f = 0.0f;
        int A00 = AbstractC1348468a.A00(byteBuffer, i, 0);
        if (A00 != 0) {
            f = byteBuffer.getFloat(A00);
        }
        this.A00 = f;
        float f2 = 0.0f;
        int A002 = AbstractC1348468a.A00(byteBuffer, i, 1);
        if (A002 != 0) {
            f2 = byteBuffer.getFloat(A002);
        }
        this.A01 = f2;
    }
}
