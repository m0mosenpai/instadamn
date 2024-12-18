package X;

import java.util.List;

/* renamed from: X.KNx, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45770KNx extends AbstractC46412KgY {
    public final String A00;
    public final List A01;

    public C45770KNx(String str, List list) {
        C14360o3.A0B(list, 2);
        this.A00 = str;
        this.A01 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45770KNx) {
                C45770KNx c45770KNx = (C45770KNx) obj;
                if (!C14360o3.A0K(this.A00, c45770KNx.A00) || !C14360o3.A0K(this.A01, c45770KNx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0J(this.A00));
    }
}
