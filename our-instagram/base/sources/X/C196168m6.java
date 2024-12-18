package X;

import java.util.List;

/* renamed from: X.8m6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196168m6 {
    public String A00;
    public String A01;
    public String A02;
    public List A03;

    public C196168m6(String str, String str2, String str3, List list) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        C14360o3.A0B(str3, 3);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C196168m6) {
                C196168m6 c196168m6 = (C196168m6) obj;
                if (!C14360o3.A0K(this.A00, c196168m6.A00) || !C14360o3.A0K(this.A01, c196168m6.A01) || !C14360o3.A0K(this.A02, c196168m6.A02) || !C14360o3.A0K(this.A03, c196168m6.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A00.hashCode() * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FxIdentity(identityId=");
        sb.append(this.A00);
        sb.append(", identityType=");
        sb.append(this.A01);
        sb.append(AbstractC111324zv.A00(573));
        sb.append(this.A02);
        sb.append(AbstractC111324zv.A00(3447));
        sb.append(this.A03);
        sb.append(')');
        return sb.toString();
    }

    public C196168m6() {
        this("", "", "", C16930sl.A00);
    }
}
