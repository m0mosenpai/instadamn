package X;

import java.util.List;

/* renamed from: X.BeT, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25979BeT extends C0T6 {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25979BeT) {
                C25979BeT c25979BeT = (C25979BeT) obj;
                if (!C14360o3.A0K(this.A01, c25979BeT.A01) || !C14360o3.A0K(this.A00, c25979BeT.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C25979BeT(List list, String str) {
        AbstractC167017dG.A1P(list, str);
        this.A01 = list;
        this.A00 = str;
    }
}
