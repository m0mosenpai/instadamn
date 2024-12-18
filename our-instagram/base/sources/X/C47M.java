package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.47M, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C47M extends C0T6 implements C47N {
    public final C54M A00;
    public final C115875Md A01;
    public final C47F A02;
    public final C115895Mf A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Float A08;
    public final Float A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final List A0J;
    public final List A0K;
    public final List A0L;
    public final List A0M;
    public final List A0N;

    @Override // X.C47N
    public final C47N EBf(C1DY c1dy) {
        return this;
    }

    @Override // X.C47N
    public final C47M F5V(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47M) {
                C47M c47m = (C47M) obj;
                if (!C14360o3.A0K(this.A0B, c47m.A0B) || !C14360o3.A0K(this.A0C, c47m.A0C) || !C14360o3.A0K(this.A0D, c47m.A0D) || !C14360o3.A0K(this.A02, c47m.A02) || !C14360o3.A0K(this.A05, c47m.A05) || !C14360o3.A0K(this.A06, c47m.A06) || !C14360o3.A0K(this.A0E, c47m.A0E) || !C14360o3.A0K(this.A0F, c47m.A0F) || !C14360o3.A0K(this.A07, c47m.A07) || !C14360o3.A0K(this.A0J, c47m.A0J) || !C14360o3.A0K(this.A0A, c47m.A0A) || !C14360o3.A0K(this.A0K, c47m.A0K) || !C14360o3.A0K(this.A0L, c47m.A0L) || !C14360o3.A0K(this.A01, c47m.A01) || !C14360o3.A0K(this.A0G, c47m.A0G) || !C14360o3.A0K(this.A08, c47m.A08) || !C14360o3.A0K(this.A0H, c47m.A0H) || !C14360o3.A0K(this.A0M, c47m.A0M) || !C14360o3.A0K(this.A0N, c47m.A0N) || !C14360o3.A0K(this.A00, c47m.A00) || !C14360o3.A0K(this.A04, c47m.A04) || !C14360o3.A0K(this.A03, c47m.A03) || !C14360o3.A0K(this.A0I, c47m.A0I) || !C14360o3.A0K(this.A09, c47m.A09)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A0B;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A0C;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0D;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C47F c47f = this.A02;
        int hashCode4 = (hashCode3 + (c47f == null ? 0 : c47f.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A06;
        int hashCode6 = (hashCode5 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str4 = this.A0E;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0F;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool3 = this.A07;
        int hashCode9 = (hashCode8 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List list = this.A0J;
        int hashCode10 = (hashCode9 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.A0A;
        int hashCode11 = (hashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        List list2 = this.A0K;
        int hashCode12 = (hashCode11 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.A0L;
        int hashCode13 = (hashCode12 + (list3 == null ? 0 : list3.hashCode())) * 31;
        C115875Md c115875Md = this.A01;
        int hashCode14 = (hashCode13 + (c115875Md == null ? 0 : c115875Md.hashCode())) * 31;
        String str6 = this.A0G;
        int hashCode15 = (hashCode14 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Float f = this.A08;
        int hashCode16 = (hashCode15 + (f == null ? 0 : f.hashCode())) * 31;
        String str7 = this.A0H;
        int hashCode17 = (hashCode16 + (str7 == null ? 0 : str7.hashCode())) * 31;
        List list4 = this.A0M;
        int hashCode18 = (hashCode17 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.A0N;
        int hashCode19 = (hashCode18 + (list5 == null ? 0 : list5.hashCode())) * 31;
        C54M c54m = this.A00;
        int hashCode20 = (hashCode19 + (c54m == null ? 0 : c54m.hashCode())) * 31;
        User user = this.A04;
        int hashCode21 = (hashCode20 + (user == null ? 0 : user.hashCode())) * 31;
        C115895Mf c115895Mf = this.A03;
        int hashCode22 = (hashCode21 + (c115895Mf == null ? 0 : c115895Mf.hashCode())) * 31;
        String str8 = this.A0I;
        int hashCode23 = (hashCode22 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f2 = this.A09;
        return hashCode23 + (f2 != null ? f2.hashCode() : 0);
    }

    @Override // X.C47N
    public final String Af0() {
        return this.A0C;
    }

    @Override // X.C47N
    public final String Alc() {
        return this.A0D;
    }

    @Override // X.C47N
    public final C47F AvM() {
        return this.A02;
    }

    @Override // X.C47N
    public final Boolean B7Q() {
        return this.A05;
    }

    @Override // X.C47N
    public final Boolean BCj() {
        return this.A06;
    }

    @Override // X.C47N
    public final String BEi() {
        return this.A0E;
    }

    @Override // X.C47N
    public final String BIz() {
        return this.A0F;
    }

    @Override // X.C47N
    public final List BL9() {
        return this.A0J;
    }

    @Override // X.C47N
    public final Integer BQb() {
        return this.A0A;
    }

    @Override // X.C47N
    public final List BR1() {
        return this.A0K;
    }

    @Override // X.C47N
    public final List BR6() {
        return this.A0L;
    }

    @Override // X.C47N
    public final /* bridge */ /* synthetic */ InterfaceC115885Me Bfs() {
        return this.A01;
    }

    @Override // X.C47N
    public final String Blg() {
        return this.A0G;
    }

    @Override // X.C47N
    public final Float Bqj() {
        return this.A08;
    }

    @Override // X.C47N
    public final String ByJ() {
        return this.A0H;
    }

    @Override // X.C47N
    public final List ByM() {
        return this.A0M;
    }

    @Override // X.C47N
    public final List C8C() {
        return this.A0N;
    }

    @Override // X.C47N
    public final /* bridge */ /* synthetic */ C54N CDJ() {
        return this.A00;
    }

    @Override // X.C47N
    public final User CDj() {
        return this.A04;
    }

    @Override // X.C47N
    public final /* bridge */ /* synthetic */ InterfaceC115905Mg CE5() {
        return this.A03;
    }

    @Override // X.C47N
    public final String CEI() {
        return this.A0I;
    }

    @Override // X.C47N
    public final Float CER() {
        return this.A09;
    }

    @Override // X.C47N
    public final Boolean CZO() {
        return this.A07;
    }

    @Override // X.C47N
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSuggestedUserTypedDict", AbstractC40708I2o.A00(this));
    }

    @Override // X.C47N
    public final String getAlgorithm() {
        return this.A0B;
    }

    public C47M(C54M c54m, C115875Md c115875Md, C47F c47f, C115895Mf c115895Mf, User user, Boolean bool, Boolean bool2, Boolean bool3, Float f, Float f2, Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, List list2, List list3, List list4, List list5) {
        this.A0B = str;
        this.A0C = str2;
        this.A0D = str3;
        this.A02 = c47f;
        this.A05 = bool;
        this.A06 = bool2;
        this.A0E = str4;
        this.A0F = str5;
        this.A07 = bool3;
        this.A0J = list;
        this.A0A = num;
        this.A0K = list2;
        this.A0L = list3;
        this.A01 = c115875Md;
        this.A0G = str6;
        this.A08 = f;
        this.A0H = str7;
        this.A0M = list4;
        this.A0N = list5;
        this.A00 = c54m;
        this.A04 = user;
        this.A03 = c115895Mf;
        this.A0I = str8;
        this.A09 = f2;
    }
}
