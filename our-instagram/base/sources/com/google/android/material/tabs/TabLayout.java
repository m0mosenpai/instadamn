package com.google.android.material.tabs;

import X.ANP;
import X.AbstractC021208i;
import X.AbstractC126235nK;
import X.AbstractC153306uz;
import X.AbstractC1567371w;
import X.AbstractC53402cO;
import X.AbstractC63123SdR;
import X.AnonymousClass001;
import X.AnonymousClass723;
import X.AnonymousClass724;
import X.AnonymousClass725;
import X.AnonymousClass726;
import X.AnonymousClass728;
import X.C02G;
import X.C02Q;
import X.C0f9;
import X.C12550kz;
import X.C154306wf;
import X.C154316wg;
import X.C1567271v;
import X.C18140uy;
import X.C52112aB;
import X.C55233Of5;
import X.C65K;
import X.C65M;
import X.C65N;
import X.C65O;
import X.C71y;
import X.C72C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.R;
import com.facebook.common.dextricks.DexOptimizationMessageHandler;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@ViewPager.DecorView
/* loaded from: classes3.dex */
public class TabLayout extends HorizontalScrollView {
    public static final C02Q A0g = new C12550kz(16);
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public ColorStateList A0E;
    public ColorStateList A0F;
    public ColorStateList A0G;
    public PorterDuff.Mode A0H;
    public Drawable A0I;
    public ViewPager A0J;
    public C71y A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public int A0O;
    public ValueAnimator A0P;
    public DataSetObserver A0Q;
    public AbstractC021208i A0R;
    public AnonymousClass728 A0S;
    public AnonymousClass726 A0T;
    public AnonymousClass726 A0U;
    public C154306wf A0V;
    public AnonymousClass723 A0W;
    public boolean A0X;
    public final int A0Y;
    public final C02Q A0Z;
    public final C1567271v A0a;
    public final ArrayList A0b;
    public final ArrayList A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;

    public TabLayout(Context context) {
        this(context, null);
    }

