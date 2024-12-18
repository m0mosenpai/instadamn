package X;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.facebook.browser.iabcontext.IabCommonTrait;

/* renamed from: X.Rqu, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61630Rqu {
    public static Object A00(Intent intent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC61629Rqt.A00(intent);
        }
        Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_IAB_CONTEXT");
        if (IabCommonTrait.class.isInstance(parcelableExtra)) {
            return parcelableExtra;
        }
        return null;
    }
}
