package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGCTAStickerPositioningStrategyEnum;

/* renamed from: X.40B, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C40B extends C0T6 implements C40C {
    public final AnonymousClass409 A00;
    public final IGCTAStickerPositioningStrategyEnum A01;
    public final Boolean A02;
    public final Boolean A03;

    @Override // X.C40C
    public final C40B EuN() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40B) {
                C40B c40b = (C40B) obj;
                if (!C14360o3.A0K(this.A00, c40b.A00) || !C14360o3.A0K(this.A02, c40b.A02) || !C14360o3.A0K(this.A03, c40b.A03) || this.A01 != c40b.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass409 anonymousClass409 = this.A00;
        int hashCode = (anonymousClass409 == null ? 0 : anonymousClass409.hashCode()) * 31;
        Boolean bool = this.A02;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.A03;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum = this.A01;
        return hashCode3 + (iGCTAStickerPositioningStrategyEnum != null ? iGCTAStickerPositioningStrategyEnum.hashCode() : 0);
    }

    @Override // X.C40C
    public final AnonymousClass409 AvL() {
        return this.A00;
    }

    @Override // X.C40C
    public final Boolean BaT() {
        return this.A02;
    }

    @Override // X.C40C
    public final Boolean BaU() {
        return this.A03;
    }

    @Override // X.C40C
    public final IGCTAStickerPositioningStrategyEnum CBU() {
        return this.A01;
    }

    @Override // X.C40C
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsCTAStickerInfoDict", Ho5.A00(this));
    }

    public C40B(AnonymousClass409 anonymousClass409, IGCTAStickerPositioningStrategyEnum iGCTAStickerPositioningStrategyEnum, Boolean bool, Boolean bool2) {
        this.A00 = anonymousClass409;
        this.A02 = bool;
        this.A03 = bool2;
        this.A01 = iGCTAStickerPositioningStrategyEnum;
    }
}
