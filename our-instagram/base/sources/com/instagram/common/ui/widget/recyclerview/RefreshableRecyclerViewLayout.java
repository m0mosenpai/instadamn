package com.instagram.common.ui.widget.recyclerview;

import X.AbstractC13190m5;
import X.AbstractC13560mi;
import X.AbstractC13600mm;
import X.AbstractC13880nE;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC50523MSb;
import X.AbstractC58318PtA;
import X.AbstractC65392xb;
import X.AbstractC70663Fe;
import X.AnonymousClass710;
import X.C03K;
import X.C05F;
import X.C0K8;
import X.C0f9;
import X.C0s6;
import X.C0w9;
import X.C110814yt;
import X.C14360o3;
import X.C1I4;
import X.C2UU;
import X.C3AY;
import X.C3F1;
import X.C55942hf;
import X.C55952hg;
import X.C55982hj;
import X.C55992hk;
import X.C70829Whm;
import X.InterfaceC148026lY;
import X.InterfaceC55932he;
import X.JQ0;
import X.LNM;
import X.MSY;
import X.RunnableC71328Wrw;
import X.RunnableC71329Wrx;
import X.RunnableC71330Wry;
import X.RunnableC71489Wup;
import X.UGQ;
import X.UH2;
import X.V01;
import X.VCt;
import X.X8I;
import X.X8J;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Scroller;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.forker.Process;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.webrtc.CameraVideoCapturer;

/* loaded from: classes11.dex */
public final class RefreshableRecyclerViewLayout extends FrameLayout implements InterfaceC55932he, InterfaceC148026lY {
    public static boolean A0Z;
    public static boolean A0a;
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public long A05;
    public Scroller A06;
    public AnonymousClass710 A07;
    public X8I A08;
    public X8J A09;
    public Object A0A;
    public Method A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public long A0H;
    public C3F1 A0I;
    public VCt A0J;
    public Runnable A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public final ImageView A0O;
    public final RecyclerView A0P;
    public final C55982hj A0Q;
    public final C55982hj A0R;
    public final UGQ A0S;
    public final List A0T;
    public final Handler A0U;
    public final C03K A0V;
    public final AbstractC65392xb A0W;
    public final Runnable A0X;
    public final Runnable A0Y;

