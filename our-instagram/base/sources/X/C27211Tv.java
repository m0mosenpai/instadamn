package X;

import com.facebook.tigon.TigonBodyStream;
import java.io.OutputStream;

/* renamed from: X.1Tv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C27211Tv extends OutputStream {
    public int A00;
    public boolean A01;
    public final TigonBodyStream A02;
    public final byte[] A03 = new byte[4096];
    public final /* synthetic */ C1SH A04;

    public C27211Tv(TigonBodyStream tigonBodyStream, C1SH c1sh) {
        this.A04 = c1sh;
        this.A02 = tigonBodyStream;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        int i2 = this.A00;
        if (i2 == 4096) {
            if (1 == this.A02.transferBytes(this.A03, i2)) {
                this.A01 = true;
            }
            this.A00 = 0;
            i2 = 0;
        }
        if (!this.A01) {
            if (i2 < 4096) {
                this.A03[i2] = (byte) i;
                this.A00 = i2 + 1;
                return;
            }
            throw new IllegalStateException("Check failed.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        C14360o3.A0B(bArr, 0);
        while (i2 > 0) {
            int i3 = this.A00;
            if (i3 == 4096) {
                if (1 == this.A02.transferBytes(this.A03, i3)) {
                    this.A01 = true;
                }
                this.A00 = 0;
                i3 = 0;
            }
            if (!this.A01) {
                if (i3 < 4096) {
                    int min = Math.min(4096 - i3, i2);
                    System.arraycopy(bArr, i, this.A03, i3, min);
                    this.A00 += min;
                    i += min;
                    i2 -= min;
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                return;
            }
        }
    }
}
