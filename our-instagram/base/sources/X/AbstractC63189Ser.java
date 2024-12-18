package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

/* renamed from: X.Ser, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63189Ser {
    public static final EnumC61068Rei A02 = EnumC61068Rei.A00;
    public final SYJ A00;
    public final SYJ A01;

    public static byte[] A00(final ByteBuffer aad, byte[] ciphertext) {
        int length = ciphertext.length;
        int i = length % 16;
        int i2 = length;
        if (i != 0) {
            i2 = (length + 16) - i;
        }
        int remaining = aad.remaining();
        int i3 = remaining % 16;
        int i4 = remaining;
        if (i3 != 0) {
            i4 = (remaining + 16) - i3;
        }
        int i5 = i4 + i2;
        ByteBuffer A17 = AbstractC58320PtC.A17(i5 + 16);
        A17.put(ciphertext);
        A17.position(i2);
        A17.put(aad);
        A17.position(i5);
        A17.putLong(length);
        A17.putLong(remaining);
        return A17.array();
    }

    public AbstractC63189Ser(final byte[] key) {
        SYJ syj;
        SYJ syj2;
        if (A02.A00()) {
            boolean z = this instanceof RTU;
            if (z) {
                syj = new SYJ(key, 1);
            } else {
                syj = new SYJ(key, 1);
            }
            this.A01 = syj;
            if (z) {
                syj2 = new SYJ(key, 0);
            } else {
                syj2 = new SYJ(key, 0);
            }
            this.A00 = syj2;
            return;
        }
        throw AbstractC58318PtA.A0x("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public final void A01(ByteBuffer output, final byte[] nonce, final byte[] plaintext, final byte[] associatedData) {
        int remaining = output.remaining();
        int length = plaintext.length;
        if (remaining >= length + 16) {
            int position = output.position();
            SYJ syj = this.A01;
            if (output.remaining() >= length) {
                SYJ.A00(syj, output, ByteBuffer.wrap(plaintext), nonce);
                output.position(position);
                output.limit(output.limit() - 16);
                if (associatedData == null) {
                    associatedData = new byte[0];
                }
                byte[] bArr = new byte[32];
                this.A00.A01(nonce, 0).get(bArr);
                byte[] A022 = AbstractC63072Sbu.A02(bArr, A00(output, associatedData));
                output.limit(output.limit() + 16);
                output.put(A022);
                return;
            }
            throw AbstractC166987dD.A12("Given ByteBuffer output is too small");
        }
        throw AbstractC166987dD.A12("Given ByteBuffer output is too small");
    }

    public final byte[] A02(ByteBuffer ciphertext, final byte[] nonce, final byte[] associatedData) {
        if (ciphertext.remaining() >= 16) {
            int position = ciphertext.position();
            byte[] bArr = new byte[16];
            ciphertext.position(ciphertext.limit() - 16);
            ciphertext.get(bArr);
            ciphertext.position(position);
            ciphertext.limit(ciphertext.limit() - 16);
            if (associatedData == null) {
                associatedData = new byte[0];
            }
            try {
                byte[] bArr2 = new byte[32];
                this.A00.A01(nonce, 0).get(bArr2);
                if (MessageDigest.isEqual(AbstractC63072Sbu.A02(bArr2, A00(ciphertext, associatedData)), bArr)) {
                    ciphertext.position(position);
                    SYJ syj = this.A01;
                    ByteBuffer allocate = ByteBuffer.allocate(ciphertext.remaining());
                    SYJ.A00(syj, allocate, ciphertext, nonce);
                    return allocate.array();
                }
                throw AbstractC58318PtA.A0x("invalid MAC");
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }
        throw AbstractC58318PtA.A0x("ciphertext too short");
    }
}
