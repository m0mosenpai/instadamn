package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class URS extends C0T6 implements XFV {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public URS(String str, String str2, String str3, String str4, List list) {
        AbstractC25234BEr.A0j(1, str, str2, str3, str4);
        this.A00 = str;
        this.A04 = list;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URS) {
                URS urs = (URS) obj;
                if (!C14360o3.A0K(this.A00, urs.A00) || !C14360o3.A0K(this.A04, urs.A04) || !C14360o3.A0K(this.A01, urs.A01) || !C14360o3.A0K(this.A02, urs.A02) || !C14360o3.A0K(this.A03, urs.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A02, AbstractC166997dE.A0K(this.A01, ((this.A00.hashCode() * 31) + AbstractC167017dG.A0M(this.A04)) * 31)) + this.A03.hashCode();
    }
}
