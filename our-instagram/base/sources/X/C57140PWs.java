package X;

import com.facebookpay.expresscheckout.repositoryimpl.ECPRepositoryImpl;
import com.instagram.settings2.core.viewmodel.UiStateKt;

/* renamed from: X.PWs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57140PWs extends C1Dq {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public boolean A09;
    public final int A0A = 1;

    public C57140PWs(InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A0A != 0) {
            this.A07 = obj;
            this.A00 |= Integer.MIN_VALUE;
            return UiStateKt.A03(null, null, null, this);
        }
        this.A06 = obj;
        this.A00 |= Integer.MIN_VALUE;
        return ECPRepositoryImpl.A00(null, (ECPRepositoryImpl) this.A07, null, null, null, null, null, null, null, this, false, false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57140PWs(ECPRepositoryImpl eCPRepositoryImpl, InterfaceC23621Ds interfaceC23621Ds) {
        super(interfaceC23621Ds);
        this.A07 = eCPRepositoryImpl;
    }
}
