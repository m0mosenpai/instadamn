package X;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.SfG, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63211SfG {
    public BroadcastReceiver A00;
    public Map A01;
    public Map A02;
    public final Context A03;
    public final C3VA A04;
    public final C4N2 A05;
    public final FbnsServiceDelegate A06;
    public final Object A07;
    public final String A08;

    public C63211SfG(C3VA c3va, C4N2 c4n2, FbnsServiceDelegate fbnsServiceDelegate, Map map) {
        Context A0O = AbstractC166987dD.A0O(((AbstractC19560xi) fbnsServiceDelegate).A01);
        String A00 = S14.A00(C05F.A01);
        this.A02 = AbstractC166987dD.A1G();
        this.A07 = AbstractC58318PtA.A0b();
        this.A03 = A0O;
        this.A04 = c3va;
        this.A05 = c4n2;
        this.A08 = A00;
        this.A01 = map;
        this.A06 = fbnsServiceDelegate;
    }

    public final C63276Sga A03(String str) {
        C63276Sga c63276Sga;
        synchronized (this.A07) {
            C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
            Context context = this.A03;
            C74103Uo A02 = c74123Uq.A02();
            if (TextUtils.isEmpty(str) || !this.A01.containsKey(str)) {
                str = GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT;
            }
            Map map = this.A02;
            if (map.containsKey(str)) {
                c63276Sga = (C63276Sga) map.get(str);
            } else {
                ExecutorC64806TUu executorC64806TUu = C63276Sga.A07;
                String A0T = AnonymousClass001.A0T(this.A08, "FBNS_LITE", '_');
                if (!TextUtils.isEmpty(str)) {
                    Map map2 = this.A01;
                    if (map2.containsKey(str)) {
                        map2.get(str);
                        c63276Sga = new C63276Sga(context, A02, this.A05, A0T);
                        map.put(str, c63276Sga);
                    }
                }
                TextUtils.isEmpty(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT);
                c63276Sga = new C63276Sga(context, A02, this.A05, A0T);
                map.put(str, c63276Sga);
            }
        }
        return c63276Sga;
    }

    public final void A04(C62485SDm c62485SDm, String str, String str2) {
        FbnsServiceDelegate fbnsServiceDelegate = this.A06;
        String str3 = str;
        if (str2 != null) {
            str3 = AnonymousClass001.A0T(str, str2, '_');
        }
        AbstractC64515THi A0U = fbnsServiceDelegate.A0U(str3, str2);
        if (A0U instanceof C60546R6j) {
            C63276Sga A03 = A03(str2);
            synchronized (A03) {
                A0U = C63276Sga.A00(A03, str);
                A03.A03.remove(str);
                C91M ARA = A03.A02.ARA();
                ARA.EEh(str);
                ARA.AIY();
            }
        }
        if (!(A0U instanceof C60546R6j)) {
            fbnsServiceDelegate.A0Y(c62485SDm, (SJ0) A0U.A01(), str, str2);
        }
    }

    public static C62485SDm A00(Intent intent, AbstractC64515THi abstractC64515THi, C63211SfG c63211SfG, String str) {
        Integer num;
        String str2 = intent.getPackage();
        if (str2 == null) {
            str2 = "";
        }
        if (!"com.facebook.rti.fbns.intent.RECEIVE".equals(intent.getAction()) && !"com.facebook.rti.fbns.intent.RECEIVE_RTC".equals(intent.getAction()) && !"com.facebook.rti.fbns.intent.RECEIVE_VR".equals(intent.getAction())) {
            return new C62485SDm(C60547R6k.A00(AnonymousClass001.A0R("Invalid action ", intent.getAction())), C05F.A00);
        }
        FbnsServiceDelegate fbnsServiceDelegate = c63211SfG.A06;
        FbnsServiceDelegate fbnsServiceDelegate2 = FbnsServiceDelegate.A0E;
        C3VA c3va = c63211SfG.A04;
        c3va.A02(intent);
        intent.setPackage(str2);
        if (!((C74123Uq) C3UY.A00).A01(intent, c3va).Cfa()) {
            num = C05F.A15;
        } else if (c3va.A01.A08(c3va.A00, intent)) {
            num = C05F.A0Y;
        } else {
            num = C05F.A0j;
        }
        C62485SDm c62485SDm = new C62485SDm(C60546R6j.A00, num);
        if (AbstractC62802SRw.A01(c62485SDm.A01)) {
            return c62485SDm;
        }
        fbnsServiceDelegate.A0Z(abstractC64515THi, str2, "secure broadcast failed", null, "Error: secure-broadcast failed", str);
        return c62485SDm;
    }

    public static void A01(Context context, AbstractC64515THi abstractC64515THi, AbstractC64515THi abstractC64515THi2, String str, String str2, boolean z) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            Intent A0E = AbstractC58318PtA.A0E("com.facebook.rti.intent.ACTION_NOTIFICATION_ACK");
            A0E.setPackage(str);
            A0E.putExtra("extra_notification_id", str2);
            A0E.putExtra("extra_processor_completed", z);
            if (!(abstractC64515THi instanceof C60546R6j)) {
                A0E.putExtra("processor_failed_reason", (String) abstractC64515THi.A01());
            }
            if (!(abstractC64515THi2 instanceof C60546R6j)) {
                A0E.putExtra("job_id", (String) abstractC64515THi2.A01());
            }
            C3VA c3va = new C3VA(context, null);
            c3va.A02(A0E);
            if (str != null) {
                A0E.setPackage(str);
                if (((C74123Uq) C3UY.A00).A01(A0E, c3va).Cfa()) {
                    c3va.A01.A08(c3va.A00, A0E);
                    return;
                }
                return;
            }
            C74123Uq c74123Uq = (C74123Uq) C3UY.A00;
            Iterator it = AbstractC166987dD.A1F(c74123Uq.A08).iterator();
            while (it.hasNext()) {
                A0E.setPackage(AbstractC166987dD.A1B(it));
                if (c74123Uq.A01(A0E, c3va).Cfa()) {
                    c3va.A01.A08(c3va.A00, A0E);
                }
            }
        }
    }

    public final int A02() {
        ArrayList A1E = AbstractC166987dD.A1E();
        ArrayList A1E2 = AbstractC166987dD.A1E();
        synchronized (this.A07) {
            Iterator A16 = AbstractC166997dE.A16(this.A02);
            while (A16.hasNext()) {
                C63276Sga c63276Sga = (C63276Sga) A16.next();
                synchronized (c63276Sga) {
                    A1E.clear();
                    A1E2.clear();
                    C4N8 c4n8 = c63276Sga.A02;
                    Map all = c4n8.getAll();
                    C91M ARA = c4n8.ARA();
                    if (System.currentTimeMillis() >= c4n8.getLong("key_next_min_retry_ts", 0L)) {
                        boolean z = false;
                        Long l = null;
                        Iterator A15 = AbstractC166997dE.A15(all);
                        while (A15.hasNext()) {
                            Map.Entry A1K = AbstractC166987dD.A1K(A15);
                            if (!AbstractC31172DnG.A17(A1K).equals("key_next_min_retry_ts") && !AbstractC31172DnG.A17(A1K).equals("key_storage_size_limited_flag")) {
                                SZH A00 = SZH.A00(A1K.getValue());
                                if (A00 != null) {
                                    long j = A00.A02;
                                    if (j + c63276Sga.A00.get() >= System.currentTimeMillis() && j <= System.currentTimeMillis()) {
                                        long j2 = A00.A00;
                                        AtomicLong atomicLong = c63276Sga.A01;
                                        long j3 = j2 + atomicLong.get();
                                        if (j3 <= System.currentTimeMillis()) {
                                            AbstractC64515THi abstractC64515THi = A00.A01;
                                            if ((abstractC64515THi instanceof C60546R6j) || !AbstractC166987dD.A1a(abstractC64515THi.A01())) {
                                                String str = A00.A09;
                                                long currentTimeMillis = System.currentTimeMillis();
                                                A00.A00 = currentTimeMillis;
                                                j3 = currentTimeMillis + atomicLong.get();
                                                A1E.add(A00);
                                                A00.A03.getPackage();
                                                String A01 = A00.A01();
                                                if (!TextUtils.isEmpty(A01)) {
                                                    ARA.E7I(str, A01);
                                                    z = true;
                                                }
                                            }
                                        }
                                        if (l == null) {
                                            l = Long.valueOf(j3);
                                        } else {
                                            l = Long.valueOf(Math.min(l.longValue(), j3));
                                        }
                                    } else {
                                        String A17 = AbstractC31172DnG.A17(A1K);
                                        String str2 = A00.A09;
                                        A00.A03.getPackage();
                                        if (A17.equals(str2)) {
                                            A1E2.add(A00);
                                        }
                                    }
                                }
                                c63276Sga.A03.remove(A1K.getKey());
                                ARA.EEh(AbstractC31172DnG.A17(A1K));
                                z = true;
                            }
                        }
                        if (l == null) {
                            if (z) {
                            }
                        } else {
                            ARA.E7E("key_next_min_retry_ts", l.longValue());
                        }
                        ARA.AIY();
                    }
                }
            }
        }
        Iterator it = A1E2.iterator();
        while (it.hasNext()) {
            SZH szh = (SZH) it.next();
            if (szh != null) {
                String str3 = szh.A09;
                Intent intent = szh.A03;
                if (intent != null) {
                    A04(new C62485SDm(C60546R6j.A00, C05F.A01), str3, intent.getPackage());
                }
            }
        }
        int i = 0;
        Iterator it2 = A1E.iterator();
        while (it2.hasNext()) {
            SZH szh2 = (SZH) it2.next();
            String str4 = szh2.A09;
            Intent intent2 = szh2.A03;
            AbstractC64515THi abstractC64515THi2 = szh2.A05;
            String str5 = szh2.A0A;
            FbnsServiceDelegate fbnsServiceDelegate = this.A06;
            String str6 = intent2.getPackage();
            fbnsServiceDelegate.A03.Chw(AnonymousClass001.A0u("Redeliver Notif: notifId = ", str4, "; target = ", str6));
            HashMap A1G = AbstractC166987dD.A1G();
            if (!(abstractC64515THi2 instanceof C60546R6j)) {
                A1G.put("l", String.valueOf(abstractC64515THi2.A01()));
            }
            A1G.put("src", str5);
            FbnsServiceDelegate.A03(fbnsServiceDelegate, "redeliver", str4, str6, null, A1G, 0L);
            C62485SDm A002 = A00(intent2, abstractC64515THi2, this, str5);
            Integer num = A002.A01;
            if (AbstractC62802SRw.A00(num)) {
                A04(A002, str4, intent2.getPackage());
            } else if (!AbstractC62802SRw.A01(num)) {
                String str7 = intent2.getPackage();
                SNI sni = fbnsServiceDelegate.A08;
                if (sni != null) {
                    sni.A01(AbstractC111324zv.A00(1133), new String[]{"intermittent_fail", str7}, 1L);
                }
            }
            if (AbstractC62802SRw.A01(num)) {
                i++;
            }
        }
        return i;
    }
}
