package X;

import java.util.List;

/* renamed from: X.Mqu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51602Mqu extends C0T6 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51602Mqu) {
                C51602Mqu c51602Mqu = (C51602Mqu) obj;
                if (!C14360o3.A0K(this.A01, c51602Mqu.A01) || !C14360o3.A0K(this.A02, c51602Mqu.A02) || !C14360o3.A0K(this.A03, c51602Mqu.A03) || !C14360o3.A0K(this.A00, c51602Mqu.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A02, AbstractC167017dG.A0O(this.A01) * 31)) + AbstractC166997dE.A0I(this.A00);
    }

    public C51602Mqu(Integer num, String str, String str2, List list) {
        AbstractC167017dG.A1R(str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = num;
    }
}
