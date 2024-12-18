package X;

import java.util.List;

/* renamed from: X.Bib, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26211Bib extends C0T6 implements InterfaceC37257GbA {
    public final String A00;
    public final String A01;
    public final List A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26211Bib) {
                C26211Bib c26211Bib = (C26211Bib) obj;
                if (!C14360o3.A0K(this.A02, c26211Bib.A02) || !C14360o3.A0K(this.A00, c26211Bib.A00) || this.A03 != c26211Bib.A03 || !C14360o3.A0K(this.A01, c26211Bib.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC167007dF.A0D(this.A03, AbstractC166997dE.A0K(this.A00, AbstractC166987dD.A0G(this.A02))));
    }

    public C26211Bib(List list, boolean z, String str, String str2) {
        AbstractC25234BEr.A1P(list, str, str2);
        this.A02 = list;
        this.A00 = str;
        this.A03 = z;
        this.A01 = str2;
    }
}
