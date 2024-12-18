package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AdMetadataType;

/* renamed from: X.3wW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88213wW extends C0T6 implements InterfaceC88223wX {
    public final AdMetadataType A00;
    public final String A01;

    public C88213wW(AdMetadataType adMetadataType, String str) {
        C14360o3.A0B(adMetadataType, 1);
        C14360o3.A0B(str, 2);
        this.A00 = adMetadataType;
        this.A01 = str;
    }

    @Override // X.InterfaceC88223wX
    public final C88213wW Eqc() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C88213wW) {
                C88213wW c88213wW = (C88213wW) obj;
                if (this.A00 != c88213wW.A00 || !C14360o3.A0K(this.A01, c88213wW.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC88223wX
    public final AdMetadataType CBQ() {
        return this.A00;
    }

    @Override // X.InterfaceC88223wX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAdMetadata", BFX.A00(this));
    }

    @Override // X.InterfaceC88223wX
    public final String getValue() {
        return this.A01;
    }
}
