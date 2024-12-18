package X;

import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* loaded from: classes10.dex */
public final class T96 implements InterfaceC65431Tk2 {
    public static final EnumC61068Rei A04 = EnumC61068Rei.A01;
    public final String A00;
    public final java.security.Key A01;
    public final int A02;
    public final ThreadLocal A03;

    @Override // X.InterfaceC65431Tk2
    public final byte[] AIq(byte[] data, int outputLength) {
        if (outputLength <= this.A02) {
            ThreadLocal threadLocal = this.A03;
            ((Mac) threadLocal.get()).update(data);
            return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), outputLength);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public T96(String algorithm, java.security.Key key) {
        int i;
        TYX tyx = new TYX(this);
        this.A03 = tyx;
        if (A04.A00()) {
            this.A00 = algorithm;
            this.A01 = key;
            if (key.getEncoded().length >= 16) {
                switch (algorithm.hashCode()) {
                    case -1823053428:
                        if (algorithm.equals("HMACSHA1")) {
                            i = 20;
                            break;
                        }
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                    case 392315023:
                        if (algorithm.equals("HMACSHA224")) {
                            i = 28;
                            break;
                        }
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                    case 392315118:
                        if (algorithm.equals("HMACSHA256")) {
                            i = 32;
                            break;
                        }
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                    case 392316170:
                        if (algorithm.equals("HMACSHA384")) {
                            i = 48;
                            break;
                        }
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                    case 392317873:
                        if (algorithm.equals("HMACSHA512")) {
                            i = 64;
                            break;
                        }
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                    default:
                        throw new NoSuchAlgorithmException(AnonymousClass001.A0R("unknown Hmac algorithm: ", algorithm));
                }
                this.A02 = i;
                tyx.get();
                return;
            }
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        throw AbstractC58318PtA.A0x("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
