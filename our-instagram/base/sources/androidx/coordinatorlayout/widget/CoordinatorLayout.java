package androidx.coordinatorlayout.widget;

import X.AbstractC008903d;
import X.AbstractC010103p;
import X.AbstractC56032hq;
import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.C005001p;
import X.C011504d;
import X.C012804r;
import X.C02Q;
import X.C03K;
import X.C03L;
import X.C0f9;
import X.C12550kz;
import X.C14360o3;
import X.C3OF;
import X.C56022hp;
import X.C56292iI;
import X.C72D;
import X.C72E;
import X.C72F;
import X.InterfaceC12520kw;
import X.InterfaceC17990uc;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.AbsSavedState;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.facebook.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.HeaderScrollingViewBehavior;
import com.google.android.material.appbar.ViewOffsetBehavior;
import com.instagram.profile.ui.refresh.RefreshableAppBarLayoutBehavior;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC17990uc, InterfaceC12520kw {
    public static final String A0I;
    public static final ThreadLocal A0J;
    public static final Comparator A0K;
    public static final Class[] A0L;
    public static final C02Q A0M;
    public ViewGroup.OnHierarchyChangeListener A00;
    public C72D A01;
    public C011504d A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public Drawable A06;
    public View A07;
    public View A08;
    public C03L A09;
    public boolean A0A;
    public int[] A0B;
    public final C56022hp A0C;
    public final C03K A0D;
    public final List A0E;
    public final List A0F;
    public final int[] A0G;
    public final int[] A0H;

    /* loaded from: classes3.dex */
    public abstract class Behavior {
        public boolean A0A(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public void A0G() {
        }

        public void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                AppBarLayout appBarLayout = (AppBarLayout) view;
                if (i4 < 0) {
                    iArr[1] = baseBehavior.A0T(appBarLayout, coordinatorLayout, baseBehavior.A0S() - i4, -appBarLayout.getDownNestedScrollRange(), 0);
                    return;
                } else {
                    if (i4 != 0) {
                        return;
                    }
                    AppBarLayout.BaseBehavior.A06(coordinatorLayout, baseBehavior, appBarLayout);
                    return;
                }
            }
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
            if (!(this instanceof RefreshableAppBarLayoutBehavior)) {
                return;
            }
            RefreshableAppBarLayoutBehavior refreshableAppBarLayoutBehavior = (RefreshableAppBarLayoutBehavior) this;
            C14360o3.A0B(view2, 2);
            if (refreshableAppBarLayoutBehavior.A0C || refreshableAppBarLayoutBehavior.A09) {
                return;
            }
            refreshableAppBarLayoutBehavior.A08 = true;
            if (!refreshableAppBarLayoutBehavior.A0A || i2 != 0 || i4 >= 0 || i5 != 0) {
                return;
            }
            RefreshableAppBarLayoutBehavior.A03(refreshableAppBarLayoutBehavior, i4);
        }

        public void A0K(C56292iI c56292iI) {
        }

        public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
            return false;
        }

        public boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                return ((AppBarLayout.BaseBehavior) this).A0Y(view2, view3, coordinatorLayout, (AppBarLayout) view, i, i2);
            }
            return false;
        }

        public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
            return false;
        }

        public boolean A0Q(View view, CoordinatorLayout coordinatorLayout, int i) {
            return false;
        }

        public final void A09(View view, CoordinatorLayout coordinatorLayout) {
            if ((this instanceof AppBarLayout.ScrollingViewBehavior) && (view instanceof AppBarLayout)) {
                AbstractC010103p.A09(coordinatorLayout, C012804r.A0Z.A00());
                AbstractC010103p.A09(coordinatorLayout, C012804r.A0X.A00());
            }
        }

        public final boolean A0B(Rect rect, View view, CoordinatorLayout coordinatorLayout, boolean z) {
            if (this instanceof AppBarLayout.ScrollingViewBehavior) {
                HeaderScrollingViewBehavior headerScrollingViewBehavior = (HeaderScrollingViewBehavior) this;
                List A0B = coordinatorLayout.A0B(view);
                int size = A0B.size();
                for (int i = 0; i < size; i++) {
                    View view2 = (View) A0B.get(i);
                    if (view2 instanceof AppBarLayout) {
                        AppBarLayout appBarLayout = (AppBarLayout) view2;
                        if (appBarLayout != null) {
                            rect.offset(view.getLeft(), view.getTop());
                            Rect rect2 = headerScrollingViewBehavior.A02;
                            rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                            if (!rect2.contains(rect)) {
                                int i2 = 0;
                                if (!z) {
                                    i2 = 4;
                                }
                                appBarLayout.A03 = i2 | 2 | 8;
                                appBarLayout.requestLayout();
                                return true;
                            }
                            return false;
                        }
                        return false;
                    }
                }
                return false;
            }
            return false;
        }

        public boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
            if (this instanceof AppBarLayout.ScrollingViewBehavior) {
                return view2 instanceof AppBarLayout;
            }
            return false;
        }

        public final boolean A0E(View view, CoordinatorLayout coordinatorLayout, int i, int i2, int i3) {
            int makeMeasureSpec;
            C011504d c011504d;
            if (this instanceof AppBarLayout.BaseBehavior) {
                if (view.getLayoutParams().height == -2) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                } else {
                    return false;
                }
            } else {
                if (this instanceof HeaderScrollingViewBehavior) {
                    int i4 = view.getLayoutParams().height;
                    if (i4 == -1 || i4 == -2) {
                        List A0B = coordinatorLayout.A0B(view);
                        int size = A0B.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            View view2 = (View) A0B.get(i5);
                            if (view2 instanceof AppBarLayout) {
                                if (view2 != null) {
                                    int size2 = View.MeasureSpec.getSize(i3);
                                    if (size2 > 0) {
                                        if (view2.getFitsSystemWindows() && (c011504d = coordinatorLayout.A02) != null) {
                                            size2 += c011504d.A03() + c011504d.A02();
                                        }
                                    } else {
                                        size2 = coordinatorLayout.getHeight();
                                    }
                                    int totalScrollRange = (size2 + ((AppBarLayout) view2).getTotalScrollRange()) - view2.getMeasuredHeight();
                                    int i6 = Integer.MIN_VALUE;
                                    if (i4 == -1) {
                                        i6 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                                    }
                                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(totalScrollRange, i6);
                                } else {
                                    return false;
                                }
                            }
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            coordinatorLayout.A0F(view, i, i2, makeMeasureSpec);
            return true;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.os.Parcelable, com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState, androidx.customview.view.AbsSavedState] */
        public Parcelable A0F(View view, CoordinatorLayout coordinatorLayout) {
            int i;
            if (this instanceof AppBarLayout.BaseBehavior) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                AbsSavedState absSavedState = AbsSavedState.EMPTY_STATE;
                C72E c72e = ((ViewOffsetBehavior) this).A01;
                if (c72e != null) {
                    i = c72e.A02;
                } else {
                    i = 0;
                }
                int childCount = appBarLayout.getChildCount();
                boolean z = false;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = appBarLayout.getChildAt(i2);
                    int bottom = childAt.getBottom() + i;
                    if (childAt.getTop() + i <= 0 && bottom >= 0) {
                        ?? absSavedState2 = new androidx.customview.view.AbsSavedState(absSavedState);
                        absSavedState2.A01 = i2;
                        if (bottom == childAt.getMinimumHeight() + appBarLayout.getTopInset()) {
                            z = true;
                        }
                        absSavedState2.A02 = z;
                        absSavedState2.A00 = bottom / childAt.getHeight();
                        return absSavedState2;
                    }
                }
                return absSavedState;
            }
            return AbsSavedState.EMPTY_STATE;
        }

        public void A0H(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
                if (parcelable instanceof AppBarLayout.BaseBehavior.SavedState) {
                    AppBarLayout.BaseBehavior.SavedState savedState = (AppBarLayout.BaseBehavior.SavedState) parcelable;
                    baseBehavior.A02 = savedState.A01;
                    baseBehavior.A00 = savedState.A00;
                    baseBehavior.A05 = savedState.A02;
                    return;
                }
                baseBehavior.A02 = -1;
            }
        }

        public void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
            if (this instanceof AppBarLayout.BaseBehavior) {
                ((AppBarLayout.BaseBehavior) this).A0W(view2, coordinatorLayout, (AppBarLayout) view, i);
            }
        }

        public void A0P(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes2.dex */
    public @interface DefaultBehavior {
        Class value();
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public final void A0F(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // X.InterfaceC17990uc
    public final void DVF(View view, int i, int i2, int i3, int i4, int i5) {
        DVG(view, this.A0H, i, i2, i3, i4, 0);
    }

    @Override // X.InterfaceC17990uc
    public boolean Do4(View view, View view2, int i, int i2) {
        boolean z;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                C56292iI c56292iI = (C56292iI) childAt.getLayoutParams();
                Behavior behavior = c56292iI.A0A;
                if (behavior != null) {
                    z = behavior.A0N(childAt, view, view2, this, i, i2);
                    z2 |= z;
                } else {
                    z = false;
                }
                if (i2 != 0) {
                    if (i2 == 1) {
                        c56292iI.A0C = z;
                    }
                } else {
                    c56292iI.A0D = z;
                }
            }
        }
        return z2;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C56292iI(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        Behavior behavior;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                C56292iI c56292iI = (C56292iI) childAt.getLayoutParams();
                if (c56292iI.A0D && (behavior = c56292iI.A0A) != null) {
                    z |= behavior.A0O(childAt, view, this, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        DVE(view, iArr, i, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        DVF(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        DVH(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return Do4(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        Dow(view, 0);
    }

    /* loaded from: classes2.dex */
    public class SavedState extends androidx.customview.view.AbsSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.4iL
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CoordinatorLayout.SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CoordinatorLayout.SavedState[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new CoordinatorLayout.SavedState(parcel, classLoader);
            }
        };
        public SparseArray A00;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            SparseArray sparseArray = new SparseArray(readInt);
            this.A00 = sparseArray;
            for (int i = 0; i < readInt; i++) {
                sparseArray.append(iArr[i], readParcelableArray[i]);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.A00;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.A00.keyAt(i3);
                parcelableArr[i3] = this.A00.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Comparator] */
    static {
        Package r1 = CoordinatorLayout.class.getPackage();
        String str = null;
        if (r1 != null) {
            str = r1.getName();
        }
        A0I = str;
        A0K = new Object();
        A0L = new Class[]{Context.class, AttributeSet.class};
        A0J = new ThreadLocal();
        A0M = new C12550kz(12);
    }

    private int A00(int i) {
        StringBuilder sb;
        int[] iArr = this.A0B;
        if (iArr == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
        } else {
            if (i >= 0 && i < iArr.length) {
                return iArr[i];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(i);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }

    public static Rect A01() {
        Rect rect = (Rect) A0M.A7H();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    private void A03() {
        View childAt;
        int layoutDirection;
        int absoluteGravity;
        Behavior behavior;
        List list = this.A0E;
        list.clear();
        C56022hp c56022hp = this.A0C;
        C005001p c005001p = c56022hp.A00;
        int size = c005001p.size();
        for (int i = 0; i < size; i++) {
            AbstractCollection abstractCollection = (AbstractCollection) c005001p.A06(i);
            if (abstractCollection != null) {
                abstractCollection.clear();
                c56022hp.A01.EE6(abstractCollection);
            }
        }
        c005001p.clear();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt2 = getChildAt(i2);
            C56292iI A02 = A02(childAt2);
            if (A02.A05 == -1) {
                A02.A08 = null;
                A02.A09 = null;
            } else {
                View view = A02.A09;
                if (view != null && view.getId() == A02.A05) {
                    View view2 = A02.A09;
                    for (ViewParent parent = view2.getParent(); parent != this; parent = parent.getParent()) {
                        if (parent != null && parent != childAt2) {
                            if (parent instanceof View) {
                                view2 = parent;
                            }
                        } else {
                            A02.A08 = null;
                            A02.A09 = null;
                        }
                    }
                    A02.A08 = view2;
                }
                int i3 = A02.A05;
                View findViewById = findViewById(i3);
                A02.A09 = findViewById;
                if (findViewById != null) {
                    if (findViewById == this) {
                        if (!isInEditMode()) {
                            throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                        }
                    } else {
                        for (ViewParent parent2 = findViewById.getParent(); parent2 != this && parent2 != null; parent2 = parent2.getParent()) {
                            if (parent2 == childAt2) {
                                if (!isInEditMode()) {
                                    throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                                }
                            } else {
                                if (parent2 instanceof View) {
                                    findViewById = parent2;
                                }
                            }
                        }
                        A02.A08 = findViewById;
                    }
                } else if (!isInEditMode()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Could not find CoordinatorLayout descendant view with id ");
                    sb.append(getResources().getResourceName(i3));
                    sb.append(" to anchor view ");
                    sb.append(childAt2);
                    throw new IllegalStateException(sb.toString());
                }
                A02.A08 = null;
                A02.A09 = null;
            }
            if (!c005001p.containsKey(childAt2)) {
                c005001p.put(childAt2, null);
            }
            for (int i4 = 0; i4 < childCount; i4++) {
                if (i4 != i2 && ((childAt = getChildAt(i4)) == A02.A08 || (((absoluteGravity = Gravity.getAbsoluteGravity(((C56292iI) childAt.getLayoutParams()).A03, (layoutDirection = getLayoutDirection()))) != 0 && (Gravity.getAbsoluteGravity(A02.A01, layoutDirection) & absoluteGravity) == absoluteGravity) || ((behavior = A02.A0A) != null && behavior.A0C(childAt2, childAt, this))))) {
                    if (!c005001p.containsKey(childAt) && !c005001p.containsKey(childAt)) {
                        c005001p.put(childAt, null);
                    }
                    if (c005001p.containsKey(childAt) && c005001p.containsKey(childAt2)) {
                        AbstractCollection abstractCollection2 = (AbstractCollection) c005001p.get(childAt);
                        if (abstractCollection2 == null) {
                            abstractCollection2 = (AbstractCollection) c56022hp.A01.A7H();
                            if (abstractCollection2 == null) {
                                abstractCollection2 = new ArrayList();
                            }
                            c005001p.put(childAt, abstractCollection2);
                        }
                        abstractCollection2.add(childAt2);
                    } else {
                        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
                    }
                }
            }
        }
        ArrayList arrayList = c56022hp.A02;
        arrayList.clear();
        HashSet hashSet = c56022hp.A03;
        hashSet.clear();
        int size2 = c005001p.size();
        for (int i5 = 0; i5 < size2; i5++) {
            C56022hp.A00(c56022hp, c005001p.A05(i5), arrayList, hashSet);
        }
        list.addAll(arrayList);
        Collections.reverse(list);
    }

    private void A04() {
        View view = this.A07;
        if (view != null) {
            Behavior behavior = ((C56292iI) view.getLayoutParams()).A0A;
            if (behavior != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                behavior.A0M(obtain, this.A07, this);
                obtain.recycle();
            }
            this.A07 = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).getLayoutParams();
        }
        this.A0A = false;
    }

    public static void A07(Rect rect, Rect rect2, C56292iI c56292iI, int i, int i2, int i3) {
        int width;
        int height;
        int i4 = c56292iI.A02;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = c56292iI.A00;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    public final List A0B(View view) {
        C005001p c005001p = this.A0C.A00;
        int size = c005001p.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AbstractCollection abstractCollection = (AbstractCollection) c005001p.A06(i);
            if (abstractCollection != null && abstractCollection.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c005001p.A05(i));
            }
        }
        if (arrayList == null) {
            return Collections.emptyList();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x0260, code lost:
    
        if (r13 == false) goto L95;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0C(int r28) {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.A0C(int):void");
    }

    public final void A0D(View view) {
        AbstractList abstractList = (AbstractList) this.A0C.A00.get(view);
        if (abstractList != null && !abstractList.isEmpty()) {
            for (int i = 0; i < abstractList.size(); i++) {
                View view2 = (View) abstractList.get(i);
                Behavior behavior = ((C56292iI) view2.getLayoutParams()).A0A;
                if (behavior != null) {
                    behavior.A0D(view2, view, this);
                }
            }
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVE(View view, int[] iArr, int i, int i2, int i3) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C56292iI c56292iI = (C56292iI) childAt.getLayoutParams();
                if (i3 != 0) {
                    if (i3 == 1) {
                        z = c56292iI.A0C;
                    }
                } else {
                    z = c56292iI.A0D;
                }
                if (z && (behavior = c56292iI.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.A0P(childAt, view, this, iArr2, i, i2, i3);
                    int i7 = iArr2[0];
                    if (i > 0) {
                        i4 = Math.max(i4, i7);
                    } else {
                        i4 = Math.min(i4, i7);
                    }
                    int i8 = iArr2[1];
                    if (i2 > 0) {
                        i5 = Math.max(i5, i8);
                    } else {
                        i5 = Math.min(i5, i8);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            A0C(1);
        }
    }

    @Override // X.InterfaceC12520kw
    public final void DVG(View view, int[] iArr, int i, int i2, int i3, int i4, int i5) {
        boolean z;
        Behavior behavior;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                C56292iI c56292iI = (C56292iI) childAt.getLayoutParams();
                if (i5 != 0) {
                    if (i5 == 1) {
                        z = c56292iI.A0C;
                    }
                } else {
                    z = c56292iI.A0D;
                }
                if (z && (behavior = c56292iI.A0A) != null) {
                    int[] iArr2 = this.A0G;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behavior.A0J(childAt, view, this, iArr2, i, i2, i3, i4, i5);
                    int i9 = iArr2[0];
                    if (i3 > 0) {
                        i6 = Math.max(i6, i9);
                    } else {
                        i6 = Math.min(i6, i9);
                    }
                    int i10 = iArr2[1];
                    if (i4 > 0) {
                        i7 = Math.max(i7, i10);
                    } else {
                        i7 = Math.min(i7, i10);
                    }
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z2) {
            A0C(1);
        }
    }

    @Override // X.InterfaceC17990uc
    public final void DVH(View view, View view2, int i, int i2) {
        C03K c03k = this.A0D;
        if (i2 == 1) {
            c03k.A00 = i;
        } else {
            c03k.A01 = i;
        }
        this.A08 = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).getLayoutParams();
        }
    }

    @Override // X.InterfaceC17990uc
    public final void Dow(View view, int i) {
        boolean z;
        C03K c03k = this.A0D;
        if (i == 1) {
            c03k.A00 = 0;
        } else {
            c03k.A01 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            C56292iI c56292iI = (C56292iI) childAt.getLayoutParams();
            if (i != 0) {
                if (i == 1) {
                    z = c56292iI.A0C;
                }
            } else {
                z = c56292iI.A0D;
            }
            if (z) {
                Behavior behavior = c56292iI.A0A;
                if (behavior != null) {
                    behavior.A0I(childAt, view, this, i);
                }
                if (i != 0) {
                    c56292iI.A0C = false;
                } else {
                    c56292iI.A0D = false;
                }
                c56292iI.A0E = false;
            }
        }
        this.A08 = null;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C56292iI) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof C56292iI) {
            return new C56292iI((C56292iI) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C56292iI((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C56292iI(layoutParams);
    }

    public final C011504d getLastWindowInsets() {
        return this.A02;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C03K c03k = this.A0D;
        return c03k.A01 | c03k.A00;
    }

    public Drawable getStatusBarBackground() {
        return this.A06;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
    
        if (getFitsSystemWindows() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r21 != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d1, code lost:
    
        r1 = r1 - r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x015e, code lost:
    
        r1 = (r20 - r22) - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x015c, code lost:
    
        if (r21 != false) goto L60;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r34, int r35) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((androidx.customview.view.AbsSavedState) savedState).A00);
        SparseArray sparseArray = savedState.A00;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = A02(childAt).A0A;
            if (id != -1 && behavior != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behavior.A0H(parcelable2, childAt, this);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [android.os.Parcelable, androidx.customview.view.AbsSavedState, androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable A0F;
        Parcelable.Creator creator = SavedState.CREATOR;
        ?? absSavedState = new androidx.customview.view.AbsSavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            Behavior behavior = ((C56292iI) childAt.getLayoutParams()).A0A;
            if (id != -1 && behavior != null && (A0F = behavior.A0F(childAt, this)) != null) {
                sparseArray.append(id, A0F);
            }
        }
        absSavedState.A00 = sparseArray;
        return absSavedState;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.A06;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.A06 = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.A06.setState(getDrawableState());
                }
                this.A06.setLayoutDirection(getLayoutDirection());
                Drawable drawable4 = this.A06;
                boolean z = false;
                if (getVisibility() == 0) {
                    z = true;
                }
                drawable4.setVisible(z, false);
                this.A06.setCallback(this);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = getContext().getDrawable(i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    public static final C56292iI A02(View view) {
        C56292iI c56292iI = (C56292iI) view.getLayoutParams();
        if (!c56292iI.A0B) {
            if (view instanceof C3OF) {
                c56292iI.A00(new AppBarLayout.Behavior());
            } else {
                Class<?> cls = view.getClass();
                while (true) {
                    if (cls == null) {
                        break;
                    }
                    DefaultBehavior defaultBehavior = (DefaultBehavior) cls.getAnnotation(DefaultBehavior.class);
                    if (defaultBehavior == null) {
                        cls = cls.getSuperclass();
                    } else {
                        try {
                            c56292iI.A00((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            break;
                        } catch (Exception e) {
                            Log.e("CoordinatorLayout", AnonymousClass001.A0g("Default behavior class ", defaultBehavior.value().getName(), " could not be instantiated. Did you forget a default constructor?"), e);
                        }
                    }
                }
            }
            c56292iI.A0B = true;
        }
        return c56292iI;
    }

    private void A05() {
        if (getFitsSystemWindows()) {
            C03L c03l = this.A09;
            if (c03l == null) {
                c03l = new C03L() { // from class: X.6XM
                    /* JADX WARN: Code restructure failed: missing block: B:6:0x0014, code lost:
                    
                        if (r8.A03() <= 0) goto L8;
                     */
                    @Override // X.C03L
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final X.C011504d Cx7(android.view.View r7, X.C011504d r8) {
                        /*
                            r6 = this;
                            androidx.coordinatorlayout.widget.CoordinatorLayout r5 = androidx.coordinatorlayout.widget.CoordinatorLayout.this
                            X.04d r0 = r5.A02
                            boolean r0 = X.C02O.A00(r0, r8)
                            if (r0 != 0) goto L50
                            r5.A02 = r8
                            r2 = 1
                            if (r8 == 0) goto L16
                            int r1 = r8.A03()
                            r0 = 1
                            if (r1 > 0) goto L17
                        L16:
                            r0 = 0
                        L17:
                            r5.A03 = r0
                            if (r0 != 0) goto L54
                            android.graphics.drawable.Drawable r0 = r5.getBackground()
                            if (r0 != 0) goto L54
                        L21:
                            r5.setWillNotDraw(r2)
                            X.04b r4 = r8.A00
                            boolean r0 = r4.A0G()
                            if (r0 != 0) goto L4d
                            r3 = 0
                            int r2 = r5.getChildCount()
                        L31:
                            if (r3 >= r2) goto L4d
                            android.view.View r1 = r5.getChildAt(r3)
                            boolean r0 = r1.getFitsSystemWindows()
                            if (r0 == 0) goto L51
                            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
                            X.2iI r0 = (X.C56292iI) r0
                            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.A0A
                            if (r0 == 0) goto L51
                            boolean r0 = r4.A0G()
                            if (r0 == 0) goto L51
                        L4d:
                            r5.requestLayout()
                        L50:
                            return r8
                        L51:
                            int r3 = r3 + 1
                            goto L31
                        L54:
                            r2 = 0
                            goto L21
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C6XM.Cx7(android.view.View, X.04d):X.04d");
                    }
                };
                this.A09 = c03l;
            }
            AbstractC008903d.A00(this, c03l);
            setSystemUiVisibility(1280);
            return;
        }
        AbstractC008903d.A00(this, null);
    }

    public static void A06(Rect rect) {
        rect.setEmpty();
        A0M.EE6(rect);
    }

    private void A08(Rect rect, C56292iI c56292iI, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c56292iI).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) c56292iI).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c56292iI).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) c56292iI).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public static void A09(View view, int i) {
        C56292iI c56292iI = (C56292iI) view.getLayoutParams();
        int i2 = c56292iI.A07;
        if (i2 != i) {
            view.offsetTopAndBottom(i - i2);
            c56292iI.A07 = i;
        }
    }

    private boolean A0A(MotionEvent motionEvent, int i) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        List list = this.A0F;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            list.add(getChildAt(i2));
        }
        Collections.sort(list, A0K);
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            Behavior behavior = ((C56292iI) view.getLayoutParams()).A0A;
            if (!z) {
                if (behavior != null) {
                    if (i != 0) {
                        z = behavior.A0M(motionEvent, view, this);
                    } else {
                        z = behavior.A0L(motionEvent, view, this);
                    }
                    if (z) {
                        this.A07 = view;
                        if (actionMasked != 3 && actionMasked != 1) {
                            for (int i5 = 0; i5 < i4; i5++) {
                                View view2 = (View) list.get(i5);
                                Behavior behavior2 = ((C56292iI) view2.getLayoutParams()).A0A;
                                if (behavior2 != null) {
                                    if (motionEvent2 == null) {
                                        motionEvent2 = MotionEvent.obtain(motionEvent);
                                        motionEvent2.setAction(3);
                                    }
                                    if (i != 0) {
                                        behavior2.A0M(motionEvent2, view2, this);
                                    } else {
                                        behavior2.A0L(motionEvent2, view2, this);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (actionMasked != 0 && behavior != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = MotionEvent.obtain(motionEvent);
                    motionEvent2.setAction(3);
                }
                if (i != 0) {
                    behavior.A0M(motionEvent2, view, this);
                } else {
                    behavior.A0L(motionEvent2, view, this);
                }
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    public final void A0E(View view, int i) {
        Rect A01;
        Rect A012;
        C56292iI c56292iI = (C56292iI) view.getLayoutParams();
        View view2 = c56292iI.A09;
        if (view2 == null) {
            if (c56292iI.A05 != -1) {
                throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
            }
            int i2 = c56292iI.A04;
            if (i2 >= 0) {
                C56292iI c56292iI2 = (C56292iI) view.getLayoutParams();
                int i3 = c56292iI2.A02;
                if (i3 == 0) {
                    i3 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i3, i);
                int i4 = absoluteGravity & 7;
                int i5 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth = view.getMeasuredWidth();
                int measuredHeight = view.getMeasuredHeight();
                if (i == 1) {
                    i2 = width - i2;
                }
                int A00 = A00(i2) - measuredWidth;
                int i6 = 0;
                if (i4 != 1) {
                    if (i4 == 5) {
                        A00 += measuredWidth;
                    }
                } else {
                    A00 += measuredWidth / 2;
                }
                if (i5 != 16) {
                    if (i5 == 80) {
                        i6 = measuredHeight;
                    }
                } else {
                    i6 = 0 + (measuredHeight / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c56292iI2).leftMargin, Math.min(A00, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) c56292iI2).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) c56292iI2).topMargin, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c56292iI2).bottomMargin));
                view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
                return;
            }
            C56292iI c56292iI3 = (C56292iI) view.getLayoutParams();
            A01 = A01();
            A01.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) c56292iI3).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) c56292iI3).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) c56292iI3).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) c56292iI3).bottomMargin);
            if (this.A02 != null && getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                A01.left += this.A02.A00.A03().A01;
                A01.top += this.A02.A03();
                A01.right -= this.A02.A00.A03().A02;
                A01.bottom -= this.A02.A02();
            }
            A012 = A01();
            int i7 = c56292iI3.A02;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            Gravity.apply(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), A01, A012, i);
            view.layout(A012.left, A012.top, A012.right, A012.bottom);
            return;
        }
        A01 = A01();
        A012 = A01();
        try {
            C72F.A01(A01, view2, this);
            C56292iI c56292iI4 = (C56292iI) view.getLayoutParams();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            A07(A01, A012, c56292iI4, i, measuredWidth2, measuredHeight2);
            A08(A012, c56292iI4, measuredWidth2, measuredHeight2);
            view.layout(A012.left, A012.top, A012.right, A012.bottom);
        } finally {
            A06(A01);
            A06(A012);
        }
    }

    public final boolean A0G(View view, int i, int i2) {
        Rect A01 = A01();
        C72F.A01(A01, view, this);
        try {
            return A01.contains(i, i2);
        } finally {
            A06(A01);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        view.getLayoutParams();
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidate();
        }
    }

    public final List getDependencySortedChildren() {
        A03();
        return Collections.unmodifiableList(this.A0E);
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1150113293);
        super.onAttachedToWindow();
        A04();
        if (this.A05) {
            if (this.A01 == null) {
                this.A01 = new C72D(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.A01);
        }
        if (this.A02 == null && getFitsSystemWindows()) {
            requestApplyInsets();
        }
        this.A04 = true;
        C0f9.A0D(-1230308864, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-2145637674);
        super.onDetachedFromWindow();
        A04();
        if (this.A05 && this.A01 != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.A01);
        }
        View view = this.A08;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.A04 = false;
        C0f9.A0D(-1487264345, A06);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C011504d c011504d;
        int A03;
        super.onDraw(canvas);
        if (this.A03 && this.A06 != null && (c011504d = this.A02) != null && (A03 = c011504d.A03()) > 0) {
            this.A06.setBounds(0, 0, getWidth(), A03);
            this.A06.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            A04();
        }
        boolean A0A = A0A(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        return A0A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Behavior behavior;
        int layoutDirection = getLayoutDirection();
        List list = this.A0E;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) list.get(i5);
            if (view.getVisibility() != 8 && ((behavior = ((C56292iI) view.getLayoutParams()).A0A) == null || !behavior.A0Q(view, this, layoutDirection))) {
                A0E(view, layoutDirection);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                childAt.getLayoutParams();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean A0A;
        int A05 = C0f9.A05(1710293130);
        int actionMasked = motionEvent.getActionMasked();
        View view = this.A07;
        boolean z = false;
        if (view != null) {
            Behavior behavior = ((C56292iI) view.getLayoutParams()).A0A;
            A0A = behavior != null ? behavior.A0M(motionEvent, this.A07, this) : false;
        } else {
            A0A = A0A(motionEvent, 1);
            if (actionMasked != 0 && A0A) {
                z = true;
            }
        }
        if (this.A07 != null && actionMasked != 3) {
            if (z) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
            }
        } else {
            A0A |= super.onTouchEvent(motionEvent);
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A07 = null;
            A04();
        }
        C0f9.A0C(-1448077126, A05);
        return A0A;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        Behavior behavior = ((C56292iI) view.getLayoutParams()).A0A;
        if (behavior != null && behavior.A0B(rect, view, this, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.A0A) {
            if (this.A07 == null) {
                int childCount = getChildCount();
                MotionEvent motionEvent = null;
                for (int i = 0; i < childCount; i++) {
                    View childAt = getChildAt(i);
                    Behavior behavior = ((C56292iI) childAt.getLayoutParams()).A0A;
                    if (behavior != null) {
                        if (motionEvent == null) {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        }
                        behavior.A0L(motionEvent, childAt, this);
                    }
                }
                if (motionEvent != null) {
                    motionEvent.recycle();
                }
            }
            A04();
            this.A0A = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        A05();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = false;
        if (i == 0) {
            z = true;
        }
        Drawable drawable = this.A06;
        if (drawable != null && drawable.isVisible() != z) {
            this.A06.setVisible(z, false);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A06) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.A00 = onHierarchyChangeListener;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, X.03K] */
    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.A0E = new ArrayList();
        this.A0C = new C56022hp();
        this.A0F = new ArrayList();
        this.A0G = new int[2];
        this.A0H = new int[2];
        this.A0D = new Object();
        int[] iArr = AbstractC56032hq.A00;
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
            AbstractC010103p.A06(context, obtainStyledAttributes, attributeSet, this, iArr, 0, R.style.Widget_Support_CoordinatorLayout);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
            AbstractC010103p.A06(context, obtainStyledAttributes, attributeSet, this, iArr, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.A0B = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int[] iArr2 = this.A0B;
            int length = iArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr2[i2] = (int) (iArr2[i2] * f);
            }
        }
        this.A06 = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        A05();
        super.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: X.2hr
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.A00;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewAdded(view, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                coordinatorLayout.A0C(2);
                ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.A00;
                if (onHierarchyChangeListener != null) {
                    onHierarchyChangeListener.onChildViewRemoved(view, view2);
                }
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C56292iI(getContext(), attributeSet);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }
}
