package X;

import android.content.Context;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Recomposer;
import androidx.compose.ui.platform.AndroidComposeView;
import java.lang.ref.WeakReference;

/* renamed from: X.57i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1127657i extends ViewGroup {
    public WeakReference A00;
    public InterfaceC16820sZ A01;
    public IBinder A02;
    public View A03;
    public C57R A04;
    public C57I A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;

    public final void A06(C5Tl c5Tl, int i) {
        C57h c57h = (C57h) this;
        c5Tl.Enr(-1768631695);
        if (C0fH.A02()) {
            C0fH.A01(977627999, "com.facebook.compose.view.MetaComposeView.Content (MetaComposeView.kt:466)");
        }
        InterfaceC16620sF interfaceC16620sF = (InterfaceC16620sF) c57h.A02.getValue();
        if (interfaceC16620sF != null) {
            interfaceC16620sF.invoke(c5Tl, 0);
        }
        if (C0fH.A02()) {
            C0fH.A00(-1734818833);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C207089En(c57h, i, 2);
        }
    }

    public final void A07(C57I c57i) {
        C14360o3.A0B(c57i, 0);
        AbstractC09790fc.A01("MetaComposeView:prepareAndroidComposeView", -898549668);
        try {
            ViewGroup.LayoutParams layoutParams = AbstractC1128357p.A00;
            Context context = getContext();
            C14360o3.A07(context);
            this.A03 = new AndroidComposeView(context, c57i.A08());
            AbstractC09790fc.A00(-919021097);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-1046470899);
            throw th;
        }
    }

    public abstract boolean getShouldCreateCompositionOnAttachedToWindow();

    public abstract boolean getShouldUseCompositionWithReuse();

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setViewCompositionStrategy(InterfaceC1128057m interfaceC1128057m) {
        C14360o3.A0B(interfaceC1128057m, 0);
        InterfaceC16820sZ interfaceC16820sZ = this.A01;
        if (interfaceC16820sZ != null) {
            interfaceC16820sZ.invoke();
        }
        this.A01 = interfaceC1128057m.COm(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public static final C57I A01(AbstractC1127657i abstractC1127657i) {
        AbstractC09790fc.A01("MetaComposeView:resolveParentCompositionContext", -975649119);
        try {
            C57I c57i = abstractC1127657i.A05;
            if (c57i == null) {
                c57i = AnonymousClass571.A00(abstractC1127657i);
                if (c57i == null) {
                    WeakReference weakReference = abstractC1127657i.A00;
                    if (weakReference == null || (c57i = (C57I) weakReference.get()) == null || ((c57i instanceof Recomposer) && ((C57T) ((Recomposer) c57i).A0K.getValue()).compareTo(C57T.ShuttingDown) <= 0)) {
                        c57i = AnonymousClass571.A02(abstractC1127657i);
                    }
                }
                if ((!(c57i instanceof Recomposer) || ((C57T) ((Recomposer) c57i).A0K.getValue()).compareTo(C57T.ShuttingDown) > 0) && c57i != null) {
                    abstractC1127657i.A00 = new WeakReference(c57i);
                }
            }
            AbstractC09790fc.A00(1287807597);
            return c57i;
        } catch (Throwable th) {
            AbstractC09790fc.A00(378733707);
            throw th;
        }
    }

    private final void A02() {
        if (this.A06) {
        } else {
            throw new UnsupportedOperationException(AnonymousClass001.A0g("Cannot add views to ", getClass().getSimpleName(), "; only Compose content is supported"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r5 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void A03() {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1127657i.A03():void");
    }

    private final void setParentContext(C57I c57i) {
        AbstractC09790fc.A01("MetaComposeView:parentContext:set", -672410696);
        try {
            if (this.A05 != c57i) {
                this.A05 = c57i;
                if (c57i != null) {
                    this.A00 = null;
                }
                C57R c57r = this.A04;
                if (c57r != null) {
                    c57r.dispose();
                    this.A04 = null;
                    if (isAttachedToWindow()) {
                        A03();
                    }
                }
            }
            AbstractC09790fc.A00(2042927658);
        } catch (Throwable th) {
            AbstractC09790fc.A00(1301400345);
            throw th;
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.A02 != iBinder) {
            this.A02 = iBinder;
            this.A00 = null;
        }
    }

    public final void A04() {
        AbstractC09790fc.A01("MetaComposeView:createComposition", 1192802027);
        try {
            if (this.A05 == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            A03();
            AbstractC09790fc.A00(1620389735);
        } catch (Throwable th) {
            AbstractC09790fc.A00(229650450);
            throw th;
        }
    }

    public final void A05() {
        AbstractC09790fc.A01("MetaComposeView:disposeComposition", -1368254204);
        try {
            C57R c57r = this.A04;
            if (c57r != null) {
                c57r.dispose();
            }
            this.A04 = null;
            requestLayout();
            AbstractC09790fc.A00(1945816727);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-2002120086);
            throw th;
        }
    }

    public final boolean getHasComposition() {
        if (this.A04 == null) {
            return false;
        }
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.A08;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.A07 && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AbstractC09790fc.A01("MetaComposeView:internalOnLayout", 1776251124);
        try {
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
            }
            AbstractC09790fc.A00(-1775719634);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-665712014);
            throw th;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        AbstractC09790fc.A01("MetaComposeView:onMeasure", -1112114465);
        try {
            A03();
            AbstractC09790fc.A01("MetaComposeView:internalOnMeasure", -1506562380);
            try {
                View childAt = getChildAt(0);
                if (childAt == null) {
                    super.onMeasure(i, i2);
                    i3 = 919167057;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
                    setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
                    i3 = -1656843331;
                }
                AbstractC09790fc.A00(i3);
                AbstractC09790fc.A00(719488236);
            } catch (Throwable th) {
                AbstractC09790fc.A00(-188305882);
                throw th;
            }
        } catch (Throwable th2) {
            AbstractC09790fc.A00(15427114);
            throw th2;
        }
    }

    public final void setShowLayoutBounds(boolean z) {
        this.A08 = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((AndroidComposeView) ((InterfaceC1128457r) childAt)).A0A = z;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        A02();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A02();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int A06 = C0f9.A06(-110673324);
        AbstractC09790fc.A01("MetaComposeView:onAttachedToWindow", -1481876576);
        try {
            super.onAttachedToWindow();
            setPreviousAttachedWindowToken(getWindowToken());
            if (((C57h) this).A00) {
                A03();
            }
            AbstractC09790fc.A00(-1454115807);
            C0f9.A0D(-1840206755, A06);
        } catch (Throwable th) {
            AbstractC09790fc.A00(-2055884953);
            C0f9.A0D(-1898373036, A06);
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z) {
        super.setTransitionGroup(z);
        this.A07 = true;
    }

    public final void setParentCompositionContext(C57I c57i) {
        setParentContext(c57i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        A02();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        A02();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        A02();
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        A02();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        A02();
        super.addView(view, i);
    }
}