    private void A03(final int i) {
        if (i != -1) {
            if (getWindowToken() != null && isLaidOut()) {
                final C1567271v c1567271v = this.A0a;
                int childCount = c1567271v.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    if (c1567271v.getChildAt(i2).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int A00 = A00(i, 0.0f);
                if (scrollX != A00) {
                    A02();
                    this.A0P.setIntValues(scrollX, A00);
                    this.A0P.start();
                }
                int i3 = this.A04;
                ValueAnimator valueAnimator = c1567271v.A02;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    c1567271v.A02.cancel();
                }
                View childAt = c1567271v.getChildAt(c1567271v.A01);
                View childAt2 = c1567271v.getChildAt(i);
                if (childAt2 == null) {
                    C1567271v.A01(c1567271v);
                    return;
                }
                ANP anp = new ANP(childAt, childAt2, c1567271v);
                ValueAnimator valueAnimator2 = new ValueAnimator();
                c1567271v.A02 = valueAnimator2;
                valueAnimator2.setInterpolator(AbstractC153306uz.A02);
                valueAnimator2.setDuration(i3);
                valueAnimator2.setFloatValues(0.0f, 1.0f);
                valueAnimator2.addUpdateListener(anp);
                valueAnimator2.addListener(new AnimatorListenerAdapter() { // from class: X.9RT
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C1567271v.this.A01 = i;
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C1567271v.this.A01 = i;
                    }
                });
                valueAnimator2.start();
                return;
            }
            A0A(0.0f, i, true, true);
        }
    }

    public static void A05(ViewPager viewPager, TabLayout tabLayout, boolean z) {
        List list;
        List list2;
        ViewPager viewPager2 = tabLayout.A0J;
        if (viewPager2 != null) {
            AnonymousClass723 anonymousClass723 = tabLayout.A0W;
            if (anonymousClass723 != null && (list2 = viewPager2.A0B) != null) {
                list2.remove(anonymousClass723);
            }
            AnonymousClass728 anonymousClass728 = tabLayout.A0S;
            if (anonymousClass728 != null && (list = tabLayout.A0J.A0A) != null) {
                list.remove(anonymousClass728);
            }
        }
        AnonymousClass726 anonymousClass726 = tabLayout.A0T;
        if (anonymousClass726 != null) {
            tabLayout.A0b.remove(anonymousClass726);
            tabLayout.A0T = null;
        }
        if (viewPager != null) {
            tabLayout.A0J = viewPager;
            AnonymousClass723 anonymousClass7232 = tabLayout.A0W;
            if (anonymousClass7232 == null) {
                anonymousClass7232 = new AnonymousClass723(tabLayout);
                tabLayout.A0W = anonymousClass7232;
            }
            anonymousClass7232.A01 = 0;
            anonymousClass7232.A00 = 0;
            viewPager.A0J(anonymousClass7232);
            AnonymousClass724 anonymousClass724 = new AnonymousClass724(viewPager);
            tabLayout.A0T = anonymousClass724;
            ArrayList arrayList = tabLayout.A0b;
            if (!arrayList.contains(anonymousClass724)) {
                arrayList.add(anonymousClass724);
            }
            AbstractC021208i adapter = viewPager.getAdapter();
            if (adapter != null) {
                tabLayout.A0C(adapter, true);
            }
            AnonymousClass728 anonymousClass7282 = tabLayout.A0S;
            if (anonymousClass7282 == null) {
                anonymousClass7282 = new AnonymousClass728(tabLayout);
                tabLayout.A0S = anonymousClass7282;
            }
            anonymousClass7282.A00 = true;
            List list3 = viewPager.A0A;
            if (list3 == null) {
                list3 = new ArrayList();
                viewPager.A0A = list3;
            }
            list3.add(anonymousClass7282);
            tabLayout.A0A(0.0f, viewPager.getCurrentItem(), true, true);
        } else {
            tabLayout.A0J = null;
            tabLayout.A0C(null, false);
        }
        tabLayout.A0X = z;
    }

    public final void A0A(float f, int i, boolean z, boolean z2) {
        int round = Math.round(i + f);
        if (round >= 0) {
            C1567271v c1567271v = this.A0a;
            if (round < c1567271v.getChildCount()) {
                if (z2) {
                    ValueAnimator valueAnimator = c1567271v.A02;
                    if (valueAnimator != null && valueAnimator.isRunning()) {
                        c1567271v.A02.cancel();
                    }
                    c1567271v.A01 = i;
                    c1567271v.A00 = f;
                    C1567271v.A00(c1567271v.getChildAt(i), c1567271v.getChildAt(c1567271v.A01 + 1), c1567271v, c1567271v.A00);
                }
                ValueAnimator valueAnimator2 = this.A0P;
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    this.A0P.cancel();
                }
                scrollTo(A00(i, f), 0);
                if (z) {
                    setSelectedTabView(round);
                }
            }
        }
    }

    public final void A0G(boolean z) {
        float f;
        int i = 0;
        while (true) {
            C1567271v c1567271v = this.A0a;
            if (i < c1567271v.getChildCount()) {
                View childAt = c1567271v.getChildAt(i);
                childAt.setMinimumWidth(getTabMinWidth());
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (this.A02 == 1 && this.A03 == 0) {
                    ((ViewGroup.LayoutParams) layoutParams).width = 0;
                    f = 1.0f;
                } else {
                    ((ViewGroup.LayoutParams) layoutParams).width = -2;
                    f = 0.0f;
                }
                layoutParams.weight = f;
                if (z) {
                    childAt.requestLayout();
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C154316wg c154316wg;
        Drawable drawable;
        int i = 0;
        while (true) {
            C1567271v c1567271v = this.A0a;
            if (i < c1567271v.getChildCount()) {
                View childAt = c1567271v.getChildAt(i);
                if ((childAt instanceof C154316wg) && (drawable = (c154316wg = (C154316wg) childAt).A00) != null) {
                    drawable.setBounds(c154316wg.getLeft(), c154316wg.getTop(), c154316wg.getRight(), c154316wg.getBottom());
                    c154316wg.A00.draw(canvas);
                }
                i++;
            } else {
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(AbstractC021208i abstractC021208i) {
        A0C(abstractC021208i, false);
    }

    public void setupWithViewPager(ViewPager viewPager) {
        A05(viewPager, this, false);
    }

    private int A00(int i, float f) {
        View view;
        int i2;
        int i3 = this.A02;
        int i4 = 0;
        if (i3 != 0 && i3 != 2) {
            return 0;
        }
        C1567271v c1567271v = this.A0a;
        View childAt = c1567271v.getChildAt(i);
        int i5 = i + 1;
        if (i5 < c1567271v.getChildCount()) {
            view = c1567271v.getChildAt(i5);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i4 = view.getWidth();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i6 = (int) ((i2 + i4) * 0.5f * f);
        int i7 = left - i6;
        if (getLayoutDirection() == 0) {
            return left + i6;
        }
        return i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r1 != 2) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A01() {
        /*
            r5 = this;
            int r0 = r5.A02
            r4 = 2
            r2 = 0
            if (r0 == 0) goto L42
            if (r0 == r4) goto L42
            r0 = 0
        L9:
            X.71v r3 = r5.A0a
            r3.setPaddingRelative(r0, r2, r2, r2)
            int r0 = r5.A02
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L1b
            if (r0 == r4) goto L1b
        L17:
            r5.A0G(r2)
            return
        L1b:
            int r0 = r5.A03
            if (r0 != r4) goto L26
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead"
            android.util.Log.w(r1, r0)
        L26:
            r3.setGravity(r2)
            goto L17
        L2a:
            int r1 = r5.A03
            if (r1 == 0) goto L34
            r0 = 1
            if (r1 == r2) goto L3e
            if (r1 == r4) goto L3b
            goto L17
        L34:
            java.lang.String r1 = "TabLayout"
            java.lang.String r0 = "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead"
            android.util.Log.w(r1, r0)
        L3b:
            r0 = 8388611(0x800003, float:1.1754948E-38)
        L3e:
            r3.setGravity(r0)
            goto L17
        L42:
            int r1 = r5.A0O
            int r0 = r5.A0A
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.A01():void");
    }

    private void A02() {
        if (this.A0P == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.A0P = valueAnimator;
            valueAnimator.setInterpolator(AbstractC153306uz.A02);
            this.A0P.setDuration(this.A04);
            this.A0P.addUpdateListener(new C55233Of5(this));
        }
    }

    private void A04(View view) {
        if (view instanceof TabItem) {
            TabItem tabItem = (TabItem) view;
            C154306wf A06 = A06();
            CharSequence charSequence = tabItem.A02;
            if (charSequence != null) {
                A06.A04(charSequence);
            }
            Drawable drawable = tabItem.A01;
            if (drawable != null) {
                A06.A02(drawable);
            }
            int i = tabItem.A00;
            if (i != 0) {
                A06.A03(LayoutInflater.from(A06.A04.getContext()).inflate(i, (ViewGroup) A06.A04, false));
            }
            if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
                A06.A06 = tabItem.getContentDescription();
                C154316wg c154316wg = A06.A04;
                if (c154316wg != null) {
                    c154316wg.A04();
                }
            }
            A0E(A06, this.A0c.isEmpty());
            return;
        }
        throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        return 48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int getDefaultHeight() {
        /*
            r5 = this;
            java.util.ArrayList r4 = r5.A0c
            int r3 = r4.size()
            r2 = 0
        L7:
            if (r2 >= r3) goto L23
            java.lang.Object r1 = r4.get(r2)
            X.6wf r1 = (X.C154306wf) r1
            if (r1 == 0) goto L26
            android.graphics.drawable.Drawable r0 = r1.A02
            if (r0 == 0) goto L26
            java.lang.CharSequence r0 = r1.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L26
            boolean r1 = r5.A0L
            r0 = 72
            if (r1 == 0) goto L25
        L23:
            r0 = 48
        L25:
            return r0
        L26:
            int r2 = r2 + 1
            goto L7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.getDefaultHeight():int");
    }

    private int getTabMinWidth() {
        int i = this.A0e;
        if (i == -1) {
            int i2 = this.A02;
            if (i2 != 0 && i2 != 2) {
                return 0;
            }
            return this.A0f;
        }
        return i;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.A0a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        C1567271v c1567271v = this.A0a;
        int childCount = c1567271v.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = c1567271v.getChildAt(i2);
                boolean z = true;
                boolean z2 = false;
                if (i2 == i) {
                    z2 = true;
                }
                childAt.setSelected(z2);
                if (i2 != i) {
                    z = false;
                }
                childAt.setActivated(z);
            }
        }
    }

    public final C154306wf A06() {
        C154316wg c154316wg;
        CharSequence charSequence;
        C154306wf c154306wf = (C154306wf) A0g.A7H();
        if (c154306wf == null) {
            c154306wf = new C154306wf();
        }
        c154306wf.A05 = this;
        C02Q c02q = this.A0Z;
        if (c02q == null || (c154316wg = (C154316wg) c02q.A7H()) == null) {
            c154316wg = new C154316wg(getContext(), this);
        }
        c154316wg.setTab(c154306wf);
        c154316wg.setFocusable(true);
        c154316wg.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c154306wf.A06)) {
            charSequence = c154306wf.A07;
        } else {
            charSequence = c154306wf.A06;
        }
        c154316wg.setContentDescription(charSequence);
        c154306wf.A04 = c154316wg;
        int i = c154306wf.A00;
        if (i != -1) {
            c154316wg.setId(i);
        }
        return c154306wf;
    }

    public final C154306wf A07(int i) {
        if (i >= 0) {
            ArrayList arrayList = this.A0c;
            if (i < arrayList.size()) {
                return (C154306wf) arrayList.get(i);
            }
            return null;
        }
        return null;
    }

    public final void A09() {
        C1567271v c1567271v = this.A0a;
        int childCount = c1567271v.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            C154316wg c154316wg = (C154316wg) c1567271v.getChildAt(childCount);
            c1567271v.removeViewAt(childCount);
            if (c154316wg != null) {
                c154316wg.setTab(null);
                c154316wg.setSelected(false);
                this.A0Z.EE6(c154316wg);
            }
            requestLayout();
        }
        Iterator it = this.A0c.iterator();
        while (it.hasNext()) {
            C154306wf c154306wf = (C154306wf) it.next();
            it.remove();
            c154306wf.A05 = null;
            c154306wf.A04 = null;
            c154306wf.A02 = null;
            c154306wf.A00 = -1;
            c154306wf.A07 = null;
            c154306wf.A06 = null;
            c154306wf.A01 = -1;
            c154306wf.A03 = null;
            A0g.EE6(c154306wf);
        }
        this.A0V = null;
    }

    public final void A0B(int i, int i2) {
        setTabTextColors(new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{i2, i}));
    }

    public final void A0C(AbstractC021208i abstractC021208i, boolean z) {
        DataSetObserver dataSetObserver;
        AbstractC021208i abstractC021208i2 = this.A0R;
        if (abstractC021208i2 != null && (dataSetObserver = this.A0Q) != null) {
            abstractC021208i2.unregisterDataSetObserver(dataSetObserver);
        }
        this.A0R = abstractC021208i;
        if (z && abstractC021208i != null) {
            DataSetObserver dataSetObserver2 = this.A0Q;
            if (dataSetObserver2 == null) {
                dataSetObserver2 = new DataSetObserver() { // from class: X.727
                    @Override // android.database.DataSetObserver
                    public final void onChanged() {
                        TabLayout.this.A08();
                    }

                    @Override // android.database.DataSetObserver
                    public final void onInvalidated() {
                        TabLayout.this.A08();
                    }
                };
                this.A0Q = dataSetObserver2;
            }
            abstractC021208i.registerDataSetObserver(dataSetObserver2);
        }
        A08();
    }

    public final void A0D(AnonymousClass725 anonymousClass725) {
        ArrayList arrayList = this.A0b;
        if (!arrayList.contains(anonymousClass725)) {
            arrayList.add(anonymousClass725);
        }
    }

    public final void A0E(C154306wf c154306wf, boolean z) {
        float f;
        ArrayList arrayList = this.A0c;
        int size = arrayList.size();
        if (c154306wf.A05 == this) {
            c154306wf.A01 = size;
            arrayList.add(size, c154306wf);
            int size2 = arrayList.size();
            while (true) {
                size++;
                if (size >= size2) {
                    break;
                } else {
                    ((C154306wf) arrayList.get(size)).A01 = size;
                }
            }
            C154316wg c154316wg = c154306wf.A04;
            c154316wg.setSelected(false);
            c154316wg.setActivated(false);
            C1567271v c1567271v = this.A0a;
            int i = c154306wf.A01;
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
            if (this.A02 == 1 && this.A03 == 0) {
                ((ViewGroup.LayoutParams) layoutParams).width = 0;
                f = 1.0f;
            } else {
                ((ViewGroup.LayoutParams) layoutParams).width = -2;
                f = 0.0f;
            }
            layoutParams.weight = f;
            c1567271v.addView(c154316wg, i, layoutParams);
            if (z) {
                c154306wf.A01();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
    }

    public final void A0F(C154306wf c154306wf, boolean z) {
        int i;
        C154306wf c154306wf2 = this.A0V;
        if (c154306wf2 == c154306wf) {
            if (c154306wf2 != null) {
                ArrayList arrayList = this.A0b;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        arrayList.get(size);
                    } else {
                        A03(c154306wf.A01);
                        return;
                    }
                }
            }
        } else {
            if (c154306wf != null) {
                i = c154306wf.A01;
            } else {
                i = -1;
            }
            if (z) {
                if ((c154306wf2 == null || c154306wf2.A01 == -1) && i != -1) {
                    A0A(0.0f, i, true, true);
                } else {
                    A03(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            this.A0V = c154306wf;
            if (c154306wf2 != null) {
                ArrayList arrayList2 = this.A0b;
                int size2 = arrayList2.size();
                while (true) {
                    size2--;
                    if (size2 < 0) {
                        break;
                    } else {
                        ((AnonymousClass726) arrayList2.get(size2)).Drx(c154306wf2);
                    }
                }
            }
            if (c154306wf != null) {
                ArrayList arrayList3 = this.A0b;
                int size3 = arrayList3.size();
                while (true) {
                    size3--;
                    if (size3 >= 0) {
                        ((AnonymousClass726) arrayList3.get(size3)).Drs(c154306wf);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public int getSelectedTabPosition() {
        C154306wf c154306wf = this.A0V;
        if (c154306wf != null) {
            return c154306wf.A01;
        }
        return -1;
    }

    public int getTabCount() {
        return this.A0c.size();
    }

    public int getTabGravity() {
        return this.A03;
    }

    public ColorStateList getTabIconTint() {
        return this.A0E;
    }

    public int getTabIndicatorAnimationMode() {
        return this.A05;
    }

    public int getTabIndicatorGravity() {
        return this.A06;
    }

    public int getTabMaxWidth() {
        return this.A07;
    }

    public int getTabMode() {
        return this.A02;
    }

    public ColorStateList getTabRippleColor() {
        return this.A0F;
    }

    public Drawable getTabSelectedIndicator() {
        return this.A0I;
    }

    public ColorStateList getTabTextColors() {
        return this.A0G;
    }

    public void setInlineLabel(boolean z) {
        ImageView imageView;
        if (this.A0L != z) {
            this.A0L = z;
            int i = 0;
            while (true) {
                C1567271v c1567271v = this.A0a;
                if (i < c1567271v.getChildCount()) {
                    View childAt = c1567271v.getChildAt(i);
                    if (childAt instanceof C154316wg) {
                        C154316wg c154316wg = (C154316wg) childAt;
                        c154316wg.setOrientation(!c154316wg.A0A.A0L ? 1 : 0);
                        TextView textView = c154316wg.A04;
                        if (textView == null && c154316wg.A02 == null) {
                            textView = c154316wg.A05;
                            imageView = c154316wg.A03;
                        } else {
                            imageView = c154316wg.A02;
                        }
                        C154316wg.A03(imageView, textView, c154316wg);
                    }
                    i++;
                } else {
                    A01();
                    return;
                }
            }
        }
    }

    @Deprecated
    public void setOnTabSelectedListener(AnonymousClass726 anonymousClass726) {
        AnonymousClass726 anonymousClass7262 = this.A0U;
        if (anonymousClass7262 != null) {
            this.A0b.remove(anonymousClass7262);
        }
        this.A0U = anonymousClass726;
        if (anonymousClass726 != null) {
            ArrayList arrayList = this.A0b;
            if (!arrayList.contains(anonymousClass726)) {
                arrayList.add(anonymousClass726);
            }
        }
    }

    public void setSelectedTabIndicator(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C52112aB.A02().A05(getContext(), i);
        } else {
            drawable = null;
        }
        setSelectedTabIndicator(drawable);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.A06 != i) {
            this.A06 = i;
            this.A0a.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        C1567271v c1567271v = this.A0a;
        TabLayout tabLayout = c1567271v.A03;
        Rect bounds = tabLayout.A0I.getBounds();
        tabLayout.A0I.setBounds(bounds.left, 0, bounds.right, i);
        c1567271v.requestLayout();
    }

    public void setTabGravity(int i) {
        if (this.A03 != i) {
            this.A03 = i;
            A01();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.A0E != colorStateList) {
            this.A0E = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C154316wg c154316wg = ((C154306wf) arrayList.get(i)).A04;
                if (c154316wg != null) {
                    c154316wg.A04();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.71y] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public void setTabIndicatorAnimationMode(int i) {
        ?? r0;
        this.A05 = i;
        if (i != 0) {
            if (i == 1) {
                r0 = new Object();
            } else {
                throw new IllegalArgumentException(AnonymousClass001.A03(i, " is not a valid TabIndicatorAnimationMode"));
            }
        } else {
            r0 = new Object();
        }
        this.A0K = r0;
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.A0M = z;
        this.A0a.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.A02) {
            this.A02 = i;
            A01();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.A0F != colorStateList) {
            this.A0F = colorStateList;
            int i = 0;
            while (true) {
                C1567271v c1567271v = this.A0a;
                if (i < c1567271v.getChildCount()) {
                    View childAt = c1567271v.getChildAt(i);
                    if (childAt instanceof C154316wg) {
                        C154316wg.A02(getContext(), (C154316wg) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.A0G != colorStateList) {
            this.A0G = colorStateList;
            ArrayList arrayList = this.A0c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C154316wg c154316wg = ((C154306wf) arrayList.get(i)).A04;
                if (c154316wg != null) {
                    c154316wg.A04();
                }
            }
        }
    }

    public void setUnboundedRipple(boolean z) {
        if (this.A0N != z) {
            this.A0N = z;
            int i = 0;
            while (true) {
                C1567271v c1567271v = this.A0a;
                if (i < c1567271v.getChildCount()) {
                    View childAt = c1567271v.getChildAt(i);
                    if (childAt instanceof C154316wg) {
                        C154316wg.A02(getContext(), (C154316wg) childAt);
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void A08() {
        int currentItem;
        A09();
        AbstractC021208i abstractC021208i = this.A0R;
        if (abstractC021208i != null) {
            int count = abstractC021208i.getCount();
            for (int i = 0; i < count; i++) {
                C154306wf A06 = A06();
                A06.A04(this.A0R.getPageTitle(i));
                A0E(A06, false);
            }
            ViewPager viewPager = this.A0J;
            if (viewPager != null && count > 0 && (currentItem = viewPager.getCurrentItem()) != getSelectedTabPosition() && currentItem < this.A0c.size()) {
                A0F(A07(currentItem), true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-1891590377);
        super.onAttachedToWindow();
        C72C.A00(this);
        if (this.A0J == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                A05((ViewPager) parent, this, true);
            }
        }
        C0f9.A0D(77190589, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        int A06 = C0f9.A06(-1530616597);
        super.onDetachedFromWindow();
        if (this.A0X) {
            A05(null, this, false);
            this.A0X = false;
        }
        C0f9.A0D(481970430, A06);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, this.A0c.size(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        Context context = getContext();
        int round = Math.round(AbstractC126235nK.A00(context, getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(round + getPaddingTop() + getPaddingBottom(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i2) >= round) {
            getChildAt(0).setMinimumHeight(round);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int i3 = this.A0d;
            if (i3 <= 0) {
                i3 = (int) (size - AbstractC126235nK.A00(context, 56));
            }
            this.A07 = i3;
        }
        super.onMeasure(i, i2);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i4 = this.A02;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        return;
                    }
                } else {
                    if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                        return;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
                }
            }
            if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO), ViewGroup.getChildMeasureSpec(i2, getPaddingTop() + getPaddingBottom(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C72C.A01(this, f);
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        A02();
        this.A0P.addListener(animatorListener);
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(C02G.A02(getContext(), i));
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(C02G.A02(getContext(), i));
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() <= 0) {
            return false;
        }
        return true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        A04(view);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A0C = i;
    }

    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        super(C65K.A00(context, attributeSet, i, R.style.Widget_Design_TabLayout), attributeSet, i);
        this.A0c = new ArrayList();
        this.A0I = new GradientDrawable();
        this.A0C = 0;
        this.A07 = Integer.MAX_VALUE;
        this.A0b = new ArrayList();
        this.A0Z = new C18140uy(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C1567271v c1567271v = new C1567271v(context2, this);
        this.A0a = c1567271v;
        super.addView(c1567271v, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray A00 = C65M.A00(context2, attributeSet, C65N.A0a, new int[]{23}, i, R.style.Widget_Design_TabLayout);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C65O c65o = new C65O();
            c65o.A0F(ColorStateList.valueOf(colorDrawable.getColor()));
            c65o.A0E(context2);
            c65o.A0A(getElevation());
            setBackground(c65o);
        }
        setSelectedTabIndicator(AbstractC1567371w.A03(context2, A00, 5));
        this.A0C = A00.getColor(8, 0);
        int dimensionPixelSize = A00.getDimensionPixelSize(11, -1);
        TabLayout tabLayout = c1567271v.A03;
        Rect bounds = tabLayout.A0I.getBounds();
        tabLayout.A0I.setBounds(bounds.left, 0, bounds.right, dimensionPixelSize);
        c1567271v.requestLayout();
        setSelectedTabIndicatorGravity(A00.getInt(10, 0));
        setTabIndicatorFullWidth(A00.getBoolean(9, true));
        setTabIndicatorAnimationMode(A00.getInt(7, 0));
        int dimensionPixelSize2 = A00.getDimensionPixelSize(16, 0);
        this.A08 = dimensionPixelSize2;
        this.A09 = dimensionPixelSize2;
        this.A0B = dimensionPixelSize2;
        this.A0A = dimensionPixelSize2;
        this.A0A = A00.getDimensionPixelSize(19, dimensionPixelSize2);
        this.A0B = A00.getDimensionPixelSize(20, this.A0B);
        this.A09 = A00.getDimensionPixelSize(18, this.A09);
        this.A08 = A00.getDimensionPixelSize(17, this.A08);
        int resourceId = A00.getResourceId(23, R.style.TextAppearance_Design_Tab);
        this.A0D = resourceId;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(resourceId, AbstractC53402cO.A0N);
        try {
            this.A01 = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.A0G = AbstractC1567371w.A01(context2, obtainStyledAttributes, 3);
            obtainStyledAttributes.recycle();
            if (A00.hasValue(24)) {
                this.A0G = AbstractC1567371w.A01(context2, A00, 24);
            }
            if (A00.hasValue(22)) {
                this.A0G = new ColorStateList(new int[][]{View.SELECTED_STATE_SET, View.EMPTY_STATE_SET}, new int[]{A00.getColor(22, 0), this.A0G.getDefaultColor()});
            }
            this.A0E = AbstractC1567371w.A01(context2, A00, 3);
            this.A0H = AbstractC126235nK.A01(null, A00.getInt(4, -1));
            this.A0F = AbstractC1567371w.A01(context2, A00, 21);
            this.A04 = A00.getInt(6, DexOptimizationMessageHandler.DEFAULT_RESTART_IMPORTANCE_THRESHOLD);
            this.A0e = A00.getDimensionPixelSize(14, -1);
            this.A0d = A00.getDimensionPixelSize(13, -1);
            this.A0Y = A00.getResourceId(0, 0);
            this.A0O = A00.getDimensionPixelSize(1, 0);
            this.A02 = A00.getInt(15, 1);
            this.A03 = A00.getInt(2, 0);
            this.A0L = A00.getBoolean(12, false);
            this.A0N = A00.getBoolean(25, false);
            A00.recycle();
            Resources resources = getResources();
            this.A00 = resources.getDimensionPixelSize(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
            this.A0f = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            A01();
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A04(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(AnonymousClass725 anonymousClass725) {
        setOnTabSelectedListener((AnonymousClass726) anonymousClass725);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (this.A0I != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.A0I = drawable;
        }
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        A04(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A04(view);
    }
}
