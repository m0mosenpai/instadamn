package X;

import android.os.SystemClock;
import java.io.IOException;
import java.util.Iterator;

/* loaded from: classes11.dex */
public final class WVB implements C2BB {
    public long A00;
    public long A01;
    public long A02;
    public String A03;
    public boolean A04;
    public final /* synthetic */ C70167WEj A05;

    @Override // X.C2BB
    public final void DHL(EnumC92424Bx enumC92424Bx, long j, long j2, long j3) {
    }

    @Override // X.C2BB
    public final void DHM(long j, long j2) {
    }

    @Override // X.C2BB
    public final void Dv8() {
    }

    @Override // X.C2BD
    public final void DvD(String str, Object obj) {
    }

    @Override // X.C2BB
    public final void DvF(EnumC92424Bx enumC92424Bx, C4C7 c4c7) {
    }

    @Override // X.C2BB
    public final void ETY(String str) {
    }

    public WVB(C70167WEj c70167WEj) {
        this.A05 = c70167WEj;
        this.A03 = "";
    }

    @Override // X.C2BC
    public final void D15(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, int i, boolean z) {
        if (z && interfaceC92354Bq != null && (interfaceC92354Bq instanceof C4Bz)) {
            C4Bz c4Bz = (C4Bz) interfaceC92354Bq;
            this.A03 = c4Bz.A0L.A07;
            this.A04 = c4Bz.A0P;
            this.A02 = c4Bz.A02;
            long j = this.A00 + i;
            this.A00 = j;
            long j2 = this.A01;
            if (j2 > 0 && j >= 131072) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = elapsedRealtime - j2;
                this.A01 = elapsedRealtime;
                Iterator it = this.A05.A0A.iterator();
                while (it.hasNext()) {
                    ((C7NZ) it.next()).A00(this.A03, "", j3, this.A00, this.A02, this.A04);
                }
                this.A00 = 0L;
            }
        }
    }

    @Override // X.C2BC
    public final void Dv9(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z) {
        if (z && interfaceC92354Bq != null && (interfaceC92354Bq instanceof C4Bz)) {
            C4Bz c4Bz = (C4Bz) interfaceC92354Bq;
            this.A03 = c4Bz.A0L.A07;
            this.A04 = c4Bz.A0P;
            this.A02 = c4Bz.A02;
            long j = this.A01;
            if (j > 0 && this.A00 > 0) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - j;
                Iterator it = this.A05.A0A.iterator();
                while (it.hasNext()) {
                    ((C7NZ) it.next()).A00(this.A03, "", elapsedRealtime, this.A00, this.A02, this.A04);
                }
            }
        }
    }

    @Override // X.C2BB
    public final void DvA(IOException iOException) {
        Iterator it = this.A05.A0A.iterator();
        while (it.hasNext()) {
            ((C7NZ) it.next()).A00(this.A03, String.valueOf(iOException), 0L, 0L, this.A02, this.A04);
        }
    }

    @Override // X.C2BC
    public final void DvH(InterfaceC92354Bq interfaceC92354Bq, C4C7 c4c7, boolean z, boolean z2) {
        if (z && interfaceC92354Bq != null && (interfaceC92354Bq instanceof C4Bz)) {
            C4Bz c4Bz = (C4Bz) interfaceC92354Bq;
            this.A03 = c4Bz.A0L.A07;
            this.A04 = c4Bz.A0P;
            this.A02 = c4Bz.A02;
            this.A01 = SystemClock.elapsedRealtime();
            this.A00 = 0L;
        }
    }

    public WVB() {
    }
}
