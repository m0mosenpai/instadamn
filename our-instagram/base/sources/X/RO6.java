package X;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class RO6 extends AbstractC62220S2q {
    public boolean A00;
    public final int A01;
    public final ByteBuffer A02;
    public final MessageDigest A03;

    private final void A00() {
        if (!this.A00) {
        } else {
            throw AbstractC166987dD.A14(AbstractC111324zv.A00(1527));
        }
    }

    public final void A02(char c) {
        ByteBuffer byteBuffer = this.A02;
        byteBuffer.putChar(c);
        try {
            A03(byteBuffer.array());
        } finally {
            byteBuffer.clear();
        }
    }

    public /* synthetic */ RO6(MessageDigest messageDigest, int i) {
        this();
        this.A03 = messageDigest;
        this.A01 = i;
    }

    public final RO7 A01() {
        byte[] copyOf;
        A00();
        this.A00 = true;
        int i = this.A01;
        MessageDigest messageDigest = this.A03;
        if (i == messageDigest.getDigestLength()) {
            copyOf = messageDigest.digest();
        } else {
            copyOf = Arrays.copyOf(messageDigest.digest(), i);
        }
        return new RO7(copyOf);
    }

    public final void A03(byte[] bArr) {
        A00();
        this.A03.update(bArr, 0, 2);
    }

    public RO6() {
        this.A02 = AbstractC58320PtC.A17(8);
    }
}
