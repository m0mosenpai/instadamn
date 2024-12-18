package X;

import java.io.IOException;

/* renamed from: X.4b1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C98224b1 extends AbstractC98234b2 {
    public InterfaceC98144at A00;
    public long A01;
    public final C4XG A02;
    public volatile boolean A03;

    public C98224b1(C4B6 c4b6, C4XG c4xg, InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, Object obj, int i) {
        super(c4b6, interfaceC92354Bq, c4c7, obj, 2, i, -9223372036854775807L, -9223372036854775807L);
        this.A02 = c4xg;
    }

    @Override // X.InterfaceC98244b3
    public final void AGY() {
        this.A03 = true;
    }

    @Override // X.InterfaceC98244b3
    public final void ChG() {
        if (this.A01 == 0) {
            this.A02.CNn(this.A00, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C4C7 c4c7 = this.A06;
            long j = this.A01;
            long j2 = c4c7.A03;
            long j3 = -1;
            if (j2 != -1) {
                j3 = j2 - j;
            }
            C4C7 A00 = c4c7.A00(j, j3);
            C98254b4 c98254b4 = this.A07;
            C98274b6 c98274b6 = new C98274b6(c98254b4, A00.A02, c98254b4.open(A00));
            while (!this.A03) {
                try {
                    int E7m = ((C4XE) this.A02).A05.E7m(c98274b6, C4XE.A09);
                    boolean z = false;
                    if (E7m != 1) {
                        z = true;
                    }
                    C4B8.A04(z);
                    if (E7m != 0) {
                        break;
                    }
                } finally {
                    this.A01 = c98274b6.A02 - c4c7.A02;
                }
            }
            try {
                c98254b4.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            try {
                this.A07.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }
}
