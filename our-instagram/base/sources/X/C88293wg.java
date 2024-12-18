package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MediaCroppingCoordinates;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;

/* renamed from: X.3wg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88293wg extends C0T6 implements InterfaceC88303wh {
    public final MediaCroppingCoordinates A00;
    public final MediaCroppingCoordinates A01;
    public final MediaCroppingCoordinates A02;

    @Override // X.InterfaceC88303wh
    public final C88293wg EwG() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88293wg) {
                C88293wg c88293wg = (C88293wg) obj;
                if (!C14360o3.A0K(this.A00, c88293wg.A00) || !C14360o3.A0K(this.A01, c88293wg.A01) || !C14360o3.A0K(this.A02, c88293wg.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MediaCroppingCoordinates mediaCroppingCoordinates = this.A00;
        int hashCode = (mediaCroppingCoordinates == null ? 0 : mediaCroppingCoordinates.hashCode()) * 31;
        MediaCroppingCoordinates mediaCroppingCoordinates2 = this.A01;
        int hashCode2 = (hashCode + (mediaCroppingCoordinates2 == null ? 0 : mediaCroppingCoordinates2.hashCode())) * 31;
        MediaCroppingCoordinates mediaCroppingCoordinates3 = this.A02;
        return hashCode2 + (mediaCroppingCoordinates3 != null ? mediaCroppingCoordinates3.hashCode() : 0);
    }

    @Override // X.InterfaceC88303wh
    public final /* bridge */ /* synthetic */ MediaCroppingCoordinatesIntf B5u() {
        return this.A00;
    }

    @Override // X.InterfaceC88303wh
    public final /* bridge */ /* synthetic */ MediaCroppingCoordinatesIntf BzT() {
        return this.A01;
    }

    @Override // X.InterfaceC88303wh
    public final /* bridge */ /* synthetic */ MediaCroppingCoordinatesIntf C7w() {
        return this.A02;
    }

    @Override // X.InterfaceC88303wh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaCroppingInfo", AbstractC37359Gd1.A00(this));
    }

    public C88293wg(MediaCroppingCoordinates mediaCroppingCoordinates, MediaCroppingCoordinates mediaCroppingCoordinates2, MediaCroppingCoordinates mediaCroppingCoordinates3) {
        this.A00 = mediaCroppingCoordinates;
        this.A01 = mediaCroppingCoordinates2;
        this.A02 = mediaCroppingCoordinates3;
    }
}
