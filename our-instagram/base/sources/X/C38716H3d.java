package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import java.util.LinkedHashMap;

/* renamed from: X.H3d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38716H3d extends C0T6 implements C5FX {
    public final IGAdCreationOptimizationPayloadDict A00;

    @Override // X.C5FX
    public final C38716H3d Euf() {
        return this;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C38716H3d) && C14360o3.A0K(this.A00, ((C38716H3d) obj).A00));
    }

    @Override // X.C5FX
    public final IGAdCreationOptimizationPayloadDict AZ9() {
        return this.A00;
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C38716H3d(IGAdCreationOptimizationPayloadDict iGAdCreationOptimizationPayloadDict) {
        this.A00 = iGAdCreationOptimizationPayloadDict;
    }

    @Override // X.C5FX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A0X = AbstractC37300Gc1.A0X();
        if (AZ9() != null) {
            IGAdCreationOptimizationPayloadDict AZ9 = AZ9();
            if (AZ9 != null) {
                treeUpdaterJNI = AZ9.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A0X.put("adCreativeOptimizationPayload", treeUpdaterJNI);
        }
        return AbstractC37300Gc1.A05("XDTIGIABAutofillAdsPersonalizationPostClickDataExtensionDict", AbstractC06930Yk.A0B(A0X));
    }
}
