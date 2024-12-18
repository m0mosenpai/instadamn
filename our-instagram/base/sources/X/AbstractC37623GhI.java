package X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.mediaactions.ScrubberPreviewThumbnailView;

/* renamed from: X.GhI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC37623GhI implements InterfaceC60602pj {
    public SwipeRefreshLayout A00;
    public IN9 A01;
    public C37556GgC A02;
    public INA A03;

    public final void A08(SwipeRefreshLayout swipeRefreshLayout, INA ina, IN9 in9, C37556GgC c37556GgC) {
        C14360o3.A0B(ina, 3);
        this.A02 = c37556GgC;
        this.A00 = swipeRefreshLayout;
        this.A01 = in9;
        this.A03 = ina;
        A0A();
    }

    @Override // X.InterfaceC60602pj
    public final /* synthetic */ void ADK(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void D8S(View view) {
    }

    @Override // X.InterfaceC60602pj
    public final void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // X.InterfaceC60602pj
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // X.InterfaceC60602pj
    public final void onCreate() {
    }

    @Override // X.InterfaceC60602pj
    public final void onDestroy() {
    }

    @Override // X.InterfaceC60602pj
    public final void onSaveInstanceState(Bundle bundle) {
    }

    @Override // X.InterfaceC60602pj
    public final void onStart() {
    }

    @Override // X.InterfaceC60602pj
    public final void onStop() {
    }

    @Override // X.InterfaceC60602pj
    public final void onViewStateRestored(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13, types: [X.Gge] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.Hbs] */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.Gl5] */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.Ggm] */
    public void A09() {
        C39467Hbt c39467Hbt;
        if (this instanceof C37582Ggd) {
            C37582Ggd c37582Ggd = (C37582Ggd) this;
            C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
            if (c37556GgC != null) {
                c37556GgC.A0H(c37582Ggd);
            }
            FrameLayout frameLayout = c37582Ggd.A03;
            if (frameLayout != null) {
                frameLayout.removeView(c37582Ggd.A01);
            }
            c37582Ggd.A03 = null;
            c37582Ggd.A02 = null;
            c37582Ggd.A01 = null;
            ScrubberPreviewThumbnailView scrubberPreviewThumbnailView = c37582Ggd.A05;
            if (scrubberPreviewThumbnailView != null) {
                scrubberPreviewThumbnailView.A03 = null;
            }
            IgTextView igTextView = c37582Ggd.A04;
            if (igTextView != null) {
                igTextView.setVisibility(8);
            }
            c37582Ggd.A05 = null;
            c37582Ggd.A04 = null;
            return;
        }
        if (this instanceof C37583Gge) {
            c39467Hbt = (C37583Gge) this;
        } else {
            if (this instanceof C37705Gig) {
                C37705Gig c37705Gig = (C37705Gig) this;
                C37556GgC c37556GgC2 = ((AbstractC37623GhI) c37705Gig).A02;
                if (c37556GgC2 == null) {
                    return;
                }
                c37556GgC2.A0H(c37705Gig.A02);
                return;
            }
            if (this instanceof C37591Ggm) {
                c39467Hbt = (C37591Ggm) this;
            } else {
                if (this instanceof C37625GhK) {
                    C37625GhK c37625GhK = (C37625GhK) this;
                    C37556GgC c37556GgC3 = ((AbstractC37623GhI) c37625GhK).A02;
                    if (c37556GgC3 != null) {
                        c37556GgC3.A0H(c37625GhK.A03);
                    }
                    Handler handler = c37625GhK.A02;
                    handler.removeCallbacks(c37625GhK.A06);
                    handler.removeCallbacks(c37625GhK.A07);
                    return;
                }
                if (this instanceof C37851Gl5) {
                    c39467Hbt = (C37851Gl5) this;
                } else if (this instanceof C39466Hbs) {
                    c39467Hbt = (C39466Hbs) this;
                } else if (!(this instanceof C39467Hbt)) {
                    return;
                } else {
                    c39467Hbt = (C39467Hbt) this;
                }
            }
        }
        C37556GgC c37556GgC4 = ((AbstractC37623GhI) c39467Hbt).A02;
        if (c37556GgC4 == null) {
            return;
        }
        c37556GgC4.A0H(c39467Hbt);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.2pm, X.1I2] */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [X.3FQ, X.3FP] */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.3FP] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.Gge] */
    /* JADX WARN: Type inference failed for: r5v6, types: [X.GhC, X.GhI] */
    public void A0A() {
        int A03;
        int i;
        C37556GgC c37556GgC;
        C37521Gfd c37521Gfd;
        C37556GgC c37556GgC2;
        int i2;
        View view;
        String str;
        ViewPager2 viewPager2;
        int i3;
        C39466Hbs c39466Hbs;
        ?? r4;
        RecyclerView A00;
        if (this instanceof C37784Gjz) {
            C37784Gjz c37784Gjz = (C37784Gjz) this;
            C37556GgC c37556GgC3 = ((AbstractC37623GhI) c37784Gjz).A02;
            if (c37556GgC3 != null) {
                c37556GgC3.A0G(c37784Gjz);
                if (c37784Gjz.A07) {
                    int A032 = c37556GgC3.A03();
                    C37556GgC c37556GgC4 = ((AbstractC37623GhI) c37784Gjz).A02;
                    if (c37556GgC4 != null && A032 == C37546Gg2.A00(c37556GgC4.A09) - 1) {
                        C37784Gjz.A00(c37784Gjz, c37784Gjz.A04, 2131955935, false);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C37726Gj1) {
            C37726Gj1 c37726Gj1 = (C37726Gj1) this;
            c37556GgC = ((AbstractC37623GhI) c37726Gj1).A02;
            if (c37556GgC == null) {
                return;
            } else {
                c37521Gfd = c37726Gj1.A05;
            }
        } else if (this instanceof C37705Gig) {
            C37705Gig c37705Gig = (C37705Gig) this;
            c37556GgC = ((AbstractC37623GhI) c37705Gig).A02;
            if (c37556GgC == null) {
                return;
            } else {
                c37521Gfd = c37705Gig.A02;
            }
        } else if (this instanceof C37578GgZ) {
            C37578GgZ c37578GgZ = (C37578GgZ) this;
            if (c37578GgZ.A05.A0K == null || (c37556GgC = ((AbstractC37623GhI) c37578GgZ).A02) == null) {
                return;
            } else {
                c37521Gfd = new C37521Gfd(c37578GgZ, 6);
            }
        } else {
            if (this instanceof C37716Gir) {
                C37716Gir c37716Gir = (C37716Gir) this;
                C37556GgC c37556GgC5 = ((AbstractC37623GhI) c37716Gir).A02;
                if (c37556GgC5 != null) {
                    c37556GgC5.A0G(c37716Gir);
                }
                C44496Jm2 c44496Jm2 = c37716Gir.A07;
                if (c44496Jm2 == null) {
                    return;
                }
                AbstractC37301Gc2.A0w(c37716Gir.A04.getViewLifecycleOwner(), c44496Jm2.A02, new DRX(c37716Gir, 19), 49);
                AbstractC166987dD.A1Z(new MCA(c44496Jm2, null), AbstractC141776au.A00(c44496Jm2));
                return;
            }
            if (this instanceof C37617GhC) {
                ?? r5 = (C37617GhC) this;
                C37556GgC c37556GgC6 = r5.A02;
                if (c37556GgC6 != null && (A00 = C37556GgC.A00(c37556GgC6)) != null) {
                    r4 = new C3FP(A00);
                } else {
                    r4 = null;
                }
                r5.A00 = r4;
                c39466Hbs = r5;
                if (r4 != null) {
                    ?? r2 = r5.A03;
                    r4.AAJ(r2);
                    if (r5.A07) {
                        C57982lB.A0B.A04(r5.A02, new J1U(r4, r5), true);
                        c39466Hbs = r5;
                    } else {
                        r2.A06(r5.A04, r4, r5.A01);
                        c39466Hbs = r5;
                    }
                }
            } else {
                if (this instanceof C37591Ggm) {
                    C37591Ggm c37591Ggm = (C37591Ggm) this;
                    C37556GgC c37556GgC7 = ((AbstractC37623GhI) c37591Ggm).A02;
                    if (c37556GgC7 != null) {
                        c37556GgC7.A0G(c37591Ggm);
                    }
                    C37591Ggm.A00(c37591Ggm);
                    return;
                }
                if (this instanceof C37555GgB) {
                    C37555GgB c37555GgB = (C37555GgB) this;
                    C37556GgC c37556GgC8 = ((AbstractC37623GhI) c37555GgB).A02;
                    if (c37556GgC8 != null) {
                        c37556GgC8.A0G(c37555GgB);
                    }
                    C37556GgC c37556GgC9 = ((AbstractC37623GhI) c37555GgB).A02;
                    if (c37556GgC9 != null) {
                        i3 = c37556GgC9.A03();
                    } else {
                        i3 = c37555GgB.A00;
                    }
                    c37555GgB.A00 = i3;
                    return;
                }
                if (this instanceof C37582Ggd) {
                    C37582Ggd c37582Ggd = (C37582Ggd) this;
                    C37556GgC c37556GgC10 = ((AbstractC37623GhI) c37582Ggd).A02;
                    if (c37556GgC10 != null) {
                        c37556GgC10.A0G(c37582Ggd);
                    }
                    c37582Ggd.A09.A99(c37582Ggd);
                    C37556GgC c37556GgC11 = ((AbstractC37623GhI) c37582Ggd).A02;
                    if (c37556GgC11 != null) {
                        i2 = c37556GgC11.A03();
                    } else {
                        i2 = c37582Ggd.A00;
                    }
                    c37582Ggd.A00 = i2;
                    UserSession userSession = c37582Ggd.A08;
                    if (!(!(!C18U.A06(AbstractC166997dE.A0U(userSession), userSession, 36317620685510059L))) || (view = c37582Ggd.A02) == null) {
                        return;
                    }
                    FrameLayout frameLayout = null;
                    FrameLayout parent = view.getParent();
                    if (!c37582Ggd.A0A) {
                        if (parent instanceof ViewGroup) {
                            parent = (ViewGroup) parent;
                        } else {
                            parent = 0;
                        }
                        while (true) {
                            if (parent != 0) {
                                if (parent.findViewById(R.id.tab_bar) != null) {
                                    break;
                                }
                                ViewParent parent2 = parent.getParent();
                                if (parent2 instanceof ViewGroup) {
                                    parent = (ViewGroup) parent2;
                                } else {
                                    parent = 0;
                                }
                            } else {
                                parent = 0;
                                break;
                            }
                        }
                    }
                    if (parent instanceof FrameLayout) {
                        frameLayout = parent;
                    } else {
                        if (parent == 0 || (str = parent.toString()) == null) {
                            str = "";
                        }
                        C0w9.A03("ClipsScrubberExpandedTouchViewError", AnonymousClass001.A0R("Failed to find parent FrameLayout to attach to! ", str));
                    }
                    c37582Ggd.A03 = frameLayout;
                    C37556GgC c37556GgC12 = ((AbstractC37623GhI) c37582Ggd).A02;
                    if (c37556GgC12 == null || (viewPager2 = c37556GgC12.A00) == null) {
                        return;
                    }
                    viewPager2.post(new RunnableC25357BKa(c37582Ggd));
                    return;
                }
                if (this instanceof C37625GhK) {
                    C37625GhK c37625GhK = (C37625GhK) this;
                    c37625GhK.A00 = SystemClock.elapsedRealtime();
                    if (c37625GhK.A04.A0H == EnumC116885Qs.A05 && (c37556GgC2 = ((AbstractC37623GhI) c37625GhK).A02) != null) {
                        c37556GgC2.A0I(false);
                    }
                    c37625GhK.A0B();
                    if (c37625GhK.A01 || (c37556GgC = ((AbstractC37623GhI) c37625GhK).A02) == null) {
                        return;
                    } else {
                        c37521Gfd = c37625GhK.A03;
                    }
                } else if (this instanceof C37583Gge) {
                    c39466Hbs = (C37583Gge) this;
                } else {
                    if (this instanceof C37602Ggx) {
                        C37602Ggx c37602Ggx = (C37602Ggx) this;
                        C37556GgC c37556GgC13 = ((AbstractC37623GhI) c37602Ggx).A02;
                        if (c37556GgC13 != null) {
                            c37556GgC13.A0G(c37602Ggx);
                        }
                        c37602Ggx.A02.A99(c37602Ggx);
                        C37556GgC c37556GgC14 = ((AbstractC37623GhI) c37602Ggx).A02;
                        if (c37556GgC14 != null) {
                            i = c37556GgC14.A03();
                        } else {
                            i = c37602Ggx.A00;
                        }
                        c37602Ggx.A00 = i;
                        return;
                    }
                    if (this instanceof C37851Gl5) {
                        C37851Gl5 c37851Gl5 = (C37851Gl5) this;
                        C37556GgC c37556GgC15 = ((AbstractC37623GhI) c37851Gl5).A02;
                        if (c37556GgC15 != null) {
                            c37556GgC15.A0G(c37851Gl5);
                        }
                        c37851Gl5.A0C();
                        return;
                    }
                    if (this instanceof C37897Gls) {
                        C37897Gls c37897Gls = (C37897Gls) this;
                        C37556GgC c37556GgC16 = ((AbstractC37623GhI) c37897Gls).A02;
                        if (c37556GgC16 != null) {
                            c37556GgC16.A0G(c37897Gls);
                        }
                        c37897Gls.A08.A02.add(c37897Gls);
                        C37897Gls.A02(c37897Gls);
                        return;
                    }
                    if (this instanceof C39464Hbq) {
                        C39464Hbq c39464Hbq = (C39464Hbq) this;
                        C37556GgC c37556GgC17 = ((AbstractC37623GhI) c39464Hbq).A02;
                        if (c37556GgC17 != null) {
                            c37556GgC17.A0G(c39464Hbq.A02);
                        }
                        C37556GgC c37556GgC18 = ((AbstractC37623GhI) c39464Hbq).A02;
                        if (c37556GgC18 == null || (A03 = c37556GgC18.A03()) <= 0) {
                            return;
                        }
                        c39464Hbq.A02.DXc(A03, -1);
                        return;
                    }
                    if (this instanceof C39466Hbs) {
                        c39466Hbs = (C39466Hbs) this;
                    } else {
                        if (!(this instanceof C39468Hbu)) {
                            return;
                        }
                        C39468Hbu c39468Hbu = (C39468Hbu) this;
                        c39468Hbu.A01.A99(c39468Hbu);
                        return;
                    }
                }
            }
            C37556GgC c37556GgC19 = c39466Hbs.A02;
            if (c37556GgC19 == null) {
                return;
            }
            c37556GgC19.A0G(c39466Hbs);
            return;
        }
        c37556GgC.A0G(c37521Gfd);
    }

    @Override // X.InterfaceC60602pj
    public void onPause() {
        View view;
        if (this instanceof C37617GhC) {
            C37617GhC c37617GhC = (C37617GhC) this;
            ViewOnTouchListenerC60632pm viewOnTouchListenerC60632pm = c37617GhC.A03;
            C3FQ c3fq = c37617GhC.A00;
            int i = C1I2.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            viewOnTouchListenerC60632pm.A09(c3fq);
            return;
        }
        if (!(this instanceof C37582Ggd) || (view = ((C37582Ggd) this).A01) == null) {
            return;
        }
        view.setVisibility(8);
    }

    @Override // X.InterfaceC60602pj
    public void onResume() {
        int i;
        if (this instanceof C37617GhC) {
            C37617GhC c37617GhC = (C37617GhC) this;
            if (c37617GhC.A07) {
                C57982lB.A0B.A04(c37617GhC.A02, new C65860TvN(c37617GhC, 6), true);
                return;
            }
            c37617GhC.A03.A05(c37617GhC.A05, C16930sl.A00, c37617GhC.A06, c37617GhC.A01, true);
            return;
        }
        if (!(this instanceof C37582Ggd)) {
            return;
        }
        C37582Ggd c37582Ggd = (C37582Ggd) this;
        C37556GgC c37556GgC = ((AbstractC37623GhI) c37582Ggd).A02;
        if (c37556GgC != null) {
            i = c37556GgC.A03();
        } else {
            i = c37582Ggd.A00;
        }
        c37582Ggd.A00 = i;
        C37582Ggd.A01(c37582Ggd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0A, 36316899130872528L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0A, 36318191915440132L) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4.A0A, 36318191915571206L) != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.2UU, X.Gtl] */
    @Override // X.InterfaceC60602pj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onViewCreated(android.view.View r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC37623GhI.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    @Override // X.InterfaceC60602pj
    public void onDestroyView() {
        A09();
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A03 = null;
    }
}
