package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;

/* renamed from: X.5L8, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5L8 extends C0T6 implements InterfaceC104874ny {
    public final IGFormatLiquidityUseCaseEnum A00;

    @Override // X.InterfaceC104874ny
    public final C5L8 Eue() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C5L8) && this.A00 == ((C5L8) obj).A00);
    }

    public final int hashCode() {
        IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = this.A00;
        if (iGFormatLiquidityUseCaseEnum == null) {
            return 0;
        }
        return iGFormatLiquidityUseCaseEnum.hashCode();
    }

    @Override // X.InterfaceC104874ny
    public final IGFormatLiquidityUseCaseEnum B80() {
        return this.A00;
    }

    @Override // X.InterfaceC104874ny
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGFormatLiquidityAdsInfoDict", CDI.A00(this));
    }

    public C5L8(IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum) {
        this.A00 = iGFormatLiquidityUseCaseEnum;
    }
}
