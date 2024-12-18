package X;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: X.2f2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC54482f2 {
    /* JADX WARN: Type inference failed for: r2v3, types: [X.2f5, X.2f4] */
    public static C2f4 A00(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i <= 100) {
            duplicate.position(duplicate.position() + 6);
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    break;
                }
                int i3 = duplicate.getInt();
                duplicate.position(duplicate.position() + 4);
                long j = duplicate.getInt() & 4294967295L;
                duplicate.position(duplicate.position() + 4);
                if (1835365473 == i3) {
                    if (j != -1) {
                        duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
                        duplicate.position(duplicate.position() + 12);
                        long j2 = duplicate.getInt() & 4294967295L;
                        for (int i4 = 0; i4 < j2; i4++) {
                            int i5 = duplicate.getInt();
                            long j3 = duplicate.getInt() & 4294967295L;
                            duplicate.getInt();
                            if (1164798569 == i5 || 1701669481 == i5) {
                                duplicate.position((int) (j3 + j));
                                ?? c2f5 = new C2f5();
                                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                                int i6 = duplicate.getInt(duplicate.position()) + duplicate.position();
                                c2f5.A04 = duplicate;
                                c2f5.A00 = i6;
                                int i7 = i6 - duplicate.getInt(i6);
                                c2f5.A02 = i7;
                                c2f5.A01 = c2f5.A04.getShort(i7);
                                return c2f5;
                            }
                        }
                    }
                } else {
                    i2++;
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }
}
