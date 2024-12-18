package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Message;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;

/* renamed from: X.RLe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class HandlerC60675RLe extends HandlerC1336161q {
    public final Context A00;
    public final /* synthetic */ GoogleApiAvailability A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HandlerC60675RLe(android.content.Context r2, com.google.android.gms.common.GoogleApiAvailability r3) {
        /*
            r1 = this;
            r1.A01 = r3
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        Lc:
            r1.<init>(r0)
            android.content.Context r0 = r2.getApplicationContext()
            r1.A00 = r0
            return
        L16:
            android.os.Looper r0 = android.os.Looper.myLooper()
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HandlerC60675RLe.<init>(android.content.Context, com.google.android.gms.common.GoogleApiAvailability):void");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i = message.what;
        if (i != 1) {
            android.util.Log.w("GoogleApiAvailability", AnonymousClass001.A0O("Don't know how to handle this message: ", i));
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.A01;
        Context context = this.A00;
        int A05 = AbstractC58318PtA.A05(context, googleApiAvailability);
        boolean z = GooglePlayServicesUtil.A00;
        if (A05 != 1 && A05 != 2 && A05 != 3 && A05 != 9) {
            return;
        }
        Intent A04 = googleApiAvailability.A04(context, "n", A05);
        if (A04 == null) {
            activity = null;
        } else {
            activity = PendingIntent.getActivity(context, 0, A04, 201326592);
        }
        googleApiAvailability.A06(activity, context, A05);
    }
}
