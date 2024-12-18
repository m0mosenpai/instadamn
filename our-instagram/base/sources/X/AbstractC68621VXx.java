package X;

import android.os.Build;
import android.view.ViewGroup;

/* renamed from: X.VXx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68621VXx {
    public static boolean A00 = true;

    public static void A00(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC68270VKh.A00(viewGroup, z);
        } else {
            if (!A00) {
                return;
            }
            try {
                AbstractC68270VKh.A00(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
