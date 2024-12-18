package X;

import java.util.List;

/* renamed from: X.Mw6, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51862Mw6 extends C0T6 implements InterfaceC57855PlL {
    public final List A00;
    public final boolean A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51862Mw6) {
                C51862Mw6 c51862Mw6 = (C51862Mw6) obj;
                if (!C14360o3.A0K(this.A00, c51862Mw6.A00) || this.A01 != c51862Mw6.A01 || this.A02 != c51862Mw6.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC167007dF.A0D(this.A01, AbstractC166987dD.A0G(this.A00)));
    }

    public C51862Mw6(List list, boolean z, boolean z2) {
        this.A00 = list;
        this.A01 = z;
        this.A02 = z2;
    }
}
