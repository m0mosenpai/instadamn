package com.google.android.material.appbar;

import X.AbstractC008903d;
import X.AbstractC010103p;
import X.AbstractC153306uz;
import X.AnonymousClass054;
import X.C011504d;
import X.C012804r;
import X.C03H;
import X.C03L;
import X.C0f9;
import X.C1343765g;
import X.C3OF;
import X.C56292iI;
import X.C65760Tta;
import X.C65K;
import X.C65L;
import X.C65M;
import X.C65N;
import X.C65O;
import X.C71x;
import X.C72C;
import X.InterfaceC155836zD;
import X.InterfaceC155846zE;
import X.WH3;
import X.WQU;
import X.WQV;
import android.animation.AnimatorInflater;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements C3OF {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ValueAnimator A05;
    public Drawable A06;
    public C011504d A07;
    public WeakReference A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public int A0D;
    public boolean A0E;
    public int[] A0F;

    /* loaded from: classes3.dex */
    public class BaseBehavior extends HeaderBehavior {
        public float A00;
        public int A01;
        public int A02;
        public ValueAnimator A03;
        public WeakReference A04;
        public boolean A05;
        public int A06;

        private void A07(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            int height;
            int abs = Math.abs(A0S() - i);
            float abs2 = Math.abs(0.0f);
            if (abs2 > 0.0f) {
                height = Math.round((abs / abs2) * 1000.0f) * 3;
            } else {
                height = (int) (((abs / appBarLayout.getHeight()) + 1.0f) * 150.0f);
            }
            int A0S = A0S();
            ValueAnimator valueAnimator = this.A03;
            if (A0S == i) {
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.A03.cancel();
                    return;
                }
                return;
            }
            if (valueAnimator == null) {
                ValueAnimator valueAnimator2 = new ValueAnimator();
                this.A03 = valueAnimator2;
                valueAnimator2.setInterpolator(AbstractC153306uz.A00);
                this.A03.addUpdateListener(new C65760Tta(coordinatorLayout, this, appBarLayout));
            } else {
                valueAnimator.cancel();
            }
            this.A03.setDuration(Math.min(height, 600));
            this.A03.setIntValues(A0S, i);
            this.A03.start();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: A0X, reason: merged with bridge method [inline-methods] */
        public void A0P(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int[] iArr, int i, int i2, int i3) {
            int i4;
            if (i2 != 0) {
                int i5 = -appBarLayout.getTotalScrollRange();
                if (i2 < 0) {
                    i4 = appBarLayout.getDownNestedPreScrollRange() + i5;
                } else {
                    i4 = 0;
                }
                if (i5 != i4) {
                    iArr[1] = A0T(appBarLayout, coordinatorLayout, A0S() - i2, i5, i4);
                }
            }
            if (appBarLayout.A0B) {
                appBarLayout.A05(appBarLayout.A04(view));
            }
        }

        /* loaded from: classes3.dex */
        public class SavedState extends AbsSavedState {
            public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.72R
                /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                    ?? absSavedState = new AbsSavedState(parcel, null);
                    absSavedState.A01 = parcel.readInt();
                    absSavedState.A00 = parcel.readFloat();
                    boolean z = false;
                    if (parcel.readByte() != 0) {
                        z = true;
                    }
                    absSavedState.A02 = z;
                    return absSavedState;
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                    return new AppBarLayout.BaseBehavior.SavedState[i];
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    ?? absSavedState = new AbsSavedState(parcel, classLoader);
                    absSavedState.A01 = parcel.readInt();
                    absSavedState.A00 = parcel.readFloat();
                    boolean z = false;
                    if (parcel.readByte() != 0) {
                        z = true;
                    }
                    absSavedState.A02 = z;
                    return absSavedState;
                }
            };
            public float A00;
            public int A01;
            public boolean A02;

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeInt(this.A01);
                parcel.writeFloat(this.A00);
                parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
            }
        }

        public static void A06(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            AnonymousClass054 wqu;
            C012804r c012804r = C012804r.A0Z;
            AbstractC010103p.A09(coordinatorLayout, c012804r.A00());
            C012804r c012804r2 = C012804r.A0X;
            AbstractC010103p.A09(coordinatorLayout, c012804r2.A00());
            View A04 = A04(coordinatorLayout);
            if (A04 != null && appBarLayout.getTotalScrollRange() != 0 && (((C56292iI) A04.getLayoutParams()).A0A instanceof ScrollingViewBehavior)) {
                if (baseBehavior.A0S() != (-appBarLayout.getTotalScrollRange()) && A04.canScrollVertically(1)) {
                    AbstractC010103p.A0E(coordinatorLayout, c012804r, new WQU(baseBehavior, appBarLayout, false));
                }
                if (baseBehavior.A0S() != 0) {
                    if (A04.canScrollVertically(-1)) {
                        int i = -appBarLayout.getDownNestedPreScrollRange();
                        if (i != 0) {
                            wqu = new WQV(A04, coordinatorLayout, baseBehavior, appBarLayout, i);
                        } else {
                            return;
                        }
                    } else {
                        wqu = new WQU(baseBehavior, appBarLayout, true);
                    }
                    AbstractC010103p.A0E(coordinatorLayout, c012804r2, wqu);
                }
            }
        }

        public void A0W(View view, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            if (this.A06 == 0 || i == 1) {
                A05(coordinatorLayout, this, appBarLayout);
                if (appBarLayout.A0B) {
                    appBarLayout.A05(appBarLayout.A04(view));
                }
            }
            this.A04 = new WeakReference(view);
        }

        public boolean A0Y(View view, View view2, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2) {
            boolean z;
            if ((i & 2) != 0 && (appBarLayout.A0B || (appBarLayout.getTotalScrollRange() != 0 && coordinatorLayout.getHeight() - view.getHeight() <= appBarLayout.getHeight()))) {
                z = true;
                ValueAnimator valueAnimator = this.A03;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                z = false;
            }
            this.A04 = null;
            this.A06 = i2;
            return z;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.A02 = -1;
        }

        public static View A04(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof C03H) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        public static void A05(CoordinatorLayout coordinatorLayout, BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
            int A0S = baseBehavior.A0S();
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = appBarLayout.getChildAt(i);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C1343765g c1343765g = (C1343765g) childAt.getLayoutParams();
                if ((c1343765g.A00 & 32) == 32) {
                    top -= ((ViewGroup.MarginLayoutParams) c1343765g).topMargin;
                    bottom += ((ViewGroup.MarginLayoutParams) c1343765g).bottomMargin;
                }
                int i2 = -A0S;
                if (top <= i2 && bottom >= i2) {
                    if (i >= 0) {
                        View childAt2 = appBarLayout.getChildAt(i);
                        C1343765g c1343765g2 = (C1343765g) childAt2.getLayoutParams();
                        int i3 = c1343765g2.A00;
                        if ((i3 & 17) == 17) {
                            int i4 = -childAt2.getTop();
                            int i5 = -childAt2.getBottom();
                            if (i == appBarLayout.getChildCount() - 1) {
                                i5 += appBarLayout.getTopInset();
                            }
                            if ((i3 & 2) == 2) {
                                i5 += childAt2.getMinimumHeight();
                            } else if ((i3 & 5) == 5) {
                                int minimumHeight = childAt2.getMinimumHeight() + i5;
                                if (A0S < minimumHeight) {
                                    i4 = minimumHeight;
                                } else {
                                    i5 = minimumHeight;
                                }
                            }
                            if ((i3 & 32) == 32) {
                                i4 += ((ViewGroup.MarginLayoutParams) c1343765g2).topMargin;
                                i5 -= ((ViewGroup.MarginLayoutParams) c1343765g2).bottomMargin;
                            }
                            if (A0S < (i5 + i4) / 2) {
                                i4 = i5;
                            }
                            int i6 = -appBarLayout.getTotalScrollRange();
                            if (i4 >= i6) {
                                i6 = i4;
                                if (i4 > 0) {
                                    i6 = 0;
                                }
                            }
                            baseBehavior.A07(coordinatorLayout, appBarLayout, i6);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }

        public static void A08(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, boolean z) {
            List arrayList;
            int abs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (abs >= childAt.getTop() && abs <= childAt.getBottom()) {
                    int i4 = ((C1343765g) childAt.getLayoutParams()).A00;
                    boolean z2 = false;
                    if ((i4 & 1) != 0) {
                        int minimumHeight = childAt.getMinimumHeight();
                        if (((i2 > 0 && (i4 & 12) != 0) || (i4 & 2) != 0) && (-i) >= (childAt.getBottom() - minimumHeight) - appBarLayout.getTopInset()) {
                            z2 = true;
                        }
                    }
                    if (appBarLayout.A0B) {
                        z2 = appBarLayout.A04(A04(coordinatorLayout));
                    }
                    boolean A05 = appBarLayout.A05(z2);
                    if (!z) {
                        if (A05) {
                            ArrayList arrayList2 = (ArrayList) coordinatorLayout.A0C.A00.get(appBarLayout);
                            if (arrayList2 == null) {
                                arrayList = Collections.emptyList();
                            } else {
                                arrayList = new ArrayList(arrayList2);
                            }
                            int size = arrayList.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                CoordinatorLayout.Behavior behavior = ((C56292iI) ((View) arrayList.get(i5)).getLayoutParams()).A0A;
                                if (behavior instanceof ScrollingViewBehavior) {
                                    if (((HeaderScrollingViewBehavior) behavior).A00 == 0) {
                                        return;
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                    appBarLayout.jumpDrawablesToCurrentState();
                    return;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* renamed from: A0Z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.appbar.AppBarLayout r7, int r8) {
            /*
                r5 = this;
                boolean r4 = super.A0Q(r7, r6, r8)
                int r3 = r7.A03
                int r1 = r5.A02
                r2 = 0
                if (r1 < 0) goto L6c
                r0 = r3 & 8
                if (r0 != 0) goto L6c
                android.view.View r1 = r7.getChildAt(r1)
                int r0 = r1.getBottom()
                int r3 = -r0
                boolean r0 = r5.A05
                if (r0 == 0) goto L5f
                int r1 = r1.getMinimumHeight()
                int r0 = r7.getTopInset()
                int r1 = r1 + r0
            L25:
                int r3 = r3 + r1
            L26:
                r5.A0V(r7, r6, r3)
            L29:
                r1 = 0
                r7.A03 = r2
                r0 = -1
                r5.A02 = r0
                X.72E r0 = r5.A01
                if (r0 == 0) goto L35
                int r1 = r0.A02
            L35:
                int r0 = r7.getTotalScrollRange()
                int r0 = -r0
                if (r1 >= r0) goto L5b
                r1 = r0
            L3d:
                r5.A0R(r1)
                X.72E r0 = r5.A01
                if (r0 == 0) goto L59
                int r1 = r0.A02
            L46:
                r0 = 1
                A08(r6, r7, r1, r2, r0)
                X.72E r0 = r5.A01
                if (r0 == 0) goto L57
                int r0 = r0.A02
            L50:
                r7.A01(r0)
                A06(r6, r5, r7)
                return r4
            L57:
                r0 = 0
                goto L50
            L59:
                r1 = 0
                goto L46
            L5b:
                if (r1 <= r2) goto L3d
                r1 = 0
                goto L3d
            L5f:
                int r0 = r1.getHeight()
                float r1 = (float) r0
                float r0 = r5.A00
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                goto L25
            L6c:
                if (r3 == 0) goto L29
                r0 = r3 & 4
                r1 = 0
                if (r0 == 0) goto L74
                r1 = 1
            L74:
                r0 = r3 & 2
                if (r0 == 0) goto L83
                int r0 = r7.getTotalScrollRange()
                int r3 = -r0
                if (r1 == 0) goto L26
                r5.A07(r6, r7, r3)
                goto L29
            L83:
                r0 = r3 & 1
                if (r0 == 0) goto L29
                if (r1 == 0) goto L8d
                r5.A07(r6, r7, r2)
                goto L29
            L8d:
                r5.A0V(r7, r6, r2)
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.BaseBehavior.A0Q(androidx.coordinatorlayout.widget.CoordinatorLayout, com.google.android.material.appbar.AppBarLayout, int):boolean");
        }

        public BaseBehavior() {
            this.A02 = -1;
        }
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.widget.LinearLayout$LayoutParams, X.65g] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.A00 = 1;
        return layoutParams;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i == 1) {
            super.setOrientation(i);
            return;
        }
        throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
    }

    /* loaded from: classes3.dex */
    public class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A0V);
            ((HeaderScrollingViewBehavior) this).A00 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
            CoordinatorLayout.Behavior behavior = ((C56292iI) view2.getLayoutParams()).A0A;
            if (behavior instanceof BaseBehavior) {
                view.offsetTopAndBottom((((view2.getBottom() - view.getTop()) + ((BaseBehavior) behavior).A01) + ((HeaderScrollingViewBehavior) this).A01) - A0S(view2));
            }
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.A0B) {
                    appBarLayout.A05(appBarLayout.A04(view));
                    return false;
                }
                return false;
            }
            return false;
        }

        public ScrollingViewBehavior() {
        }
    }

    public final void A01(int i) {
        this.A0D = i;
        if (!willNotDraw()) {
            postInvalidateOnAnimation();
        }
        List list = this.A09;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC155846zE interfaceC155846zE = (InterfaceC155846zE) this.A09.get(i2);
                if (interfaceC155846zE != null) {
                    interfaceC155846zE.DWT(this, i);
                }
            }
        }
    }

    public final void A02(InterfaceC155836zD interfaceC155836zD) {
        List list = this.A09;
        if (list == null) {
            list = new ArrayList();
            this.A09 = list;
        }
        if (interfaceC155836zD != null && !list.contains(interfaceC155836zD)) {
            this.A09.add(interfaceC155836zD);
        }
    }

    public final void A03(InterfaceC155836zD interfaceC155836zD) {
        List list = this.A09;
        if (list != null && interfaceC155836zD != null) {
            list.remove(interfaceC155836zD);
        }
    }

    public final boolean A04(View view) {
        View view2;
        int i;
        View findViewById;
        if (this.A08 == null && (i = this.A02) != -1 && ((view != null && (findViewById = view.findViewById(i)) != null) || ((getParent() instanceof ViewGroup) && (findViewById = ((View) getParent()).findViewById(this.A02)) != null))) {
            this.A08 = new WeakReference(findViewById);
        }
        WeakReference weakReference = this.A08;
        if (weakReference != null && (view2 = (View) weakReference.get()) != null) {
            view = view2;
        } else if (view == null) {
            return false;
        }
        if (view.canScrollVertically(-1) || view.getScrollY() > 0) {
            return true;
        }
        return false;
    }

    public final boolean A05(boolean z) {
        if (this.A0E != z) {
            this.A0E = z;
            refreshDrawableState();
            if (this.A0B && (getBackground() instanceof C65O)) {
                C65O c65o = (C65O) getBackground();
                float dimension = getResources().getDimension(R.dimen.abc_action_bar_elevation_material);
                float f = 0.0f;
                if (!z) {
                    f = dimension;
                    dimension = 0.0f;
                }
                ValueAnimator valueAnimator = this.A05;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f, dimension);
                this.A05 = ofFloat;
                ofFloat.setDuration(r5.getInteger(R.integer.abc_config_activityShortDur));
                this.A05.setInterpolator(AbstractC153306uz.A03);
                this.A05.addUpdateListener(new WH3(this, c65o));
                this.A05.start();
                return true;
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1343765g c1343765g;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c1343765g = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c1343765g = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c1343765g = new LinearLayout.LayoutParams(layoutParams);
        }
        c1343765g.A00 = 1;
        return c1343765g;
    }

    public CoordinatorLayout.Behavior getBehavior() {
        return new Behavior();
    }

    public int getDownNestedPreScrollRange() {
        int i;
        int minimumHeight;
        int i2 = this.A00;
        if (i2 == -1) {
            int i3 = 0;
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = getChildAt(childCount);
                C1343765g c1343765g = (C1343765g) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = c1343765g.A00;
                if ((i4 & 5) == 5) {
                    int i5 = ((ViewGroup.MarginLayoutParams) c1343765g).topMargin + ((ViewGroup.MarginLayoutParams) c1343765g).bottomMargin;
                    if ((i4 & 8) != 0) {
                        minimumHeight = childAt.getMinimumHeight();
                    } else if ((i4 & 2) != 0) {
                        minimumHeight = measuredHeight - childAt.getMinimumHeight();
                    } else {
                        i = i5 + measuredHeight;
                        if (childCount == 0 && childAt.getFitsSystemWindows()) {
                            i = Math.min(i, measuredHeight - getTopInset());
                        }
                        i3 += i;
                    }
                    i = i5 + minimumHeight;
                    if (childCount == 0) {
                        i = Math.min(i, measuredHeight - getTopInset());
                    }
                    i3 += i;
                } else if (i3 > 0) {
                    break;
                }
            }
            int max = Math.max(0, i3);
            this.A00 = max;
            return max;
        }
        return i2;
    }

    public int getDownNestedScrollRange() {
        int i = this.A01;
        if (i == -1) {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                C1343765g c1343765g = (C1343765g) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1343765g).topMargin + ((ViewGroup.MarginLayoutParams) c1343765g).bottomMargin;
                int i4 = c1343765g.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight;
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
                i2++;
            }
            int max = Math.max(0, i3);
            this.A01 = max;
            return max;
        }
        return i;
    }

    public int getLiftOnScrollTargetViewId() {
        return this.A02;
    }

    public int getPendingAction() {
        return this.A03;
    }

    public Drawable getStatusBarForeground() {
        return this.A06;
    }

    public final int getTopInset() {
        C011504d c011504d = this.A07;
        if (c011504d != null) {
            return c011504d.A03();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i = this.A04;
        if (i == -1) {
            int childCount = getChildCount();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = getChildAt(i2);
                C1343765g c1343765g = (C1343765g) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i4 = c1343765g.A00;
                if ((i4 & 1) == 0) {
                    break;
                }
                i3 += measuredHeight + ((ViewGroup.MarginLayoutParams) c1343765g).topMargin + ((ViewGroup.MarginLayoutParams) c1343765g).bottomMargin;
                if (i2 == 0 && childAt.getFitsSystemWindows()) {
                    i3 -= getTopInset();
                }
                if ((i4 & 2) != 0) {
                    i3 -= childAt.getMinimumHeight();
                    break;
                }
                i2++;
            }
            int max = Math.max(0, i3);
            this.A04 = max;
            return max;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if (r1 == false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
    
        if (r1 == false) goto L20;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] onCreateDrawableState(int r7) {
        /*
            r6 = this;
            int[] r5 = r6.A0F
            if (r5 != 0) goto L9
            r0 = 4
            int[] r5 = new int[r0]
            r6.A0F = r5
        L9:
            int r0 = r5.length
            int r7 = r7 + r0
            int[] r4 = super.onCreateDrawableState(r7)
            r1 = 0
            boolean r3 = r6.A0C
            r0 = 2130971246(0x7f040a6e, float:1.7551225E38)
            if (r3 != 0) goto L1a
            r0 = -2130971246(0xffffffff80fbf592, float:-2.3138804E-38)
        L1a:
            r5[r1] = r0
            r2 = 1
            if (r3 == 0) goto L26
            boolean r1 = r6.A0E
            r0 = 2130971247(0x7f040a6f, float:1.7551227E38)
            if (r1 != 0) goto L29
        L26:
            r0 = -2130971247(0xffffffff80fbf591, float:-2.3138802E-38)
        L29:
            r5[r2] = r0
            r1 = 2
            r0 = 2130971241(0x7f040a69, float:1.7551215E38)
            if (r3 != 0) goto L34
            r0 = -2130971241(0xffffffff80fbf597, float:-2.313881E-38)
        L34:
            r5[r1] = r0
            r2 = 3
            if (r3 == 0) goto L40
            boolean r1 = r6.A0E
            r0 = 2130971240(0x7f040a68, float:1.7551213E38)
            if (r1 != 0) goto L43
        L40:
            r0 = -2130971240(0xffffffff80fbf598, float:-2.3138812E-38)
        L43:
            r5[r2] = r0
            int[] r0 = android.view.View.mergeDrawableStates(r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.onCreateDrawableState(int):int[]");
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.A02 = i;
        WeakReference weakReference = this.A08;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A08 = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (getTopInset() <= 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setStatusBarForeground(android.graphics.drawable.Drawable r5) {
        /*
            r4 = this;
            android.graphics.drawable.Drawable r1 = r4.A06
            if (r1 == r5) goto L53
            r0 = 0
            if (r1 == 0) goto La
            r1.setCallback(r0)
        La:
            if (r5 == 0) goto L10
            android.graphics.drawable.Drawable r0 = r5.mutate()
        L10:
            r4.A06 = r0
            if (r0 == 0) goto L3f
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L23
            android.graphics.drawable.Drawable r1 = r4.A06
            int[] r0 = r4.getDrawableState()
            r1.setState(r0)
        L23:
            android.graphics.drawable.Drawable r1 = r4.A06
            int r0 = r4.getLayoutDirection()
            r1.setLayoutDirection(r0)
            android.graphics.drawable.Drawable r3 = r4.A06
            int r2 = r4.getVisibility()
            r1 = 0
            r0 = 0
            if (r2 != 0) goto L37
            r0 = 1
        L37:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r0 = r4.A06
            r0.setCallback(r4)
        L3f:
            android.graphics.drawable.Drawable r0 = r4.A06
            if (r0 == 0) goto L4a
            int r1 = r4.getTopInset()
            r0 = 1
            if (r1 > 0) goto L4b
        L4a:
            r0 = 0
        L4b:
            r0 = r0 ^ 1
            r4.setWillNotDraw(r0)
            r4.postInvalidateOnAnimation()
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.AppBarLayout.setStatusBarForeground(android.graphics.drawable.Drawable):void");
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [android.widget.LinearLayout$LayoutParams, X.65g] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1343765g generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new LinearLayout.LayoutParams(context, attributeSet);
        layoutParams.A00 = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A01);
        layoutParams.A00 = obtainStyledAttributes.getInt(0, 0);
        if (obtainStyledAttributes.hasValue(1)) {
            layoutParams.A01 = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(1, 0));
        }
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int A03 = C0f9.A03(-747726983);
        super.draw(canvas);
        if (this.A06 != null && getTopInset() > 0) {
            int save = canvas.save();
            canvas.translate(0.0f, -this.A0D);
            this.A06.draw(canvas);
            canvas.restoreToCount(save);
        }
        C0f9.A0A(-334214418, A03);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int childCount;
        int topInset = getTopInset();
        int minimumHeight = getMinimumHeight();
        if (minimumHeight != 0 || ((childCount = getChildCount()) >= 1 && (minimumHeight = getChildAt(childCount - 1).getMinimumHeight()) != 0)) {
            return (minimumHeight * 2) + topInset;
        }
        return getHeight() / 3;
    }

    public int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(1110133092);
        super.onAttachedToWindow();
        C72C.A00(this);
        C0f9.A0D(31956987, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(875153656);
        super.onDetachedFromWindow();
        WeakReference weakReference = this.A08;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.A08 = null;
        C0f9.A0D(1583163271, A06);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int topInset = getTopInset();
                for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                    getChildAt(childCount).offsetTopAndBottom(topInset);
                }
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A0A = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((C1343765g) getChildAt(i5).getLayoutParams()).A01 != null) {
                this.A0A = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (!this.A0B) {
            int childCount3 = getChildCount();
            int i6 = 0;
            while (true) {
                if (i6 < childCount3) {
                    int i7 = ((C1343765g) getChildAt(i6).getLayoutParams()).A00;
                    if ((i7 & 1) == 1 && (i7 & 10) != 0) {
                        break;
                    } else {
                        i6++;
                    }
                } else {
                    z2 = false;
                    break;
                }
            }
        }
        if (this.A0C != z2) {
            this.A0C = z2;
            refreshDrawableState();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && getFitsSystemWindows() && getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !childAt.getFitsSystemWindows()) {
                int measuredHeight = getMeasuredHeight();
                if (mode != Integer.MIN_VALUE) {
                    if (mode == 0) {
                        measuredHeight += getTopInset();
                    }
                } else {
                    measuredHeight = getMeasuredHeight() + getTopInset();
                    int size = View.MeasureSpec.getSize(i2);
                    if (measuredHeight < 0) {
                        measuredHeight = 0;
                    } else if (measuredHeight > size) {
                        measuredHeight = size;
                    }
                }
                setMeasuredDimension(getMeasuredWidth(), measuredHeight);
            }
        }
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C72C.A01(this, f);
    }

    public void setExpanded(boolean z) {
        boolean isLaidOut = isLaidOut();
        int i = 2;
        if (z) {
            i = 1;
        }
        int i2 = 0;
        if (isLaidOut) {
            i2 = 4;
        }
        this.A03 = i | i2 | 8;
        requestLayout();
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(C71x.A00(getContext(), i));
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A06) {
            return false;
        }
        return true;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1343765g;
    }

    public void setLiftOnScroll(boolean z) {
        this.A0B = z;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        C65L.A00(this, f);
    }

    /* loaded from: classes3.dex */
    public class Behavior extends BaseBehavior {
        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public Behavior() {
        }
    }

    /* JADX WARN: Finally extract failed */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_Design_AppBarLayout), attributeSet, i);
        this.A04 = -1;
        this.A00 = -1;
        this.A01 = -1;
        this.A03 = 0;
        Context context2 = getContext();
        setOrientation(1);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        TypedArray A00 = C65M.A00(context2, attributeSet, C65L.A00, new int[0], i, R.style.Widget_Design_AppBarLayout);
        try {
            if (A00.hasValue(0)) {
                setStateListAnimator(AnimatorInflater.loadStateListAnimator(context2, A00.getResourceId(0, 0)));
            }
            A00.recycle();
            TypedArray A002 = C65M.A00(context2, attributeSet, C65N.A00, new int[0], i, R.style.Widget_Design_AppBarLayout);
            setBackground(A002.getDrawable(0));
            if (getBackground() instanceof ColorDrawable) {
                ColorDrawable colorDrawable = (ColorDrawable) getBackground();
                C65O c65o = new C65O();
                c65o.A0F(ColorStateList.valueOf(colorDrawable.getColor()));
                c65o.A0E(context2);
                setBackground(c65o);
            }
            if (A002.hasValue(4)) {
                this.A03 = A002.getBoolean(4, false) ? 1 : 2;
                requestLayout();
            }
            if (A002.hasValue(3)) {
                C65L.A00(this, A002.getDimensionPixelSize(3, 0));
            }
            if (A002.hasValue(2)) {
                setKeyboardNavigationCluster(A002.getBoolean(2, false));
            }
            if (A002.hasValue(1)) {
                setTouchscreenBlocksFocus(A002.getBoolean(1, false));
            }
            this.A0B = A002.getBoolean(5, false);
            this.A02 = A002.getResourceId(6, -1);
            setStatusBarForeground(A002.getDrawable(7));
            A002.recycle();
            AbstractC008903d.A00(this, new C03L() { // from class: X.65f
                /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
                
                    if (r2.getTopInset() <= 0) goto L11;
                 */
                @Override // X.C03L
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C011504d Cx7(android.view.View r4, X.C011504d r5) {
                    /*
                        r3 = this;
                        com.google.android.material.appbar.AppBarLayout r2 = com.google.android.material.appbar.AppBarLayout.this
                        boolean r0 = r2.getFitsSystemWindows()
                        r1 = 0
                        if (r0 == 0) goto La
                        r1 = r5
                    La:
                        X.04d r0 = r2.A07
                        boolean r0 = X.C02O.A00(r0, r1)
                        if (r0 != 0) goto L28
                        r2.A07 = r1
                        android.graphics.drawable.Drawable r0 = r2.A06
                        if (r0 == 0) goto L1f
                        int r1 = r2.getTopInset()
                        r0 = 1
                        if (r1 > 0) goto L20
                    L1f:
                        r0 = 0
                    L20:
                        r0 = r0 ^ 1
                        r2.setWillNotDraw(r0)
                        r2.requestLayout()
                    L28:
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1343665f.Cx7(android.view.View, X.04d):X.04d");
                }
            });
        } catch (Throwable th) {
            A00.recycle();
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams, X.65g] */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.A00 = 1;
        return layoutParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1343765g c1343765g;
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            c1343765g = new LinearLayout.LayoutParams((LinearLayout.LayoutParams) layoutParams);
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            c1343765g = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        } else {
            c1343765g = new LinearLayout.LayoutParams(layoutParams);
        }
        c1343765g.A00 = 1;
        return c1343765g;
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.appBarLayoutStyle);
    }
}
