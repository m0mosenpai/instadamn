package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class URI extends C0T6 implements InterfaceC72037XFz {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.InterfaceC72037XFz
    public final URI Ezg() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof URI) {
                URI uri = (URI) obj;
                if (!C14360o3.A0K(this.A00, uri.A00) || !C14360o3.A0K(this.A01, uri.A01) || !C14360o3.A0K(this.A02, uri.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72037XFz
    public final String CDw() {
        return this.A01;
    }

    @Override // X.InterfaceC72037XFz
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTSocialContextUser", AbstractC68390VOy.A00(this));
    }

    @Override // X.InterfaceC72037XFz
    public final String getProfilePicUrl() {
        return this.A00;
    }

    @Override // X.InterfaceC72037XFz
    public final String getUsername() {
        return this.A02;
    }

    public final int hashCode() {
        int i = 0;
        int A0O = ((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0O + i;
    }

    public URI(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
