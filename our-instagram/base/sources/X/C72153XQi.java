package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.XQi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72153XQi extends AbstractC72053XLu implements YPY {
    public String A00;
    public C193208h0 A01;
    public C72685XlC A02;
    public final C8EC A03;

    public static final boolean A00(float[] fArr) {
        int length = fArr.length;
        int i = 1;
        if (length == 0) {
            return false;
        }
        float f = fArr[0];
        float f2 = f;
        int i2 = length - 1;
        if (1 <= i2) {
            while (true) {
                f = Math.max(f, fArr[i]);
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        Float valueOf = Float.valueOf(f);
        if (valueOf == null) {
            return false;
        }
        float floatValue = valueOf.floatValue();
        int i3 = 1;
        if (1 <= i2) {
            while (true) {
                f2 = Math.min(f2, fArr[i3]);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        Float valueOf2 = Float.valueOf(f2);
        if (valueOf2 == null) {
            return false;
        }
        float floatValue2 = valueOf2.floatValue();
        for (int i4 = 0; i4 < length; i4++) {
            float f3 = (fArr[i4] - floatValue2) / (floatValue - floatValue2);
            fArr[i4] = f3;
            float f4 = 0.0f;
            if (f3 > 0.5f) {
                f4 = 1.0f;
            }
            fArr[i4] = f4;
        }
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x00e8. Please report as an issue. */
    @Override // X.YPY
    public final AbstractC223599u2 E57(ACP acp, List list) {
        StringBuilder A1C;
        String str;
        Object xqz;
        if (CbZ()) {
            C193208h0 c193208h0 = this.A01;
            if (c193208h0 == null) {
                try {
                    c193208h0 = AbstractC193188gy.A00(this.A00);
                    this.A01 = c193208h0;
                } catch (Exception e) {
                    e = e;
                    A1C = AbstractC166987dD.A1C();
                    str = "Load model failed ";
                    A1C.append(str);
                    A1C.append(e);
                    A1C.toString();
                    return AbstractC72053XLu.A03();
                }
            }
            Bitmap A01 = AbstractC72053XLu.A01(list);
            int width = A01.getWidth();
            int height = A01.getHeight();
            Bitmap A00 = C0fK.A00(A01, 320, 320, true);
            C14360o3.A07(A00);
            try {
                int width2 = A00.getWidth();
                int height2 = A00.getHeight();
                int i = height2 * width2;
                int[] iArr = new int[i];
                A00.getPixels(iArr, 0, width2, 0, 0, width2, height2);
                int i2 = i * 2;
                FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width2 * 3 * height2);
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = iArr[i3];
                    float f = ((i4 >> 8) & 255) / 255.0f;
                    float f2 = (i4 & 255) / 255.0f;
                    float[] fArr = XkP.A00;
                    float f3 = (((i4 >> 16) & 255) / 255.0f) - fArr[0];
                    float[] fArr2 = XkP.A01;
                    AbstractC72053XLu.A06(allocateFloatBuffer, fArr2, f3, 0, i3);
                    AbstractC72053XLu.A06(allocateFloatBuffer, fArr2, f - fArr[1], 1, i + i3);
                    AbstractC72053XLu.A06(allocateFloatBuffer, fArr2, f2 - fArr[2], 2, i2 + i3);
                }
                float[] dataAsFloatArray = c193208h0.A00.forward(IValue.from(Tensor.fromBlob(allocateFloatBuffer, AbstractC72053XLu.A07(height2, width2), EnumC209389Nw.CONTIGUOUS))).toTuple()[0].toTensor().getDataAsFloatArray();
                Y3b y3b = Y3b.A00;
                C14360o3.A0A(dataAsFloatArray);
                float[] A012 = y3b.A01(dataAsFloatArray, 320, 320, width, height);
                if (!A00(A012)) {
                    return AbstractC72053XLu.A03();
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                for (String str2 : acp.A00) {
                    switch (str2.hashCode()) {
                        case -1630362878:
                            if (!str2.equals("CUTOUT_BITMAP")) {
                                return AbstractC72053XLu.A03();
                            }
                            A012 = AbstractC73281XzR.A00(C47975LIm.A00(C47975LIm.A00.A02(A012, width, height), width, height), width, height);
                            xqz = new XQZ(C73312Y3i.A00.A01(A01, null, A012), str2);
                            A1E.add(xqz);
                        case -716660709:
                            if (!str2.equals(MSV.A00(361))) {
                                return AbstractC72053XLu.A03();
                            }
                            xqz = AbstractC72053XLu.A02(str2, A1E, A012, 1.0f);
                            A1E.add(xqz);
                        case -222102746:
                            if (!str2.equals("MASK_ARRAY")) {
                                return AbstractC72053XLu.A03();
                            }
                            xqz = new C44812Jsj(str2, A012);
                            A1E.add(xqz);
                        case 1315553475:
                            if (!str2.equals("RAW_MASK")) {
                                return AbstractC72053XLu.A03();
                            }
                            A00(dataAsFloatArray);
                            xqz = new C44812Jsj(str2, dataAsFloatArray);
                            A1E.add(xqz);
                        case 1725137378:
                            if (!str2.equals("MASK_BITMAP")) {
                                return AbstractC72053XLu.A03();
                            }
                            int[] iArr2 = new int[width * height];
                            for (int i5 = 0; i5 < height; i5++) {
                                for (int i6 = 0; i6 < width; i6++) {
                                    int i7 = (i5 * width) + i6;
                                    int i8 = (int) (A012[i7] * 255.0f);
                                    iArr2[i7] = Color.rgb(i8, i8, i8);
                                }
                            }
                            Bitmap createBitmap = Bitmap.createBitmap(iArr2, width, height, Bitmap.Config.ARGB_8888);
                            C14360o3.A07(createBitmap);
                            xqz = new XQZ(createBitmap, str2);
                            A1E.add(xqz);
                        default:
                            return AbstractC72053XLu.A03();
                    }
                }
                return new C9VJ(A1E);
            } catch (Exception e2) {
                e = e2;
                A1C = AbstractC166987dD.A1C();
                str = "Prediction Error ";
                A1C.append(str);
                A1C.append(e);
                A1C.toString();
                return AbstractC72053XLu.A03();
            }
        }
        return AbstractC72053XLu.A03();
    }

    @Override // X.YPY
    public final boolean CbZ() {
        if (this.A00 != null && A08()) {
            return true;
        }
        return false;
    }

    @Override // X.YPY
    public final void Chb() {
        AbstractC72053XLu.A05(this.A03, this, 5);
    }

    public C72153XQi(C8EC c8ec) {
        this.A03 = c8ec;
    }

    @Override // X.YPY
    public final void Eag(C72685XlC c72685XlC) {
        this.A02 = c72685XlC;
    }
}
