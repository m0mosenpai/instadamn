package com.instagram.push;

import X.AbstractC12960li;
import X.AbstractC18680vv;
import X.AbstractC58327PtK;
import X.C023409i;
import X.C05F;
import X.C06090Tz;
import X.C0YB;
import X.C0f9;
import X.C0fM;
import X.C18U;
import X.C1AD;
import X.C1C0;
import X.C226218q;
import X.C3JG;
import X.C3UT;
import X.C3UY;
import X.C3V2;
import X.C3VA;
import X.C3VC;
import X.C64908TZi;
import X.C74063Tx;
import X.C74123Uq;
import X.FWU;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class FbnsInitBroadcastReceiver extends BroadcastReceiver {
    public static void A00(Intent intent, String str) {
        C0YB.A00.markerGenerateWithAnnotations(25105730, (short) 467, 0L, TimeUnit.MILLISECONDS, new C64908TZi(intent, str));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i;
        String A00;
        int A01 = C0f9.A01(862564143);
        C0fM.A01(this, context, intent);
        AbstractC18680vv A05 = C023409i.A0A.A05(this);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, A05, 36321292882879795L)) {
            i = 50988532;
        } else {
            Intent A002 = FWU.A00(intent);
            C226218q.A01(AbstractC12960li.A00).A0L(A002, C05F.A15);
            if (A002 == null) {
                A00(A002, "null intent");
                i = 838973032;
            } else if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(A002.getAction()) && !"android.intent.action.BOOT_COMPLETED".equals(A002.getAction()) && !"android.intent.action.USER_PRESENT".equals(A002.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(A002.getAction()) && !"com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(A002.getAction())) {
                A00(A002, "failed intent filters");
                i = -1268128060;
            } else {
                String str = null;
                if ("com.facebook.rti.intent.ACTION_FBNS_STARTED".equals(A002.getAction()) || "com.facebook.rti.intent.ACTION_FBNS_STOPPED".equals(A002.getAction())) {
                    C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
                    context.getClass();
                    if (!c74123Uq.A00(A002, new C3VA(context, null)).Cfc()) {
                        A00(A002, "failed authenticator");
                        i = 54398642;
                    }
                }
                if (C1AD.A06(c06090Tz, 18296431832203598L) && (A00 = C3V2.A00(context)) != null) {
                    C3VC.A01(context, null, FbnsServiceDelegate.A00(A00), "FbnsSuspendSwitch", A00, "com.facebook.rti.intent.ACTION_FBNS_KILL_SWITCH_DISABLE_SERVICE");
                }
                if (C3UT.A00(context)) {
                    boolean z = false;
                    if (AbstractC58327PtK.A00) {
                        AbstractC58327PtK.A03();
                    }
                    if (A05 instanceof UserSession) {
                        UserSession userSession = (UserSession) A05;
                        str = userSession.userId;
                        z = C1C0.A00(userSession);
                    }
                    C74063Tx.A00().CNt(C3JG.A00, str, z);
                }
                i = 625200554;
            }
        }
        C0f9.A0E(i, A01, intent);
    }
}
