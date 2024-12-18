package X;

import java.util.List;

/* renamed from: X.Bgo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26104Bgo extends C0T6 implements InterfaceC30790DgR {
    public final int A00;
    public final List A01;

    public C26104Bgo(int i, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = i;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26104Bgo) {
                C26104Bgo c26104Bgo = (C26104Bgo) obj;
                if (this.A00 != c26104Bgo.A00 || !C14360o3.A0K(this.A01, c26104Bgo.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, this.A00 * 31);
    }
}
