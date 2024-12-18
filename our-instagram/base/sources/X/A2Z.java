package X;

import android.text.Layout;

/* loaded from: classes4.dex */
public abstract class A2Z {
    public static final float[][] A00(Layout layout) {
        C14360o3.A0B(layout, 0);
        int lineCount = layout.getLineCount();
        float[][] fArr = new float[lineCount];
        for (int i = 0; i < lineCount; i++) {
            float[] fArr2 = new float[2];
            fArr2[0] = layout.getLineLeft(i);
            fArr2[1] = layout.getLineBaseline(i);
            fArr[i] = fArr2;
        }
        return fArr;
    }
}
