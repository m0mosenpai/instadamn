package X;

import com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive;
import com.instagram.model.shopping.productfeed.ProductFeedResponse;

/* loaded from: classes7.dex */
public class HB3 extends C40781ul implements InterfaceC55612h1, InterfaceC74303Vl {
    public IgFundedIncentive A00;
    public C39696HjS A01;
    public ProductFeedResponse A02;
    public long A04 = -1;
    public long A03 = -1;

    @Override // X.InterfaceC74303Vl
    public final boolean CQG() {
        return true;
    }

    @Override // X.InterfaceC74303Vl
    public final boolean CQT() {
        return false;
    }

    @Override // X.InterfaceC55612h1
    public final /* synthetic */ void EQh(String str) {
    }

    @Override // X.InterfaceC55612h1
    public final long AjZ() {
        return this.A03;
    }

    @Override // X.InterfaceC55612h1
    public final long Ajf() {
        return this.A04;
    }

    @Override // X.InterfaceC55612h1
    public final boolean CR4() {
        return AbstractC167007dF.A1M((this.A04 > (-1L) ? 1 : (this.A04 == (-1L) ? 0 : -1)));
    }

    @Override // X.InterfaceC74303Vl
    public final String getNextMaxId() {
        return this.A02.A01;
    }

    @Override // X.InterfaceC55612h1
    public final void EQg(long j) {
        this.A03 = j;
    }

    @Override // X.InterfaceC55612h1
    public final void EQi(long j) {
        this.A04 = j;
    }
}
