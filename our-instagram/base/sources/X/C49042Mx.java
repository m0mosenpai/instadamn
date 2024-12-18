package X;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.2Mx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C49042Mx implements InterfaceC48882Mg, InterfaceC48932Mm, InterfaceC49062Mz {
    public Boolean A00;
    public boolean A01;
    public C2N3 A02;
    public final Context A03;
    public final C2L2 A04;
    public final C2MX A05;
    public final InterfaceC49022Mv A0A;
    public final C2N5 A0B;
    public final C2N8 A0C;
    public final C2LC A0D;
    public final Map A07 = new HashMap();
    public final Object A06 = new Object();
    public final C2N0 A09 = new C2N0();
    public final Map A08 = new HashMap();

    @Override // X.InterfaceC48882Mg
    public final boolean CL9() {
        return false;
    }

    static {
        C48442Kl.A01("GreedyScheduler");
    }

    @Override // X.InterfaceC48882Mg
    public final void AGG(String workSpecId) {
        Runnable runnable;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C2OO.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            C48442Kl.A00();
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        C48442Kl.A00();
        C2N3 c2n3 = this.A02;
        if (c2n3 != null && (runnable = (Runnable) c2n3.A02.remove(workSpecId)) != null) {
            ((C2L9) c2n3.A00).A00.removeCallbacks(runnable);
        }
        for (C1113750b c1113750b : this.A09.A02(workSpecId)) {
            this.A0B.A00(c1113750b);
            InterfaceC49022Mv interfaceC49022Mv = this.A0A;
            C14360o3.A0B(c1113750b, 1);
            interfaceC49022Mv.Eor(c1113750b, -512);
        }
    }

    @Override // X.InterfaceC48932Mm
    public final void DEk(C2WP id, boolean needsReschedule) {
        AnonymousClass195 anonymousClass195;
        C1113750b A00 = this.A09.A00(id);
        if (A00 != null) {
            this.A0B.A00(A00);
        }
        Object obj = this.A06;
        synchronized (obj) {
            anonymousClass195 = (AnonymousClass195) this.A07.remove(id);
        }
        if (anonymousClass195 != null) {
            C48442Kl.A00();
            anonymousClass195.AGH(null);
        }
        if (!needsReschedule) {
            synchronized (obj) {
                this.A08.remove(id);
            }
        }
    }

    @Override // X.InterfaceC48882Mg
    public final void EM3(C48412Ki... workSpecs) {
        long max;
        Boolean bool = this.A00;
        if (bool == null) {
            bool = Boolean.valueOf(C2OO.A00(this.A03, this.A04));
            this.A00 = bool;
        }
        if (!bool.booleanValue()) {
            C48442Kl.A00();
            return;
        }
        if (!this.A01) {
            this.A05.A02(this);
            this.A01 = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final C48412Ki c48412Ki : workSpecs) {
            C2WP A00 = C2WN.A00(c48412Ki);
            C2N0 c2n0 = this.A09;
            if (!c2n0.A03(A00)) {
                synchronized (this.A06) {
                    C2WP A002 = C2WN.A00(c48412Ki);
                    Map map = this.A08;
                    C2Y8 c2y8 = (C2Y8) map.get(A002);
                    if (c2y8 == null) {
                        c2y8 = new C2Y8(c48412Ki.A02, System.currentTimeMillis());
                        map.put(A002, c2y8);
                    }
                    max = c2y8.A01 + (Math.max((c48412Ki.A02 - c2y8.A00) - 5, 0) * 30000);
                }
                long max2 = Math.max(c48412Ki.A00(), max);
                long currentTimeMillis = System.currentTimeMillis();
                if (c48412Ki.A0E == EnumC48482Kp.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        final C2N3 c2n3 = this.A02;
                        if (c2n3 != null) {
                            Map map2 = c2n3.A02;
                            String str = c48412Ki.A0M;
                            Runnable runnable = (Runnable) map2.remove(str);
                            if (runnable != null) {
                                ((C2L9) c2n3.A00).A00.removeCallbacks(runnable);
                            }
                            Runnable runnable2 = new Runnable() { // from class: X.2YC
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C48442Kl.A00();
                                    C2N3.this.A01.EM3(c48412Ki);
                                }
                            };
                            map2.put(str, runnable2);
                            ((C2L9) c2n3.A00).A00.postDelayed(runnable2, max2 - System.currentTimeMillis());
                        }
                    } else if (!C14360o3.A0K(C48562Ky.A08, c48412Ki.A0B)) {
                        if (!c48412Ki.A0B.A06 && !(!r1.A03.isEmpty())) {
                            hashSet.add(c48412Ki);
                            hashSet2.add(c48412Ki.A0M);
                        } else {
                            C48442Kl.A00();
                        }
                    } else if (!c2n0.A03(C2WN.A00(c48412Ki))) {
                        C48442Kl.A00();
                        C1113750b A01 = c2n0.A01(C2WN.A00(c48412Ki));
                        this.A0B.A01(A01);
                        InterfaceC49022Mv interfaceC49022Mv = this.A0A;
                        C14360o3.A0B(A01, 1);
                        C49012Mu c49012Mu = (C49012Mu) interfaceC49022Mv;
                        c49012Mu.A01.ATa(new RunnableC1113950d(null, c49012Mu.A00, A01));
                    }
                }
            }
        }
        synchronized (this.A06) {
            if (!hashSet.isEmpty()) {
                TextUtils.join(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, hashSet2);
                C48442Kl.A00();
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    C48412Ki c48412Ki2 = (C48412Ki) it.next();
                    C2WP A003 = C2WN.A00(c48412Ki2);
                    Map map3 = this.A07;
                    if (!map3.containsKey(A003)) {
                        map3.put(A003, C50U.A00(this, this.A0C, c48412Ki2, ((C2LB) this.A0D).A03));
                    }
                }
            }
        }
    }

    public C49042Mx(Context context, C2L2 configuration, C2MX trackers, InterfaceC49022Mv processor, C2ME workLauncher, C2LC taskExecutor) {
        this.A03 = context;
        C2LA c2la = configuration.A02;
        this.A02 = new C2N3(configuration.A00, c2la, this);
        this.A0B = new C2N5(c2la, processor);
        this.A0D = taskExecutor;
        this.A0C = new C2N8(workLauncher);
        this.A04 = configuration;
        this.A05 = trackers;
        this.A0A = processor;
    }

    @Override // X.InterfaceC49062Mz
    public final void D7K(C50a workSpec, C48412Ki state) {
        C2WP A00 = C2WN.A00(state);
        if (workSpec instanceof C50Z) {
            C2N0 c2n0 = this.A09;
            if (!c2n0.A03(A00)) {
                C48442Kl.A00();
                C1113750b A01 = c2n0.A01(A00);
                this.A0B.A01(A01);
                InterfaceC49022Mv interfaceC49022Mv = this.A0A;
                C14360o3.A0B(A01, 1);
                C49012Mu c49012Mu = (C49012Mu) interfaceC49022Mv;
                c49012Mu.A01.ATa(new RunnableC1113950d(null, c49012Mu.A00, A01));
                return;
            }
            return;
        }
        C48442Kl.A00();
        C1113750b A002 = this.A09.A00(A00);
        if (A002 == null) {
            return;
        }
        this.A0B.A00(A002);
        this.A0A.Eor(A002, ((QAG) workSpec).A00);
    }
}
