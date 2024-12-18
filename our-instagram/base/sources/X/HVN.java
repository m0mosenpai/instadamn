package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ImmutablePandoTrackData;
import com.instagram.api.schemas.ImmutablePandoTrackMetadata;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

/* loaded from: classes7.dex */
public final class HVN extends C17T implements InterfaceC43521JKh {
    @Override // X.InterfaceC43521JKh
    public final TrackMetadata BTR() {
        return (TrackMetadata) A04(-450004177, ImmutablePandoTrackMetadata.class);
    }

    @Override // X.InterfaceC43521JKh
    public final TrackData CA8() {
        return (TrackData) A04(110621003, ImmutablePandoTrackData.class);
    }

    @Override // X.InterfaceC43521JKh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40427HwI.A00(this));
    }

    @Override // X.InterfaceC43521JKh
    public final C38806H6w F3S() {
        return new C38806H6w(CA8().F3P(), BTR().F3Q());
    }
}
