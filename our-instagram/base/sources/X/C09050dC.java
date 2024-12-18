package X;

/* renamed from: X.0dC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09050dC extends AbstractC14370o4 implements InterfaceC12810lT {
    @Override // X.InterfaceC12810lT
    public final double CEP(C0XX c0xx) {
        try {
            String Ac1 = c0xx.Ac1(this.A00);
            if (Ac1 == null) {
                return 0.0d;
            }
            return Double.parseDouble(Ac1);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }
}
