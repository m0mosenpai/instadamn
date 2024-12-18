package androidx.recyclerview.widget;

import X.AbstractC010103p;
import X.AbstractC09780fb;
import X.AbstractC105064oM;
import X.AbstractC110824yu;
import X.AbstractC61812ri;
import X.AbstractC63123SdR;
import X.AbstractC65767Tti;
import X.AbstractC70573Eu;
import X.AbstractC70653Fc;
import X.AbstractC70663Fe;
import X.AbstractC72457Xe3;
import X.AnonymousClass001;
import X.C003501a;
import X.C005001p;
import X.C03H;
import X.C03I;
import X.C0f9;
import X.C12500ku;
import X.C14360o3;
import X.C1I4;
import X.C2UU;
import X.C3F1;
import X.C3F2;
import X.C3F3;
import X.C3F5;
import X.C3F7;
import X.C3FA;
import X.C3FD;
import X.C3FG;
import X.C3FH;
import X.C3FI;
import X.C3FK;
import X.C3OO;
import X.C3OP;
import X.C3OR;
import X.C3QV;
import X.C70563Et;
import X.C70583Ev;
import X.C70593Ew;
import X.C70603Ex;
import X.C70783Fq;
import X.C73733Sb;
import X.C7KW;
import X.C7LD;
import X.InterfaceC1128257o;
import X.InterfaceC69563Aq;
import X.JFP;
import X.RunnableC72643Nl;
import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class RecyclerView extends ViewGroup implements C03H {
    public static boolean A1C;
    public static boolean A1D;
    public static final Interpolator A1F;
    public static final C70563Et A1G;
    public static final Class[] A1H;
    public int A00;
    public int A01;
    public int A02;
    public EdgeEffect A03;
    public EdgeEffect A04;
    public EdgeEffect A05;
    public EdgeEffect A06;
    public C3FD A07;
    public C3FI A08;
    public C3F3 A09;
    public C2UU A0A;
    public AbstractC70573Eu A0B;
    public C3F1 A0C;
    public AbstractC70663Fe A0D;
    public AbstractC61812ri A0E;
    public C7LD A0F;
    public C1I4 A0G;
    public JFP A0H;
    public SavedState A0I;
    public C3FK A0J;
    public Runnable A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public float A0a;
    public float A0b;
    public int A0c;
    public int A0d;
    public int A0e;
    public int A0f;
    public int A0g;
    public int A0h;
    public int A0i;
    public int A0j;
    public int A0k;
    public int A0l;
    public VelocityTracker A0m;
    public C03I A0n;
    public C7KW A0o;
    public C3F7 A0p;
    public boolean A0q;
    public boolean A0r;
    public final float A0s;
    public final int A0t;
    public final Rect A0u;
    public final Rect A0v;
    public final RectF A0w;
    public final AccessibilityManager A0x;
    public final C70593Ew A0y;
    public final C3FA A0z;
    public final C70603Ex A10;
    public final Runnable A11;
    public final ArrayList A12;
    public final List A13;
    public final List A14;
    public final int[] A15;
    public final int[] A16;
    public final int A17;
    public final C70583Ev A18;
    public final ArrayList A19;
    public final int[] A1A;
    public final int[] A1B;
    public RunnableC72643Nl mGapWorker;
    public final C3F5 mState;
    public final C3F2 mViewFlinger;
    public static final int[] A1I = {R.attr.nestedScrollingEnabled};
    public static final float A1E = (float) (Math.log(0.78d) / Math.log(0.9d));

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A0E(View view, View view2) {
        View view3 = view;
        if (view2 != null) {
            view3 = view2;
        }
        Rect rect = this.A0u;
        rect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof C3OP) {
            C3OP c3op = (C3OP) layoutParams;
            if (!c3op.A00) {
                Rect rect2 = c3op.A02;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        boolean z = !this.A0R;
        boolean z2 = false;
        if (view2 == null) {
            z2 = true;
        }
        abstractC70663Fe.A16(rect, view, this, z, z2);
    }

    private boolean A0P(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float A00 = AbstractC65767Tti.A00(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.A0s * 0.015f;
        double log = Math.log(abs / f);
        double d = A1E;
        return ((float) (((double) f) * Math.exp((d / (d - 1.0d)) * log))) < A00;
    }

    public final void A0k() {
        AbstractC110824yu abstractC110824yu;
        setScrollState(0);
        C3F2 c3f2 = this.mViewFlinger;
        c3f2.A06.removeCallbacks(c3f2);
        c3f2.A01.abortAnimation();
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null && (abstractC110824yu = abstractC70663Fe.A06) != null) {
            abstractC110824yu.A01();
        }
    }

    public final void A0t(int i, int i2) {
        A0y(null, i, i2, Integer.MIN_VALUE, false);
    }

    public final void A0z(C73733Sb c73733Sb, C3OO c3oo) {
        long j;
        c3oo.setFlags(0, 8192);
        if (this.mState.A0D && c3oo.isUpdated() && !c3oo.isRemoved() && !c3oo.shouldIgnore()) {
            if (this.A0A.hasStableIds()) {
                j = c3oo.mItemId;
            } else {
                j = c3oo.mPosition;
            }
            this.A10.A00.A09(j, c3oo);
        }
        this.A10.A01(c73733Sb, c3oo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.A0D.A16(rect, view, this, z, false);
    }

    public void setAdapter(C2UU c2uu) {
        suppressLayout(false);
        A0I(c2uu, this, false);
        A18(false);
        requestLayout();
    }

    /* loaded from: classes2.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.4if
            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.RecyclerView$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                ?? absSavedState = new AbsSavedState(parcel, null);
                absSavedState.A00 = parcel.readParcelable(AbstractC70663Fe.class.getClassLoader());
                return absSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new RecyclerView.SavedState[i];
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.recyclerview.widget.RecyclerView$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                ?? absSavedState = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = AbstractC70663Fe.class.getClassLoader();
                }
                absSavedState.A00 = parcel.readParcelable(classLoader);
                return absSavedState;
            }
        };
        public Parcelable A00;

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.A00, 0);
        }
    }

    public static int A04(EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i, int i2) {
        int round;
        if (i > 0) {
            if (edgeEffect != null && AbstractC65767Tti.A00(edgeEffect) != 0.0f) {
                round = Math.round(((-i2) / 4.0f) * AbstractC65767Tti.A01(edgeEffect, ((-i) * 4.0f) / i2, 0.5f));
                if (round != i) {
                    edgeEffect.finish();
                }
            } else {
                return i;
            }
        } else {
            if (i >= 0 || edgeEffect2 == null || AbstractC65767Tti.A00(edgeEffect2) == 0.0f) {
                return i;
            }
            float f = i2;
            round = Math.round((f / 4.0f) * AbstractC65767Tti.A01(edgeEffect2, (i * 4.0f) / f, 0.5f));
            if (round != i) {
                edgeEffect2.finish();
            }
        }
        return i - round;
    }

    public static C3OO A05(View view) {
        if (view == null) {
            return null;
        }
        return ((C3OP) view.getLayoutParams()).mViewHolder;
    }

    public static RecyclerView A06(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView A06 = A06(viewGroup.getChildAt(i));
            if (A06 != null) {
                return A06;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.3Sb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v8, types: [X.3Sb, java.lang.Object] */
    private void A07() {
        C3F5 c3f5;
        int i;
        C3OR c3or;
        long j;
        View focusedChild;
        C3OO A0X;
        long j2;
        int absoluteAdapterPosition;
        boolean z = true;
        this.mState.A01(1);
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        this.mState.A09 = false;
        A0j();
        C70603Ex c70603Ex = this.A10;
        C005001p c005001p = c70603Ex.A01;
        c005001p.clear();
        C003501a c003501a = c70603Ex.A00;
        c003501a.A07();
        this.A01++;
        A09();
        if (this.A0Z && hasFocus() && this.A0A != null && (focusedChild = getFocusedChild()) != null && (A0X = A0X(focusedChild)) != null) {
            c3f5 = this.mState;
            if (this.A0A.hasStableIds()) {
                j2 = A0X.mItemId;
            } else {
                j2 = -1;
            }
            c3f5.A07 = j2;
            if (this.A0P) {
                absoluteAdapterPosition = -1;
            } else if (A0X.isRemoved()) {
                absoluteAdapterPosition = A0X.mOldPosition;
            } else {
                absoluteAdapterPosition = A0X.getAbsoluteAdapterPosition();
            }
            c3f5.A01 = absoluteAdapterPosition;
            View view = A0X.itemView;
            loop0: while (true) {
                i = view.getId();
                while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                    view = ((ViewGroup) view).getFocusedChild();
                    if (view.getId() != -1) {
                        break;
                    }
                }
            }
        } else {
            c3f5 = this.mState;
            c3f5.A07 = -1L;
            i = -1;
            c3f5.A01 = -1;
        }
        c3f5.A02 = i;
        C3F5 c3f52 = this.mState;
        if (!c3f52.A0B || !this.A0V) {
            z = false;
        }
        c3f52.A0D = z;
        this.A0V = false;
        this.A0U = false;
        c3f52.A08 = c3f52.A0A;
        c3f52.A03 = this.A0A.getItemCount();
        A0N(this.A15);
        if (this.mState.A0B) {
            C3FI c3fi = this.A08;
            int A03 = c3fi.A03();
            for (int i2 = 0; i2 < A03; i2++) {
                C3OO A05 = A05(c3fi.A06(i2));
                if (!A05.shouldIgnore() && (!A05.isInvalid() || this.A0A.hasStableIds())) {
                    C3F1.A04(A05);
                    A05.getUnmodifiedPayloads();
                    ?? obj = new Object();
                    obj.A00(A05);
                    c70603Ex.A01(obj, A05);
                    if (this.mState.A0D && A05.isUpdated() && !A05.isRemoved() && !A05.shouldIgnore() && !A05.isInvalid()) {
                        if (this.A0A.hasStableIds()) {
                            j = A05.mItemId;
                        } else {
                            j = A05.mPosition;
                        }
                        c003501a.A09(j, A05);
                    }
                }
            }
        }
        if (this.mState.A0A) {
            C3FI c3fi2 = this.A08;
            int A04 = c3fi2.A04();
            for (int i3 = 0; i3 < A04; i3++) {
                C3OO A052 = A05(c3fi2.A07(i3));
                if (A1C && A052.mPosition == -1 && !A052.isRemoved()) {
                    throw new IllegalStateException(AnonymousClass001.A0R("view holder cannot have position -1 unless it is removed", A0Z()));
                }
                if (!A052.shouldIgnore()) {
                    A052.saveOldPosition();
                }
            }
            C3F5 c3f53 = this.mState;
            boolean z2 = c3f53.A0C;
            c3f53.A0C = false;
            this.A0D.A1R(this.A0y, c3f53);
            this.mState.A0C = z2;
            for (int i4 = 0; i4 < c3fi2.A03(); i4++) {
                C3OO A053 = A05(c3fi2.A06(i4));
                if (!A053.shouldIgnore() && ((c3or = (C3OR) c005001p.get(A053)) == null || (c3or.A00 & 4) == 0)) {
                    C3F1.A04(A053);
                    boolean hasAnyOfTheFlags = A053.hasAnyOfTheFlags(8192);
                    A053.getUnmodifiedPayloads();
                    ?? obj2 = new Object();
                    obj2.A00(A053);
                    if (hasAnyOfTheFlags) {
                        A0z(obj2, A053);
                    } else {
                        C3OR c3or2 = (C3OR) c005001p.get(A053);
                        C3OR c3or3 = c3or2;
                        if (c3or2 == null) {
                            C3OR c3or4 = (C3OR) C3OR.A03.A7H();
                            C3OR c3or5 = c3or4;
                            if (c3or4 == null) {
                                c3or5 = new Object();
                            }
                            c005001p.put(A053, c3or5);
                            c3or3 = c3or5;
                        }
                        c3or3.A00 |= 2;
                        c3or3.A02 = obj2;
                    }
                }
            }
        }
        C3FI c3fi3 = this.A08;
        int A042 = c3fi3.A04();
        for (int i5 = 0; i5 < A042; i5++) {
            C3OO A054 = A05(c3fi3.A07(i5));
            if (!A054.shouldIgnore()) {
                A054.clearOldPosition();
            }
        }
        C70593Ew c70593Ew = this.A0y;
        ArrayList arrayList = c70593Ew.A06;
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((C3OO) arrayList.get(i6)).clearOldPosition();
        }
        ArrayList arrayList2 = c70593Ew.A05;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            ((C3OO) arrayList2.get(i7)).clearOldPosition();
        }
        ArrayList arrayList3 = c70593Ew.A04;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i8 = 0; i8 < size3; i8++) {
                ((C3OO) arrayList3.get(i8)).clearOldPosition();
            }
        }
        A17(true);
        A19(false);
        this.mState.A04 = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r4.A0V != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r0 != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.A0D.A1J() == false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A09() {
        /*
            r4 = this;
            boolean r0 = r4.A0P
            if (r0 == 0) goto L1c
            X.3FD r1 = r4.A07
            java.util.ArrayList r0 = r1.A04
            r1.A09(r0)
            java.util.ArrayList r0 = r1.A05
            r1.A09(r0)
            r0 = 0
            r1.A00 = r0
            boolean r0 = r4.A0Q
            if (r0 == 0) goto L1c
            X.3Fe r0 = r4.A0D
            r0.A1I(r4)
        L1c:
            X.3F1 r0 = r4.A0C
            if (r0 == 0) goto L29
            X.3Fe r0 = r4.A0D
            boolean r0 = r0.A1J()
            r1 = 1
            if (r0 != 0) goto L2a
        L29:
            r1 = 0
        L2a:
            X.3FD r0 = r4.A07
            if (r1 == 0) goto L76
            r0.A07()
        L31:
            boolean r0 = r4.A0U
            r3 = 0
            if (r0 != 0) goto L3b
            boolean r0 = r4.A0V
            r2 = 0
            if (r0 == 0) goto L3c
        L3b:
            r2 = 1
        L3c:
            X.3F5 r1 = r4.mState
            boolean r0 = r4.A0R
            if (r0 == 0) goto L74
            X.3F1 r0 = r4.A0C
            if (r0 == 0) goto L74
            boolean r0 = r4.A0P
            if (r0 != 0) goto L6d
            if (r2 != 0) goto L52
            X.3Fe r0 = r4.A0D
            boolean r0 = r0.A0F
        L50:
            if (r0 == 0) goto L74
        L52:
            r0 = 1
        L53:
            r1.A0B = r0
            if (r0 == 0) goto L6a
            if (r2 == 0) goto L6a
            boolean r0 = r4.A0P
            if (r0 != 0) goto L6a
            X.3F1 r0 = r4.A0C
            if (r0 == 0) goto L6a
            X.3Fe r0 = r4.A0D
            boolean r0 = r0.A1J()
            if (r0 == 0) goto L6a
            r3 = 1
        L6a:
            r1.A0A = r3
            return
        L6d:
            X.2UU r0 = r4.A0A
            boolean r0 = r0.hasStableIds()
            goto L50
        L74:
            r0 = 0
            goto L53
        L76:
            r0.A06()
            goto L31
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A09():void");
    }

    private void A0A() {
        boolean z;
        VelocityTracker velocityTracker = this.A0m;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        A0p(0);
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.A04.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A06;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A05;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public static void A0C(MotionEvent motionEvent, RecyclerView recyclerView, int i, int i2) {
        float y;
        float x;
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (recyclerView.A0W) {
            return;
        }
        int[] iArr = recyclerView.A16;
        int i3 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean A1X = abstractC70663Fe.A1X();
        boolean A1Y = recyclerView.A0D.A1Y();
        int i4 = A1X ? 1 : 0;
        if (A1Y) {
            i4 = (A1X ? 1 : 0) | 2;
        }
        if (motionEvent == null) {
            y = recyclerView.getHeight() / 2.0f;
            x = recyclerView.getWidth() / 2.0f;
        } else {
            y = motionEvent.getY();
            x = motionEvent.getX();
        }
        int A00 = i - recyclerView.A00(i, y);
        int A01 = i2 - recyclerView.A01(i2, x);
        recyclerView.A0u(i4, 1);
        int i5 = 0;
        if (A1X) {
            i5 = A00;
        }
        int i6 = 0;
        if (A1Y) {
            i6 = A01;
        }
        if (recyclerView.A1G(iArr, recyclerView.A1B, i5, i6, 1)) {
            A00 -= iArr[0];
            A01 -= iArr[1];
        }
        int i7 = 0;
        if (A1X) {
            i7 = A00;
        }
        if (A1Y) {
            i3 = A01;
        }
        recyclerView.A1F(motionEvent, i7, i3, 1);
        RunnableC72643Nl runnableC72643Nl = recyclerView.mGapWorker;
        if (runnableC72643Nl != null && (A00 != 0 || A01 != 0)) {
            runnableC72643Nl.A01(recyclerView, A00, A01);
        }
        recyclerView.A0p(1);
    }

    public static void A0I(C2UU c2uu, RecyclerView recyclerView, boolean z) {
        C2UU c2uu2 = recyclerView.A0A;
        if (c2uu2 != null) {
            c2uu2.unregisterAdapterDataObserver(recyclerView.A18);
            recyclerView.A0A.onDetachedFromRecyclerView(recyclerView);
        }
        C3F1 c3f1 = recyclerView.A0C;
        if (c3f1 != null) {
            c3f1.A0I();
        }
        AbstractC70663Fe abstractC70663Fe = recyclerView.A0D;
        if (abstractC70663Fe != null) {
            C70593Ew c70593Ew = recyclerView.A0y;
            abstractC70663Fe.A0v(c70593Ew);
            recyclerView.A0D.A0w(c70593Ew);
        }
        C70593Ew c70593Ew2 = recyclerView.A0y;
        c70593Ew2.A06();
        C3FD c3fd = recyclerView.A07;
        c3fd.A09(c3fd.A04);
        c3fd.A09(c3fd.A05);
        c3fd.A00 = 0;
        C2UU c2uu3 = recyclerView.A0A;
        recyclerView.A0A = c2uu;
        if (c2uu != null) {
            c2uu.registerAdapterDataObserver(recyclerView.A18);
            c2uu.onAttachedToRecyclerView(recyclerView);
        }
        AbstractC70663Fe abstractC70663Fe2 = recyclerView.A0D;
        if (abstractC70663Fe2 != null) {
            abstractC70663Fe2.A1Q(c2uu3, recyclerView.A0A);
        }
        C2UU c2uu4 = recyclerView.A0A;
        c70593Ew2.A06();
        C70593Ew.A00(c2uu3, c70593Ew2, true);
        if (c70593Ew2.A02 == null) {
            c70593Ew2.A02 = new C70783Fq();
            C70593Ew.A01(c70593Ew2);
        }
        C70783Fq c70783Fq = c70593Ew2.A02;
        if (c2uu3 != null) {
            c70783Fq.A00--;
        }
        if (!z && c70783Fq.A00 == 0) {
            c70783Fq.A01();
        }
        if (c2uu4 != null) {
            c70783Fq.A00++;
        }
        C70593Ew.A01(c70593Ew2);
        recyclerView.mState.A0C = true;
    }

    public static void A0J(C3OO c3oo) {
        WeakReference weakReference = c3oo.mNestedRecyclerView;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view != c3oo.itemView) {
                        obj = view.getParent();
                        if (!(obj instanceof View)) {
                        }
                    } else {
                        return;
                    }
                }
                c3oo.mNestedRecyclerView = null;
                return;
            }
        }
    }

    public static void A0M(RecyclerView recyclerView, C3OO c3oo) {
        View view = c3oo.itemView;
        boolean z = false;
        if (view.getParent() == recyclerView) {
            z = true;
        }
        recyclerView.A0y.A0D(recyclerView.A0Y(view));
        boolean isTmpDetached = c3oo.isTmpDetached();
        C3FI c3fi = recyclerView.A08;
        if (isTmpDetached) {
            c3fi.A0B(view, view.getLayoutParams(), -1, true);
            return;
        }
        if (!z) {
            c3fi.A0A(view, -1, true);
            return;
        }
        int indexOfChild = ((C3FG) c3fi.A03).A00.indexOfChild(view);
        if (indexOfChild >= 0) {
            c3fi.A02.A04(indexOfChild);
            C3FI.A01(view, c3fi);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private void A0N(int[] iArr) {
        int i;
        C3FI c3fi = this.A08;
        int A03 = c3fi.A03();
        if (A03 == 0) {
            i = -1;
            iArr[0] = -1;
        } else {
            int i2 = Integer.MAX_VALUE;
            i = Integer.MIN_VALUE;
            for (int i3 = 0; i3 < A03; i3++) {
                C3OO A05 = A05(c3fi.A06(i3));
                if (!A05.shouldIgnore()) {
                    int layoutPosition = A05.getLayoutPosition();
                    if (layoutPosition < i2) {
                        i2 = layoutPosition;
                    }
                    if (layoutPosition > i) {
                        i = layoutPosition;
                    }
                }
            }
            iArr[0] = i2;
        }
        iArr[1] = i;
    }

    private C03I getScrollingChildHelper() {
        C03I c03i = this.A0n;
        if (c03i == null) {
            C03I c03i2 = new C03I(this);
            this.A0n = c03i2;
            return c03i2;
        }
        return c03i;
    }

    public final int A0R(C3OO c3oo) {
        if (!c3oo.hasAnyOfTheFlags(524) && c3oo.isBound()) {
            C3FD c3fd = this.A07;
            int i = c3oo.mPosition;
            ArrayList arrayList = c3fd.A04;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3QV c3qv = (C3QV) arrayList.get(i2);
                int i3 = c3qv.A00;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            if (c3qv.A02 == i) {
                                i = c3qv.A01;
                            } else {
                                if (c3qv.A02 < i) {
                                    i--;
                                }
                                if (c3qv.A01 <= i) {
                                    i++;
                                }
                            }
                        }
                    } else if (c3qv.A02 > i) {
                        continue;
                    } else if (c3qv.A02 + c3qv.A01 <= i) {
                        i -= c3qv.A01;
                    }
                } else if (c3qv.A02 <= i) {
                    i += c3qv.A01;
                }
            }
            return i;
        }
        return -1;
    }

    public final View A0T(float f, float f2) {
        C3FI c3fi = this.A08;
        int A03 = c3fi.A03();
        while (true) {
            A03--;
            if (A03 >= 0) {
                View A06 = c3fi.A06(A03);
                float translationX = A06.getTranslationX();
                float translationY = A06.getTranslationY();
                if (f >= A06.getLeft() + translationX && f <= A06.getRight() + translationX && f2 >= A06.getTop() + translationY && f2 <= A06.getBottom() + translationY) {
                    return A06;
                }
            } else {
                return null;
            }
        }
    }

    public final C3OO A0V(int i) {
        C3OO c3oo = null;
        if (!this.A0P) {
            C3FI c3fi = this.A08;
            int A04 = c3fi.A04();
            for (int i2 = 0; i2 < A04; i2++) {
                C3OO A05 = A05(c3fi.A07(i2));
                if (A05 != null && !A05.isRemoved() && A0R(A05) == i) {
                    if (c3fi.A04.contains(A05.itemView)) {
                        c3oo = A05;
                    } else {
                        return A05;
                    }
                }
            }
        }
        return c3oo;
    }

    public final C3OO A0W(int i, boolean z) {
        int layoutPosition;
        C3FI c3fi = this.A08;
        int A04 = c3fi.A04();
        C3OO c3oo = null;
        for (int i2 = 0; i2 < A04; i2++) {
            C3OO A05 = A05(c3fi.A07(i2));
            if (A05 != null && !A05.isRemoved()) {
                if (z) {
                    layoutPosition = A05.mPosition;
                } else {
                    layoutPosition = A05.getLayoutPosition();
                }
                if (layoutPosition == i) {
                    if (c3fi.A04.contains(A05.itemView)) {
                        c3oo = A05;
                    } else {
                        return A05;
                    }
                } else {
                    continue;
                }
            }
        }
        return c3oo;
    }

    public final String A0Z() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.A0A);
        sb.append(", layout:");
        sb.append(this.A0D);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public final void A0a() {
        List list = this.A0M;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:179:0x03c0, code lost:
    
        if (r20.A08.A04.contains(getFocusedChild()) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0403, code lost:
    
        if (r9 != null) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r0 != 0) goto L301;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02b8 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0403 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b6  */
    /* JADX WARN: Type inference failed for: r0v102, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v103 */
    /* JADX WARN: Type inference failed for: r0v107, types: [X.01a] */
    /* JADX WARN: Type inference failed for: r0v108 */
    /* JADX WARN: Type inference failed for: r0v109, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v115 */
    /* JADX WARN: Type inference failed for: r0v116 */
    /* JADX WARN: Type inference failed for: r0v117, types: [X.3Sb, X.3FI] */
    /* JADX WARN: Type inference failed for: r0v118, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v119, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v120, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v121, types: [java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v126, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v127, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v131, types: [int] */
    /* JADX WARN: Type inference failed for: r0v141 */
    /* JADX WARN: Type inference failed for: r0v151 */
    /* JADX WARN: Type inference failed for: r0v152 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.3Ex] */
    /* JADX WARN: Type inference failed for: r15v0, types: [X.3Sb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [X.3F1] */
    /* JADX WARN: Type inference failed for: r20v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0c() {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0c():void");
    }

    public final void A0d() {
        int measuredHeight;
        if (this.A03 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A03 = edgeEffect;
            boolean z = this.A0O;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public final void A0e() {
        int measuredWidth;
        if (this.A04 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A04 = edgeEffect;
            boolean z = this.A0O;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public final void A0f() {
        int measuredWidth;
        if (this.A05 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A05 = edgeEffect;
            boolean z = this.A0O;
            int measuredHeight = getMeasuredHeight();
            if (z) {
                measuredHeight = (measuredHeight - getPaddingTop()) - getPaddingBottom();
                measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            } else {
                measuredWidth = getMeasuredWidth();
            }
            edgeEffect.setSize(measuredHeight, measuredWidth);
        }
    }

    public final void A0g() {
        int measuredHeight;
        if (this.A06 == null) {
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.A06 = edgeEffect;
            boolean z = this.A0O;
            int measuredWidth = getMeasuredWidth();
            if (z) {
                measuredWidth = (measuredWidth - getPaddingLeft()) - getPaddingRight();
                measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            } else {
                measuredHeight = getMeasuredHeight();
            }
            edgeEffect.setSize(measuredWidth, measuredHeight);
        }
    }

    public final void A0h() {
        if (this.A12.size() != 0) {
            AbstractC70663Fe abstractC70663Fe = this.A0D;
            if (abstractC70663Fe != null) {
                abstractC70663Fe.A1D("Cannot invalidate item decorations during a scroll or layout");
            }
            A0i();
            requestLayout();
        }
    }

    public final void A0i() {
        C3FI c3fi = this.A08;
        int A04 = c3fi.A04();
        for (int i = 0; i < A04; i++) {
            ((C3OP) c3fi.A07(i).getLayoutParams()).A00 = true;
        }
        ArrayList arrayList = this.A0y.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3OP c3op = (C3OP) ((C3OO) arrayList.get(i2)).itemView.getLayoutParams();
            if (c3op != null) {
                c3op.A00 = true;
            }
        }
    }

    public final void A0j() {
        int i = this.A0f + 1;
        this.A0f = i;
        if (i == 1 && !this.A0W) {
            this.A0X = false;
        }
    }

    public final void A0l(int i) {
        if (this.A0D != null) {
            setScrollState(2);
            this.A0D.A1O(i);
            awakenScrollBars();
        }
    }

    public final void A0m(int i) {
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        if (i < size) {
            int size2 = arrayList.size();
            if (i < size2) {
                A11((AbstractC70653Fc) arrayList.get(i));
                return;
            }
            throw new IndexOutOfBoundsException(AnonymousClass001.A0P(" is an invalid index for size ", i, size2));
        }
        throw new IndexOutOfBoundsException(AnonymousClass001.A0P(" is an invalid index for size ", i, size));
    }

    public final void A0n(int i) {
        if (!this.A0W) {
            A0k();
            AbstractC70663Fe abstractC70663Fe = this.A0D;
            if (abstractC70663Fe == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                abstractC70663Fe.A1O(i);
                awakenScrollBars();
            }
        }
    }

    public final void A0o(int i) {
        if (!this.A0W) {
            AbstractC70663Fe abstractC70663Fe = this.A0D;
            if (abstractC70663Fe == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                abstractC70663Fe.A1T(this.mState, this, i);
            }
        }
    }

    public final void A0q(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.A04;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.A04.onRelease();
            z = this.A04.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.A05;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.A05.onRelease();
            z |= this.A05.isFinished();
        }
        EdgeEffect edgeEffect3 = this.A06;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.A06.onRelease();
            z |= this.A06.isFinished();
        }
        EdgeEffect edgeEffect4 = this.A03;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.A03.onRelease();
            z |= this.A03.isFinished();
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    public final void A0s(int i, int i2) {
        this.A0c++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        C1I4 c1i4 = this.A0G;
        if (c1i4 != null) {
            c1i4.onScrolled(this, i, i2);
        }
        List list = this.A0M;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((C1I4) this.A0M.get(size)).onScrolled(this, i, i2);
                }
            }
        }
        this.A0c--;
    }

    public final void A0v(int i, int i2, boolean z) {
        int i3 = i + i2;
        C3FI c3fi = this.A08;
        int A04 = c3fi.A04();
        for (int i4 = 0; i4 < A04; i4++) {
            C3OO A05 = A05(c3fi.A07(i4));
            if (A05 != null && !A05.shouldIgnore()) {
                int i5 = A05.mPosition;
                if (i5 >= i3) {
                    A05.offsetPosition(-i2, z);
                } else if (i5 >= i) {
                    A05.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                }
                this.mState.A0C = true;
            }
        }
        C70593Ew c70593Ew = this.A0y;
        ArrayList arrayList = c70593Ew.A06;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3OO c3oo = (C3OO) arrayList.get(size);
                if (c3oo != null) {
                    if (c3oo.mPosition >= i3) {
                        c3oo.offsetPosition(-i2, z);
                    } else if (c3oo.mPosition >= i) {
                        c3oo.addFlags(8);
                        c70593Ew.A09(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void A0y(Interpolator interpolator, int i, int i2, int i3, boolean z) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0W) {
            return;
        }
        int i4 = 0;
        if (!abstractC70663Fe.A1X()) {
            i = 0;
        }
        if (!this.A0D.A1Y()) {
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return;
        }
        if (i3 != Integer.MIN_VALUE && i3 <= 0) {
            scrollBy(i, i2);
            return;
        }
        if (z) {
            if (i != 0) {
                i4 = 1;
            }
            if (i2 != 0) {
                i4 |= 2;
            }
            A0u(i4, 1);
        }
        this.mViewFlinger.A02(interpolator, i, i2, i3);
    }

    public final void A10(AbstractC70653Fc abstractC70653Fc) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A1D("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(abstractC70653Fc);
        A0i();
        requestLayout();
    }

    public final void A11(AbstractC70653Fc abstractC70653Fc) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A1D("Cannot remove item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A12;
        arrayList.remove(abstractC70653Fc);
        if (arrayList.isEmpty()) {
            boolean z = false;
            if (getOverScrollMode() == 2) {
                z = true;
            }
            setWillNotDraw(z);
        }
        A0i();
        requestLayout();
    }

    public final void A12(C7LD c7ld) {
        this.A19.add(c7ld);
    }

    public final void A13(C7LD c7ld) {
        this.A19.remove(c7ld);
        if (this.A0F == c7ld) {
            this.A0F = null;
        }
    }

    public void A14(C1I4 c1i4) {
        List list = this.A0M;
        if (list == null) {
            list = new ArrayList();
            this.A0M = list;
        }
        list.add(c1i4);
    }

    public void A15(C1I4 c1i4) {
        List list = this.A0M;
        if (list != null) {
            list.remove(c1i4);
        }
    }

    public final void A16(String str) {
        if (this.A01 > 0) {
            if (str == null) {
                throw new IllegalStateException(AnonymousClass001.A0R("Cannot call this method while RecyclerView is computing a layout or scrolling", A0Z()));
            }
            throw new IllegalStateException(str);
        }
        if (this.A0c > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(AnonymousClass001.A0R("", A0Z())));
        }
    }

    public final void A17(boolean z) {
        int i;
        AccessibilityManager accessibilityManager;
        int i2 = this.A01 - 1;
        this.A01 = i2;
        if (i2 < 1) {
            if (A1C && i2 < 0) {
                throw new IllegalStateException(AnonymousClass001.A0R("layout or scroll counter cannot go below zero.Some calls are not matching", A0Z()));
            }
            this.A01 = 0;
            if (z) {
                int i3 = this.A00;
                this.A00 = 0;
                if (i3 != 0 && (accessibilityManager = this.A0x) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(C3OO.FLAG_MOVED);
                    obtain.setContentChangeTypes(i3);
                    sendAccessibilityEventUnchecked(obtain);
                }
                List list = this.A13;
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        C3OO c3oo = (C3OO) list.get(size);
                        if (c3oo.itemView.getParent() == this && !c3oo.shouldIgnore() && (i = c3oo.mPendingAccessibilityState) != -1) {
                            c3oo.itemView.setImportantForAccessibility(i);
                            c3oo.mPendingAccessibilityState = -1;
                        }
                    } else {
                        list.clear();
                        return;
                    }
                }
            }
        }
    }

    public final void A18(boolean z) {
        this.A0Q = z | this.A0Q;
        this.A0P = true;
        C3FI c3fi = this.A08;
        int A04 = c3fi.A04();
        for (int i = 0; i < A04; i++) {
            C3OO A05 = A05(c3fi.A07(i));
            if (A05 != null && !A05.shouldIgnore()) {
                A05.addFlags(6);
            }
        }
        A0i();
        C70593Ew c70593Ew = this.A0y;
        ArrayList arrayList = c70593Ew.A06;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3OO c3oo = (C3OO) arrayList.get(i2);
            if (c3oo != null) {
                c3oo.addFlags(6);
                c3oo.addChangePayload(null);
            }
        }
        C2UU c2uu = c70593Ew.A08.A0A;
        if (c2uu == null || !c2uu.hasStableIds()) {
            c70593Ew.A07();
        }
    }

    public final void A19(boolean z) {
        int i = this.A0f;
        if (i < 1) {
            if (!A1C) {
                this.A0f = 1;
                i = 1;
            } else {
                throw new IllegalStateException(AnonymousClass001.A0R("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.", A0Z()));
            }
        }
        if (!z && !this.A0W) {
            this.A0X = false;
        }
        if (i == 1) {
            if (z && this.A0X && !this.A0W && this.A0D != null && this.A0A != null) {
                A0c();
            }
            if (!this.A0W) {
                this.A0X = false;
            }
        }
        this.A0f--;
    }

    public final boolean A1C() {
        if (this.A0R && !this.A0P && this.A07.A04.size() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean A1D() {
        if (this.A01 <= 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        if (r7 != false) goto L156;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f2  */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean A1E(int r10, int r11) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1E(int, int):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004d, code lost:
    
        if (r0 != 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fc, code lost:
    
        if (r5 == 0.0f) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A1F(android.view.MotionEvent r24, int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A1F(android.view.MotionEvent, int, int, int):boolean");
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C3OP) && this.A0D.A1Z((C3OP) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1X()) {
            return 0;
        }
        return this.A0D.A0X(this.mState);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1X()) {
            return 0;
        }
        return this.A0D.A0Y(this.mState);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1X()) {
            return 0;
        }
        return this.A0D.A0Z(this.mState);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1Y()) {
            return 0;
        }
        return this.A0D.A0a(this.mState);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1Y()) {
            return 0;
        }
        return this.A0D.A0b(this.mState);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null || !abstractC70663Fe.A1Y()) {
            return 0;
        }
        return this.A0D.A0c(this.mState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r11.A0W != false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x008e, code lost:
    
        if (r5.findNextFocus(r11, r12, r0) == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r5.findNextFocus(r11, r12, r0) == null) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
    
        A0b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
    
        if (A0U(r12) == null) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        A0j();
        r11.A0D.A1E(r12, r11.A0y, r11.mState, r13);
        A19(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r5 == null) goto L251;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0142, code lost:
    
        if (r3 <= r2) goto L235;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0160 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View focusSearch(android.view.View r12, int r13) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            return abstractC70663Fe.A0g();
        }
        throw new IllegalStateException(AnonymousClass001.A0R("RecyclerView has no LayoutManager", A0Z()));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            return abstractC70663Fe.A1N(getContext(), attributeSet);
        }
        throw new IllegalStateException(AnonymousClass001.A0R("RecyclerView has no LayoutManager", A0Z()));
    }

    public C2UU getAdapter() {
        return this.A0A;
    }

    @Override // android.view.View
    public int getBaseline() {
        if (this.A0D != null) {
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        C7KW c7kw = this.A0o;
        if (c7kw == null) {
            return super.getChildDrawingOrder(i, i2);
        }
        return c7kw.DJO(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.A0O;
    }

    public C3FK getCompatAccessibilityDelegate() {
        return this.A0J;
    }

    public AbstractC70573Eu getEdgeEffectFactory() {
        return this.A0B;
    }

    public C3F1 getItemAnimator() {
        return this.A0C;
    }

    public int getItemDecorationCount() {
        return this.A12.size();
    }

    public AbstractC70663Fe getLayoutManager() {
        return this.A0D;
    }

    public int getMaxFlingVelocity() {
        return this.A17;
    }

    public int getMinFlingVelocity() {
        return this.A0t;
    }

    public AbstractC61812ri getOnFlingListener() {
        return this.A0E;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.A0Z;
    }

    public C70783Fq getRecycledViewPool() {
        C70593Ew c70593Ew = this.A0y;
        if (c70593Ew.A02 == null) {
            c70593Ew.A02 = new C70783Fq();
            C70593Ew.A01(c70593Ew);
        }
        return c70593Ew.A02;
    }

    public int getScrollState() {
        return this.A02;
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.A0T;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.A0W;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (r2 != 0.0f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r1 != 0.0f) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
    
        A0C(r6, r5, (int) (r1 * r5.A0a), (int) (r2 * r5.A0b));
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.3Fe r0 = r5.A0D
            r4 = 0
            if (r0 == 0) goto L4a
            boolean r0 = r5.A0W
            if (r0 != 0) goto L4a
            int r1 = r6.getAction()
            r0 = 8
            if (r1 != r0) goto L4a
            int r0 = r6.getSource()
            r0 = r0 & 2
            r3 = 0
            if (r0 == 0) goto L4d
            X.3Fe r0 = r5.A0D
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L4b
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r2 = -r0
        L29:
            X.3Fe r0 = r5.A0D
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L65
            r0 = 10
            float r1 = r6.getAxisValue(r0)
        L37:
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 != 0) goto L3f
        L3b:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L4a
        L3f:
            float r0 = r5.A0a
            float r1 = r1 * r0
            int r1 = (int) r1
            float r0 = r5.A0b
            float r2 = r2 * r0
            int r0 = (int) r2
            A0C(r6, r5, r1, r0)
        L4a:
            return r4
        L4b:
            r2 = 0
            goto L29
        L4d:
            int r1 = r6.getSource()
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L4a
            r0 = 26
            float r1 = r6.getAxisValue(r0)
            X.3Fe r0 = r5.A0D
            boolean r0 = r0.A1Y()
            if (r0 == 0) goto L67
            float r2 = -r1
        L65:
            r1 = 0
            goto L37
        L67:
            X.3Fe r0 = r5.A0D
            boolean r0 = r0.A1X()
            if (r0 == 0) goto L4a
            r2 = 0
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c3, code lost:
    
        if (r2 != false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
    
        if (r11.A02 != 2) goto L174;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC09780fb.A01("RV OnLayout", 917921195);
        A0c();
        AbstractC09780fb.A00(-1137219050);
        this.A0R = true;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null) {
            A0r(i, i2);
            return;
        }
        boolean z = false;
        if (abstractC70663Fe.A14()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.A0D.A0y(this.A0y, this.mState, i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.A0r = z;
            if (z || this.A0A == null) {
                return;
            }
            if (this.mState.A04 == 1) {
                A07();
            }
            this.A0D.A0k(i, i2);
            this.mState.A09 = true;
            A08();
            this.A0D.A0l(i, i2);
            if (this.A0D.A15()) {
                this.A0D.A0k(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO));
                this.mState.A09 = true;
                A08();
                this.A0D.A0l(i, i2);
            }
            this.A0h = getMeasuredWidth();
            this.A0g = getMeasuredHeight();
            return;
        }
        if (this.A0S) {
            abstractC70663Fe.A0y(this.A0y, this.mState, i, i2);
            return;
        }
        if (this.A0N) {
            A0j();
            this.A01++;
            A09();
            A17(true);
            C3F5 c3f5 = this.mState;
            if (c3f5.A0A) {
                c3f5.A08 = true;
            } else {
                this.A07.A06();
                this.mState.A08 = false;
            }
            this.A0N = false;
            A19(false);
        } else if (this.mState.A0A) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        C2UU c2uu = this.A0A;
        if (c2uu != null) {
            this.mState.A03 = c2uu.getItemCount();
        } else {
            this.mState.A03 = 0;
        }
        A0j();
        this.A0D.A0y(this.A0y, this.mState, i, i2);
        A19(false);
        this.mState.A08 = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (this.A01 > 0) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.A0I = savedState;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.recyclerview.widget.RecyclerView$SavedState, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelable;
        Parcelable.Creator creator = SavedState.CREATOR;
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        SavedState savedState = this.A0I;
        if (savedState != null) {
            parcelable = savedState.A00;
        } else {
            AbstractC70663Fe abstractC70663Fe = this.A0D;
            if (abstractC70663Fe != null) {
                parcelable = abstractC70663Fe.A1M();
            } else {
                parcelable = null;
            }
        }
        absSavedState.A00 = parcelable;
        return absSavedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        AbstractC110824yu abstractC110824yu = this.A0D.A06;
        if ((abstractC110824yu == null || !abstractC110824yu.A05) && this.A01 <= 0 && view2 != null) {
            A0E(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.A19;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C7LD) arrayList.get(i)).Dfm(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.A0f == 0 && !this.A0W) {
            super.requestLayout();
        } else {
            this.A0X = true;
        }
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.A0W) {
            return;
        }
        boolean A1X = abstractC70663Fe.A1X();
        boolean A1Y = this.A0D.A1Y();
        if (!A1X && !A1Y) {
            return;
        }
        if (!A1X) {
            i = 0;
        }
        if (!A1Y) {
            i2 = 0;
        }
        A1F(null, i, i2, 0);
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int contentChangeTypes;
        if (this.A01 > 0) {
            int i = 0;
            if (accessibilityEvent != null && (contentChangeTypes = accessibilityEvent.getContentChangeTypes()) != 0) {
                i = contentChangeTypes;
            }
            this.A00 |= i;
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(C3FK c3fk) {
        this.A0J = c3fk;
        AbstractC010103p.A0B(this, c3fk);
    }

    public void setChildDrawingOrderCallback(C7KW c7kw) {
        if (c7kw != this.A0o) {
            this.A0o = c7kw;
            boolean z = false;
            if (c7kw != null) {
                z = true;
            }
            setChildrenDrawingOrderEnabled(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.A0O) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
        this.A0O = z;
        super.setClipToPadding(z);
        if (this.A0R) {
            requestLayout();
        }
    }

    public void setItemAnimator(C3F1 c3f1) {
        C3F1 c3f12 = this.A0C;
        if (c3f12 != null) {
            c3f12.A0I();
            this.A0C.A04 = null;
        }
        this.A0C = c3f1;
        if (c3f1 != null) {
            c3f1.A04 = this.A0p;
        }
    }

    public void setItemViewCacheSize(int i) {
        C70593Ew c70593Ew = this.A0y;
        c70593Ew.A00 = i;
        c70593Ew.A08();
    }

    public void setLayoutManager(AbstractC70663Fe abstractC70663Fe) {
        C70593Ew c70593Ew;
        C3FH c3fh;
        if (abstractC70663Fe != this.A0D) {
            A0k();
            if (this.A0D != null) {
                C3F1 c3f1 = this.A0C;
                if (c3f1 != null) {
                    c3f1.A0I();
                }
                AbstractC70663Fe abstractC70663Fe2 = this.A0D;
                c70593Ew = this.A0y;
                abstractC70663Fe2.A0v(c70593Ew);
                this.A0D.A0w(c70593Ew);
                c70593Ew.A06();
                if (this.A0T) {
                    AbstractC70663Fe abstractC70663Fe3 = this.A0D;
                    abstractC70663Fe3.A0B = false;
                    abstractC70663Fe3.A0z(c70593Ew, this);
                }
                AbstractC70663Fe abstractC70663Fe4 = this.A0D;
                abstractC70663Fe4.A07 = null;
                abstractC70663Fe4.A05 = null;
                abstractC70663Fe4.A03 = 0;
                abstractC70663Fe4.A00 = 0;
                abstractC70663Fe4.A04 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                abstractC70663Fe4.A01 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                this.A0D = null;
            } else {
                c70593Ew = this.A0y;
                c70593Ew.A06();
            }
            C3FI c3fi = this.A08;
            c3fi.A02.A02();
            List list = c3fi.A04;
            int size = list.size();
            while (true) {
                size--;
                c3fh = c3fi.A03;
                if (size < 0) {
                    break;
                }
                C3FG c3fg = (C3FG) c3fh;
                C3OO A05 = A05((View) list.get(size));
                if (A05 != null) {
                    A05.onLeftHiddenState(c3fg.A00);
                }
                list.remove(size);
            }
            RecyclerView recyclerView = ((C3FG) c3fh).A00;
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                recyclerView.A0x(childAt);
                childAt.clearAnimation();
            }
            recyclerView.removeAllViews();
            this.A0D = abstractC70663Fe;
            if (abstractC70663Fe != null) {
                if (abstractC70663Fe.A07 == null) {
                    abstractC70663Fe.A07 = this;
                    abstractC70663Fe.A05 = c3fi;
                    abstractC70663Fe.A03 = getWidth();
                    abstractC70663Fe.A00 = getHeight();
                    abstractC70663Fe.A04 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                    abstractC70663Fe.A01 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                    if (this.A0T) {
                        AbstractC70663Fe abstractC70663Fe5 = this.A0D;
                        abstractC70663Fe5.A0B = true;
                        abstractC70663Fe5.A1U(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(abstractC70663Fe);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(abstractC70663Fe.A07.A0Z());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            c70593Ew.A08();
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setRecycledViewPool(C70783Fq c70783Fq) {
        C70593Ew c70593Ew = this.A0y;
        RecyclerView recyclerView = c70593Ew.A08;
        C70593Ew.A00(recyclerView.A0A, c70593Ew, false);
        if (c70593Ew.A02 != null) {
            r1.A00--;
        }
        c70593Ew.A02 = c70783Fq;
        if (c70783Fq != null && recyclerView.A0A != null) {
            c70783Fq.A00++;
        }
        C70593Ew.A01(c70593Ew);
    }

    public void setScrollState(int i) {
        AbstractC110824yu abstractC110824yu;
        if (i != this.A02) {
            this.A02 = i;
            if (i != 2) {
                C3F2 c3f2 = this.mViewFlinger;
                c3f2.A06.removeCallbacks(c3f2);
                c3f2.A01.abortAnimation();
                AbstractC70663Fe abstractC70663Fe = this.A0D;
                if (abstractC70663Fe != null && (abstractC110824yu = abstractC70663Fe.A06) != null) {
                    abstractC110824yu.A01();
                }
            }
            AbstractC70663Fe abstractC70663Fe2 = this.A0D;
            if (abstractC70663Fe2 != null) {
                abstractC70663Fe2.A0j(i);
            }
            C1I4 c1i4 = this.A0G;
            if (c1i4 != null) {
                c1i4.onScrollStateChanged(this, i);
            }
            List list = this.A0M;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((C1I4) this.A0M.get(size)).onScrollStateChanged(this, i);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setViewCacheExtension(AbstractC72457Xe3 abstractC72457Xe3) {
        this.A0y.A03 = abstractC72457Xe3;
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.A0W) {
            A16("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.A0W = false;
                if (this.A0X && this.A0D != null && this.A0A != null) {
                    requestLayout();
                }
                this.A0X = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.A0W = true;
            this.A0q = true;
            A0k();
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.3Et, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        A1H = new Class[]{Context.class, AttributeSet.class, cls, cls};
        A1F = new Interpolator() { // from class: X.3Es
            @Override // android.animation.TimeInterpolator
            public final float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        };
        A1G = new Object();
    }

    private int A00(int i, float f) {
        float A01;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect3 = this.A04;
        float f2 = 0.0f;
        if (edgeEffect3 != null && AbstractC65767Tti.A00(edgeEffect3) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                edgeEffect2 = this.A04;
                edgeEffect2.onRelease();
            } else {
                A01 = -AbstractC65767Tti.A01(this.A04, -width, 1.0f - height);
                if (AbstractC65767Tti.A00(this.A04) == 0.0f) {
                    edgeEffect = this.A04;
                    edgeEffect.onRelease();
                }
                f2 = A01;
            }
        } else {
            EdgeEffect edgeEffect4 = this.A05;
            if (edgeEffect4 != null && AbstractC65767Tti.A00(edgeEffect4) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    edgeEffect2 = this.A05;
                    edgeEffect2.onRelease();
                } else {
                    A01 = AbstractC65767Tti.A01(this.A05, width, height);
                    if (AbstractC65767Tti.A00(this.A05) == 0.0f) {
                        edgeEffect = this.A05;
                        edgeEffect.onRelease();
                    }
                    f2 = A01;
                }
            }
            return Math.round(f2 * getWidth());
        }
        invalidate();
        return Math.round(f2 * getWidth());
    }

    private int A01(int i, float f) {
        float A01;
        EdgeEffect edgeEffect;
        EdgeEffect edgeEffect2;
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect3 = this.A06;
        float f2 = 0.0f;
        if (edgeEffect3 != null && AbstractC65767Tti.A00(edgeEffect3) != 0.0f) {
            if (canScrollVertically(-1)) {
                edgeEffect2 = this.A06;
                edgeEffect2.onRelease();
            } else {
                A01 = -AbstractC65767Tti.A01(this.A06, -height, width);
                if (AbstractC65767Tti.A00(this.A06) == 0.0f) {
                    edgeEffect = this.A06;
                    edgeEffect.onRelease();
                }
                f2 = A01;
            }
        } else {
            EdgeEffect edgeEffect4 = this.A03;
            if (edgeEffect4 != null && AbstractC65767Tti.A00(edgeEffect4) != 0.0f) {
                if (canScrollVertically(1)) {
                    edgeEffect2 = this.A03;
                    edgeEffect2.onRelease();
                } else {
                    A01 = AbstractC65767Tti.A01(this.A03, height, 1.0f - width);
                    if (AbstractC65767Tti.A00(this.A03) == 0.0f) {
                        edgeEffect = this.A03;
                        edgeEffect.onRelease();
                    }
                    f2 = A01;
                }
            }
            return Math.round(f2 * getHeight());
        }
        invalidate();
        return Math.round(f2 * getHeight());
    }

    public static final int A02(View view) {
        C3OO A05 = A05(view);
        if (A05 != null) {
            return A05.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public static final int A03(View view) {
        C3OO A05 = A05(view);
        if (A05 != null) {
            return A05.getLayoutPosition();
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
    
        if (r4.A0C == null) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A08() {
        /*
            r4 = this;
            r4.A0j()
            int r0 = r4.A01
            int r0 = r0 + 1
            r4.A01 = r0
            X.3F5 r1 = r4.mState
            r0 = 6
            r1.A01(r0)
            X.3FD r0 = r4.A07
            r0.A06()
            X.3F5 r1 = r4.mState
            X.2UU r0 = r4.A0A
            int r0 = r0.getItemCount()
            r1.A03 = r0
            X.3F5 r0 = r4.mState
            r3 = 0
            r0.A00 = r3
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.A0I
            if (r0 == 0) goto L3d
            X.2UU r0 = r4.A0A
            boolean r0 = r0.canRestoreState()
            if (r0 == 0) goto L3d
            androidx.recyclerview.widget.RecyclerView$SavedState r0 = r4.A0I
            android.os.Parcelable r1 = r0.A00
            if (r1 == 0) goto L3a
            X.3Fe r0 = r4.A0D
            r0.A1P(r1)
        L3a:
            r0 = 0
            r4.A0I = r0
        L3d:
            X.3F5 r2 = r4.mState
            r2.A08 = r3
            X.3Fe r1 = r4.A0D
            X.3Ew r0 = r4.A0y
            r1.A1R(r0, r2)
            X.3F5 r2 = r4.mState
            r2.A0C = r3
            boolean r0 = r2.A0B
            if (r0 == 0) goto L55
            X.3F1 r1 = r4.A0C
            r0 = 1
            if (r1 != 0) goto L56
        L55:
            r0 = 0
        L56:
            r2.A0B = r0
            r0 = 4
            r2.A04 = r0
            r0 = 1
            r4.A17(r0)
            r4.A19(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A08():void");
    }

    private void A0B(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0k) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0k = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.A0i = x;
            this.A0d = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.A0j = y;
            this.A0e = y;
        }
    }

    public static void A0D(View view, Rect rect) {
        C3OP c3op = (C3OP) view.getLayoutParams();
        Rect rect2 = c3op.A02;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) c3op).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) c3op).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) c3op).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) c3op).bottomMargin);
    }

    private boolean A0O(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.A19;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C7LD c7ld = (C7LD) arrayList.get(i);
            if (c7ld.DMd(motionEvent, this) && action != 3) {
                this.A0F = c7ld;
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r1.isInvalid() == false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Rect A0S(android.view.View r10) {
        /*
            r9 = this;
            android.view.ViewGroup$LayoutParams r7 = r10.getLayoutParams()
            X.3OP r7 = (X.C3OP) r7
            boolean r0 = r7.A00
            if (r0 == 0) goto L1e
            X.3F5 r0 = r9.mState
            boolean r0 = r0.A08
            if (r0 == 0) goto L21
            X.3OO r1 = r7.mViewHolder
            boolean r0 = r1.isUpdated()
            if (r0 != 0) goto L1e
            boolean r0 = r1.isInvalid()
            if (r0 == 0) goto L21
        L1e:
            android.graphics.Rect r6 = r7.A02
            return r6
        L21:
            android.graphics.Rect r6 = r7.A02
            r5 = 0
            r6.set(r5, r5, r5, r5)
            java.util.ArrayList r4 = r9.A12
            int r3 = r4.size()
            r2 = 0
        L2e:
            if (r2 >= r3) goto L5f
            android.graphics.Rect r8 = r9.A0u
            r8.set(r5, r5, r5, r5)
            java.lang.Object r1 = r4.get(r2)
            X.3Fc r1 = (X.AbstractC70653Fc) r1
            X.3F5 r0 = r9.mState
            r1.getItemOffsets(r8, r10, r9, r0)
            int r1 = r6.left
            int r0 = r8.left
            int r1 = r1 + r0
            r6.left = r1
            int r1 = r6.top
            int r0 = r8.top
            int r1 = r1 + r0
            r6.top = r1
            int r1 = r6.right
            int r0 = r8.right
            int r1 = r1 + r0
            r6.right = r1
            int r1 = r6.bottom
            int r0 = r8.bottom
            int r1 = r1 + r0
            r6.bottom = r1
            int r2 = r2 + 1
            goto L2e
        L5f:
            r7.A00 = r5
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0S(android.view.View):android.graphics.Rect");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View A0U(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r1 = r3.getParent()
            if (r1 == 0) goto L10
            if (r1 == r2) goto L10
            boolean r0 = r1 instanceof android.view.View
            if (r0 == 0) goto L10
            r3 = r1
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r1 == r2) goto L13
            r3 = 0
        L13:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.A0U(android.view.View):android.view.View");
    }

    public final C3OO A0X(View view) {
        View A0U = A0U(view);
        if (A0U == null) {
            return null;
        }
        return A0Y(A0U);
    }

    public final C3OO A0Y(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(view);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return A05(view);
    }

    public final void A0b() {
        int i;
        int i2;
        int A06 = C0f9.A06(-512195364);
        if (this.A0R && !this.A0P) {
            C3FD c3fd = this.A07;
            ArrayList arrayList = c3fd.A04;
            if (arrayList.size() > 0) {
                int i3 = c3fd.A00;
                if ((i3 & 4) != 0 && (i3 & 11) == 0) {
                    AbstractC09780fb.A01("RV PartialInvalidate", -1668064105);
                    A0j();
                    this.A01++;
                    c3fd.A07();
                    if (!this.A0X) {
                        C3FI c3fi = this.A08;
                        int A03 = c3fi.A03();
                        int i4 = 0;
                        while (true) {
                            if (i4 < A03) {
                                C3OO A05 = A05(c3fi.A06(i4));
                                if (A05 != null && !A05.shouldIgnore() && A05.isUpdated()) {
                                    A0c();
                                    break;
                                }
                                i4++;
                            } else {
                                c3fd.A05();
                                break;
                            }
                        }
                    }
                    A19(true);
                    A17(true);
                    i2 = -964509631;
                } else {
                    if (arrayList.size() > 0) {
                        AbstractC09780fb.A01("RV FullInvalidate", 1140900645);
                        A0c();
                        i2 = 1445096224;
                    }
                    i = -2039312869;
                }
                AbstractC09780fb.A00(i2);
                i = -2039312869;
            } else {
                i = -835686034;
            }
        } else {
            AbstractC09780fb.A01("RV FullInvalidate", -991309226);
            A0c();
            AbstractC09780fb.A00(-2032452842);
            i = -1208408121;
        }
        C0f9.A0D(i, A06);
    }

    public final void A0p(int i) {
        getScrollingChildHelper().A01(i);
    }

    public final void A0r(int i, int i2) {
        setMeasuredDimension(AbstractC70663Fe.A09(i, getPaddingLeft() + getPaddingRight(), getMinimumWidth()), AbstractC70663Fe.A09(i2, getPaddingTop() + getPaddingBottom(), getMinimumHeight()));
    }

    public final void A0u(int i, int i2) {
        getScrollingChildHelper().A05(i, i2);
    }

    public final void A0w(int i, int[] iArr, int i2) {
        int i3;
        int i4;
        C3OO c3oo;
        A0j();
        this.A01++;
        AbstractC09780fb.A01("RV Scroll", 1725658874);
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.A01;
            overScroller.getFinalX();
            overScroller.getCurrX();
            overScroller.getFinalY();
            overScroller.getCurrY();
        }
        if (i != 0) {
            i3 = this.A0D.A1K(this.A0y, this.mState, i);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.A0D.A1L(this.A0y, this.mState, i2);
        } else {
            i4 = 0;
        }
        AbstractC09780fb.A00(227204715);
        C3FI c3fi = this.A08;
        int A03 = c3fi.A03();
        for (int i5 = 0; i5 < A03; i5++) {
            View A06 = c3fi.A06(i5);
            C3OO A0Y = A0Y(A06);
            if (A0Y != null && (c3oo = A0Y.mShadowingHolder) != null) {
                View view = c3oo.itemView;
                int left = A06.getLeft();
                int top = A06.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        A17(true);
        A19(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void A0x(View view) {
        C3OO A05 = A05(view);
        C2UU c2uu = this.A0A;
        if (c2uu != null && A05 != null) {
            c2uu.onViewDetachedFromWindow(A05);
        }
        List list = this.A0L;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((InterfaceC69563Aq) this.A0L.get(size)).D37(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void A1A(int[] iArr, int[] iArr2, int i, int i2, int i3, int i4, int i5) {
        C03I.A00(getScrollingChildHelper(), iArr, iArr2, i, i2, i3, i4, i5);
    }

    public final boolean A1B() {
        if (getScrollingChildHelper().A00 == null) {
            return false;
        }
        return true;
    }

    public final boolean A1G(int[] iArr, int[] iArr2, int i, int i2, int i3) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, i3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().A04(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().A03(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().A07(iArr, iArr2, i, i2, 0);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().A06(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        if (r0.draw(r9) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if (r1 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r1 == false) goto L114;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().A01 == null) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(1664135630);
        super.onAttachedToWindow();
        this.A01 = 0;
        boolean z = true;
        this.A0T = true;
        if (!this.A0R || isLayoutRequested()) {
            z = false;
        }
        this.A0R = z;
        C70593Ew.A01(this.A0y);
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            abstractC70663Fe.A0B = true;
            abstractC70663Fe.A1U(this);
        }
        this.A0Y = false;
        ThreadLocal threadLocal = RunnableC72643Nl.A05;
        RunnableC72643Nl runnableC72643Nl = (RunnableC72643Nl) threadLocal.get();
        this.mGapWorker = runnableC72643Nl;
        if (runnableC72643Nl == null) {
            this.mGapWorker = new RunnableC72643Nl();
            Display display = getDisplay();
            float f = 60.0f;
            if (!isInEditMode() && display != null) {
                float refreshRate = display.getRefreshRate();
                if (refreshRate >= 30.0f) {
                    f = refreshRate;
                }
            }
            RunnableC72643Nl runnableC72643Nl2 = this.mGapWorker;
            runnableC72643Nl2.A00 = 1.0E9f / f;
            threadLocal.set(runnableC72643Nl2);
        }
        RunnableC72643Nl runnableC72643Nl3 = this.mGapWorker;
        if (A1C && runnableC72643Nl3.A02.contains(this)) {
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
        runnableC72643Nl3.A02.add(this);
        C0f9.A0D(1527479032, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(-345242235);
        super.onDetachedFromWindow();
        C3F1 c3f1 = this.A0C;
        if (c3f1 != null) {
            c3f1.A0I();
        }
        A0k();
        this.A0T = false;
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            C70593Ew c70593Ew = this.A0y;
            abstractC70663Fe.A0B = false;
            abstractC70663Fe.A0z(c70593Ew, this);
        }
        this.A13.clear();
        removeCallbacks(this.A0K);
        do {
        } while (C3OR.A03.A7H() != null);
        C70593Ew c70593Ew2 = this.A0y;
        int i = 0;
        while (true) {
            ArrayList arrayList = c70593Ew2.A06;
            if (i >= arrayList.size()) {
                break;
            }
            AbstractC105064oM.A01(((C3OO) arrayList.get(i)).itemView);
            i++;
        }
        C70593Ew.A00(c70593Ew2.A08.A0A, c70593Ew2, false);
        C12500ku c12500ku = new C12500ku(this);
        while (c12500ku.hasNext()) {
            ArrayList arrayList2 = AbstractC105064oM.A00((View) c12500ku.next()).A00;
            C14360o3.A0B(arrayList2, 0);
            for (int size = arrayList2.size() - 1; -1 < size; size--) {
                ((InterfaceC1128257o) arrayList2.get(size)).DeW();
            }
        }
        RunnableC72643Nl runnableC72643Nl = this.mGapWorker;
        if (runnableC72643Nl != null) {
            boolean remove = runnableC72643Nl.A02.remove(this);
            if (A1C && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.mGapWorker = null;
        }
        C0f9.A0D(1100369750, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A12;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC70653Fc) arrayList.get(i)).onDraw(canvas, this, this.mState);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(2130805072);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.A03 = null;
            this.A06 = null;
            this.A05 = null;
            this.A04 = null;
        }
        C0f9.A0D(-1566694734, A06);
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0108, code lost:
    
        if (r9 == 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0116, code lost:
    
        if (r8 != 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0118, code lost:
    
        setScrollState(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x019f, code lost:
    
        if (r7 != false) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        C3OO A05 = A05(view);
        if (A05 != null) {
            if (A05.isTmpDetached()) {
                A05.clearTmpDetachFlag();
            } else if (!A05.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(A05);
                sb.append(A0Z());
                throw new IllegalArgumentException(sb.toString());
            }
        } else if (A1C) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(A0Z());
            throw new IllegalArgumentException(sb2.toString());
        }
        view.clearAnimation();
        A0x(view);
        super.removeDetachedView(view, z);
    }

    public void setEdgeEffectFactory(AbstractC70573Eu abstractC70573Eu) {
        abstractC70573Eu.getClass();
        this.A0B = abstractC70573Eu;
        this.A03 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        getScrollingChildHelper().A02(z);
    }

    public void setScrollingTouchSlop(int i) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w("RecyclerView", AnonymousClass001.A0c("setScrollingTouchSlop(): bad argument constant ", "; using default value", i));
            } else {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.A0l = scaledTouchSlop;
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.A0l = scaledTouchSlop;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().A05(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().A01(0);
    }

    public static /* synthetic */ void A0K(RecyclerView recyclerView, int i) {
        recyclerView.detachViewFromParent(i);
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        A1C = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        A1D = z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void setHasFixedSize(boolean z) {
        this.A0S = z;
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setOnFlingListener(AbstractC61812ri abstractC61812ri) {
        this.A0E = abstractC61812ri;
    }

    @Deprecated
    public void setOnScrollListener(C1I4 c1i4) {
        this.A0G = c1i4;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.A0Z = z;
    }

    @Deprecated
    public void setRecyclerListener(JFP jfp) {
        this.A0H = jfp;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        super.addFocusables(arrayList, i, i2);
    }

    public static /* synthetic */ void A0F(View view, ViewGroup.LayoutParams layoutParams, RecyclerView recyclerView, int i) {
        recyclerView.attachViewToParent(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        AbstractC70663Fe abstractC70663Fe = this.A0D;
        if (abstractC70663Fe != null) {
            return abstractC70663Fe.A1F(layoutParams);
        }
        throw new IllegalStateException(AnonymousClass001.A0R("RecyclerView has no LayoutManager", A0Z()));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:30)(10:65|(1:67)|32|33|(1:35)(1:49)|36|37|38|39|40)|32|33|(0)(0)|36|37|38|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x023d, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x023e, code lost:
    
        r10 = r11.getConstructor(new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0251, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0252, code lost:
    
        r2.initCause(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0264, code lost:
    
        throw new java.lang.IllegalStateException(X.AnonymousClass001.A0g(r21.getPositionDescription(), ": Error creating LayoutManager ", r7), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0211 A[Catch: ClassCastException -> 0x0265, IllegalAccessException -> 0x0276, InstantiationException -> 0x0287, InvocationTargetException -> 0x0296, ClassNotFoundException -> 0x02a5, TryCatch #4 {ClassCastException -> 0x0265, ClassNotFoundException -> 0x02a5, IllegalAccessException -> 0x0276, InstantiationException -> 0x0287, InvocationTargetException -> 0x0296, blocks: (B:33:0x020b, B:35:0x0211, B:36:0x0219, B:39:0x022a, B:40:0x0244, B:44:0x023e, B:47:0x0252, B:48:0x0264, B:49:0x0224), top: B:32:0x020b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0224 A[Catch: ClassCastException -> 0x0265, IllegalAccessException -> 0x0276, InstantiationException -> 0x0287, InvocationTargetException -> 0x0296, ClassNotFoundException -> 0x02a5, TryCatch #4 {ClassCastException -> 0x0265, ClassNotFoundException -> 0x02a5, IllegalAccessException -> 0x0276, InstantiationException -> 0x0287, InvocationTargetException -> 0x0296, blocks: (B:33:0x020b, B:35:0x0211, B:36:0x0219, B:39:0x022a, B:40:0x0244, B:44:0x023e, B:47:0x0252, B:48:0x0264, B:49:0x0224), top: B:32:0x020b }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [X.3Ev] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.3F3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public RecyclerView(android.content.Context r20, android.util.AttributeSet r21, int r22) {
        /*
            Method dump skipped, instructions count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.facebook.R.attr.recyclerViewStyle);
    }
}
