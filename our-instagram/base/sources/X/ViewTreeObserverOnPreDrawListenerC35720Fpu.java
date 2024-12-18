package X;

import android.animation.TimeInterpolator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.ui.widget.inlineerror.InlineErrorMessageView;

/* renamed from: X.Fpu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewTreeObserverOnPreDrawListenerC35720Fpu implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;

    public ViewTreeObserverOnPreDrawListenerC35720Fpu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        BaseFragmentActivity baseFragmentActivity;
        View findViewById;
        switch (this.A00) {
            case 0:
                AbstractC59962oe abstractC59962oe = (AbstractC59962oe) this.A01;
                View view = abstractC59962oe.mView;
                if (view == null) {
                    return true;
                }
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (abstractC59962oe.isAdded()) {
                    Activity rootActivity = abstractC59962oe.getRootActivity();
                    if (!(rootActivity instanceof BaseFragmentActivity) || (baseFragmentActivity = (BaseFragmentActivity) rootActivity) == null) {
                        return true;
                    }
                    baseFragmentActivity.A0Z();
                    baseFragmentActivity.A0d();
                    return false;
                }
                return false;
            case 1:
                ViewGroup viewGroup = ((EVK) this.A01).A05;
                viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
                TimeInterpolator timeInterpolator = InlineErrorMessageView.A09;
                FC5.A00(viewGroup);
                return true;
            case 2:
                View view2 = ((GBE) this.A01).A02;
                view2.getViewTreeObserver().removeOnPreDrawListener(this);
                view2.setTranslationY(view2.getHeight() / 4);
                return false;
            default:
                InlineErrorMessageView inlineErrorMessageView = (InlineErrorMessageView) this.A01;
                TimeInterpolator timeInterpolator2 = InlineErrorMessageView.A09;
                int i = inlineErrorMessageView.A00;
                int i2 = inlineErrorMessageView.A03;
                if (i == 0) {
                    if (i2 != 0) {
                        throw AbstractC166987dD.A14("Descendant view was provided without specifying the error background");
                    }
                } else {
                    if (i2 == 0) {
                        findViewById = inlineErrorMessageView.getChildAt(0);
                        inlineErrorMessageView.A05 = findViewById;
                        if (findViewById == null) {
                            throw AbstractC166987dD.A14("Error background was provided but no child view exists to apply it to");
                        }
                    } else {
                        findViewById = inlineErrorMessageView.findViewById(i2);
                        inlineErrorMessageView.A05 = findViewById;
                        if (findViewById == null) {
                            throw AbstractC166987dD.A14("Descendant view (to apply error background to) wasn't found by provided id");
                        }
                    }
                    inlineErrorMessageView.A04 = findViewById.getBackground();
                }
                inlineErrorMessageView.getViewTreeObserver().removeOnPreDrawListener(this);
                return true;
        }
    }
}
