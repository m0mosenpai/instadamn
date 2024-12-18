package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import com.facebook.common.math.matrix.Matrix4;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.pendingmedia.store.PendingMediaStoreSerializer;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.9KJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9KJ implements View.OnClickListener, C8MA, InterfaceC58287Psf, InterfaceC25193BCq {
    public static final Matrix4 A0R = new Matrix4();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C9OB A05;
    public C191478dz A06;
    public InterfaceC25215BDn A07;
    public C9KW A08;
    public C47Z A09;
    public C208719Lf A0A;
    public Runnable A0B;
    public Runnable A0C;
    public Runnable A0D;
    public boolean A0E;
    public long A0F;
    public final Context A0G;
    public final UserSession A0H;
    public final Map A0I;
    public final java.util.Set A0J;
    public final C8NS A0K;
    public final InterfaceC25217BDq A0L;
    public final C23105AGr A0M;
    public final InterfaceC189598ae A0N;
    public final Integer A0O;
    public final String A0P;
    public final boolean A0Q;

    public final void A00() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            ((AbstractC208809Lo) c9kw.A08()).A00.A00();
        }
    }

    public final void A01() {
        AbstractC208809Lo abstractC208809Lo;
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            if (c9kw instanceof C219919nd) {
                abstractC208809Lo = ((C219919nd) c9kw).A06;
            } else {
                abstractC208809Lo = ((C9MF) c9kw).A0E;
            }
            abstractC208809Lo.A00.A01();
        }
        this.A04 = this.A03;
    }

    public final void A02() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.A0F > 35) {
                ((AbstractC208809Lo) c9kw.A08()).A00.A03(null);
                this.A0F = currentTimeMillis;
            }
        }
    }

    public final void A03() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            RunnableC208819Lp runnableC208819Lp = ((AbstractC208809Lo) c9kw.A08()).A00;
            Object obj = runnableC208819Lp.A06;
            synchronized (obj) {
                runnableC208819Lp.A0E = false;
                obj.notify();
            }
        }
    }

    public final void A04() {
        C23105AGr c23105AGr = this.A0M;
        if (c23105AGr != null) {
            View view = c23105AGr.A00;
            if (view != null) {
                view.clearAnimation();
                c23105AGr.A00.setVisibility(4);
            }
            AbstractC167007dF.A0w(c23105AGr.A01);
        }
    }

    public final void A05(final C9OD c9od, final Runnable runnable, final Runnable runnable2, final Runnable runnable3, final Runnable runnable4) {
        InterfaceC25215BDn interfaceC25215BDn = new InterfaceC25215BDn() { // from class: X.9Ln
            public boolean A00 = true;

            @Override // X.InterfaceC25215BDn
            public final void Dz1(String str) {
                C9OD c9od2 = c9od;
                if (c9od2 != null) {
                    C185948Mo c185948Mo = c9od2.A00;
                    C55U c55u = c185948Mo.A05;
                    if (c55u != C208509Kk.A00 && c55u != C81T.A00) {
                        return;
                    }
                    UserSession userSession = c185948Mo.A0c;
                    AbstractC198428pr.A00(userSession).A04("Error during MediaPlayer prepare", AnonymousClass001.A0R("camera_destination ", c185948Mo.A05.A02));
                    C1815483h c1815483h = c185948Mo.A0k.A02.A01;
                    if (c1815483h.A0G != null) {
                        AbstractC198428pr.A00(userSession).A01("Error during MediaPlayer prepare");
                    } else {
                        if (c1815483h.A0D != C05F.A01) {
                            return;
                        }
                        AbstractC198428pr.A00(userSession).A03("Error during MediaPlayer prepare", AnonymousClass001.A0R("camera_destination ", c185948Mo.A05.A02));
                    }
                }
            }

            /* JADX WARN: Code restructure failed: missing block: B:101:0x01fd, code lost:
            
                if (r1 < 3) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:112:0x023d, code lost:
            
                if (r0.getBackground() != null) goto L120;
             */
            /* JADX WARN: Code restructure failed: missing block: B:117:0x0175, code lost:
            
                if (r10.A0B != null) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:79:0x0195, code lost:
            
                if (r11.A02 != false) goto L84;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x0197, code lost:
            
                X.C185948Mo.A07(r10);
             */
            @Override // X.InterfaceC25215BDn
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void Dz9(int r29) {
                /*
                    Method dump skipped, instructions count: 586
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C208799Ln.Dz9(int):void");
            }

            @Override // X.InterfaceC25215BDn
            public final void Dzd() {
                Runnable runnable5 = runnable3;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }

            @Override // X.InterfaceC25215BDn
            public final void Dzf() {
                Runnable runnable5 = runnable4;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }

            @Override // X.InterfaceC25215BDn
            public final void E03() {
                Runnable runnable5 = runnable;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }

            @Override // X.InterfaceC25215BDn
            public final void E0B() {
                Runnable runnable5 = runnable2;
                if (runnable5 != null) {
                    runnable5.run();
                }
            }
        };
        this.A07 = interfaceC25215BDn;
        this.A0C = runnable;
        this.A0D = runnable2;
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A04 = interfaceC25215BDn;
        }
    }

    public final void A06(InterfaceC25215BDn interfaceC25215BDn) {
        this.A07 = interfaceC25215BDn;
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A04 = interfaceC25215BDn;
        }
    }

    public final void A07(InterfaceC184058Eu interfaceC184058Eu) {
        this.A0J.add(interfaceC184058Eu);
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A0A.add(interfaceC184058Eu);
        }
    }

    public final void A08(C47Z c47z, int i) {
        this.A09 = c47z;
        this.A04 = i;
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A0J(this.A0H, c47z, i);
        }
    }

    public final void A09(boolean z) {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A0M(z);
        }
    }

    @Override // X.InterfaceC58287Psf
    public final VideoFilter B6O() {
        AbstractC209369Nu A08;
        C208719Lf c208719Lf;
        C9KW c9kw = this.A08;
        if (c9kw != null && (A08 = c9kw.A08()) != null) {
            if (A08 instanceof C219909nc) {
                c208719Lf = ((C219909nc) A08).A02;
            } else {
                c208719Lf = ((C219899nb) A08).A01;
            }
            if (c208719Lf != null) {
                throw AbstractC166987dD.A1D("We don't use VideoFilters in the OC MP");
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC58287Psf
    public final boolean CoQ() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            return c9kw.A0O();
        }
        return false;
    }

    @Override // X.InterfaceC25193BCq
    public final void DfG(RunnableC208819Lp runnableC208819Lp, C208719Lf c208719Lf) {
        UserSession userSession;
        if (this.A0O == C05F.A01) {
            Context context = this.A0G;
            C23105AGr c23105AGr = this.A0M;
            boolean z = this.A0E;
            boolean z2 = this.A0Q;
            userSession = this.A0H;
            C22840A5j c22840A5j = new C22840A5j(this);
            InterfaceC25217BDq interfaceC25217BDq = this.A0L;
            this.A08 = new C219919nd(context, this.A0K, userSession, interfaceC25217BDq, c22840A5j, c23105AGr, runnableC208819Lp, c208719Lf, this.A0P, z, z2);
            interfaceC25217BDq.DyR();
        } else {
            Context context2 = this.A0G;
            C23105AGr c23105AGr2 = this.A0M;
            boolean z3 = this.A0E;
            boolean z4 = this.A0Q;
            userSession = this.A0H;
            this.A08 = new C9MF(context2, userSession, c23105AGr2, runnableC208819Lp, c208719Lf, z3, z4);
        }
        Runnable runnable = new Runnable() { // from class: X.9PQ
            @Override // java.lang.Runnable
            public final void run() {
                Runnable runnable2;
                C9KW c9kw;
                C9KJ c9kj = C9KJ.this;
                C47Z c47z = c9kj.A09;
                if (c47z != null) {
                    c9kj.A08(c47z, c9kj.A04);
                }
                InterfaceC25215BDn interfaceC25215BDn = c9kj.A07;
                if (interfaceC25215BDn != null) {
                    c9kj.A06(interfaceC25215BDn);
                } else {
                    Runnable runnable3 = c9kj.A0C;
                    if (runnable3 != null && (runnable2 = c9kj.A0D) != null) {
                        c9kj.A05(null, runnable3, runnable2, null, null);
                    }
                }
                Iterator it = c9kj.A0J.iterator();
                while (it.hasNext()) {
                    c9kj.A07((InterfaceC184058Eu) it.next());
                }
                Runnable runnable4 = c9kj.A0B;
                if (runnable4 != null) {
                    c9kj.A0B = runnable4;
                    C9KW c9kw2 = c9kj.A08;
                    if (c9kw2 != null) {
                        c9kw2.A06 = new C9PR(runnable4);
                    }
                }
                C191478dz c191478dz = c9kj.A06;
                if (c191478dz != null) {
                    c9kj.A06 = c191478dz;
                    C9KW c9kw3 = c9kj.A08;
                    if (c9kw3 != null) {
                        c9kw3.A03 = c191478dz;
                    }
                }
                C9OB c9ob = c9kj.A05;
                if (c9ob != null) {
                    c9kj.A05 = c9ob;
                    C9KW c9kw4 = c9kj.A08;
                    if (c9kw4 != null) {
                        c9kw4.A02 = c9ob;
                    }
                }
                if (c9kj.A0E && (c9kw = c9kj.A08) != null) {
                    c9kw.A0O();
                }
            }
        };
        InterfaceC189598ae interfaceC189598ae = this.A0N;
        if (interfaceC189598ae == null) {
            PendingMediaStoreSerializer A00 = AnonymousClass257.A00(userSession);
            A00.A06(runnable);
            A00.A03();
        } else {
            interfaceC189598ae.EDa(runnable);
        }
        this.A0A = c208719Lf;
    }

    @Override // X.InterfaceC25193BCq
    public final void DfH() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A04 = null;
            ((AbstractC208809Lo) c9kw.A08()).A00.A00();
            this.A08 = null;
        }
        this.A0I.clear();
    }

    @Override // X.C8MA
    public final void EGV() {
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            c9kw.A0D();
        }
    }

    public C9KJ(Context context, C8NS c8ns, UserSession userSession, InterfaceC25217BDq interfaceC25217BDq, C23105AGr c23105AGr, InterfaceC189598ae interfaceC189598ae, Integer num, String str, boolean z, boolean z2) {
        this.A0I = AbstractC166987dD.A1G();
        this.A0J = AbstractC166987dD.A1H();
        this.A00 = -1;
        this.A01 = 100;
        this.A03 = -1;
        this.A04 = -1;
        this.A02 = -1;
        this.A0G = context;
        this.A0N = interfaceC189598ae;
        this.A0M = c23105AGr;
        this.A0E = z;
        this.A0Q = z2;
        this.A0H = userSession;
        this.A0L = interfaceC25217BDq;
        this.A0O = num;
        this.A0K = c8ns;
        this.A0P = str;
    }

    @Override // X.InterfaceC58287Psf
    public final void EUZ(int i) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        View view3;
        InterfaceC58201Pr7 interfaceC58201Pr7;
        int A05 = C0f9.A05(1928524615);
        C9KW c9kw = this.A08;
        if (c9kw != null) {
            if (c9kw instanceof C219919nd) {
                C219919nd c219919nd = (C219919nd) c9kw;
                C55208OeM c55208OeM = c219919nd.A05;
                if (c55208OeM != null && (interfaceC58201Pr7 = c55208OeM.A04) != null && interfaceC58201Pr7.isPlaying()) {
                    c219919nd.A0M(false);
                } else {
                    c219919nd.A0D();
                }
            } else {
                C9MF c9mf = (C9MF) c9kw;
                Object obj = ((C9KW) c9mf).A0C;
                C14360o3.A06(obj);
                synchronized (obj) {
                    if (((C9KW) c9mf).A0D && !c9mf.A0O()) {
                        if (c9mf.A06) {
                            if (c9mf.A07) {
                                C9MF.A01(c9mf);
                            } else {
                                c9mf.A0A();
                            }
                        } else {
                            C23105AGr c23105AGr = ((C9KW) c9mf).A07;
                            if (c23105AGr != null && (view3 = c23105AGr.A01) != null) {
                                view3.setVisibility(4);
                            }
                            c9mf.A09 = true;
                            if (c9mf.A08) {
                                C95334Qt c95334Qt = c9mf.A04;
                                if (c95334Qt != null) {
                                    c95334Qt.pause();
                                } else {
                                    throw AbstractC166997dE.A0g();
                                }
                            } else {
                                c9mf.A05 = C05F.A0C;
                                C9MF.A04(c9mf, C9MF.A00(c9mf), false);
                            }
                            InterfaceC25215BDn interfaceC25215BDn = ((C9KW) c9mf).A04;
                            if (interfaceC25215BDn != null) {
                                interfaceC25215BDn.E0B();
                            }
                            if (c23105AGr != null && (view2 = c23105AGr.A00) != null) {
                                view2.clearAnimation();
                                c23105AGr.A00.setVisibility(0);
                                View view4 = c23105AGr.A00;
                                Animation animation = c23105AGr.A02;
                                animation.getClass();
                                view4.startAnimation(animation);
                            }
                        }
                    }
                }
            }
        }
        C0f9.A0C(2120000117, A05);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C9KJ(android.content.Context r12, com.instagram.common.session.UserSession r13, X.C23105AGr r14, java.lang.String r15, boolean r16, boolean r17) {
        /*
            r11 = this;
            r1 = r12
            boolean r0 = r12 instanceof X.InterfaceC189598ae
            if (r0 == 0) goto L19
            r6 = r1
            X.8ae r6 = (X.InterfaceC189598ae) r6
        L8:
            X.BDq r4 = X.C9KW.A0E
            java.lang.Integer r7 = X.C05F.A00
            r2 = 0
            r0 = r11
            r3 = r13
            r5 = r14
            r8 = r15
            r9 = r16
            r10 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        L19:
            r6 = 0
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9KJ.<init>(android.content.Context, com.instagram.common.session.UserSession, X.AGr, java.lang.String, boolean, boolean):void");
    }
}
