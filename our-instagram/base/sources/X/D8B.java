package X;

/* loaded from: classes5.dex */
public final class D8B extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final String A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D8B(String str, int i) {
        super(0);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        StringBuilder A1C;
        String str;
        switch (this.A00) {
            case 2:
                A1C = AbstractC166987dD.A1C();
                A1C.append(this.A01);
                str = "_installed";
                break;
            case 3:
                A1C = AbstractC166987dD.A1C();
                A1C.append(this.A01);
                str = "_uninstalled";
                break;
            case 4:
                return new K56(this.A01);
            default:
                return Boolean.valueOf(AbstractC167007dF.A1O(this.A01.length()));
        }
        return AbstractC166997dE.A0x(str, A1C);
    }
}
