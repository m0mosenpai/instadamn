package X;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

/* renamed from: X.Sd3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63101Sd3 {
    public static final C63101Sd3 A00 = new Object();

    public static final void A00(Context context, String str) {
        Intent A04 = AbstractC31171DnF.A04();
        A04.setPackage(str);
        A04.setAction("com.whatsapp.otp.OTP_REQUESTED");
        Bundle extras = A04.getExtras();
        if (extras == null) {
            extras = AbstractC166987dD.A0b();
        }
        int i = 0;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 67108864;
        }
        C04750Mt A0R = MSZ.A0R(context, A04);
        A0R.A09();
        extras.putParcelable("_ci_", A0R.A02(context, 0, i));
        A04.putExtras(extras);
        context.sendBroadcast(A04);
    }
}
