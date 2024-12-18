package X;

import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.5T8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5T8 implements C4Z0, C4YW {
    public int A00;
    public boolean A01;
    public byte[] A02;
    public final long A03;
    public final C4B6 A04;
    public final C4XX A05;
    public final C4WU A06;
    public final C4XO A07;
    public final C98004af A08;
    public final InterfaceC96424Va A09;
    public final C4C7 A0A;
    public final C2BC A0B;
    public final ArrayList A0C;

    @Override // X.C4Z1
    public final void AGb(long j) {
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        return j;
    }

    @Override // X.C4Z0
    public final void Coz() {
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPd(InterfaceC98244b3 interfaceC98244b3, long j, long j2) {
        C126755oF c126755oF = (C126755oF) interfaceC98244b3;
        C98254b4 c98254b4 = c126755oF.A03;
        this.A00 = (int) c98254b4.A00;
        byte[] bArr = c126755oF.A00;
        bArr.getClass();
        this.A02 = bArr;
        this.A01 = true;
        this.A05.A05(this.A04, new C98264b5(c98254b4.A01, c126755oF.A02, c98254b4.A02), null, c126755oF, null, 1, -1, 0, 0L, this.A03);
    }

    @Override // X.C4YW
    public final /* synthetic */ void DPv(InterfaceC98244b3 interfaceC98244b3, int i, long j, long j2) {
    }

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    @Override // X.C4Z0
    public final long E7z() {
        return -9223372036854775807L;
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0C;
            if (i < arrayList.size()) {
                C5o7 c5o7 = (C5o7) arrayList.get(i);
                if (c5o7.A00 == 2) {
                    c5o7.A00 = 1;
                }
                i++;
            } else {
                return j;
            }
        }
    }

    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        for (int i = 0; i < c4weArr.length; i++) {
            InterfaceC97394Yz interfaceC97394Yz = interfaceC97394YzArr[i];
            if (interfaceC97394Yz != null && (c4weArr[i] == null || !zArr[i])) {
                this.A0C.remove(interfaceC97394Yz);
                interfaceC97394YzArr[i] = null;
            }
            if (interfaceC97394YzArr[i] == null && c4weArr[i] != null) {
                C5o7 c5o7 = new C5o7(this);
                this.A0C.add(c5o7);
                interfaceC97394YzArr[i] = c5o7;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        if (!this.A01) {
            C98004af c98004af = this.A08;
            if (c98004af.A01 == null && c98004af.A02 == null) {
                InterfaceC92354Bq ALy = this.A09.ALy();
                C2BC c2bc = this.A0B;
                if (c2bc != null) {
                    ALy.addTransferListener(c2bc);
                }
                C4C7 c4c7 = this.A0A;
                C126755oF c126755oF = new C126755oF(ALy, c4c7);
                int i = ((C4XN) this.A07).A00;
                if (i == -1) {
                    i = 3;
                }
                c98004af.A02(this, c126755oF, i);
                this.A05.A04(this.A04, new C98264b5(c4c7), null, 1, -1, 0, 0L, this.A03);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C4Z0, X.C4Z1
    public final /* synthetic */ boolean AJr(C69080VhW c69080VhW) {
        return AJq(c69080VhW.A01, -9223372036854775807L);
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        if (this.A01) {
            return Long.MIN_VALUE;
        }
        return 0L;
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        if (!this.A01 && this.A08.A01 == null) {
            return 0L;
        }
        return Long.MIN_VALUE;
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        return this.A06;
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ void DPZ(InterfaceC98244b3 interfaceC98244b3, long j, long j2, boolean z) {
        C126755oF c126755oF = (C126755oF) interfaceC98244b3;
        C98254b4 c98254b4 = c126755oF.A03;
        this.A05.A03(null, new C98264b5(c98254b4.A01, c126755oF.A02, c98254b4.A02), null, 1, -1, 0, 0L, this.A03);
    }

    @Override // X.C4YW
    public final /* bridge */ /* synthetic */ C98014ag DPf(InterfaceC98244b3 interfaceC98244b3, IOException iOException, int i, long j, long j2) {
        C98014ag c98014ag;
        int i2;
        boolean z;
        C126755oF c126755oF = (C126755oF) interfaceC98244b3;
        C98254b4 c98254b4 = c126755oF.A03;
        C98264b5 c98264b5 = new C98264b5(c98254b4.A01, c126755oF.A02, c98254b4.A02);
        C4B6 c4b6 = this.A04;
        long j3 = this.A03;
        C98534bW c98534bW = new C98534bW(c4b6, null, 1, -1, 0, 0L, Util.A08(j3));
        C4XO c4xo = this.A07;
        long Boy = c4xo.Boy(new C65878Tvh(c98264b5, c98534bW, iOException, i));
        if (Boy != -9223372036854775807L) {
            int i3 = ((C4XN) c4xo).A00;
            if (i3 == -1) {
                i3 = 3;
            }
            if (i < i3) {
                c98014ag = new C98014ag(0, Boy);
                i2 = c98014ag.A00;
                z = true;
                if (i2 != 0 && i2 != 1) {
                    z = false;
                }
                this.A05.A01(c4b6, c98264b5, iOException, null, 1, -1, 0, 0L, j3, !z);
                return c98014ag;
            }
        }
        AbstractC46512Bo.A06("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
        this.A01 = true;
        c98014ag = C98004af.A04;
        i2 = c98014ag.A00;
        z = true;
        if (i2 != 0) {
            z = false;
        }
        this.A05.A01(c4b6, c98264b5, iOException, null, 1, -1, 0, 0L, j3, !z);
        return c98014ag;
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        if (this.A08.A01 == null) {
            return false;
        }
        return true;
    }

    public C5T8(C4B6 c4b6, C4XX c4xx, InterfaceC96424Va interfaceC96424Va, C4C7 c4c7, C4XO c4xo, C2BC c2bc, long j) {
        this.A0A = c4c7;
        this.A09 = interfaceC96424Va;
        this.A0B = c2bc;
        this.A04 = c4b6;
        this.A03 = j;
        this.A07 = c4xo;
        this.A05 = c4xx;
        C4WU c4wu = C4WU.A03;
        this.A06 = new C4WU(new C4WV("", c4b6));
        this.A0C = new ArrayList();
        this.A08 = new C98004af("Loader:SingleSampleMediaPeriod");
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        interfaceC96664Wb.DaW(this);
    }
}
