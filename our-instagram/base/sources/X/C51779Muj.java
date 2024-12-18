package X;

import java.util.List;

/* renamed from: X.Muj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51779Muj extends C0T6 implements InterfaceC58218PrO {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final String A04;

    public C51779Muj(String str, String str2, String str3, List list, List list2) {
        C14360o3.A0B(str2, 3);
        this.A02 = list;
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51779Muj) {
                C51779Muj c51779Muj = (C51779Muj) obj;
                if (!C14360o3.A0K(this.A02, c51779Muj.A02) || !C14360o3.A0K(this.A04, c51779Muj.A04) || !C14360o3.A0K(this.A00, c51779Muj.A00) || !C14360o3.A0K(this.A01, c51779Muj.A01) || !C14360o3.A0K(this.A03, c51779Muj.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0K(this.A00, ((AbstractC167017dG.A0M(this.A02) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC166997dE.A0I(this.A03);
    }
}
