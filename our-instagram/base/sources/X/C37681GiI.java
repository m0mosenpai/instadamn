package X;

import android.content.Context;

/* renamed from: X.GiI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37681GiI implements InterfaceC74263Vh {
    public final /* synthetic */ C76223bS A00;
    public final /* synthetic */ C2XI A01;
    public final /* synthetic */ C2XI A02;
    public final /* synthetic */ C2XI A03;
    public final /* synthetic */ C2XI A04;
    public final /* synthetic */ C2XI A05;
    public final /* synthetic */ C2XI A06;
    public final /* synthetic */ C51762Yz A07;

    public C37681GiI(C76223bS c76223bS, C2XI c2xi, C2XI c2xi2, C2XI c2xi3, C2XI c2xi4, C2XI c2xi5, C2XI c2xi6, C51762Yz c51762Yz) {
        this.A03 = c2xi;
        this.A04 = c2xi2;
        this.A05 = c2xi3;
        this.A06 = c2xi4;
        this.A00 = c76223bS;
        this.A02 = c2xi5;
        this.A01 = c2xi6;
        this.A07 = c51762Yz;
    }

    @Override // X.InterfaceC74263Vh
    public final void Cwm(C37905Gm2 c37905Gm2, float f, float f2, float f3, float f4) {
        C2XI c2xi = this.A03;
        Float valueOf = Float.valueOf(f);
        c2xi.A00(valueOf);
        this.A04.A00(valueOf);
        AbstractC25227BEk.A1D(this.A05, AbstractC41371ISy.A01(c37905Gm2));
        C2XI c2xi2 = this.A06;
        Context context = this.A00.A05.A0C;
        C14360o3.A07(context);
        AbstractC25227BEk.A1D(c2xi2, AbstractC41371ISy.A00(context, c37905Gm2, f2));
        AbstractC25227BEk.A1D(this.A02, f3);
        AbstractC25227BEk.A1D(this.A01, f4);
    }

    @Override // X.InterfaceC74263Vh
    public final void E4K() {
        C51762Yz c51762Yz = this.A07;
        C41612Ib2 c41612Ib2 = C41612Ib2.A00;
        Context context = this.A00.A05.A0C;
        C14360o3.A07(context);
        c51762Yz.A01(c41612Ib2.A00(context));
    }
}
