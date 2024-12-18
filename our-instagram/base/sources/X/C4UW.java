package X;

import java.nio.ByteBuffer;

/* renamed from: X.4UW, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4UW extends C4UI {
    public static final int A00 = Float.floatToIntBits(Float.NaN);

    @Override // X.C4UE
    public final void E7Z(ByteBuffer byteBuffer) {
        ByteBuffer A02;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.A00.A02;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                A02 = A02(i);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == A00) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    A02.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            A02 = A02((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == A00) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                A02.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        A02.flip();
    }
}
