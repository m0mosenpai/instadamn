package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.OoM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55695OoM implements C1A2 {
    public final O1Q A00;
    public final C1A2 A01;

    @Override // X.C1A2
    public final int CAh() {
        return 1 << 0;
    }

    public static long A00(C55695OoM c55695OoM, long j) {
        return C0UM.A01(c55695OoM.A00.A00, j);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhA(long j) {
        return this.A01.AhA(A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhB(long j, boolean z) {
        return this.A01.AhB(A00(this, j), z);
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhE(C06090Tz c06090Tz, long j) {
        return this.A01.AhE(c06090Tz, A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final boolean AhF(C06090Tz c06090Tz, long j, boolean z) {
        return this.A01.AhF(c06090Tz, A00(this, j), z);
    }

    @Override // X.InterfaceC18540vh
    public final double Az2(long j) {
        return this.A01.Az2(A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final double AzA(C06090Tz c06090Tz, double d, long j) {
        return this.A01.AzA(c06090Tz, d, A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final double AzB(C06090Tz c06090Tz, long j) {
        return this.A01.AzB(c06090Tz, A00(this, j));
    }

    @Override // X.C0U1
    public final Map B1E() {
        return this.A01.B1E();
    }

    @Override // X.C1A2
    public final String BOq(long j) {
        return this.A01.BOq(A00(this, j));
    }

    @Override // X.C1A2
    public final int BOv(long j) {
        return this.A01.BOv(A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final long BP2(long j) {
        return this.A01.BP2(A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final long BP3(long j, long j2) {
        return this.A01.BP3(A00(this, j), j2);
    }

    @Override // X.InterfaceC18540vh
    public final long BPE(C06090Tz c06090Tz, long j, long j2) {
        return this.A01.BPE(c06090Tz, A00(this, j), j2);
    }

    @Override // X.InterfaceC18540vh
    public final long BPF(C06090Tz c06090Tz, long j) {
        return this.A01.BPF(c06090Tz, A00(this, j));
    }

    @Override // X.C1A2
    public final String Bo0() {
        return this.A01.Bo0();
    }

    @Override // X.C1A2
    public final String Bo8() {
        return this.A01.Bo8();
    }

    @Override // X.C1A2
    public final long BoE() {
        return this.A01.BoE();
    }

    @Override // X.InterfaceC18540vh
    public final String C2k(long j) {
        return this.A01.C2k(A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final String C2l(long j, String str) {
        return this.A01.C2l(A00(this, j), "__NVAL__");
    }

    @Override // X.InterfaceC18540vh
    public final String C2x(C06090Tz c06090Tz, long j) {
        return this.A01.C2x(c06090Tz, A00(this, j));
    }

    @Override // X.InterfaceC18540vh
    public final String C2y(C06090Tz c06090Tz, String str, long j) {
        return this.A01.C2y(c06090Tz, str, A00(this, j));
    }

    @Override // X.C1A2
    public final List CCi() {
        return this.A01.CCi();
    }

    @Override // X.InterfaceC18540vh
    public final void CjF(long j) {
        this.A01.CjF(A00(this, j));
    }

    public C55695OoM(O1Q o1q, C1A2 c1a2) {
        this.A00 = o1q;
        this.A01 = c1a2;
    }

    @Override // X.InterfaceC18540vh
    public final double Az3(long j, double d) {
        return this.A01.Az3(A00(this, j), -123.5d);
    }
}
