package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsFeedVideoWBViewerTypeEnum;

/* renamed from: X.4f8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C100444f8 extends C0T6 implements InterfaceC88193wT {
    public final IGAdsFeedVideoWBViewerTypeEnum A00;
    public final Boolean A01;
    public final Float A02;

    @Override // X.InterfaceC88193wT
    public final C100444f8 EuO() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C100444f8) {
                C100444f8 c100444f8 = (C100444f8) obj;
                if (!C14360o3.A0K(this.A02, c100444f8.A02) || this.A00 != c100444f8.A00 || !C14360o3.A0K(this.A01, c100444f8.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Float f = this.A02;
        int hashCode = (f == null ? 0 : f.hashCode()) * 31;
        IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum = this.A00;
        int hashCode2 = (hashCode + (iGAdsFeedVideoWBViewerTypeEnum == null ? 0 : iGAdsFeedVideoWBViewerTypeEnum.hashCode())) * 31;
        Boolean bool = this.A01;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC88193wT
    public final Float BFL() {
        return this.A02;
    }

    @Override // X.InterfaceC88193wT
    public final IGAdsFeedVideoWBViewerTypeEnum BFM() {
        return this.A00;
    }

    @Override // X.InterfaceC88193wT
    public final Boolean CeE() {
        return this.A01;
    }

    @Override // X.InterfaceC88193wT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsFeedVideoWBInfoDict", CDG.A00(this));
    }

    public C100444f8(IGAdsFeedVideoWBViewerTypeEnum iGAdsFeedVideoWBViewerTypeEnum, Boolean bool, Float f) {
        this.A02 = f;
        this.A00 = iGAdsFeedVideoWBViewerTypeEnum;
        this.A01 = bool;
    }
}
