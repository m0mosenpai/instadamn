package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3ve, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87703ve extends C0T6 implements InterfaceC87713vf {
    public final String A00;
    public final String A01;
    public final String A02;
    public final List A03;

    @Override // X.InterfaceC87713vf
    public final C87703ve EtZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87703ve) {
                C87703ve c87703ve = (C87703ve) obj;
                if (!C14360o3.A0K(this.A00, c87703ve.A00) || !C14360o3.A0K(this.A03, c87703ve.A03) || !C14360o3.A0K(this.A01, c87703ve.A01) || !C14360o3.A0K(this.A02, c87703ve.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A00;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.A03;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.A01;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A02;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // X.InterfaceC87713vf
    public final String AZE() {
        return this.A00;
    }

    @Override // X.InterfaceC87713vf
    public final List Bec() {
        return this.A03;
    }

    @Override // X.InterfaceC87713vf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFeedImageTooltipAdTagDict", AbstractC37407Gdn.A00(this));
    }

    @Override // X.InterfaceC87713vf
    public final String getSubtitle() {
        return this.A01;
    }

    @Override // X.InterfaceC87713vf
    public final String getTitle() {
        return this.A02;
    }

    public C87703ve(String str, String str2, String str3, List list) {
        this.A00 = str;
        this.A03 = list;
        this.A01 = str2;
        this.A02 = str3;
    }
}
