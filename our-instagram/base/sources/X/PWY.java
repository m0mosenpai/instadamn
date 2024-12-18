package X;

import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.instagram.mainfeed.data.datasource.local.MainFeedLocalDataSource;

/* loaded from: classes9.dex */
public final class PWY extends C1Dq {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PWY(Object obj, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(interfaceC23621Ds);
        this.A08 = i;
        this.A09 = obj;
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A07 = obj;
        this.A01 |= Integer.MIN_VALUE;
        switch (i) {
            case 0:
                return ((ECPRepositoryImpl) this.A09).A03(null, null, null, null, null, this, false);
            case 1:
                return ((MainFeedLocalDataSource) this.A09).A04(this, false);
            default:
                return AbstractC55145Od4.A01(this.A09, this);
        }
    }
}
