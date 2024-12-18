package X;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes10.dex */
public final class T4T implements C4JB {
    public long A00;
    public long A01;
    public long A02;
    public C4C7 A03;
    public C60998RdQ A04;
    public File A05;
    public OutputStream A06;
    public final C2QE A07;

    private void A00() {
        OutputStream outputStream = this.A06;
        if (outputStream != null) {
            try {
                outputStream.flush();
                OutputStream outputStream2 = this.A06;
                if (outputStream2 != null) {
                    try {
                        outputStream2.close();
                    } catch (IOException unused) {
                    }
                }
                this.A06 = null;
                File file = this.A05;
                this.A05 = null;
                this.A07.AId(file, this.A02);
            } catch (Throwable th) {
                OutputStream outputStream3 = this.A06;
                if (outputStream3 != null) {
                    try {
                        outputStream3.close();
                    } catch (IOException unused2) {
                    }
                }
                this.A06 = null;
                File file2 = this.A05;
                this.A05 = null;
                file2.delete();
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.RdQ, java.io.BufferedOutputStream] */
    private void A01(C4C7 c4c7) {
        C60998RdQ c60998RdQ;
        long j = c4c7.A03;
        long j2 = -1;
        if (j != -1) {
            j2 = Math.min(j - this.A00, this.A01);
        }
        File EnK = this.A07.EnK(c4c7.A08, c4c7.A04 + this.A00, j2);
        this.A05 = EnK;
        FileOutputStream fileOutputStream = new FileOutputStream(EnK);
        C60998RdQ c60998RdQ2 = this.A04;
        if (c60998RdQ2 == null) {
            ?? bufferedOutputStream = new BufferedOutputStream(fileOutputStream, 20480);
            this.A04 = bufferedOutputStream;
            c60998RdQ = bufferedOutputStream;
        } else {
            c60998RdQ2.A00(fileOutputStream);
            c60998RdQ = c60998RdQ2;
        }
        this.A06 = c60998RdQ;
        this.A02 = 0L;
    }

    @Override // X.C4JB
    public final void E2L(C4C7 c4c7) {
        long j;
        c4c7.A08.getClass();
        if (c4c7.A03 == -1 && (c4c7.A00 & 2) == 2) {
            this.A03 = null;
            return;
        }
        this.A03 = c4c7;
        if ((c4c7.A00 & 4) == 4) {
            j = 2097152;
        } else {
            j = Long.MAX_VALUE;
        }
        this.A01 = j;
        this.A00 = 0L;
        try {
            A01(c4c7);
        } catch (IOException e) {
            throw new IOException(e);
        }
    }

    @Override // X.C4JB
    public final void close() {
        if (this.A03 != null) {
            try {
                A00();
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
    }

    @Override // X.C4JB
    public final void write(byte[] bArr, int i, int i2) {
        C4C7 c4c7 = this.A03;
        if (c4c7 != null) {
            int i3 = 0;
            while (i3 < i2) {
                try {
                    if (this.A02 == this.A01) {
                        A00();
                        A01(c4c7);
                    }
                    int min = (int) Math.min(i2 - i3, this.A01 - this.A02);
                    this.A06.write(bArr, i + i3, min);
                    i3 += min;
                    long j = min;
                    this.A02 += j;
                    this.A00 += j;
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    public T4T(C2QE c2qe) {
        this.A07 = c2qe;
    }
}
