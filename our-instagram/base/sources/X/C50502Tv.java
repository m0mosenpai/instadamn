package X;

import java.security.MessageDigest;
import java.util.Arrays;

/* renamed from: X.2Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C50502Tv extends AbstractC50512Tw {
    public boolean A00;
    public final int A01;
    public final MessageDigest A02;

    @Override // X.AbstractC50512Tw
    public final void A00(byte b) {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A02.update(b);
    }

    @Override // X.AbstractC50512Tw
    public final void A02(byte[] b, int off, int len) {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A02.update(b, off, len);
    }

    public final C50532Ty A03() {
        C18C.A0H(!this.A00, "Cannot re-use a Hasher after calling hash() on it");
        this.A00 = true;
        int i = this.A01;
        MessageDigest messageDigest = this.A02;
        int digestLength = messageDigest.getDigestLength();
        byte[] digest = messageDigest.digest();
        if (i != digestLength) {
            digest = Arrays.copyOf(digest, i);
        }
        return new C50532Ty(digest);
    }

    public C50502Tv(MessageDigest digest, int bytes) {
        this.A02 = digest;
        this.A01 = bytes;
    }
}
