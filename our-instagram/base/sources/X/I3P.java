package X;

import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3P {
    public static Map A00(ClipsShoppingCTABarIntf clipsShoppingCTABarIntf) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (clipsShoppingCTABarIntf.Abx() != null) {
            A1I.put("animation_time_sec", AbstractC166997dE.A0f(clipsShoppingCTABarIntf.Abx()));
        }
        if (clipsShoppingCTABarIntf.getCtaBarType() != null) {
            A1I.put("cta_bar_type", clipsShoppingCTABarIntf.getCtaBarType());
        }
        if (clipsShoppingCTABarIntf.getDestination() != null) {
            A1I.put("destination", clipsShoppingCTABarIntf.getDestination());
        }
        if (clipsShoppingCTABarIntf.getDominantColor() != null) {
            A1I.put("dominant_color", clipsShoppingCTABarIntf.getDominantColor());
        }
        if (clipsShoppingCTABarIntf.Azv() != null) {
            A1I.put("dwell_time_sec", clipsShoppingCTABarIntf.Azv());
        }
        if (clipsShoppingCTABarIntf.BhF() != null) {
            A1I.put("product_names", clipsShoppingCTABarIntf.BhF());
        }
        if (clipsShoppingCTABarIntf.getSubtitle() != null) {
            A1I.put("subtitle", clipsShoppingCTABarIntf.getSubtitle());
        }
        if (clipsShoppingCTABarIntf.getTitle() != null) {
            AbstractC37300Gc1.A17(clipsShoppingCTABarIntf.getTitle(), A1I);
        }
        if (clipsShoppingCTABarIntf.getToggledDestination() != null) {
            A1I.put("toggled_destination", clipsShoppingCTABarIntf.getToggledDestination());
        }
        if (clipsShoppingCTABarIntf.getToggledTitle() != null) {
            A1I.put("toggled_title", clipsShoppingCTABarIntf.getToggledTitle());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
