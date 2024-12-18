package X;

import java.util.List;

/* renamed from: X.MwZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51891MwZ extends C0T6 implements InterfaceC57856PlM {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public C51891MwZ(String str, String str2, List list, List list2) {
        C14360o3.A0B(list2, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = list;
        this.A03 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51891MwZ) {
                C51891MwZ c51891MwZ = (C51891MwZ) obj;
                if (!C14360o3.A0K(this.A00, c51891MwZ.A00) || !C14360o3.A0K(this.A01, c51891MwZ.A01) || !C14360o3.A0K(this.A02, c51891MwZ.A02) || !C14360o3.A0K(this.A03, c51891MwZ.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A03, (((AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A02)) * 31);
    }
}
