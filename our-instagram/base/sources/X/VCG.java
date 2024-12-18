package X;

import java.io.ByteArrayOutputStream;

/* loaded from: classes11.dex */
public final class VCG extends ByteArrayOutputStream {
    public final void A00(byte[] bArr, int i) {
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i, ((ByteArrayOutputStream) this).count);
    }
}
