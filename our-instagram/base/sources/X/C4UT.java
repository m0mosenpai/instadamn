package X;

import java.nio.ByteBuffer;

/* renamed from: X.4UT, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UT extends C4UI {
    @Override // X.C4UE
    public final void E7Z(ByteBuffer byteBuffer) {
        int[] iArr = null;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer A02 = A02(((limit - position) / this.A00.A00) * this.A06.A00);
        while (position < limit) {
            for (int i : iArr) {
                A02.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.A00.A00;
        }
        byteBuffer.position(limit);
        A02.flip();
    }
}
