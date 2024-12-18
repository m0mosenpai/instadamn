package X;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* loaded from: classes4.dex */
public final class AKH {
    public static final AKH A00 = new Object();
    public static final List A01 = AbstractC16960so.A1Q("ROT", "blurry", "motion_blur", "DOF", "col_harmony", "col_vivid", "light", "rating");
    public static final List A02 = AbstractC16960so.A1Q("dog", "pet", "cat");
    public static final List A04 = AbstractC16960so.A1Q("child", "face", "smiling", "people");
    public static final List A03 = AbstractC166987dD.A1J("foodstuff");
    public static final List A05 = AbstractC16960so.A1Q("violence", "nudity");
    public static final float[] A06 = {0.485f, 0.456f, 0.406f};
    public static final float[] A07 = {0.229f, 0.224f, 0.225f};

    public static final Tensor A00(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = height * width;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i2 = i * 2;
        FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width * 3 * height);
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = iArr[i3];
            float[] fArr = A06;
            float f = (((i4 >> 16) & 255) / 255.0f) - fArr[0];
            float[] fArr2 = A07;
            allocateFloatBuffer.put(i3, f / fArr2[0]);
            allocateFloatBuffer.put(i + i3, ((((i4 >> 8) & 255) / 255.0f) - fArr[1]) / fArr2[1]);
            allocateFloatBuffer.put(i2 + i3, (((i4 & 255) / 255.0f) - fArr[2]) / fArr2[2]);
        }
        return Tensor.fromBlob(allocateFloatBuffer, new long[]{1, 3, height, width}, EnumC209389Nw.CONTIGUOUS);
    }

    public final ArrayList A01(C8KU c8ku, List list, IValue[] iValueArr) {
        List A002;
        C14360o3.A0B(iValueArr, 1);
        ArrayList A12 = AbstractC166997dE.A12(c8ku, 2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C8KX c8kx = (C8KX) it.next();
            if (c8kx == C8KX.A04 && iValueArr.length > 3) {
                A12.add(new AKS(c8kx, null, null, iValueArr[3].toTensor().getDataAsFloatArray()));
            } else {
                int ordinal = c8kx.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            A002 = A05;
                        }
                    } else {
                        A002 = A01;
                    }
                } else {
                    A002 = c8ku.A00();
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                char c = 2;
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        c = 1;
                    }
                } else {
                    c = 0;
                }
                float[] dataAsFloatArray = iValueArr[c].toTensor().getDataAsFloatArray();
                if (A002.size() == dataAsFloatArray.length) {
                    int size = A002.size();
                    for (int i = 0; i < size; i++) {
                        if (c8kx != C8KX.A03 || dataAsFloatArray[i] >= 0.9f) {
                            A1E.add(new AKS(c8kx, Float.valueOf(dataAsFloatArray[i]), (String) A002.get(i), null));
                        }
                    }
                }
                A12.addAll(A1E);
            }
        }
        return A12;
    }
}
