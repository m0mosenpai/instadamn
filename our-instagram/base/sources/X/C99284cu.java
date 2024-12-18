package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4cu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C99284cu extends C0T6 implements InterfaceC99294cv {
    public final Boolean A00;
    public final Boolean A01;
    public final Integer A02;
    public final Integer A03;
    public final Integer A04;
    public final Integer A05;
    public final List A06;

    @Override // X.InterfaceC99294cv
    public final C99284cu EtT() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C99284cu) {
                C99284cu c99284cu = (C99284cu) obj;
                if (!C14360o3.A0K(this.A00, c99284cu.A00) || !C14360o3.A0K(this.A02, c99284cu.A02) || !C14360o3.A0K(this.A03, c99284cu.A03) || !C14360o3.A0K(this.A01, c99284cu.A01) || !C14360o3.A0K(this.A04, c99284cu.A04) || !C14360o3.A0K(this.A05, c99284cu.A05) || !C14360o3.A0K(this.A06, c99284cu.A06)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Boolean bool = this.A00;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.A02;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A03;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool2 = this.A01;
        int hashCode4 = (hashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num3 = this.A04;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.A05;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        List list = this.A06;
        return hashCode6 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC99294cv
    public final Boolean B2F() {
        return this.A00;
    }

    @Override // X.InterfaceC99294cv
    public final Integer B5T() {
        return this.A02;
    }

    @Override // X.InterfaceC99294cv
    public final Integer B5V() {
        return this.A03;
    }

    @Override // X.InterfaceC99294cv
    public final Integer BNE() {
        return this.A04;
    }

    @Override // X.InterfaceC99294cv
    public final Integer BnF() {
        return this.A05;
    }

    @Override // X.InterfaceC99294cv
    public final List BnL() {
        return this.A06;
    }

    @Override // X.InterfaceC99294cv
    public final Boolean CUd() {
        return this.A01;
    }

    @Override // X.InterfaceC99294cv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextPostAppMediaFediverseInfo", AbstractC46589KjS.A00(this));
    }

    public C99284cu(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, List list) {
        this.A00 = bool;
        this.A02 = num;
        this.A03 = num2;
        this.A01 = bool2;
        this.A04 = num3;
        this.A05 = num4;
        this.A06 = list;
    }
}
