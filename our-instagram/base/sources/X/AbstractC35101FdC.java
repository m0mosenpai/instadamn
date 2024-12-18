package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.LruCache;

/* renamed from: X.FdC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35101FdC {
    public static final void A02(Context context, String str, String str2) {
        C14360o3.A0B(str, 0);
        C12260kU.A00(context, A00(str, str2));
    }

    public static final Intent A00(String str, String str2) {
        String A0R = AnonymousClass001.A0R("sms:", str);
        Intent A08 = AbstractC31177DnL.A08("android.intent.action.VIEW");
        LruCache lruCache = AbstractC08820cl.A00;
        A08.setData(android.net.Uri.parse(A0R));
        if (str2 != null) {
            A08.putExtra("sms_body", str2);
        }
        return A08;
    }

    public static void A01(Context context, String str, String str2) {
        new Bundle().putString("android.intent.extra.TEXT", str);
        A02(context, str2, str);
    }
}
