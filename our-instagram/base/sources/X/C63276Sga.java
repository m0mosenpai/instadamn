package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.Sga, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C63276Sga {
    public final C4N8 A02;
    public final C4N2 A04;
    public static final long A06 = TimeUnit.MINUTES.toMillis(5);
    public static final long A05 = TimeUnit.HOURS.toMillis(24);
    public static final ExecutorC64806TUu A07 = ExecutorC64806TUu.A00();
    public final LinkedHashSet A03 = AbstractC31171DnF.A0l();
    public AtomicLong A00 = AbstractC58318PtA.A15(A05);
    public AtomicLong A01 = AbstractC58318PtA.A15(A06);

    public static AbstractC64515THi A00(C63276Sga c63276Sga, String str) {
        String str2;
        String str3;
        AbstractC64515THi abstractC64515THi;
        AbstractC64515THi abstractC64515THi2;
        long j;
        String str4 = "";
        AbstractC64515THi abstractC64515THi3 = C60546R6j.A00;
        try {
            String string = c63276Sga.A02.getString(str, "");
            if (!TextUtils.isEmpty(string)) {
                SZH A00 = SZH.A00(string);
                if (A00 != null) {
                    j = System.currentTimeMillis() - A00.A02;
                    abstractC64515THi = A00.A05;
                    abstractC64515THi3 = A00.A04;
                    str2 = A00.A0A;
                    abstractC64515THi2 = A00.A06;
                    str3 = A00.A09;
                    Intent intent = A00.A03;
                    if (intent.getPackage() != null) {
                        str4 = intent.getPackage();
                    }
                } else {
                    str2 = "";
                    str3 = "";
                    abstractC64515THi = abstractC64515THi3;
                    abstractC64515THi2 = abstractC64515THi3;
                    j = -1;
                }
                return new C60547R6k(new SJ0(abstractC64515THi, abstractC64515THi3, abstractC64515THi2, str2, str3, str4, j));
            }
        } catch (ClassCastException e) {
            C0K8.A0L("NotificationDeliveryStorePreferences", "fail to read notif storeKey %s", e, str);
        }
        return abstractC64515THi3;
    }

    public C63276Sga(Context context, C74103Uo c74103Uo, C4N2 c4n2, String str) {
        C4N8 A00 = c74103Uo.A00(context, AnonymousClass001.A0u("rti.mqtt.", "fbns_notification_store", "_", str));
        this.A02 = A00;
        this.A04 = c4n2;
        boolean z = false;
        if (A00.getBoolean("key_storage_size_limited_flag", false)) {
            Map all = A00.getAll();
            ArrayList A1E = AbstractC166987dD.A1E();
            C91M ARA = A00.ARA();
            Iterator A15 = AbstractC166997dE.A15(all);
            while (A15.hasNext()) {
                Map.Entry A1K = AbstractC166987dD.A1K(A15);
                if (!AbstractC31172DnG.A17(A1K).equals("key_next_min_retry_ts") && !AbstractC31172DnG.A17(A1K).equals("key_storage_size_limited_flag")) {
                    SZH A002 = SZH.A00(A1K.getValue());
                    if (A002 == null) {
                        ARA.EEh(AbstractC31172DnG.A17(A1K));
                        z = true;
                    } else {
                        A1E.add(new AbstractMap.SimpleEntry(A1K.getKey(), Long.valueOf(A002.A02)));
                    }
                }
            }
            if (z) {
                ARA.AIY();
            }
            Collections.sort(A1E, new TSE(4));
            Iterator it = A1E.iterator();
            while (it.hasNext()) {
                this.A03.add(AbstractC166987dD.A1K(it).getKey());
            }
            return;
        }
        C91M ARA2 = A00.ARA();
        ARA2.AHU();
        ARA2.AIY();
        C91M ARA3 = A00.ARA();
        ARA3.E75("key_storage_size_limited_flag", true);
        ARA3.AIY();
    }

    public static void A01(C91M c91m) {
        c91m.AIY();
    }
}
