package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class PYm extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final float A05;
    public final float A06;
    public final int A07 = 1;
    public final Object A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYm(InterfaceC74953Yl interfaceC74953Yl, CSX csx, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, float f, float f2) {
        super(2, interfaceC23621Ds);
        this.A08 = csx;
        this.A05 = f;
        this.A06 = f2;
        this.A03 = interfaceC16820sZ;
        this.A01 = interfaceC16820sZ2;
        this.A02 = interfaceC16820sZ3;
        this.A09 = interfaceC74953Yl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A07 != 0) {
            CSX csx = (CSX) this.A08;
            float f = this.A05;
            float f2 = this.A06;
            PYm pYm = new PYm((InterfaceC74953Yl) this.A09, csx, interfaceC23621Ds, (InterfaceC16820sZ) this.A03, (InterfaceC16820sZ) this.A01, (InterfaceC16820sZ) this.A02, f, f2);
            pYm.A04 = obj;
            return pYm;
        }
        PYm pYm2 = new PYm((OVv) this.A04, (List) this.A08, (List) this.A09, interfaceC23621Ds, this.A06, this.A05);
        pYm2.A01 = obj;
        return pYm2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        if (X.AJp.A01(r0) == false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x020b  */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, X.US9] */
    /* JADX WARN: Type inference failed for: r3v6, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:85:0x00c1 -> B:81:0x00c7). Please report as a decompilation issue!!! */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PYm.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PYm) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PYm(OVv oVv, List list, List list2, InterfaceC23621Ds interfaceC23621Ds, float f, float f2) {
        super(2, interfaceC23621Ds);
        this.A08 = list;
        this.A09 = list2;
        this.A06 = f;
        this.A04 = oVv;
        this.A05 = f2;
    }
}
