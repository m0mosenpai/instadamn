package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGPBIAProfileBrowseTypeEnum;

/* renamed from: X.52c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1117552c extends C0T6 implements InterfaceC104894o0 {
    public final IGPBIAProfileBrowseTypeEnum A00;
    public final Boolean A01;

    @Override // X.InterfaceC104894o0
    public final C1117552c EvL() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1117552c) {
                C1117552c c1117552c = (C1117552c) obj;
                if (this.A00 != c1117552c.A00 || !C14360o3.A0K(this.A01, c1117552c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum = this.A00;
        int hashCode = (iGPBIAProfileBrowseTypeEnum == null ? 0 : iGPBIAProfileBrowseTypeEnum.hashCode()) * 31;
        Boolean bool = this.A01;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    @Override // X.InterfaceC104894o0
    public final IGPBIAProfileBrowseTypeEnum BG7() {
        return this.A00;
    }

    @Override // X.InterfaceC104894o0
    public final Boolean BvO() {
        return this.A01;
    }

    @Override // X.InterfaceC104894o0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGPBIAProfileBrowseInfoDict", AbstractC40013Hou.A00(this));
    }

    public C1117552c(IGPBIAProfileBrowseTypeEnum iGPBIAProfileBrowseTypeEnum, Boolean bool) {
        this.A00 = iGPBIAProfileBrowseTypeEnum;
        this.A01 = bool;
    }
}
