package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes11.dex */
public abstract class WGe {
    public static float A00(ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 != 0) {
            return byteBuffer.getFloat(A01);
        }
        return 0.0f;
    }

    public static int A01(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i - byteBuffer.getInt(i);
        int i4 = (i2 * 2) + 4;
        if (i4 < byteBuffer.getShort(i3)) {
            short s = byteBuffer.getShort(i3 + i4);
            int i5 = s + i;
            if (s != 0) {
                return i5;
            }
        }
        return 0;
    }

    public static X98 A02(Class cls, ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int A01 = A01(byteBuffer, i, i2);
        if (A01 != 0 && (i3 = A01 + byteBuffer.getInt(A01)) != 0) {
            X98 x98 = (X98) cls.newInstance();
            x98.ANn(byteBuffer, i3);
            return x98;
        }
        return null;
    }

    public static X98 A03(Class cls, ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 != 0) {
            X98 x98 = (X98) cls.newInstance();
            x98.ANn(byteBuffer, A01);
            return x98;
        }
        return null;
    }

    public static String A04(ByteBuffer byteBuffer, int i) {
        if (byteBuffer.hasArray()) {
            return new String(byteBuffer.array(), i + 4, byteBuffer.getInt(i), Charset.forName(ReactWebViewManager.HTML_ENCODING));
        }
        int i2 = byteBuffer.getInt(i);
        byte[] bArr = new byte[i2];
        int position = byteBuffer.position();
        byteBuffer.position(i + 4);
        byteBuffer.get(bArr);
        byteBuffer.position(position);
        return new String(bArr, 0, i2, Charset.forName(ReactWebViewManager.HTML_ENCODING));
    }

    public static String A05(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int A01 = A01(byteBuffer, i, i2);
        if (A01 != 0 && (i3 = A01 + byteBuffer.getInt(A01)) != 0) {
            return A04(byteBuffer, i3);
        }
        return null;
    }

    public static byte[] A06(ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 == 0) {
            return null;
        }
        byte[] bArr = new byte[byteBuffer.getInt(byteBuffer.getInt(A01) + A01)];
        ByteBuffer slice = byteBuffer.slice();
        slice.position(A01 + byteBuffer.getInt(A01) + 4);
        slice.get(bArr);
        return bArr;
    }

    public static float[] A07(ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A01) + A01);
        int i4 = A01 + byteBuffer.getInt(A01) + 4;
        float[] fArr = new float[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            fArr[i5] = byteBuffer.getFloat((i5 * 4) + i4);
        }
        return fArr;
    }

    public static int[] A08(ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A01) + A01);
        int i4 = A01 + byteBuffer.getInt(A01) + 4;
        int[] iArr = new int[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = byteBuffer.getInt((i5 * 4) + i4);
        }
        return iArr;
    }

    public static X98[] A09(Class cls, ByteBuffer byteBuffer, int i, int i2) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A01) + A01);
        int i4 = A01 + byteBuffer.getInt(A01) + 4;
        X98[] x98Arr = (X98[]) Array.newInstance((Class<?>) cls, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 * 4) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                int i8 = i6 + i7;
                X98 x98 = (X98) cls.newInstance();
                x98.ANn(byteBuffer, i8);
                x98Arr[i5] = x98;
            }
        }
        return x98Arr;
    }

    public static X98[] A0A(Class cls, ByteBuffer byteBuffer, int i, int i2, int i3) {
        int A01 = A01(byteBuffer, i, i2);
        if (A01 == 0) {
            return null;
        }
        int i4 = byteBuffer.getInt(byteBuffer.getInt(A01) + A01);
        int i5 = A01 + byteBuffer.getInt(A01) + 4;
        X98[] x98Arr = (X98[]) Array.newInstance((Class<?>) cls, i4);
        for (int i6 = 0; i6 < i4; i6++) {
            X98 x98 = (X98) cls.newInstance();
            x98.ANn(byteBuffer, (i6 * i3) + i5);
            x98Arr[i6] = x98;
        }
        return x98Arr;
    }
}
