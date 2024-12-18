package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I3A {
    public static Map A00(JM0 jm0) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jm0.Aln() != null) {
            C5FJ Aln = jm0.Aln();
            if (Aln != null) {
                treeUpdaterJNI = Aln.F7o();
            } else {
                treeUpdaterJNI = null;
            }
            A1I.put("caption_info", treeUpdaterJNI);
        }
        if (jm0.BDS() != null) {
            A1I.put(IgReactMediaPickerNativeModule.HEIGHT, jm0.BDS());
        }
        if (jm0.Bzt() != null) {
            A1I.put("start_x_position", jm0.Bzt());
        }
        if (jm0.Bzv() != null) {
            A1I.put("start_y_position", jm0.Bzv());
        }
        if (jm0.CHg() != null) {
            A1I.put(IgReactMediaPickerNativeModule.WIDTH, jm0.CHg());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
