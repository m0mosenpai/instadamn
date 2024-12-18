package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.16r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C223616r extends C0T6 implements InterfaceC223716s {
    public final C5F2 A00;
    public final Boolean A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final List A0I;

    @Override // X.InterfaceC223716s
    public final C223616r F2e() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C223616r) {
                C223616r c223616r = (C223616r) obj;
                if (!C14360o3.A0K(this.A0E, c223616r.A0E) || !C14360o3.A0K(this.A0G, c223616r.A0G) || !C14360o3.A0K(this.A01, c223616r.A01) || !C14360o3.A0K(this.A02, c223616r.A02) || !C14360o3.A0K(this.A03, c223616r.A03) || !C14360o3.A0K(this.A04, c223616r.A04) || !C14360o3.A0K(this.A05, c223616r.A05) || !C14360o3.A0K(this.A06, c223616r.A06) || !C14360o3.A0K(this.A07, c223616r.A07) || !C14360o3.A0K(this.A08, c223616r.A08) || !C14360o3.A0K(this.A09, c223616r.A09) || !C14360o3.A0K(this.A0A, c223616r.A0A) || !C14360o3.A0K(this.A0B, c223616r.A0B) || !C14360o3.A0K(this.A0C, c223616r.A0C) || !C14360o3.A0K(this.A0D, c223616r.A0D) || !C14360o3.A0K(this.A00, c223616r.A00) || !C14360o3.A0K(this.A0I, c223616r.A0I) || !C14360o3.A0K(this.A0H, c223616r.A0H) || !C14360o3.A0K(this.A0F, c223616r.A0F)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A0E;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A0G;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A02;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.A03;
        int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.A04;
        int hashCode6 = (hashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.A05;
        int hashCode7 = (hashCode6 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.A06;
        int hashCode8 = (hashCode7 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.A07;
        int hashCode9 = (hashCode8 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.A08;
        int hashCode10 = (hashCode9 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        Boolean bool9 = this.A09;
        int hashCode11 = (hashCode10 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.A0A;
        int hashCode12 = (hashCode11 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        Boolean bool11 = this.A0B;
        int hashCode13 = (hashCode12 + (bool11 == null ? 0 : bool11.hashCode())) * 31;
        Boolean bool12 = this.A0C;
        int hashCode14 = (hashCode13 + (bool12 == null ? 0 : bool12.hashCode())) * 31;
        Boolean bool13 = this.A0D;
        int hashCode15 = (hashCode14 + (bool13 == null ? 0 : bool13.hashCode())) * 31;
        C5F2 c5f2 = this.A00;
        int hashCode16 = (hashCode15 + (c5f2 == null ? 0 : c5f2.hashCode())) * 31;
        List list = this.A0I;
        int hashCode17 = (hashCode16 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A0H;
        int hashCode18 = (hashCode17 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.A0F;
        return hashCode18 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // X.InterfaceC223716s
    public final Integer AvU() {
        return this.A0E;
    }

    @Override // X.InterfaceC223716s
    public final String B5G() {
        return this.A0G;
    }

    @Override // X.InterfaceC223716s
    public final Boolean BBp() {
        return this.A01;
    }

    @Override // X.InterfaceC223716s
    public final Boolean BCi() {
        return this.A02;
    }

    @Override // X.InterfaceC223716s
    public final C5F2 BMG() {
        return this.A00;
    }

    @Override // X.InterfaceC223716s
    public final List Bjn() {
        return this.A0I;
    }

    @Override // X.InterfaceC223716s
    public final String Bqn() {
        return this.A0H;
    }

    @Override // X.InterfaceC223716s
    public final Integer Bqo() {
        return this.A0F;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CQe() {
        return this.A03;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CSI() {
        return this.A04;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CTX() {
        return this.A05;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CVf() {
        return this.A06;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CVg() {
        return this.A07;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CYu() {
        return this.A08;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CbT() {
        return this.A09;
    }

    @Override // X.InterfaceC223716s
    public final Boolean CbU() {
        return this.A0A;
    }

    @Override // X.InterfaceC223716s
    public final Boolean Cdz() {
        return this.A0B;
    }

    @Override // X.InterfaceC223716s
    public final Boolean Ce0() {
        return this.A0C;
    }

    @Override // X.InterfaceC223716s
    public final Boolean Ce1() {
        return this.A0D;
    }

    @Override // X.InterfaceC223716s
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSupervisionInfo", AbstractC65961TxD.A00(this));
    }

    public C223616r(C5F2 c5f2, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Integer num2, String str, String str2, List list) {
        this.A0E = num;
        this.A0G = str;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = bool3;
        this.A04 = bool4;
        this.A05 = bool5;
        this.A06 = bool6;
        this.A07 = bool7;
        this.A08 = bool8;
        this.A09 = bool9;
        this.A0A = bool10;
        this.A0B = bool11;
        this.A0C = bool12;
        this.A0D = bool13;
        this.A00 = c5f2;
        this.A0I = list;
        this.A0H = str2;
        this.A0F = num2;
    }
}
