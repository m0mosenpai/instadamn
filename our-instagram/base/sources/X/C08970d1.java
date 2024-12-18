package X;

/* renamed from: X.0d1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C08970d1 extends AbstractC14370o4 implements InterfaceC12170kL, InterfaceC12970lj {
    @Override // X.InterfaceC12970lj
    public final String AxS(C0XX c0xx) {
        String Ac1 = c0xx.Ac1(this.A00);
        if (Ac1 == null) {
            return AnonymousClass001.A0Q("", 0L);
        }
        return Ac1;
    }

    @Override // X.InterfaceC12170kL
    public final long CEQ(C0XX c0xx) {
        try {
            String Ac1 = c0xx.Ac1(this.A00);
            if (Ac1 == null) {
                return 0L;
            }
            return Long.parseLong(Ac1);
        } catch (NullPointerException | NumberFormatException unused) {
            return 0L;
        }
    }
}
