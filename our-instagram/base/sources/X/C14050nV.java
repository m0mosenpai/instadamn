package X;

import java.security.MessageDigest;

/* renamed from: X.0nV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14050nV extends AbstractC20580zb {
    public final MessageDigest A00;

    @Override // X.AbstractC20580zb
    public final void A00(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    @Override // X.AbstractC20580zb
    public final byte[] A01() {
        MessageDigest messageDigest = this.A00;
        byte[] digest = messageDigest.digest();
        messageDigest.reset();
        return digest;
    }

    public C14050nV() {
        super.A00 = 32;
        this.A01 = "SHA-256";
        this.A00 = MessageDigest.getInstance("SHA-256");
    }
}
