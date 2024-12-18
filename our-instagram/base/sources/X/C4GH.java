package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.4GH, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GH extends C0T6 implements C4GI {
    public final User A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Integer A03;
    public final Integer A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;

    public C4GH(User user, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, String str2, String str3, String str4, List list, boolean z) {
        C14360o3.A0B(str3, 7);
        C14360o3.A0B(user, 11);
        this.A05 = str;
        this.A01 = bool;
        this.A0A = z;
        this.A02 = bool2;
        this.A06 = str2;
        this.A03 = num;
        this.A07 = str3;
        this.A04 = num2;
        this.A08 = str4;
        this.A09 = list;
        this.A00 = user;
    }

    @Override // X.C4GI
    public final C4GI EBJ(C1DY c1dy) {
        return this;
    }

    @Override // X.C4GI
    public final C4GH F4Q(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4GH) {
                C4GH c4gh = (C4GH) obj;
                if (!C14360o3.A0K(this.A05, c4gh.A05) || !C14360o3.A0K(this.A01, c4gh.A01) || this.A0A != c4gh.A0A || !C14360o3.A0K(this.A02, c4gh.A02) || !C14360o3.A0K(this.A06, c4gh.A06) || !C14360o3.A0K(this.A03, c4gh.A03) || !C14360o3.A0K(this.A07, c4gh.A07) || !C14360o3.A0K(this.A04, c4gh.A04) || !C14360o3.A0K(this.A08, c4gh.A08) || !C14360o3.A0K(this.A09, c4gh.A09) || !C14360o3.A0K(this.A00, c4gh.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C4GI
    public final String B8F() {
        return this.A05;
    }

    @Override // X.C4GI
    public final Boolean BPj() {
        return this.A02;
    }

    @Override // X.C4GI
    public final Integer BXE() {
        return this.A03;
    }

    @Override // X.C4GI
    public final Integer Bgd() {
        return this.A04;
    }

    @Override // X.C4GI
    public final List BxC() {
        return this.A09;
    }

    @Override // X.C4GI
    public final User CDj() {
        return this.A00;
    }

    @Override // X.C4GI
    public final Boolean CXM() {
        return this.A01;
    }

    @Override // X.C4GI
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMashupOriginalMediaInfo", AbstractC37426Ge6.A00(this));
    }

    @Override // X.C4GI
    public final String getMediaType() {
        return this.A06;
    }

    @Override // X.C4GI
    public final String getPk() {
        return this.A07;
    }

    @Override // X.C4GI
    public final String getProductType() {
        return this.A08;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        String str = this.A05;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Boolean bool = this.A01;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        int i4 = 1237;
        if (this.A0A) {
            i4 = 1231;
        }
        int i5 = (i3 + i4) * 31;
        Boolean bool2 = this.A02;
        if (bool2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool2.hashCode();
        }
        int i6 = (i5 + hashCode3) * 31;
        String str2 = this.A06;
        if (str2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str2.hashCode();
        }
        int i7 = (i6 + hashCode4) * 31;
        Integer num = this.A03;
        if (num == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num.hashCode();
        }
        int hashCode8 = (((i7 + hashCode5) * 31) + this.A07.hashCode()) * 31;
        Integer num2 = this.A04;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i8 = (hashCode8 + hashCode6) * 31;
        String str3 = this.A08;
        if (str3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str3.hashCode();
        }
        int i9 = (i8 + hashCode7) * 31;
        List list = this.A09;
        if (list != null) {
            i = list.hashCode();
        }
        return ((i9 + i) * 31) + this.A00.hashCode();
    }

    @Override // X.C4GI
    public final boolean isPivotPageAvailable() {
        return this.A0A;
    }
}
