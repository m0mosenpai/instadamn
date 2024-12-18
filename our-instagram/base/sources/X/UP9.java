package X;

/* loaded from: classes11.dex */
public final class UP9 extends C0T6 {
    public final C66615UPc A00;
    public final Boolean A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UP9) {
                UP9 up9 = (UP9) obj;
                if (!C14360o3.A0K(this.A02, up9.A02) || !C14360o3.A0K(this.A03, up9.A03) || !C14360o3.A0K(this.A00, up9.A00) || !C14360o3.A0K(this.A04, up9.A04) || !C14360o3.A0K(this.A01, up9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return A0O + i;
    }

    public UP9(C66615UPc c66615UPc, Boolean bool, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = c66615UPc;
        this.A04 = str3;
        this.A01 = bool;
    }
}
