package androidx.viewpager.widget;

import X.AbstractC008903d;
import X.AbstractC010103p;
import X.AbstractC021208i;
import X.AnonymousClass001;
import X.C021608n;
import X.C021708o;
import X.C022108s;
import X.C02V;
import X.C03L;
import X.C0f9;
import X.InterfaceC021808p;
import X.InterfaceC021908q;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.view.AbsSavedState;
import androidx.viewpager.widget.ViewPager;
import com.facebook.common.dextricks.Constants;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public VelocityTracker A06;
    public Scroller A07;
    public AbstractC021208i A08;
    public InterfaceC021908q A09;
    public List A0A;
    public List A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public float A0G;
    public float A0H;
    public float A0I;
    public int A0J;
    public int A0K;
    public int A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public int A0Q;
    public int A0R;
    public int A0S;
    public int A0T;
    public int A0U;
    public int A0V;
    public Drawable A0W;
    public Parcelable A0X;
    public EdgeEffect A0Y;
    public EdgeEffect A0Z;
    public C022108s A0a;
    public ClassLoader A0b;
    public boolean A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public boolean A0g;
    public final ArrayList A0h;
    public final Rect A0i;
    public final C021608n A0j;
    public final Runnable A0k;
    public int mGutterSize;
    public static final int[] A0l = {R.attr.layout_gravity};
    public static final Comparator A0n = new Comparator() { // from class: X.08j
        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
            return ((C021608n) obj).A02 - ((C021608n) obj2).A02;
        }
    };
    public static final Interpolator A0m = new Interpolator() { // from class: X.08k
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    };

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes.dex */
    public @interface DecorView {
    }

    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new Parcelable.ClassLoaderCreator() { // from class: X.08t
            /* JADX WARN: Type inference failed for: r2v0, types: [androidx.viewpager.widget.ViewPager$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
                ?? absSavedState = new AbsSavedState(parcel, null);
                ClassLoader classLoader = absSavedState.getClass().getClassLoader();
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = parcel.readParcelable(classLoader);
                absSavedState.A02 = classLoader;
                return absSavedState;
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new ViewPager.SavedState[i];
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [androidx.viewpager.widget.ViewPager$SavedState, androidx.customview.view.AbsSavedState, java.lang.Object] */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                ?? absSavedState = new AbsSavedState(parcel, classLoader);
                if (classLoader == null) {
                    classLoader = absSavedState.getClass().getClassLoader();
                }
                absSavedState.A00 = parcel.readInt();
                absSavedState.A01 = parcel.readParcelable(classLoader);
                absSavedState.A02 = classLoader;
                return absSavedState;
            }
        };
        public int A00;
        public Parcelable A01;
        public ClassLoader A02;

        public final String toString() {
            return AnonymousClass001.A09(this.A00, "FragmentPager.SavedState{", Integer.toHexString(System.identityHashCode(this)), " position=", "}");
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A01, i);
        }
    }

    private boolean A07() {
        this.A0J = -1;
        this.A0C = false;
        this.A0E = false;
        VelocityTracker velocityTracker = this.A06;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.A06 = null;
        }
        this.A0Y.onRelease();
        this.A0Z.onRelease();
        if (!this.A0Y.isFinished() && !this.A0Z.isFinished()) {
            return false;
        }
        return true;
    }

    public final C021608n A0A(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i2 < arrayList.size()) {
                C021608n c021608n = (C021608n) arrayList.get(i2);
                if (c021608n.A02 != i) {
                    i2++;
                } else {
                    return c021608n;
                }
            } else {
                return null;
            }
        }
    }

    public final C021608n A0C(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i < arrayList.size()) {
                C021608n c021608n = (C021608n) arrayList.get(i);
                if (!this.A08.isViewFromObject(view, c021608n.A03)) {
                    i++;
                } else {
                    return c021608n;
                }
            } else {
                return null;
            }
        }
    }

    public final void A0E() {
        setWillNotDraw(false);
        setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
        setFocusable(true);
        Context context = getContext();
        this.A07 = new Scroller(context, A0m);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.A0V = viewConfiguration.getScaledPagingTouchSlop();
        this.A04 = (int) (400.0f * f);
        this.A0Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.A0Y = new EdgeEffect(context);
        this.A0Z = new EdgeEffect(context);
        this.A03 = (int) (25.0f * f);
        this.A0M = (int) (2.0f * f);
        this.A0O = (int) (f * 16.0f);
        AbstractC010103p.A0B(this, new C02V() { // from class: X.0c2
            @Override // X.C02V
            public final void A0S(View view, AccessibilityEvent accessibilityEvent) {
                AbstractC021208i abstractC021208i;
                super.A0S(view, accessibilityEvent);
                accessibilityEvent.setClassName(ViewPager.class.getName());
                ViewPager viewPager = ViewPager.this;
                AbstractC021208i abstractC021208i2 = viewPager.A08;
                boolean z = true;
                if (abstractC021208i2 == null || abstractC021208i2.getCount() <= 1) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (abstractC021208i = viewPager.A08) != null) {
                    accessibilityEvent.setItemCount(abstractC021208i.getCount());
                    accessibilityEvent.setFromIndex(viewPager.A02);
                    accessibilityEvent.setToIndex(viewPager.A02);
                }
            }

            @Override // X.C02V
            public final boolean A0V(View view, int i, Bundle bundle) {
                ViewPager viewPager;
                int i2;
                if (!super.A0V(view, i, bundle)) {
                    if (i != 4096) {
                        if (i == 8192) {
                            viewPager = ViewPager.this;
                            if (viewPager.canScrollHorizontally(-1)) {
                                i2 = viewPager.A02 - 1;
                                viewPager.setCurrentItem(i2);
                            }
                        }
                        return false;
                    }
                    viewPager = ViewPager.this;
                    if (viewPager.canScrollHorizontally(1)) {
                        i2 = viewPager.A02 + 1;
                        viewPager.setCurrentItem(i2);
                    }
                    return false;
                }
                return true;
            }

            @Override // X.C02V
            public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.A0Y(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setClassName(ViewPager.class.getName());
                ViewPager viewPager = ViewPager.this;
                AbstractC021208i abstractC021208i = viewPager.A08;
                boolean z = true;
                if (abstractC021208i == null || abstractC021208i.getCount() <= 1) {
                    z = false;
                }
                accessibilityNodeInfoCompat.mInfo.setScrollable(z);
                if (viewPager.canScrollHorizontally(1)) {
                    accessibilityNodeInfoCompat.addAction(4096);
                }
                if (viewPager.canScrollHorizontally(-1)) {
                    accessibilityNodeInfoCompat.addAction(8192);
                }
            }
        });
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        AbstractC008903d.A00(this, new C03L() { // from class: X.0c5
            public final Rect A00 = new Rect();

            @Override // X.C03L
            public final C011504d Cx7(View view, C011504d c011504d) {
                C011504d A05 = AbstractC010103p.A05(view, c011504d);
                C011304b c011304b = A05.A00;
                if (!c011304b.A0G()) {
                    Rect rect = this.A00;
                    rect.left = c011304b.A03().A01;
                    rect.top = A05.A03();
                    rect.right = c011304b.A03().A02;
                    rect.bottom = A05.A02();
                    ViewPager viewPager = ViewPager.this;
                    int childCount = viewPager.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        C011504d A04 = AbstractC010103p.A04(viewPager.getChildAt(i), A05);
                        C011304b c011304b2 = A04.A00;
                        rect.left = Math.min(c011304b2.A03().A01, rect.left);
                        rect.top = Math.min(A04.A03(), rect.top);
                        rect.right = Math.min(c011304b2.A03().A02, rect.right);
                        rect.bottom = Math.min(A04.A02(), rect.bottom);
                    }
                    return A05.A05(rect.left, rect.top, rect.right, rect.bottom);
                }
                return A05;
            }
        });
    }

    public void A0I(int i, boolean z) {
        this.A0f = false;
        A0H(i, 0, z, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        C021608n A0C;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0C = A0C(childAt)) != null && A0C.A02 == this.A02) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.A0D = true;
        if (!this.A07.isFinished() && this.A07.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.A07.getCurrX();
            int currY = this.A07.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!A09(currX)) {
                    this.A07.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            postInvalidateOnAnimation();
            return;
        }
        A06(true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0068, code lost:
    
        if (r7 == 80) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bb, code lost:
    
        if (r10 == false) goto L24;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r18, int r19) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onMeasure(int, int):void");
    }

    public void setCurrentItem(int i) {
        this.A0f = false;
        A0H(i, 0, !this.A0d, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w("ViewPager", AnonymousClass001.A02(i, 1, "Requested offscreen page limit ", " too small; defaulting to "));
            i = 1;
        }
        if (i != this.A0R) {
            this.A0R = i;
            A0F(this.A02);
        }
    }

    private Rect A00(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.left = view.getLeft();
            rect.right = view.getRight();
            rect.top = view.getTop();
            int bottom = view.getBottom();
            while (true) {
                rect.bottom = bottom;
                Object parent = view.getParent();
                if (!(parent instanceof ViewGroup) || parent == this) {
                    break;
                }
                view = (View) parent;
                rect.left += view.getLeft();
                rect.right += view.getRight();
                rect.top += view.getTop();
                bottom = rect.bottom + view.getBottom();
            }
        }
        return rect;
    }

    private void A02(int i) {
        InterfaceC021908q interfaceC021908q = this.A09;
        if (interfaceC021908q != null) {
            interfaceC021908q.onPageSelected(i);
        }
        List list = this.A0B;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                InterfaceC021908q interfaceC021908q2 = (InterfaceC021908q) this.A0B.get(i2);
                if (interfaceC021908q2 != null) {
                    interfaceC021908q2.onPageSelected(i);
                }
            }
        }
    }

    private void A03(int i, int i2, int i3, int i4) {
        float f;
        int paddingLeft;
        if (i2 > 0 && !this.A0h.isEmpty()) {
            if (!this.A07.isFinished()) {
                this.A07.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                paddingLeft = (int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3));
            }
        } else {
            C021608n A0A = A0A(this.A02);
            if (A0A != null) {
                f = Math.min(A0A.A00, this.A01);
            } else {
                f = 0.0f;
            }
            paddingLeft = (int) (f * ((i - getPaddingLeft()) - getPaddingRight()));
            if (paddingLeft == getScrollX()) {
                return;
            } else {
                A06(false);
            }
        }
        scrollTo(paddingLeft, getScrollY());
    }

    private void A06(boolean z) {
        boolean z2 = false;
        if (this.A0T == 2) {
            z2 = true;
            setScrollingCacheEnabled(false);
            if (!this.A07.isFinished()) {
                this.A07.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.A07.getCurrX();
                int currY = this.A07.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        A09(currX);
                    }
                }
            }
        }
        this.A0f = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A0h;
            if (i >= arrayList.size()) {
                break;
            }
            C021608n c021608n = (C021608n) arrayList.get(i);
            if (c021608n.A04) {
                c021608n.A04 = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            Runnable runnable = this.A0k;
            if (z) {
                postOnAnimation(runnable);
            } else {
                runnable.run();
            }
        }
    }

    private boolean A08(float f) {
        boolean z;
        boolean z2;
        float f2 = this.A0H - f;
        this.A0H = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.A00 * clientWidth;
        float f4 = this.A01 * clientWidth;
        ArrayList arrayList = this.A0h;
        boolean z3 = false;
        C021608n c021608n = (C021608n) arrayList.get(0);
        C021608n c021608n2 = (C021608n) arrayList.get(arrayList.size() - 1);
        if (c021608n.A02 != 0) {
            f3 = c021608n.A00 * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (c021608n2.A02 != this.A08.getCount() - 1) {
            f4 = c021608n2.A00 * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.A0Y.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.A0Z.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.A0H += scrollX - i;
        scrollTo(i, getScrollY());
        A09(i);
        return z3;
    }

    private boolean A09(int i) {
        if (this.A0h.size() == 0) {
            if (!this.A0d) {
                this.A0c = false;
                A0G(0, 0.0f, 0);
                if (!this.A0c) {
                    throw new IllegalStateException("onPageScrolled did not call superclass implementation");
                }
            }
            return false;
        }
        C021608n A01 = A01();
        int clientWidth = getClientWidth();
        int i2 = this.A05;
        int i3 = clientWidth + i2;
        float f = i2;
        float f2 = clientWidth;
        int i4 = A01.A02;
        float f3 = ((i / f2) - A01.A00) / (A01.A01 + (f / f2));
        this.A0c = false;
        A0G(i4, f3, (int) (i3 * f3));
        if (this.A0c) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.A0g != z) {
            this.A0g = z;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, X.08n] */
    public final C021608n A0B(int i, int i2) {
        ?? obj = new Object();
        obj.A02 = i;
        obj.A03 = this.A08.instantiateItem((ViewGroup) this, i);
        obj.A01 = this.A08.getPageWidth(i);
        if (i2 >= 0) {
            ArrayList arrayList = this.A0h;
            if (i2 < arrayList.size()) {
                arrayList.add(i2, obj);
                return obj;
            }
        }
        this.A0h.add(obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3.size() >= r7) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0D() {
        /*
            r11 = this;
            X.08i r0 = r11.A08
            int r7 = r0.getCount()
            r11.A0P = r7
            java.util.ArrayList r3 = r11.A0h
            int r1 = r3.size()
            int r0 = r11.A0R
            int r0 = r0 * 2
            int r0 = r0 + 1
            r5 = 0
            if (r1 >= r0) goto L1e
            int r0 = r3.size()
            r10 = 1
            if (r0 < r7) goto L1f
        L1e:
            r10 = 0
        L1f:
            int r4 = r11.A02
            r6 = 0
            r9 = 0
        L23:
            int r0 = r3.size()
            if (r6 >= r0) goto L75
            java.lang.Object r8 = r3.get(r6)
            X.08n r8 = (X.C021608n) r8
            X.08i r1 = r11.A08
            java.lang.Object r0 = r8.A03
            int r2 = r1.getItemPosition(r0)
            r0 = -1
            if (r2 == r0) goto L64
            r0 = -2
            if (r2 != r0) goto L67
            r3.remove(r6)
            int r6 = r6 + (-1)
            if (r9 != 0) goto L4a
            X.08i r0 = r11.A08
            r0.startUpdate(r11)
            r9 = 1
        L4a:
            X.08i r2 = r11.A08
            int r1 = r8.A02
            java.lang.Object r0 = r8.A03
            r2.destroyItem(r11, r1, r0)
            int r1 = r11.A02
            int r0 = r8.A02
            if (r1 != r0) goto L63
            int r0 = r7 + (-1)
            int r0 = java.lang.Math.min(r1, r0)
            int r4 = java.lang.Math.max(r5, r0)
        L63:
            r10 = 1
        L64:
            int r6 = r6 + 1
            goto L23
        L67:
            int r0 = r8.A02
            if (r0 == r2) goto L64
            int r1 = r8.A02
            int r0 = r11.A02
            if (r1 != r0) goto L72
            r4 = r2
        L72:
            r8.A02 = r2
            goto L63
        L75:
            if (r9 == 0) goto L7c
            X.08i r0 = r11.A08
            r0.finishUpdate(r11)
        L7c:
            java.util.Comparator r0 = androidx.viewpager.widget.ViewPager.A0n
            java.util.Collections.sort(r3, r0)
            if (r10 == 0) goto La5
            int r3 = r11.getChildCount()
            r2 = 0
        L88:
            if (r2 >= r3) goto L9e
            android.view.View r0 = r11.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            X.08o r1 = (X.C021708o) r1
            boolean r0 = r1.A02
            if (r0 != 0) goto L9b
            r0 = 0
            r1.A00 = r0
        L9b:
            int r2 = r2 + 1
            goto L88
        L9e:
            r0 = 1
            r11.A0H(r4, r5, r5, r0)
            r11.requestLayout()
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0D():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r0 == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0F(int r19) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0F(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0G(int r11, float r12, int r13) {
        /*
            r10 = this;
            int r0 = r10.A0N
            r3 = 1
            if (r0 <= 0) goto L68
            int r9 = r10.getScrollX()
            int r6 = r10.getPaddingLeft()
            int r8 = r10.getPaddingRight()
            int r7 = r10.getWidth()
            int r5 = r10.getChildCount()
            r4 = 0
        L1a:
            if (r4 >= r5) goto L68
            android.view.View r2 = r10.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            X.08o r1 = (X.C021708o) r1
            boolean r0 = r1.A02
            if (r0 == 0) goto L43
            int r0 = r1.A01
            r1 = r0 & 7
            if (r1 == r3) goto L59
            r0 = 3
            if (r1 == r0) goto L53
            r0 = 5
            if (r1 == r0) goto L46
            r0 = r6
        L37:
            int r6 = r6 + r9
            int r1 = r2.getLeft()
            int r6 = r6 - r1
            if (r6 == 0) goto L42
            r2.offsetLeftAndRight(r6)
        L42:
            r6 = r0
        L43:
            int r4 = r4 + 1
            goto L1a
        L46:
            int r1 = r7 - r8
            int r0 = r2.getMeasuredWidth()
            int r1 = r1 - r0
            int r0 = r2.getMeasuredWidth()
            int r8 = r8 + r0
            goto L65
        L53:
            int r0 = r2.getWidth()
            int r0 = r0 + r6
            goto L37
        L59:
            int r0 = r2.getMeasuredWidth()
            int r0 = r7 - r0
            int r0 = r0 / 2
            int r1 = java.lang.Math.max(r0, r6)
        L65:
            r0 = r6
            r6 = r1
            goto L37
        L68:
            X.08q r0 = r10.A09
            if (r0 == 0) goto L6f
            r0.onPageScrolled(r11, r12, r13)
        L6f:
            java.util.List r0 = r10.A0B
            if (r0 == 0) goto L8a
            r2 = 0
            int r1 = r0.size()
        L78:
            if (r2 >= r1) goto L8a
            java.util.List r0 = r10.A0B
            java.lang.Object r0 = r0.get(r2)
            X.08q r0 = (X.InterfaceC021908q) r0
            if (r0 == 0) goto L87
            r0.onPageScrolled(r11, r12, r13)
        L87:
            int r2 = r2 + 1
            goto L78
        L8a:
            r10.A0c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0G(int, float, int):void");
    }

    public void A0H(int i, int i2, boolean z, boolean z2) {
        AbstractC021208i abstractC021208i = this.A08;
        boolean z3 = false;
        if (abstractC021208i == null || abstractC021208i.getCount() <= 0 || (!z2 && this.A02 == i && this.A0h.size() != 0)) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else if (i >= this.A08.getCount()) {
            i = this.A08.getCount() - 1;
        }
        int i3 = this.A0R;
        int i4 = this.A02;
        if (i > i4 + i3 || i < i4 - i3) {
            int i5 = 0;
            while (true) {
                ArrayList arrayList = this.A0h;
                if (i5 >= arrayList.size()) {
                    break;
                }
                ((C021608n) arrayList.get(i5)).A04 = true;
                i5++;
            }
        }
        if (i4 != i) {
            z3 = true;
        }
        if (this.A0d) {
            this.A02 = i;
            if (z3) {
                A02(i);
            }
            requestLayout();
            return;
        }
        A0F(i);
        A04(i, i2, z, z3);
    }

    public void A0J(InterfaceC021908q interfaceC021908q) {
        List list = this.A0B;
        if (list == null) {
            list = new ArrayList();
            this.A0B = list;
        }
        list.add(interfaceC021908q);
    }

    public final boolean A0K() {
        AbstractC021208i abstractC021208i = this.A08;
        if (abstractC021208i != null && this.A02 < abstractC021208i.getCount() - 1) {
            A0I(this.A02 + 1, true);
            return true;
        }
        return false;
    }

    public final boolean A0M(View view, int i, int i2, int i3, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && A0M(childAt, i, i5 - childAt.getLeft(), i4 - childAt.getTop(), true)) {
                    return true;
                }
            }
        }
        if (z && view.canScrollHorizontally(-i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.A08 == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i < 0) {
            if (scrollX <= ((int) (clientWidth * this.A00))) {
                return false;
            }
        } else if (i <= 0 || scrollX >= ((int) (clientWidth * this.A01))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof C021708o) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C021708o();
    }

    public AbstractC021208i getAdapter() {
        return this.A08;
    }

    public int getCurrentItem() {
        return this.A02;
    }

    public int getOffscreenPageLimit() {
        return this.A0R;
    }

    public int getPageMargin() {
        return this.A05;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.A05 > 0 && this.A0W != null) {
            ArrayList arrayList = this.A0h;
            if (arrayList.size() > 0 && this.A08 != null) {
                int scrollX = getScrollX();
                float width = getWidth();
                float f2 = this.A05 / width;
                int i = 0;
                C021608n c021608n = (C021608n) arrayList.get(0);
                float f3 = c021608n.A00;
                int size = arrayList.size();
                int i2 = ((C021608n) arrayList.get(size - 1)).A02;
                for (int i3 = c021608n.A02; i3 < i2; i3++) {
                    while (i3 > c021608n.A02 && i < size) {
                        i++;
                        c021608n = (C021608n) arrayList.get(i);
                    }
                    if (i3 == c021608n.A02) {
                        float f4 = c021608n.A00 + c021608n.A01;
                        f = f4 * width;
                        f3 = f4 + f2;
                    } else {
                        float pageWidth = this.A08.getPageWidth(i3);
                        f = (f3 + pageWidth) * width;
                        f3 += pageWidth + f2;
                    }
                    float f5 = this.A05 + f;
                    if (f5 > scrollX) {
                        this.A0W.setBounds(Math.round(f), this.A0U, Math.round(f5), this.A0K);
                        this.A0W.draw(canvas);
                    }
                    if (f > scrollX + r9) {
                        return;
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.A0C) {
                    return true;
                }
                if (this.A0E) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        A05(motionEvent);
                    }
                } else {
                    int i = this.A0J;
                    if (i != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i);
                        float x = motionEvent.getX(findPointerIndex);
                        float f2 = x - this.A0H;
                        float abs = Math.abs(f2);
                        float y = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y - this.A0G);
                        if (f2 != 0.0f) {
                            float f3 = this.A0H;
                            if ((f3 >= this.mGutterSize || f2 <= 0.0f) && ((f3 <= getWidth() - this.mGutterSize || f2 >= 0.0f) && A0M(this, (int) f2, (int) x, (int) y, false))) {
                                this.A0H = x;
                                this.A0I = y;
                                this.A0E = true;
                                return false;
                            }
                        }
                        float f4 = this.A0V;
                        if (abs > f4 && abs * 0.5f > abs2) {
                            this.A0C = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            setScrollState(1);
                            float f5 = this.A0F;
                            float f6 = this.A0V;
                            if (f2 > 0.0f) {
                                f = f5 + f6;
                            } else {
                                f = f5 - f6;
                            }
                            this.A0H = f;
                            this.A0I = y;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > f4) {
                            this.A0E = true;
                        }
                        if (this.A0C && A08(x)) {
                            postInvalidateOnAnimation();
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                this.A0F = x2;
                this.A0H = x2;
                float y2 = motionEvent.getY();
                this.A0G = y2;
                this.A0I = y2;
                this.A0J = motionEvent.getPointerId(0);
                this.A0E = false;
                this.A0D = true;
                this.A07.computeScrollOffset();
                if (this.A0T == 2 && Math.abs(this.A07.getFinalX() - this.A07.getCurrX()) > this.A0M) {
                    this.A07.abortAnimation();
                    this.A0f = false;
                    A0F(this.A02);
                    this.A0C = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                } else {
                    A06(false);
                    this.A0C = false;
                }
            }
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker == null) {
                velocityTracker = VelocityTracker.obtain();
                this.A06 = velocityTracker;
            }
            velocityTracker.addMovement(motionEvent);
            return this.A0C;
        }
        A07();
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(((AbsSavedState) savedState).A00);
        AbstractC021208i abstractC021208i = this.A08;
        if (abstractC021208i != null) {
            abstractC021208i.restoreState(savedState.A01, savedState.A02);
            A0H(savedState.A00, 0, false, true);
        } else {
            this.A0S = savedState.A00;
            this.A0X = savedState.A01;
            this.A0b = savedState.A02;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.A0e) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [X.08s] */
    public void setAdapter(AbstractC021208i abstractC021208i) {
        ArrayList arrayList;
        AbstractC021208i abstractC021208i2 = this.A08;
        if (abstractC021208i2 != null) {
            abstractC021208i2.setViewPagerObserver(null);
            this.A08.startUpdate((ViewGroup) this);
            int i = 0;
            while (true) {
                arrayList = this.A0h;
                if (i >= arrayList.size()) {
                    break;
                }
                C021608n c021608n = (C021608n) arrayList.get(i);
                this.A08.destroyItem((ViewGroup) this, c021608n.A02, c021608n.A03);
                i++;
            }
            this.A08.finishUpdate((ViewGroup) this);
            arrayList.clear();
            int i2 = 0;
            while (i2 < getChildCount()) {
                if (!((C021708o) getChildAt(i2).getLayoutParams()).A02) {
                    removeViewAt(i2);
                    i2--;
                }
                i2++;
            }
            this.A02 = 0;
            scrollTo(0, 0);
        }
        AbstractC021208i abstractC021208i3 = this.A08;
        this.A08 = abstractC021208i;
        this.A0P = 0;
        if (abstractC021208i != null) {
            C022108s c022108s = this.A0a;
            C022108s c022108s2 = c022108s;
            if (c022108s == null) {
                ?? r1 = new DataSetObserver() { // from class: X.08s
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        ViewPager.this.A0D();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        ViewPager.this.A0D();
                    }
                };
                this.A0a = r1;
                c022108s2 = r1;
            }
            this.A08.setViewPagerObserver(c022108s2);
            this.A0f = false;
            boolean z = this.A0d;
            this.A0d = true;
            this.A0P = this.A08.getCount();
            if (this.A0S >= 0) {
                this.A08.restoreState(this.A0X, this.A0b);
                A0H(this.A0S, 0, false, true);
                this.A0S = -1;
                this.A0X = null;
                this.A0b = null;
            } else if (!z) {
                A0F(this.A02);
            } else {
                requestLayout();
            }
        }
        List list = this.A0A;
        if (list != null && !list.isEmpty()) {
            int size = this.A0A.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((InterfaceC021808p) this.A0A.get(i3)).CvH(abstractC021208i3, abstractC021208i, this);
            }
        }
    }

    @Deprecated
    public void setOnPageChangeListener(InterfaceC021908q interfaceC021908q) {
        this.A09 = interfaceC021908q;
    }

    public void setPageMargin(int i) {
        int i2 = this.A05;
        this.A05 = i;
        int width = getWidth();
        A03(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        boolean z;
        this.A0W = drawable;
        if (drawable != null) {
            refreshDrawableState();
            z = false;
        } else {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.A0T != i) {
            this.A0T = i;
            InterfaceC021908q interfaceC021908q = this.A09;
            if (interfaceC021908q != null) {
                interfaceC021908q.onPageScrollStateChanged(i);
            }
            List list = this.A0B;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    InterfaceC021908q interfaceC021908q2 = (InterfaceC021908q) this.A0B.get(i2);
                    if (interfaceC021908q2 != null) {
                        interfaceC021908q2.onPageScrollStateChanged(i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.08n] */
    public ViewPager(Context context) {
        super(context);
        this.A0h = new ArrayList();
        this.A0j = new Object();
        this.A0i = new Rect();
        this.A0S = -1;
        this.A0X = null;
        this.A0b = null;
        this.A00 = -3.4028235E38f;
        this.A01 = Float.MAX_VALUE;
        this.A0R = 1;
        this.A0J = -1;
        this.A0d = true;
        this.A0k = new Runnable() { // from class: X.08l
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager viewPager = ViewPager.this;
                viewPager.setScrollState(0);
                viewPager.A0F(viewPager.A02);
            }
        };
        this.A0T = 0;
        A0E();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0062, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private X.C021608n A01() {
        /*
            r12 = this;
            int r1 = r12.getClientWidth()
            r9 = 0
            if (r1 <= 0) goto L5f
            int r0 = r12.getScrollX()
            float r7 = (float) r0
            float r1 = (float) r1
            float r7 = r7 / r1
            int r0 = r12.A05
            float r6 = (float) r0
            float r6 = r6 / r1
        L12:
            r11 = 0
            r10 = 1
            r2 = 0
            r1 = -1
            r5 = 0
            r8 = 1
        L18:
            java.util.ArrayList r4 = r12.A0h
            int r0 = r4.size()
            if (r5 >= r0) goto L63
            java.lang.Object r3 = r4.get(r5)
            X.08n r3 = (X.C021608n) r3
            if (r8 != 0) goto L40
            int r0 = r3.A02
            int r1 = r1 + 1
            if (r0 == r1) goto L40
            X.08n r3 = r12.A0j
            float r9 = r9 + r2
            float r9 = r9 + r6
            r3.A00 = r9
            r3.A02 = r1
            X.08i r0 = r12.A08
            float r0 = r0.getPageWidth(r1)
            r3.A01 = r0
            int r5 = r5 + (-1)
        L40:
            float r9 = r3.A00
            float r2 = r3.A01
            float r1 = r2 + r9
            float r1 = r1 + r6
            if (r8 != 0) goto L4d
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L63
        L4d:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L62
            int r0 = r4.size()
            int r0 = r0 - r10
            if (r5 == r0) goto L62
            int r1 = r3.A02
            int r5 = r5 + 1
            r11 = r3
            r8 = 0
            goto L18
        L5f:
            r7 = 0
            r6 = 0
            goto L12
        L62:
            return r3
        L63:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A01():X.08n");
    }

    private void A04(int i, int i2, boolean z, boolean z2) {
        int i3;
        int scrollX;
        int pageWidth;
        C021608n A0A = A0A(i);
        if (A0A != null) {
            i3 = (int) (getClientWidth() * Math.max(this.A00, Math.min(A0A.A00, this.A01)));
        } else {
            i3 = 0;
        }
        if (z) {
            if (getChildCount() == 0) {
                setScrollingCacheEnabled(false);
            } else {
                Scroller scroller = this.A07;
                if (scroller != null && !scroller.isFinished()) {
                    boolean z3 = this.A0D;
                    Scroller scroller2 = this.A07;
                    if (z3) {
                        scrollX = scroller2.getCurrX();
                    } else {
                        scrollX = scroller2.getStartX();
                    }
                    this.A07.abortAnimation();
                    setScrollingCacheEnabled(false);
                } else {
                    scrollX = getScrollX();
                }
                int scrollY = getScrollY();
                int i4 = i3 - scrollX;
                int i5 = -scrollY;
                if (i4 == 0 && i5 == 0) {
                    A06(false);
                    A0F(this.A02);
                    setScrollState(0);
                } else {
                    setScrollingCacheEnabled(true);
                    setScrollState(2);
                    int clientWidth = getClientWidth();
                    float abs = Math.abs(i4);
                    float f = clientWidth;
                    float f2 = clientWidth / 2;
                    float sin = f2 + (((float) Math.sin((Math.min(1.0f, (abs * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2);
                    int abs2 = Math.abs(i2);
                    if (abs2 > 0) {
                        pageWidth = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                    } else {
                        pageWidth = (int) (((abs / ((f * this.A08.getPageWidth(this.A02)) + this.A05)) + 1.0f) * 100.0f);
                    }
                    int min = Math.min(pageWidth, 600);
                    this.A0D = false;
                    this.A07.startScroll(scrollX, scrollY, i4, i5, min);
                    postInvalidateOnAnimation();
                }
            }
            if (z2) {
                A02(i);
                return;
            }
            return;
        }
        if (z2) {
            A02(i);
        }
        A06(false);
        scrollTo(i3, 0);
        A09(i3);
    }

    private void A05(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.A0J) {
            int i = 0;
            if (actionIndex == 0) {
                i = 1;
            }
            this.A0H = motionEvent.getX(i);
            this.A0J = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.A06;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
    
        if (r1 >= r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a0, code lost:
    
        if (r1 <= r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00af, code lost:
    
        if (r8 != 2) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L(int r8) {
        /*
            r7 = this;
            android.view.View r5 = r7.findFocus()
            r3 = 1
            r4 = 0
            r6 = 0
            if (r5 == r7) goto L56
            if (r5 == 0) goto L57
            android.view.ViewParent r1 = r5.getParent()
        Lf:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            if (r1 == r7) goto L57
            android.view.ViewParent r1 = r1.getParent()
            goto Lf
        L1a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r0 = r5.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r5.getParent()
        L2e:
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L47
            java.lang.String r0 = " => "
            r2.append(r0)
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r2.append(r0)
            android.view.ViewParent r1 = r1.getParent()
            goto L2e
        L47:
            java.lang.String r1 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = X.AnonymousClass001.A0R(r1, r0)
            java.lang.String r0 = "ViewPager"
            android.util.Log.e(r0, r1)
        L56:
            r5 = r6
        L57:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r7, r5, r8)
            r1 = 66
            r0 = 17
            if (r6 == 0) goto La8
            if (r6 == r5) goto La8
            if (r8 != r0) goto L8e
            android.graphics.Rect r2 = r7.A0i
            android.graphics.Rect r0 = r7.A00(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A00(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto La3
            if (r1 < r0) goto La3
        L7b:
            int r0 = r7.A02
            if (r0 <= 0) goto L84
            r4 = 1
            int r0 = r0 - r3
            r7.A0I(r0, r3)
        L84:
            if (r4 == 0) goto L8d
            int r0 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r0)
        L8d:
            return r4
        L8e:
            if (r8 != r1) goto L8d
            android.graphics.Rect r2 = r7.A0i
            android.graphics.Rect r0 = r7.A00(r2, r6)
            int r1 = r0.left
            android.graphics.Rect r0 = r7.A00(r2, r5)
            int r0 = r0.left
            if (r5 == 0) goto La3
            if (r1 > r0) goto La3
            goto Lb1
        La3:
            boolean r4 = r6.requestFocus()
            goto L84
        La8:
            if (r8 == r0) goto L7b
            if (r8 == r3) goto L7b
            if (r8 == r1) goto Lb1
            r0 = 2
            if (r8 != r0) goto L8d
        Lb1:
            boolean r4 = r7.A0K()
            goto L84
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.A0L(int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        C021608n A0C;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (A0C = A0C(childAt)) != null && A0C.A02 == this.A02) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
            if (descendantFocusability == 262144 && size != arrayList.size()) {
                return;
            }
        }
        if (isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = new C021708o();
        }
        C021708o c021708o = (C021708o) layoutParams;
        boolean z = c021708o.A02;
        boolean z2 = false;
        if (view.getClass().getAnnotation(DecorView.class) != null) {
            z2 = true;
        }
        boolean z3 = z | z2;
        c021708o.A02 = z3;
        if (this.A0e) {
            if (!z3) {
                c021708o.A03 = true;
                addViewInLayout(view, i, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r4) {
        /*
            r3 = this;
            boolean r0 = super.dispatchKeyEvent(r4)
            if (r0 != 0) goto L30
            int r0 = r4.getAction()
            if (r0 != 0) goto L53
            int r2 = r4.getKeyCode()
            r0 = 21
            r1 = 2
            if (r2 == r0) goto L40
            r0 = 22
            if (r2 == r0) goto L32
            r0 = 61
            if (r2 != r0) goto L53
            boolean r0 = r4.hasNoModifiers()
            if (r0 != 0) goto L2a
            r1 = 1
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L53
        L2a:
            boolean r0 = r3.A0L(r1)
        L2e:
            if (r0 == 0) goto L53
        L30:
            r0 = 1
            return r0
        L32:
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L3d
            boolean r0 = r3.A0K()
            goto L2e
        L3d:
            r1 = 66
            goto L2a
        L40:
            boolean r0 = r4.hasModifiers(r1)
            if (r0 == 0) goto L50
            int r1 = r3.A02
            if (r1 <= 0) goto L53
            r0 = 1
            int r1 = r1 - r0
            r3.A0I(r1, r0)
            goto L30
        L50:
            r1 = 17
            goto L2a
        L53:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C021608n A0C;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (A0C = A0C(childAt)) != null && A0C.A02 == this.A02 && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        AbstractC021208i abstractC021208i;
        int A03 = C0f9.A03(-633887212);
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (abstractC021208i = this.A08) != null && abstractC021208i.getCount() > 1)) {
            if (!this.A0Y.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.A00 * width);
                this.A0Y.setSize(height, width);
                z = false | this.A0Y.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.A0Z.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.A01 + 1.0f)) * width2);
                this.A0Z.setSize(height2, width2);
                z |= this.A0Z.draw(canvas);
                canvas.restoreToCount(save2);
            }
            if (z) {
                postInvalidateOnAnimation();
            }
        } else {
            this.A0Y.finish();
            this.A0Z.finish();
        }
        C0f9.A0A(-1861943805, A03);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.A0W;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, X.08o] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.A00 = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A0l);
        layoutParams.A01 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw new NullPointerException("get");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(-782663130);
        super.onAttachedToWindow();
        this.A0d = true;
        C0f9.A0D(-1814596170, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = C0f9.A06(1408290646);
        removeCallbacks(this.A0k);
        Scroller scroller = this.A07;
        if (scroller != null && !scroller.isFinished()) {
            this.A07.abortAnimation();
        }
        super.onDetachedFromWindow();
        C0f9.A0D(753494652, A06);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        C021608n A0C;
        int childCount = getChildCount();
        int i2 = -1;
        int i3 = childCount - 1;
        int i4 = -1;
        if ((i & 2) != 0) {
            i2 = childCount;
            i3 = 0;
            i4 = 1;
        }
        while (i3 != i2) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (A0C = A0C(childAt)) != null && A0C.A02 == this.A02 && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i4;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.viewpager.widget.ViewPager$SavedState, android.os.Parcelable, androidx.customview.view.AbsSavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A02;
        AbstractC021208i abstractC021208i = this.A08;
        if (abstractC021208i != null) {
            absSavedState.A01 = abstractC021208i.saveState();
        }
        return absSavedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = C0f9.A06(-2075028882);
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.A05;
            A03(i, i3, i5, i5);
        }
        C0f9.A0D(-1549034334, A06);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        boolean z;
        float f;
        int A05 = C0f9.A05(-649692108);
        int i2 = 0;
        if (motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) {
            i = -961796525;
        } else {
            AbstractC021208i abstractC021208i = this.A08;
            if (abstractC021208i != null && abstractC021208i.getCount() != 0) {
                VelocityTracker velocityTracker = this.A06;
                if (velocityTracker == null) {
                    velocityTracker = VelocityTracker.obtain();
                    this.A06 = velocityTracker;
                }
                velocityTracker.addMovement(motionEvent);
                int action = motionEvent.getAction() & 255;
                if (action != 0) {
                    if (action != 1) {
                        if (action != 2) {
                            if (action != 3) {
                                if (action != 5) {
                                    if (action == 6) {
                                        A05(motionEvent);
                                        this.A0H = motionEvent.getX(motionEvent.findPointerIndex(this.A0J));
                                    }
                                } else {
                                    i2 = motionEvent.getActionIndex();
                                    this.A0H = motionEvent.getX(i2);
                                }
                            } else if (this.A0C) {
                                A04(this.A02, 0, true, false);
                                z = A07();
                            }
                            C0f9.A0C(-878972735, A05);
                            return true;
                        }
                        if (!this.A0C) {
                            int findPointerIndex = motionEvent.findPointerIndex(this.A0J);
                            if (findPointerIndex != -1) {
                                float x = motionEvent.getX(findPointerIndex);
                                float abs = Math.abs(x - this.A0H);
                                float y = motionEvent.getY(findPointerIndex);
                                float abs2 = Math.abs(y - this.A0I);
                                if (abs > this.A0V && abs > abs2) {
                                    this.A0C = true;
                                    ViewParent parent = getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    float f2 = this.A0F;
                                    float f3 = x - f2;
                                    float f4 = this.A0V;
                                    if (f3 > 0.0f) {
                                        f = f2 + f4;
                                    } else {
                                        f = f2 - f4;
                                    }
                                    this.A0H = f;
                                    this.A0I = y;
                                    setScrollState(1);
                                    setScrollingCacheEnabled(true);
                                    ViewParent parent2 = getParent();
                                    if (parent2 != null) {
                                        parent2.requestDisallowInterceptTouchEvent(true);
                                    }
                                }
                            }
                            z = A07();
                        }
                        if (this.A0C) {
                            z = A08(motionEvent.getX(motionEvent.findPointerIndex(this.A0J)));
                        }
                        C0f9.A0C(-878972735, A05);
                        return true;
                    }
                    if (this.A0C) {
                        VelocityTracker velocityTracker2 = this.A06;
                        velocityTracker2.computeCurrentVelocity(1000, this.A0Q);
                        int xVelocity = (int) velocityTracker2.getXVelocity(this.A0J);
                        this.A0f = true;
                        int clientWidth = getClientWidth();
                        int scrollX = getScrollX();
                        C021608n A01 = A01();
                        float f5 = clientWidth;
                        int i3 = A01.A02;
                        float f6 = ((scrollX / f5) - A01.A00) / (A01.A01 + (this.A05 / f5));
                        if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.A0J)) - this.A0F)) > this.A03 && Math.abs(xVelocity) > this.A04) {
                            if (xVelocity <= 0) {
                                i3++;
                            }
                        } else {
                            float f7 = 0.6f;
                            if (i3 >= this.A02) {
                                f7 = 0.4f;
                            }
                            i3 += (int) (f6 + f7);
                        }
                        ArrayList arrayList = this.A0h;
                        if (arrayList.size() > 0) {
                            i3 = Math.max(((C021608n) arrayList.get(0)).A02, Math.min(i3, ((C021608n) arrayList.get(arrayList.size() - 1)).A02));
                        }
                        A0H(i3, xVelocity, true, true);
                        z = A07();
                    }
                    C0f9.A0C(-878972735, A05);
                    return true;
                    if (z) {
                        postInvalidateOnAnimation();
                    }
                    C0f9.A0C(-878972735, A05);
                    return true;
                }
                this.A07.abortAnimation();
                this.A0f = false;
                A0F(this.A02);
                float x2 = motionEvent.getX();
                this.A0F = x2;
                this.A0H = x2;
                float y2 = motionEvent.getY();
                this.A0G = y2;
                this.A0I = y2;
                this.A0J = motionEvent.getPointerId(i2);
                C0f9.A0C(-878972735, A05);
                return true;
            }
            i = -576202369;
        }
        C0f9.A0C(i, A05);
        return false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.A0W) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, X.08n] */
    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0h = new ArrayList();
        this.A0j = new Object();
        this.A0i = new Rect();
        this.A0S = -1;
        this.A0X = null;
        this.A0b = null;
        this.A00 = -3.4028235E38f;
        this.A01 = Float.MAX_VALUE;
        this.A0R = 1;
        this.A0J = -1;
        this.A0d = true;
        this.A0k = new Runnable() { // from class: X.08l
            @Override // java.lang.Runnable
            public final void run() {
                ViewPager viewPager = ViewPager.this;
                viewPager.setScrollState(0);
                viewPager.A0F(viewPager.A02);
            }
        };
        this.A0T = 0;
        A0E();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C021708o();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }
}
