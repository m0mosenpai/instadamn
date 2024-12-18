package X;

import java.util.List;

/* renamed from: X.4y9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110374y9 extends C0T6 implements InterfaceC110384yA {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final List A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110374y9) {
                C110374y9 c110374y9 = (C110374y9) obj;
                if (!C14360o3.A0K(this.A05, c110374y9.A05) || !C14360o3.A0K(this.A00, c110374y9.A00) || !C14360o3.A0K(this.A01, c110374y9.A01) || !C14360o3.A0K(this.A02, c110374y9.A02) || !C14360o3.A0K(this.A03, c110374y9.A03) || !C14360o3.A0K(this.A04, c110374y9.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A05;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A00;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A03;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A04;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public C110374y9(String str, String str2, String str3, String str4, String str5, List list) {
        this.A05 = list;
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
