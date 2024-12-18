package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Wc8 implements InterfaceC92344Bp {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public boolean A05;
    public byte[] A06;
    public C4C7 A07;
    public final int A08;
    public final InterfaceC92344Bp A09;
    public final int A0A;

    private int A00() {
        C4C7 c4c7 = this.A07;
        boolean z = true;
        if (c4c7 != null) {
            long j = c4c7.A03;
            long j2 = this.A0A;
            if (j > 0) {
                j2 = Math.min(j2, j - (this.A04 - c4c7.A04));
            }
            String str = null;
            Map emptyMap = Collections.emptyMap();
            C4C7 c4c72 = this.A07;
            android.net.Uri uri = c4c72.A06;
            if (uri == null) {
                uri = android.net.Uri.EMPTY;
            }
            byte[] bArr = c4c72.A0A;
            long j3 = this.A03;
            long j4 = this.A04;
            long j5 = j3 - j4;
            if (j2 <= 0) {
                j2 = -1;
            }
            int i = c4c72.A00;
            C4C6 c4c6 = c4c72.A07;
            String str2 = c4c72.A08;
            if (str2 != null) {
                str = str2;
            }
            C4B8.A02(uri);
            if (c4c6 == null) {
                c4c6 = new C4C6();
            }
            long open = this.A09.open(new C4C7(uri, c4c6, str, emptyMap, bArr, 1, i, j5, j4, j2));
            if (open < 0 || open >= j2) {
                z = false;
            }
            this.A05 = z;
            return (int) open;
        }
        throw new C93214Fx(new C4C7(android.net.Uri.EMPTY, 0, -1), "No DataSpec when calling openInnder", 1);
    }

    @Override // X.InterfaceC92354Bq
    public final void cancel() {
        this.A09.cancel();
    }

    @Override // X.InterfaceC92344Bp
    public final void changeHttpPriority(byte b, boolean z) {
        this.A09.changeHttpPriority(b, z);
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final void close() {
        this.A09.close();
        this.A07 = null;
        this.A06 = null;
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final Map getResponseHeaders() {
        return this.A09.getResponseHeaders();
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return this.A09.getUri();
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        this.A07 = c4c7;
        this.A06 = new byte[this.A08];
        this.A03 = c4c7.A02;
        this.A04 = c4c7.A04;
        int A00 = A00();
        this.A02 = A00;
        this.A00 = 0;
        if (A00 >= 0 && A00 < this.A0A) {
            return A00;
        }
        long j = c4c7.A03;
        if (j >= 0) {
            return j;
        }
        return -1L;
    }

    @Override // X.InterfaceC92344Bp, X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte[] bArr2 = this.A06;
        if (bArr2 != null && this.A00 >= i2) {
            System.arraycopy(bArr2, this.A01, bArr, i, i2);
            this.A01 += i2;
            this.A00 -= i2;
            return i2;
        }
        int i5 = 0;
        if (bArr2 != null && (i4 = this.A00) > 0) {
            System.arraycopy(bArr2, this.A01, bArr, i, i4);
            int i6 = this.A00;
            i += i6;
            i3 = i2 - i6;
            this.A00 = 0;
        } else {
            i3 = i2;
        }
        do {
            int i7 = this.A02;
            if (i7 > 0) {
                int read = this.A09.read(bArr, i, i3);
                if (read == -1) {
                    this.A02 = 0;
                    i7 = 0;
                } else {
                    i += read;
                    i3 -= read;
                    this.A02 -= read;
                    long j = read;
                    this.A04 += j;
                    this.A03 += j;
                }
            }
            byte[] bArr3 = this.A06;
            if (bArr3 != null) {
                int i8 = this.A00;
                if (i7 + i8 <= this.A08) {
                    int i9 = this.A01;
                    if (i9 > 0) {
                        if (i8 > 0) {
                            System.arraycopy(bArr3, i9, bArr3, 0, i8);
                        }
                        this.A01 = 0;
                    }
                    while (true) {
                        i7 = this.A02;
                        if (i7 <= 0) {
                            break;
                        }
                        int read2 = this.A09.read(this.A06, this.A00, i7);
                        if (read2 == -1) {
                            this.A02 = 0;
                            i7 = 0;
                            break;
                        }
                        this.A00 += read2;
                        this.A02 -= read2;
                        long j2 = read2;
                        this.A04 += j2;
                        this.A03 += j2;
                    }
                    if (!this.A05) {
                        this.A09.close();
                        i7 = A00();
                        this.A02 = i7;
                    }
                }
                if (this.A00 <= 0 && i7 <= 0) {
                    int i10 = i2 - i3;
                    if (i10 <= 0) {
                        return -1;
                    }
                    return i10;
                }
                int read3 = read(bArr, i, i3);
                int i11 = i2 - i3;
                if (read3 != -1) {
                    i5 = read3;
                }
                return i11 + i5;
            }
            throw new C93214Fx(new C4C7(android.net.Uri.EMPTY, 0, -1), "No internal buffer", 2);
        } while (i3 != 0);
        return i2;
    }

    public Wc8(InterfaceC92344Bp interfaceC92344Bp, int i, int i2) {
        this.A09 = interfaceC92344Bp;
        this.A08 = i;
        this.A0A = i2;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        c2bc.getClass();
        this.A09.addTransferListener(c2bc);
    }
}
