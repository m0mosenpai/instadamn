package X;

import java.util.Locale;

/* renamed from: X.0dN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C09150dN implements InterfaceC12810lT {
    public final InterfaceC12810lT A00;

    @Override // X.InterfaceC12810lT
    public final double CEP(C0XX c0xx) {
        return Math.min(this.A00.CEP(c0xx), 1000.0d);
    }

    @Override // X.C0YA
    public final String getName() {
        return String.format(Locale.US, "%s.capped_%.1f", this.A00.getName(), Double.valueOf(1000.0d));
    }

    public C09150dN(InterfaceC12810lT interfaceC12810lT) {
        this.A00 = interfaceC12810lT;
    }
}
