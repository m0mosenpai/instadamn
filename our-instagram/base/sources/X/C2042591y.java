package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.91y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2042591y extends C0T6 implements InterfaceC2042691z {
    public final String A00;
    public final String A01;

    public C2042591y(String str, String str2) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.InterfaceC2042691z
    public final C2042591y F3n() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2042591y) {
                C2042591y c2042591y = (C2042591y) obj;
                if (!C14360o3.A0K(this.A00, c2042591y.A00) || !C14360o3.A0K(this.A01, c2042591y.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC2042691z
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTVisualRepliesCommentInfo", AbstractC225559xa.A00(this));
    }

    @Override // X.InterfaceC2042691z
    public final String getCommentId() {
        return this.A00;
    }

    @Override // X.InterfaceC2042691z
    public final String getCommenterUsername() {
        return this.A01;
    }
}
