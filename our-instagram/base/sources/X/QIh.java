package X;

import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final class QIh extends C0T6 {
    public int A00;
    public String A01;
    public java.util.Set A02;
    public boolean A03;
    public final String A04;
    public final String A05;

    public /* synthetic */ QIh(String str, String str2) {
        LinkedHashSet A0l = AbstractC31171DnF.A0l();
        this.A05 = str;
        this.A04 = str2;
        this.A01 = null;
        this.A02 = A0l;
        this.A03 = false;
        this.A00 = 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof QIh) {
                QIh qIh = (QIh) obj;
                if (!C14360o3.A0K(this.A05, qIh.A05) || !C14360o3.A0K(this.A04, qIh.A04) || !C14360o3.A0K(this.A01, qIh.A01) || !C14360o3.A0K(this.A02, qIh.A02) || this.A03 != qIh.A03 || this.A00 != qIh.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0J(this.A02, (((AbstractC166987dD.A0J(this.A05) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC25227BEk.A07(this.A01)) * 31)) + this.A00;
    }
}
