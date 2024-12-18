package X;

import java.util.List;

/* renamed from: X.5IU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5IU extends C0T6 implements C54K {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C5IU(String str, String str2, String str3, String str4, List list) {
        C14360o3.A0B(str4, 4);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5IU) {
                C5IU c5iu = (C5IU) obj;
                if (!C14360o3.A0K(this.A00, c5iu.A00) || !C14360o3.A0K(this.A01, c5iu.A01) || !C14360o3.A0K(this.A02, c5iu.A02) || !C14360o3.A0K(this.A03, c5iu.A03) || !C14360o3.A0K(this.A04, c5iu.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A03.hashCode()) * 31;
        List list = this.A04;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }
}
