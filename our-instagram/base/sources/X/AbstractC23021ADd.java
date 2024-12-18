package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.provider.MediaStore;

/* renamed from: X.ADd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC23021ADd {
    public static final AbstractC24481Hr A01(Context context, C195868lW c195868lW) {
        if (c195868lW != null && context != null) {
            TUH tuh = new TUH(c195868lW.A0k, context, 6);
            InterfaceC14020nS A00 = C14120nc.A00();
            C14360o3.A07(A00);
            return LH2.A00(A00, tuh, 863109751);
        }
        return null;
    }

    public static final Location A00(Context context, String str) {
        if (!C1VW.isLocationEnabled(context) || Build.VERSION.SDK_INT >= 29 || str == null) {
            return null;
        }
        Location A01 = AbstractC209859Pw.A01(context, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, str);
        if (A01 == null) {
            return AbstractC209859Pw.A01(context, MediaStore.Video.Media.INTERNAL_CONTENT_URI, str);
        }
        return A01;
    }
}
