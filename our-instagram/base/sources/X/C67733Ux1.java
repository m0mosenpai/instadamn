package X;

import java.io.IOException;

/* renamed from: X.Ux1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67733Ux1 extends AbstractC98514bU {
    public long A00;
    public boolean A01;
    public final int A02;
    public final C4B6 A03;

    @Override // X.InterfaceC98244b3
    public final void AGY() {
    }

    @Override // X.AbstractC98474bQ
    public final boolean A01() {
        return this.A01;
    }

    @Override // X.InterfaceC98244b3
    public final void ChG() {
        C98134as c98134as = ((AbstractC98514bU) this).A00;
        C4B8.A01(c98134as);
        for (C98044aj c98044aj : c98134as.A00) {
            if (c98044aj.A07 != 0) {
                c98044aj.A07 = 0L;
                c98044aj.A0H = true;
            }
        }
        int i = 0;
        InterfaceC98054ak F88 = c98134as.F88(0, this.A02);
        F88.AWa(this.A03);
        try {
            C4C7 c4c7 = this.A06;
            long j = this.A00;
            long j2 = c4c7.A03;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            C4C7 A00 = c4c7.A00(j, j3);
            C98254b4 c98254b4 = this.A07;
            long open = c98254b4.open(A00);
            if (open != -1) {
                open += this.A00;
            }
            C98274b6 c98274b6 = new C98274b6(c98254b4, this.A00, open);
            do {
                this.A00 += i;
                i = F88.ELR(c98274b6, Integer.MAX_VALUE, 0, true);
            } while (i != -1);
            F88.ELT(null, 1, (int) this.A00, 0, ((AbstractC98234b2) this).A04);
            try {
                c98254b4.close();
            } catch (IOException unused) {
            }
            this.A01 = true;
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public C67733Ux1(C4B6 c4b6, C4B6 c4b62, InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, Object obj, int i, int i2, long j, long j2, long j3, long j4) {
        super(c4b6, interfaceC92354Bq, c4c7, obj, i, j, j2, -9223372036854775807L, -9223372036854775807L, j3, j4);
        this.A02 = i2;
        this.A03 = c4b62;
    }
}
