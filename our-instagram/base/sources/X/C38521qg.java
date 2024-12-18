package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.1qg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38521qg extends C0T6 implements InterfaceC38531qh {
    public final ImageUrl A00;
    public final String A01;

    public C38521qg(ImageUrl imageUrl, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = imageUrl;
        this.A01 = str;
    }

    @Override // X.InterfaceC38531qh
    public final C38521qg Ez6() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38521qg) {
                C38521qg c38521qg = (C38521qg) obj;
                if (!C14360o3.A0K(this.A00, c38521qg.A00) || !C14360o3.A0K(this.A01, c38521qg.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        return ((imageUrl == null ? 0 : imageUrl.hashCode()) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC38531qh
    public final ImageUrl BGt() {
        return this.A00;
    }

    @Override // X.InterfaceC38531qh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelToastAPI", AbstractC33736EvO.A00(this));
    }

    @Override // X.InterfaceC38531qh
    public final String getText() {
        return this.A01;
    }
}
