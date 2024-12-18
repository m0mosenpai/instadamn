package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoMediaCroppingCoordinates;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;

/* renamed from: X.GnH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37975GnH extends C17T implements InterfaceC88303wh {
    @Override // X.InterfaceC88303wh
    public final MediaCroppingCoordinatesIntf B5u() {
        return (MediaCroppingCoordinatesIntf) A05(30261672, ImmutablePandoMediaCroppingCoordinates.class);
    }

    @Override // X.InterfaceC88303wh
    public final MediaCroppingCoordinatesIntf BzT() {
        return (MediaCroppingCoordinatesIntf) A05(386483314, ImmutablePandoMediaCroppingCoordinates.class);
    }

    @Override // X.InterfaceC88303wh
    public final MediaCroppingCoordinatesIntf C7w() {
        return (MediaCroppingCoordinatesIntf) A05(1691945273, ImmutablePandoMediaCroppingCoordinates.class);
    }

    @Override // X.InterfaceC88303wh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC37359Gd1.A00(this));
    }

    @Override // X.InterfaceC88303wh
    public final C88293wg EwG() {
        MediaCroppingCoordinates mediaCroppingCoordinates;
        MediaCroppingCoordinates mediaCroppingCoordinates2;
        MediaCroppingCoordinatesIntf B5u = B5u();
        MediaCroppingCoordinates mediaCroppingCoordinates3 = null;
        if (B5u != null) {
            mediaCroppingCoordinates = B5u.EwF();
        } else {
            mediaCroppingCoordinates = null;
        }
        MediaCroppingCoordinatesIntf BzT = BzT();
        if (BzT != null) {
            mediaCroppingCoordinates2 = BzT.EwF();
        } else {
            mediaCroppingCoordinates2 = null;
        }
        MediaCroppingCoordinatesIntf C7w = C7w();
        if (C7w != null) {
            mediaCroppingCoordinates3 = C7w.EwF();
        }
        return new C88293wg(mediaCroppingCoordinates, mediaCroppingCoordinates2, mediaCroppingCoordinates3);
    }
}
