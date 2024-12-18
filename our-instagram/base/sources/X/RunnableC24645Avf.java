package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.ArrayMap;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import org.pytorch.IValue;
import org.pytorch.Tensor;

/* renamed from: X.Avf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24645Avf implements Runnable {
    public final /* synthetic */ C8MR A00;
    public final /* synthetic */ C183978Ee A01;

    public RunnableC24645Avf(C8MR c8mr, C183978Ee c183978Ee) {
        this.A00 = c8mr;
        this.A01 = c183978Ee;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.9vN, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.9vN, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object c9vi;
        double d;
        C8MR c8mr = this.A00;
        C210749Tw c210749Tw = c8mr.A00;
        if (c210749Tw != null) {
            C183978Ee c183978Ee = this.A01;
            InterfaceC16660sJ interfaceC16660sJ = c8mr.A07;
            BAO bao = new BAO(31, c183978Ee, c8mr);
            int i = 0;
            C14360o3.A0B(interfaceC16660sJ, 1);
            Bitmap bitmap = (Bitmap) interfaceC16660sJ.invoke(c183978Ee);
            if (bitmap != null) {
                try {
                    try {
                        C22896A7q c22896A7q = c210749Tw.A01;
                        List A1J = AbstractC166987dD.A1J(new C9VC(bitmap));
                        C14360o3.A0B(C16930sl.A00, 1);
                        String str = c22896A7q.A00;
                        if (str != null) {
                            C193208h0 c193208h0 = c22896A7q.A01;
                            if (c193208h0 == null) {
                                try {
                                    c193208h0 = AbstractC193188gy.A00(str);
                                    c22896A7q.A01 = c193208h0;
                                } catch (Exception e) {
                                    StringBuilder A1C = AbstractC166987dD.A1C();
                                    A1C.append("Load model failed ");
                                    A1C.append(e);
                                    A1C.toString();
                                    c9vi = new C9VI(new Object());
                                }
                            }
                            Object obj = A1J.get(0);
                            C14360o3.A0C(obj, AbstractC43591JPw.A00(43));
                            Bitmap bitmap2 = ((C9VC) obj).A00;
                            Integer valueOf = Integer.valueOf(bitmap2.getWidth());
                            Integer valueOf2 = Integer.valueOf(bitmap2.getHeight());
                            int height = bitmap2.getHeight();
                            int width = bitmap2.getWidth();
                            double d2 = 360.0d;
                            double min = (360.0d * 1.0d) / Math.min(height, width);
                            if (height < width) {
                                d = min * width;
                            } else {
                                d2 = min * height;
                                d = 360.0d;
                            }
                            double max = Math.max(d2, d);
                            if (max > 540.0d) {
                                double d3 = (540.0d * 1.0d) / max;
                                d2 *= d3;
                                d *= d3;
                            }
                            Bitmap A00 = C0fK.A00(bitmap2, (int) (d + 0.5d), (int) (d2 + 0.5d), true);
                            C14360o3.A07(A00);
                            int width2 = A00.getWidth();
                            int height2 = A00.getHeight();
                            int width3 = A00.getWidth();
                            int height3 = A00.getHeight();
                            FloatBuffer allocateFloatBuffer = Tensor.allocateFloatBuffer(width3 * 3 * height3);
                            C14360o3.A07(allocateFloatBuffer);
                            int i2 = height3 * width3;
                            int[] iArr = new int[i2];
                            A00.getPixels(iArr, 0, width3, 0, 0, width3, height3);
                            for (int i3 = 0; i3 < i2; i3++) {
                                int i4 = iArr[i3];
                                allocateFloatBuffer.put(i3, (i4 >> 16) & 255);
                                allocateFloatBuffer.put(i2 + i3, (i4 >> 8) & 255);
                                allocateFloatBuffer.put((i2 * 2) + i3, i4 & 255);
                            }
                            long[] jArr = {1, 3, height3, width3};
                            EnumC209389Nw enumC209389Nw = EnumC209389Nw.CONTIGUOUS;
                            IValue[] tuple = c193208h0.A00.forward(IValue.tupleFrom(IValue.from(Tensor.fromBlob(allocateFloatBuffer, jArr, enumC209389Nw)), IValue.from(Tensor.fromBlob(new float[]{A00.getHeight(), A00.getWidth(), 1.0f}, new long[]{1, 3}, enumC209389Nw)))).toTuple();
                            C14360o3.A0A(tuple);
                            float[] dataAsFloatArray = ((IValue) AbstractC009903n.A05(tuple)).toTensor().getDataAsFloatArray();
                            int length = dataAsFloatArray.length;
                            int i5 = length / 4;
                            RectF[] rectFArr = new RectF[i5];
                            int i6 = 0;
                            for (int i7 = 0; i7 < i5; i7++) {
                                rectFArr[i7] = AbstractC166987dD.A0X();
                            }
                            int A002 = C17x.A00(0, length - 1, 4);
                            if (A002 >= 0) {
                                int i8 = 0;
                                while (true) {
                                    int i9 = i8 + 1;
                                    RectF rectF = rectFArr[i8];
                                    rectF.left = dataAsFloatArray[i];
                                    rectF.top = dataAsFloatArray[i + 1];
                                    rectF.right = dataAsFloatArray[i + 2];
                                    rectF.bottom = dataAsFloatArray[i + 3];
                                    float floatValue = valueOf.floatValue() / width2;
                                    float floatValue2 = valueOf2.floatValue() / height2;
                                    rectFArr[i8] = new RectF(rectF.left * floatValue, rectF.top * floatValue2, rectF.right * floatValue, rectF.bottom * floatValue2);
                                    if (i == A002) {
                                        break;
                                    }
                                    i += 4;
                                    i8 = i9;
                                }
                            }
                            float[] dataAsFloatArray2 = tuple[1].toTensor().getDataAsFloatArray();
                            ArrayList arrayList = new ArrayList(i5);
                            int i10 = 0;
                            while (i6 < i5) {
                                arrayList.add(new C9VG(rectFArr[i6], dataAsFloatArray2[i10]));
                                i6++;
                                i10++;
                            }
                            c9vi = new C9VJ(arrayList);
                        } else {
                            c9vi = new C9VI(new Object());
                        }
                        if (c9vi instanceof C9VJ) {
                            ArrayMap arrayMap = c210749Tw.A00;
                            String A06 = c183978Ee.A06();
                            List list = ((C9VJ) c9vi).A00;
                            ArrayList A1E = AbstractC166987dD.A1E();
                            for (Object obj2 : list) {
                                if (obj2 instanceof C9VG) {
                                    A1E.add(obj2);
                                }
                            }
                            arrayMap.put(A06, A1E);
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } finally {
                    bao.invoke(c210749Tw.A00.get(c183978Ee.A06()));
                }
            }
        }
    }
}
