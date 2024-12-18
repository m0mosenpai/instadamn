package X;

/* renamed from: X.6Ld, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C137576Ld implements InterfaceC1128957x {
    public C5DV A00 = C137586Le.A00;
    public AnonymousClass699 A01;
    public InterfaceC1129057z A02;
    public InterfaceC16820sZ A03;

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
        return i / Awk();
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

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.699] */
    public final AnonymousClass699 A00(InterfaceC16660sJ interfaceC16660sJ) {
        ?? obj = new Object();
        obj.A00 = interfaceC16660sJ;
        this.A01 = obj;
        return obj;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A00.getDensity().Awk();
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A00.getDensity().B7e();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * Awk();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
