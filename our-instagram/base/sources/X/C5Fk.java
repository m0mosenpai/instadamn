package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.5Fk, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5Fk extends C0T6 implements C4o9 {
    public final Integer A00;
    public final Integer A01;
    public final Integer A02;
    public final Integer A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final List A0A;
    public final List A0B;
    public final List A0C;

    public C5Fk(Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4) {
        C14360o3.A0B(str2, 4);
        this.A09 = list;
        this.A04 = str;
        this.A00 = num;
        this.A05 = str2;
        this.A01 = num2;
        this.A06 = str3;
        this.A0A = list2;
        this.A02 = num3;
        this.A03 = num4;
        this.A07 = str4;
        this.A0B = list3;
        this.A0C = list4;
        this.A08 = str5;
    }

    @Override // X.C4o9
    public final C5Fk F7B() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C5Fk) {
                C5Fk c5Fk = (C5Fk) obj;
                if (!C14360o3.A0K(this.A09, c5Fk.A09) || !C14360o3.A0K(this.A04, c5Fk.A04) || !C14360o3.A0K(this.A00, c5Fk.A00) || !C14360o3.A0K(this.A05, c5Fk.A05) || !C14360o3.A0K(this.A01, c5Fk.A01) || !C14360o3.A0K(this.A06, c5Fk.A06) || !C14360o3.A0K(this.A0A, c5Fk.A0A) || !C14360o3.A0K(this.A02, c5Fk.A02) || !C14360o3.A0K(this.A03, c5Fk.A03) || !C14360o3.A0K(this.A07, c5Fk.A07) || !C14360o3.A0K(this.A0B, c5Fk.A0B) || !C14360o3.A0K(this.A0C, c5Fk.A0C) || !C14360o3.A0K(this.A08, c5Fk.A08)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A09;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A04;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A00;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.A05.hashCode()) * 31;
        Integer num2 = this.A01;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.A06;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A0A;
        int hashCode6 = (hashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num3 = this.A02;
        int hashCode7 = (hashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A03;
        int hashCode8 = (hashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.A07;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list3 = this.A0B;
        int hashCode10 = (hashCode9 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.A0C;
        int hashCode11 = (hashCode10 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str4 = this.A08;
        return hashCode11 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // X.C4o9
    public final List Agz() {
        return this.A09;
    }

    @Override // X.C4o9
    public final String Alu() {
        return this.A04;
    }

    @Override // X.C4o9
    public final Integer AwU() {
        return this.A00;
    }

    @Override // X.C4o9
    public final Integer BGg() {
        return this.A01;
    }

    @Override // X.C4o9
    public final String BGu() {
        return this.A06;
    }

    @Override // X.C4o9
    public final List BGw() {
        return this.A0A;
    }

    @Override // X.C4o9
    public final Integer BGz() {
        return this.A02;
    }

    @Override // X.C4o9
    public final Integer BTi() {
        return this.A03;
    }

    @Override // X.C4o9
    public final String C39() {
        return this.A07;
    }

    @Override // X.C4o9
    public final List C3g() {
        return this.A0B;
    }

    @Override // X.C4o9
    public final List C8z() {
        return this.A0C;
    }

    @Override // X.C4o9
    public final String C90() {
        return this.A08;
    }

    @Override // X.C4o9
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelsAdMidSceneInfoDict", CKM.A00(this));
    }

    @Override // X.C4o9
    public final String getFormat() {
        return this.A05;
    }
}
