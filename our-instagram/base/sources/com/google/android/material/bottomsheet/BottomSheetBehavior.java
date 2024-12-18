package com.google.android.material.bottomsheet;

import X.AbstractC010103p;
import X.AbstractC1567371w;
import X.AbstractC167007dF;
import X.AbstractC25230BEn;
import X.AbstractC37301Gc2;
import X.AbstractC43594JPz;
import X.AbstractC58320PtC;
import X.C012804r;
import X.C56292iI;
import X.C65759TtZ;
import X.C65884Tvo;
import X.C65N;
import X.C65O;
import X.C65Q;
import X.C66376UEk;
import X.C70198WGk;
import X.MSV;
import X.MSY;
import X.MSZ;
import X.RunnableC71556Ww5;
import X.RunnableC71602Wwy;
import X.VK4;
import X.VKH;
import X.WQT;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.facebook.R;
import com.facebook.common.dextricks.Constants;
import java.lang.ref.WeakReference;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class BottomSheetBehavior extends CoordinatorLayout.Behavior {
    public float A00;
    public float A01;
    public float A02;
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
    public int A0E;
    public int A0F;
    public int A0G;
    public ValueAnimator A0H;
    public VelocityTracker A0I;
    public C70198WGk A0J;
    public C65O A0K;
    public WeakReference A0L;
    public WeakReference A0M;
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
    public int A0X;
    public int A0Y;
    public int A0Z;
    public int A0a;
    public int A0b;
    public int A0c;
    public RunnableC71602Wwy A0d;
    public C65Q A0e;
    public Map A0f;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public boolean A0j;
    public boolean A0k;
    public final ArrayList A0l;
    public final VKH A0m;

    private void A02(int i) {
        boolean A1P;
        ValueAnimator valueAnimator;
        if (i != 2 && this.A0h != (A1P = AbstractC167007dF.A1P(i, 3))) {
            this.A0h = A1P;
            if (this.A0K != null && (valueAnimator = this.A0H) != null) {
                if (valueAnimator.isRunning()) {
                    valueAnimator.reverse();
                    return;
                }
                float f = 1.0f;
                if (A1P) {
                    f = 0.0f;
                }
                valueAnimator.setFloatValues(1.0f - f, f);
                valueAnimator.start();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0G() {
        this.A0M = null;
        this.A0J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0J(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3, int i4, int i5) {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0K(C56292iI c56292iI) {
        this.A0M = null;
        this.A0J = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        this.A0a = 0;
        this.A0i = false;
        return (i & 2) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0P(android.view.View r6, android.view.View r7, androidx.coordinatorlayout.widget.CoordinatorLayout r8, int[] r9, int r10, int r11, int r12) {
        /*
            r5 = this;
            r2 = 1
            if (r12 == r2) goto L31
            java.lang.ref.WeakReference r0 = r5.A0L
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r0.get()
        Lb:
            if (r7 != r0) goto L31
            int r4 = r6.getTop()
            int r3 = r4 - r11
            if (r11 <= 0) goto L32
            int r0 = r5.A0R()
            if (r3 >= r0) goto L4c
            int r4 = r4 - r0
            r9[r2] = r4
            int r0 = -r4
            r6.offsetTopAndBottom(r0)
            r0 = 3
        L23:
            r5.A0X(r0)
        L26:
            int r0 = r6.getTop()
            r5.A0U(r0)
            r5.A0a = r11
            r5.A0i = r2
        L31:
            return
        L32:
            if (r11 >= 0) goto L26
            r0 = -1
            boolean r0 = r7.canScrollVertically(r0)
            if (r0 != 0) goto L26
            int r1 = r5.A04
            if (r3 <= r1) goto L4c
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L4c
            int r4 = r4 - r1
            r9[r2] = r4
            int r0 = -r4
            r6.offsetTopAndBottom(r0)
            r0 = 4
            goto L23
        L4c:
            boolean r0 = r5.A0N
            if (r0 == 0) goto L31
            r9[r2] = r11
            int r0 = -r11
            r6.offsetTopAndBottom(r0)
            r5.A0X(r2)
            goto L26
        L5a:
            r0 = 0
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0P(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int[], int, int, int):void");
    }

    public final void A0T(float f) {
        if (f > 0.0f && f < 1.0f) {
            this.A01 = f;
            if (this.A0M != null) {
                this.A08 = (int) (this.A0C * (1.0f - f));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }

    public final void A0V(int i) {
        View view;
        boolean z = this.A0U;
        if (i == -1) {
            if (!z) {
                this.A0U = true;
            } else {
                return;
            }
        } else {
            if (!z && this.A0E == i) {
                return;
            }
            this.A0U = false;
            this.A0E = Math.max(0, i);
        }
        WeakReference weakReference = this.A0M;
        if (weakReference != null) {
            A04(this);
            if (this.A0G == 4 && (view = (View) weakReference.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void A0Y(View view, int i) {
        int i2;
        if (i == 4) {
            i2 = this.A04;
        } else if (i == 6) {
            int i3 = this.A08;
            if (this.A0O && i3 <= (i2 = this.A06)) {
                i = 3;
            } else {
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = A0R();
        } else if (this.A0Q && i == 5) {
            i2 = this.A0C;
        } else {
            throw AbstractC25230BEn.A0n("Illegal state argument: ", i);
        }
        A0Z(view, i, i2, false);
    }

    /* loaded from: classes11.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C65884Tvo(6);
        public int A00;
        public boolean A01;
        public boolean A02;
        public boolean A03;
        public final int A04;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.A04 = parcel.readInt();
            this.A00 = parcel.readInt();
            this.A01 = AbstractC167007dF.A1P(parcel.readInt(), 1);
            this.A02 = AbstractC58320PtC.A1U(parcel);
            this.A03 = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.A04);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
            parcel.writeInt(this.A02 ? 1 : 0);
            parcel.writeInt(this.A03 ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.A04 = bottomSheetBehavior.A0G;
            this.A00 = bottomSheetBehavior.A0E;
            this.A01 = bottomSheetBehavior.A0O;
            this.A02 = bottomSheetBehavior.A0Q;
            this.A03 = bottomSheetBehavior.A0V;
        }
    }

    private int A00() {
        int i;
        int i2;
        if (this.A0U) {
            i = Math.min(Math.max(this.A0c, this.A0C - ((this.A0D * 9) / 16)), this.A0X);
        } else {
            if (!this.A0P && !this.A0R && (i2 = this.A07) > 0) {
                return Math.max(this.A0E, i2 + this.A0b);
            }
            i = this.A0E;
        }
        return i + this.A09;
    }

    private void A03(Context context, ColorStateList colorStateList, AttributeSet attributeSet, boolean z) {
        if (this.A0k) {
            C65Q c65q = new C65Q(C65Q.A01(context, attributeSet, R.attr.bottomSheetStyle, R.style.Widget_Design_BottomSheet_Modal));
            this.A0e = c65q;
            C65O c65o = new C65O(c65q);
            this.A0K = c65o;
            c65o.A0E(context);
            if (z && colorStateList != null) {
                this.A0K.A0F(colorStateList);
                return;
            }
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(android.R.attr.colorBackground, typedValue, true);
            this.A0K.setTint(typedValue.data);
        }
    }

    public static void A05(BottomSheetBehavior bottomSheetBehavior) {
        View view;
        C012804r c012804r;
        WQT wqt;
        int i;
        WeakReference weakReference = bottomSheetBehavior.A0M;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            AbstractC010103p.A09(view, Constants.LOAD_RESULT_WITH_VDEX_ODEX);
            AbstractC010103p.A09(view, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP_ATTEMPTED);
            AbstractC010103p.A09(view, 1048576);
            int i2 = bottomSheetBehavior.A0Y;
            if (i2 != -1) {
                AbstractC010103p.A09(view, i2);
            }
            int i3 = 6;
            if (!bottomSheetBehavior.A0O && bottomSheetBehavior.A0G != 6) {
                String string = view.getResources().getString(2131954105);
                WQT wqt2 = new WQT(bottomSheetBehavior, 6);
                AbstractList abstractList = (AbstractList) view.getTag(R.id.tag_accessibility_actions);
                if (abstractList == null) {
                    abstractList = new ArrayList();
                    view.setTag(R.id.tag_accessibility_actions, abstractList);
                }
                int i4 = 0;
                while (true) {
                    if (i4 < abstractList.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((C012804r) abstractList.get(i4)).A03).getLabel())) {
                            i = ((C012804r) abstractList.get(i4)).A00();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = 0;
                        i = -1;
                        while (true) {
                            int[] iArr = AbstractC010103p.A04;
                            if (i5 >= 32 || i != -1) {
                                break;
                            }
                            int i6 = iArr[i5];
                            boolean z = true;
                            for (int i7 = 0; i7 < abstractList.size(); i7++) {
                                z &= MSY.A1S(((C012804r) abstractList.get(i7)).A00(), i6);
                            }
                            if (z) {
                                i = i6;
                            }
                            i5++;
                        }
                    }
                }
                if (i != -1) {
                    AbstractC010103p.A0D(view, new C012804r(wqt2, string, null, null, i));
                }
                bottomSheetBehavior.A0Y = i;
            }
            if (bottomSheetBehavior.A0Q && bottomSheetBehavior.A0G != 5) {
                AbstractC010103p.A0E(view, C012804r.A0D, new WQT(bottomSheetBehavior, 5));
            }
            int i8 = bottomSheetBehavior.A0G;
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 == 6) {
                        AbstractC010103p.A0E(view, C012804r.A09, new WQT(bottomSheetBehavior, 4));
                        c012804r = C012804r.A0H;
                        wqt = new WQT(bottomSheetBehavior, 3);
                        AbstractC010103p.A0E(view, c012804r, wqt);
                    }
                    return;
                }
                if (bottomSheetBehavior.A0O) {
                    i3 = 3;
                }
                c012804r = C012804r.A0H;
            } else {
                if (bottomSheetBehavior.A0O) {
                    i3 = 4;
                }
                c012804r = C012804r.A09;
            }
            wqt = new WQT(bottomSheetBehavior, i3);
            AbstractC010103p.A0E(view, c012804r, wqt);
        }
    }

    private void A06(boolean z) {
        WeakReference weakReference = this.A0M;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                ViewGroup viewGroup = (ViewGroup) parent;
                int childCount = viewGroup.getChildCount();
                if (z) {
                    if (this.A0f == null) {
                        this.A0f = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != this.A0M.get() && z) {
                        AbstractC37301Gc2.A1T(childAt, this.A0f, childAt.getImportantForAccessibility());
                    }
                }
                if (!z) {
                    this.A0f = null;
                }
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final Parcelable A0F(View view, CoordinatorLayout coordinatorLayout) {
        return new SavedState(android.view.AbsSavedState.EMPTY_STATE, this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void A0H(Parcelable parcelable, View view, CoordinatorLayout coordinatorLayout) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.A0F;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.A0E = savedState.A00;
            }
            if (i == -1 || (i & 2) == 2) {
                this.A0O = savedState.A01;
            }
            if (i == -1 || (i & 4) == 4) {
                this.A0Q = savedState.A02;
            }
            if (i == -1 || (i & 8) == 8) {
                this.A0V = savedState.A03;
            }
        }
        int i2 = savedState.A04;
        if (i2 != 1 && i2 != 2) {
            this.A0G = i2;
        } else {
            this.A0G = 4;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        WeakReference weakReference = this.A0L;
        if (weakReference == null || view2 != weakReference.get() || this.A0G == 3) {
            return false;
        }
        return true;
    }

    public final int A0R() {
        int i;
        if (this.A0O) {
            return this.A06;
        }
        int i2 = this.A05;
        if (this.A0j) {
            i = 0;
        } else {
            i = this.A0A;
        }
        return Math.max(i2, i);
    }

    public final void A0U(int i) {
        float f;
        int i2;
        int A0R;
        View view = (View) this.A0M.get();
        if (view != null) {
            ArrayList arrayList = this.A0l;
            if (!arrayList.isEmpty()) {
                int i3 = this.A04;
                if (i <= i3 && i3 != (A0R = A0R())) {
                    f = i3 - i;
                    i2 = i3 - A0R;
                } else {
                    f = i3 - i;
                    i2 = this.A0C - i3;
                }
                float f2 = f / i2;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((VK4) arrayList.get(i4)).A01(view, f2);
                }
            }
        }
    }

    public final void A0W(int i) {
        if (i != this.A0G) {
            WeakReference weakReference = this.A0M;
            if (weakReference == null) {
                if (i == 4 || i == 3 || i == 6 || (this.A0Q && i == 5)) {
                    this.A0G = i;
                    return;
                }
                return;
            }
            View view = (View) weakReference.get();
            if (view == null) {
                return;
            }
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested() && view.isAttachedToWindow()) {
                view.post(new RunnableC71556Ww5(view, this, i));
            } else {
                A0Y(view, i);
            }
        }
    }

    public final void A0X(int i) {
        View view;
        if (this.A0G != i) {
            this.A0G = i;
            WeakReference weakReference = this.A0M;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                int i2 = 0;
                if (i == 3) {
                    A06(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    A06(false);
                }
                A02(i);
                while (true) {
                    ArrayList arrayList = this.A0l;
                    if (i2 < arrayList.size()) {
                        ((VK4) arrayList.get(i2)).A02(view, i);
                        i2++;
                    } else {
                        A05(this);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r2.A0I(r1, r6) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0Z(android.view.View r4, int r5, int r6, boolean r7) {
        /*
            r3 = this;
            X.WGk r2 = r3.A0J
            if (r2 == 0) goto L48
            int r1 = r4.getLeft()
            if (r7 == 0) goto L31
            boolean r0 = r2.A0I(r1, r6)
            if (r0 == 0) goto L48
        L10:
            r0 = 2
            r3.A0X(r0)
            r3.A02(r5)
            X.Wwy r1 = r3.A0d
            if (r1 != 0) goto L22
            X.Wwy r1 = new X.Wwy
            r1.<init>(r4, r3, r5)
            r3.A0d = r1
        L22:
            boolean r0 = r1.A01
            r1.A00 = r5
            if (r0 != 0) goto L30
            r4.postOnAnimation(r1)
            X.Wwy r1 = r3.A0d
            r0 = 1
            r1.A01 = r0
        L30:
            return
        L31:
            r2.A08 = r4
            r0 = -1
            r2.A02 = r0
            r0 = 0
            boolean r0 = X.C70198WGk.A0A(r2, r1, r6, r0, r0)
            if (r0 != 0) goto L10
            int r0 = r2.A03
            if (r0 != 0) goto L48
            android.view.View r0 = r2.A08
            if (r0 == 0) goto L48
            r0 = 0
            r2.A08 = r0
        L48:
            r3.A0X(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0Z(android.view.View, int, int, boolean):void");
    }

    public final void A0a(VK4 vk4) {
        MSZ.A1P(vk4, this.A0l);
    }

    public final void A0b(boolean z) {
        if (this.A0Q != z) {
            this.A0Q = z;
            if (!z && this.A0G == 5) {
                A0W(4);
            }
            A05(this);
        }
    }

    public final boolean A0c(View view, float f) {
        if (this.A0V) {
            return true;
        }
        if (view.getTop() < this.A04) {
            return false;
        }
        if (Math.abs((view.getTop() + (f * 0.1f)) - this.A04) / A00() > 0.5f) {
            return true;
        }
        return false;
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        int dimensionPixelOffset;
        int i;
        this.A0F = 0;
        this.A0O = true;
        this.A0B = -1;
        this.A0d = null;
        this.A01 = 0.5f;
        this.A00 = -1.0f;
        this.A0N = true;
        this.A0G = 4;
        this.A0l = new ArrayList();
        this.A0Y = -1;
        this.A0m = new C66376UEk(this);
        this.A0b = AbstractC43594JPz.A03(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C65N.A04);
        this.A0k = obtainStyledAttributes.hasValue(16);
        boolean hasValue = obtainStyledAttributes.hasValue(2);
        if (hasValue) {
            A03(context, AbstractC1567371w.A01(context, obtainStyledAttributes, 2), attributeSet, hasValue);
        } else {
            A03(context, null, attributeSet, false);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0H = ofFloat;
        ofFloat.setDuration(500L);
        C65759TtZ.A00(this.A0H, this, 4);
        this.A00 = obtainStyledAttributes.getDimension(1, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.A0B = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(8);
        if (peekValue != null && peekValue.data == -1) {
            A0V(-1);
        } else {
            A0V(obtainStyledAttributes.getDimensionPixelSize(8, -1));
        }
        A0b(obtainStyledAttributes.getBoolean(7, false));
        this.A0P = obtainStyledAttributes.getBoolean(11, false);
        boolean z = obtainStyledAttributes.getBoolean(5, true);
        if (this.A0O != z) {
            this.A0O = z;
            if (this.A0M != null) {
                A04(this);
            }
            if (z && this.A0G == 6) {
                i = 3;
            } else {
                i = this.A0G;
            }
            A0X(i);
            A05(this);
        }
        this.A0V = obtainStyledAttributes.getBoolean(10, false);
        this.A0N = obtainStyledAttributes.getBoolean(3, true);
        this.A0F = obtainStyledAttributes.getInt(9, 0);
        A0T(obtainStyledAttributes.getFloat(6, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(4);
        if (peekValue2 != null && peekValue2.type == 16) {
            dimensionPixelOffset = peekValue2.data;
        } else {
            dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        }
        if (dimensionPixelOffset >= 0) {
            this.A05 = dimensionPixelOffset;
            this.A0R = obtainStyledAttributes.getBoolean(12, false);
            this.A0S = obtainStyledAttributes.getBoolean(13, false);
            this.A0T = obtainStyledAttributes.getBoolean(14, false);
            this.A0j = obtainStyledAttributes.getBoolean(15, true);
            obtainStyledAttributes.recycle();
            this.A02 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public static BottomSheetBehavior A01(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof C56292iI) {
            CoordinatorLayout.Behavior behavior = ((C56292iI) layoutParams).A0A;
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException(MSV.A00(861));
        }
        throw new IllegalArgumentException(MSV.A00(860));
    }

    public static void A04(BottomSheetBehavior bottomSheetBehavior) {
        int A00 = bottomSheetBehavior.A00();
        boolean z = bottomSheetBehavior.A0O;
        int i = bottomSheetBehavior.A0C - A00;
        if (z) {
            bottomSheetBehavior.A04 = Math.max(i, bottomSheetBehavior.A06);
        } else {
            bottomSheetBehavior.A04 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        if (r0 > r4) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a6, code lost:
    
        r4 = A0R();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        if (r1 >= java.lang.Math.abs(r2 - r3)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a4, code lost:
    
        if (r2 < java.lang.Math.abs(r2 - r6.A04)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (r1 < java.lang.Math.abs(r2 - r3)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x008b, code lost:
    
        if (r1 >= java.lang.Math.abs(r2 - r3)) goto L34;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0I(android.view.View r7, android.view.View r8, androidx.coordinatorlayout.widget.CoordinatorLayout r9, int r10) {
        /*
            r6 = this;
            int r1 = r7.getTop()
            int r0 = r6.A0R()
            r5 = 3
            if (r1 != r0) goto Lf
            r6.A0X(r5)
        Le:
            return
        Lf:
            java.lang.ref.WeakReference r0 = r6.A0L
            if (r0 == 0) goto Le
            java.lang.Object r0 = r0.get()
            if (r8 != r0) goto Le
            boolean r0 = r6.A0i
            if (r0 == 0) goto Le
            int r0 = r6.A0a
            if (r0 <= 0) goto L2e
            boolean r0 = r6.A0O
            if (r0 == 0) goto L8e
            int r4 = r6.A06
        L27:
            r0 = 0
            r6.A0Z(r7, r5, r4, r0)
            r6.A0i = r0
            return
        L2e:
            boolean r0 = r6.A0Q
            if (r0 == 0) goto L51
            android.view.VelocityTracker r2 = r6.A0I
            if (r2 != 0) goto L41
            r0 = 0
        L37:
            boolean r0 = r6.A0c(r7, r0)
            if (r0 == 0) goto L51
            int r4 = r6.A0C
            r5 = 5
            goto L27
        L41:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r0 = r6.A02
            r2.computeCurrentVelocity(r1, r0)
            android.view.VelocityTracker r1 = r6.A0I
            int r0 = r6.A03
            float r0 = r1.getYVelocity(r0)
            goto L37
        L51:
            int r0 = r6.A0a
            if (r0 != 0) goto L71
            int r2 = r7.getTop()
            boolean r0 = r6.A0O
            if (r0 == 0) goto L98
            int r4 = r6.A06
            int r0 = r2 - r4
            int r1 = java.lang.Math.abs(r0)
            int r3 = r6.A04
            int r2 = r2 - r3
            int r0 = java.lang.Math.abs(r2)
            if (r1 < r0) goto L27
        L6e:
            r4 = r3
        L6f:
            r5 = 4
            goto L27
        L71:
            boolean r0 = r6.A0O
            if (r0 == 0) goto L78
            int r4 = r6.A04
            goto L6f
        L78:
            int r2 = r7.getTop()
            int r4 = r6.A08
            int r0 = r2 - r4
            int r1 = java.lang.Math.abs(r0)
            int r3 = r6.A04
            int r2 = r2 - r3
            int r0 = java.lang.Math.abs(r2)
            if (r1 < r0) goto L96
            goto L6e
        L8e:
            int r0 = r7.getTop()
            int r4 = r6.A08
            if (r0 <= r4) goto La6
        L96:
            r5 = 6
            goto L27
        L98:
            int r4 = r6.A08
            if (r2 >= r4) goto Lac
            int r0 = r6.A04
            int r0 = r2 - r0
            int r0 = java.lang.Math.abs(r0)
            if (r2 >= r0) goto L96
        La6:
            int r4 = r6.A0R()
            goto L27
        Lac:
            int r0 = r2 - r4
            int r1 = java.lang.Math.abs(r0)
            int r3 = r6.A04
            int r2 = r2 - r3
            int r0 = java.lang.Math.abs(r2)
            if (r1 >= r0) goto L6e
            goto L96
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0I(android.view.View, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0089, code lost:
    
        if (r12.A0G(r11, r1, r9.A0Z) != false) goto L43;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0L(android.view.MotionEvent r10, android.view.View r11, androidx.coordinatorlayout.widget.CoordinatorLayout r12) {
        /*
            r9 = this;
            boolean r0 = r11.isShown()
            r2 = 0
            r4 = 1
            if (r0 == 0) goto Ld0
            boolean r0 = r9.A0N
            if (r0 == 0) goto Ld0
            int r6 = r10.getActionMasked()
            if (r6 != 0) goto L1f
            r0 = -1
            r9.A03 = r0
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 == 0) goto L1f
            r0.recycle()
            r0 = 0
            r9.A0I = r0
        L1f:
            android.view.VelocityTracker r0 = r9.A0I
            if (r0 != 0) goto L29
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r9.A0I = r0
        L29:
            r0.addMovement(r10)
            r3 = 0
            r7 = -1
            r5 = 2
            if (r6 == 0) goto L50
            if (r6 == r4) goto L45
            r0 = 3
            if (r6 == r0) goto L45
        L36:
            boolean r0 = r9.A0g
            if (r0 != 0) goto L8f
            X.WGk r0 = r9.A0J
            if (r0 == 0) goto L8f
            boolean r0 = r0.A0J(r10)
            if (r0 == 0) goto L8f
            return r4
        L45:
            r9.A0W = r2
            r9.A03 = r7
            boolean r0 = r9.A0g
            if (r0 == 0) goto L36
            r9.A0g = r2
            return r2
        L50:
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r8 = (int) r0
            r9.A0Z = r8
            int r0 = r9.A0G
            if (r0 == r5) goto L7e
            java.lang.ref.WeakReference r0 = r9.A0L
            if (r0 == 0) goto L7e
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L7e
            boolean r0 = r12.A0G(r0, r1, r8)
            if (r0 == 0) goto L7e
            int r0 = r10.getActionIndex()
            int r0 = r10.getPointerId(r0)
            r9.A03 = r0
            r9.A0W = r4
        L7e:
            int r0 = r9.A03
            if (r0 != r7) goto L8b
            int r0 = r9.A0Z
            boolean r1 = r12.A0G(r11, r1, r0)
            r0 = 1
            if (r1 == 0) goto L8c
        L8b:
            r0 = 0
        L8c:
            r9.A0g = r0
            goto L36
        L8f:
            java.lang.ref.WeakReference r0 = r9.A0L
            if (r0 == 0) goto L99
            java.lang.Object r3 = r0.get()
            android.view.View r3 = (android.view.View) r3
        L99:
            if (r6 != r5) goto Ld2
            if (r3 == 0) goto Ld2
            boolean r0 = r9.A0g
            if (r0 != 0) goto Ld2
            int r0 = r9.A0G
            if (r0 == r4) goto Ld2
            float r0 = r10.getX()
            int r1 = (int) r0
            float r0 = r10.getY()
            int r0 = (int) r0
            boolean r0 = r12.A0G(r3, r1, r0)
            if (r0 != 0) goto Ld2
            X.WGk r0 = r9.A0J
            if (r0 == 0) goto Ld2
            int r0 = r9.A0Z
            float r1 = (float) r0
            float r0 = r10.getY()
            float r1 = r1 - r0
            float r1 = java.lang.Math.abs(r1)
            X.WGk r0 = r9.A0J
            int r0 = r0.A06
            float r0 = (float) r0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto Ld2
            r2 = 1
            return r2
        Ld0:
            r9.A0g = r4
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0L(android.view.MotionEvent, android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.A0G == 1 && actionMasked == 0) {
            return true;
        }
        C70198WGk c70198WGk = this.A0J;
        if (c70198WGk != null) {
            c70198WGk.A0F(motionEvent);
        }
        if (actionMasked == 0) {
            this.A03 = -1;
            VelocityTracker velocityTracker = this.A0I;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A0I = null;
            }
        }
        VelocityTracker velocityTracker2 = this.A0I;
        if (velocityTracker2 == null) {
            velocityTracker2 = VelocityTracker.obtain();
            this.A0I = velocityTracker2;
        }
        velocityTracker2.addMovement(motionEvent);
        if (this.A0J != null && actionMasked == 2 && !this.A0g) {
            float abs = Math.abs(this.A0Z - motionEvent.getY());
            C70198WGk c70198WGk2 = this.A0J;
            if (abs > c70198WGk2.A06) {
                c70198WGk2.A0G(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.A0g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r8.A0U != false) goto L15;
     */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.VJP, java.lang.Object] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A0Q(android.view.View r9, androidx.coordinatorlayout.widget.CoordinatorLayout r10, int r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.A0Q(android.view.View, androidx.coordinatorlayout.widget.CoordinatorLayout, int):boolean");
    }

    public final View A0S(View view) {
        if (!view.isNestedScrollingEnabled()) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View A0S = A0S(viewGroup.getChildAt(i));
                    if (A0S != null) {
                        return A0S;
                    }
                }
            }
            return null;
        }
        return view;
    }

    public BottomSheetBehavior() {
        this.A0F = 0;
        this.A0O = true;
        this.A0B = -1;
        this.A0d = null;
        this.A01 = 0.5f;
        this.A00 = -1.0f;
        this.A0N = true;
        this.A0G = 4;
        this.A0l = new ArrayList();
        this.A0Y = -1;
        this.A0m = new C66376UEk(this);
    }
}
