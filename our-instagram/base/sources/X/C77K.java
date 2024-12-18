package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent;

/* renamed from: X.77K, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C77K {
    public boolean A00;
    public final Context A01;
    public final RecyclerView A02;
    public final C77I A03;
    public final RefreshableNestedScrollingParent A04;
    public final View.OnTouchListener A05 = new View.OnTouchListener() { // from class: X.77L
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            boolean z;
            String str;
            String str2;
            boolean A01;
            C14360o3.A0B(motionEvent, 1);
            C77K c77k = C77K.this;
            C77I c77i = c77k.A03;
            if (c77i != null && c77i.A01 != (A01 = c77k.A04.A01())) {
                c77i.A01 = A01;
                c77i.A00();
            }
            if (motionEvent.getAction() == 1) {
                RefreshableNestedScrollingParent refreshableNestedScrollingParent = c77k.A04;
                if (!refreshableNestedScrollingParent.A01()) {
                    if (c77k.A00) {
                        c77k.A00 = false;
                        if (c77k instanceof C77J) {
                            C77J c77j = (C77J) c77k;
                            C18920wW c18920wW = c77j.A00;
                            InterfaceC83733oI CCa = c77j.A02.C7r().CCa();
                            if (CCa != null) {
                                str2 = AbstractC1345466e.A07(CCa);
                            } else {
                                str2 = null;
                            }
                            C14360o3.A0B(c18920wW, 0);
                            InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_shh_mode_swipe_gesture");
                            A00.AAP("action", "cancel");
                            A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
                            A00.Cht();
                        }
                    }
                } else {
                    c77k.A00 = false;
                    c77k.A02.stopNestedScroll();
                    refreshableNestedScrollingParent.A0A = true;
                    if (c77k instanceof C77J) {
                        C77J c77j2 = (C77J) c77k;
                        C18920wW c18920wW2 = c77j2.A00;
                        InterfaceC83733oI CCa2 = c77j2.A02.C7r().CCa();
                        if (CCa2 != null) {
                            str = AbstractC1345466e.A07(CCa2);
                        } else {
                            str = null;
                        }
                        C14360o3.A0B(c18920wW2, 0);
                        InterfaceC02590Ai A002 = c18920wW2.A00(c18920wW2.A00, "direct_shh_mode_swipe_gesture");
                        A002.AAP("action", "succeed");
                        A002.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                        A002.Cht();
                        c77j2.A03.F80(new C9B7(!c77j2.A03(), 0, 1));
                    } else {
                        C77Q c77q = (C77Q) c77k;
                        boolean A03 = c77q.A03();
                        if (!A03) {
                            C7XW c7xw = c77q.A02;
                            if (C18U.A06(C06090Tz.A05, c7xw.A04, 36320283568513328L)) {
                                C7LI c7li = c7xw.A02;
                                if (c7li != null) {
                                    c7li.setVisibility(0);
                                }
                                C49035LmN c49035LmN = new C49035LmN(c7xw);
                                A7H a7h = new A7H(10, AbstractC70049W0j.A00);
                                C7LE c7le = c7xw.A01;
                                if (c7le == null) {
                                    C14360o3.A0F("emitterAnimationCanvasRenderer");
                                    throw C00O.createAndThrow();
                                }
                                AbstractC22705A0b.A00(c7le, a7h, new WjP(c49035LmN, c7xw), "🤫");
                            }
                        }
                        c77q.A03.F80(new C9B7(!A03, 0, 1));
                        C77I c77i2 = ((C77K) c77q).A03;
                        if (c77i2 != null && c77i2.A02 != (!c77q.A03())) {
                            c77i2.A02 = z;
                            c77i2.A00();
                        }
                    }
                    refreshableNestedScrollingParent.setRefreshing(false);
                }
            }
            if (view != null) {
                view.performClick();
            }
            return false;
        }
    };
    public final C1I4 A06;
    public final InterfaceC61462r9 A07;

    public final void A00() {
        if (this instanceof C77J) {
            ((C77J) this).A03.F80(new C9B7(!r0.A03(), 1, 1));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (X.C6X6.A0B(r3, r0, r1) == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (X.AbstractC31236DoJ.A02(r0, r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r1 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A01() {
        /*
            r6 = this;
            X.77I r2 = r6.A03
            if (r2 == 0) goto L11
            boolean r1 = r6.A03()
            boolean r0 = r2.A02
            if (r0 == r1) goto L11
            r2.A02 = r1
            r2.A00()
        L11:
            r5 = r6
            boolean r4 = r6 instanceof X.C77Q
            if (r4 == 0) goto L44
            X.77Q r5 = (X.C77Q) r5
            X.7U0 r1 = r5.A01
            X.7Ts r0 = r1.BT6()
            boolean r0 = r0.Ain()
            if (r0 != 0) goto L40
            com.instagram.common.session.UserSession r3 = r5.A00
            X.7Ux r2 = r1.C7r()
            X.3oG r0 = r2.C7i()
            X.C14360o3.A07(r0)
            boolean r1 = r0 instanceof X.InterfaceC83703oF
            X.7TT r0 = r2.C7W()
            X.C14360o3.A07(r0)
            boolean r0 = X.C6X6.A0B(r3, r0, r1)
            if (r0 != 0) goto L81
        L40:
            r6.A02()
        L43:
            return
        L44:
            X.77J r5 = (X.C77J) r5
            X.7U0 r1 = r5.A02
            X.7Ts r0 = r1.BT6()
            boolean r0 = r0.Ain()
            r3 = 0
            if (r0 != 0) goto L40
            X.7Ux r0 = r1.C7r()
            X.7TT r0 = r0.C7W()
            X.3kW r0 = r0.A0G
            boolean r2 = X.C161867Mw.A02(r0)
            boolean r0 = r5.A03()
            if (r0 == 0) goto L73
            com.instagram.common.session.UserSession r0 = r5.A01
            X.C14360o3.A0B(r0, r3)
            boolean r0 = X.AbstractC31236DoJ.A02(r0, r2)
            r1 = 1
            if (r0 == 0) goto L74
        L73:
            r1 = 0
        L74:
            com.instagram.common.session.UserSession r0 = r5.A01
            X.C14360o3.A0B(r0, r3)
            boolean r0 = X.AbstractC31236DoJ.A02(r0, r2)
            if (r0 != 0) goto L81
            if (r1 == 0) goto L40
        L81:
            androidx.recyclerview.widget.RecyclerView r1 = r6.A02
            X.1I4 r0 = r6.A06
            r1.A14(r0)
            android.view.View$OnTouchListener r0 = r6.A05
            r1.setOnTouchListener(r0)
            com.instagram.ui.widget.refresh.RefreshableNestedScrollingParent r3 = r6.A04
            android.content.Context r2 = r6.A01
            android.content.res.Resources r1 = r2.getResources()
            r0 = 2131165275(0x7f07005b, float:1.7944763E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r3.setRefreshingDistance(r0)
            r0 = 1
            r3.A09 = r0
            r0 = r6
            if (r4 == 0) goto L43
            X.77Q r0 = (X.C77Q) r0
            X.XiV r0 = r0.A04
            if (r0 == 0) goto L43
            X.C2UY.A01(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77K.A01():void");
    }

    public final void A02() {
        this.A02.A15(this.A06);
        this.A04.A0A = true;
    }

    public final boolean A03() {
        if (this instanceof C77J) {
            return ((C77J) this).A02.C7r().CWO();
        }
        C77Q c77q = (C77Q) this;
        return C6X6.A08(c77q.A00, c77q.A01.C7r().C7W());
    }

    public C77K(Context context, RecyclerView recyclerView, C77I c77i, RefreshableNestedScrollingParent refreshableNestedScrollingParent) {
        this.A01 = context;
        this.A04 = refreshableNestedScrollingParent;
        this.A03 = c77i;
        this.A02 = recyclerView;
        InterfaceC61462r9 interfaceC61462r9 = new InterfaceC61462r9() { // from class: X.77M
            @Override // X.InterfaceC61462r9
            public final void E6p(float f, float f2) {
                String str;
                if (f == 0.0f && f2 > 0.0f) {
                    C77K c77k = C77K.this;
                    c77k.A00 = true;
                    if (c77k instanceof C77J) {
                        C77J c77j = (C77J) c77k;
                        C18920wW c18920wW = c77j.A00;
                        InterfaceC83733oI CCa = c77j.A02.C7r().CCa();
                        if (CCa != null) {
                            str = AbstractC1345466e.A07(CCa);
                        } else {
                            str = null;
                        }
                        C14360o3.A0B(c18920wW, 0);
                        InterfaceC02590Ai A00 = c18920wW.A00(c18920wW.A00, "direct_shh_mode_swipe_gesture");
                        A00.AAP("action", "start");
                        A00.AAP(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
                        A00.Cht();
                    }
                }
                C77K c77k2 = C77K.this;
                if ((c77k2 instanceof C77Q) && ((C77Q) c77k2).A04 != null) {
                    RefreshableNestedScrollingParent refreshableNestedScrollingParent2 = c77k2.A04;
                    if (f2 < 0.0f) {
                        f2 = 0.0f;
                    }
                    refreshableNestedScrollingParent2.A00 = 0.8f - (((float) Math.log10((f2 / 5.5f) + 1.0f)) * 5.5f);
                }
            }
        };
        this.A07 = interfaceC61462r9;
        this.A06 = new C1I4() { // from class: X.77N
            @Override // X.C1I4
            public final void onScrollStateChanged(RecyclerView recyclerView2, int i) {
                int A03 = C0f9.A03(-288780856);
                C14360o3.A0B(recyclerView2, 0);
                C77K.this.A04.A0A = recyclerView2.canScrollVertically(1);
                C0f9.A0A(175168478, A03);
            }
        };
        refreshableNestedScrollingParent.A08 = c77i;
        refreshableNestedScrollingParent.A06 = interfaceC61462r9;
    }
}
