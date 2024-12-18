package X;

import java.util.List;

/* renamed from: X.Tyu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66057Tyu extends C0T6 {
    public final int A00;
    public final C66056Tyt A01;
    public final UP3 A02;
    public final C66058Tyv A03;
    public final Integer A04;
    public final Long A05;
    public final String A06;
    public final List A07;
    public final Long A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66057Tyu) {
                C66057Tyu c66057Tyu = (C66057Tyu) obj;
                if (!C14360o3.A0K(this.A06, c66057Tyu.A06) || this.A00 != c66057Tyu.A00 || !C14360o3.A0K(this.A07, c66057Tyu.A07) || !C14360o3.A0K(this.A02, c66057Tyu.A02) || !C14360o3.A0K(this.A01, c66057Tyu.A01) || !C14360o3.A0K(this.A08, c66057Tyu.A08) || !C14360o3.A0K(this.A05, c66057Tyu.A05) || this.A04 != c66057Tyu.A04 || !C14360o3.A0K(this.A03, c66057Tyu.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str;
        int hashCode4;
        int hashCode5 = ((((this.A06.hashCode() * 31) + this.A00) * 31) + this.A07.hashCode()) * 31;
        UP3 up3 = this.A02;
        int i = 0;
        if (up3 == null) {
            hashCode = 0;
        } else {
            hashCode = up3.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A01.hashCode()) * 31;
        Long l = this.A08;
        if (l == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = l.hashCode();
        }
        int i2 = (hashCode6 + hashCode2) * 31;
        Long l2 = this.A05;
        if (l2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = l2.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Integer num = this.A04;
        if (num == null) {
            hashCode4 = 0;
        } else {
            int intValue = num.intValue();
            switch (intValue) {
                case 1:
                    str = "INELIGIBLE";
                    break;
                case 2:
                    str = "SKIPPED";
                    break;
                default:
                    str = "ELIGIBLE";
                    break;
            }
            hashCode4 = str.hashCode() + intValue;
        }
        int i4 = (i3 + hashCode4) * 31;
        C66058Tyv c66058Tyv = this.A03;
        if (c66058Tyv != null) {
            i = c66058Tyv.hashCode();
        }
        return i4 + i;
    }

    public C66057Tyu(C66056Tyt c66056Tyt, UP3 up3, C66058Tyv c66058Tyv, Integer num, Long l, Long l2, String str, List list, int i) {
        this.A06 = str;
        this.A00 = i;
        this.A07 = list;
        this.A02 = up3;
        this.A01 = c66056Tyt;
        this.A08 = l;
        this.A05 = l2;
        this.A04 = num;
        this.A03 = c66058Tyv;
    }
}
