package X;

import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class SZH {
    public long A00;
    public AbstractC64515THi A01 = C60546R6j.A00;
    public final long A02;
    public final Intent A03;
    public final AbstractC64515THi A04;
    public final AbstractC64515THi A05;
    public final AbstractC64515THi A06;
    public final AbstractC64515THi A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public static SZH A00(Object obj) {
        AbstractC64515THi abstractC64515THi;
        AbstractC64515THi abstractC64515THi2;
        AbstractC64515THi abstractC64515THi3;
        AbstractC64515THi abstractC64515THi4;
        AbstractC64515THi abstractC64515THi5;
        try {
            String str = (String) obj;
            if (str.length() > 50000) {
                return null;
            }
            JSONObject A17 = AbstractC58318PtA.A17(str);
            Intent parseUri = Intent.parseUri(A17.getString("key_intent"), 0);
            String string = A17.getString("key_notifid");
            long j = A17.getLong("key_timestamp_received");
            long j2 = A17.getLong("key_timestamp_last_retried");
            if (A17.has("key_log_event")) {
                abstractC64515THi = C60547R6k.A00(Boolean.valueOf(A17.getBoolean("key_log_event")));
            } else {
                abstractC64515THi = C60546R6j.A00;
            }
            if (A17.has("key_queue_time_ms")) {
                abstractC64515THi2 = C60547R6k.A00(Long.valueOf(A17.getLong("key_queue_time_ms")));
            } else {
                abstractC64515THi2 = C60546R6j.A00;
            }
            String optString = A17.optString("key_job_id");
            String optString2 = A17.optString("key_source");
            if (A17.has("key_mqtt_process_time_ms")) {
                abstractC64515THi3 = C60547R6k.A00(Long.valueOf(A17.getLong("key_mqtt_process_time_ms")));
            } else {
                abstractC64515THi3 = C60546R6j.A00;
            }
            if (A17.has("key_ttl_s")) {
                abstractC64515THi4 = C60547R6k.A00(Long.valueOf(A17.getLong("key_ttl_s")));
            } else {
                abstractC64515THi4 = C60546R6j.A00;
            }
            if (A17.has("key_is_delivered")) {
                abstractC64515THi5 = C60547R6k.A00(Boolean.valueOf(A17.getBoolean("key_is_delivered")));
            } else {
                abstractC64515THi5 = C60546R6j.A00;
            }
            SZH szh = new SZH(parseUri, abstractC64515THi, abstractC64515THi2, abstractC64515THi3, abstractC64515THi4, string, optString, optString2, j, j2);
            if (!(abstractC64515THi5 instanceof C60546R6j) && AbstractC166987dD.A1a(abstractC64515THi5.A01())) {
                szh.A01 = C60547R6k.A00(AbstractC166997dE.A0b());
                return szh;
            }
            return szh;
        } catch (Exception unused) {
            return null;
        }
    }

    public SZH(Intent intent, AbstractC64515THi abstractC64515THi, AbstractC64515THi abstractC64515THi2, AbstractC64515THi abstractC64515THi3, AbstractC64515THi abstractC64515THi4, String str, String str2, String str3, long j, long j2) {
        this.A03 = intent;
        this.A09 = str;
        this.A05 = abstractC64515THi;
        this.A04 = abstractC64515THi2;
        this.A08 = str2;
        this.A0A = str3;
        this.A06 = abstractC64515THi3;
        this.A07 = abstractC64515THi4;
        this.A02 = j;
        this.A00 = j2;
    }

    public final String A01() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        try {
            JSONObject A0q = AbstractC31171DnF.A0q();
            A0q.putOpt("key_intent", this.A03.toUri(0));
            A0q.putOpt("key_notifid", this.A09);
            A0q.putOpt("key_timestamp_received", Long.valueOf(this.A02));
            A0q.putOpt("key_timestamp_last_retried", Long.valueOf(this.A00));
            AbstractC64515THi abstractC64515THi = this.A07;
            if (abstractC64515THi instanceof C60546R6j) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                A0q.putOpt("key_ttl_s", abstractC64515THi.A01());
            }
            AbstractC64515THi abstractC64515THi2 = this.A05;
            if (abstractC64515THi2 instanceof C60546R6j) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                A0q.putOpt("key_log_event", abstractC64515THi2.A01());
            }
            A0q.putOpt("key_job_id", this.A08);
            A0q.putOpt("key_source", this.A0A);
            AbstractC64515THi abstractC64515THi3 = this.A04;
            if (abstractC64515THi3 instanceof C60546R6j) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                A0q.putOpt("key_queue_time_ms", abstractC64515THi3.A01());
            }
            AbstractC64515THi abstractC64515THi4 = this.A06;
            if (abstractC64515THi4 instanceof C60546R6j) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                A0q.putOpt("key_mqtt_process_time_ms", abstractC64515THi4.A01());
            }
            AbstractC64515THi abstractC64515THi5 = this.A01;
            if (abstractC64515THi5 instanceof C60546R6j) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                A0q.putOpt("key_is_delivered", abstractC64515THi5.A01());
            }
            String obj = A0q.toString();
            int length = obj.length();
            if (length <= 50000) {
                return obj;
            }
            throw AbstractC31175DnJ.A0U("Payload size limit exceeded with ", length);
        } catch (JSONException e) {
            throw new IllegalStateException(e);
        }
    }
}
