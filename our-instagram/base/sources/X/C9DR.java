package X;

import com.instagram.ar.core.effectcollection.EffectCollectionService;

/* renamed from: X.9DR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9DR extends AbstractC23611Dp implements InterfaceC16610sE {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    @Override // X.InterfaceC16610sE
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A03;
        InterfaceC23621Ds interfaceC23621Ds = (InterfaceC23621Ds) obj3;
        EffectCollectionService effectCollectionService = (EffectCollectionService) this.A06;
        C1807580d c1807580d = (C1807580d) this.A05;
        C172897n3 c172897n3 = (C172897n3) this.A04;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        C9DR c9dr = new C9DR(c1807580d, effectCollectionService, c172897n3, interfaceC23621Ds, i);
        c9dr.A01 = obj;
        c9dr.A02 = obj2;
        return c9dr.invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9DR(C1807580d c1807580d, EffectCollectionService effectCollectionService, C172897n3 c172897n3, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(3, interfaceC23621Ds);
        this.A03 = i;
        this.A06 = effectCollectionService;
        this.A05 = c1807580d;
        this.A04 = c172897n3;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9DR.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
