package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Gainmap;
import android.os.Build;
import java.util.HashMap;

/* renamed from: X.AGz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23110AGz {
    public static final C23110AGz A00 = new Object();
    public static final BitmapFactory.Options A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.AGz, java.lang.Object] */
    static {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 64;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        A01 = options;
    }

    public final boolean A01(String str) {
        if (Build.VERSION.SDK_INT >= 34 && str != null) {
            String A0h = AbstractC167007dF.A0h(str);
            if (AbstractC002300n.A0f(A0h, "jpg", false) || AbstractC002300n.A0f(A0h, "jpeg", false)) {
                return AKG.A00.A01(str);
            }
            return false;
        }
        return false;
    }

    public final HashMap A00(String str) {
        Bitmap decodeFile;
        Bitmap gainmapContents;
        HashMap A1G = AbstractC166987dD.A1G();
        if (Build.VERSION.SDK_INT >= 34 && str != null) {
            String A0h = AbstractC167007dF.A0h(str);
            if ((AbstractC002300n.A0f(A0h, "jpg", false) || AbstractC002300n.A0f(A0h, "jpeg", false)) && (decodeFile = BitmapFactory.decodeFile(str, A01)) != null) {
                decodeFile.getAllocationByteCount();
                boolean hasGainmap = decodeFile.hasGainmap();
                Gainmap gainmap = decodeFile.getGainmap();
                A1G.put("has_gainmap", String.valueOf(hasGainmap));
                if (gainmap != null) {
                    float[] gamma = gainmap.getGamma();
                    C14360o3.A07(gamma);
                    A1G.put("gamma", AbstractC009903n.A0F(gamma).toString());
                    A1G.put("display_ratio_full_hdr", String.valueOf(gainmap.getDisplayRatioForFullHdr()));
                    float[] epsilonHdr = gainmap.getEpsilonHdr();
                    C14360o3.A07(epsilonHdr);
                    A1G.put("epsilon_hdr", AbstractC009903n.A0F(epsilonHdr).toString());
                    float[] epsilonSdr = gainmap.getEpsilonSdr();
                    C14360o3.A07(epsilonSdr);
                    A1G.put("epsilon_sdr", AbstractC009903n.A0F(epsilonSdr).toString());
                    float[] ratioMax = gainmap.getRatioMax();
                    C14360o3.A07(ratioMax);
                    A1G.put("ratio_max", AbstractC009903n.A0F(ratioMax).toString());
                    float[] ratioMin = gainmap.getRatioMin();
                    C14360o3.A07(ratioMin);
                    A1G.put("ratio_min", AbstractC009903n.A0F(ratioMin).toString());
                    A1G.put("min_display_ratio_hdr_transition", String.valueOf(gainmap.getMinDisplayRatioForHdrTransition()));
                }
                Gainmap gainmap2 = decodeFile.getGainmap();
                if (gainmap2 != null && (gainmapContents = gainmap2.getGainmapContents()) != null) {
                    gainmapContents.recycle();
                }
                decodeFile.recycle();
            }
        }
        return A1G;
    }
}
