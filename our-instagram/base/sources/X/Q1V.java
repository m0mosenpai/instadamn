package X;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes10.dex */
public abstract class Q1V extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -790395757);
        C11770jb c11770jb = C11790jd.A04;
        Context context2 = AbstractC12290kX.A00;
        C14360o3.A07(context2);
        C19U A01 = c11770jb.A00(context2).A01(null);
        if ("com.facebook.GET_PHONE_ID".equals(intent.getAction()) && A01 != null) {
            Bundle resultExtras = getResultExtras(true);
            C03190Dc c03190Dc = AbstractC62855SUc.A01;
            PendingIntent pendingIntent = (PendingIntent) resultExtras.getParcelable("auth");
            if (pendingIntent != null && AbstractC62855SUc.A00(context, pendingIntent.getCreatorPackage())) {
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putLong("timestamp", A01.A00);
                A0b.putString("origin", A01.A02);
                setResult(-1, A01.A01, A0b);
            }
            i = -1014110834;
        } else {
            i = 1968525047;
        }
        C0f9.A0E(i, A04, intent);
    }
}
