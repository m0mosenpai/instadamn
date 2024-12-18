package X;

/* renamed from: X.0dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09350dk extends AbstractC14370o4 implements InterfaceC12170kL {
    @Override // X.InterfaceC12170kL
    public final long CEQ(C0XX c0xx) {
        try {
            String Ac1 = c0xx.Ac1(this.A00);
            if (Ac1 != null) {
                return Boolean.parseBoolean(Ac1) ? 1L : 0L;
            }
            return 0L;
        } catch (NullPointerException | NumberFormatException unused) {
            return 0L;
        }
    }
}
