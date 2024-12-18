package X;

import java.util.List;

/* renamed from: X.5L3, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L3 implements C4XD {
    public C4X9 A00;
    public C2A4 A01;
    public C4TM A02;
    public C4TG A03;
    public C461429y A04;
    public boolean A05;
    public InterfaceC96424Va A06;
    public InterfaceC96424Va A07;
    public C2BC A08;
    public boolean A09;
    public final int A0A;
    public final C4XC A0B;
    public final InterfaceC92404Bv A0C;
    public final C4XB A0D;
    public final C4XI A0E;
    public final InterfaceC96424Va A0F;

    public C5L3(C4XC c4xc, C4X9 c4x9, C2A4 c2a4, InterfaceC92404Bv interfaceC92404Bv, C4TM c4tm, C4TG c4tg, C4XB c4xb, C461429y c461429y, InterfaceC96424Va interfaceC96424Va, InterfaceC96424Va interfaceC96424Va2, InterfaceC96424Va interfaceC96424Va3, C2BC c2bc, int i, boolean z) {
        C4XI c4xi = C4XE.A0A;
        this.A05 = false;
        this.A03 = null;
        this.A04 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = null;
        this.A0E = c4xi;
        this.A0F = interfaceC96424Va;
        this.A0A = i * 1000;
        this.A0B = c4xc;
        this.A0D = c4xb;
        this.A0C = interfaceC92404Bv;
        this.A05 = true;
        this.A07 = interfaceC96424Va2;
        this.A06 = interfaceC96424Va3;
        this.A09 = z;
        this.A03 = c4tg;
        this.A04 = c461429y;
        this.A02 = c4tm;
        this.A01 = c2a4;
        this.A00 = c4x9;
        this.A08 = c2bc;
        if (interfaceC92404Bv != null) {
        } else {
            throw new NullPointerException("Use new DebugEventLoggerImpl(null) if you don't need to pass a logger.");
        }
    }

    @Override // X.C4XD
    public final InterfaceC97904aV ALw(C4V3 c4v3, C4WZ c4wz, C4XX c4xx, C4XZ c4xz, C122355gV c122355gV, C4YR c4yr, C92124As c92124As, C4WE c4we, InterfaceC96934Xd interfaceC96934Xd, C2BC c2bc, List list, int[] iArr, int i, int i2, long j, boolean z) {
        InterfaceC96424Va interfaceC96424Va;
        if (i2 == 1) {
            interfaceC96424Va = this.A06;
        } else if (i2 == 2) {
            interfaceC96424Va = this.A07;
        } else {
            interfaceC96424Va = this.A0F;
        }
        InterfaceC92354Bq ALy = interfaceC96424Va.ALy();
        C4XI c4xi = this.A0E;
        int i3 = this.A0A;
        boolean z2 = this.A05;
        boolean z3 = this.A09;
        boolean z4 = c4v3.A0K;
        C4TG c4tg = this.A03;
        C461429y c461429y = this.A04;
        C4TM c4tm = this.A02;
        C2A4 c2a4 = this.A01;
        InterfaceC92404Bv interfaceC92404Bv = this.A0C;
        return new C97894aU(this.A0B, this.A00, c2a4, interfaceC92404Bv, c4v3, c4tm, c4tg, this.A0D, c461429y, c4wz, c4xx, c4xi, c4xz, c122355gV, c4yr, c92124As, c4we, ALy, interfaceC96934Xd, this.A08, list, iArr, i, i2, i3, j, z, z2, z3, z4);
    }
}
