package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ho3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39971Ho3 {
    public static Map A00(IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (iGAdScreenshotURLDataDict.getDominantColor() != null) {
            A1I.put("dominant_color", iGAdScreenshotURLDataDict.getDominantColor());
        }
        if (iGAdScreenshotURLDataDict.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, iGAdScreenshotURLDataDict.BDS());
        }
        if (iGAdScreenshotURLDataDict.BQS() != null) {
            IGProjectPortalInfoDict BQS = iGAdScreenshotURLDataDict.BQS();
            if (BQS != null) {
                treeUpdaterJNI = BQS.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("media_background", treeUpdaterJNI);
        }
        if (iGAdScreenshotURLDataDict.getUrl() != null) {
            AbstractC37300Gc1.A13(iGAdScreenshotURLDataDict.getUrl(), A1I);
        }
        if (iGAdScreenshotURLDataDict.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, iGAdScreenshotURLDataDict.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
