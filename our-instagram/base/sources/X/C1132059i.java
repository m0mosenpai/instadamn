package X;

import com.facebook.common.dextricks.Constants;

/* renamed from: X.59i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1132059i implements InterfaceC1132159j {
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A07;
    public float A08;
    public float A09;
    public int A0A;
    public int A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public AbstractC119385av A0G;
    public AbstractC27458CAa A0H;
    public C5AH A0I;
    public InterfaceC1128957x A0J;
    public AnonymousClass583 A0K;
    public boolean A0L;
    public float A05 = 1.0f;
    public float A06 = 1.0f;
    public float A00 = 1.0f;

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / this.A0J.Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A0J.Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A0J.B7e();
    }

    @Override // X.InterfaceC1132159j
    public final void EPa(float f) {
        if (this.A00 != f) {
            this.A0B |= 4;
            this.A00 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EPf(long j) {
        long j2 = this.A0C;
        long j3 = C1132359l.A01;
        if (j2 != j) {
            this.A0B |= 64;
            this.A0C = j;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EQp(float f) {
        if (this.A01 != f) {
            this.A0B |= C3OO.FLAG_MOVED;
            this.A01 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void ERU(boolean z) {
        if (this.A0L != z) {
            this.A0B |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            this.A0L = z;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void ERu(int i) {
        if (this.A0A != i) {
            this.A0B |= Constants.LOAD_RESULT_PGO;
            this.A0A = i;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EcY(AbstractC27458CAa abstractC27458CAa) {
        if (!C14360o3.A0K(this.A0H, abstractC27458CAa)) {
            this.A0B |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
            this.A0H = abstractC27458CAa;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Ecv(float f) {
        if (this.A02 != f) {
            this.A0B |= 256;
            this.A02 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Ecw(float f) {
        if (this.A03 != f) {
            this.A0B |= 512;
            this.A03 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Ecx(float f) {
        if (this.A04 != f) {
            this.A0B |= 1024;
            this.A04 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Ed7(float f) {
        if (this.A05 != f) {
            this.A0B |= 1;
            this.A05 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Ed8(float f) {
        if (this.A06 != f) {
            this.A0B |= 2;
            this.A06 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Edo(float f) {
        if (this.A07 != f) {
            this.A0B |= 32;
            this.A07 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Edp(C5AH c5ah) {
        if (!C14360o3.A0K(this.A0I, c5ah)) {
            this.A0B |= 8192;
            this.A0I = c5ah;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void Eeg(long j) {
        long j2 = this.A0E;
        long j3 = C1132359l.A01;
        if (j2 != j) {
            this.A0B |= 128;
            this.A0E = j;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EgB(long j) {
        long j2 = this.A0F;
        long j3 = C5AD.A01;
        if (j2 != j) {
            this.A0B |= 4096;
            this.A0F = j;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EgF(float f) {
        if (this.A08 != f) {
            this.A0B |= 8;
            this.A08 = f;
        }
    }

    @Override // X.InterfaceC1132159j
    public final void EgG(float f) {
        if (this.A09 != f) {
            this.A0B |= 16;
            this.A09 = f;
        }
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / this.A0J.Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * this.A0J.Awk();
    }

    public C1132059i() {
        long j = AbstractC1132259k.A00;
        this.A0C = j;
        this.A0E = j;
        this.A01 = 8.0f;
        this.A0F = C5AD.A01;
        this.A0I = C5AF.A00;
        this.A0A = 0;
        this.A0D = 9205357640488583168L;
        this.A0J = new AnonymousClass582(1.0f, 1.0f);
        this.A0K = AnonymousClass583.Ltr;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
