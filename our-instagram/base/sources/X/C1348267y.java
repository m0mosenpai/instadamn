package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.67y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1348267y extends C0T6 implements InterfaceC1347967p {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C1348267y(Boolean bool, Integer num, String str, String str2, List list) {
        C14360o3.A0B(str, 3);
        C14360o3.A0B(str2, 4);
        this.A04 = list;
        this.A01 = num;
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
    }

    @Override // X.InterfaceC1347967p
    public final C1348267y Eyk(C1DY c1dy) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1348267y) {
                C1348267y c1348267y = (C1348267y) obj;
                if (!C14360o3.A0K(this.A04, c1348267y.A04) || !C14360o3.A0K(this.A01, c1348267y.A01) || !C14360o3.A0K(this.A02, c1348267y.A02) || !C14360o3.A0K(this.A03, c1348267y.A03) || !C14360o3.A0K(this.A00, c1348267y.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A04;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.A01;
        int hashCode2 = (((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31;
        Boolean bool = this.A00;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC1347967p
    public final List B49() {
        return this.A04;
    }

    @Override // X.InterfaceC1347967p
    public final Integer BXh() {
        return this.A01;
    }

    @Override // X.InterfaceC1347967p
    public final String Big() {
        return this.A02;
    }

    @Override // X.InterfaceC1347967p
    public final String Bim() {
        return this.A03;
    }

    @Override // X.InterfaceC1347967p
    public final Boolean Bvl() {
        return this.A00;
    }

    @Override // X.InterfaceC1347967p
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTPromptPogResponseInfo", AbstractC40192HsC.A00(this));
    }
}
