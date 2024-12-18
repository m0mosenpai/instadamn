package X;

import java.util.HashSet;
import org.json.JSONObject;

/* renamed from: X.1pO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37851pO {
    public static C37851pO A05;
    public boolean A02 = false;
    public final Object A03 = new Object();
    public JSONObject A01 = new JSONObject();
    public JSONObject A00 = new JSONObject();
    public final java.util.Set A04 = new HashSet();

    public C37851pO(final String str, final String str2) {
        C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.1pQ
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(-14);
            }

            /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:50:0x0065
                	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
                	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
                	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
                */
            @Override // java.lang.Runnable
            public final void run() {
                /*
                    r6 = this;
                    X.1pO r4 = X.C37851pO.this
                    java.lang.String r5 = r3
                    java.lang.String r1 = r4
                    r3 = 1
                    boolean r0 = r5.isEmpty()     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    if (r0 == 0) goto L10
                    java.lang.String r5 = "{}"
                L10:
                    org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    r2.<init>(r5)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    if (r0 == 0) goto L1d
                    java.lang.String r1 = "[]"
                L1d:
                    org.json.JSONArray r5 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    r5.<init>(r1)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    java.lang.String r1 = "realtime_event_latencies"
                    boolean r0 = r2.has(r1)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    if (r0 == 0) goto L31
                    org.json.JSONObject r0 = r2.getJSONObject(r1)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    r4.A00 = r0     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                L31:
                    java.lang.String r1 = "non_realtime_event_latencies"
                    boolean r0 = r2.has(r1)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    if (r0 == 0) goto L40
                    org.json.JSONObject r0 = r2.getJSONObject(r1)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    r4.A01 = r0     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                L40:
                    r2 = 0
                L41:
                    int r0 = r5.length()     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    if (r2 >= r0) goto L53
                    java.util.Set r1 = r4.A04     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    java.lang.String r0 = r5.getString(r2)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    r1.add(r0)     // Catch: java.lang.Throwable -> L5d org.json.JSONException -> L68
                    int r2 = r2 + 1
                    goto L41
                L53:
                    java.lang.Object r0 = r4.A03
                    monitor-enter(r0)
                    r4.A02 = r3     // Catch: java.lang.Throwable -> L5a
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                    return
                L5a:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L5a
                    throw r1
                L5d:
                    r1 = move-exception
                    java.lang.Object r0 = r4.A03
                    monitor-enter(r0)
                    r4.A02 = r3     // Catch: java.lang.Throwable -> L65
                L63:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L65
                    goto L67
                L65:
                    r1 = move-exception
                    goto L63
                L67:
                    throw r1
                L68:
                    java.lang.Object r0 = r4.A03
                    monitor-enter(r0)
                    r4.A02 = r3     // Catch: java.lang.Throwable -> L6f
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
                    return
                L6f:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C37871pQ.run():void");
            }
        });
    }
}
