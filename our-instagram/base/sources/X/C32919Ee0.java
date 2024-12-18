package X;

import java.util.List;

/* renamed from: X.Ee0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32919Ee0 extends AbstractC33551EsP {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C32919Ee0) {
                C32919Ee0 c32919Ee0 = (C32919Ee0) obj;
                if (!C14360o3.A0K(this.A00, c32919Ee0.A00) || this.A01 != c32919Ee0.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C32919Ee0(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
