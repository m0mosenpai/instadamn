package X;

import android.content.Context;
import android.view.ViewStub;
import com.facebook.R;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.ui.emptystaterow.EmptyStateView;

/* renamed from: X.K8e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45391K8e extends AnonymousClass935 {
    public final java.util.Set A00;
    public final /* synthetic */ LLk A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C45391K8e(UserSession userSession, LLk lLk) {
        super(userSession);
        this.A01 = lLk;
        this.A00 = AbstractC166987dD.A1H();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x009d, code lost:
    
        if (r1 >= 10) goto L34;
     */
    @Override // X.AnonymousClass935
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A06(com.instagram.common.session.UserSession r15, java.lang.Object r16) {
        /*
            r14 = this;
            r1 = r16
            r0 = -1286985521(0xffffffffb34a28cf, float:-4.7068905E-8)
            int r4 = X.C0f9.A03(r0)
            X.99Z r1 = (X.C99Z) r1
            r0 = -238863592(0xfffffffff1c33b18, float:-1.9334725E30)
            int r5 = X.C0f9.A03(r0)
            X.JWT r0 = r1.A05
            java.util.List r8 = r0.A05
            java.util.Iterator r13 = r8.iterator()
        L1a:
            boolean r0 = r13.hasNext()
            r9 = 0
            r12 = 1
            if (r0 == 0) goto L75
            java.lang.Object r10 = r13.next()
            X.JUs r10 = (X.C43707JUs) r10
            X.LLk r0 = r14.A01
            java.util.List r3 = r0.A12
            monitor-enter(r3)
            java.util.Iterator r11 = r3.iterator()     // Catch: java.lang.Throwable -> L6c
        L31:
            boolean r0 = r11.hasNext()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L67
            java.lang.Object r2 = r11.next()     // Catch: java.lang.Throwable -> L6c
            X.2EC r2 = (X.C2EC) r2     // Catch: java.lang.Throwable -> L6c
            java.lang.String r1 = r10.A1E     // Catch: java.lang.Throwable -> L6c
            java.lang.String r0 = r2.C7I()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L31
            X.3nh r0 = r10.A00     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L31
            X.3nh r0 = r2.BLX()     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L31
            X.3nh r0 = r10.A00     // Catch: java.lang.Throwable -> L6c
            long r6 = r0.C8i()     // Catch: java.lang.Throwable -> L6c
            X.3nh r0 = r2.BLX()     // Catch: java.lang.Throwable -> L6c
            long r1 = r0.C8i()     // Catch: java.lang.Throwable -> L6c
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 != 0) goto L31
        L65:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            goto L69
        L67:
            r12 = 0
            goto L65
        L69:
            if (r12 != 0) goto L1a
            goto L76
        L6c:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L6c
            r0 = 1580390901(0x5e32d9f5, float:3.2219003E18)
            X.C0f9.A0A(r0, r5)
            throw r1
        L75:
            r9 = 1
        L76:
            X.LLk r7 = r14.A01
            X.KWM r6 = r7.A04
            java.lang.String r3 = "is_cache_recent"
            r6.A0K(r3, r9)
            X.Jfj r2 = r7.A0n
            r1 = 4
            X.D8R r0 = new X.D8R
            r0.<init>(r2, r3, r1, r9)
            X.AbstractC44190Jft.A00(r2, r0)
            boolean r0 = r7.A0L
            if (r0 == 0) goto L9f
            boolean r0 = r7.A0K
            if (r0 == 0) goto L9f
            int r0 = r8.size()
            int r1 = r7.A00
            int r1 = r1 + r0
            r7.A00 = r1
            r0 = 10
            if (r1 < r0) goto La4
        L9f:
            X.3Av r0 = r6.A01
            r0.A05()
        La4:
            java.lang.String r1 = "fetch_threads_server_end"
            r0 = 0
            r2.A04(r1, r0)
            r0 = -1674296843(0xffffffff9c3441f5, float:-5.964225E-22)
            X.C0f9.A0A(r0, r5)
            r0 = -1018848024(0xffffffffc3459ce8, float:-197.61292)
            X.C0f9.A0A(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45391K8e.A06(com.instagram.common.session.UserSession, java.lang.Object):void");
    }

    @Override // X.AnonymousClass935
    public final void A01(UserSession userSession) {
        C47438KxT c47438KxT;
        int A03 = C0f9.A03(469595625);
        LLk lLk = this.A01;
        if (lLk.A0L) {
            lLk.A04.A01.A05();
            lLk.A0K = false;
            lLk.A0L = false;
        }
        lLk.A0Q = true;
        if (lLk.A0O && (c47438KxT = lLk.A07) != null) {
            KBM kbm = c47438KxT.A00;
            if (kbm.A06 != null && kbm.A00 != null && kbm.A02 != null) {
                C3FR c3fr = kbm.A05;
                if (c3fr != null) {
                    c3fr.EWc(false);
                }
                EmptyStateView emptyStateView = kbm.A06;
                if (emptyStateView != null) {
                    emptyStateView.setVisibility(8);
                    ViewStub viewStub = kbm.A00;
                    if (viewStub != null) {
                        viewStub.setVisibility(0);
                        IgFrameLayout igFrameLayout = kbm.A02;
                        if (igFrameLayout != null) {
                            igFrameLayout.sendAccessibilityEvent(8);
                        } else {
                            throw AbstractC166987dD.A14("Required value was null.");
                        }
                    } else {
                        throw AbstractC166987dD.A14("Required value was null.");
                    }
                } else {
                    throw AbstractC166987dD.A14("Required value was null.");
                }
            }
        } else {
            lLk.A0r.A00();
        }
        if (lLk.A02 == EnumC46220Kcw.A08) {
            lLk.A0A = AbstractC31173DnH.A0g();
        }
        LLk.A0J(lLk);
        C0f9.A0A(302617621, A03);
    }

    @Override // X.AnonymousClass935
    public final void A02(UserSession userSession) {
        C3FR c3fr;
        int A03 = C0f9.A03(-524988375);
        LLk lLk = this.A01;
        if (lLk.A0O) {
            C47438KxT c47438KxT = lLk.A07;
            if (c47438KxT != null) {
                KBM kbm = c47438KxT.A00;
                if (kbm.A06 != null && kbm.A00 != null && (c3fr = kbm.A05) != null) {
                    c3fr.ElT();
                }
            }
        } else if (lLk.A0J) {
            lLk.A0F = false;
            lLk.A0G = false;
        } else {
            java.util.Set set = this.A00;
            set.clear();
            set.addAll(lLk.A12);
        }
        C0f9.A0A(746944677, A03);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        String str;
        String str2;
        boolean A0E;
        int i;
        int A03 = C0f9.A03(-2100455179);
        Throwable A01 = abstractC115105If.A01();
        if (A01 != null) {
            str = A01.getMessage();
        } else {
            str = null;
        }
        LLk lLk = this.A01;
        lLk.A01 = 0L;
        KWM kwm = lLk.A04;
        kwm.A01.A01();
        if (str != null) {
            kwm.A0J("error_message", str);
            lLk.A03.A05(str);
        } else {
            lLk.A03.A05("FETCH_THREADS_FAILED");
        }
        C44180Jfj c44180Jfj = lLk.A0n;
        if (str != null) {
            c44180Jfj.A03("error_message", str);
        }
        AbstractC44190Jft.A00(c44180Jfj, new DH5((AbstractC44190Jft) c44180Jfj, "fetch_threads_fail", (String) null, 26));
        boolean z = lLk.A0O;
        KXD kxd = lLk.A0o;
        boolean z2 = lLk.A0J;
        kxd.A02 = false;
        if (!z) {
            if (z2) {
                str2 = "thread_fetch_failed_pending";
            } else {
                str2 = "thread_fetch_more_failed_pending";
            }
        } else if (z2) {
            str2 = "thread_fetch_failed_other";
        } else {
            str2 = "thread_fetch_more_failed_other";
        }
        if (str != null) {
            kxd.A03("error_message", str);
        }
        AbstractC44190Jft.A00(kxd, new DH5((AbstractC44190Jft) kxd, str2, "server", 26));
        LLk.A0J(lLk);
        boolean z3 = abstractC115105If instanceof C115115Ig;
        if (lLk.A0b.isResumed()) {
            boolean A0T = LLk.A0T(lLk);
            Context context = lLk.A0Y;
            UserSession userSession2 = lLk.A0h;
            if (A0T) {
                AbstractC167007dF.A1K(context, userSession2);
                C146106i8 A0K = AbstractC31171DnF.A0K();
                A0K.A06();
                if (z3) {
                    i = 2131959910;
                } else {
                    if (C18U.A06(C06090Tz.A05, userSession2, 36331252910998753L)) {
                        A0E = AbstractC15820qc.A0F(context);
                    } else {
                        A0E = AbstractC15820qc.A0E(AbstractC166987dD.A0O(context));
                    }
                    if (A0E) {
                        C47964LHk.A00("DirectWeakConnectionError");
                        i = 2131960869;
                    } else {
                        i = 2131959975;
                    }
                }
                AbstractC25226BEj.A1N(context, A0K, i);
                AbstractC25233BEq.A1F(A0K);
            } else {
                AbstractC46744Km1.A00(userSession2, context, z3);
            }
        }
        C0f9.A0A(190330850, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        String str;
        C214449ei c214449ei;
        String str2;
        int A03 = C0f9.A03(-609366658);
        C99Z c99z = (C99Z) obj;
        int A032 = C0f9.A03(-1274426530);
        LLk lLk = this.A01;
        lLk.A0E = true;
        boolean z = lLk.A0O;
        KXD kxd = lLk.A0o;
        boolean z2 = lLk.A0J;
        if (!z) {
            KXD.A01(EnumC31648DvE.A08, kxd, z2, true);
            java.util.Set set = this.A00;
            LLk.A0L(lLk);
            lLk.A0G = !set.containsAll(lLk.A12);
            set.clear();
        } else {
            KXD.A01(EnumC31648DvE.A0B, kxd, z2, true);
        }
        C43782JXv c43782JXv = lLk.A03;
        c43782JXv.A01.markerPoint(20125924, AnonymousClass001.A0c("inbox_fetch_", "_end", c43782JXv.A00));
        LLk.A0J(lLk);
        L8U l8u = lLk.A0r;
        boolean z3 = lLk.A0J;
        KCO kco = l8u.A00;
        if (kco.isAdded()) {
            C3FR c3fr = kco.A03;
            if (c3fr != null && z3) {
                c3fr.EMU(kco);
            }
            C3FR c3fr2 = kco.A03;
            if (c3fr2 != null) {
                if (kco.isResumed() && !kco.A06 && c3fr2.BM3() == c3fr2.getCount() - 1) {
                    kco.A06().A0c();
                } else {
                    kco.A06().A03.A01.markerEnd(20125924, (short) 2);
                }
            }
            KCO.A03(kco);
        }
        lLk.A0J = false;
        if (lLk.A0L) {
            lLk.A0K = false;
        }
        if (LLk.A0U(lLk)) {
            lLk.A0I = true;
        }
        C44180Jfj c44180Jfj = lLk.A0n;
        c44180Jfj.A04("threads_rendered_server", null);
        AbstractC44190Jft.A00(c44180Jfj, new C50159MDm(c44180Jfj, 15));
        EnumC31648DvE A0W = lLk.A0W();
        C14360o3.A0B(A0W, 0);
        if (EnumC31648DvE.A08 == A0W) {
            str = "threads_rendered_pending";
        } else {
            str = "threads_rendered_other";
        }
        kxd.A04(str, "server");
        UserSession userSession2 = lLk.A0h;
        C14360o3.A0B(userSession2, 0);
        if (C18U.A06(C06090Tz.A06, userSession2, 36316259180155081L)) {
            AbstractC59962oe abstractC59962oe = lLk.A0b;
            if (abstractC59962oe.isResumed() && c99z != null && abstractC59962oe.getActivity() != null) {
                C2056398n c2056398n = lLk.A0s;
                InterfaceC16530ry interfaceC16530ry = c2056398n.A0L;
                C0YR[] c0yrArr = C2056398n.A0d;
                if (!AbstractC167017dG.A1b(c2056398n, interfaceC16530ry, c0yrArr, 11) && (c214449ei = c99z.A07) != null) {
                    String str3 = c214449ei.A01;
                    if (str3 != null) {
                        if (str3.length() > 0) {
                            C146106i8 A0X = AbstractC31173DnH.A0X(str3);
                            String str4 = c214449ei.A00;
                            if (str4 != null) {
                                A0X.A0I = str4;
                                A0X.A02();
                                A0X.A07(R.drawable.instagram_eye_off_pano_outline_24);
                                A0X.A06();
                                AbstractC31178DnM.A1S(A0X);
                                AbstractC167007dF.A1L(c2056398n, interfaceC16530ry, c0yrArr, 11, true);
                            } else {
                                str2 = DevServerEntity.COLUMN_DESCRIPTION;
                            }
                        }
                    } else {
                        str2 = DialogModule.KEY_TITLE;
                    }
                    C14360o3.A0F(str2);
                    throw C00O.createAndThrow();
                }
            }
        }
        C0f9.A0A(-482288682, A032);
        C0f9.A0A(1469333546, A03);
    }
}
