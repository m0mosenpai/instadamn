package X;

import android.graphics.Bitmap;
import java.nio.FloatBuffer;
import java.util.AbstractCollection;
import java.util.List;

/* renamed from: X.XLu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC72053XLu {
    public YNO A00;

    public static Bitmap A01(List list) {
        Object obj = list.get(0);
        C14360o3.A0C(obj, AbstractC43591JPw.A00(43));
        return ((C9VC) obj).A00;
    }

    public static long[] A07(int i, int i2) {
        return new long[]{1, 3, i, i2};
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.9vN, java.lang.Object] */
    public static C9VI A03() {
        return new C9VI(new Object());
    }

    public static void A05(C8EC c8ec, Object obj, int i) {
        c8ec.AV9(new Y9A(obj, i), true);
    }

    public static void A06(FloatBuffer floatBuffer, float[] fArr, float f, int i, int i2) {
        floatBuffer.put(i2, f / fArr[i]);
    }

    public final boolean A08() {
        YNO yno = this.A00;
        if (yno != null && !yno.ACS()) {
            return false;
        }
        return true;
    }

    public static C44812Jsj A02(String str, AbstractCollection abstractCollection, float[] fArr, float f) {
        abstractCollection.add(new C72145XQa(str, Float.valueOf(f)));
        return new C44812Jsj(str, fArr);
    }

    public static Object A04(String str, List list, int i) {
        Object obj = list.get(i);
        C14360o3.A0C(obj, str);
        return obj;
    }
}
