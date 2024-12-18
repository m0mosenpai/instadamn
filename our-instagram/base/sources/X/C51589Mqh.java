package X;

import java.util.List;

/* renamed from: X.Mqh, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51589Mqh extends C0T6 {
    public final List A00;
    public final List A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51589Mqh) {
                C51589Mqh c51589Mqh = (C51589Mqh) obj;
                if (!C14360o3.A0K(this.A00, c51589Mqh.A00) || !C14360o3.A0K(this.A01, c51589Mqh.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C51589Mqh(List list, List list2) {
        AbstractC167017dG.A1P(list, list2);
        this.A00 = list;
        this.A01 = list2;
    }
}
