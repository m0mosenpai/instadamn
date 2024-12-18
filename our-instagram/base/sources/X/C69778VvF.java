package X;

/* renamed from: X.VvF, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69778VvF {
    public int A00;
    public boolean A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public final byte[] A06 = new byte[10];

    public final void A00(InterfaceC98284b7 interfaceC98284b7) {
        if (!this.A01) {
            byte[] bArr = this.A06;
            interfaceC98284b7.E3s(bArr, 0, 10);
            ((C98274b6) interfaceC98284b7).A01 = 0;
            boolean z = false;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
                byte b = bArr[7];
                if ((b & 254) == 186) {
                    if ((b & 255) == 187) {
                        z = true;
                    }
                    char c = '\b';
                    if (z) {
                        c = '\t';
                    }
                    if ((40 << ((bArr[c] >> 4) & 7)) != 0) {
                        this.A01 = true;
                    }
                }
            }
        }
    }

    public final void A01(C98094ao c98094ao, InterfaceC98054ak interfaceC98054ak) {
        if (this.A00 > 0) {
            interfaceC98054ak.ELT(c98094ao, this.A02, this.A04, this.A03, this.A05);
            this.A00 = 0;
        }
    }

    public final void A02(C98094ao c98094ao, InterfaceC98054ak interfaceC98054ak, int i, int i2, int i3, long j) {
        if (AbstractC58319PtB.A1P(this.A03, i2 + i3)) {
            if (this.A01) {
                int i4 = this.A00;
                int i5 = i4 + 1;
                this.A00 = i5;
                if (i4 == 0) {
                    this.A05 = j;
                    this.A02 = i;
                    this.A04 = 0;
                }
                this.A04 += i2;
                this.A03 = i3;
                if (i5 >= 16) {
                    A01(c98094ao, interfaceC98054ak);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(String.valueOf("TrueHD chunk samples must be contiguous in the sample queue."));
    }
}
