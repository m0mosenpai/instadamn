package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.BKo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25371BKo implements JI2, JIH, C38Y, InterfaceC43071ya {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public ValueAnimator A06;
    public CountDownTimer A07;
    public RecyclerView A08;
    public C120985dq A09;
    public GradientSpinner A0A;
    public WeakReference A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final float A0K;
    public final long A0L;
    public final Context A0M;
    public final C25908BdB A0N;
    public final C51758Mth A0O;
    public final C37521Gfd A0P;
    public final InterfaceC31077DlK A0Q;
    public final UserSession A0R;
    public final InterfaceC60442pS A0S;
    public final CUJ A0T;
    public final InterfaceC16820sZ A0U;
    public final InterfaceC16820sZ A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final float A0c;
    public final int A0d;
    public final Map A0e;

    public C25371BKo(Context context, InterfaceC31077DlK interfaceC31077DlK, UserSession userSession, InterfaceC60442pS interfaceC60442pS, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2) {
        this.A0R = userSession;
        this.A0M = context;
        this.A0S = interfaceC60442pS;
        this.A0U = interfaceC16820sZ;
        this.A0V = interfaceC16820sZ2;
        this.A0Q = interfaceC31077DlK;
        CUJ cuj = new CUJ(userSession);
        cuj.A04 = DRX.A00(this, 18);
        cuj.A02 = new BQP(this, 13);
        cuj.A03 = new BQP(this, 14);
        cuj.A01 = new BQP(this, 15);
        this.A0T = cuj;
        C06090Tz c06090Tz = C06090Tz.A06;
        int A00 = (int) C18U.A00(c06090Tz, userSession, 37167281180115393L);
        this.A0d = A00;
        long j = A00 * 1000;
        this.A0L = j;
        this.A0K = AbstractC25225BEi.A00(c06090Tz, userSession, 37167281180180930L);
        this.A0b = C18U.A06(c06090Tz, userSession, 36322856249862842L);
        this.A0W = C18U.A06(c06090Tz, userSession, 36322856250256062L);
        this.A0a = BT8.A00(userSession);
        this.A0X = C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250583743L);
        this.A0Z = C18U.A06(AbstractC25228BEl.A0l(userSession), userSession, 36322856250780353L);
        this.A0Y = BNP.A01(userSession);
        this.A0c = Settings.Global.getFloat(context.getContentResolver(), AbstractC111324zv.A00(172), 1.0f);
        this.A0O = new C51758Mth(false, (Integer) null, 3, (DefaultConstructorMarker) null, 48);
        this.A0e = AbstractC166987dD.A1I();
        this.A05 = j;
        this.A06 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.A00 = 1.0f;
        this.A0P = new C37521Gfd(this, 3);
        this.A0N = new C25908BdB(this, 7);
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        View view;
        AbstractC167007dF.A1K(c59062n7, interfaceC57162jr);
        Integer CFq = interfaceC57162jr.CFq(c59062n7);
        C14360o3.A07(CFq);
        Object obj = c59062n7.A03;
        C14360o3.A06(obj);
        Integer num = C05F.A00;
        if (CT4((C120985dq) obj, Boolean.valueOf(AbstractC167007dF.A1X(CFq, num)))) {
            int intValue = CFq.intValue();
            if (intValue != 0) {
                if (intValue == 2) {
                    AbstractC25226BEj.A17(this.A0U).A0H(this.A0P);
                    RecyclerView recyclerView = this.A08;
                    if (recyclerView != null) {
                        recyclerView.A15(this.A0N);
                    }
                    if (!this.A0I) {
                        A06(this, C05F.A0N);
                        A02();
                    }
                } else {
                    return;
                }
            } else {
                C51758Mth c51758Mth = this.A0O;
                c51758Mth.A01 = false;
                c51758Mth.A00 = num;
                InterfaceC16820sZ interfaceC16820sZ = this.A0U;
                AbstractC25226BEj.A17(interfaceC16820sZ).A0G(this.A0P);
                ViewPager2 viewPager2 = AbstractC25226BEj.A17(interfaceC16820sZ).A00;
                RecyclerView recyclerView2 = null;
                if (viewPager2 != null) {
                    view = viewPager2.getChildAt(0);
                } else {
                    view = null;
                }
                if (view instanceof RecyclerView) {
                    recyclerView2 = (RecyclerView) view;
                }
                this.A08 = recyclerView2;
                if (recyclerView2 != null) {
                    recyclerView2.A14(this.A0N);
                }
                if (this.A0D) {
                    this.A0G = false;
                }
                this.A0I = false;
                this.A0H = false;
            }
            this.A0B = null;
        }
    }

    @Override // X.JI2
    public final int BmI(C120985dq c120985dq) {
        long j;
        if (this.A0Y || !c120985dq.CdW() || !BNP.A00(c120985dq, this.A0R)) {
            return 0;
        }
        if (this.A0H) {
            return this.A01;
        }
        Long A01 = A01(c120985dq, this);
        if (A01 != null) {
            j = A01.longValue();
            long j2 = this.A0L;
            if (j == j2) {
                j = j2;
            }
        } else {
            j = this.A0L;
        }
        return C1H4.A01(((float) j) / 1000.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r0.longValue() != 0) goto L12;
     */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.BeZ] */
    @Override // X.JI2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean CT4(X.C120985dq r10, java.lang.Boolean r11) {
        /*
            r9 = this;
            r7 = 0
            X.C14360o3.A0B(r10, r7)
            boolean r0 = r9.A0Y
            if (r0 != 0) goto L8e
            boolean r0 = r10.CdW()
            if (r0 == 0) goto L8e
            com.instagram.common.session.UserSession r6 = r9.A0R
            boolean r0 = X.BNP.A00(r10, r6)
            r8 = 0
            if (r0 == 0) goto L8e
            X.0sZ r0 = r9.A0V
            java.lang.Object r0 = r0.invoke()
            X.Gg2 r0 = (X.C37546Gg2) r0
            X.Gg8 r0 = r0.A0A
            X.Ghd r0 = r0.C09(r10)
            X.3Zb r5 = r0.A0E
            java.lang.Long r0 = A01(r10, r9)
            r3 = 0
            if (r0 == 0) goto L38
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L39
        L38:
            r1 = 0
        L39:
            if (r5 == 0) goto L4a
            X.3Zk r0 = r5.A3U
            java.lang.Object r0 = r0.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4a
            if (r1 != 0) goto L4a
            r8 = 1
        L4a:
            X.1qM r0 = r10.A02
            if (r0 == 0) goto L8c
            java.lang.String r5 = r0.getId()
        L52:
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            if (r5 == 0) goto L8b
            X.V9o r0 = X.CKI.A00(r6)
            java.util.concurrent.ConcurrentHashMap r2 = r0.A00
            java.lang.Object r1 = r2.get(r5)
            X.BeZ r1 = (X.C25985BeZ) r1
            if (r1 != 0) goto L72
            X.BeZ r1 = new X.BeZ
            r1.<init>()
            r1.A02 = r7
            r1.A01 = r7
            r1.A00 = r4
        L72:
            if (r3 == 0) goto L88
            X.V9o r0 = X.CKI.A00(r6)
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.lang.Object r0 = r0.get(r5)
            X.BeZ r0 = (X.C25985BeZ) r0
            if (r0 == 0) goto L86
            java.lang.Boolean r0 = r0.A00
            if (r0 != 0) goto L88
        L86:
            r1.A00 = r3
        L88:
            r2.put(r5, r1)
        L8b:
            return r8
        L8c:
            r5 = 0
            goto L52
        L8e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25371BKo.CT4(X.5dq, java.lang.Boolean):boolean");
    }

    @Override // X.JI2
    public final boolean Cax(C120985dq c120985dq) {
        int A0C;
        if (this.A0Y || (A0C = ((C37546Gg2) this.A0V.invoke()).A0A.A0C(c120985dq)) <= 0) {
            return false;
        }
        C120985dq A09 = AbstractC25226BEj.A17(this.A0U).A09(A0C - 1);
        if (A09 == null) {
            return false;
        }
        return CT4(A09, false);
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXR(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXS(int i) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DXc(int i, int i2) {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DY0() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void Dim(float f, float f2) {
    }

    @Override // X.C38Y
    public final void Dj0(Integer num) {
        String A00;
        C14360o3.A0B(num, 0);
        if (!this.A0Y) {
            C51758Mth c51758Mth = this.A0O;
            c51758Mth.A00 = num;
            C120985dq A002 = A00(this);
            if (A002 != null) {
                Integer num2 = C05F.A0C;
                if (num == num2 && (!this.A0G || this.A02 != this.A03 || !this.A0D)) {
                    int BmI = BmI(A002);
                    C37603Ggy c37603Ggy = new C37603Ggy(AbstractC166987dD.A0O(this.A0M), this.A0R, this.A0S);
                    if (this.A0J) {
                        A00 = "swipe_up";
                    } else {
                        A00 = AbstractC43591JPw.A00(215);
                    }
                    ITO.A01(new MUW((Float) null, (Float) null, A00, (String) null), c37603Ggy, A002, BmI);
                }
                if (num == C05F.A00 && this.A04 == 1 && this.A0X) {
                    A07(true);
                }
                if (this.A0E && ((!this.A0G || this.A02 == this.A03) && c51758Mth.A01)) {
                    c51758Mth.A01 = false;
                }
                if (num != num2) {
                    this.A0Q.EWO(A002, false);
                }
            }
        }
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrV() {
    }

    @Override // X.C38Y
    public final /* synthetic */ void DrY(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzL(C120985dq c120985dq, int i) {
        C14360o3.A0B(c120985dq, 0);
        if (CT4(c120985dq, false) && !this.A0I) {
            A02();
        }
    }

    @Override // X.JIH
    public final void DzP(C120985dq c120985dq, Integer num, int i) {
        C14360o3.A0B(c120985dq, 0);
        this.A01 = 0;
        if (CT4(c120985dq, false)) {
            String A1E = AbstractC25226BEj.A1E(c120985dq);
            this.A0E = true;
            this.A02 = i;
            this.A0G = false;
            if (!this.A0e.containsKey(A1E)) {
                A04(c120985dq, this, this.A0L);
            }
            Long A01 = A01(c120985dq, this);
            if (A01 == null || A01.longValue() != 0) {
                C11T.A03(new RunnableC29596D1x(c120985dq, this));
            }
        }
    }

    @Override // X.JIH
    public final void E1V() {
    }

    public static final C120985dq A00(C25371BKo c25371BKo) {
        try {
            C37556GgC A17 = AbstractC25226BEj.A17(c25371BKo.A0U);
            return A17.A09(A17.A03());
        } catch (Exception unused) {
            return null;
        }
    }

    private final void A02() {
        CountDownTimer countDownTimer = this.A07;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        if (this.A0b || this.A0X || this.A0Z) {
            this.A06.cancel();
        }
        this.A0G = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (X.AbstractC25226BEj.A17(r4).A09.A0A.A0B() != 0) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C120985dq r4, X.C25371BKo r5) {
        /*
            X.0sZ r2 = r5.A0V
            java.lang.Object r0 = r2.invoke()
            X.Gg2 r0 = (X.C37546Gg2) r0
            X.Gg8 r0 = r0.A0A
            X.Ghd r0 = r0.C09(r4)
            X.3Zb r3 = r0.A0E
            if (r3 == 0) goto L1c
            r0 = 1
            X.3Zk r1 = r3.A3U
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00(r3, r0)
        L1c:
            r0 = 0
            A04(r4, r5, r0)
            r3 = 0
            r5.A07(r3)
            X.5dq r1 = r5.A09
            if (r1 != 0) goto L6f
            X.0sZ r4 = r5.A0U
            X.GgC r0 = X.AbstractC25226BEj.A17(r4)
            int r0 = r0.A03()
            int r1 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L55
            if (r1 <= 0) goto L55
            X.GgC r0 = X.AbstractC25226BEj.A17(r4)
            X.5dq r1 = r0.A09(r1)
            if (r1 == 0) goto L55
            X.GgC r0 = X.AbstractC25226BEj.A17(r4)
            X.Gg2 r0 = r0.A09
            X.Gg8 r0 = r0.A0A
            int r0 = r0.A0B()
            if (r0 != 0) goto L6f
        L55:
            X.CUJ r1 = r5.A0T
            int r0 = r5.A0d
            r1.A00(r0)
            r0 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r0
            r5.A0E = r3
            r0 = 0
            r5.A0B = r0
            java.lang.Integer r0 = X.C05F.A0u
            A06(r5, r0)
            r5.A0C = r3
            r5.A04 = r3
            return
        L6f:
            X.5dq r0 = A00(r5)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L55
            java.lang.Object r0 = r2.invoke()
            X.Gg2 r0 = (X.C37546Gg2) r0
            X.Gg8 r0 = r0.A0A
            X.Ghd r0 = r0.C09(r1)
            boolean r0 = r0.A0d
            if (r0 == r3) goto L55
            X.DlK r0 = r5.A0Q
            r0.Ee8(r1, r3)
            r2.invoke()
            X.5dq r2 = r5.A09
            boolean r1 = X.C14360o3.A0K(r2, r1)
            r0 = 0
            if (r1 != 0) goto L9b
            r0 = r2
        L9b:
            r5.A09 = r0
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25371BKo.A03(X.5dq, X.BKo):void");
    }

    public static final void A05(C25371BKo c25371BKo) {
        int A0H;
        View rootView;
        GradientSpinner gradientSpinner = null;
        if (!c25371BKo.A0b || (!c25371BKo.A0X && !c25371BKo.A0Z)) {
            c25371BKo.A0A = null;
        } else {
            C37556GgC A17 = AbstractC25226BEj.A17(c25371BKo.A0U);
            View A07 = A17.A07(A17.A03());
            if (A07 != null && (rootView = A07.getRootView()) != null) {
                gradientSpinner = (GradientSpinner) rootView.findViewWithTag("clips_snack_bar_delayed_skip_ads_timer_progress_ring");
            }
            c25371BKo.A0A = gradientSpinner;
            boolean z = c25371BKo.A0Z;
            Context context = c25371BKo.A0M;
            if (z) {
                A0H = R.color.fds_transparent;
            } else {
                A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_progress_bar_on_media);
            }
            int color = context.getColor(A0H);
            GradientSpinner gradientSpinner2 = c25371BKo.A0A;
            if (gradientSpinner2 != null) {
                gradientSpinner2.setInactiveColour(color);
            }
        }
        if (c25371BKo.A0A != null) {
            float f = ((float) c25371BKo.A05) / ((float) c25371BKo.A0L);
            c25371BKo.A00 = f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f, 0.0f);
            c25371BKo.A06 = ofFloat;
            ofFloat.setDuration(((float) c25371BKo.A05) / c25371BKo.A0c);
            c25371BKo.A06.setInterpolator(new LinearInterpolator());
            c25371BKo.A06.addUpdateListener(new BFF(c25371BKo, 30));
            c25371BKo.A06.start();
        }
    }

    public static final void A06(C25371BKo c25371BKo, Integer num) {
        C120985dq A09 = AbstractC25226BEj.A17(c25371BKo.A0U).A09(c25371BKo.A02);
        if (A09 != null) {
            InterfaceC60442pS interfaceC60442pS = c25371BKo.A0S;
            UserSession userSession = c25371BKo.A0R;
            int BmI = c25371BKo.BmI(A09);
            if (A09.CdW() && A09.A06().A0t) {
                AbstractC40575Hyv.A00(userSession, AbstractC25226BEj.A0y(A09), interfaceC60442pS, num, "unknown", BmI);
            }
        }
    }

    @Override // X.JI2
    public final boolean CST(C120985dq c120985dq) {
        return BNP.A00(c120985dq, this.A0R);
    }

    @Override // X.C38Y
    public final void DXa(int i, int i2) {
        this.A03 = i;
        if (this.A0E && i == this.A02 && this.A0G && this.A0D) {
            this.A0G = false;
        }
    }

    public static final Long A01(C120985dq c120985dq, C25371BKo c25371BKo) {
        if (!c120985dq.CdW()) {
            return null;
        }
        return (Long) c25371BKo.A0e.get(AbstractC25226BEj.A1E(c120985dq));
    }

    public static final void A04(C120985dq c120985dq, C25371BKo c25371BKo, long j) {
        if (c120985dq.CdW()) {
            c25371BKo.A0e.put(AbstractC25226BEj.A1E(c120985dq), Long.valueOf(j));
            c25371BKo.A0T.A00(c25371BKo.A0d);
        }
    }

    private final void A07(boolean z) {
        C120985dq A00 = A00(this);
        if (A00 != null) {
            if (this.A0Z) {
                this.A0Q.Ee9(A00, z);
                return;
            }
            if (this.A0X) {
                this.A0Q.Ee5(A00, z);
            } else if (this.A0W) {
                this.A0Q.Ee6(A00, z);
            } else {
                if (!this.A0a) {
                    return;
                }
                this.A0Q.Ee7(A00, z);
            }
        }
    }

    @Override // X.JI2
    public final CUJ As5() {
        return this.A0T;
    }

    @Override // X.JIH
    public final void DzC(C120985dq c120985dq, int i, int i2) {
    }

    @Override // X.JIH
    public final void E1U(C120985dq c120985dq, InterfaceC31077DlK interfaceC31077DlK, boolean z) {
    }

    @Override // X.JIH
    public final void D8r(C120985dq c120985dq, List list) {
    }

    @Override // X.JIH
    public final void Dbv(C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void DzJ(C120985dq c120985dq, int i) {
    }

    @Override // X.JIH
    public final void DzO(C120985dq c120985dq, C37644Ghd c37644Ghd, C37563GgJ c37563GgJ, C25370BKn c25370BKn, boolean z) {
    }

    @Override // X.JIH
    public final void Dby(C120985dq c120985dq, int i, int i2, boolean z) {
    }
}
