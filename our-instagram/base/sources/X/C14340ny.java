package X;

import java.util.zip.CRC32;

/* renamed from: X.0ny, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14340ny extends AbstractC20580zb {
    public final CRC32 A00 = new CRC32();

    @Override // X.AbstractC20580zb
    public final void A00(byte[] bArr, int i, int i2) {
        this.A00.update(bArr, i, i2);
    }

    @Override // X.AbstractC20580zb
    public final byte[] A01() {
        CRC32 crc32 = this.A00;
        byte[] bArr = {(byte) crc32.getValue(), (byte) (r2 >>> 8), (byte) (r2 >>> 16), (byte) (r2 >>> 24)};
        crc32.reset();
        return bArr;
    }

    public C14340ny() {
        super.A00 = 4;
        this.A01 = "CRC32";
    }
}
