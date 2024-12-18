package X;

import com.facebook.react.views.webview.ReactWebViewManager;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: X.68a, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1348468a {
    public static int A00(ByteBuffer byteBuffer, int i, int i2) {
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

    public static C68Y A01(Class cls, ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int A00 = A00(byteBuffer, i, i2);
        if (A00 != 0 && (i3 = A00 + byteBuffer.getInt(A00)) != 0) {
            C68Y c68y = (C68Y) cls.newInstance();
            c68y.ANn(byteBuffer, i3);
            return c68y;
        }
        return null;
    }

    public static String A02(ByteBuffer byteBuffer, int i) {
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

    public static String A03(ByteBuffer byteBuffer, int i, int i2) {
        int i3;
        int A00 = A00(byteBuffer, i, i2);
        if (A00 != 0 && (i3 = A00 + byteBuffer.getInt(A00)) != 0) {
            return A02(byteBuffer, i3);
        }
        return null;
    }

    public static byte[] A04(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        byte[] bArr = new byte[byteBuffer.getInt(byteBuffer.getInt(A00) + A00)];
        ByteBuffer slice = byteBuffer.slice();
        slice.position(A00 + byteBuffer.getInt(A00) + 4);
        slice.get(bArr);
        return bArr;
    }

    public static float[] A05(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        float[] fArr = new float[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            fArr[i5] = byteBuffer.getFloat((i5 * 4) + i4);
        }
        return fArr;
    }

    public static C68Y[] A06(Class cls, ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        C68Y[] c68yArr = (C68Y[]) Array.newInstance((Class<?>) cls, i3);
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 * 4) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                int i8 = i6 + i7;
                C68Y c68y = (C68Y) cls.newInstance();
                c68y.ANn(byteBuffer, i8);
                c68yArr[i5] = c68y;
            }
        }
        return c68yArr;
    }

    public static String[] A07(ByteBuffer byteBuffer, int i, int i2) {
        int A00 = A00(byteBuffer, i, i2);
        if (A00 == 0) {
            return null;
        }
        int i3 = byteBuffer.getInt(byteBuffer.getInt(A00) + A00);
        int i4 = A00 + byteBuffer.getInt(A00) + 4;
        String[] strArr = new String[i3];
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = (i5 * 4) + i4;
            int i7 = byteBuffer.getInt(i6);
            if (i7 != 0) {
                strArr[i5] = A02(byteBuffer, i6 + i7);
            }
        }
        return strArr;
    }
}
