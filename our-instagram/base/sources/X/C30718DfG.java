package X;

/* renamed from: X.DfG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C30718DfG extends C0YY implements InterfaceC16600sD {
    public final /* synthetic */ C5yI A00;
    public final /* synthetic */ String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30718DfG(C5yI c5yI, String str) {
        super(4);
        this.A00 = c5yI;
        this.A01 = str;
    }

    @Override // X.InterfaceC16600sD
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        String str2 = (String) obj2;
        AbstractC167017dG.A1N(str, str2);
        this.A00.DRL((C51729Mt8) obj3, (Integer) obj4, str, str2, null, this.A01);
        return C0eB.A00;
    }
}
