package com.aiplatform.processors.segmentanything;

import X.ACP;
import X.AbstractC001800i;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC193188gy;
import X.AbstractC223599u2;
import X.AbstractC43591JPw;
import X.AbstractC72053XLu;
import X.C0eD;
import X.C14360o3;
import X.C193208h0;
import X.C44812Jsj;
import X.C72686XlD;
import X.C73312Y3i;
import X.C8EC;
import X.C9VJ;
import X.EnumC209389Nw;
import X.MSX;
import X.XQW;
import X.XQY;
import X.XQZ;
import X.Y4d;
import X.YPE;
import android.graphics.Bitmap;
import android.graphics.PointF;
import com.facebook.jni.CppException;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* loaded from: classes12.dex */
public final class SegmentAnythingOnDeviceProcessorV2 extends AbstractC72053XLu implements YPE {
    public C72686XlD A00;
    public String A01;
    public C193208h0 A02;
    public final C8EC A03;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x02ce. Please report as an issue. */
    @Override // X.YPE
    public final AbstractC223599u2 E57(ACP acp, List list) {
        int size;
        int i;
        float[] A0w;
        long[] jArr;
        int i2;
        float[] A0w2;
        long[] jArr2;
        StringBuilder A1C;
        String str;
        int length;
        Bitmap A01;
        Object A02;
        if (this.A01 != null && A08()) {
            C193208h0 c193208h0 = this.A02;
            if (c193208h0 == null) {
                try {
                    c193208h0 = AbstractC193188gy.A00(this.A01);
                    this.A02 = c193208h0;
                } catch (Exception e) {
                    StringBuilder A1C2 = AbstractC166987dD.A1C();
                    A1C2.append("Load model failed ");
                    A1C2.append(e);
                    A1C2.toString();
                    return AbstractC72053XLu.A03();
                }
            }
            Bitmap A012 = AbstractC72053XLu.A01(list);
            int width = A012.getWidth();
            int height = A012.getHeight();
            if (list.get(1) instanceof XQY) {
                size = 1;
            } else {
                size = ((XQW) AbstractC72053XLu.A04("null cannot be cast to non-null type com.aiplatform.inputs.AiInputListPointFs", list, 1)).A00.size();
            }
            Y4d y4d = Y4d.A00;
            FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width * 3 * height);
            C14360o3.A07(allocateFloatBuffer);
            int i3 = height * width;
            int[] iArr = new int[i3];
            A012.getPixels(iArr, 0, width, 0, 0, width, height);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = iArr[i4];
                allocateFloatBuffer.put(i4, ((i5 >> 16) & 255) / 255.0f);
                allocateFloatBuffer.put(i3 + i4, ((i5 >> 8) & 255) / 255.0f);
                allocateFloatBuffer.put((i3 * 2) + i4, (i5 & 255) / 255.0f);
            }
            EnumC209389Nw enumC209389Nw = EnumC209389Nw.CONTIGUOUS;
            Tensor fromBlob = Tensor.fromBlob(allocateFloatBuffer, new long[]{1, 3, height, width}, enumC209389Nw);
            boolean z = list.get(1) instanceof XQY;
            Object obj = list.get(1);
            if (z) {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect");
                C14360o3.A0B(((XQY) obj).A00, 0);
                A0w = new float[]{r1.left, r1.top, r1.right, r1.bottom};
                jArr = new long[]{1, 1, 2, 2};
            } else {
                C14360o3.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputListPointFs");
                List list2 = ((XQW) obj).A00;
                C14360o3.A0B(list2, 0);
                int size2 = list2.size();
                ArrayList A0q = AbstractC167017dG.A0q(list2);
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    AbstractC166997dE.A1W(A0q, ((List) it.next()).size());
                }
                Number number = (Number) AbstractC001800i.A04(A0q);
                if (number != null) {
                    i = number.intValue();
                } else {
                    i = 0;
                }
                ArrayList A1E = AbstractC166987dD.A1E();
                int size3 = list2.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    for (PointF pointF : (List) list2.get(i6)) {
                        MSX.A1Q(A1E, pointF.x);
                        MSX.A1Q(A1E, pointF.y);
                    }
                    for (int size4 = ((List) list2.get(i6)).size(); size4 < i; size4++) {
                        Float valueOf = Float.valueOf(-1.0f);
                        A1E.add(valueOf);
                        A1E.add(valueOf);
                    }
                }
                A0w = AbstractC001800i.A0w(A1E);
                jArr = new long[]{1, size2, i, 2};
            }
            Tensor fromBlob2 = Tensor.fromBlob(A0w, jArr, enumC209389Nw);
            if (list.get(1) instanceof XQY) {
                C14360o3.A0C(list.get(1), "null cannot be cast to non-null type com.aiplatform.inputs.AiInputRect");
                A0w2 = new float[]{2.0f, 3.0f};
                jArr2 = new long[]{1, 1, 2};
            } else {
                List list3 = ((XQW) AbstractC72053XLu.A04("null cannot be cast to non-null type com.aiplatform.inputs.AiInputListPointFs", list, 1)).A00;
                C14360o3.A0B(list3, 0);
                int size5 = list3.size();
                ArrayList A0q2 = AbstractC167017dG.A0q(list3);
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    AbstractC166997dE.A1W(A0q2, ((List) it2.next()).size());
                }
                Number number2 = (Number) AbstractC001800i.A04(A0q2);
                if (number2 != null) {
                    i2 = number2.intValue();
                } else {
                    i2 = 0;
                }
                ArrayList A1E2 = AbstractC166987dD.A1E();
                int i7 = size5 * i2;
                for (int i8 = 0; i8 < i7; i8++) {
                    MSX.A1Q(A1E2, 1.0f);
                }
                A0w2 = AbstractC001800i.A0w(A1E2);
                jArr2 = new long[]{1, size5, i2};
            }
            try {
                IValue[] tuple = c193208h0.A00.forward(IValue.from(fromBlob), IValue.from(fromBlob2), IValue.from(Tensor.fromBlob(A0w2, jArr2, enumC209389Nw)), IValue.from(true)).toTuple();
                C72686XlD c72686XlD = this.A00;
                if (c72686XlD != null) {
                    c72686XlD.A00.A01.markerPoint(900939300, "segmentation_finished");
                }
                Tensor tensor = tuple[0].toTensor();
                float[] dataAsFloatArray = tuple[1].toTensor().getDataAsFloatArray();
                int length2 = dataAsFloatArray.length;
                int i9 = 0;
                float f = 0.0f;
                for (int i10 = 0; i10 < length2; i10++) {
                    float f2 = dataAsFloatArray[i10];
                    if (f2 > f) {
                        i9 = i10;
                        f = f2;
                    }
                }
                int i11 = i9 / (length2 / size);
                float[] dataAsFloatArray2 = tensor.getDataAsFloatArray();
                int i12 = i3 * i9;
                int i13 = i3 * (i9 + 1);
                if (i12 >= 0 && i12 < (length = dataAsFloatArray2.length) && i13 >= 0 && i13 <= length) {
                    C0eD.A0c(i13, length);
                    float[] copyOfRange = Arrays.copyOfRange(dataAsFloatArray2, i12, i13);
                    C14360o3.A07(copyOfRange);
                    int length3 = copyOfRange.length;
                    for (int i14 = 0; i14 < length3; i14++) {
                        float exp = (float) (1.0d / (((float) Math.exp(-copyOfRange[i14])) + 1.0d));
                        copyOfRange[i14] = exp;
                        if (exp > 0.5f) {
                            copyOfRange[i14] = 1.0f;
                        } else {
                            copyOfRange[i14] = 0.0f;
                        }
                    }
                    ArrayList A1E3 = AbstractC166987dD.A1E();
                    for (String str2 : acp.A00) {
                        switch (str2.hashCode()) {
                            case -1630362878:
                                if (str2.equals("CUTOUT_BITMAP")) {
                                    A01 = C73312Y3i.A00.A01(A012, null, copyOfRange);
                                    A02 = new XQZ(A01, str2);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            case -726741246:
                                if (str2.equals("MASK_AND_ORIGINAL_BITMAP")) {
                                    A01 = y4d.A02(A012, copyOfRange);
                                    A02 = new XQZ(A01, str2);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            case -432379959:
                                if (str2.equals(AbstractC43591JPw.A00(28))) {
                                    A02 = AbstractC72053XLu.A02(str2, A1E3, copyOfRange, f);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            case -213090439:
                                if (str2.equals("POINTS_AND_ORIGINAL_BITMAP")) {
                                    A01 = Y4d.A00(A012, ((XQW) AbstractC72053XLu.A04("null cannot be cast to non-null type com.aiplatform.inputs.AiInputListPointFs", list, 1)).A00, i11);
                                    A02 = new XQZ(A01, str2);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            case 667846867:
                                if (str2.equals("CUTOUT_BITMAP_INPUT_SIZE")) {
                                    A01 = C73312Y3i.A00.A02(A012, copyOfRange);
                                    A02 = new XQZ(A01, str2);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            case 1725137378:
                                if (str2.equals("MASK_BITMAP")) {
                                    A01 = Y4d.A01(copyOfRange, width, height);
                                    A02 = new XQZ(A01, str2);
                                    break;
                                }
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                            default:
                                A02 = new C44812Jsj(str2, tensor.getDataAsFloatArray());
                                break;
                        }
                        A1E3.add(A02);
                    }
                    return new C9VJ(A1E3);
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
        AbstractC72053XLu.A05(this.A03, this, 3);
    }

    public SegmentAnythingOnDeviceProcessorV2(C8EC c8ec) {
        this.A03 = c8ec;
    }

    @Override // X.YPE
    public final void Eah(C72686XlD c72686XlD) {
        this.A00 = c72686XlD;
    }
}
