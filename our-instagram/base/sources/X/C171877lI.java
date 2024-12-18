package X;

/* renamed from: X.7lI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C171877lI extends C0T6 implements InterfaceC171887lJ {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public C171877lI(String str, String str2, String str3, String str4, String str5, String str6) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        C14360o3.A0B(str5, 5);
        C14360o3.A0B(str6, 6);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A05 = str6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C171877lI) {
                C171877lI c171877lI = (C171877lI) obj;
                if (!C14360o3.A0K(this.A00, c171877lI.A00) || !C14360o3.A0K(this.A01, c171877lI.A01) || !C14360o3.A0K(this.A02, c171877lI.A02) || !C14360o3.A0K(this.A03, c171877lI.A03) || !C14360o3.A0K(this.A04, c171877lI.A04) || !C14360o3.A0K(this.A05, c171877lI.A05)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31;
        String str = this.A03;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.A04.hashCode()) * 31) + this.A05.hashCode();
    }
}
