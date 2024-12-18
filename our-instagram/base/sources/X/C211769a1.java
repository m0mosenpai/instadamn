package X;

import java.util.List;

/* renamed from: X.9a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C211769a1 extends C0T6 implements InterfaceC37259GbC {
    public final Boolean A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C211769a1) {
                C211769a1 c211769a1 = (C211769a1) obj;
                if (!C14360o3.A0K(this.A01, c211769a1.A01) || !C14360o3.A0K(this.A00, c211769a1.A00) || !C14360o3.A0K(this.A02, c211769a1.A02) || !C14360o3.A0K(this.A03, c211769a1.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public C211769a1(Boolean bool, String str, String str2, List list) {
        this.A01 = str;
        this.A00 = bool;
        this.A02 = str2;
        this.A03 = list;
    }

    @Override // X.InterfaceC37259GbC
    public final InterfaceC37259GbC E95(C1DY c1dy) {
        return this;
    }
}
