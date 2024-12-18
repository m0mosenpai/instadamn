package X;

/* renamed from: X.7ib, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C170227ib implements C2YT {
    public final InterfaceC16820sZ A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final C2Z7 A04;

    public C170227ib(C2Z7 c2z7, InterfaceC16820sZ interfaceC16820sZ, int i, int i2, int i3) {
        C14360o3.A0B(c2z7, 1);
        this.A04 = c2z7;
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A00 = interfaceC16820sZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, X.2Vj] */
    @Override // X.C2YT
    public final C2YU Cgz(C2YR c2yr, long j) {
        C77783e3 c77783e3;
        C14360o3.A0B(c2yr, 0);
        ?? obj = new Object();
        C2Z7 c2z7 = this.A04;
        int A00 = AbstractC170237ic.A00(AbstractC78603fS.A01(j), this.A02 + this.A01);
        int A002 = AbstractC170237ic.A00(AbstractC78603fS.A00(j), this.A03);
        if (!c2z7.AFm() && !c2z7.CgB()) {
            c77783e3 = null;
        } else {
            c77783e3 = new C77783e3(null, new C206999Ee(this, 19));
        }
        c2z7.CpB(c77783e3, obj, A00, A002);
        return new C2YU(null, Math.max(C78613fT.A03(j), obj.A01), Math.max(C78613fT.A02(j), obj.A00));
    }

    @Override // X.C2VB
    public final /* bridge */ /* synthetic */ boolean CTz(Object obj) {
        return CCS.A00(this, (C2YT) obj);
    }
}
