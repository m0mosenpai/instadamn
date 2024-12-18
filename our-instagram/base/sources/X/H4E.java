package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;

/* loaded from: classes7.dex */
public final class H4E extends C0T6 implements JKP {
    public final MetaGalleryNetegoInStoryMediaType A00;
    public final String A01;

    @Override // X.JKP
    public final H4E Ewf() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4E) {
                H4E h4e = (H4E) obj;
                if (this.A00 != h4e.A00 || !C14360o3.A0K(this.A01, h4e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKP
    public final MetaGalleryNetegoInStoryMediaType BRo() {
        return this.A00;
    }

    @Override // X.JKP
    public final String BS0() {
        return this.A01;
    }

    @Override // X.JKP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTMetaGalleryNetegoInStoryMediaInfo", AbstractC40075Hq1.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H4E(MetaGalleryNetegoInStoryMediaType metaGalleryNetegoInStoryMediaType, String str) {
        this.A00 = metaGalleryNetegoInStoryMediaType;
        this.A01 = str;
    }
}
