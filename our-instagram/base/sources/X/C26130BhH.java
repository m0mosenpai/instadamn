package X;

import java.util.List;

/* renamed from: X.BhH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26130BhH extends C0T6 implements InterfaceC31092Dla {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final String A07;

    public C26130BhH(String str, String str2, String str3, String str4, List list, List list2, List list3, List list4) {
        C14360o3.A0B(str, 1);
        AbstractC25234BEr.A1R(list, list2, str2, str3, list3);
        AbstractC167007dF.A1I(list4, 7, str4);
        this.A00 = str;
        this.A03 = list;
        this.A04 = list2;
        this.A01 = str2;
        this.A07 = str3;
        this.A05 = list3;
        this.A06 = list4;
        this.A02 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26130BhH) {
                C26130BhH c26130BhH = (C26130BhH) obj;
                if (!C14360o3.A0K(this.A00, c26130BhH.A00) || !C14360o3.A0K(this.A03, c26130BhH.A03) || !C14360o3.A0K(this.A04, c26130BhH.A04) || !C14360o3.A0K(this.A01, c26130BhH.A01) || !C14360o3.A0K(this.A07, c26130BhH.A07) || !C14360o3.A0K(this.A05, c26130BhH.A05) || !C14360o3.A0K(this.A06, c26130BhH.A06) || !C14360o3.A0K(this.A02, c26130BhH.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, AbstractC166997dE.A0J(this.A06, AbstractC166997dE.A0J(this.A05, AbstractC166997dE.A0K(this.A07, AbstractC166997dE.A0K(this.A01, AbstractC166997dE.A0J(this.A04, AbstractC166997dE.A0J(this.A03, AbstractC166987dD.A0J(this.A00))))))));
    }
}
