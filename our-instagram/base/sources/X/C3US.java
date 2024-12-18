package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.3US, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3US {
    public final Context A00;
    public final C3UR A01;

    public static void A00(Context context, Intent intent) {
        AbstractC64515THi c60547R6k;
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra("extra_notification_id");
        String stringExtra3 = intent.getStringExtra("job_id");
        if (stringExtra3 == null) {
            c60547R6k = C60546R6j.A00;
        } else {
            c60547R6k = new C60547R6k(stringExtra3);
        }
        C63211SfG.A01(context, C60546R6j.A00, c60547R6k, stringExtra, stringExtra2, true);
    }

    public static void A01(Context context, Intent intent, String str) {
        AbstractC64515THi c60547R6k;
        String stringExtra = intent.getStringExtra("extra_notification_sender");
        String stringExtra2 = intent.getStringExtra("extra_notification_id");
        C60547R6k c60547R6k2 = new C60547R6k(str);
        String stringExtra3 = intent.getStringExtra("job_id");
        if (stringExtra3 == null) {
            c60547R6k = C60546R6j.A00;
        } else {
            c60547R6k = new C60547R6k(stringExtra3);
        }
        C63211SfG.A01(context, c60547R6k2, c60547R6k, stringExtra, stringExtra2, false);
    }

    public C3US(Context context, C3UR c3ur) {
        this.A00 = context;
        this.A01 = c3ur;
    }
}
