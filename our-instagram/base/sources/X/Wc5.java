package X;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes11.dex */
public final class Wc5 implements InterfaceC92354Bq {
    public int A00;
    public C2BB A01;
    public C4C7 A02;
    public final int A03;
    public final boolean A04;
    public final byte[] A05;

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ void cancel() {
    }

    @Override // X.InterfaceC92354Bq
    public final android.net.Uri getUri() {
        return null;
    }

    @Override // X.InterfaceC92354Bq
    public final void close() {
        C2BB c2bb = this.A01;
        if (c2bb != null) {
            C4C7 c4c7 = this.A02;
            C4C7 c4c72 = C4C7.A0B;
            if (c4c7 == null) {
                c4c7 = C4C7.A0B;
            }
            c2bb.Dv9(this, c4c7, false);
            this.A01 = null;
        }
    }

    @Override // X.InterfaceC92354Bq
    public final long open(C4C7 c4c7) {
        this.A02 = c4c7;
        C2BB c2bb = this.A01;
        if (c2bb != null) {
            c2bb.DvF(EnumC92424Bx.CACHED, c4c7);
        }
        this.A00 = 0;
        C2BB c2bb2 = this.A01;
        if (c2bb2 != null) {
            c2bb2.DvH(this, c4c7, false, false);
        }
        return this.A03;
    }

    @Override // X.InterfaceC92364Br
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.A03;
        int i4 = this.A00;
        int i5 = i3 - i4;
        if (i5 == 0) {
            return -1;
        }
        if (i2 > i5) {
            i2 = i5;
        }
        byte[] bArr2 = this.A05;
        if (bArr2 == null) {
            return 0;
        }
        if (i2 > 0) {
            System.arraycopy(bArr2, i4, bArr, i, i2);
            this.A00 += i2;
            C2BB c2bb = this.A01;
            if (c2bb != null) {
                C4C7 c4c7 = this.A02;
                C4C7 c4c72 = C4C7.A0B;
                if (c4c7 == null) {
                    c4c7 = C4C7.A0B;
                }
                c2bb.D15(this, c4c7, i2, false);
            }
        }
        return i2;
    }

    public Wc5(C2BB c2bb, byte[] bArr, int i, boolean z) {
        this.A05 = bArr;
        this.A03 = i;
        this.A01 = c2bb;
        this.A04 = z;
    }

    @Override // X.InterfaceC92354Bq
    public final void addTransferListener(C2BC c2bc) {
        C2BB wva;
        c2bc.getClass();
        if (c2bc instanceof C2BB) {
            wva = (C2BB) c2bc;
        } else {
            wva = new WVA(c2bc);
        }
        this.A01 = wva;
    }

    @Override // X.InterfaceC92354Bq
    public final /* synthetic */ Map getResponseHeaders() {
        return Collections.emptyMap();
    }
}
