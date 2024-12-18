package X;

import android.graphics.Bitmap;
import android.graphics.PointF;
import com.facebook.common.dextricks.Constants;
import com.facebook.jni.CppException;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pytorch.executorch.EValue;
import org.pytorch.executorch.Tensor;

/* renamed from: X.XQj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C72154XQj extends AbstractC72053XLu implements YPE {
    public C72686XlD A00;
    public String A01;
    public A6P A02;
    public final C8EC A03;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:63:0x027e. Please report as an issue. */
    @Override // X.YPE
    public final AbstractC223599u2 E57(ACP acp, List list) {
        StringBuilder A1C;
        String str;
        Bitmap A00;
        float[] A0w;
        long[] jArr;
        int[] A0x;
        int i;
        long[] jArr2;
        int length;
        Bitmap A002;
        Object A02;
        if (this.A01 != null && A08()) {
            A6P a6p = this.A02;
            if (a6p == null) {
                try {
                    a6p = A6P.A00(this.A01, 0);
                    a6p.A00.loadMethod("forward");
                    this.A02 = a6p;
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
            if (width == 512 && height == 512) {
                Bitmap.Config config = A01.getConfig();
                C14360o3.A0A(config);
                A00 = A01.copy(config, true);
            } else {
                A00 = C0fK.A00(A01, 512, 512, true);
            }
            C14360o3.A0A(A00);
            Y3a y3a = Y3a.A00;
            C14360o3.A0B(A00, 0);
            FloatBuffer asFloatBuffer = AbstractC65702TsY.A0j(3145728).asFloatBuffer();
            C14360o3.A07(asFloatBuffer);
            int[] iArr = new int[Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED];
            A00.getPixels(iArr, 0, 512, 0, 0, 512, 512);
            int i2 = 0;
            do {
                int i3 = iArr[i2];
                asFloatBuffer.put(i2, ((i3 >> 16) & 255) / 255.0f);
                asFloatBuffer.put(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED + i2, ((i3 >> 8) & 255) / 255.0f);
                asFloatBuffer.put(Constants.LOAD_RESULT_WITH_VDEX_ODEX + i2, (i3 & 255) / 255.0f);
                i2++;
            } while (i2 < 262144);
            Tensor fromBlob = Tensor.fromBlob(asFloatBuffer, new long[]{1, 3, 512, 512});
            if (list.get(1) instanceof XQY) {
                C14360o3.A0B(((XQY) AbstractC72053XLu.A04("null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect", list, 1)).A00, 0);
                float f = width;
                float f2 = height;
                A0w = new float[]{(r5.left / f) * 512.0f, (r5.top / f2) * 512.0f, (r5.right / f) * 512.0f, (r5.bottom / f2) * 512.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f};
                jArr = new long[]{1, 1, 5, 2};
            } else {
                List list2 = ((XQX) AbstractC72053XLu.A04("null cannot be cast to non-null type com.aiplatform.inputs.AiInputPointFs", list, 1)).A00;
                C14360o3.A0B(list2, 0);
                List<PointF> A0h = AbstractC001800i.A0h(list2, 5);
                ArrayList A1E = AbstractC166987dD.A1E();
                int i4 = 0;
                for (PointF pointF : A0h) {
                    float f3 = (pointF.x / width) * 512.0f;
                    float f4 = (pointF.y / height) * 512.0f;
                    MSX.A1Q(A1E, f3);
                    MSX.A1Q(A1E, f4);
                    i4++;
                }
                while (i4 < 5) {
                    Float valueOf = Float.valueOf(-1.0f);
                    A1E.add(valueOf);
                    A1E.add(valueOf);
                    i4++;
                }
                A0w = AbstractC001800i.A0w(A1E);
                jArr = new long[]{1, 1, 5, 2};
            }
            Tensor fromBlob2 = Tensor.fromBlob(A0w, jArr);
            boolean z = list.get(1) instanceof XQY;
            Object obj = list.get(1);
            if (z) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect");
                A0x = new int[]{2, 3, -1, -1, -1};
                i = 3;
                jArr2 = new long[]{1, 1, 5};
            } else {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputPointFs");
                List list3 = ((XQX) obj).A00;
                C14360o3.A0B(list3, 0);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                int i5 = 0;
                do {
                    int i6 = -1;
                    if (i5 < list3.size()) {
                        i6 = 1;
                    }
                    AbstractC166997dE.A1W(A1E2, i6);
                    i5++;
                } while (i5 < 5);
                A0x = AbstractC001800i.A0x(A1E2);
                i = 3;
                jArr2 = new long[]{1, 1, 5};
            }
            Tensor.checkShape(jArr2);
            Tensor.checkShapeAndDataCapacityConsistency(A0x.length, jArr2);
            Tensor.checkShape(jArr2);
            int i7 = 1;
            int i8 = 0;
            do {
                i7 = (int) (i7 * jArr2[i8]);
                i8++;
            } while (i8 < i);
            IntBuffer asIntBuffer = AbstractC65702TsY.A0j(i7 * 4).asIntBuffer();
            asIntBuffer.put(A0x);
            try {
                EValue[] forward = a6p.A00.forward(EValue.from(fromBlob), EValue.from(fromBlob2), EValue.from(new C73576YLk(asIntBuffer, jArr2)));
                if (forward != null && forward.length != 0) {
                    C72686XlD c72686XlD = this.A00;
                    if (c72686XlD != null) {
                        c72686XlD.A00.A01.markerPoint(900939300, "segmentation_finished");
                    }
                    float[] dataAsFloatArray = forward[0].toTensor().getDataAsFloatArray();
                    float[] dataAsFloatArray2 = forward[1].toTensor().getDataAsFloatArray();
                    int length2 = dataAsFloatArray2.length;
                    int i9 = 0;
                    float f5 = 0.0f;
                    for (int i10 = 0; i10 < length2; i10++) {
                        float f6 = dataAsFloatArray2[i10];
                        if (f6 > f5) {
                            i9 = i10;
                            f5 = f6;
                        }
                    }
                    int i11 = i9 * Constants.LOAD_RESULT_PGO_ATTEMPTED;
                    int i12 = (i9 + 1) * Constants.LOAD_RESULT_PGO_ATTEMPTED;
                    if (i11 >= 0 && i11 < (length = dataAsFloatArray.length) && i12 >= 0 && i12 <= length) {
                        C0eD.A0c(i12, length);
                        float[] copyOfRange = Arrays.copyOfRange(dataAsFloatArray, i11, i12);
                        C14360o3.A07(copyOfRange);
                        float[] A012 = Y3b.A00.A01(copyOfRange, 256, 256, width, height);
                        int length3 = A012.length;
                        for (int i13 = 0; i13 < length3; i13++) {
                            if (A012[i13] > 0.0f) {
                                A012[i13] = 1.0f;
                            } else {
                                A012[i13] = 0.0f;
                            }
                        }
                        ArrayList A1E3 = AbstractC166987dD.A1E();
                        Iterator it = acp.A00.iterator();
                        while (it.hasNext()) {
                            String A1B = AbstractC166987dD.A1B(it);
                            switch (A1B.hashCode()) {
                                case -1630362878:
                                    if (A1B.equals("CUTOUT_BITMAP")) {
                                        A002 = C73312Y3i.A00.A02(A01, A012);
                                        A02 = new XQZ(A002, A1B);
                                        break;
                                    }
                                    A002 = Y3a.A00(A012, 256, 256);
                                    A02 = new XQZ(A002, A1B);
                                case -726741246:
                                    if (A1B.equals("MASK_AND_ORIGINAL_BITMAP")) {
                                        A002 = y3a.A01(A01, A012);
                                        A02 = new XQZ(A002, A1B);
                                        break;
                                    }
                                    A002 = Y3a.A00(A012, 256, 256);
                                    A02 = new XQZ(A002, A1B);
                                case -432379959:
                                    if (A1B.equals(AbstractC43591JPw.A00(28))) {
                                        A02 = AbstractC72053XLu.A02(A1B, A1E3, A012, 0.9f);
                                        break;
                                    }
                                    A002 = Y3a.A00(A012, 256, 256);
                                    A02 = new XQZ(A002, A1B);
                                    break;
                                case 1725137378:
                                    if (A1B.equals("MASK_BITMAP")) {
                                        A002 = Y3a.A00(A012, width, height);
                                        A02 = new XQZ(A002, A1B);
                                        break;
                                    }
                                    A002 = Y3a.A00(A012, 256, 256);
                                    A02 = new XQZ(A002, A1B);
                                default:
                                    A002 = Y3a.A00(A012, 256, 256);
                                    A02 = new XQZ(A002, A1B);
                                    break;
                            }
                            A1E3.add(A02);
                        }
                        return new C9VJ(A1E3);
                    }
                }
            } catch (CppException e2) {
                e = e2;
                A1C = AbstractC166987dD.A1C();
                str = "SAM prediction native error: ";
                A1C.append(str);
                A1C.append(e);
                A1C.toString();
                return AbstractC72053XLu.A03();
            } catch (Exception e3) {
                e = e3;
                A1C = AbstractC166987dD.A1C();
                str = "SAM prediction java error: ";
                A1C.append(str);
                A1C.append(e);
                A1C.toString();
                return AbstractC72053XLu.A03();
            }
        }
        return AbstractC72053XLu.A03();
    }

    @Override // X.YPE
    public final void Chb() {
        this.A03.AV9(new Y9A(this, 1), true);
    }

    public C72154XQj(C8EC c8ec) {
        this.A03 = c8ec;
    }

    @Override // X.YPE
    public final void Eah(C72686XlD c72686XlD) {
        this.A00 = c72686XlD;
    }
}
