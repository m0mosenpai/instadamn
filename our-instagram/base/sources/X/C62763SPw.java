package X;

import com.facebook.proxygen.TraceFieldType;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.SPw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62763SPw {
    public final C4N8 A01;
    public final TreeSet A02 = new TreeSet(new TSN(this, 3));
    public List A00 = AbstractC166987dD.A1E();

    public final synchronized C63015Saf A00(C63015Saf c63015Saf) {
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            C63015Saf c63015Saf2 = (C63015Saf) it.next();
            if (c63015Saf2.equals(c63015Saf)) {
                return c63015Saf2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x009a, code lost:
    
        if (r4.A00().isEmpty() != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.TreeSet A01() {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.TreeSet r3 = r8.A02     // Catch: java.lang.Throwable -> Laf
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Throwable -> Laf
            if (r0 == 0) goto Lad
            X.4N8 r2 = r8.A01     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto Lad
            java.lang.String r1 = "/settings_mqtt_address"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)     // Catch: java.lang.Throwable -> Laf
            org.json.JSONObject r1 = X.AbstractC58318PtA.A17(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.lang.String r0 = "address_entries"
            org.json.JSONArray r6 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r6 == 0) goto Lad
            int r0 = r6.length()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r0 <= 0) goto Lad
            r5 = 0
        L28:
            int r0 = r6.length()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r5 >= r0) goto Lad
            java.lang.String r1 = r6.getString(r5)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r0 == 0) goto L3a
            r4 = 0
            goto L84
        L3a:
            org.json.JSONObject r1 = X.AbstractC58318PtA.A17(r1)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            X.Saf r4 = new X.Saf     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r4.<init>()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.lang.String r0 = "host_name"
            java.lang.String r0 = r1.optString(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r4.A02 = r0     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.lang.String r0 = "priority"
            int r0 = r1.optInt(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r4.A01 = r0     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.lang.String r0 = "fail_count"
            int r0 = r1.optInt(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r4.A00 = r0     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.lang.String r0 = "address_list_data"
            org.json.JSONArray r7 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r7 == 0) goto L84
            int r0 = r7.length()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.util.ArrayList r2 = X.AbstractC25225BEi.A17(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r1 = 0
        L6c:
            int r0 = r7.length()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r1 >= r0) goto L82
            boolean r0 = r7.isNull(r1)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r0 != 0) goto L7f
            java.lang.String r0 = r7.getString(r1)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r2.add(r0)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
        L7f:
            int r1 = r1 + 1
            goto L6c
        L82:
            r4.A04 = r2     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
        L84:
            r4.getClass()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            java.util.List r0 = r4.A04     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r0 == 0) goto L9c
            boolean r0 = r0.isEmpty()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            if (r0 != 0) goto L9c
            java.util.List r0 = r4.A00()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            boolean r1 = r0.isEmpty()     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
            r0 = 1
            if (r1 == 0) goto L9d
        L9c:
            r0 = 0
        L9d:
            if (r0 == 0) goto La2
            r8.A03(r4)     // Catch: org.json.JSONException -> La5 java.lang.Throwable -> Laf
        La2:
            int r5 = r5 + 1
            goto L28
        La5:
            r2 = move-exception
            java.lang.String r1 = "AddressEntries"
            java.lang.String r0 = "Cannot create JSONObject from rawJson"
            X.C0K8.A0G(r1, r0, r2)     // Catch: java.lang.Throwable -> Laf
        Lad:
            monitor-exit(r8)
            return r3
        Laf:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62763SPw.A01():java.util.TreeSet");
    }

    public final synchronized void A02() {
        List<C63015Saf> list = this.A00;
        list.clear();
        Iterator it = A01().iterator();
        while (it.hasNext()) {
            list.add((C63015Saf) it.next());
        }
        C4N8 c4n8 = this.A01;
        if (c4n8 != null) {
            try {
                C91M ARA = c4n8.ARA();
                JSONObject A0q = AbstractC31171DnF.A0q();
                JSONArray A0p = AbstractC31171DnF.A0p();
                for (C63015Saf c63015Saf : list) {
                    JSONObject A0q2 = AbstractC31171DnF.A0q();
                    A0q2.putOpt(TraceFieldType.HostName, c63015Saf.A02);
                    A0q2.put("priority", c63015Saf.A01);
                    A0q2.put("fail_count", c63015Saf.A00);
                    if (c63015Saf.A04 != null) {
                        JSONArray A0p2 = AbstractC31171DnF.A0p();
                        Iterator it2 = c63015Saf.A04.iterator();
                        while (it2.hasNext()) {
                            A0p2.put(it2.next());
                        }
                        A0q2.put("address_list_data", A0p2);
                    }
                    A0p.put(A0q2.toString());
                }
                A0q.put("address_entries", A0p);
                ARA.E7I("/settings_mqtt_address", A0q.toString());
                ARA.AIb("AddressEntries", "Failed to save addressEntries");
            } catch (JSONException e) {
                C0K8.A0G("AddressEntries", "Could not serialize addressEntries", e);
            }
        }
    }

    public final synchronized void A03(C63015Saf c63015Saf) {
        TreeSet treeSet = this.A02;
        if (treeSet.size() >= 10) {
            treeSet.pollLast();
        }
        treeSet.add(c63015Saf);
    }

    public final synchronized void A04(C63015Saf c63015Saf, C63015Saf c63015Saf2) {
        this.A02.remove(c63015Saf);
        A03(c63015Saf2);
    }

    public C62763SPw(C4N8 c4n8) {
        this.A01 = c4n8;
    }
}
