package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.1M4, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1M4 implements C1M6 {
    public final UserSession A00;
    public final C1M1 A01;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206839Do(this, 13));
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(new C206839Do(this, 12));

    @Override // X.C1M6
    public final void EIA(C9BW c9bw, String str) {
        C14360o3.A0B(str, 1);
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_dispatched"), 327);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new HJS(c25531Mh, c9bw, str));
        }
    }

    @Override // X.C1M6
    public final void EIB(C9BW c9bw, Integer num) {
        C14360o3.A0B(c9bw, 0);
        C14360o3.A0B(num, 1);
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_not_sent"), 328);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new HJQ(c25531Mh, c9bw));
        }
    }

    @Override // X.C1M6
    public final void EIC(int i, Integer num) {
        C14360o3.A0B(num, 1);
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signals_not_sent"), 332);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new HJR(c25531Mh, i));
        }
    }

    @Override // X.C1M6
    public final void EID(C9BW c9bw, String str) {
        C14360o3.A0B(str, 0);
        C14360o3.A0B(c9bw, 1);
        if (C18U.A06(C06090Tz.A05, this.A00, 36317659339494861L)) {
            C18920wW c18920wW = (C18920wW) this.A03.getValue();
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_read_from_cache"), 329);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C14120nc.A00().ATO(new HJT(c25531Mh, c9bw, str));
            }
        }
    }

    @Override // X.C1M6
    public final void EIE(final C9BW c9bw, final String str) {
        C14360o3.A0B(c9bw, 0);
        if (C18U.A06(C06090Tz.A05, this.A00, 36325746762855743L)) {
            C18920wW c18920wW = (C18920wW) this.A03.getValue();
            final C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_send_in_payload"), 330);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.5Qg
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2015553371, 3, false, false);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        long j;
                        long currentTimeMillis = System.currentTimeMillis();
                        C25531Mh c25531Mh2 = C25531Mh.this;
                        C9BW c9bw2 = c9bw;
                        C9C7 c9c7 = (C9C7) c9bw2.A01;
                        c25531Mh2.A0R("signal_id", c9c7.A06);
                        c25531Mh2.A0R("signal_type", c9c7.A04.toString());
                        AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw2.A00;
                        c25531Mh2.A0R("item_id", abstractC82583mM.A04());
                        c25531Mh2.A0R("item_type", c9c7.A01.toString());
                        c25531Mh2.A0R("signal_surface", c9c7.A05.toString());
                        c25531Mh2.A0R("container_module", abstractC82583mM.A02());
                        c25531Mh2.A0P("timestamp_in_ms", Double.valueOf(currentTimeMillis));
                        c25531Mh2.A0Q("latency_between_collection_and_send_in_ms", Long.valueOf(currentTimeMillis - abstractC82583mM.A00()));
                        if (abstractC82583mM instanceof C82573mL) {
                            j = ((C82573mL) abstractC82583mM).A0A;
                        } else {
                            j = -1;
                        }
                        c25531Mh2.A0Q("media_time_spent_in_ms", Long.valueOf(j));
                        C1M4 c1m4 = this;
                        c25531Mh2.A0R("pigeon_session_id", ((InterfaceC11360iu) c1m4.A02.getValue()).BdA());
                        c25531Mh2.A0R("payload_api", str);
                        c25531Mh2.A0u(c1m4.A01.getSessionId());
                        c25531Mh2.Cht();
                    }
                });
            }
        }
    }

    @Override // X.C1M6
    public final void EIF(C9BW c9bw, String str) {
        C14360o3.A0B(str, 0);
        if (C18U.A06(C06090Tz.A05, this.A00, 36317659339560398L)) {
            C18920wW c18920wW = (C18920wW) this.A03.getValue();
            C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_write_to_cache"), 331);
            if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
                C14120nc.A00().ATO(new HJU(c25531Mh, c9bw, str));
            }
        }
    }

    @Override // X.C1M6
    public final void EIH(final C85693ry c85693ry, final String str, final String str2, final List list, final Map map, final double d) {
        C14360o3.A0B(str, 0);
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        final C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signals_send_in_payload"), 334);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.9Ig
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2015553371, 3, false, false);
                }

                /* JADX WARN: Removed duplicated region for block: B:12:0x005d A[SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r10 = this;
                        java.util.Map r4 = r10
                        java.util.List r0 = r9
                        java.util.LinkedHashMap r6 = X.AbstractC166987dD.A1I()
                        java.util.Iterator r9 = r0.iterator()
                        r3 = 0
                        r5 = 0
                    Le:
                        boolean r0 = r9.hasNext()
                        if (r0 == 0) goto L61
                        java.lang.Object r8 = r9.next()
                        java.lang.Object r2 = r4.get(r8)
                        java.lang.String r2 = (java.lang.String) r2
                        if (r2 == 0) goto L41
                        org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> L41
                        r0.<init>(r2)     // Catch: org.json.JSONException -> L41
                        int r7 = r0.length()     // Catch: org.json.JSONException -> L41
                        long r0 = (long) r7     // Catch: org.json.JSONException -> L41
                        java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch: org.json.JSONException -> L41
                        X.0e4 r0 = new X.0e4     // Catch: org.json.JSONException -> L41
                        r0.<init>(r8, r1)     // Catch: org.json.JSONException -> L41
                        java.util.Map r1 = X.AbstractC16850sd.A0M(r0)     // Catch: org.json.JSONException -> L41
                        int r0 = r2.length()     // Catch: org.json.JSONException -> L41
                        X.9BQ r2 = new X.9BQ     // Catch: org.json.JSONException -> L41
                        r2.<init>(r7, r0, r1)     // Catch: org.json.JSONException -> L41
                        goto L4b
                    L41:
                        X.0sk r1 = X.AbstractC06930Yk.A0E()
                        r0 = 0
                        X.9BQ r2 = new X.9BQ
                        r2.<init>(r0, r0, r1)
                    L4b:
                        int r0 = r2.A01
                        int r3 = r3 + r0
                        java.lang.Object r1 = r2.A03
                        java.util.Map r1 = (java.util.Map) r1
                        boolean r0 = r1.isEmpty()
                        r0 = r0 ^ 1
                        if (r0 == 0) goto L5d
                        r6.putAll(r1)
                    L5d:
                        int r0 = r2.A02
                        int r5 = r5 + r0
                        goto Le
                    L61:
                        long r3 = (long) r3
                        r1 = 0
                        int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                        if (r0 <= 0) goto Lab
                        X.1Mh r2 = r4
                        java.lang.String r1 = r7
                        java.lang.String r0 = "container_module"
                        r2.A0R(r0, r1)
                        java.lang.Long r1 = java.lang.Long.valueOf(r3)
                        java.lang.String r0 = "total_signals_count"
                        r2.A0Q(r0, r1)
                        java.lang.String r1 = "signal_count_map"
                        X.0Ai r0 = r2.A00
                        r0.A9M(r1, r6)
                        java.lang.String r1 = r8
                        java.lang.String r0 = "payload_api"
                        r2.A0R(r0, r1)
                        long r0 = (long) r5
                        java.lang.Long r1 = java.lang.Long.valueOf(r0)
                        java.lang.String r0 = "payload_size_in_bytes"
                        r2.A0Q(r0, r1)
                        double r0 = r11
                        java.lang.Double r1 = java.lang.Double.valueOf(r0)
                        java.lang.String r0 = "payload_prepared_time_in_ms"
                        r2.A0P(r0, r1)
                        X.1M4 r0 = r6
                        X.1M1 r0 = r0.A01
                        java.lang.String r0 = r0.getSessionId()
                        r2.A0u(r0)
                        r2.Cht()
                    Lab:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C207999Ig.run():void");
                }
            });
        }
    }

    @Override // X.C1M6
    public final void EI9(final C9BW c9bw, final boolean z) {
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        final C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signal_collected"), 326);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.3mP
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2015553371, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    long j;
                    C25531Mh c25531Mh2 = C25531Mh.this;
                    C9BW c9bw2 = c9bw;
                    C9C7 c9c7 = (C9C7) c9bw2.A01;
                    c25531Mh2.A0R("signal_id", c9c7.A06);
                    c25531Mh2.A0R("signal_type", c9c7.A04.toString());
                    AbstractC82583mM abstractC82583mM = (AbstractC82583mM) c9bw2.A00;
                    c25531Mh2.A0R("item_id", abstractC82583mM.A04());
                    c25531Mh2.A0R("item_type", c9c7.A01.toString());
                    c25531Mh2.A0R("signal_surface", c9c7.A05.toString());
                    c25531Mh2.A0R("container_module", abstractC82583mM.A02());
                    c25531Mh2.A0P("timestamp_in_ms", Double.valueOf(System.currentTimeMillis()));
                    if (abstractC82583mM instanceof C82573mL) {
                        j = ((C82573mL) abstractC82583mM).A0A;
                    } else {
                        j = -1;
                    }
                    c25531Mh2.A0Q("media_time_spent_in_ms", Long.valueOf(j));
                    c25531Mh2.A0O("seen_state_exists", Boolean.valueOf(z));
                    c25531Mh2.A0R("pigeon_session_id", ((InterfaceC11360iu) this.A02.getValue()).BdA());
                    c25531Mh2.Cht();
                }
            });
        }
    }

    @Override // X.C1M6
    public final void EIG(final int i, final int i2, final double d) {
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        final C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signals_read_from_cache"), 333);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new AbstractRunnableC14200nk() { // from class: X.1Mi
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2015553371, 3, false, false);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C25531Mh c25531Mh2 = C25531Mh.this;
                    c25531Mh2.A0Q("number_of_signals_to_read", Long.valueOf(i));
                    c25531Mh2.A0Q("number_of_signals_read_succes", Long.valueOf(i2));
                    c25531Mh2.A0P("time_spent_in_ms", Double.valueOf(d));
                    c25531Mh2.Cht();
                }
            });
        }
    }

    @Override // X.C1M6
    public final void EII(double d, int i, int i2, int i3, long j) {
        C18920wW c18920wW = (C18920wW) this.A03.getValue();
        C25531Mh c25531Mh = new C25531Mh(c18920wW.A00(c18920wW.A00, "instagram_signals_write_to_cache"), 335);
        if (((AbstractC02600Aj) c25531Mh).A00.isSampled()) {
            C14120nc.A00().ATO(new C52390NGl(c25531Mh, d, i, i2, i3, j));
        }
    }

    public C1M4(UserSession userSession, C1M1 c1m1) {
        this.A00 = userSession;
        this.A01 = c1m1;
    }
}
