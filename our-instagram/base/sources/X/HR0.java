package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;
import com.instagram.api.schemas.MediaDestinationEnum;

/* loaded from: classes7.dex */
public final class HR0 extends C17T implements InterfaceC58265Ps9 {
    @Override // X.InterfaceC58265Ps9
    public final GalleryMediaFolderEnum B9O() {
        return (GalleryMediaFolderEnum) A0N(1331013878, JAB.A00);
    }

    @Override // X.InterfaceC58265Ps9
    public final MediaDestinationEnum BQf() {
        return (MediaDestinationEnum) A0M(-102409165, JAC.A00);
    }

    @Override // X.InterfaceC58265Ps9
    public final H4D EwW() {
        return new H4D(B9O(), BQf(), A0U(), A0Y());
    }

    @Override // X.InterfaceC58265Ps9
    public final String getSubtitle() {
        return A0U();
    }

    @Override // X.InterfaceC58265Ps9
    public final String getTitle() {
        return A0Y();
    }
}
