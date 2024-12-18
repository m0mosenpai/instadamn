package X;

import java.util.Arrays;

/* renamed from: X.3NJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3NJ {
    public C3NL A00;
    public Boolean A01;
    public String A02;
    public final int A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3NJ c3nj = (C3NJ) obj;
            if (!this.A05.equals(c3nj.A05) || this.A04 != c3nj.A04) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return A01(false);
    }

    private String A00(C3NL c3nl, boolean z) {
        String str = c3nl.A01;
        if (str == null) {
            str = "";
        }
        if (!str.isEmpty() && z) {
            String A05 = AbstractC13670mt.A05("#", AbstractC92144Au.A02(new C42109IlJ(this), Arrays.asList(str.split("#"))));
            if (A05 == null) {
                return "";
            }
            return A05;
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String A01(boolean z) {
        Object[] objArr;
        String str;
        String str2 = this.A05;
        if (str2.startsWith("TRUNCATEDx")) {
            return str2;
        }
        C3NL c3nl = this.A00;
        C3NL c3nl2 = c3nl;
        if (c3nl == null) {
            c3nl2 = new Object();
        }
        boolean booleanValue = this.A01.booleanValue();
        Integer valueOf = Integer.valueOf(this.A03);
        String str3 = this.A06;
        String str4 = this.A07;
        String A00 = A00(c3nl2, z);
        String str5 = c3nl2.A00;
        if (booleanValue) {
            if (str5 == null) {
                str5 = "";
            }
            objArr = new Object[]{str2, valueOf, str3, str4, A00, str5, this.A02};
            str = "%s:%d:%s:%s:%s:%s:%s";
        } else {
            if (str5 == null) {
                str5 = "";
            }
            objArr = new Object[]{str2, valueOf, str3, str4, A00, str5};
            str = "%s:%d:%s:%s:%s:%s";
        }
        return AbstractC13670mt.A06(str, objArr);
    }

    public final int hashCode() {
        return (this.A05.hashCode() * 31) + this.A04;
    }

    public C3NJ(String str, String str2, int i, int i2, String str3, String str4) {
        this.A05 = str;
        this.A03 = i;
        this.A06 = str2;
        this.A07 = str3;
        this.A02 = str4;
        this.A04 = i2;
        this.A01 = Boolean.valueOf(str4 != null);
    }
}
