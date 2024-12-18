package X;

import java.nio.ByteBuffer;

/* renamed from: X.STy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62851STy {
    public static final byte[] A00 = new byte[0];

    public static byte[] A00(PxI key) {
        int i;
        ByteBuffer allocate;
        byte b;
        PxH A002 = PxH.A00(key.outputPrefixType_);
        if (A002 == null) {
            A002 = PxH.UNRECOGNIZED;
        }
        int ordinal = A002.ordinal();
        if (ordinal != 2 && ordinal != 4) {
            b = 1;
            if (ordinal != 1) {
                if (ordinal == 3) {
                    return A00;
                }
                throw AbstractC58318PtA.A0x("unknown output prefix type");
            }
            i = key.keyId_;
            allocate = ByteBuffer.allocate(5);
        } else {
            i = key.keyId_;
            allocate = ByteBuffer.allocate(5);
            b = 0;
        }
        allocate.put(b);
        allocate.putInt(i);
        return C58526Pwu.A00(allocate.array()).A01();
    }
}
