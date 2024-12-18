package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.MoreInfoFacepilePositionType;
import com.instagram.api.schemas.MoreInfoFacepileSizeType;

/* renamed from: X.4sB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107084sB extends C0T6 implements InterfaceC107094sC {
    public final MoreInfoFacepilePositionType A00;
    public final MoreInfoFacepileSizeType A01;

    @Override // X.InterfaceC107094sC
    public final C107084sB Ews() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C107084sB) {
                C107084sB c107084sB = (C107084sB) obj;
                if (this.A00 != c107084sB.A00 || this.A01 != c107084sB.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        MoreInfoFacepilePositionType moreInfoFacepilePositionType = this.A00;
        int hashCode = (moreInfoFacepilePositionType == null ? 0 : moreInfoFacepilePositionType.hashCode()) * 31;
        MoreInfoFacepileSizeType moreInfoFacepileSizeType = this.A01;
        return hashCode + (moreInfoFacepileSizeType != null ? moreInfoFacepileSizeType.hashCode() : 0);
    }

    @Override // X.InterfaceC107094sC
    public final MoreInfoFacepilePositionType Beb() {
        return this.A00;
    }

    @Override // X.InterfaceC107094sC
    public final MoreInfoFacepileSizeType BxZ() {
        return this.A01;
    }

    @Override // X.InterfaceC107094sC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfoFacepileMetadata", CDM.A00(this));
    }

    public C107084sB(MoreInfoFacepilePositionType moreInfoFacepilePositionType, MoreInfoFacepileSizeType moreInfoFacepileSizeType) {
        this.A00 = moreInfoFacepilePositionType;
        this.A01 = moreInfoFacepileSizeType;
    }
}
