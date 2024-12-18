package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductArEffectMetadataIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3E {
    public static Map A00(ProductArEffectMetadataIntf productArEffectMetadataIntf) {
        String str;
        String str2;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (productArEffectMetadataIntf.Aqh() != null) {
            ContainerEffectEnum Aqh = productArEffectMetadataIntf.Aqh();
            if (Aqh != null) {
                str2 = Aqh.A00;
            } else {
                str2 = null;
            }
            A1I.put("container_effect_type", str2);
        }
        if (productArEffectMetadataIntf.B00() != null) {
            DynamicEffectState B00 = productArEffectMetadataIntf.B00();
            if (B00 != null) {
                str = B00.A00;
            } else {
                str = null;
            }
            A1I.put("dynamic_effect_state", str);
        }
        if (productArEffectMetadataIntf.getEffectId() != null) {
            A1I.put("effect_id", productArEffectMetadataIntf.getEffectId());
        }
        Map B0W = productArEffectMetadataIntf.B0W();
        if (B0W != null) {
            A1I.put("effect_parameters", B0W);
        }
        if (productArEffectMetadataIntf.B0X() != null) {
            A1I.put("effect_parameters_data", productArEffectMetadataIntf.B0X());
        }
        if (productArEffectMetadataIntf.B0g() != null) {
            EffectThumbnailImageDictIntf B0g = productArEffectMetadataIntf.B0g();
            if (B0g != null) {
                treeUpdaterJNI = B0g.F7o();
            }
            A1I.put("effect_thumbnail_image", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
