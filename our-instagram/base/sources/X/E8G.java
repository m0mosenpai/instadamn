package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.XFBYPRequestStatus;

/* loaded from: classes6.dex */
public final class E8G extends C0T6 implements C5F2 {
    public final XFBYPRequestStatus A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.C5F2
    public final E8G F3N() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E8G) {
                E8G e8g = (E8G) obj;
                if (!C14360o3.A0K(this.A02, e8g.A02) || !C14360o3.A0K(this.A01, e8g.A01) || !C14360o3.A0K(this.A03, e8g.A03) || this.A00 != e8g.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5F2
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTimeLimitExtensionRequestData", AbstractC33758Evk.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A00);
    }

    public E8G(XFBYPRequestStatus xFBYPRequestStatus, Integer num, String str, String str2) {
        this.A02 = str;
        this.A01 = num;
        this.A03 = str2;
        this.A00 = xFBYPRequestStatus;
    }

    @Override // X.C5F2
    public final String Avz() {
        return this.A02;
    }

    @Override // X.C5F2
    public final Integer BAI() {
        return this.A01;
    }

    @Override // X.C5F2
    public final XFBYPRequestStatus C0J() {
        return this.A00;
    }

    @Override // X.C5F2
    public final String getId() {
        return this.A03;
    }
}
