package X;

import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: X.VwK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69834VwK {
    public static void A01(WDI wdi, float[] fArr, float[] fArr2) {
        int i;
        int i2;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        AbstractC05810Sj.A00(wdi.A0E);
        RectF rectF = wdi.A0E;
        Matrix.translateM(fArr, 0, rectF.left, rectF.top, 0.0f);
        Matrix.scaleM(fArr, 0, wdi.A0E.width(), wdi.A0E.height(), 1.0f);
        if (wdi.A0O) {
            if (wdi.A07 % 180 != 0) {
                i = wdi.A06;
                i2 = wdi.A08;
            } else {
                i = wdi.A08;
                i2 = wdi.A06;
            }
            RectF rectF2 = wdi.A0E;
            float width = (i * rectF2.width()) / (i2 * rectF2.height());
            if (wdi.A0B % 180 != 0) {
                width = 1.0f / width;
            }
            Matrix.scaleM(fArr2, 0, 1.0f, (wdi.A0C / width) / wdi.A0A, 1.0f);
        }
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        if (wdi.A0H == C05F.A01) {
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Matrix.rotateM(fArr, 0, wdi.A0B, 0.0f, 0.0f, -1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static C180337zN A00() {
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        hashMap.put("aPosition", new C180327zM(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}));
        arrayList.add("aPosition");
        return AbstractC65703TsZ.A0B(hashMap, arrayList, new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
    }
}