    /* loaded from: classes8.dex */
    public final class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = LNM.A00(20);
        public Parcelable A00;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C14360o3.A0B(parcel, 0);
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.4yt, X.UGQ] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, X.03K] */
    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C14360o3.A0B(context, 1);
        this.A0U = new Handler();
        this.A0X = new RunnableC71328Wrw(this);
        this.A0Y = new RunnableC71329Wrx(this);
        this.A0T = new ArrayList();
        this.A0W = new UH2(this, 4);
        this.A0J = VCt.A04;
        this.A0H = 800L;
        this.A0L = false;
        this.A0M = false;
        this.A0V = new Object();
        this.A0S = new C110814yt(context);
        C55952hg A00 = AbstractC13560mi.A00();
        C55982hj A02 = A00.A02();
        A02.A09(C55942hf.A04(25.0d, 9.5d));
        A02.A00 = 0.5d;
        A02.A02 = 50.0d;
        A02.A0A(this);
        this.A0R = A02;
        C55982hj A022 = A00.A02();
        A022.A09(C55942hf.A04(0.0d, 0.35d));
        A022.A00 = 0.5d;
        A022.A02 = 50.0d;
        A022.A0A(this);
        this.A0Q = A022;
        A00.A04.add(this);
        this.A0G = AbstractC13880nE.A04(context, CameraVideoCapturer.CameraStatistics.CAMERA_OBSERVER_PERIOD_MS);
        this.A0F = AbstractC13880nE.A04(context, CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS);
        RecyclerView recyclerView = new RecyclerView(context);
        this.A0P = recyclerView;
        recyclerView.setClipChildren(this.A0L);
        recyclerView.setClipToPadding(this.A0M);
        addView(recyclerView);
        ImageView imageView = new ImageView(context);
        this.A0O = imageView;
        imageView.setVisibility(8);
        addView(imageView);
        A01();
    }

    @Override // X.InterfaceC148026lY
    public final void CzD(C55952hg c55952hg) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        C14360o3.A0B(c55982hj, 0);
        C55982hj c55982hj2 = this.A0R;
        if (c55982hj == c55982hj2) {
            C55992hk c55992hk = c55982hj2.A09;
            float f = (float) c55992hk.A00;
            if (this.A0E && !this.A0D && c55982hj2.A01 == getOverScrollRestTarget() && c55982hj2.A0D()) {
                this.A0E = false;
                this.A00 = 0.0f;
                A02(0.0f, (float) c55992hk.A01);
                c55982hj2.A08(0.0d, true);
                f = 0.0f;
            }
            boolean A1N = AbstractC167007dF.A1N(this.A04);
            RecyclerView recyclerView = this.A0P;
            if (A1N) {
                recyclerView.setTranslationX(f);
            } else {
                recyclerView.setTranslationY(f);
            }
            List list = this.A0T;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C1I4 c1i4 = (C1I4) ((C3AY) list.get(i)).A01;
                if (c1i4 != null) {
                    c1i4.onScrolled(recyclerView, 0, 0);
                }
            }
            A01();
            return;
        }
        if (c55982hj == this.A0Q) {
            A06(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C14360o3.A0B(motionEvent, 0);
        if (motionEvent.getActionMasked() == 1) {
            this.A0N = false;
            post(this.A0Y);
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        float f3;
        this.A00 = 0.0f;
        if (this.A04 != 0) {
            f = f2;
        }
        if (A09()) {
            f3 = this.A0G;
        } else {
            f3 = this.A0F;
        }
        float abs = Math.abs(f);
        if (abs > f3) {
            f = (f / abs) * f3;
        }
        if (A09()) {
            this.A0E = true;
            A07(this);
            C55982hj c55982hj = this.A0R;
            c55982hj.A04();
            c55982hj.A07(-f);
            return true;
        }
        A02(this.A00, f);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        C14360o3.A0B(iArr, 3);
        int i4 = 0;
        if (A09()) {
            if (this.A04 != 0) {
                i = i2;
            }
            i3 = A00(i, true);
            if (i3 > 0) {
                requestDisallowInterceptTouchEvent(true);
            }
        } else {
            i3 = 0;
        }
        boolean z = false;
        int i5 = 0;
        if (this.A04 == 0) {
            z = true;
            i5 = i3;
        }
        iArr[0] = i5;
        if (!z) {
            i4 = i3;
        }
        iArr[1] = i4;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        C14360o3.A0B(parcelable, 0);
        super.onRestoreInstanceState(parcelable);
        AbstractC70663Fe abstractC70663Fe = this.A0P.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A1P(((SavedState) parcelable).A00);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        this.A0E = false;
        A07(this);
        this.A0R.A01();
        this.A0N = true;
        setItemAnimationsEnabled(false);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        C14360o3.A0B(view, 0);
        this.A0V.A01 = 0;
        this.A0N = false;
        if (this.A01 >= 1.0f && this.A09 != null && this.A07 != null && this.A0P.getChildCount() > 0) {
            if (!this.A0D) {
                this.A05 = System.currentTimeMillis();
                setItemAnimationsEnabled(false);
                this.A0D = true;
                X8J x8j = this.A09;
                if (x8j != null) {
                    V01 v01 = ((C70829Whm) x8j).A00;
                    v01.A06.A09 = true;
                    v01.A05.A00(v01, v01);
                }
                AnonymousClass710 anonymousClass710 = this.A07;
                if (anonymousClass710 != null) {
                    anonymousClass710.A02(true);
                }
                this.A0R.A06(getOverScrollRestTarget());
                A01();
            }
        } else {
            A04(this);
        }
        this.A0R.A06(getOverScrollRestTarget());
        A01();
    }

    private final int A00(int i, boolean z) {
        float f;
        if (this.A08 != null) {
            f = 0.5f;
        } else if (this.A01 > 0.0f && this.A09 != null && this.A07 != null && this.A0P.getChildCount() > 0) {
            f = AbstractC13600mm.A02(this.A01, 0.25f, 1.0f, 1.0f, 0.1f);
        } else {
            f = 0.1f;
        }
        float min = Math.min(f, 1.0f);
        C55982hj c55982hj = this.A0R;
        float f2 = (float) c55982hj.A09.A00;
        boolean z2 = true;
        if (f2 != 0.0f && f2 / i >= 0.0f) {
            z2 = false;
        }
        float f3 = i;
        if (z2) {
            f3 *= min;
        }
        if (!z || (!this.A0C && (z2 || Math.abs(f2) > Math.abs(i)))) {
            c55982hj.A08(f2 - f3, true);
            return i;
        }
        c55982hj.A08(0.0d, true);
        this.A0C = false;
        return Math.round(f2);
    }

    private final void A01() {
        float f;
        float translationY;
        if (this.A09 != null && this.A07 != null) {
            RecyclerView recyclerView = this.A0P;
            if (recyclerView.getChildCount() > 0) {
                if (this.A0N || this.A02 > 0.0f) {
                    float f2 = this.A03;
                    AnonymousClass710 anonymousClass710 = this.A07;
                    if (anonymousClass710 != null) {
                        boolean A1N = AbstractC167007dF.A1N(this.A04);
                        ImageView imageView = this.A0O;
                        if (A1N) {
                            int width = imageView.getWidth();
                            int i = anonymousClass710.A02;
                            if (width != i) {
                                MSY.A10(imageView, i, -1);
                                width = anonymousClass710.A02;
                            }
                            f = -width;
                            translationY = recyclerView.getTranslationX() + f;
                            imageView.setTranslationX(this.A03 + translationY);
                        } else {
                            int height = imageView.getHeight();
                            int i2 = anonymousClass710.A01;
                            if (height != i2) {
                                MSY.A10(imageView, -1, i2);
                                height = anonymousClass710.A01;
                            }
                            f = -height;
                            translationY = recyclerView.getTranslationY() + f;
                            imageView.setTranslationY(this.A03 + translationY);
                        }
                        float f3 = f2 - f;
                        float f4 = 1.0f - 0.0f;
                        float f5 = 0.0f;
                        if (f3 != 0.0f) {
                            f5 = (translationY - f) / f3;
                        }
                        float f6 = (f5 * f4) + 0.0f;
                        this.A02 = AbstractC13600mm.A00(f6, 0.0f, 1.0f);
                        this.A01 = f6;
                        int i3 = 4;
                        if (f6 > 0.0f) {
                            i3 = 0;
                        }
                        imageView.setVisibility(i3);
                        anonymousClass710.A01(this.A02);
                        return;
                    }
                    throw AbstractC166997dE.A0g();
                }
                return;
            }
        }
        this.A0O.setVisibility(8);
    }

    private final void A02(float f, float f2) {
        Scroller scroller = this.A06;
        if (scroller != null) {
            scroller.fling(0, Math.round(f), 0, Math.round(-f2), 0, 0, Process.WAIT_RESULT_STOPPED, Integer.MAX_VALUE);
            Runnable runnable = this.A0K;
            if (runnable == null) {
                runnable = new RunnableC71489Wup(scroller, this);
                this.A0K = runnable;
            }
            postOnAnimation(runnable);
            return;
        }
        C55982hj c55982hj = this.A0Q;
        c55982hj.A08(f, true);
        c55982hj.A07(-f2);
    }

    private final void A03(int i, int i2) {
        Method method = this.A0B;
        Object obj = this.A0A;
        if (obj != null && method != null) {
            try {
                method.invoke(obj, this.A0P, Integer.valueOf(i), Integer.valueOf(i2));
            } catch (Exception e) {
                A08(this, e, C05F.A01);
            }
        }
    }

    public static final void A04(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        if (refreshableRecyclerViewLayout.A0D) {
            long currentTimeMillis = System.currentTimeMillis() - refreshableRecyclerViewLayout.A05;
            long j = refreshableRecyclerViewLayout.A0H;
            if (currentTimeMillis < j) {
                Handler handler = refreshableRecyclerViewLayout.A0U;
                Runnable runnable = refreshableRecyclerViewLayout.A0X;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, j - currentTimeMillis);
                return;
            }
            refreshableRecyclerViewLayout.A0D = false;
            AnonymousClass710 anonymousClass710 = refreshableRecyclerViewLayout.A07;
            if (anonymousClass710 != null) {
                anonymousClass710.A02(false);
            }
            refreshableRecyclerViewLayout.setItemAnimationsEnabled(true);
            refreshableRecyclerViewLayout.A0R.A06(refreshableRecyclerViewLayout.getOverScrollRestTarget());
            refreshableRecyclerViewLayout.A01();
        }
    }

    public static final void A05(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        VCt vCt;
        boolean A0C;
        boolean z = false;
        if (refreshableRecyclerViewLayout.A0N) {
            vCt = VCt.A03;
        } else {
            if (refreshableRecyclerViewLayout.A0R.A0C()) {
                Scroller scroller = refreshableRecyclerViewLayout.A06;
                if (scroller != null) {
                    A0C = scroller.isFinished();
                } else {
                    A0C = refreshableRecyclerViewLayout.A0Q.A0C();
                }
                if (A0C) {
                    refreshableRecyclerViewLayout.setScrollState(VCt.A04);
                    z = true;
                    refreshableRecyclerViewLayout.setItemAnimationsEnabled(z);
                }
            }
            vCt = VCt.A02;
        }
        refreshableRecyclerViewLayout.setScrollState(vCt);
        refreshableRecyclerViewLayout.setItemAnimationsEnabled(z);
    }

    public static final void A07(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        Scroller scroller = refreshableRecyclerViewLayout.A06;
        if (scroller != null) {
            scroller.setFinalY(scroller.getCurrY());
            scroller.abortAnimation();
            scroller.forceFinished(true);
            return;
        }
        refreshableRecyclerViewLayout.A0Q.A01();
    }

    public static final void A08(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout, Exception exc, Integer num) {
        String str;
        if (num != C05F.A01 || !A0Z) {
            if (num == C05F.A00 && A0a) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int intValue = num.intValue();
            if (intValue != 0) {
                str = "INVOCATION";
            } else {
                str = "REFLECTION";
            }
            AbstractC50523MSb.A1N("GapWorker access failure: ", str, sb);
            sb.append("\n");
            try {
                Object obj = refreshableRecyclerViewLayout.A0A;
                if (obj != null) {
                    C0s6 A00 = AbstractC13190m5.A00(obj.getClass().getDeclaredMethods());
                    while (A00.hasNext()) {
                        AbstractC58318PtA.A1V(sb, (Method) A00.next());
                        sb.append("\n");
                    }
                } else {
                    sb.append("mGapWorker is null");
                    sb.append("\n");
                }
            } catch (Exception unused) {
            }
            C0K8.A0F("RefreshableRecyclerViewLayout", sb.toString(), exc);
            C0w9.A06("RefreshableRecyclerView#GapWorkerAccessFailed", AbstractC166987dD.A19(sb), exc);
            if (intValue != 1) {
                A0a = true;
            } else {
                A0Z = true;
            }
        }
    }

    private final boolean A09() {
        Integer num;
        int i;
        boolean z;
        RecyclerView recyclerView = this.A0P;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.A0D;
        Integer num2 = null;
        if (linearLayoutManager != null) {
            num = Integer.valueOf(linearLayoutManager.A1a());
            num2 = Integer.valueOf(linearLayoutManager.A1b());
        } else {
            num = null;
        }
        C2UU c2uu = recyclerView.A0A;
        if (c2uu != null) {
            i = c2uu.getItemCount();
        } else {
            i = 0;
        }
        int i2 = i - 1;
        if ((num != null && num.intValue() == 0) || (num2 != null && num2.intValue() == i2)) {
            z = true;
        } else {
            z = false;
        }
        if (this.A0R.A0E(0.0d) || recyclerView.getScrollState() == 0 || !z) {
            return false;
        }
        return true;
    }

    private final float getCoastingValue() {
        if (this.A06 != null) {
            return r0.getCurrY();
        }
        return (float) this.A0Q.A09.A00;
    }

    private final float getCoastingVelocity() {
        Scroller scroller = this.A06;
        if (scroller != null) {
            int i = 1;
            if (scroller.getStartY() > scroller.getFinalY()) {
                i = -1;
            }
            return scroller.getCurrVelocity() * i;
        }
        return (float) this.A0Q.A09.A01;
    }

    private final float getOverScrollRestTarget() {
        if (this.A0D) {
            return getRefreshingScrollPosition();
        }
        return 0.0f;
    }

    private final float getRefreshingScrollPosition() {
        int height;
        boolean A1N = AbstractC167007dF.A1N(this.A04);
        ImageView imageView = this.A0O;
        if (A1N) {
            height = imageView.getWidth();
        } else {
            height = imageView.getHeight();
        }
        return height + this.A03;
    }

    private final void setItemAnimationsEnabled(boolean z) {
        C3F1 c3f1;
        RecyclerView recyclerView = this.A0P;
        C3F1 c3f12 = recyclerView.A0C;
        if (c3f12 != null) {
            this.A0I = c3f12;
        }
        if (z) {
            c3f1 = this.A0I;
        } else {
            c3f1 = null;
        }
        recyclerView.setItemAnimator(c3f1);
    }

    private final void setScrollState(VCt vCt) {
        if (vCt != this.A0J) {
            System.currentTimeMillis();
            this.A0J = vCt;
            List list = this.A0T;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((C3AY) list.get(i)).A01 != null) {
                    C0f9.A0A(2131744890, C0f9.A03(373499187));
                }
            }
        }
    }

    public final long getMinRefreshAnimationDuration() {
        return this.A0H;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0V;
        return c03k.A01 | c03k.A00;
    }

    public final RecyclerView getRecyclerView() {
        return this.A0P;
    }

    public final VCt getScrollState() {
        return this.A0J;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        if (this.A04 != 0) {
            i3 = i4;
        }
        A00(i3, false);
    }

    public final void setAdapter(C2UU c2uu) {
        RecyclerView recyclerView = this.A0P;
        C2UU c2uu2 = recyclerView.A0A;
        if (c2uu2 != null) {
            c2uu2.unregisterAdapterDataObserver(this.A0W);
        }
        recyclerView.setAdapter(c2uu);
        if (c2uu != null) {
            c2uu.registerAdapterDataObserver(this.A0W);
        }
    }

    public final void setItemAnimator(C3F1 c3f1) {
        this.A0P.setItemAnimator(c3f1);
    }

    public final void setLayoutManager(AbstractC70663Fe abstractC70663Fe) {
        if (abstractC70663Fe instanceof LinearLayoutManager) {
            this.A04 = ((LinearLayoutManager) abstractC70663Fe).A01;
            this.A0P.setLayoutManager(abstractC70663Fe);
            return;
        }
        throw new IllegalArgumentException("layoutManager must be an instanceof LinearLayoutManager");
    }

    public static final void A06(RefreshableRecyclerViewLayout refreshableRecyclerViewLayout) {
        boolean A0C;
        float coastingValue = refreshableRecyclerViewLayout.getCoastingValue();
        int round = Math.round(refreshableRecyclerViewLayout.A00 - coastingValue);
        if (AbstractC167007dF.A1N(refreshableRecyclerViewLayout.A04)) {
            RecyclerView recyclerView = refreshableRecyclerViewLayout.A0P;
            if (recyclerView.canScrollHorizontally(round)) {
                recyclerView.scrollBy(round, 0);
                refreshableRecyclerViewLayout.A03(round, 0);
                refreshableRecyclerViewLayout.A00 = coastingValue;
            }
        }
        if (refreshableRecyclerViewLayout.A04 != 0) {
            RecyclerView recyclerView2 = refreshableRecyclerViewLayout.A0P;
            if (recyclerView2.canScrollVertically(round)) {
                recyclerView2.scrollBy(0, round);
                refreshableRecyclerViewLayout.A03(0, round);
                refreshableRecyclerViewLayout.A00 = coastingValue;
            }
        }
        Scroller scroller = refreshableRecyclerViewLayout.A06;
        if (scroller != null) {
            A0C = scroller.isFinished();
        } else {
            A0C = refreshableRecyclerViewLayout.A0Q.A0C();
        }
        if (!A0C) {
            float coastingVelocity = refreshableRecyclerViewLayout.getCoastingVelocity();
            A07(refreshableRecyclerViewLayout);
            C55982hj c55982hj = refreshableRecyclerViewLayout.A0R;
            c55982hj.A07(coastingVelocity);
            c55982hj.A06(refreshableRecyclerViewLayout.getOverScrollRestTarget());
        }
        refreshableRecyclerViewLayout.A00 = coastingValue;
    }

    public final void A0A() {
        A04(this);
        AnonymousClass710 anonymousClass710 = this.A07;
        if (anonymousClass710 != null) {
            anonymousClass710.A04 = false;
            anonymousClass710.A03 = true;
            anonymousClass710.invalidateSelf();
        }
        this.A0R.A06(getOverScrollRestTarget());
        setItemAnimationsEnabled(true);
    }

    @Override // X.InterfaceC148026lY
    public final void Cw4(C55952hg c55952hg) {
        A05(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1046087597);
        super.onAttachedToWindow();
        post(new RunnableC71330Wry(this));
        C0f9.A0D(1216161592, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-620280144);
        super.onDetachedFromWindow();
        this.A0Q.A01();
        this.A0R.A01();
        C0f9.A0D(1229215183, A06);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        A01();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        AbstractC167017dG.A1N(view, view2);
        this.A0V.A01 = i;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View$BaseSavedState, com.instagram.common.ui.widget.recyclerview.RefreshableRecyclerViewLayout$SavedState, android.os.Parcelable] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        AbstractC70663Fe abstractC70663Fe = this.A0P.A0D;
        if (abstractC70663Fe != null) {
            baseSavedState.A00 = abstractC70663Fe.A1M();
        }
        return baseSavedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        super.setClipChildren(z);
        this.A0L = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipChildren(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        super.setClipToPadding(z);
        this.A0M = z;
        RecyclerView recyclerView = this.A0P;
        if (recyclerView != null) {
            recyclerView.setClipToPadding(z);
        }
    }

    public final void setMinRefreshAnimationDuration(long j) {
        this.A0H = j;
    }

    public final void setOverScrollDelegate(X8I x8i) {
        this.A08 = x8i;
    }

    public final void setRefreshDelegate(X8J x8j) {
        this.A09 = x8j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }

    public /* synthetic */ RefreshableRecyclerViewLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JQ0.A0C(attributeSet, i2), JQ0.A03(i2, i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RefreshableRecyclerViewLayout(Context context) {
        this(context, null, 0);
        C14360o3.A0B(context, 1);
    }
}
