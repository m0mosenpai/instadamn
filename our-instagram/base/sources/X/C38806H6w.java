package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackMetadata;

/* renamed from: X.H6w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38806H6w extends C0T6 implements InterfaceC43521JKh {
    public final TrackData A00;
    public final TrackMetadata A01;

    @Override // X.InterfaceC43521JKh
    public final C38806H6w F3S() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38806H6w) {
                C38806H6w c38806H6w = (C38806H6w) obj;
                if (!C14360o3.A0K(this.A01, c38806H6w.A01) || !C14360o3.A0K(this.A00, c38806H6w.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43521JKh
    public final TrackMetadata BTR() {
        return this.A01;
    }

    @Override // X.InterfaceC43521JKh
    public final TrackData CA8() {
        return this.A00;
    }

    @Override // X.InterfaceC43521JKh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTrackSchema", AbstractC40427HwI.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public C38806H6w(TrackData trackData, TrackMetadata trackMetadata) {
        AbstractC167017dG.A1P(trackMetadata, trackData);
        this.A01 = trackMetadata;
        this.A00 = trackData;
    }
}
