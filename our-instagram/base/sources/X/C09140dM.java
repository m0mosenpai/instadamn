package X;

/* renamed from: X.0dM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09140dM implements InterfaceC12170kL {
    public final long A00;
    public final InterfaceC12170kL A01;

    @Override // X.InterfaceC12170kL
    public final long CEQ(C0XX c0xx) {
        return Math.min(this.A01.CEQ(c0xx), this.A00);
    }

    @Override // X.C0YA
    public final String getName() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01.getName());
        sb.append(".capped_");
        sb.append(this.A00);
        return sb.toString();
    }

    public C09140dM(InterfaceC12170kL interfaceC12170kL, long j) {
        this.A01 = interfaceC12170kL;
        this.A00 = j;
    }
}
