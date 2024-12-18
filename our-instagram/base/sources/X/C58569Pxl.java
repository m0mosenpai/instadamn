package X;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Pxl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58569Pxl implements InterfaceC48932Mm, InterfaceC49062Mz {
    public static final String A0A = C48442Kl.A01("SystemFgDispatcher");
    public C2L1 A00;
    public InterfaceC65192Tfa A01;
    public C2WP A02;
    public Context A03;
    public final C2N8 A04;
    public final C2LC A05;
    public final Object A06 = AbstractC58318PtA.A0b();
    public final Map A07;
    public final Map A08;
    public final Map A09;

    public final void A00() {
        this.A01 = null;
        synchronized (this.A06) {
            Iterator A16 = AbstractC166997dE.A16(this.A08);
            while (A16.hasNext()) {
                ((AnonymousClass195) A16.next()).AGH(null);
            }
        }
        this.A00.A03.A03(this);
    }

    @Override // X.InterfaceC49062Mz
    public final void D7K(C50a workSpec, C48412Ki state) {
        if (workSpec instanceof QAG) {
            C48442Kl.A00();
            C2L1 c2l1 = this.A00;
            C2WP A00 = C2WN.A00(state);
            C2LC c2lc = c2l1.A06;
            C2MX c2mx = c2l1.A03;
            C1113750b c1113750b = new C1113750b(A00);
            C14360o3.A0B(c2mx, 1);
            c2lc.ATa(new RunnableC115055Ia(c2mx, c1113750b, -512, true));
        }
    }

    @Override // X.InterfaceC48932Mm
    public final void DEk(C2WP id, boolean needsReschedule) {
        Map.Entry A1K;
        AnonymousClass195 anonymousClass195;
        synchronized (this.A06) {
            if (((C48412Ki) this.A09.remove(id)) != null && (anonymousClass195 = (AnonymousClass195) this.A08.remove(id)) != null) {
                anonymousClass195.AGH(null);
            }
        }
        Map map = this.A07;
        Q0Z q0z = (Q0Z) map.remove(id);
        if (id.equals(this.A02)) {
            if (map.size() > 0) {
                Iterator A15 = AbstractC166997dE.A15(map);
                do {
                    A1K = AbstractC166987dD.A1K(A15);
                } while (A15.hasNext());
                this.A02 = (C2WP) A1K.getKey();
                if (this.A01 != null) {
                    Q0Z q0z2 = (Q0Z) A1K.getValue();
                    InterfaceC65192Tfa interfaceC65192Tfa = this.A01;
                    int i = q0z2.A01;
                    SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC65192Tfa;
                    systemForegroundService.A01.post(new TQQ(q0z2.A02, systemForegroundService, i, q0z2.A00));
                    SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A01;
                    systemForegroundService2.A01.post(new RunnableC64617TMh(systemForegroundService2, i));
                }
            } else {
                this.A02 = null;
            }
        }
        InterfaceC65192Tfa interfaceC65192Tfa2 = this.A01;
        if (q0z != null && interfaceC65192Tfa2 != null) {
            C48442Kl.A00();
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) interfaceC65192Tfa2;
            systemForegroundService3.A01.post(new RunnableC64617TMh(systemForegroundService3, q0z.A01));
        }
    }

    public C58569Pxl(Context context) {
        this.A03 = context;
        C2L1 A00 = C2L1.A00(context);
        this.A00 = A00;
        this.A05 = A00.A06;
        this.A02 = null;
        this.A07 = AbstractC166987dD.A1I();
        this.A08 = AbstractC166987dD.A1G();
        this.A09 = AbstractC166987dD.A1G();
        this.A04 = new C2N8(A00.A09);
        this.A00.A03.A02(this);
    }

    public final void A01(Intent intent) {
        Handler handler;
        TQQ tqq;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            C48442Kl.A00();
            this.A05.ATa(new RunnableC64616TMg(this, intent.getStringExtra("KEY_WORKSPEC_ID")));
        } else if (!"ACTION_NOTIFY".equals(action)) {
            if ("ACTION_CANCEL_WORK".equals(action)) {
                C48442Kl.A00();
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
                    return;
                }
                C2L1 c2l1 = this.A00;
                c2l1.A06.ATa(new QAI(c2l1, UUID.fromString(stringExtra)));
                return;
            }
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return;
            }
            C48442Kl.A00();
            InterfaceC65192Tfa interfaceC65192Tfa = this.A01;
            if (interfaceC65192Tfa == null) {
                return;
            }
            SystemForegroundService systemForegroundService = (SystemForegroundService) interfaceC65192Tfa;
            systemForegroundService.A03 = true;
            C48442Kl.A00();
            systemForegroundService.stopForeground(true);
            SystemForegroundService.A04 = null;
            systemForegroundService.stopSelf();
            return;
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        C2WP c2wp = new C2WP(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C48442Kl.A00();
        if (notification != null && this.A01 != null) {
            Q0Z q0z = new Q0Z(intExtra, notification, intExtra2);
            Map map = this.A07;
            map.put(c2wp, q0z);
            if (this.A02 == null) {
                this.A02 = c2wp;
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.A01;
                handler = systemForegroundService2.A01;
                tqq = new TQQ(notification, systemForegroundService2, intExtra, intExtra2);
            } else {
                SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.A01;
                systemForegroundService3.A01.post(new RunnableC58687Q0a(notification, systemForegroundService3, intExtra));
                if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
                    return;
                }
                Iterator A15 = AbstractC166997dE.A15(map);
                while (A15.hasNext()) {
                    i |= ((Q0Z) ((Map.Entry) A15.next()).getValue()).A00;
                }
                Q0Z q0z2 = (Q0Z) map.get(this.A02);
                if (q0z2 == null) {
                    return;
                }
                InterfaceC65192Tfa interfaceC65192Tfa2 = this.A01;
                int i2 = q0z2.A01;
                Notification notification2 = q0z2.A02;
                SystemForegroundService systemForegroundService4 = (SystemForegroundService) interfaceC65192Tfa2;
                handler = systemForegroundService4.A01;
                tqq = new TQQ(notification2, systemForegroundService4, i2, i);
            }
            handler.post(tqq);
        }
    }
}
