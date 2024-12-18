package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsRrFormatEnum;

/* renamed from: X.4p0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C105364p0 extends C0T6 implements InterfaceC105374p1 {
    public final UQx A00;
    public final IGAdsRrFormatEnum A01;
    public final C66644URi A02;

    @Override // X.InterfaceC105374p1
    public final C105364p0 F5i() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C105364p0) {
                C105364p0 c105364p0 = (C105364p0) obj;
                if (!C14360o3.A0K(this.A00, c105364p0.A00) || !C14360o3.A0K(this.A02, c105364p0.A02) || this.A01 != c105364p0.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UQx uQx = this.A00;
        int hashCode = (uQx == null ? 0 : uQx.hashCode()) * 31;
        C66644URi c66644URi = this.A02;
        int hashCode2 = (hashCode + (c66644URi == null ? 0 : c66644URi.hashCode())) * 31;
        IGAdsRrFormatEnum iGAdsRrFormatEnum = this.A01;
        return hashCode2 + (iGAdsRrFormatEnum != null ? iGAdsRrFormatEnum.hashCode() : 0);
    }

    @Override // X.InterfaceC105374p1
    public final /* bridge */ /* synthetic */ InterfaceC72034XFw Arq() {
        return this.A00;
    }

    @Override // X.InterfaceC105374p1
    public final /* bridge */ /* synthetic */ XG1 BhZ() {
        return this.A02;
    }

    @Override // X.InterfaceC105374p1
    public final IGAdsRrFormatEnum Bpl() {
        return this.A01;
    }

    @Override // X.InterfaceC105374p1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRatingsAndReviewsInfoDict", AbstractC68547VVa.A00(this));
    }

    public C105364p0(UQx uQx, IGAdsRrFormatEnum iGAdsRrFormatEnum, C66644URi c66644URi) {
        this.A00 = uQx;
        this.A02 = c66644URi;
        this.A01 = iGAdsRrFormatEnum;
    }
}
