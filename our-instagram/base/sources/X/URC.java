package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URC extends C0T6 implements InterfaceC72036XFy {
    public final Float A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC72036XFy
    public final URC ExE() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URC) {
                URC urc = (URC) obj;
                if (!C14360o3.A0K(this.A01, urc.A01) || !C14360o3.A0K(this.A00, urc.A00) || !C14360o3.A0K(this.A02, urc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72036XFy
    public final String AhM() {
        return this.A01;
    }

    @Override // X.InterfaceC72036XFy
    public final Float AhN() {
        return this.A00;
    }

    @Override // X.InterfaceC72036XFy
    public final String C8B() {
        return this.A02;
    }

    @Override // X.InterfaceC72036XFy
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTNativeInfoCardThumbnail", AbstractC68383VOr.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A01) * 31) + AbstractC167017dG.A0M(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public URC(Float f, String str, String str2) {
        this.A01 = str;
        this.A00 = f;
        this.A02 = str2;
    }
}
