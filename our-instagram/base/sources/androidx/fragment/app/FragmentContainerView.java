package androidx.fragment.app;

import X.AbstractC010103p;
import X.AbstractC10360h2;
import X.AnonymousClass001;
import X.C011504d;
import X.C016206f;
import X.C05X;
import X.C14240no;
import X.C14360o3;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.facebook.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public boolean A00;
    public View.OnApplyWindowInsetsListener A01;
    public final List A02;
    public final List A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context) {
        super(context);
        C14360o3.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C14360o3.A0B(view, 0);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof Fragment) && tag != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(view);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C011504d A05;
        C14360o3.A0B(windowInsets, 0);
        C011504d c011504d = new C011504d(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.A01;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            C14360o3.A07(onApplyWindowInsets);
            A05 = new C011504d(onApplyWindowInsets);
        } else {
            A05 = AbstractC010103p.A05(this, c011504d);
        }
        if (!A05.A00.A0G()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC010103p.A04(getChildAt(i), A05);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A00) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(view, 1);
        if (this.A00) {
            List list = this.A02;
            if ((!list.isEmpty()) && list.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        C14360o3.A0B(view, 0);
        this.A03.remove(view);
        if (this.A02.remove(view)) {
            this.A00 = true;
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        C14360o3.A0B(windowInsets, 0);
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        C14360o3.A0B(view, 0);
        A00(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        C14360o3.A0B(view, 0);
        A00(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        C14360o3.A0B(onApplyWindowInsetsListener, 0);
        this.A01 = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        C14360o3.A0B(view, 0);
        if (view.getParent() == this) {
            this.A03.add(view);
        }
        super.startViewTransition(view);
    }

    private final void A00(View view) {
        if (this.A03.contains(view)) {
            this.A02.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C14360o3.A07(childAt);
            A00(childAt);
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            View childAt = getChildAt(i4);
            C14360o3.A07(childAt);
            A00(childAt);
        }
        super.removeViewsInLayout(i, i2);
    }

    public final void setDrawDisappearingViewsLast(boolean z) {
        this.A00 = z;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public final Fragment getFragment() {
        AbstractC10360h2 abstractC10360h2;
        Fragment A02 = AbstractC10360h2.A02(this);
        if (A02 != null) {
            if (A02.isAdded()) {
                abstractC10360h2 = A02.getChildFragmentManager();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("The Fragment ");
                sb.append(A02);
                sb.append(" that owns View ");
                sb.append(this);
                sb.append(" has already been destroyed. Nested fragments should always use the child FragmentManager.");
                throw new IllegalStateException(sb.toString());
            }
        } else {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof FragmentActivity) {
                    FragmentActivity fragmentActivity = (FragmentActivity) context;
                    if (fragmentActivity != null) {
                        abstractC10360h2 = fragmentActivity.mFragments.A00.A03;
                    }
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("View ");
            sb2.append(this);
            sb2.append(" is not within a subclass of FragmentActivity.");
            throw new IllegalStateException(sb2.toString());
        }
        return abstractC10360h2.A0O(getId());
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 < childCount) {
                View childAt = getChildAt(childCount);
                C14360o3.A07(childAt);
                A00(childAt);
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        C14360o3.A07(childAt);
        A00(childAt);
        super.removeViewAt(i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        C14360o3.A0B(context, 1);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] iArr = C05X.A01;
            C14360o3.A08(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute != null && !isInEditMode()) {
                throw new UnsupportedOperationException(AnonymousClass001.A0v("FragmentContainerView must be within a FragmentActivity to use ", str, "=\"", classAttribute, '\"'));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, AbstractC10360h2 abstractC10360h2) {
        super(context, attributeSet);
        View view;
        String str;
        C14360o3.A0B(context, 1);
        C14360o3.A0B(attributeSet, 2);
        C14360o3.A0B(abstractC10360h2, 3);
        this.A02 = new ArrayList();
        this.A03 = new ArrayList();
        this.A00 = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = C05X.A01;
        C14360o3.A08(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment A0O = abstractC10360h2.A0O(id);
        if (classAttribute != null && A0O == null) {
            if (id == -1) {
                if (string != null) {
                    str = AnonymousClass001.A0R(" with tag ", string);
                } else {
                    str = "";
                }
                throw new IllegalStateException(AnonymousClass001.A0g("FragmentContainerView must have an android:id to add Fragment ", classAttribute, str));
            }
            Fragment A01 = abstractC10360h2.A0R().A01(context.getClassLoader(), classAttribute);
            C14360o3.A07(A01);
            A01.mFragmentId = id;
            A01.mContainerId = id;
            A01.mTag = string;
            A01.mFragmentManager = abstractC10360h2;
            A01.mHost = abstractC10360h2.A0A;
            A01.onInflate(context, attributeSet, (Bundle) null);
            C14240no c14240no = new C14240no(abstractC10360h2);
            c14240no.A0G = true;
            A01.mContainer = this;
            A01.mInDynamicContainer = true;
            c14240no.A0C(A01, string, getId());
            c14240no.A06();
        }
        Iterator it = abstractC10360h2.A0U.A02().iterator();
        while (it.hasNext()) {
            C016206f c016206f = (C016206f) it.next();
            Fragment fragment = c016206f.A02;
            if (fragment.mContainerId == getId() && (view = fragment.mView) != null && view.getParent() == null) {
                fragment.mContainer = this;
                c016206f.A01();
                c016206f.A03();
            }
        }
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C14360o3.A0B(context, 1);
    }
}
