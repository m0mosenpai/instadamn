package X;

import java.util.List;

/* renamed from: X.Mqk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51592Mqk extends C0T6 {
    public final List A00;
    public final String A01;

    public C51592Mqk(List list, String str) {
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A01 = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51592Mqk) {
                C51592Mqk c51592Mqk = (C51592Mqk) obj;
                if (!C14360o3.A0K(this.A00, c51592Mqk.A00) || !C14360o3.A0K(this.A01, c51592Mqk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
