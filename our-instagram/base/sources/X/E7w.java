package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class E7w extends C0T6 implements InterfaceC37248Gax {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final HashMap A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E7w) {
                E7w e7w = (E7w) obj;
                if (!C14360o3.A0K(this.A04, e7w.A04) || !C14360o3.A0K(this.A01, e7w.A01) || !C14360o3.A0K(this.A00, e7w.A00) || !C14360o3.A0K(this.A02, e7w.A02) || !C14360o3.A0K(this.A03, e7w.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0K(this.A00, AbstractC166997dE.A0K(this.A01, AbstractC166987dD.A0G(this.A04))) + AbstractC167017dG.A0O(this.A02)) * 31);
    }

    public E7w(String str, String str2, String str3, String str4, HashMap hashMap) {
        AbstractC167027dH.A13(hashMap, str, str2);
        C14360o3.A0B(str4, 5);
        this.A04 = hashMap;
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
        this.A03 = str4;
    }
}
