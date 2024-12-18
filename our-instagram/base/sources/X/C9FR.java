package X;

/* renamed from: X.9FR, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9FR extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                ((Number) obj2).intValue();
                ((C6N1) this.A04).A6z((C5Tl) obj, this.A03, (InterfaceC16620sF) this.A02, AbstractC128295qy.A00(this.A01 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                ((C5TR) this.A04).A02((C5Tl) obj, this.A02, this.A03, AbstractC128295qy.A00(this.A01) | 1);
                break;
            case 2:
                ((Number) obj2).intValue();
                C5V2.A00((C5Tl) obj, (InterfaceC1128457r) this.A03, (InterfaceC117815Ur) this.A04, (InterfaceC16620sF) this.A02, AbstractC128295qy.A00(this.A01 | 1));
                break;
            default:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Object obj3 = this.A03;
                if (obj3 != null) {
                    return new ViewOnClickListenerC42005Ija(this.A01, 0, obj, obj3, this.A04, this.A02, booleanValue);
                }
                return null;
        }
        return C0eB.A00;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9FR(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(2);
        this.A00 = i2;
        this.A04 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A01 = i;
    }
}
