package X;

/* loaded from: classes5.dex */
public final class DSC extends C0YY implements InterfaceC16620sF {
    public final Object A00;
    public final String A01;
    public final String A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DSC(C5yI c5yI, String str, String str2) {
        super(2);
        this.A00 = c5yI;
        this.A02 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        ((C5yI) this.A00).DSg(str, this.A02, AbstractC25231BEo.A1W(obj2, str), this.A01);
        return C0eB.A00;
    }
}
