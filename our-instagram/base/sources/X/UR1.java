package X;

/* loaded from: classes11.dex */
public final class UR1 extends C0T6 implements InterfaceC43472JIk {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR1) {
                UR1 ur1 = (UR1) obj;
                if (!C14360o3.A0K(this.A00, ur1.A00) || !C14360o3.A0K(this.A01, ur1.A01) || !C14360o3.A0K(this.A03, ur1.A03) || !C14360o3.A0K(this.A02, ur1.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public UR1(String str, String str2, String str3, String str4) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
