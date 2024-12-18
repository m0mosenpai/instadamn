package X;

import java.util.ArrayList;

/* renamed from: X.5lT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C125225lT extends C0T6 {
    public Long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public final String A06;
    public final String A07;
    public final ArrayList A08;

    /* JADX WARN: Multi-variable type inference failed */
    public C125225lT() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 65535);
    }

    public /* synthetic */ C125225lT(Long l, String str, String str2, String str3, String str4, String str5, int i) {
        ArrayList arrayList;
        str = (i & 1) != 0 ? "" : str;
        String str6 = (i & 2) == 0 ? str2 : "";
        if ((i & 4) != 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        l = (i & 8) != 0 ? 0L : l;
        str3 = (i & 16) != 0 ? null : str3;
        str4 = (i & 32) != 0 ? null : str4;
        str5 = (i & 1024) != 0 ? null : str5;
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str6, 2);
        this.A07 = str;
        this.A03 = str6;
        this.A08 = arrayList;
        this.A00 = l;
        this.A02 = str3;
        this.A01 = str4;
        this.A05 = null;
        this.A06 = str5;
        this.A04 = null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C125225lT) {
                C125225lT c125225lT = (C125225lT) obj;
                if (!C14360o3.A0K(this.A07, c125225lT.A07) || !C14360o3.A0K(this.A03, c125225lT.A03) || !C14360o3.A0K(this.A08, c125225lT.A08) || !C14360o3.A0K(this.A00, c125225lT.A00) || !C14360o3.A0K(this.A02, c125225lT.A02) || !C14360o3.A0K(this.A01, c125225lT.A01) || !C14360o3.A0K(this.A05, c125225lT.A05) || !C14360o3.A0K(this.A06, c125225lT.A06) || !C14360o3.A0K(this.A04, c125225lT.A04)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((this.A07.hashCode() * 31) + this.A03.hashCode()) * 31;
        ArrayList arrayList = this.A08;
        int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        Long l = this.A00;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.A02;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31 * 31 * 31 * 31;
        String str3 = this.A05;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31 * 31 * 31 * 31;
        String str5 = this.A04;
        return (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
    }
}
