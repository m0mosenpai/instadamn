package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import java.util.ArrayList;

/* renamed from: X.Swh, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63957Swh implements InterfaceC65539TmB {
    public static final ArrayList A00 = AbstractC58319PtB.A12(new String[]{"api.whatsapp.com", "call.whatsapp.com", "chat.whatsapp.com", "whatsapp.com", "www.whatsapp.com", "v.whatsapp.com", "wa.me", "whatsapp://send"});

    @Override // X.InterfaceC65539TmB
    public final boolean F8o(Context context, Bundle bundle) {
        return A00(context, new Uri.Builder().scheme(AbstractC111324zv.A00(1374)).appendPath("com.whatsapp").build());
    }

    public static final boolean A00(Context context, android.net.Uri uri) {
        if (C0JS.A05(context.getPackageManager(), "com.whatsapp")) {
            C05300Qc A05 = C0b3.A00().A05();
            Intent A0C = AbstractC58318PtA.A0C();
            String obj = uri.toString();
            LruCache lruCache = AbstractC08820cl.A00;
            A05.A0G(context, A0C.setData(android.net.Uri.parse(obj)));
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC65539TmB
    public final Bundle ALk(String str, String str2, boolean z) {
        Bundle A0N = AbstractC58321PtD.A0N(str, str2, z);
        A0N.putStringArrayList("package_names", A00);
        return A0N;
    }

    @Override // X.InterfaceC65539TmB
    public final boolean F8p(Context context, Bundle bundle) {
        String string = bundle.getString("url");
        if (string == null || !string.startsWith("whatsapp://send")) {
            return false;
        }
        return A00(context, AbstractC08820cl.A03(string));
    }
}
