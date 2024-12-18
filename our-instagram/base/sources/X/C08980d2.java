package X;

/* renamed from: X.0d2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C08980d2 implements InterfaceC12170kL, InterfaceC12970lj {
    public final InterfaceC12170kL A00;

    @Override // X.InterfaceC12170kL
    public final long CEQ(C0XX c0xx) {
        if (this.A00.CEQ(c0xx) < 500) {
            return 0L;
        }
        return 1L;
    }

    @Override // X.C0YA
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.getName());
        sb.append(".if_less_than_");
        sb.append(500L);
        return sb.toString();
    }

    public C08980d2(InterfaceC12170kL interfaceC12170kL) {
        this.A00 = interfaceC12170kL;
    }

    @Override // X.InterfaceC12970lj
    public final String AxS(C0XX c0xx) {
        return String.valueOf(CEQ(c0xx));
    }
}
