package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.rti.push.service.FbnsServiceDelegate;

/* renamed from: X.Q1f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58697Q1f extends BroadcastReceiver {
    public final /* synthetic */ C63211SfG A00;

    public C58697Q1f(C63211SfG c63211SfG) {
        this.A00 = c63211SfG;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        int i;
        String A0R;
        int A04 = AbstractC58318PtA.A04(this, context, intent, -1961278261);
        C63211SfG c63211SfG = this.A00;
        if (intent == null) {
            c63211SfG.A06.A0b(null, "no_intent_present");
            i = 764955254;
        } else {
            C3VA c3va = c63211SfG.A04;
            String A00 = C3VA.A00(intent);
            if (!S10.A00(intent.getAction(), "com.facebook.rti.intent.ACTION_NOTIFICATION_ACK")) {
                c63211SfG.A06.A0b(A00, "incorrect_intent_action");
                i = 1705175804;
            } else if (!((C74123Uq) C3UY.A00).A00(intent, c3va).Cfc()) {
                c63211SfG.A06.A0b(A00, "sender_not_verified");
                i = 1435405643;
            } else {
                String stringExtra = intent.getStringExtra("extra_notification_id");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if (!intent.getBooleanExtra("extra_processor_completed", true)) {
                        String stringExtra2 = intent.getStringExtra("processor_failed_reason");
                        if (TextUtils.isEmpty(stringExtra2)) {
                            A0R = "processor_failed";
                        } else {
                            A0R = AnonymousClass001.A0R("processor_failed_", stringExtra2);
                        }
                        c63211SfG.A06.A0b(A00, A0R);
                    }
                    FbnsServiceDelegate fbnsServiceDelegate = c63211SfG.A06;
                    String str2 = stringExtra;
                    if (A00 != null) {
                        str2 = AnonymousClass001.A0T(stringExtra, A00, '_');
                    }
                    AbstractC64515THi A0U = fbnsServiceDelegate.A0U(str2, A00);
                    if (A0U instanceof C60546R6j) {
                        C63276Sga A03 = c63211SfG.A03(A00);
                        synchronized (A03) {
                            A0U = C63276Sga.A00(A03, stringExtra);
                            A03.A03.remove(stringExtra);
                            C91M ARA = A03.A02.ARA();
                            ARA.EEh(stringExtra);
                            ARA.AIY();
                        }
                    }
                    if (A0U instanceof C60546R6j) {
                        str = "not_found_in_fbns_notif_store";
                    } else {
                        fbnsServiceDelegate.A0a((SJ0) A0U.A01(), stringExtra, A00);
                        i = 1341752853;
                    }
                } else {
                    str = "notif_id_not_present_in_intent";
                }
                c63211SfG.A06.A0b(A00, str);
                i = 1341752853;
            }
        }
        C0f9.A0E(i, A04, intent);
    }
}
