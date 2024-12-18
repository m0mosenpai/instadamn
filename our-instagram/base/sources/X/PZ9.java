package X;

import com.instagram.creation.capture.quickcapture.sundial.remix.repository.ClipsRemixOriginalMediaRepository;

/* loaded from: classes9.dex */
public final class PZ9 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ9(ClipsRemixOriginalMediaRepository clipsRemixOriginalMediaRepository, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, C05A c05a) {
        super(2, interfaceC23621Ds);
        this.A03 = 2;
        this.A04 = c05a;
        this.A05 = clipsRemixOriginalMediaRepository;
        this.A07 = str;
        this.A06 = str2;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        String str;
        String str2;
        int i;
        Object obj5;
        Object obj6;
        Object obj7;
        String str3;
        String str4;
        Object obj8;
        int i2;
        switch (this.A03) {
            case 0:
                obj6 = this.A02;
                str4 = this.A07;
                str3 = this.A06;
                obj8 = this.A01;
                obj5 = this.A04;
                obj7 = this.A05;
                i2 = 0;
                return new PZ9(obj6, obj8, obj5, obj7, str4, str3, interfaceC23621Ds, i2);
            case 1:
                obj7 = this.A05;
                obj5 = this.A04;
                str4 = this.A07;
                str3 = this.A06;
                obj8 = this.A01;
                obj6 = this.A02;
                i2 = 1;
                return new PZ9(obj6, obj8, obj5, obj7, str4, str3, interfaceC23621Ds, i2);
            case 2:
                return new PZ9((ClipsRemixOriginalMediaRepository) this.A05, this.A07, this.A06, interfaceC23621Ds, (C05A) this.A04);
            case 3:
                obj2 = this.A05;
                obj4 = this.A04;
                str2 = this.A06;
                str = this.A07;
                obj3 = this.A01;
                i = 3;
                break;
            case 4:
                obj2 = this.A05;
                obj3 = this.A01;
                obj4 = this.A04;
                str = this.A07;
                str2 = this.A06;
                i = 4;
                break;
            case 5:
                obj5 = this.A04;
                obj6 = this.A02;
                obj7 = this.A05;
                str3 = this.A06;
                str4 = this.A07;
                obj8 = this.A01;
                i2 = 5;
                return new PZ9(obj6, obj8, obj5, obj7, str4, str3, interfaceC23621Ds, i2);
            default:
                obj7 = this.A05;
                obj5 = this.A04;
                str3 = this.A06;
                str4 = this.A07;
                obj8 = this.A01;
                obj6 = this.A02;
                i2 = 6;
                return new PZ9(obj6, obj8, obj5, obj7, str4, str3, interfaceC23621Ds, i2);
        }
        PZ9 pz9 = new PZ9(obj2, obj4, obj3, str2, str, interfaceC23621Ds, i);
        pz9.A02 = obj;
        return pz9;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:48|(1:(5:(4:(5:54|55|56|10|11)|9|10|11)(8:60|61|62|63|(1:65)(1:73)|(2:67|(1:69))(2:70|(1:72))|10|11)|59|(0)|10|11)(1:75))(2:94|(1:96))|76|77|(1:92)(3:83|(1:85)|86)|87|(2:89|90)|63|(0)(0)|(0)(0)|10|11) */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0272, code lost:
    
        r8 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02f4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x023e A[Catch: IOException -> 0x0270, TryCatch #2 {IOException -> 0x0270, blocks: (B:62:0x0237, B:63:0x023a, B:65:0x023e, B:67:0x0245, B:70:0x025e), top: B:61:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0245 A[Catch: IOException -> 0x0270, TryCatch #2 {IOException -> 0x0270, blocks: (B:62:0x0237, B:63:0x023a, B:65:0x023e, B:67:0x0245, B:70:0x025e), top: B:61:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x025e A[Catch: IOException -> 0x0270, TryCatch #2 {IOException -> 0x0270, blocks: (B:62:0x0237, B:63:0x023a, B:65:0x023e, B:67:0x0245, B:70:0x025e), top: B:61:0x0237 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0241  */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, X.5cw] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PZ9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ9) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ9(Object obj, Object obj2, Object obj3, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ9(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A03 = i;
        this.A02 = obj;
        this.A07 = str;
        this.A06 = str2;
        this.A01 = obj2;
        this.A04 = obj3;
        this.A05 = obj4;
    }
}
