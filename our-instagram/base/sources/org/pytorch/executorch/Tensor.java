package org.pytorch.executorch;

import X.AbstractC111324zv;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC58319PtB;
import X.AbstractC65702TsY;
import X.AbstractC72046XLm;
import X.C73575YLj;
import X.C73576YLk;
import X.C73577YLl;
import X.C73578YLm;
import X.C73579YLn;
import X.C73580YLo;
import X.EnumC72348Xbk;
import X.MSY;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;

/* loaded from: classes12.dex */
public abstract class Tensor {
    public HybridData mHybridData;
    public final long[] shape;

    public static void checkShape(long[] jArr) {
        Object[] objArr = new Object[0];
        if (AbstractC167007dF.A1W(jArr)) {
            for (long j : jArr) {
                Object[] objArr2 = new Object[0];
                if (!MSY.A1R((j > 0L ? 1 : (j == 0L ? 0 : -1)))) {
                    throw AbstractC72046XLm.A0X("Shape elements must be non negative", objArr2);
                }
            }
            return;
        }
        throw AbstractC72046XLm.A0X("Shape must be not null", objArr);
    }

    public static Tensor fromBlob(FloatBuffer floatBuffer, long[] jArr) {
        Object[] objArr = new Object[0];
        if (AbstractC167007dF.A1W(floatBuffer)) {
            checkShape(jArr);
            checkShapeAndDataCapacityConsistency(floatBuffer.capacity(), jArr);
            Object[] objArr2 = new Object[0];
            if (floatBuffer.isDirect()) {
                Object[] objArr3 = new Object[0];
                if (floatBuffer.order() == ByteOrder.nativeOrder()) {
                    return new C73580YLo(floatBuffer, jArr);
                }
                throw AbstractC72046XLm.A0X("Data buffer must have native byte order (java.nio.ByteOrder#nativeOrder)", objArr3);
            }
            throw AbstractC72046XLm.A0X("Data buffer must be direct (java.nio.ByteBuffer#allocateDirect)", objArr2);
        }
        throw AbstractC72046XLm.A0X("Data buffer must be not null", objArr);
    }

    public static Tensor nativeNewTensor(ByteBuffer byteBuffer, long[] jArr, int i, HybridData hybridData) {
        Tensor c73578YLm;
        if (6 == i) {
            c73578YLm = new C73580YLo(byteBuffer.asFloatBuffer(), jArr);
        } else if (3 == i) {
            c73578YLm = new C73576YLk(byteBuffer.asIntBuffer(), jArr);
        } else if (4 == i) {
            c73578YLm = new C73577YLl(byteBuffer.asLongBuffer(), jArr);
        } else if (7 == i) {
            c73578YLm = new C73575YLj(byteBuffer.asDoubleBuffer(), jArr);
        } else if (0 == i) {
            c73578YLm = new C73579YLn(byteBuffer, jArr);
        } else if (1 == i) {
            c73578YLm = new C73578YLm(byteBuffer, jArr);
        } else {
            throw AbstractC166987dD.A12("Unknown Tensor dtype");
        }
        c73578YLm.mHybridData = hybridData;
        return c73578YLm;
    }

    public abstract EnumC72348Xbk dtype();

    public abstract Buffer getRawDataBuffer();

    public float[] getDataAsFloatArray() {
        throw AbstractC58319PtB.A0k(AbstractC111324zv.A00(1813), AbstractC31173DnH.A0q(this), AbstractC111324zv.A00(1385));
    }

    public Tensor(long[] jArr) {
        checkShape(jArr);
        this.shape = Arrays.copyOf(jArr, jArr.length);
    }

    public static void checkShapeAndDataCapacityConsistency(int i, long[] jArr) {
        checkShape(jArr);
        int i2 = 1;
        for (long j : jArr) {
            i2 = (int) (i2 * j);
        }
        long j2 = i2;
        boolean A1N = AbstractC167007dF.A1N((j2 > i ? 1 : (j2 == i ? 0 : -1)));
        Object[] objArr = {Integer.valueOf(i), Long.valueOf(j2), Arrays.toString(jArr)};
        if (!A1N) {
            throw AbstractC72046XLm.A0X("Inconsistent data capacity:%d and shape number elements:%d shape:%s", objArr);
        }
    }

    public int dtypeJniCode() {
        return dtype().A00;
    }

    public static Tensor fromBlob(float[] fArr, long[] jArr) {
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(fArr.length, jArr);
        checkShape(jArr);
        int i = 1;
        for (long j : jArr) {
            i = (int) (i * j);
        }
        FloatBuffer asFloatBuffer = AbstractC65702TsY.A0j(i * 4).asFloatBuffer();
        asFloatBuffer.put(fArr);
        return new C73580YLo(asFloatBuffer, jArr);
    }

    public static Tensor fromBlob(long[] jArr, long[] jArr2) {
        checkShape(jArr2);
        checkShapeAndDataCapacityConsistency(jArr.length, jArr2);
        checkShape(jArr2);
        int i = 1;
        int i2 = 0;
        do {
            i = (int) (i * jArr2[i2]);
            i2++;
        } while (i2 < 2);
        LongBuffer asLongBuffer = AbstractC65702TsY.A0j(i * 8).asLongBuffer();
        asLongBuffer.put(jArr);
        return new C73577YLl(asLongBuffer, jArr2);
    }
}
