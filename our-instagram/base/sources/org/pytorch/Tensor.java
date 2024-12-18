package org.pytorch;

import X.AbstractC111324zv;
import X.AnonymousClass001;
import X.C72095XNp;
import X.C73572YLg;
import X.EnumC209389Nw;
import X.XOF;
import com.facebook.jni.HybridData;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.LongBuffer;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class Tensor {
    public HybridData mHybridData;
    public final EnumC209389Nw memoryFormat;
    public final long[] shape;

    public static void checkShape(long[] jArr) {
        boolean z = false;
        if (jArr != null) {
            z = true;
        }
        checkArgument(z, "Shape must be not null", new Object[0]);
        for (long j : jArr) {
            boolean z2 = false;
            if (j >= 0) {
                z2 = true;
            }
            checkArgument(z2, "Shape elements must be non negative", new Object[0]);
        }
    }

    public static Tensor fromBlob(FloatBuffer floatBuffer, long[] jArr, EnumC209389Nw enumC209389Nw) {
        boolean z = false;
        if (floatBuffer != null) {
            z = true;
        }
        checkArgument(z, "Data buffer must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(floatBuffer.capacity(), jArr);
        checkArgument(floatBuffer.isDirect(), "Data buffer must be direct (java.nio.ByteBuffer#allocateDirect)", new Object[0]);
        checkArgument(floatBuffer.order() == ByteOrder.nativeOrder(), "Data buffer must have native byte order (java.nio.ByteOrder#nativeOrder)", new Object[0]);
        return new C72095XNp(floatBuffer, enumC209389Nw, jArr);
    }

    public abstract XOF dtype();

    public abstract Buffer getRawDataBuffer();

    public static FloatBuffer allocateFloatBuffer(int i) {
        return ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.format(Locale.US, str, objArr));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (3 == r6) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static org.pytorch.Tensor nativeNewTensor(java.nio.ByteBuffer r3, long[] r4, int r5, int r6, com.facebook.jni.HybridData r7) {
        /*
            X.9Nw r2 = X.EnumC209389Nw.CONTIGUOUS
            X.9Nw r1 = X.EnumC209389Nw.CHANNELS_LAST
            r0 = 2
            if (r0 == r6) goto Lc
            X.9Nw r1 = X.EnumC209389Nw.CHANNELS_LAST_3D
            r0 = 3
            if (r0 != r6) goto Ld
        Lc:
            r2 = r1
        Ld:
            r0 = 4
            r1 = 0
            if (r0 != r5) goto L1d
            java.nio.FloatBuffer r0 = r3.asFloatBuffer()
            X.XNp r1 = new X.XNp
            r1.<init>(r0, r2, r4)
        L1a:
            r1.mHybridData = r7
            return r1
        L1d:
            r0 = 3
            if (r0 != r5) goto L2a
            java.nio.IntBuffer r0 = r3.asIntBuffer()
            X.YLf r1 = new X.YLf
            r1.<init>(r0, r2, r4)
            goto L1a
        L2a:
            r0 = 5
            if (r0 != r5) goto L37
            java.nio.LongBuffer r0 = r3.asLongBuffer()
            X.YLg r1 = new X.YLg
            r1.<init>(r0, r2, r4)
            goto L1a
        L37:
            r0 = 6
            if (r0 != r5) goto L44
            java.nio.DoubleBuffer r0 = r3.asDoubleBuffer()
            X.YLe r1 = new X.YLe
            r1.<init>(r0, r2, r4)
            goto L1a
        L44:
            r0 = 1
            if (r0 != r5) goto L4d
            X.YLi r1 = new X.YLi
            r1.<init>(r3, r2, r4)
            goto L1a
        L4d:
            r0 = 2
            if (r0 != r5) goto L1a
            X.YLh r1 = new X.YLh
            r1.<init>(r3, r2, r4)
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: org.pytorch.Tensor.nativeNewTensor(java.nio.ByteBuffer, long[], int, int, com.facebook.jni.HybridData):org.pytorch.Tensor");
    }

    public float[] getDataAsFloatArray() {
        throw new IllegalStateException(AnonymousClass001.A0g(AbstractC111324zv.A00(1813), getClass().getSimpleName(), AbstractC111324zv.A00(1385)));
    }

    public int memoryFormatJniCode() {
        return this.memoryFormat.A00;
    }

    public Tensor(long[] jArr, EnumC209389Nw enumC209389Nw) {
        checkShape(jArr);
        this.shape = Arrays.copyOf(jArr, jArr.length);
        this.memoryFormat = enumC209389Nw;
    }

    public static void checkShapeAndDataCapacityConsistency(int i, long[] jArr) {
        checkShape(jArr);
        int i2 = 1;
        for (long j : jArr) {
            i2 = (int) (i2 * j);
        }
        long j2 = i2;
        boolean z = false;
        if (j2 == i) {
            z = true;
        }
        checkArgument(z, "Inconsistent data capacity:%d and shape number elements:%d shape:%s", Integer.valueOf(i), Long.valueOf(j2), Arrays.toString(jArr));
    }

    public int dtypeJniCode() {
        return dtype().A00;
    }

    public static Tensor fromBlob(float[] fArr, long[] jArr, EnumC209389Nw enumC209389Nw) {
        boolean z = false;
        if (fArr != null) {
            z = true;
        }
        checkArgument(z, "Data array must be not null", new Object[0]);
        checkShape(jArr);
        checkShapeAndDataCapacityConsistency(fArr.length, jArr);
        checkShape(jArr);
        int i = 1;
        for (long j : jArr) {
            i = (int) (i * j);
        }
        FloatBuffer allocateFloatBuffer = allocateFloatBuffer(i);
        allocateFloatBuffer.put(fArr);
        return new C72095XNp(allocateFloatBuffer, enumC209389Nw, jArr);
    }

    public static Tensor fromBlob(long[] jArr, long[] jArr2) {
        EnumC209389Nw enumC209389Nw = EnumC209389Nw.CONTIGUOUS;
        checkShape(jArr2);
        checkShapeAndDataCapacityConsistency(jArr.length, jArr2);
        checkShape(jArr2);
        int i = 1;
        for (long j : jArr2) {
            i = (int) (i * j);
        }
        LongBuffer asLongBuffer = ByteBuffer.allocateDirect(i * 8).order(ByteOrder.nativeOrder()).asLongBuffer();
        asLongBuffer.put(jArr);
        return new C73572YLg(asLongBuffer, enumC209389Nw, jArr2);
    }
}
