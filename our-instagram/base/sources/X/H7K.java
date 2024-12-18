package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class H7K extends C0T6 implements InterfaceC30825Dh0 {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7K) {
                H7K h7k = (H7K) obj;
                if (!C14360o3.A0K(this.A03, h7k.A03) || !C14360o3.A0K(this.A01, h7k.A01) || !C14360o3.A0K(this.A02, h7k.A02) || !C14360o3.A0K(this.A00, h7k.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((AbstractC166987dD.A0G(this.A03) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A00);
    }

    public H7K(String str, String str2, String str3, List list) {
        this.A03 = list;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }
}
