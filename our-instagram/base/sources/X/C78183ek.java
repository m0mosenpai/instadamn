package X;

/* renamed from: X.3ek, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C78183ek extends C0YY implements InterfaceC16620sF {
    public final /* synthetic */ AnonymousClass418 A00;
    public final /* synthetic */ AnonymousClass418 A01;
    public final /* synthetic */ C2XI A02;
    public final /* synthetic */ InterfaceC16610sE A03;
    public final /* synthetic */ C15370ps A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C78183ek(AnonymousClass418 anonymousClass418, AnonymousClass418 anonymousClass4182, C2XI c2xi, InterfaceC16610sE interfaceC16610sE, C15370ps c15370ps) {
        super(2);
        this.A02 = c2xi;
        this.A04 = c15370ps;
        this.A00 = anonymousClass418;
        this.A03 = interfaceC16610sE;
        this.A01 = anonymousClass4182;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, final Object obj2) {
        C14360o3.A0B(obj2, 1);
        final C2XI c2xi = this.A02;
        if (c2xi != null) {
            C15370ps c15370ps = this.A04;
            Object obj3 = c15370ps.A00;
            if (obj3 == null) {
                final AnonymousClass418 anonymousClass418 = this.A00;
                final InterfaceC16610sE interfaceC16610sE = this.A03;
                obj3 = new InterfaceC51122Wi() { // from class: X.4gT
                    @Override // X.InterfaceC51122Wi
                    public final void DyX(C2XI c2xi2) {
                        C2XV.A00();
                        Object obj4 = obj2;
                        Object obj5 = c2xi.A00;
                        AnonymousClass418 anonymousClass4182 = anonymousClass418;
                        if (anonymousClass4182 != null) {
                            interfaceC16610sE.invoke(anonymousClass4182, obj4, obj5);
                        }
                    }
                };
                c15370ps.A00 = obj3;
            }
            c2xi.A01.add(obj3);
            Object obj4 = c2xi.A00;
            AnonymousClass418 anonymousClass4182 = this.A00;
            if (anonymousClass4182 != null) {
                this.A03.invoke(anonymousClass4182, obj2, obj4);
            }
        }
        return new C79773hS(new C9FY(0, c2xi, this.A04, obj2, this.A01));
    }
}
