package X;

/* loaded from: classes8.dex */
public final class MC0 extends AbstractC23611Dp implements InterfaceC16620sF {
    public Object A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
        this.A00 = obj6;
    }

    public static C2044593e A00(C47715L4w c47715L4w) {
        C2044593e c2044593e = new C2044593e(c47715L4w.A00);
        c2044593e.A0A = c47715L4w.A03;
        c2044593e.A0E = c47715L4w.A06;
        c2044593e.A0J = c47715L4w.A07;
        c2044593e.A0C = c47715L4w.A04;
        c2044593e.A09 = c47715L4w.A02;
        String str = c47715L4w.A05;
        c2044593e.A0D = str;
        if (str != null) {
            c2044593e.A07 = "discover/reshare_suggestions/";
        }
        return c2044593e;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        int i2;
        switch (this.A01) {
            case 0:
                obj11 = this.A06;
                obj7 = this.A05;
                obj9 = this.A04;
                obj10 = this.A02;
                obj12 = this.A03;
                obj8 = this.A00;
                i2 = 0;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            case 1:
                obj12 = this.A03;
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A06;
                obj7 = this.A05;
                obj8 = this.A00;
                i2 = 1;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            case 2:
                obj6 = this.A05;
                obj5 = this.A04;
                obj2 = this.A06;
                obj3 = this.A02;
                obj4 = this.A03;
                i = 2;
                break;
            case 3:
                obj7 = this.A05;
                obj11 = this.A06;
                obj8 = this.A00;
                obj10 = this.A02;
                obj12 = this.A03;
                obj9 = this.A04;
                i2 = 3;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            case 4:
                obj6 = this.A05;
                obj2 = this.A06;
                obj5 = this.A04;
                obj4 = this.A03;
                obj3 = this.A02;
                i = 4;
                break;
            case 5:
                obj2 = this.A06;
                obj3 = this.A02;
                obj4 = this.A03;
                obj5 = this.A04;
                obj6 = this.A05;
                i = 5;
                break;
            case 6:
                obj2 = this.A06;
                obj3 = this.A02;
                obj4 = this.A03;
                obj5 = this.A04;
                obj6 = this.A05;
                i = 6;
                break;
            case 7:
                obj10 = this.A02;
                obj9 = this.A04;
                obj7 = this.A05;
                obj12 = this.A03;
                obj11 = this.A06;
                obj8 = this.A00;
                i2 = 7;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            case 8:
                obj11 = this.A06;
                obj7 = this.A05;
                obj10 = this.A02;
                obj8 = this.A00;
                obj9 = this.A04;
                obj12 = this.A03;
                i2 = 8;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            case 9:
                obj2 = this.A06;
                obj3 = this.A02;
                obj4 = this.A03;
                obj5 = this.A04;
                obj6 = this.A05;
                i = 9;
                break;
            case 10:
                obj7 = this.A05;
                obj8 = this.A00;
                obj9 = this.A04;
                obj10 = this.A02;
                obj11 = this.A06;
                obj12 = this.A03;
                i2 = 10;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
            default:
                obj11 = this.A06;
                obj9 = this.A04;
                obj7 = this.A05;
                obj12 = this.A03;
                obj10 = this.A02;
                obj8 = this.A00;
                i2 = 11;
                return new MC0(obj11, obj7, obj9, obj10, obj12, obj8, interfaceC23621Ds, i2);
        }
        MC0 mc0 = new MC0(obj6, obj5, obj2, obj3, obj4, interfaceC23621Ds, i);
        mc0.A00 = obj;
        return mc0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x0349, code lost:
    
        if (r7 != null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c9, code lost:
    
        if (r6 == X.EnumC115415Kb.A08) goto L41;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v17 */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 2216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MC0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MC0) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MC0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC23621Ds interfaceC23621Ds, int i) {
        super(2, interfaceC23621Ds);
        this.A01 = i;
        this.A05 = obj;
        this.A04 = obj2;
        this.A06 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }
}
