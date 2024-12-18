package X;

/* renamed from: X.5zk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C133185zk implements C4Z0, InterfaceC96664Wb {
    public InterfaceC96664Wb A00;
    public final C4Z0 A01;
    public final long A02;

    @Override // X.C4Z0
    public final long E53(long j) {
        return 0L;
    }

    @Override // X.C4Z1
    public final void AGb(long j) {
        this.A01.AGb(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean AJq(long j, long j2) {
        return this.A01.AJq(j - this.A02, j2);
    }

    @Override // X.C4Z0, X.C4Z1
    public final /* synthetic */ boolean AJr(C69080VhW c69080VhW) {
        return AJq(c69080VhW.A01, -9223372036854775807L);
    }

    @Override // X.C4Z0
    public final void APa(long j, boolean z) {
        this.A01.APa(j - this.A02, z);
    }

    @Override // X.C4Z0
    public final long AZz(C4TT c4tt, long j) {
        C4Z0 c4z0 = this.A01;
        long j2 = this.A02;
        return c4z0.AZz(c4tt, j - j2) + j2;
    }

    @Override // X.C4Z1
    public final long Aii(long j) {
        return this.A01.Aii(j);
    }

    @Override // X.C4Z0, X.C4Z1
    public final long Aik() {
        long Aik = this.A01.Aik();
        if (Aik == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.A02 + Aik;
    }

    @Override // X.C4Z0, X.C4Z1
    public final long BWx() {
        long BWx = this.A01.BWx();
        if (BWx == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return this.A02 + BWx;
    }

    @Override // X.C4Z0
    public final C4WU CAF() {
        return this.A01.CAF();
    }

    @Override // X.C4Z0
    public final void Coz() {
        this.A01.Coz();
    }

    @Override // X.InterfaceC96674Wc
    public final /* bridge */ /* synthetic */ void D7l(C4Z1 c4z1) {
        InterfaceC96664Wb interfaceC96664Wb = this.A00;
        interfaceC96664Wb.getClass();
        interfaceC96664Wb.D7l(this);
    }

    @Override // X.InterfaceC96664Wb
    public final void DaW(C4Z0 c4z0) {
        InterfaceC96664Wb interfaceC96664Wb = this.A00;
        interfaceC96664Wb.getClass();
        interfaceC96664Wb.DaW(this);
    }

    @Override // X.C4Z0
    public final void E5S(InterfaceC96664Wb interfaceC96664Wb, long j) {
        this.A00 = interfaceC96664Wb;
        this.A01.E5S(this, j - this.A02);
    }

    @Override // X.C4Z0
    public final long E7z() {
        long E7z = this.A01.E7z();
        if (E7z == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.A02 + E7z;
    }

    @Override // X.C4Z0, X.C4Z1
    public final void ECm(long j) {
        this.A01.ECm(j - this.A02);
    }

    @Override // X.C4Z0
    public final long EMn(long j, boolean z) {
        C4Z0 c4z0 = this.A01;
        long j2 = this.A02;
        return c4z0.EMn(j - j2, z) + j2;
    }

    @Override // X.C4Z0
    public final long EMx(InterfaceC97394Yz[] interfaceC97394YzArr, C4WE[] c4weArr, boolean[] zArr, boolean[] zArr2, long j) {
        int length = interfaceC97394YzArr.length;
        InterfaceC97394Yz[] interfaceC97394YzArr2 = new InterfaceC97394Yz[length];
        int i = 0;
        while (true) {
            InterfaceC97394Yz interfaceC97394Yz = null;
            if (i >= length) {
                break;
            }
            C70536Wbx c70536Wbx = (C70536Wbx) interfaceC97394YzArr[i];
            if (c70536Wbx != null) {
                interfaceC97394Yz = c70536Wbx.A00;
            }
            interfaceC97394YzArr2[i] = interfaceC97394Yz;
            i++;
        }
        C4Z0 c4z0 = this.A01;
        long j2 = this.A02;
        long EMx = c4z0.EMx(interfaceC97394YzArr2, c4weArr, zArr, zArr2, j - j2);
        for (int i2 = 0; i2 < length; i2++) {
            InterfaceC97394Yz interfaceC97394Yz2 = interfaceC97394YzArr2[i2];
            if (interfaceC97394Yz2 == null) {
                interfaceC97394YzArr[i2] = null;
            } else {
                InterfaceC97394Yz interfaceC97394Yz3 = interfaceC97394YzArr[i2];
                if (interfaceC97394Yz3 == null || ((C70536Wbx) interfaceC97394Yz3).A00 != interfaceC97394Yz2) {
                    interfaceC97394YzArr[i2] = new C70536Wbx(interfaceC97394Yz2, j2);
                }
            }
        }
        return EMx + j2;
    }

    @Override // X.C4Z1
    public final void Eax(boolean z) {
        this.A01.Eax(z);
    }

    @Override // X.C4Z1
    public final void FBK(byte b, boolean z) {
        this.A01.FBK(b, z);
    }

    @Override // X.C4Z0, X.C4Z1
    public final boolean isLoading() {
        return this.A01.isLoading();
    }

    public C133185zk(C4Z0 c4z0, long j) {
        this.A01 = c4z0;
        this.A02 = j;
    }
}
