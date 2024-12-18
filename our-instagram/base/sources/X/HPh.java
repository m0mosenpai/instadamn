package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDict;
import com.instagram.api.schemas.IGAdCreationOptimizationPayloadDictImpl;
import com.instagram.api.schemas.ImmutablePandoIGAdCreationOptimizationPayloadDict;
import java.util.LinkedHashMap;

/* loaded from: classes7.dex */
public final class HPh extends C17T implements C5FX {
    @Override // X.C5FX
    public final IGAdCreationOptimizationPayloadDict AZ9() {
        return (IGAdCreationOptimizationPayloadDict) A05(-82262769, ImmutablePandoIGAdCreationOptimizationPayloadDict.class);
    }

    @Override // X.C5FX
    public final C38716H3d Euf() {
        IGAdCreationOptimizationPayloadDictImpl iGAdCreationOptimizationPayloadDictImpl;
        IGAdCreationOptimizationPayloadDict AZ9 = AZ9();
        if (AZ9 != null) {
            iGAdCreationOptimizationPayloadDictImpl = AZ9.EuE();
        } else {
            iGAdCreationOptimizationPayloadDictImpl = null;
        }
        return new C38716H3d(iGAdCreationOptimizationPayloadDictImpl);
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
        return AbstractC37304Gc5.A07(this, A0X);
    }
}
