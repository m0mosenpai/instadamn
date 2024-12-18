package X;

import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.os.Build;

/* renamed from: X.8og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197698og {
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.0oO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0, types: [X.0ps, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0ps, java.lang.Object] */
    public static final C197728oj A00(Gainmap gainmap, int i, int i2, int i3) {
        float[] fArr = new float[3];
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        obj3.A00 = fArr;
        ?? obj4 = new Object();
        obj4.A00 = fArr;
        ?? obj5 = new Object();
        obj5.A00 = fArr;
        ?? obj6 = new Object();
        ?? obj7 = new Object();
        obj7.A00 = fArr;
        ?? obj8 = new Object();
        obj8.A00 = fArr;
        if (Build.VERSION.SDK_INT >= 34) {
            boolean z = false;
            if (gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8) {
                z = true;
            }
            obj.A00 = z;
            obj2.A00 = gainmap.getDisplayRatioForFullHdr();
            obj3.A00 = gainmap.getEpsilonHdr();
            obj4.A00 = gainmap.getEpsilonSdr();
            obj5.A00 = gainmap.getGamma();
            obj6.A00 = gainmap.getMinDisplayRatioForHdrTransition();
            obj7.A00 = gainmap.getRatioMin();
            obj8.A00 = gainmap.getRatioMax();
        }
        return new C197728oj(obj, obj2, obj6, obj3, obj4, obj5, obj8, obj7, i, i2, i3);
    }

    public static final C197708oh A01(C197728oj c197728oj, int i, int i2, int i3) {
        return new C197708oh(c197728oj, i, 3553, i2, i3);
    }
}
