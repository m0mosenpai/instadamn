package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public abstract /* synthetic */ class I0A {
    public static Map A00(JLD jld) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        C38321qM BG1 = jld.BG1();
        TreeUpdaterJNI treeUpdaterJNI = null;
        if (BG1 != null) {
            A1I.put("ig_media_content", BG1.A1D());
        }
        if (jld.Bh5() != null) {
            JM4 Bh5 = jld.Bh5();
            if (Bh5 != null) {
                treeUpdaterJNI = Bh5.F7o();
            }
            A1I.put("product_image_content", treeUpdaterJNI);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
