package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.MediaDestinationEnum;

/* loaded from: classes7.dex */
public final class H4D extends C0T6 implements InterfaceC58265Ps9 {
    public final GalleryMediaFolderEnum A00;
    public final MediaDestinationEnum A01;
    public final String A02;
    public final String A03;

    public H4D(GalleryMediaFolderEnum galleryMediaFolderEnum, MediaDestinationEnum mediaDestinationEnum, String str, String str2) {
        C14360o3.A0B(mediaDestinationEnum, 2);
        this.A00 = galleryMediaFolderEnum;
        this.A01 = mediaDestinationEnum;
        this.A02 = str;
        this.A03 = str2;
    }

    @Override // X.InterfaceC58265Ps9
    public final H4D EwW() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H4D) {
                H4D h4d = (H4D) obj;
                if (this.A00 != h4d.A00 || this.A01 != h4d.A01 || !C14360o3.A0K(this.A02, h4d.A02) || !C14360o3.A0K(this.A03, h4d.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58265Ps9
    public final GalleryMediaFolderEnum B9O() {
        return this.A00;
    }

    @Override // X.InterfaceC58265Ps9
    public final MediaDestinationEnum BQf() {
        return this.A01;
    }

    @Override // X.InterfaceC58265Ps9
    public final String getSubtitle() {
        return this.A02;
    }

    @Override // X.InterfaceC58265Ps9
    public final String getTitle() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AbstractC166997dE.A0J(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC25227BEk.A07(this.A03);
    }
}
