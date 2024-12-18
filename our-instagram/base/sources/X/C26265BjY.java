package X;

import java.util.List;

/* renamed from: X.BjY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26265BjY extends C0T6 implements InterfaceC30895Di8 {
    public final String A00;
    public final List A01;
    public final List A02;

    public C26265BjY(List list, List list2, String str) {
        C14360o3.A0B(str, 3);
        this.A02 = list;
        this.A01 = list2;
        this.A00 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26265BjY) {
                C26265BjY c26265BjY = (C26265BjY) obj;
                if (!C14360o3.A0K(this.A02, c26265BjY.A02) || !C14360o3.A0K(this.A01, c26265BjY.A01) || !C14360o3.A0K(this.A00, c26265BjY.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)));
    }
}
