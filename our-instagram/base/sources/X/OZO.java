package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.instagram.zero.dogfooding.notification.IgZeroDogfoodingNotificationActionReceiver;

/* loaded from: classes9.dex */
public final class OZO {
    public static AnonymousClass195 A00;
    public static final OZO A01 = new Object();
    public static final InterfaceC09390do A02 = AbstractC09440dt.A01(C57495PfV.A00);

    public static final PendingIntent A00(String str, int i) {
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        C04750Mt c04750Mt = new C04750Mt();
        Intent A08 = MSW.A08(context, IgZeroDogfoodingNotificationActionReceiver.class);
        A08.putExtra("dogfooding_mode", str);
        c04750Mt.A0A(A08);
        return c04750Mt.A02(context, i, 134217728);
    }
}
