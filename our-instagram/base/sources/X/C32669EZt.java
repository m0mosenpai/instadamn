package X;

import com.instagram.registration.model.RegFlowExtras;

/* renamed from: X.EZt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32669EZt extends AbstractRunnableC14200nk {
    public final /* synthetic */ AbstractC59962oe A00;
    public final /* synthetic */ C07270a1 A01;
    public final /* synthetic */ AbstractC32549EUz A02;
    public final /* synthetic */ RegFlowExtras A03;
    public final /* synthetic */ Integer A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32669EZt(AbstractC59962oe abstractC59962oe, C07270a1 c07270a1, AbstractC32549EUz abstractC32549EUz, RegFlowExtras regFlowExtras, Integer num) {
        super(707);
        this.A00 = abstractC59962oe;
        this.A01 = c07270a1;
        this.A03 = regFlowExtras;
        this.A04 = num;
        this.A02 = abstractC32549EUz;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC59962oe abstractC59962oe = this.A00;
        C07270a1 c07270a1 = this.A01;
        RegFlowExtras regFlowExtras = this.A03;
        Integer num = this.A04;
        AbstractC32549EUz abstractC32549EUz = this.A02;
        C1ON A00 = AbstractC34291FAl.A00(abstractC59962oe.requireContext(), c07270a1, regFlowExtras, num, null, null);
        A00.A00 = abstractC32549EUz;
        abstractC59962oe.schedule(A00);
    }
}
