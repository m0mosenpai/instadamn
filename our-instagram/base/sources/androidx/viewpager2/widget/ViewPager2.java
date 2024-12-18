package androidx.viewpager2.widget;

import X.AbstractC010103p;
import X.AbstractC167007dF;
import X.AbstractC31173DnH;
import X.AbstractC31175DnJ;
import X.AbstractC65392xb;
import X.AbstractC65852TvD;
import X.AbstractC65856TvI;
import X.AbstractC65952Twx;
import X.AbstractC70663Fe;
import X.AnonymousClass001;
import X.C003501a;
import X.C2UU;
import X.C3F1;
import X.C43741JWa;
import X.C43748JWj;
import X.C61792rg;
import X.C65836Tux;
import X.C65837Tuy;
import X.C65838Tuz;
import X.C65839Tv0;
import X.C65840Tv1;
import X.C65841Tv2;
import X.C65842Tv3;
import X.C65843Tv4;
import X.C65844Tv5;
import X.C65845Tv6;
import X.C65861TvO;
import X.C65884Tvo;
import X.C69044Vgl;
import X.C70295WQa;
import X.InterfaceC71882X8p;
import X.MSZ;
import X.RunnableC71229WqK;
import X.RunnableC71397WtL;
import X.X7B;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.dextricks.Constants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class ViewPager2 extends ViewGroup {
    public int A00;
    public int A01;
    public LinearLayoutManager A02;
    public AbstractC65392xb A03;
    public RecyclerView A04;
    public C65836Tux A05;
    public C43741JWa A06;
    public C65845Tv6 A07;
    public C65842Tv3 A08;
    public C65838Tuz A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public Parcelable A0D;
    public C3F1 A0E;
    public C65836Tux A0F;
    public boolean A0G;
    public final Rect A0H;
    public final Rect A0I;
    public C61792rg mPagerSnapHelper;

    public void setCurrentItem(int i) {
        A03(i, true);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1 && i != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.A01 = i;
        this.A04.requestLayout();
    }

    public void setPageTransformer(InterfaceC71882X8p interfaceC71882X8p) {
        boolean z = this.A0G;
        if (interfaceC71882X8p != null) {
            if (!z) {
                this.A0E = this.A04.A0C;
                this.A0G = true;
            }
            this.A04.setItemAnimator(null);
        } else if (z) {
            this.A04.setItemAnimator(this.A0E);
            this.A0E = null;
            this.A0G = false;
        }
        C65845Tv6 c65845Tv6 = this.A07;
        if (interfaceC71882X8p != c65845Tv6.A00) {
            c65845Tv6.A00 = interfaceC71882X8p;
            if (interfaceC71882X8p != null) {
                C65842Tv3 c65842Tv3 = this.A08;
                C65842Tv3.A01(c65842Tv3);
                C69044Vgl c69044Vgl = c65842Tv3.A04;
                double d = c69044Vgl.A02 + c69044Vgl.A00;
                int i = (int) d;
                float f = (float) (d - i);
                this.A07.A02(i, f, Math.round(getPageSize() * f));
            }
        }
    }

    /* loaded from: classes11.dex */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(4);
        public int A00;
        public int A01;
        public Parcelable A02;

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A00);
            parcel.writeParcelable(this.A02, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A00() {
        C2UU c2uu;
        if (this.A0C != -1 && (c2uu = this.A04.A0A) != 0) {
            Parcelable parcelable = this.A0D;
            if (parcelable != null) {
                if (c2uu instanceof X7B) {
                    AbstractC65952Twx abstractC65952Twx = (AbstractC65952Twx) ((X7B) c2uu);
                    C003501a c003501a = abstractC65952Twx.A06;
                    if (c003501a.A00() == 0) {
                        C003501a c003501a2 = abstractC65952Twx.A04;
                        if (c003501a2.A00() == 0) {
                            Bundle bundle = (Bundle) parcelable;
                            if (bundle.getClassLoader() == null) {
                                bundle.setClassLoader(abstractC65952Twx.getClass().getClassLoader());
                            }
                            for (String str : bundle.keySet()) {
                                if (str.startsWith("f#")) {
                                    int length = str.length();
                                    int length2 = "f#".length();
                                    if (length > length2) {
                                        c003501a2.A09(Long.parseLong(str.substring(length2)), abstractC65952Twx.A07.A0P(bundle, str));
                                    }
                                }
                                if (str.startsWith("s#")) {
                                    int length3 = str.length();
                                    int length4 = "s#".length();
                                    if (length3 > length4) {
                                        long parseLong = Long.parseLong(str.substring(length4));
                                        Parcelable parcelable2 = bundle.getParcelable(str);
                                        if (abstractC65952Twx.A06(parseLong)) {
                                            c003501a.A09(parseLong, parcelable2);
                                        }
                                    }
                                }
                                throw AbstractC167007dF.A0c("Unexpected key in savedState: ", str);
                            }
                            if (c003501a2.A00() != 0) {
                                abstractC65952Twx.A01 = true;
                                abstractC65952Twx.A02 = true;
                                abstractC65952Twx.A04();
                                Handler A0J = AbstractC167007dF.A0J();
                                RunnableC71229WqK runnableC71229WqK = new RunnableC71229WqK(abstractC65952Twx);
                                abstractC65952Twx.A08.A09(new C70295WQa(A0J, abstractC65952Twx, runnableC71229WqK));
                                A0J.postDelayed(runnableC71229WqK, 10000L);
                            }
                        }
                    }
                    throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
                }
                this.A0D = null;
            }
            int max = Math.max(0, Math.min(this.A0C, c2uu.getItemCount() - 1));
            this.A00 = max;
            this.A0C = -1;
            this.A04.A0n(max);
            this.A09.A00();
        }
    }

    private void A01(Context context, AttributeSet attributeSet) {
        this.A09 = new C65838Tuz(this);
        C65839Tv0 c65839Tv0 = new C65839Tv0(context, this);
        this.A04 = c65839Tv0;
        c65839Tv0.setId(View.generateViewId());
        this.A04.setDescendantFocusability(Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP);
        C65840Tv1 c65840Tv1 = new C65840Tv1(context, this);
        this.A02 = c65840Tv1;
        this.A04.setLayoutManager(c65840Tv1);
        this.A04.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        MSZ.A13(this.A04);
        RecyclerView recyclerView = this.A04;
        C65841Tv2 c65841Tv2 = new C65841Tv2(this);
        List list = recyclerView.A0L;
        if (list == null) {
            list = new ArrayList();
            recyclerView.A0L = list;
        }
        list.add(c65841Tv2);
        C65842Tv3 c65842Tv3 = new C65842Tv3(this);
        this.A08 = c65842Tv3;
        RecyclerView recyclerView2 = this.A04;
        this.A06 = new C43741JWa(recyclerView2, c65842Tv3, this);
        C65843Tv4 c65843Tv4 = new C65843Tv4(this);
        this.mPagerSnapHelper = c65843Tv4;
        c65843Tv4.A07(recyclerView2);
        this.A04.A14(this.A08);
        C65836Tux c65836Tux = new C65836Tux();
        this.A0F = c65836Tux;
        this.A08.A05 = c65836Tux;
        C43748JWj c43748JWj = new C43748JWj(this, 1);
        C65861TvO c65861TvO = new C65861TvO(this, 0);
        c65836Tux.A00.add(c43748JWj);
        this.A0F.A00.add(c65861TvO);
        C65838Tuz c65838Tuz = this.A09;
        this.A04.setImportantForAccessibility(2);
        c65838Tuz.A00 = new C65844Tv5(c65838Tuz);
        ViewPager2 viewPager2 = c65838Tuz.A04;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
        C65836Tux c65836Tux2 = this.A0F;
        c65836Tux2.A00.add(this.A05);
        C65845Tv6 c65845Tv6 = new C65845Tv6(this.A02);
        this.A07 = c65845Tv6;
        this.A0F.A00.add(c65845Tv6);
        RecyclerView recyclerView3 = this.A04;
        attachViewToParent(recyclerView3, 0, recyclerView3.getLayoutParams());
    }

    public final void A02() {
        C61792rg c61792rg = this.mPagerSnapHelper;
        if (c61792rg != null) {
            View A03 = c61792rg.A03(this.A02);
            if (A03 != null) {
                int A0C = AbstractC70663Fe.A0C(A03);
                if (A0C != this.A00 && this.A08.A02 == 0) {
                    this.A0F.A01(A0C);
                }
                this.A0A = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void A03(int i, boolean z) {
        if (!this.A06.A06.A07) {
            A04(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public final void A04(int i, boolean z) {
        AbstractC65852TvD abstractC65852TvD;
        C2UU c2uu = this.A04.A0A;
        if (c2uu == null) {
            if (this.A0C != -1) {
                this.A0C = Math.max(i, 0);
                return;
            }
            return;
        }
        if (c2uu.getItemCount() <= 0) {
            return;
        }
        int min = Math.min(Math.max(i, 0), c2uu.getItemCount() - 1);
        int i2 = this.A00;
        if (min == i2 && this.A08.A02 == 0) {
            return;
        }
        if (min == i2 && z) {
            return;
        }
        double d = i2;
        this.A00 = min;
        this.A09.A00();
        C65842Tv3 c65842Tv3 = this.A08;
        if (c65842Tv3.A02 != 0) {
            C65842Tv3.A01(c65842Tv3);
            C69044Vgl c69044Vgl = c65842Tv3.A04;
            d = c69044Vgl.A02 + c69044Vgl.A00;
        }
        C65842Tv3 c65842Tv32 = this.A08;
        int i3 = 3;
        if (z) {
            i3 = 2;
        }
        c65842Tv32.A00 = i3;
        boolean z2 = false;
        c65842Tv32.A07 = false;
        if (c65842Tv32.A03 != min) {
            z2 = true;
        }
        c65842Tv32.A03 = min;
        C65842Tv3.A02(c65842Tv32, 2);
        if (z2 && (abstractC65852TvD = c65842Tv32.A05) != null) {
            abstractC65852TvD.A01(min);
        }
        if (!z) {
            this.A04.A0n(min);
            return;
        }
        double d2 = min;
        double abs = Math.abs(d2 - d);
        RecyclerView recyclerView = this.A04;
        if (abs > 3.0d) {
            int i4 = min + 3;
            if (d2 > d) {
                i4 = min - 3;
            }
            recyclerView.A0n(i4);
            RecyclerView recyclerView2 = this.A04;
            recyclerView2.post(new RunnableC71397WtL(recyclerView2, min));
            return;
        }
        recyclerView.A0o(min);
    }

    public final void A05(AbstractC65852TvD abstractC65852TvD) {
        this.A05.A00.add(abstractC65852TvD);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.A04.canScrollHorizontally(i);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.A04.canScrollVertically(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public C2UU getAdapter() {
        return this.A04.A0A;
    }

    public int getCurrentItem() {
        return this.A00;
    }

    public int getItemDecorationCount() {
        return this.A04.A12.size();
    }

    public int getOffscreenPageLimit() {
        return this.A01;
    }

    public int getOrientation() {
        if (this.A02.A01 == 1) {
            return 1;
        }
        return 0;
    }

    public int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.A04;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.A08.A02;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        Rect rect = this.A0I;
        rect.left = getPaddingLeft();
        rect.right = (i3 - i) - getPaddingRight();
        rect.top = getPaddingTop();
        rect.bottom = (i4 - i2) - getPaddingBottom();
        Rect rect2 = this.A0H;
        Gravity.apply(8388659, measuredWidth, measuredHeight, rect, rect2);
        this.A04.layout(rect2.left, rect2.top, rect2.right, rect2.bottom);
        if (this.A0A) {
            A02();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        measureChild(this.A04, i, i2);
        int measuredWidth = this.A04.getMeasuredWidth();
        int measuredHeight = this.A04.getMeasuredHeight();
        int measuredState = this.A04.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.A0C = savedState.A00;
        this.A0D = savedState.A02;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        C65838Tuz c65838Tuz = this.A09;
        if (i != 8192 && i != 4096) {
            return super.performAccessibilityAction(i, bundle);
        }
        ViewPager2 viewPager2 = c65838Tuz.A04;
        int i2 = viewPager2.A00;
        int i3 = i2 + 1;
        if (i == 8192) {
            i3 = i2 - 1;
        }
        if (viewPager2.A0B) {
            viewPager2.A04(i3, true);
            return true;
        }
        return true;
    }

    public void setAdapter(C2UU c2uu) {
        C2UU c2uu2 = this.A04.A0A;
        C65838Tuz c65838Tuz = this.A09;
        if (c2uu2 != null) {
            c2uu2.unregisterAdapterDataObserver(c65838Tuz.A00);
            c2uu2.unregisterAdapterDataObserver(this.A03);
        }
        this.A04.setAdapter(c2uu);
        this.A00 = 0;
        A00();
        C65838Tuz c65838Tuz2 = this.A09;
        c65838Tuz2.A00();
        if (c2uu != null) {
            c2uu.registerAdapterDataObserver(c65838Tuz2.A00);
            c2uu.registerAdapterDataObserver(this.A03);
        }
    }

    public void setOrientation(int i) {
        this.A02.A1o(i);
        this.A09.A00();
    }

    public void setUserInputEnabled(boolean z) {
        this.A0B = z;
        this.A09.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0I = new Rect();
        this.A0H = new Rect();
        this.A05 = new C65836Tux();
        this.A0A = false;
        this.A03 = new C65837Tuy(this);
        this.A0C = -1;
        this.A0E = null;
        this.A0G = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        Parcelable parcelable = (Parcelable) sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).A01;
            sparseArray.put(this.A04.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        A00();
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int itemCount;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ViewPager2 viewPager2 = this.A09.A04;
        C2UU c2uu = viewPager2.A04.A0A;
        int i2 = 1;
        if (c2uu != null) {
            int orientation = viewPager2.getOrientation();
            i = c2uu.getItemCount();
            if (orientation == 1) {
                i2 = i;
                i = 1;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i2, i, false, 0));
        C2UU c2uu2 = viewPager2.A04.A0A;
        if (c2uu2 != null && (itemCount = c2uu2.getItemCount()) != 0 && viewPager2.A0B) {
            if (viewPager2.A00 > 0) {
                accessibilityNodeInfo.addAction(8192);
            }
            if (viewPager2.A00 < itemCount - 1) {
                accessibilityNodeInfo.addAction(4096);
            }
            accessibilityNodeInfo.setScrollable(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.0h2] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.viewpager2.widget.ViewPager2$SavedState] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? baseSavedState = new View.BaseSavedState(super.onSaveInstanceState());
        baseSavedState.A01 = this.A04.getId();
        int i = this.A0C;
        if (i == -1) {
            i = this.A00;
        }
        baseSavedState.A00 = i;
        ?? r5 = this.A0D;
        if (r5 == 0) {
            Object obj = this.A04.A0A;
            if (obj instanceof X7B) {
                AbstractC65952Twx abstractC65952Twx = (AbstractC65952Twx) ((X7B) obj);
                C003501a c003501a = abstractC65952Twx.A04;
                int A00 = c003501a.A00();
                C003501a c003501a2 = abstractC65952Twx.A06;
                r5 = new Bundle(A00 + c003501a2.A00());
                for (int i2 = 0; i2 < c003501a.A00(); i2++) {
                    long A02 = c003501a.A02(i2);
                    Fragment fragment = (Fragment) c003501a.A05(A02);
                    if (fragment != null && fragment.isAdded()) {
                        abstractC65952Twx.A07.A0f(r5, fragment, AnonymousClass001.A0Q("f#", A02));
                    }
                }
                for (int i3 = 0; i3 < c003501a2.A00(); i3++) {
                    long A022 = c003501a2.A02(i3);
                    if (abstractC65952Twx.A06(A022)) {
                        r5.putParcelable(AnonymousClass001.A0Q("s#", A022), (Parcelable) c003501a2.A05(A022));
                    }
                }
            }
            return baseSavedState;
        }
        baseSavedState.A02 = r5;
        return baseSavedState;
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        throw AbstractC31175DnJ.A0V(AbstractC31173DnH.A0q(this), " does not support direct child views");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.A09.A00();
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.A0I = new Rect();
        this.A0H = new Rect();
        this.A05 = new C65836Tux();
        this.A0A = false;
        this.A03 = new C65837Tuy(this);
        this.A0C = -1;
        this.A0E = null;
        this.A0G = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = AbstractC65856TvI.A00;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        AbstractC010103p.A06(context, obtainStyledAttributes, attributeSet, this, iArr, 0, 0);
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0I = new Rect();
        this.A0H = new Rect();
        this.A05 = new C65836Tux();
        this.A0A = false;
        this.A03 = new C65837Tuy(this);
        this.A0C = -1;
        this.A0E = null;
        this.A0G = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, attributeSet);
    }

    public ViewPager2(Context context) {
        super(context);
        this.A0I = new Rect();
        this.A0H = new Rect();
        this.A05 = new C65836Tux();
        this.A0A = false;
        this.A03 = new C65837Tuy(this);
        this.A0C = -1;
        this.A0E = null;
        this.A0G = false;
        this.A0B = true;
        this.A01 = -1;
        A01(context, null);
    }
}
