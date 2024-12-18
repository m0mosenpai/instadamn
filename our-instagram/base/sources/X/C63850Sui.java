package X;

import java.io.InputStream;

/* renamed from: X.Sui, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63850Sui implements InterfaceC65560Tmg {
    public final InputStream A00;

    @Override // X.InterfaceC65560Tmg
    public final int E7o(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = this.A00.read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new C61022Rdq();
        }
        return i2;
    }

    @Override // X.InterfaceC65560Tmg
    public final short CC5() {
        int read = this.A00.read();
        if (read != -1) {
            return (short) read;
        }
        throw new C61022Rdq();
    }

    @Override // X.InterfaceC65560Tmg
    public final long skip(long j) {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = this.A00;
            long skip = inputStream.skip(j2);
            if (skip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                skip = 1;
            }
            j2 -= skip;
        }
        return j - j2;
    }

    public C63850Sui(InputStream inputStream) {
        this.A00 = inputStream;
    }

    @Override // X.InterfaceC65560Tmg
    public final int CC4() {
        return (CC5() << 8) | CC5();
    }
}
