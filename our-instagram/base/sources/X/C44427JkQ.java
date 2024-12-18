package X;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

/* renamed from: X.JkQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44427JkQ extends FrameLayout {
    public View.OnClickListener A00;
    public final View A01;
    public final View A02;

    public final void A01() {
        setFocusableInTouchMode(true);
        requestFocus();
        AbstractC43594JPz.A0H(this.A02).setDuration(250L).start();
        this.A01.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserverOnPreDrawListenerC48098LQy(this, 0));
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        C14360o3.A0B(keyEvent, 1);
        if (i == 4 && keyEvent.getAction() == 1) {
            A00();
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public final void A00() {
        AbstractC43594JPz.A0G(this.A02).setDuration(250L).start();
        View view = this.A01;
        view.animate().translationY(AbstractC166987dD.A08(view)).setInterpolator(new AccelerateInterpolator()).setDuration(250L).setListener(new JX2(this, 4)).start();
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public final void setOnHideListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44427JkQ(Context context, View view, int i, boolean z) {
        super(context);
        AbstractC167017dG.A1P(context, view);
        this.A01 = view;
        View view2 = new View(context);
        AbstractC31174DnI.A1C(view2, i);
        view2.setOnClickListener(LQ0.A01(this, 39));
        view2.setAlpha(0.0f);
        this.A02 = view2;
        addView(view2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.gravity = 80;
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
        addView(view, layoutParams);
    }
}
