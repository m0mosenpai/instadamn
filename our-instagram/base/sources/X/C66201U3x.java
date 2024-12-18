package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.U3x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66201U3x {
    public final C69733VuT A03;
    public final C66200U3w A04;
    public final C66273U6s A05;
    public final InterfaceC103334l8 A06;
    public final InterfaceC191788ea A07;
    public final InterfaceC103274l2 A0B;
    public final AtomicLong A08 = new AtomicLong();
    public final AtomicReference A09 = new AtomicReference(C193028gi.A02);
    public final AtomicReference A0A = new AtomicReference();
    public InterfaceC72008XEw A00 = null;
    public InterfaceC192128fD A02 = null;
    public InterfaceC192098fA A01 = null;

    public static C66201U3x A00(Context context, SparseArray sparseArray, C66273U6s c66273U6s, C1338462s c1338462s, InterfaceC62872tQ interfaceC62872tQ, InterfaceC191788ea interfaceC191788ea) {
        SparseArray clone = c66273U6s.A04.clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            AbstractC65702TsY.A10(sparseArray, clone, i);
        }
        clone.put(R.id.bk_context_key_app_id, c66273U6s.A09);
        Map map = c66273U6s.A0G;
        int i2 = c66273U6s.A00;
        HashMap hashMap = new HashMap();
        if (map != null) {
            hashMap.putAll(map);
        }
        String valueOf = String.valueOf(i2);
        hashMap.put("ttrc_instance_id", valueOf);
        Map map2 = c66273U6s.A0F;
        HashMap hashMap2 = new HashMap();
        if (map2 != null) {
            hashMap2.putAll(map2);
        }
        hashMap2.put("ttrc_instance_id", valueOf);
        return new C66201U3x(new C66200U3w(context, clone, c1338462s, interfaceC62872tQ, hashMap, hashMap2), c66273U6s, interfaceC191788ea);
    }

    public static C66273U6s A01(Bundle bundle) {
        if (bundle == null) {
            return new C66273U6s(null, null, null, null, null, null, new ArrayList(), null, null, null, 0, false);
        }
        C66273U6s A01 = C66273U6s.A01(bundle);
        if (A01 != null) {
            return A01;
        }
        throw new IllegalArgumentException("BloksSurfaceProps is missing from Fragment argument.");
    }

    public static String A02(String str, int i) {
        String str2;
        if (i != 0 && i != 2) {
            str2 = "nc_";
        } else {
            str2 = "cc_";
        }
        return AnonymousClass001.A0R(str2, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cf, code lost:
    
        if (r1 != 2) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        r21.CsE("bloks_query", true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ea, code lost:
    
        r21.AF2(r6.A02, "bloks_query", true, r19);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e8, code lost:
    
        if (r6.A03 < r20.A05.A02) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A03(X.C66201U3x r20, X.InterfaceC72008XEw r21, X.C193028gi r22) {
        /*
            r7 = r20
            X.4l8 r0 = r7.A06
            long r19 = r0.now()
            r8 = r22
            X.8gh r6 = r8.A01
            boolean r0 = r6.A05
            r14 = r21
            if (r0 == 0) goto Lc7
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r12 = 0
            java.lang.String r1 = "gql_server_end"
            long r4 = r6.A04
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L24
            X.MSX.A1N(r1, r9, r4)
        L24:
            long r2 = r6.A03
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L2d
            X.MSX.A1N(r1, r9, r2)
        L2d:
            java.util.Iterator r10 = X.AbstractC166997dE.A14(r9)
        L31:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r14.Cnb(r9, r0)
            goto L31
        L51:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r1 = ""
            int r0 = r1.length()
            if (r0 <= 0) goto L67
            r0 = 786(0x312, float:1.101E-42)
            java.lang.String r0 = X.AbstractC58317Pt9.A00(r0)
            r9.put(r0, r1)
        L67:
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L8b
            long r0 = r6.A01
            r10 = -1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L7c
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_response_time_ms"
            r9.put(r0, r1)
        L7c:
            long r0 = r6.A00
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L8b
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_read_latency_ms"
            r9.put(r0, r1)
        L8b:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto La7
            r0 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "parsed_bytes"
            r9.put(r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "additive_parse_time"
            r9.put(r0, r1)
            java.lang.String r0 = "network_attempts"
            r9.put(r0, r2)
        La7:
            java.util.Iterator r2 = X.AbstractC166997dE.A14(r9)
        Lab:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lc7
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r14.CnT(r1, r0)
            goto Lab
        Lc7:
            int r1 = r8.A00
            r8 = 1
            java.lang.String r5 = "bloks_query"
            if (r1 == 0) goto Ld5
            r0 = 2
            if (r1 == r0) goto Lea
        Ld1:
            r14.CsE(r5, r8)
            return
        Ld5:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A08
            long r0 = r0.get()
            java.lang.String r2 = "prefetched_data_ready_at"
            r14.CnS(r2, r0)
            long r3 = r6.A03
            X.U6s r0 = r7.A05
            long r1 = r0.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto Ld1
        Lea:
            long r15 = r6.A02
            r17 = r5
            r18 = r8
            r14.AF2(r15, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66201U3x.A03(X.U3x, X.XEw, X.8gi):void");
    }

    /* JADX WARN: Finally extract failed */
    public final Pair A04(Context context) {
        boolean z;
        try {
            C66200U3w c66200U3w = this.A04;
            U3u u3u = new U3u(context);
            c66200U3w.A00 = u3u;
            C6T7 c6t7 = c66200U3w.A01;
            if (c6t7 != null) {
                z = true;
                c6t7.A07(u3u);
            } else {
                z = false;
                if (c66200U3w.A0A.compareAndSet(false, true)) {
                    AbstractC192138fE abstractC192138fE = c66200U3w.A06;
                    if (abstractC192138fE == null) {
                        C66200U3w.A00(c66200U3w, 0);
                    } else {
                        C66200U3w.A00(c66200U3w, 1);
                        C66200U3w.A01(c66200U3w, (C193038gj) abstractC192138fE, 2, 3);
                    }
                }
            }
            Pair create = Pair.create(c66200U3w.A00, Boolean.valueOf(z));
            InterfaceC192098fA interfaceC192098fA = this.A01;
            if (interfaceC192098fA != null) {
                interfaceC192098fA.EFu(c66200U3w);
                C65951Tww c65951Tww = new C65951Tww(0, this, c66200U3w);
                this.A02 = c65951Tww;
                this.A01.A9b(c65951Tww);
            }
            return create;
        } catch (Throwable th) {
            InterfaceC192098fA interfaceC192098fA2 = this.A01;
            if (interfaceC192098fA2 != null) {
                C66200U3w c66200U3w2 = this.A04;
                interfaceC192098fA2.EFu(c66200U3w2);
                C65951Tww c65951Tww2 = new C65951Tww(0, this, c66200U3w2);
                this.A02 = c65951Tww2;
                this.A01.A9b(c65951Tww2);
            }
            throw th;
        }
    }

    public final Throwable A05() {
        AbstractC192138fE abstractC192138fE = (AbstractC192138fE) this.A0A.get();
        if (abstractC192138fE instanceof C215539gT) {
            return ((C215539gT) abstractC192138fE).A00;
        }
        return null;
    }

    public final void A06() {
        C102884kP c102884kP;
        InterfaceC103384lE A05;
        C6FG c6fg;
        C6FG A02;
        AnonymousClass630 A022;
        Object obj = this.A05.A07;
        if ((obj instanceof C102884kP) && (c102884kP = (C102884kP) obj) != null && U5E.A0C(c102884kP) && (A05 = U5E.A05(c102884kP)) != null) {
            C6FX c6fx = new C6FX();
            C66200U3w c66200U3w = this.A04;
            C6T7 c6t7 = c66200U3w.A01;
            if (c6t7 != null) {
                c6fg = c6t7.A02();
            } else {
                c6fg = null;
            }
            c6fx.A01(c6fg);
            C6FW A00 = c6fx.A00();
            C6T7 c6t72 = c66200U3w.A01;
            if (c6t72 != null && (A022 = AnonymousClass634.A02((A02 = c6t72.A02()))) != null) {
                C6FP.A03(A02, A022.A06, A00, A05);
            }
        }
        InterfaceC192098fA interfaceC192098fA = this.A01;
        if (interfaceC192098fA != null) {
            interfaceC192098fA.destroy();
        }
        this.A01 = null;
        C66200U3w c66200U3w2 = this.A04;
        C6T7 c6t73 = c66200U3w2.A01;
        if (c6t73 != null) {
            c6t73.A03();
        }
        c66200U3w2.A01 = null;
        c66200U3w2.A0B.set(null);
        this.A0A.set(null);
    }

    public final void A07() {
        try {
            InterfaceC192128fD interfaceC192128fD = this.A02;
            if (interfaceC192128fD != null) {
                InterfaceC192098fA interfaceC192098fA = this.A01;
                if (interfaceC192098fA != null) {
                    interfaceC192098fA.EFu(interfaceC192128fD);
                }
                this.A02 = null;
            }
        } finally {
            InterfaceC72008XEw interfaceC72008XEw = this.A00;
            if (interfaceC72008XEw != null) {
                interfaceC72008XEw.Ch8("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public final boolean A08(Context context, InterfaceC72763Nx interfaceC72763Nx) {
        boolean z;
        InterfaceC72008XEw Eo0;
        if (this.A00 == null) {
            C69733VuT c69733VuT = this.A03;
            InterfaceC103274l2 interfaceC103274l2 = this.A0B;
            C66273U6s c66273U6s = this.A05;
            if (c66273U6s.A0H) {
                Eo0 = interfaceC103274l2.Eo1(c66273U6s.A01, c66273U6s.A00, c66273U6s.A02);
            } else {
                Eo0 = interfaceC103274l2.Eo0(c66273U6s.A09, c66273U6s.A01, c66273U6s.A00, c66273U6s.A02);
                Map map = c66273U6s.A0E;
                if (map != null) {
                    Iterator A15 = AbstractC166997dE.A15(map);
                    while (A15.hasNext()) {
                        Map.Entry entry = (Map.Entry) A15.next();
                        U4N.A01(Eo0, entry.getValue(), (String) entry.getKey());
                    }
                }
                for (C69027Vg3 c69027Vg3 : c66273U6s.A0D) {
                    boolean z2 = false;
                    int andSet = C1XE.A02.getAndSet(0);
                    if (andSet > 0) {
                        z2 = true;
                    }
                    Eo0.CnU("prefetch_checkout_info_attempt", z2);
                    Eo0.CnR("prefetch_attempt_count", andSet);
                    Eo0.CnT("ttrc_touch_up_module", c69027Vg3.A01);
                }
            }
            this.A00 = Eo0;
            Eo0.Cnb("surface_core_created_at", c69733VuT.A00);
        }
        InterfaceC72008XEw interfaceC72008XEw = this.A00;
        C66273U6s c66273U6s2 = this.A05;
        String str = c66273U6s2.A09;
        if (str != null && !c66273U6s2.A0I) {
            interfaceC72008XEw.AA2("bloks_query", TimeUnit.SECONDS, c66273U6s2.A03);
        } else {
            interfaceC72008XEw.AAO("initial_content_step");
        }
        if (this.A01 == null) {
            if (!c66273U6s2.A0I && str != null) {
                HashMap hashMap = c66273U6s2.A0C;
                this.A01 = AbstractC191798eb.A00(context, this.A07, str, c66273U6s2.A0A, hashMap, 0L);
            } else {
                z = false;
                C66200U3w c66200U3w = this.A04;
                c66200U3w.A0B.set(new U3v(this, interfaceC72763Nx, interfaceC72008XEw));
                return z;
            }
        }
        z = true;
        C66200U3w c66200U3w2 = this.A04;
        c66200U3w2.A0B.set(new U3v(this, interfaceC72763Nx, interfaceC72008XEw));
        return z;
    }

    public C66201U3x(C66200U3w c66200U3w, C66273U6s c66273U6s, InterfaceC191788ea interfaceC191788ea) {
        InterfaceC103274l2 interfaceC103274l2 = C1LZ.A00().A01;
        this.A0B = interfaceC103274l2;
        InterfaceC103334l8 C4l = interfaceC103274l2.C4l();
        this.A06 = C4l;
        this.A04 = c66200U3w;
        this.A05 = c66273U6s;
        this.A07 = interfaceC191788ea;
        this.A03 = new C69733VuT(C4l.now());
    }
}
