package X;

import java.io.IOException;

/* renamed from: X.5Py, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C116695Py implements C4Z0, InterfaceC96664Wb {
    public long A00 = -9223372036854775807L;
    public InterfaceC96664Wb A01;
    public C4Z0 A02;
    public C4XW A03;
    public final long A04;
    public final C4WX A05;
    public final InterfaceC96344Us A06;

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    public final void A00(C4WX c4wx) {
        long j = this.A04;
        long j2 = this.A00;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        C4XW c4xw = this.A03;
        c4xw.getClass();
        C4Z0 AMl = c4xw.AMl(c4wx, this.A06, j);
        this.A02 = AMl;
        if (this.A01 != null) {
            AMl.E5S(this, j);
        }
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null) {
            c4z0.AGb(j);
        }
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null && c4z0.AJq(j, j2)) {
            return true;
        }
        return false;
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJr(C69080VhW c69080VhW) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null && c4z0.AJr(c69080VhW)) {
            return true;
        }
        return false;
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        this.A02.APa(j, z);
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        return this.A02.AZz(c4tt, j);
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 == null) {
            return 0L;
        }
        return c4z0.Aii(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        return this.A02.Aik();
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        return this.A02.BWx();
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        return this.A02.CAF();
    }

    @Override // X.C4Z0
    public final void Coz() {
        try {
            C4Z0 c4z0 = this.A02;
            if (c4z0 != null) {
                c4z0.Coz();
                return;
            }
            C4XW c4xw = this.A03;
            if (c4xw != null) {
                c4xw.Cp0();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        this.A01.D7l(this);
    }

    @Override // X.InterfaceC96664Wb
    public final void DaW(C4Z0 c4z0) {
        this.A01.DaW(this);
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A01 = interfaceC96664Wb;
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null) {
            long j2 = this.A04;
            long j3 = this.A00;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            c4z0.E5S(this, j2);
        }
    }

    @Override // X.C4Z0
    public final long E7z() {
        return this.A02.E7z();
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
        this.A02.ECm(j);
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        return this.A02.EMn(j, z);
    }

    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        long j2 = this.A00;
        if (j2 != -9223372036854775807L && j == this.A04) {
            this.A00 = -9223372036854775807L;
        } else {
            j2 = j;
        }
        return this.A02.EMx(interfaceC97394YzArr, c4weArr, zArr, zArr2, j2);
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null) {
            c4z0.Eax(z);
        }
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null) {
            c4z0.FBK(b, z);
        }
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        C4Z0 c4z0 = this.A02;
        if (c4z0 != null && c4z0.isLoading()) {
            return true;
        }
        return false;
    }

    public C116695Py(C4WX c4wx, InterfaceC96344Us interfaceC96344Us, long j) {
        this.A05 = c4wx;
        this.A06 = interfaceC96344Us;
        this.A04 = j;
    }
}
