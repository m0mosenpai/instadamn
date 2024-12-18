package X;

import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.KrS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract /* synthetic */ class AbstractC47071KrS {
    public static Map A00(IgShowreelNativeAsset igShowreelNativeAsset) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (igShowreelNativeAsset.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, igShowreelNativeAsset.BDS());
        }
        if (igShowreelNativeAsset.getUrl() != null) {
            A1I.put("url", igShowreelNativeAsset.getUrl());
        }
        if (igShowreelNativeAsset.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, igShowreelNativeAsset.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
