package X;

import android.os.Build;
import android.view.View;

/* loaded from: classes11.dex */
public class UKB extends UKC {
    public static boolean A00 = true;

    @Override // X.VKI
    public void A04(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.A04(view, i);
        } else {
            if (!A00) {
                return;
            }
            try {
                AbstractC68272VKj.A00(view, i);
            } catch (NoSuchMethodError unused) {
                A00 = false;
            }
        }
    }
}
