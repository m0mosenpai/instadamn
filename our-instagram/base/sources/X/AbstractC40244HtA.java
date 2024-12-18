package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HtA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40244HtA {
    public static Map A00(JLX jlx) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        jlx.getHeight();
        A1I.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(jlx.getHeight()));
        if (jlx.CBn() != null) {
            AbstractC37300Gc1.A16(jlx.CBn(), A1I);
        }
        if (jlx.getUrl() != null) {
            AbstractC37300Gc1.A13(jlx.getUrl(), A1I);
        }
        jlx.getWidth();
        return AbstractC37301Gc2.A0r(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(jlx.getWidth()), A1I);
    }
}
