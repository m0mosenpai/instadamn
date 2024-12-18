package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hsm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40223Hsm {
    public static Map A00(C47F c47f) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        c47f.getHeight();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(c47f.getHeight()));
        if (c47f.getUrl() != null) {
            AbstractC37300Gc1.A13(c47f.getUrl(), A1I);
        }
        c47f.getWidth();
        return AbstractC37301Gc2.A0r(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(c47f.getWidth()), A1I);
    }
}
