package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3vq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87823vq extends C0T6 implements InterfaceC87833vr {
    public final int A00;
    public final String A01;

    public C87823vq(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.InterfaceC87833vr
    public final C87823vq Ezf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C87823vq) {
                C87823vq c87823vq = (C87823vq) obj;
                if (this.A00 != c87823vq.A00 || !C14360o3.A0K(this.A01, c87823vq.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC87833vr
    public final int C3G() {
        return this.A00;
    }

    @Override // X.InterfaceC87833vr
    public final String C3H() {
        return this.A01;
    }

    @Override // X.InterfaceC87833vr
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextSubitem", CDW.A00(this));
    }
}
