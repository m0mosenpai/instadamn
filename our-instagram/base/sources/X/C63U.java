package X;

import android.util.JsonReader;
import com.facebook.common.time.RealtimeSinceBootClock;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.io.StringReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* renamed from: X.63U, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C63U {
    public final C63Q A00;
    public final C63M A01;
    public final C0JO A02;
    public final C63C A03;

    public C63U(C63Q c63q, C63M c63m, C63C c63c) {
        C14360o3.A0B(c63c, 3);
        RealtimeSinceBootClock realtimeSinceBootClock = RealtimeSinceBootClock.A00;
        C14360o3.A07(realtimeSinceBootClock);
        this.A01 = c63m;
        this.A00 = c63q;
        this.A03 = c63c;
        this.A02 = realtimeSinceBootClock;
    }

    public final void A02(java.util.Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int ordinal = ((EnumC61117RfX) it.next()).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    C63Q c63q = this.A00;
                    c63q.A04.execute(new FutureTask(new CallableC64781TTt(c63q)));
                } else {
                    throw new RuntimeException();
                }
            } else {
                C63M c63m = this.A01;
                try {
                    C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryLRUMemoryCache", QuickExperimentDumperPlugin.CLEAR_CMD, ':'));
                    synchronized (c63m.A04) {
                        C223016j c223016j = c63m.A02;
                        c223016j.A05(-1);
                        LinkedHashMap A04 = c223016j.A04();
                        c63m.A00 = A04;
                        c63m.A03.A01(new C1340163j(A04));
                    }
                } finally {
                    C1LN.A00();
                }
            }
        }
    }

    public static final C09530e4 A00(EnumC58683Pzw enumC58683Pzw, C58675Pzo c58675Pzo, C63U c63u, C62744SOl c62744SOl, String str, long j, long j2, long j3) {
        C09530e4 c09530e4;
        C63C c63c = c63u.A03;
        long currentMonotonicTimestamp = c63c.currentMonotonicTimestamp();
        Q0H q0h = c62744SOl.A01;
        if (q0h != null) {
            long j4 = q0h.A00;
            if (C58674Pzn.A04(enumC58683Pzw, j4, j, j2)) {
                String str2 = q0h.A02;
                C16930sl c16930sl = C16930sl.A00;
                try {
                    C1LN.A01(AnonymousClass001.A0T("ComponentQueryParser", "parseWithExternalVariableEntries", ':'));
                    boolean z = false;
                    if (str2.length() == 0) {
                        z = true;
                    }
                    if (z) {
                        AbstractC25241Le.A02(AbstractC58317Pt9.A00(556), "ComponentQueryParser");
                        c09530e4 = new C09530e4(null, new Q07());
                    } else {
                        long currentMonotonicTimestamp2 = c63c.currentMonotonicTimestamp();
                        try {
                            JsonReader jsonReader = new JsonReader(new StringReader(str2));
                            try {
                                C192928gY c192928gY = new C192928gY(jsonReader);
                                c192928gY.Csy();
                                Q06 A00 = Q05.A00(c192928gY);
                                if (A00.A00 == null) {
                                    AbstractC25241Le.A02("Expected a valid set of components but found none", "ComponentQueryParser");
                                    c09530e4 = new C09530e4(null, new Q07());
                                    jsonReader.close();
                                } else {
                                    long currentMonotonicTimestamp3 = c63c.currentMonotonicTimestamp();
                                    Q0E A002 = Q0B.A00(A00, c16930sl);
                                    long currentMonotonicTimestamp4 = c63c.currentMonotonicTimestamp();
                                    Q0G q0g = new Q0G();
                                    q0g.A00("parse_start", currentMonotonicTimestamp2);
                                    q0g.A00("json_parse_start", currentMonotonicTimestamp2);
                                    q0g.A00("json_parse_end", currentMonotonicTimestamp3);
                                    q0g.A00("parse_end", currentMonotonicTimestamp4);
                                    c09530e4 = new C09530e4(A002, new Q0F(AbstractC06930Yk.A0B(q0g.A02), AbstractC06930Yk.A0B(q0g.A01)));
                                    jsonReader.close();
                                }
                            } finally {
                            }
                        } catch (Exception e) {
                            AbstractC25241Le.A03("ComponentQueryParser", e);
                            c09530e4 = new C09530e4(null, new Q07());
                        }
                    }
                    C1LN.A00();
                    Q0E q0e = (Q0E) c09530e4.A00;
                    Object obj = c09530e4.A01;
                    if (q0e != null) {
                        C63M c63m = c63u.A01;
                        C64517THk c64517THk = q0h.A01;
                        c63m.A00(q0e, enumC58683Pzw, c64517THk, str, j, j4);
                        Q0I q0i = new Q0I(q0e, enumC58683Pzw, c64517THk, null, j4);
                        c58675Pzo.A01("cache_src", "disk");
                        c58675Pzo.A00("read_start", j3);
                        c58675Pzo.A00("read_end", currentMonotonicTimestamp);
                        return new C09530e4(q0i, Q04.A00(c62744SOl.A00, (Q03) obj, new Q03(AbstractC06930Yk.A0B(c58675Pzo.A02), AbstractC06930Yk.A0B(c58675Pzo.A01))));
                    }
                } catch (Throwable th) {
                    C1LN.A00();
                    throw th;
                }
            }
        }
        return null;
    }

    public final C6Eo A01(final InterfaceC1339663e interfaceC1339663e) {
        C6Eo c6Eo;
        C63M c63m = this.A01;
        InterfaceC1339663e interfaceC1339663e2 = new InterfaceC1339663e() { // from class: X.63g
            @Override // X.InterfaceC1339663e
            public final /* bridge */ /* synthetic */ void DnA(Object obj) {
                Map map = ((C1340163j) obj).A00;
                C14360o3.A0B(map, 0);
                InterfaceC1339663e.this.DnA(new C6Ep(map));
            }
        };
        try {
            C1LN.A01(AnonymousClass001.A0T("BloksComponentQueryLRUMemoryCache", "getSnapshotAndSubscribe", ':'));
            synchronized (c63m.A04) {
                c6Eo = new C6Eo(c63m.A03.A00(interfaceC1339663e2), new C1340163j(c63m.A00));
            }
            C1LN.A00();
            return new C6Eo(c6Eo.A01, new C6Ep(((C1340163j) c6Eo.A00).A00));
        } catch (Throwable th) {
            C1LN.A00();
            throw th;
        }
    }
}
