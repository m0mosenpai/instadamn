package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;

/* renamed from: X.F1x, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34069F1x {
    public static final void A00(Activity activity, android.net.Uri uri, String str, String str2) {
        C14360o3.A0B(str2, 3);
        Bundle A03 = AbstractC31180DnO.A03(str);
        String A00 = MSV.A00(19);
        A03.putParcelable(A00, uri);
        String A0R = AnonymousClass001.A0R("sms:", str2);
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.SEND");
        LruCache lruCache = AbstractC08820cl.A00;
        A08.setData(android.net.Uri.parse(A0R));
        if (str != null) {
            A08.putExtra("sms_body", str);
        }
        if (uri != null) {
            A08.putExtra(A00, uri);
            A08.setType("image/jpeg");
        }
        C12260kU.A00(activity, A08);
    }
}
