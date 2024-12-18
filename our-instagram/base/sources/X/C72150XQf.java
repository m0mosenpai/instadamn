package X;

import android.graphics.Bitmap;
import android.graphics.Color;
import com.facebook.jni.CppException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.executorch.EValue;
import org.pytorch.executorch.Tensor;

/* renamed from: X.XQf, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72150XQf extends AbstractC72053XLu implements YPY {
    public String A00;
    public A6P A01;
    public C72685XlC A02;
    public final C8EC A03;

    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00f4. Please report as an issue. */
    @Override // X.YPY
    public final AbstractC223599u2 E57(ACP acp, List list) {
        StringBuilder A1C;
        String str;
        Object xqz;
        if (CbZ()) {
            A6P a6p = this.A01;
            if (a6p == null) {
                try {
                    a6p = A6P.A00(this.A00, 0);
                    a6p.A00.loadMethod("forward");
                    this.A01 = a6p;
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
                FloatBuffer asFloatBuffer = AbstractC65702TsY.A0j(width2 * 3 * height2 * 4).asFloatBuffer();
                for (int i3 = 0; i3 < i; i3++) {
                    int i4 = iArr[i3];
                    float f = ((i4 >> 8) & 255) / 255.0f;
                    float f2 = (i4 & 255) / 255.0f;
                    float[] fArr = AbstractC73280XzQ.A00;
                    float f3 = (((i4 >> 16) & 255) / 255.0f) - fArr[0];
                    float[] fArr2 = AbstractC73280XzQ.A01;
                    AbstractC72053XLu.A06(asFloatBuffer, fArr2, f3, 0, i3);
                    AbstractC72053XLu.A06(asFloatBuffer, fArr2, f - fArr[1], 1, i + i3);
                    AbstractC72053XLu.A06(asFloatBuffer, fArr2, f2 - fArr[2], 2, i2 + i3);
                }
                EValue[] forward = a6p.A00.forward(EValue.from(Tensor.fromBlob(asFloatBuffer, AbstractC72053XLu.A07(height2, width2))));
                if (forward != null && forward.length != 0) {
                    float[] dataAsFloatArray = forward[0].toTensor().getDataAsFloatArray();
                    Y3b y3b = Y3b.A00;
                    C14360o3.A0A(dataAsFloatArray);
                    float[] A012 = y3b.A01(dataAsFloatArray, 320, 320, width, height);
                    if (!AbstractC73280XzQ.A00(A012)) {
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
                                AbstractC73280XzQ.A00(dataAsFloatArray);
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
                }
                return AbstractC72053XLu.A03();
            } catch (CppException e2) {
                e = e2;
                A1C = AbstractC166987dD.A1C();
                str = "ETU2Net prediction native error: ";
                A1C.append(str);
                A1C.append(e);
                A1C.toString();
                return AbstractC72053XLu.A03();
            } catch (Exception e3) {
                e = e3;
                A1C = AbstractC166987dD.A1C();
                str = "ETU2Net prediction java error: ";
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
        AbstractC72053XLu.A05(this.A03, this, 0);
    }

    public C72150XQf(C8EC c8ec) {
        this.A03 = c8ec;
    }

    @Override // X.YPY
    public final void Eag(C72685XlC c72685XlC) {
        this.A02 = c72685XlC;
    }
}
