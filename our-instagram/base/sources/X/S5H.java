package X;

import android.content.Intent;
import android.os.Build;

/* loaded from: classes10.dex */
public abstract class S5H {
    public static final String A00(Intent intent) {
        Object parcelableExtra;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER", android.net.Uri.class);
        } else {
            parcelableExtra = intent.getParcelableExtra("android.intent.extra.REFERRER");
        }
        return AbstractC31180DnO.A0k(parcelableExtra);
    }
}
