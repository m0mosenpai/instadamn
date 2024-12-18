package X;

/* loaded from: classes6.dex */
public final /* synthetic */ class GSh extends C03E implements InterfaceC16660sJ {
    public static final GSh A00 = new GSh();

    public GSh() {
        super(1, AbstractC33560EsY.class, "favorOneTapPriority", "favorOneTapPriority(Lcom/instagram/nux/aymh/accountprovider/Account;)I", 1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        E6N e6n = (E6N) obj;
        C14360o3.A0B(e6n, 0);
        switch (e6n.A01.intValue()) {
            case 0:
                i = 9;
                break;
            case 1:
                i = 0;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 6;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 2;
                break;
            case 7:
                i = 3;
                break;
            case 8:
                i = 1;
                break;
            case 9:
                i = 8;
                break;
            default:
                throw B4Z.A00();
        }
        return Integer.valueOf(i);
    }
}
