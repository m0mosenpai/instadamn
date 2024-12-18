package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.0MA, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0MA {
    public ConcurrentHashMap A00 = new ConcurrentHashMap();

    public abstract Typeface A01(Context context, Resources resources, C72659Xka c72659Xka, int i);

    public abstract Typeface A03(Context context, CancellationSignal cancellationSignal, C54162eO[] c54162eOArr, int i);

    public C54162eO A04(C54162eO[] c54162eOArr, int i) {
        int i2 = 700;
        if ((i & 1) == 0) {
            i2 = ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
        }
        boolean z = false;
        if ((i & 2) != 0) {
            z = true;
        }
        C54162eO c54162eO = null;
        int i3 = Integer.MAX_VALUE;
        for (C54162eO c54162eO2 : c54162eOArr) {
            int abs = Math.abs(c54162eO2.A02 - i2) * 2;
            int i4 = 1;
            if (c54162eO2.A04 == z) {
                i4 = 0;
            }
            int i5 = abs + i4;
            if (c54162eO == null || i3 > i5) {
                c54162eO = c54162eO2;
                i3 = i5;
            }
        }
        return c54162eO;
    }

    public Typeface A02(Context context, Resources resources, String str, int i, int i2) {
        File A00 = AbstractC15460q1.A00(context);
        if (A00 == null) {
            return null;
        }
        try {
            if (!AbstractC15460q1.A02(resources, A00, i)) {
                return null;
            }
            return Typeface.createFromFile(A00.getPath());
        } catch (RuntimeException unused) {
            return null;
        } finally {
            A00.delete();
        }
    }
}
