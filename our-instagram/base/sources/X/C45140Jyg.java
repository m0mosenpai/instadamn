package X;

import java.util.List;

/* renamed from: X.Jyg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45140Jyg extends C0T6 implements InterfaceC43463JIb {
    public final String A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C45140Jyg) {
                C45140Jyg c45140Jyg = (C45140Jyg) obj;
                if (!C14360o3.A0K(this.A01, c45140Jyg.A01) || !C14360o3.A0K(this.A00, c45140Jyg.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C45140Jyg(List list, String str) {
        AbstractC167017dG.A1P(list, str);
        this.A01 = list;
        this.A00 = str;
    }
}
