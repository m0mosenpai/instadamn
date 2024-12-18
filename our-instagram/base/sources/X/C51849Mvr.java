package X;

import java.util.List;

/* renamed from: X.Mvr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51849Mvr extends C0T6 implements InterfaceC58256Ps0 {
    public final List A00;
    public final boolean A01;

    public C51849Mvr(List list, boolean z) {
        C14360o3.A0B(list, 2);
        this.A01 = z;
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51849Mvr) {
                C51849Mvr c51849Mvr = (C51849Mvr) obj;
                if (this.A01 != c51849Mvr.A01 || !C14360o3.A0K(this.A00, c51849Mvr.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC25225BEi.A08(this.A01));
    }
}
