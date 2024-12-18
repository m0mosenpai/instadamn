package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4to, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C108054to extends C0T6 implements InterfaceC108064tp {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC108064tp
    public final C108054to Euo() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C108054to) {
                C108054to c108054to = (C108054to) obj;
                if (!C14360o3.A0K(this.A00, c108054to.A00) || !C14360o3.A0K(this.A01, c108054to.A01) || !C14360o3.A0K(this.A02, c108054to.A02) || !C14360o3.A0K(this.A03, c108054to.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.A01;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.A03;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // X.InterfaceC108064tp
    public final String AZ6() {
        return this.A00;
    }

    @Override // X.InterfaceC108064tp
    public final String BKx() {
        return this.A02;
    }

    @Override // X.InterfaceC108064tp
    public final List BZN() {
        return this.A03;
    }

    @Override // X.InterfaceC108064tp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGLeadGenQuestionCardDict", AbstractC39984HoP.A00(this));
    }

    @Override // X.InterfaceC108064tp
    public final String getCtaText() {
        return this.A01;
    }

    public C108054to(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = list;
    }
}
