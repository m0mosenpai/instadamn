package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class PXl extends AbstractC23611Dp implements InterfaceC16620sF {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PXl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i, boolean z) {
        super(2, interfaceC23621Ds);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
        this.A05 = obj5;
        this.A06 = z;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        boolean z;
        int i;
        if (this.A00 != 0) {
            z = this.A06;
            obj6 = this.A05;
            obj2 = this.A01;
            obj5 = this.A04;
            obj4 = this.A02;
            obj3 = this.A03;
            i = 1;
        } else {
            obj2 = this.A01;
            obj3 = this.A03;
            obj4 = this.A02;
            obj5 = this.A04;
            obj6 = this.A05;
            z = this.A06;
            i = 0;
        }
        return new PXl(obj2, obj3, obj4, obj5, obj6, interfaceC23621Ds, i, z);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
            if (this.A06) {
                C55220Oej.A01((Context) this.A01, (UserSession) this.A05, (C38321qM) this.A04, (C54798OJr) this.A02);
            } else {
                AbstractC63248Sg4.A02((AbstractC10360h2) this.A03);
            }
        } else {
            AbstractC09560e7.A00(obj);
            C5G6 c5g6 = (C5G6) this.A01;
            C63253SgA.A00((Context) this.A03, (Bundle) this.A04, (Q4Z) this.A02, c5g6, this.A06);
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PXl) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
