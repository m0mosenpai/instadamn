package X;

import java.nio.ByteBuffer;

/* renamed from: X.9Wp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211419Wp extends A4P {
    public static int A00(AKY aky, int i, int i2, int i3) {
        aky.A08(5);
        aky.A09(4, i3);
        aky.A09(3, 45000);
        aky.A0A(1, i2);
        aky.A0A(0, i);
        aky.A0B(1, 0);
        ByteBuffer byteBuffer = aky.A07;
        int i4 = aky.A03 - 1;
        aky.A03 = i4;
        byteBuffer.put(i4, (byte) 1);
        aky.A07(2);
        return aky.A01();
    }
}
