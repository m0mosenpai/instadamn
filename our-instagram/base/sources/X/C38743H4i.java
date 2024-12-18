package X;

import java.util.List;

/* renamed from: X.H4i, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38743H4i extends C0T6 implements InterfaceC43478JIq {
    public final List A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38743H4i) {
                C38743H4i c38743H4i = (C38743H4i) obj;
                if (!C14360o3.A0K(this.A00, c38743H4i.A00) || !C14360o3.A0K(this.A01, c38743H4i.A01) || !C14360o3.A0K(this.A03, c38743H4i.A03) || !C14360o3.A0K(this.A02, c38743H4i.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public C38743H4i(Boolean bool, Integer num, String str, List list) {
        this.A00 = list;
        this.A01 = bool;
        this.A03 = str;
        this.A02 = num;
    }
}
