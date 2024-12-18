package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7Qd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162667Qd extends C0T6 {
    public final EnumC162657Qc A00;
    public final C7P3 A01;
    public final C7TT A02;
    public final EnumC101664hb A03;
    public final C2EY A04;
    public final MessageIdentifier A05;
    public final C3YU A06;
    public final C4NJ A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162667Qd) {
                C162667Qd c162667Qd = (C162667Qd) obj;
                if (!C14360o3.A0K(this.A05, c162667Qd.A05) || this.A04 != c162667Qd.A04 || this.A0F != c162667Qd.A0F || this.A01 != c162667Qd.A01 || this.A0D != c162667Qd.A0D || this.A0C != c162667Qd.A0C || this.A0E != c162667Qd.A0E || this.A08 != c162667Qd.A08 || this.A0H != c162667Qd.A0H || !C14360o3.A0K(this.A07, c162667Qd.A07) || this.A0G != c162667Qd.A0G || !C14360o3.A0K(this.A0A, c162667Qd.A0A) || !C14360o3.A0K(this.A09, c162667Qd.A09) || this.A03 != c162667Qd.A03 || this.A00 != c162667Qd.A00 || this.A0I != c162667Qd.A0I || this.A06 != c162667Qd.A06 || !C14360o3.A0K(this.A02, c162667Qd.A02) || this.A0J != c162667Qd.A0J || !C14360o3.A0K(this.A0B, c162667Qd.A0B)) {
                }
            }
            return false;
        }
        return true;
    }

    public C162667Qd(EnumC162657Qc enumC162657Qc, C7P3 c7p3, C7TT c7tt, EnumC101664hb enumC101664hb, C2EY c2ey, MessageIdentifier messageIdentifier, C3YU c3yu, C4NJ c4nj, Integer num, Integer num2, String str, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        C14360o3.A0B(enumC162657Qc, 16);
        this.A05 = messageIdentifier;
        this.A04 = c2ey;
        this.A0F = z;
        this.A01 = c7p3;
        this.A0D = z2;
        this.A0C = z3;
        this.A0E = z4;
        this.A08 = num;
        this.A0H = z5;
        this.A07 = c4nj;
        this.A0G = z6;
        this.A0A = str;
        this.A09 = num2;
        this.A03 = enumC101664hb;
        this.A00 = enumC162657Qc;
        this.A0I = z7;
        this.A06 = c3yu;
        this.A02 = c7tt;
        this.A0J = z8;
        this.A0B = list;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = ((this.A05.hashCode() * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A0F) {
            i = 1231;
        }
        int hashCode7 = (((hashCode6 + i) * 31) + this.A01.hashCode()) * 31;
        int i2 = 1237;
        if (this.A0D) {
            i2 = 1231;
        }
        int i3 = (hashCode7 + i2) * 31;
        int i4 = 1237;
        if (this.A0C) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        int i6 = 1237;
        if (this.A0E) {
            i6 = 1231;
        }
        int A00 = (((i5 + i6) * 31) + A0X.A00(this.A08)) * 31;
        int i7 = 1237;
        if (this.A0H) {
            i7 = 1231;
        }
        int A002 = (((A00 + i7) * 31) + AbstractC53644Nnp.A00()) * 31;
        C4NJ c4nj = this.A07;
        int i8 = 0;
        if (c4nj == null) {
            hashCode = 0;
        } else {
            hashCode = c4nj.hashCode();
        }
        int i9 = (A002 + hashCode) * 31;
        int i10 = 1237;
        if (this.A0G) {
            i10 = 1231;
        }
        int hashCode8 = (((i9 + i10) * 31) + this.A0A.hashCode()) * 31;
        Integer num = this.A09;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i11 = (hashCode8 + hashCode2) * 31;
        EnumC101664hb enumC101664hb = this.A03;
        if (enumC101664hb == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = enumC101664hb.hashCode();
        }
        int hashCode9 = (((i11 + hashCode3) * 31) + this.A00.hashCode()) * 31;
        int i12 = 1237;
        if (this.A0I) {
            i12 = 1231;
        }
        int i13 = (hashCode9 + i12) * 31;
        C3YU c3yu = this.A06;
        if (c3yu == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = c3yu.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        C7TT c7tt = this.A02;
        if (c7tt == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = c7tt.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        int i16 = 1237;
        if (this.A0J) {
            i16 = 1231;
        }
        int i17 = (i15 + i16) * 31;
        List list = this.A0B;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i17 + i8;
    }
}
