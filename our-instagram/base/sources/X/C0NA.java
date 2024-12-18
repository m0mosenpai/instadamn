package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0NA, reason: invalid class name */
/* loaded from: classes.dex */
public final class C0NA {
    public C0N9 A01;
    public final Integer A06;
    public C0N9 A00 = new C15280pi(this, 0);
    public final C0N8 A05 = new C0N8();
    public Integer A02 = C05F.A00;
    public boolean A04 = true;
    public boolean A03 = true;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0KR] */
    public final C0KR A00() {
        C0N9 c0n9 = this.A00;
        Integer num = this.A02;
        Integer num2 = this.A06;
        boolean z = this.A04;
        return new C0NC(this.A05, c0n9, this.A01, num, num2, z) { // from class: X.0KR
            public final Integer A00;
            public final C0N8 A01;
            public final C0N9 A02;
            public final C0N9 A03;
            public final Integer A04;
            public final boolean A05;

            private void A00(String str) {
                HashMap hashMap = new HashMap();
                hashMap.put("Message", str);
                hashMap.put("ConfigName", C0ND.A00(this.A00));
                C0PC.A00().DEh("DetectorConfigException", new RuntimeException("Exception when initializing detector"), hashMap);
            }

            @Override // X.C0NC
            public final Integer BW5() {
                return this.A00;
            }

            @Override // X.C0NC
            public final Integer CHb() {
                return this.A04;
            }

            @Override // X.C0NC
            public final void CNh(final C0NK c0nk) {
                int i;
                final C0LW A04 = c0nk.A04();
                C0OO c0oo = (C0OO) this.A02.ALP(c0nk);
                final int i2 = 0;
                final int i3 = 1;
                if (c0oo == null) {
                    A00("Detector is null");
                    C0K8.A0P("lacrima", "DetectorConfig.init failed (detector): %s", getClass().getSimpleName());
                    return;
                }
                AbstractC09780fb.A01(AnonymousClass001.A0R("init.", c0oo.BW2().A00), -1766607885);
                try {
                    synchronized (A04.A03) {
                        try {
                            A04.A07.add(c0oo);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    C0N9 c0n92 = this.A03;
                    if (c0n92 != null) {
                        C0PI c0pi = (C0PI) c0nk.A06().get();
                        C0L1 c0l1 = (C0L1) c0n92.ALP(c0nk);
                        if (c0l1 == null) {
                            A00("Mixer is null");
                            C0K8.A0P("lacrima", "DetectorConfig.init failed (mixer): %s", getClass().getSimpleName());
                            i = -1095190557;
                            AbstractC09780fb.A00(i);
                        }
                        synchronized (C0PI.A05) {
                            try {
                                c0pi.A02.add(c0l1);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                        C0M6 c0m6 = C0M6.CRITICAL_REPORT;
                        boolean z2 = this.A05;
                        A04.A0B(new C0IH(c0nk, z2), c0m6, c0oo);
                        A04.A0B(new C0IH(c0nk, z2), C0M6.LARGE_REPORT, c0oo);
                    }
                    final C0N8 c0n8 = this.A01;
                    Iterator it = c0n8.A03.iterator();
                    while (it.hasNext()) {
                        A04.A07((C0LR) it.next(), C0M6.CRITICAL_REPORT, c0oo);
                    }
                    Iterator it2 = c0n8.A02.iterator();
                    while (it2.hasNext()) {
                        C0LR c0lr = (C0LR) ((C0N9) it2.next()).ALP(c0nk);
                        if (c0lr != null) {
                            A04.A07(c0lr, C0M6.CRITICAL_REPORT, c0oo);
                        }
                    }
                    for (final C0N9 c0n93 : c0n8.A04) {
                        C0M6 c0m62 = C0M6.CRITICAL_REPORT;
                        final C0LV c0lv = new C0LV(A04, c0n8, c0n93, c0nk, i2) { // from class: X.0RT
                            public final int A00;
                            public final Object A01;
                            public final Object A02;
                            public final Object A03;
                            public final Object A04;

                            {
                                this.A00 = i2;
                                this.A01 = c0n8;
                                this.A03 = c0n93;
                                this.A04 = c0nk;
                                this.A02 = A04;
                            }

                            @Override // X.C0LV
                            public final void DWC(C0M6 c0m63, C0OO c0oo2) {
                                C0LW c0lw;
                                C0M6 c0m64;
                                int i4 = this.A00;
                                C0LR c0lr2 = (C0LR) ((C0N9) this.A03).ALP((C0NK) this.A04);
                                if (i4 != 0) {
                                    if (c0lr2 != null) {
                                        c0lw = (C0LW) this.A02;
                                        c0m64 = C0M6.LARGE_REPORT;
                                    } else {
                                        return;
                                    }
                                } else {
                                    if (c0lr2 == null) {
                                        return;
                                    }
                                    c0lw = (C0LW) this.A02;
                                    c0m64 = C0M6.CRITICAL_REPORT;
                                }
                                c0lw.A07(c0lr2, c0m64, c0oo2);
                            }
                        };
                        A04.A0C(new C0LV(c0lv) { // from class: X.09L
                            public boolean A00;
                            public final C0LV A01;

                            @Override // X.C0LV
                            public final void DWC(C0M6 c0m63, C0OO c0oo2) {
                                if (!this.A00) {
                                    this.A00 = true;
                                    this.A01.DWC(c0m63, c0oo2);
                                }
                            }

                            {
                                this.A01 = c0lv;
                            }
                        }, c0m62, c0oo);
                    }
                    Iterator it3 = c0n8.A08.iterator();
                    while (it3.hasNext()) {
                        A04.A07((C0LR) it3.next(), C0M6.LARGE_REPORT, c0oo);
                    }
                    Iterator it4 = c0n8.A07.iterator();
                    while (it4.hasNext()) {
                        C0LR c0lr2 = (C0LR) ((C0N9) it4.next()).ALP(c0nk);
                        if (c0lr2 != null) {
                            A04.A07(c0lr2, C0M6.LARGE_REPORT, c0oo);
                        }
                    }
                    for (final C0N9 c0n94 : c0n8.A09) {
                        C0M6 c0m63 = C0M6.LARGE_REPORT;
                        final C0LV c0lv2 = new C0LV(A04, c0n8, c0n94, c0nk, i3) { // from class: X.0RT
                            public final int A00;
                            public final Object A01;
                            public final Object A02;
                            public final Object A03;
                            public final Object A04;

                            {
                                this.A00 = i3;
                                this.A01 = c0n8;
                                this.A03 = c0n94;
                                this.A04 = c0nk;
                                this.A02 = A04;
                            }

                            @Override // X.C0LV
                            public final void DWC(C0M6 c0m632, C0OO c0oo2) {
                                C0LW c0lw;
                                C0M6 c0m64;
                                int i4 = this.A00;
                                C0LR c0lr22 = (C0LR) ((C0N9) this.A03).ALP((C0NK) this.A04);
                                if (i4 != 0) {
                                    if (c0lr22 != null) {
                                        c0lw = (C0LW) this.A02;
                                        c0m64 = C0M6.LARGE_REPORT;
                                    } else {
                                        return;
                                    }
                                } else {
                                    if (c0lr22 == null) {
                                        return;
                                    }
                                    c0lw = (C0LW) this.A02;
                                    c0m64 = C0M6.CRITICAL_REPORT;
                                }
                                c0lw.A07(c0lr22, c0m64, c0oo2);
                            }
                        };
                        A04.A0C(new C0LV(c0lv2) { // from class: X.09L
                            public boolean A00;
                            public final C0LV A01;

                            @Override // X.C0LV
                            public final void DWC(C0M6 c0m632, C0OO c0oo2) {
                                if (!this.A00) {
                                    this.A00 = true;
                                    this.A01.DWC(c0m632, c0oo2);
                                }
                            }

                            {
                                this.A01 = c0lv2;
                            }
                        }, c0m63, c0oo);
                    }
                    Iterator it5 = c0n8.A01.iterator();
                    while (it5.hasNext()) {
                        C0LV c0lv3 = (C0LV) ((C0N9) it5.next()).ALP(c0nk);
                        if (c0lv3 != null) {
                            A04.A0C(c0lv3, C0M6.CRITICAL_REPORT, c0oo);
                        }
                    }
                    Iterator it6 = c0n8.A00.iterator();
                    while (it6.hasNext()) {
                        C0LV c0lv4 = (C0LV) ((C0N9) it6.next()).ALP(c0nk);
                        if (c0lv4 != null) {
                            A04.A0B(c0lv4, C0M6.CRITICAL_REPORT, c0oo);
                        }
                    }
                    Iterator it7 = c0n8.A06.iterator();
                    while (it7.hasNext()) {
                        C0LV c0lv5 = (C0LV) ((C0N9) it7.next()).ALP(c0nk);
                        if (c0lv5 != null) {
                            A04.A0C(c0lv5, C0M6.LARGE_REPORT, c0oo);
                        }
                    }
                    Iterator it8 = c0n8.A05.iterator();
                    while (it8.hasNext()) {
                        C0LV c0lv6 = (C0LV) ((C0N9) it8.next()).ALP(c0nk);
                        if (c0lv6 != null) {
                            A04.A0B(c0lv6, C0M6.LARGE_REPORT, c0oo);
                        }
                    }
                    if (c0oo instanceof C005801x) {
                        ((C005801x) c0oo).A03 = c0nk.A0K;
                    }
                    c0oo.start();
                    i = -2012532271;
                    AbstractC09780fb.A00(i);
                } catch (Throwable th3) {
                    AbstractC09780fb.A00(-1128163010);
                    throw th3;
                }
            }

            {
                this.A02 = c0n9;
                this.A04 = num;
                this.A00 = num2;
                this.A05 = z;
                this.A03 = r3;
                this.A01 = r1;
            }
        };
    }

    public final void A01(C0M6 c0m6, C0N9 c0n9) {
        List list;
        if (c0n9 != null) {
            C0N8 c0n8 = this.A05;
            if (c0m6 == C0M6.CRITICAL_REPORT) {
                list = c0n8.A02;
            } else if (c0m6 == C0M6.LARGE_REPORT) {
                list = c0n8.A07;
            } else {
                throw new IllegalStateException("Unknown ReportCategory");
            }
            list.add(c0n9);
        }
    }

    public final void A02(C0M6 c0m6, C0N9 c0n9) {
        List list;
        if (c0n9 != null) {
            C0N8 c0n8 = this.A05;
            if (c0m6 == C0M6.CRITICAL_REPORT) {
                list = c0n8.A04;
            } else if (c0m6 == C0M6.LARGE_REPORT) {
                list = c0n8.A09;
            } else {
                throw new IllegalStateException("Unknown ReportCategory");
            }
            list.add(c0n9);
        }
    }

    public C0NA(Integer num) {
        this.A06 = num;
    }
}
