package X;

import android.app.Activity;

/* loaded from: classes8.dex */
public final class MIR extends C0YY implements InterfaceC16660sJ {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ L5T A01;
    public final /* synthetic */ C7E8 A02;
    public final /* synthetic */ C158797Aq A03;
    public final /* synthetic */ InterfaceC08830cm A04;
    public final /* synthetic */ InterfaceC08830cm A05;
    public final /* synthetic */ boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MIR(Activity activity, L5T l5t, C7E8 c7e8, C158797Aq c158797Aq, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, boolean z) {
        super(1);
        this.A02 = c7e8;
        this.A01 = l5t;
        this.A00 = activity;
        this.A04 = interfaceC08830cm;
        this.A05 = interfaceC08830cm2;
        this.A06 = z;
        this.A03 = c158797Aq;
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        float A09 = AbstractC166987dD.A09(obj);
        L5T l5t = this.A01;
        C7E8.A00(this.A00, l5t, this.A03, this.A04, this.A05, A09, this.A06);
        return C0eB.A00;
    }
}
