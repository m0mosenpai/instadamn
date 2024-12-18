package X;

/* renamed from: X.0Gn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C03380Gn extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03 = 1;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03380Gn(Object obj, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE, AnonymousClass197 anonymousClass197, InterfaceC24751Is interfaceC24751Is, InterfaceC19960yQ interfaceC19960yQ) {
        super(2, interfaceC23621Ds);
        this.A05 = interfaceC24751Is;
        this.A06 = interfaceC19960yQ;
        this.A07 = interfaceC16610sE;
        this.A01 = obj;
        this.A04 = anonymousClass197;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A03 != 0) {
            C03380Gn c03380Gn = new C03380Gn(interfaceC23621Ds, (InterfaceC16610sE) this.A07, (InterfaceC19390xP) this.A05, (InterfaceC19390xP) this.A04, (InterfaceC19960yQ) this.A06);
            c03380Gn.A01 = obj;
            return c03380Gn;
        }
        InterfaceC24751Is interfaceC24751Is = (InterfaceC24751Is) this.A05;
        InterfaceC19960yQ interfaceC19960yQ = (InterfaceC19960yQ) this.A06;
        return new C03380Gn(this.A01, interfaceC23621Ds, (InterfaceC16610sE) this.A07, (AnonymousClass197) this.A04, interfaceC24751Is, interfaceC19960yQ);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C03380Gn) create(obj, (InterfaceC23621Ds) obj2)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #2 {all -> 0x008e, blocks: (B:8:0x0014, B:15:0x0085, B:17:0x0089, B:21:0x0043), top: B:4:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb A[RETURN] */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.197, java.lang.Object, X.12W] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.12W] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03380Gn.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03380Gn(InterfaceC23621Ds interfaceC23621Ds, InterfaceC16610sE interfaceC16610sE, InterfaceC19390xP interfaceC19390xP, InterfaceC19390xP interfaceC19390xP2, InterfaceC19960yQ interfaceC19960yQ) {
        super(2, interfaceC23621Ds);
        this.A05 = interfaceC19390xP;
        this.A04 = interfaceC19390xP2;
        this.A06 = interfaceC19960yQ;
        this.A07 = interfaceC16610sE;
    }
}
