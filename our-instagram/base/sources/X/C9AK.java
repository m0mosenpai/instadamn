package X;

/* renamed from: X.9AK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9AK extends C0YY implements InterfaceC16660sJ {
    public static final C9AK A00 = new C9AK();

    public C9AK() {
        super(1);
    }

    @Override // X.InterfaceC16660sJ
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C006802i c006802i;
        String str;
        EnumC41921wi enumC41921wi = (EnumC41921wi) obj;
        C14360o3.A0B(enumC41921wi, 0);
        int ordinal = enumC41921wi.ordinal();
        if (ordinal != 4) {
            if (ordinal != 5) {
                if (ordinal != 1) {
                    if (ordinal == 3) {
                        c006802i = C9AL.A00;
                        str = "mailbox_bootstrap_end";
                    }
                    return C0eB.A00;
                }
                c006802i = C9AL.A00;
                str = "mailbox_bootstrap_start";
                c006802i.markerPoint(31784965, str);
                return C0eB.A00;
            }
            c006802i = C9AL.A00;
            str = "mailbox_teardown_end";
        } else {
            c006802i = C9AL.A00;
            str = "mailbox_teardown_start";
        }
        c006802i.markerPoint(20131727, str);
        c006802i.markerPoint(31784965, str);
        return C0eB.A00;
    }
}
