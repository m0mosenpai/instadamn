package X;

import java.io.InputStream;

/* renamed from: X.ReC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C61040ReC extends InputStream {
    public final /* synthetic */ TWW A00;

    public C61040ReC(TWW tww) {
        this.A00 = tww;
    }

    @Override // java.io.InputStream
    public final int available() {
        TWW tww = this.A00;
        if (!tww.A00) {
            return (int) Math.min(tww.A01.A00, 2147483647L);
        }
        throw AbstractC58321PtD.A0g();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.A00.close();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        TWW tww = this.A00;
        if (!tww.A00) {
            SUN.A00(bArr.length, i, i2);
            TWX twx = tww.A01;
            if (twx.A00 == 0 && TWW.A00(twx, tww) == -1) {
                return -1;
            }
            return twx.A02(bArr, i, i2);
        }
        throw AbstractC58321PtD.A0g();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(this.A00);
        return AbstractC166997dE.A0x(".inputStream()", A1C);
    }

    @Override // java.io.InputStream
    public final int read() {
        TWW tww = this.A00;
        if (!tww.A00) {
            TWX twx = tww.A01;
            if (twx.A00 == 0 && TWW.A00(twx, tww) == -1) {
                return -1;
            }
            return twx.readByte() & 255;
        }
        throw AbstractC58321PtD.A0g();
    }
}
