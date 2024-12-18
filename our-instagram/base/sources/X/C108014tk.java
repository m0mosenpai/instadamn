package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108014tk extends C0T6 implements InterfaceC108024tl {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;

    @Override // X.InterfaceC108024tl
    public final C108014tk Eup() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108014tk) {
                C108014tk c108014tk = (C108014tk) obj;
                if (!C14360o3.A0K(this.A04, c108014tk.A04) || !C14360o3.A0K(this.A02, c108014tk.A02) || !C14360o3.A0K(this.A00, c108014tk.A00) || !C14360o3.A0K(this.A03, c108014tk.A03) || !C14360o3.A0K(this.A05, c108014tk.A05) || !C14360o3.A0K(this.A01, c108014tk.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.A00;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.A03;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list2 = this.A05;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.A01;
        return hashCode5 + (num != null ? num.hashCode() : 0);
    }

    @Override // X.InterfaceC108024tl
    public final List Aqc() {
        return this.A04;
    }

    @Override // X.InterfaceC108024tl
    public final Boolean B0C() {
        return this.A00;
    }

    @Override // X.InterfaceC108024tl
    public final String BKx() {
        return this.A03;
    }

    @Override // X.InterfaceC108024tl
    public final List BZN() {
        return this.A05;
    }

    @Override // X.InterfaceC108024tl
    public final Integer Bjg() {
        return this.A01;
    }

    @Override // X.InterfaceC108024tl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenQuestionCardInfoDict", AbstractC39985HoQ.A00(this));
    }

    @Override // X.InterfaceC108024tl
    public final String getCtaText() {
        return this.A02;
    }

    public C108014tk(Boolean bool, Integer num, String str, String str2, List list, List list2) {
        this.A04 = list;
        this.A02 = str;
        this.A00 = bool;
        this.A03 = str2;
        this.A05 = list2;
        this.A01 = num;
    }
}
