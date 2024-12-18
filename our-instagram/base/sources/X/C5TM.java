package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.ComposeView;
import java.lang.ref.WeakReference;

/* renamed from: X.5TM, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5TM extends ViewGroup {
    public C57I A00;
    public WeakReference A01;
    public IBinder A02;
    public C57R A03;
    public InterfaceC16820sZ A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;

    public void A05(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    public void A06(C5Tl c5Tl, int i) {
        int i2;
        ComposeView composeView = (ComposeView) this;
        c5Tl.Enr(420213850);
        if ((i & 6) == 0) {
            int i3 = 2;
            if (c5Tl.AH6(composeView)) {
                i3 = 4;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-943498961, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:439)");
            }
            InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) composeView.A01.getValue();
            if (interfaceC16620sF == null) {
                c5Tl.Eno(358373017);
            } else {
                c5Tl.Eno(150107752);
                interfaceC16620sF.invoke(c5Tl, 0);
            }
            C117505Tk.A0L((C117505Tk) c5Tl, false);
            if (C0fH.A02()) {
                C0fH.A00(-2118539315);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C207089En(composeView, i, 1);
        }
    }

    public void A07(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    private final void A00() {
        if (this.A05) {
        } else {
            throw new UnsupportedOperationException(AnonymousClass001.A0g("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r5 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A01() {
        /*
            r8 = this;
            X.57R r0 = r8.A03
            if (r0 != 0) goto Lb7
            r4 = 0
            r2 = 1
            r8.A05 = r2     // Catch: java.lang.Throwable -> Lb1
            X.57I r6 = r8.A00     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto L35
            X.57I r6 = X.AnonymousClass571.A00(r8)     // Catch: java.lang.Throwable -> Lb1
            if (r6 != 0) goto Lad
            java.lang.ref.WeakReference r0 = r8.A01     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto La9
            java.lang.Object r6 = r0.get()     // Catch: java.lang.Throwable -> Lb1
            X.57I r6 = (X.C57I) r6     // Catch: java.lang.Throwable -> Lb1
            if (r6 == 0) goto La9
            boolean r0 = r6 instanceof androidx.compose.runtime.Recomposer     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L35
            r0 = r6
            androidx.compose.runtime.Recomposer r0 = (androidx.compose.runtime.Recomposer) r0     // Catch: java.lang.Throwable -> Lb1
            X.05A r0 = r0.A0K     // Catch: java.lang.Throwable -> Lb1
            java.lang.Object r1 = r0.getValue()     // Catch: java.lang.Throwable -> Lb1
            X.57T r1 = (X.C57T) r1     // Catch: java.lang.Throwable -> Lb1
            X.57T r0 = X.C57T.ShuttingDown     // Catch: java.lang.Throwable -> Lb1
            int r0 = r1.compareTo(r0)     // Catch: java.lang.Throwable -> Lb1
            if (r0 <= 0) goto La9
        L35:
            r0 = 11
            X.9Ed r1 = new X.9Ed     // Catch: java.lang.Throwable -> Lb1
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> Lb1
            r0 = -656146368(0xffffffffd8e40040, float:-2.0055178E15)
            X.5TR r7 = new X.5TR     // Catch: java.lang.Throwable -> Lb1
            r7.<init>(r0, r2, r1)     // Catch: java.lang.Throwable -> Lb1
            android.view.ViewGroup$LayoutParams r0 = X.C5TT.A00     // Catch: java.lang.Throwable -> Lb1
            X.C5TU.A00()     // Catch: java.lang.Throwable -> Lb1
            int r0 = r8.getChildCount()     // Catch: java.lang.Throwable -> Lb1
            if (r0 <= 0) goto La5
            android.view.View r5 = r8.getChildAt(r4)     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r5 instanceof androidx.compose.ui.platform.AndroidComposeView     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L5b
            androidx.compose.ui.platform.AndroidComposeView r5 = (androidx.compose.ui.platform.AndroidComposeView) r5     // Catch: java.lang.Throwable -> Lb1
            if (r5 != 0) goto L6d
        L5b:
            android.content.Context r1 = r8.getContext()     // Catch: java.lang.Throwable -> Lb1
            X.12W r0 = r6.A08()     // Catch: java.lang.Throwable -> Lb1
            androidx.compose.ui.platform.AndroidComposeView r5 = new androidx.compose.ui.platform.AndroidComposeView     // Catch: java.lang.Throwable -> Lb1
            r5.<init>(r1, r0)     // Catch: java.lang.Throwable -> Lb1
            android.view.ViewGroup$LayoutParams r0 = X.C5TT.A00     // Catch: java.lang.Throwable -> Lb1
            r8.addView(r5, r0)     // Catch: java.lang.Throwable -> Lb1
        L6d:
            X.599 r1 = r5.A0Y     // Catch: java.lang.Throwable -> Lb1
            X.5TX r0 = new X.5TX     // Catch: java.lang.Throwable -> Lb1
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lb1
            X.5Ta r3 = new X.5Ta     // Catch: java.lang.Throwable -> Lb1
            r3.<init>(r0, r6)     // Catch: java.lang.Throwable -> Lb1
            r1 = 2131444139(0x7f0b41ab, float:1.8510366E38)
            java.lang.Object r2 = r5.getTag(r1)     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = r2 instanceof X.C5U0     // Catch: java.lang.Throwable -> Lb1
            if (r0 == 0) goto L88
            X.5U0 r2 = (X.C5U0) r2     // Catch: java.lang.Throwable -> Lb1
            if (r2 != 0) goto L90
        L88:
            X.5U0 r2 = new X.5U0     // Catch: java.lang.Throwable -> Lb1
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> Lb1
            r5.setTag(r1, r2)     // Catch: java.lang.Throwable -> Lb1
        L90:
            r2.ES1(r7)     // Catch: java.lang.Throwable -> Lb1
            X.12W r0 = r5.A05     // Catch: java.lang.Throwable -> Lb1
            X.12W r1 = r6.A08()     // Catch: java.lang.Throwable -> Lb1
            boolean r0 = X.C14360o3.A0K(r0, r1)     // Catch: java.lang.Throwable -> Lb1
            if (r0 != 0) goto La2
            r5.setCoroutineContext(r1)     // Catch: java.lang.Throwable -> Lb1
        La2:
            r8.A03 = r2     // Catch: java.lang.Throwable -> Lb1
            goto Lb5
        La5:
            r8.removeAllViews()     // Catch: java.lang.Throwable -> Lb1
            goto L5b
        La9:
            androidx.compose.runtime.Recomposer r6 = X.AnonymousClass571.A02(r8)     // Catch: java.lang.Throwable -> Lb1
        Lad:
            r8.A02(r6)     // Catch: java.lang.Throwable -> Lb1
            goto L35
        Lb1:
            r0 = move-exception
            r8.A05 = r4
            throw r0
        Lb5:
            r8.A05 = r4
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5TM.A01():void");
    }

    private final void A02(C57I c57i) {
        if ((!(c57i instanceof Recomposer) || ((C57T) ((Recomposer) c57i).A0K.getValue()).compareTo(C57T.ShuttingDown) > 0) && c57i != null) {
            this.A01 = new WeakReference(c57i);
        }
    }

    private final void setParentContext(C57I c57i) {
        if (this.A00 != c57i) {
            this.A00 = c57i;
            if (c57i != null) {
                this.A01 = null;
            }
            C57R c57r = this.A03;
            if (c57r != null) {
                c57r.dispose();
                this.A03 = null;
                if (isAttachedToWindow()) {
                    A01();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A02 != iBinder) {
            this.A02 = iBinder;
            this.A01 = null;
        }
    }

    public final void A03() {
        if (this.A00 == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        A01();
    }

    public final void A04() {
        C57R c57r = this.A03;
        if (c57r != null) {
            c57r.dispose();
        }
        this.A03 = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        if (this.A03 == null) {
            return false;
        }
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.A07;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.A06 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A07 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((InterfaceC1128457r) childAt)).A0A = z;
        }
    }

    public final void setViewCompositionStrategy(C5TO c5to) {
        InterfaceC16820sZ interfaceC16820sZ = this.A04;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A04 = c5to.COl(this);
    }

    public C5TM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        this.A04 = C5TN.A00.COl(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        A00();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = C0f9.A06(1154412312);
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            A01();
        }
        C0f9.A0D(-2031975127, A06);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        A01();
        A05(i, i2);
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A06 = true;
    }

    public final void setParentCompositionContext(C57I c57i) {
        setParentContext(c57i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        A07(z, i, i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        A00();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A00();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A00();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        A00();
        super.addView(view, i);
    }
}
