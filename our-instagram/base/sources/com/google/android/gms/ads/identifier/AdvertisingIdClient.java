package com.google.android.gms.ads.identifier;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.C1341263x;
import X.C3U5;
import X.MSY;
import X.ServiceConnectionC63441SkK;
import X.TY5;
import android.content.Context;
import com.google.android.gms.internal.ads_identifier.zze;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* loaded from: classes10.dex */
public final class AdvertisingIdClient {
    public ServiceConnectionC63441SkK A00;
    public zze A01;
    public boolean A02;
    public final Context A03;
    public final Object A04 = AbstractC58318PtA.A0b();
    public final boolean A05;

    /* loaded from: classes10.dex */
    public final class Info {
        public final String A00;
        public final boolean A01;

        public Info(String str, boolean z) {
            this.A00 = str;
            this.A01 = z;
        }

        public final String toString() {
            String str = this.A00;
            boolean z = this.A01;
            StringBuilder A0q = AbstractC58318PtA.A0q(AbstractC58319PtB.A05(str) + 7);
            A0q.append("{");
            A0q.append(str);
            A0q.append("}");
            A0q.append(z);
            return A0q.toString();
        }
    }

    public final void A01() {
        C3U5.A05("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            Context context = this.A03;
            if (context != null && this.A00 != null) {
                try {
                    if (this.A02) {
                        C1341263x.A00().A02(context, this.A00);
                    }
                } catch (Throwable unused) {
                }
                this.A02 = false;
                this.A01 = null;
                this.A00 = null;
            }
        }
    }

    public final void finalize() {
        A01();
    }

    public AdvertisingIdClient(Context context, boolean z, boolean z2) {
        Context applicationContext;
        C3U5.A02(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.A03 = context;
        this.A02 = false;
        this.A05 = z2;
    }

    public static final void A00(Info info, String str, Throwable th, float f, long j, boolean z) {
        if (Math.random() <= f) {
            HashMap A1G = AbstractC166987dD.A1G();
            String str2 = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            Object obj = "0";
            if (z) {
                obj = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            }
            A1G.put("app_context", obj);
            if (info != null) {
                if (!info.A01) {
                    str2 = "0";
                }
                A1G.put("limit_ad_tracking", str2);
                String str3 = info.A00;
                if (str3 != null) {
                    A1G.put("ad_id_size", Integer.toString(str3.length()));
                }
            }
            if (th != null) {
                A1G.put("error", MSY.A0h(th));
            }
            if (str != null && !str.isEmpty()) {
                A1G.put("experiment_id", str);
            }
            A1G.put("tag", "AdvertisingIdClient");
            A1G.put("time_spent", Long.toString(j));
            new TY5(A1G).start();
        }
    }
}
