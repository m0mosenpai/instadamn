package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UR9 extends C0T6 implements InterfaceC72032XFu {
    public final Integer A00;
    public final Integer A01;

    @Override // X.InterfaceC72032XFu
    public final UR9 Ex9() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UR9) {
                UR9 ur9 = (UR9) obj;
                if (!C14360o3.A0K(this.A00, ur9.A00) || !C14360o3.A0K(this.A01, ur9.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72032XFu
    public final Integer Bz7() {
        return this.A00;
    }

    @Override // X.InterfaceC72032XFu
    public final Integer Bze() {
        return this.A01;
    }

    @Override // X.InterfaceC72032XFu
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardPhotoAnimation", AbstractC68377VOl.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = AbstractC167017dG.A0M(this.A00) * 31;
        Integer num = this.A01;
        if (num != null) {
            i = num.hashCode();
        }
        return A0M + i;
    }

    public UR9(Integer num, Integer num2) {
        this.A00 = num;
        this.A01 = num2;
    }
}
