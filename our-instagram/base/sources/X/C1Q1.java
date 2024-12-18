package X;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: X.1Q1, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1Q1 implements InterfaceC26421Px {
    public static final C23781El A04 = new C23781El("Content-Encoding", "gzip");
    public int A00;
    public C23781El A01;
    public InterfaceC26421Px A02;
    public byte[] A03;

    private void A00() {
        if (this.A03 == null && this.A02 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            InputStream E2i = this.A02.E2i();
            byte[] bArr = new byte[8192];
            while (true) {
                int read = E2i.read(bArr);
                if (read > 0) {
                    gZIPOutputStream.write(bArr, 0, read);
                } else {
                    E2i.close();
                    gZIPOutputStream.flush();
                    gZIPOutputStream.close();
                    this.A03 = byteArrayOutputStream.toByteArray();
                    this.A00 = byteArrayOutputStream.size();
                    this.A02 = null;
                    return;
                }
            }
        }
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Aqy() {
        return A04;
    }

    @Override // X.InterfaceC26421Px
    public final C23781El Ar8() {
        return this.A01;
    }

    @Override // X.InterfaceC26421Px
    public final InputStream E2i() {
        A00();
        C18C.A07(this.A03, "mZippedBytes should be set in consumeInner()");
        return new ByteArrayInputStream(this.A03);
    }

    @Override // X.InterfaceC26421Px
    public final long getContentLength() {
        try {
            A00();
        } catch (IOException unused) {
        }
        return this.A00;
    }
}
