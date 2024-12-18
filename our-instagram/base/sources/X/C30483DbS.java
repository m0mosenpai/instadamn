package X;

/* renamed from: X.DbS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30483DbS extends C0YY implements InterfaceC16620sF {
    public final int A00;
    public final int A01;
    public final int A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30483DbS(int i, int i2, int i3) {
        super(2);
        this.A00 = i3;
        this.A02 = i;
        this.A01 = i2;
    }

    public static void A00(C5UU c5uu, int i, int i2, int i3) {
        c5uu.A06 = new C30483DbS(i, i2, i3);
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.A00) {
            case 2:
                AbstractC28462ChE.A03(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 3:
                AbstractC28044CXw.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 4:
                AbstractC25708BXt.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 5:
                CHE.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 6:
                CHF.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 7:
                AbstractC28438Cgm.A01(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 8:
                AbstractC28315Ce1.A01(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 9:
                AbstractC28325CeD.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            case 10:
                AbstractC28490Chi.A01(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
            default:
                AbstractC27554CDz.A00(AbstractC25226BEj.A0S(obj, obj2), this.A02, AbstractC25225BEi.A04(this.A01));
                break;
        }
        return C0eB.A00;
    }
}
