package X;

import java.util.List;

/* renamed from: X.7o8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C173567o8 {
    public final EnumC173197nX A00;
    public final EnumC173547o6 A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C173567o8) {
                C173567o8 c173567o8 = (C173567o8) obj;
                if (this.A00 != c173567o8.A00 || !C14360o3.A0K(this.A04, c173567o8.A04) || !C14360o3.A0K(this.A03, c173567o8.A03) || this.A01 != c173567o8.A01 || !C14360o3.A0K(this.A02, c173567o8.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A00.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        EnumC173547o6 enumC173547o6 = this.A01;
        return ((hashCode + (enumC173547o6 != null ? enumC173547o6.hashCode() : 0)) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FeatureConfig(appName=");
        sb.append(this.A00);
        sb.append(", surfaces=");
        sb.append(this.A04);
        sb.append(", contentTypes=");
        sb.append(this.A03);
        sb.append(", behavior=");
        sb.append(this.A01);
        sb.append(", additionalEligibilityRules=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C173567o8(EnumC173197nX enumC173197nX, EnumC173547o6 enumC173547o6, List list, List list2, List list3) {
        this.A00 = enumC173197nX;
        this.A04 = list;
        this.A03 = list2;
        this.A01 = enumC173547o6;
        this.A02 = list3;
    }
}
