package X;

import java.util.List;

/* renamed from: X.Jw4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45014Jw4 extends C0T6 {
    public final C111074zO A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45014Jw4) {
                C45014Jw4 c45014Jw4 = (C45014Jw4) obj;
                if (!C14360o3.A0K(this.A01, c45014Jw4.A01) || !C14360o3.A0K(this.A00, c45014Jw4.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C45014Jw4(C111074zO c111074zO, List list) {
        AbstractC167017dG.A1P(list, c111074zO);
        this.A01 = list;
        this.A00 = c111074zO;
    }
}
