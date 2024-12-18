package X;

import java.nio.ByteBuffer;
import java.util.UUID;

/* loaded from: classes11.dex */
public abstract class W6c {
    public static byte[] A02(UUID uuid, byte[] bArr, UUID[] uuidArr) {
        int i;
        int length;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        int i2 = i + 32;
        if (uuidArr != null) {
            i2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        allocate.putInt(i2);
        allocate.putInt(1886614376);
        int i3 = 0;
        if (uuidArr != null) {
            i3 = 16777216;
        }
        allocate.putInt(i3);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && (length = bArr.length) != 0) {
            allocate.putInt(length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static C69079VhV A00(byte[] bArr) {
        C97974ac c97974ac = new C97974ac(bArr);
        if (c97974ac.A00 >= 32) {
            c97974ac.A0G(0);
            if (c97974ac.A01() == (c97974ac.A00 - c97974ac.A01) + 4 && c97974ac.A01() == 1886614376) {
                int A01 = (c97974ac.A01() >> 24) & 255;
                if (A01 > 1) {
                    AbstractC46512Bo.A04("PsshAtomUtil", AnonymousClass001.A0O("Unsupported pssh version: ", A01));
                } else {
                    UUID uuid = new UUID(c97974ac.A06(), c97974ac.A06());
                    if (A01 == 1) {
                        c97974ac.A0H(c97974ac.A04() * 16);
                    }
                    int A04 = c97974ac.A04();
                    if (A04 == c97974ac.A00 - c97974ac.A01) {
                        byte[] bArr2 = new byte[A04];
                        c97974ac.A0J(bArr2, 0, A04);
                        return new C69079VhV(uuid, bArr2, A01);
                    }
                }
            }
        }
        return null;
    }

    public static byte[] A01(UUID uuid, byte[] bArr) {
        C69079VhV A00 = A00(bArr);
        if (A00 != null) {
            UUID uuid2 = A00.A01;
            if (!uuid.equals(uuid2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("UUID mismatch. Expected: ");
                sb.append(uuid);
                sb.append(", got: ");
                sb.append(uuid2);
                AbstractC46512Bo.A04("PsshAtomUtil", AbstractC166997dE.A0x(".", sb));
            } else {
                return A00.A02;
            }
        }
        return null;
    }
}
