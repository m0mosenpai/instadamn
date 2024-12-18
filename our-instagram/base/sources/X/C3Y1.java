package X;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.watchandbrowse.ui.WatchAndBrowseMainView;

/* renamed from: X.3Y1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3Y1 implements C33R {
    public C80193i8 A00;
    public C39447HbZ A01;
    public boolean A02;
    public boolean A03;
    public WatchAndBrowseMainView A04;
    public boolean A05;
    public final Activity A06;
    public final ViewGroup A07;
    public final UserSession A08;
    public final C3Y5 A09 = new C1I2() { // from class: X.3Y5
        @Override // X.C1I2
        public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
            C0f9.A0A(512482307, C0f9.A03(1025155683));
        }

        @Override // X.C1I2
        public final void onScrollStateChanged(C3FQ c3fq, int i) {
            C3FP c3fp;
            int A03 = C0f9.A03(-2003433900);
            C3Y1 c3y1 = C3Y1.this;
            if (i == 0) {
                c3y1.A02 = true;
                Object invoke = c3y1.A00().A00.A04.invoke();
                if (!(invoke instanceof C3FP) || (c3fp = (C3FP) invoke) == null || (!c3fp.A03.canScrollVertically(1))) {
                    c3y1.A03 = true;
                }
            } else {
                c3y1.A02 = false;
            }
            C0f9.A0A(1079670182, A03);
        }
    };
    public final Context A0A;
    public final C3Y4 A0B;

    @Override // X.C33R
    public final void DSJ(C75113Zb c75113Zb, int i) {
        boolean z;
        C3FP c3fp;
        C3FP c3fp2;
        View requireViewById;
        C3FP c3fp3;
        C14360o3.A0B(c75113Zb, 0);
        if (i == 50) {
            Integer num = c75113Zb.A13;
            num.intValue();
            if (num.intValue() != 0) {
                this.A05 = false;
                this.A0B.EJy();
                ViewGroup viewGroup = this.A07;
                if (viewGroup != null) {
                    int measuredHeight = viewGroup.getMeasuredHeight();
                    View childAt = viewGroup.getChildAt(0);
                    if (childAt != null) {
                        int measuredHeight2 = childAt.getMeasuredHeight();
                        Object invoke = A00().A00.A04.invoke();
                        if ((invoke instanceof C3FP) && invoke != null) {
                            int A01 = (int) C18U.A01(C06090Tz.A05, this.A08, 36599598174637674L);
                            C25067B7o c25067B7o = C25067B7o.A00;
                            LinearInterpolator linearInterpolator = new LinearInterpolator();
                            ValueAnimator ofInt = ValueAnimator.ofInt(measuredHeight, measuredHeight2);
                            ofInt.setDuration(A01);
                            ofInt.setInterpolator(linearInterpolator);
                            ofInt.addUpdateListener(new LLw(viewGroup));
                            ofInt.addListener(new C46069KaQ(c25067B7o));
                            int intValue = ((Number) A00().A00.A0B.invoke(Integer.valueOf(measuredHeight2))).intValue();
                            ofInt.start();
                            A00().A00.A0H.invoke(Integer.valueOf(-intValue), Integer.valueOf(A01), invoke);
                        }
                    }
                }
                Object invoke2 = A00().A00.A04.invoke();
                if ((invoke2 instanceof C3FP) && (c3fp3 = (C3FP) invoke2) != null) {
                    c3fp3.EGF(this.A09);
                }
                WatchAndBrowseMainView watchAndBrowseMainView = this.A04;
                if (watchAndBrowseMainView != null) {
                    watchAndBrowseMainView.setVisibility(8);
                    return;
                }
                return;
            }
            this.A01 = (C39447HbZ) A00().A00.A05.invoke();
            View view = (View) A00().A00.A03.invoke();
            if (view == null) {
                return;
            }
            WatchAndBrowseMainView watchAndBrowseMainView2 = this.A04;
            Object obj = null;
            if (watchAndBrowseMainView2 == null) {
                if (C18U.A06(C06090Tz.A05, this.A08, 36325695223379220L)) {
                    requireViewById = view.findViewById(R.id.watch_and_browse_stub);
                    if (requireViewById == null) {
                        watchAndBrowseMainView2 = null;
                        this.A04 = watchAndBrowseMainView2;
                    }
                } else {
                    requireViewById = view.requireViewById(R.id.watch_and_browse_stub);
                }
                watchAndBrowseMainView2 = (WatchAndBrowseMainView) AbstractC56372iV.A01(requireViewById, false, false).getView();
                this.A04 = watchAndBrowseMainView2;
            }
            if (watchAndBrowseMainView2 != null) {
                watchAndBrowseMainView2.A00(new C38575Gxb(this.A0A, A00().A00));
            }
            C3Y4 c3y4 = this.A0B;
            WatchAndBrowseMainView watchAndBrowseMainView3 = this.A04;
            C39447HbZ c39447HbZ = this.A01;
            ViewGroup viewGroup2 = this.A07;
            c3y4.COS(viewGroup2, A00(), c39447HbZ, watchAndBrowseMainView3);
            C39447HbZ c39447HbZ2 = this.A01;
            if (c39447HbZ2 != null) {
                if (viewGroup2 != null) {
                    obj = A00().A00.A0G.invoke(viewGroup2, c39447HbZ2, c3y4.A00.AiU(viewGroup2, A00(), this.A01, this.A04));
                }
                z = C14360o3.A0K(obj, true);
            } else {
                z = false;
            }
            this.A05 = z;
            if (!z) {
                return;
            }
            c3y4.CoW(this.A01, this.A04);
            Object invoke3 = A00().A00.A04.invoke();
            if ((invoke3 instanceof C3FP) && (c3fp2 = (C3FP) invoke3) != null) {
                c3fp2.AAJ(this.A09);
            }
            Object invoke4 = A00().A00.A04.invoke();
            if ((invoke4 instanceof C3FP) && (c3fp = (C3FP) invoke4) != null) {
                c3fp.Eog();
                A00().A00.A00.invoke();
                C56352iT.A0t.A03(this.A06).EkF(false);
                InterfaceC16620sF interfaceC16620sF = A00().A00.A0E;
                C14360o3.A0C(viewGroup2, "null cannot be cast to non-null type android.view.ViewGroup");
                interfaceC16620sF.invoke(48, viewGroup2);
                View childAt2 = viewGroup2.getChildAt(0);
                if (childAt2 != null) {
                    int measuredHeight3 = childAt2.getMeasuredHeight();
                    C39447HbZ c39447HbZ3 = this.A01;
                    if (c39447HbZ3 != null) {
                        int i2 = c39447HbZ3.A03;
                        Number number = (Number) A00().A00.A0C.invoke(this.A01);
                        if (number != null) {
                            int intValue2 = number.intValue();
                            C39447HbZ c39447HbZ4 = this.A01;
                            if (c39447HbZ4 != null && c39447HbZ4.A0E) {
                                intValue2 += ((Number) A00().A00.A0D.invoke(Integer.valueOf(i2), number)).intValue();
                            }
                            int A012 = (int) C18U.A01(C06090Tz.A05, this.A08, 36599598174899819L);
                            C25066B7n c25066B7n = C25066B7n.A00;
                            LinearInterpolator linearInterpolator2 = new LinearInterpolator();
                            ValueAnimator ofInt2 = ValueAnimator.ofInt(measuredHeight3, intValue2);
                            long j = A012;
                            ofInt2.setDuration(j);
                            ofInt2.setInterpolator(linearInterpolator2);
                            ofInt2.addUpdateListener(new LLw(viewGroup2));
                            ofInt2.addListener(new C46069KaQ(c25066B7n));
                            InterfaceC16620sF interfaceC16620sF2 = A00().A00.A0F;
                            C14360o3.A0C(viewGroup2, "null cannot be cast to non-null type android.view.View");
                            interfaceC16620sF2.invoke(viewGroup2, 0);
                            ofInt2.start();
                            new Handler(Looper.getMainLooper()).postDelayed(new RunnableC43112J4b(this, c75113Zb), j);
                        }
                    }
                }
            }
            WatchAndBrowseMainView watchAndBrowseMainView4 = this.A04;
            if (watchAndBrowseMainView4 == null) {
                return;
            }
            watchAndBrowseMainView4.setVisibility(0);
            return;
        }
        if (i != 18) {
            return;
        }
        boolean z2 = c75113Zb.A1v;
        boolean z3 = this.A05;
        if (!z2) {
            if (!z3 || ((Boolean) A00().A00.A06.invoke()).booleanValue()) {
                return;
            }
            C0K8.A0D("WatchAndBrowseMediaViewHolder", "media is no more on screen and half browser is open ");
            A00().A00.A01.invoke();
            this.A05 = false;
            return;
        }
        if (!z3 || !((Boolean) A00().A00.A06.invoke()).booleanValue()) {
            return;
        }
        this.A0B.CoW(this.A01, this.A04);
    }

    public final C80193i8 A00() {
        C80193i8 c80193i8 = this.A00;
        if (c80193i8 != null) {
            return c80193i8;
        }
        C14360o3.A0F("uiState");
        throw C00O.createAndThrow();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.3Y5] */
    public C3Y1(Activity activity, Context context, ViewGroup viewGroup, UserSession userSession) {
        this.A0A = context;
        this.A07 = viewGroup;
        this.A08 = userSession;
        this.A06 = activity;
        this.A0B = new C3Y4(new C3Y2(activity, context, userSession));
    }
}
