package X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.Sim, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63375Sim {
    public static final char[] A00 = "0123456789abcdef".toCharArray();
    public static final char[] A01 = new char[64];
    public static volatile Handler A02;

    public static int A00(Bitmap.Config config, int i, int i2) {
        int i3 = i * i2;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int A06 = AbstractC58318PtA.A06(config, S6B.A00);
        int i4 = 4;
        if (A06 != 1) {
            if (A06 != 2 && A06 != 3) {
                if (A06 == 4) {
                    i4 = 8;
                }
            } else {
                i4 = 2;
            }
        } else {
            i4 = 1;
        }
        return i3 * i4;
    }

    public static Handler A02() {
        if (A02 == null) {
            synchronized (C63375Sim.class) {
                if (A02 == null) {
                    A02 = AbstractC167007dF.A0J();
                }
            }
        }
        return A02;
    }

    public static boolean A05(int i, int i2) {
        if (i > 0 || i == Integer.MIN_VALUE) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static int A01(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot obtain size for recycled Bitmap: ");
        A1C.append(bitmap);
        A1C.append("[");
        A1C.append(bitmap.getWidth());
        A1C.append("x");
        A1C.append(bitmap.getHeight());
        A1C.append("] ");
        throw AbstractC58320PtC.A0n(bitmap.getConfig(), A1C);
    }

    public static ArrayList A03(Collection collection) {
        ArrayList A17 = AbstractC25225BEi.A17(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                A17.add(obj);
            }
        }
        return A17;
    }

    public static void A04() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
        } else {
            throw AbstractC166987dD.A12("You must call this method on the main thread");
        }
    }
}
