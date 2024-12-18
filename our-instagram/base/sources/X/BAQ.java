package X;

import android.content.Context;

/* loaded from: classes4.dex */
public final class BAQ extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ InterfaceC80063hv A00;
    public final /* synthetic */ C79723hN A01;
    public final /* synthetic */ InterfaceC16660sJ A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BAQ(InterfaceC80063hv interfaceC80063hv, C79723hN c79723hN, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        super(2);
        this.A02 = interfaceC16660sJ;
        this.A03 = z;
        this.A04 = z2;
        this.A01 = c79723hN;
        this.A00 = interfaceC80063hv;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C86183sp c86183sp;
        C14360o3.A0B(obj2, 1);
        C79743hP c79743hP = (C79743hP) this.A02.invoke(obj2);
        InterfaceC80343iO interfaceC80343iO = c79743hP.A02;
        if ((interfaceC80343iO instanceof C86183sp) && (c86183sp = (C86183sp) interfaceC80343iO) != null) {
            Context context = c79743hP.A00;
            if (context != null) {
                AbstractC80643it.A00(context, this.A00, c86183sp, this.A03, this.A04, AbstractC166987dD.A1a(this.A01.A0A.A0C.invoke()), true);
                return new C79773hS(new C50158MDl(c86183sp, 4));
            }
            throw AbstractC166987dD.A14(AbstractC111324zv.A00(845));
        }
        throw AbstractC166987dD.A14("Should have a native controller");
    }
}
