package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ImageInfo;

/* renamed from: X.4xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110094xe extends C0T6 implements InterfaceC110104xf {
    public final ImageInfo A00;
    public final String A01;
    public final String A02;

    public C110094xe(ImageInfo imageInfo, String str, String str2) {
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        this.A00 = imageInfo;
        this.A01 = str;
        this.A02 = str2;
    }

    @Override // X.InterfaceC110104xf
    public final C110094xe EsA() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110094xe) {
                C110094xe c110094xe = (C110094xe) obj;
                if (!C14360o3.A0K(this.A00, c110094xe.A00) || !C14360o3.A0K(this.A01, c110094xe.A01) || !C14360o3.A0K(this.A02, c110094xe.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ImageInfo imageInfo = this.A00;
        return ((((imageInfo == null ? 0 : imageInfo.hashCode()) * 31) + this.A01.hashCode()) * 31) + this.A02.hashCode();
    }

    @Override // X.InterfaceC110104xf
    public final ImageInfo BGx() {
        return this.A00;
    }

    @Override // X.InterfaceC110104xf
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateAttributionInfo", AbstractC39826Hla.A00(this));
    }

    @Override // X.InterfaceC110104xf
    public final String getOwnerUsername() {
        return this.A01;
    }

    @Override // X.InterfaceC110104xf
    public final String getTemplateMediaId() {
        return this.A02;
    }
}
