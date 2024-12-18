package X;

/* renamed from: X.WUm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70409WUm implements C1V7 {
    public final C69372VmI A00;
    public final C69372VmI A01;
    public final VY7 A02;
    public final C68257VJu A03;
    public final C1WD A04;
    public final C69706Vu1 A05;
    public final InterfaceC09390do A06;

    public C70409WUm(C68257VJu c68257VJu, C69481Vo4 c69481Vo4) {
        C69706Vu1 c69706Vu1 = c69481Vo4.A07;
        C1WD c1wd = c69481Vo4.A04;
        VY7 vy7 = c69481Vo4.A03;
        C69372VmI c69372VmI = c69481Vo4.A00;
        C69372VmI c69372VmI2 = c69481Vo4.A01;
        AbstractC25233BEq.A0w(2, c69706Vu1, c1wd, vy7);
        AbstractC167017dG.A1U(c69372VmI, c69372VmI2);
        this.A03 = c68257VJu;
        this.A05 = c69706Vu1;
        this.A04 = c1wd;
        this.A02 = vy7;
        this.A00 = c69372VmI;
        this.A01 = c69372VmI2;
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A04, new C57243PbR(this, 18));
    }

    @Override // X.C1V7
    public final /* bridge */ /* synthetic */ Object get() {
        return this.A06.getValue();
    }
}
