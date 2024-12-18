package X;

import com.instagram.business.promote.model.IGBoostPackagesFlowInfo;
import java.util.Currency;

/* loaded from: classes8.dex */
public final class MCA extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCA(Object obj, Object obj2, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = i2;
        this.A04 = obj;
        this.A00 = i;
        this.A02 = obj2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        int i;
        Object obj3;
        int i2;
        Object obj4;
        Object obj5;
        int i3;
        Object obj6;
        int i4;
        switch (this.A05) {
            case 0:
                obj2 = this.A04;
                i = this.A00;
                obj3 = this.A02;
                i2 = 0;
                break;
            case 1:
                obj4 = this.A04;
                obj5 = this.A03;
                i3 = this.A00;
                obj6 = this.A02;
                i4 = 1;
                return new MCA(obj4, obj5, obj6, interfaceC23621Ds, i3, i4);
            case 2:
                obj2 = this.A04;
                i = this.A00;
                obj3 = this.A02;
                i2 = 2;
                break;
            case 3:
                MCA mca = new MCA((IGBoostPackagesFlowInfo) this.A02, (Currency) this.A03, interfaceC23621Ds, this.A00);
                mca.A04 = obj;
                return mca;
            case 4:
                obj4 = this.A04;
                i3 = this.A00;
                obj5 = this.A03;
                obj6 = this.A02;
                i4 = 4;
                return new MCA(obj4, obj5, obj6, interfaceC23621Ds, i3, i4);
            case 5:
                obj4 = this.A04;
                i3 = this.A00;
                obj5 = this.A03;
                obj6 = this.A02;
                i4 = 5;
                return new MCA(obj4, obj5, obj6, interfaceC23621Ds, i3, i4);
            case 6:
                return new MCA((C44496Jm2) this.A04, interfaceC23621Ds);
            case 7:
                obj4 = this.A04;
                obj5 = this.A03;
                i3 = this.A00;
                obj6 = this.A02;
                i4 = 7;
                return new MCA(obj4, obj5, obj6, interfaceC23621Ds, i3, i4);
            default:
                obj4 = this.A04;
                obj5 = this.A03;
                obj6 = this.A02;
                i3 = this.A00;
                i4 = 8;
                return new MCA(obj4, obj5, obj6, interfaceC23621Ds, i3, i4);
        }
        MCA mca2 = new MCA(obj2, obj3, interfaceC23621Ds, i, i2);
        mca2.A03 = obj;
        return mca2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0292 A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.1Ds, java.lang.Object, X.MCA] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.util.AbstractCollection, java.util.ArrayList] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MCA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MCA) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCA(IGBoostPackagesFlowInfo iGBoostPackagesFlowInfo, Currency currency, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A05 = 3;
        this.A02 = iGBoostPackagesFlowInfo;
        this.A03 = currency;
        this.A00 = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCA(Object obj, Object obj2, Object obj3, InterfaceC23621Ds interfaceC23621Ds, int i, int i2) {
        super(2, interfaceC23621Ds);
        this.A05 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A00 = i;
        this.A02 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MCA(C44496Jm2 c44496Jm2, InterfaceC23621Ds interfaceC23621Ds) {
        super(2, interfaceC23621Ds);
        this.A05 = 6;
        this.A04 = c44496Jm2;
    }
}
