package X;

import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.834, reason: invalid class name */
/* loaded from: classes4.dex */
public class AnonymousClass834 implements AnonymousClass835 {
    public A89 A00;
    public final View A01;

    public AnonymousClass834(View view) {
        C14360o3.A0B(view, 1);
        this.A01 = view;
    }

    @Override // X.AnonymousClass835
    public final boolean AJh(int i, int i2, boolean z) {
        Rect rect = new Rect();
        View view = getView();
        if (view.getVisibility() != 0) {
            return false;
        }
        if (z) {
            view.getGlobalVisibleRect(rect);
        } else {
            view.getHitRect(rect);
        }
        return rect.contains(i, i2);
    }

    @Override // X.AnonymousClass835
    public final View getView() {
        if (this instanceof C8G3) {
            return ((C8G3) this).A00;
        }
        if (this instanceof C8GA) {
            return ((C8GA) this).A00;
        }
        if (this instanceof C184698Hk) {
            return ((C184698Hk) this).A03;
        }
        return this.A01;
    }

    public final void A00(String str) {
        View view = getView();
        if (view instanceof IgTextView) {
            C14360o3.A0C(view, AbstractC43591JPw.A00(3));
            ((TextView) view).setText(str);
        }
    }

    @Override // X.AnonymousClass835
    public final C184708Hl Csh() {
        return new C184708Hl(getView());
    }

    @Override // X.AnonymousClass835
    public final void EPa(float f) {
        View view = getView();
        view.setAlpha(f);
        if (view instanceof ImageView) {
            int A02 = (int) AbstractC13600mm.A02(f, 0.0f, 1.0f, 0.0f, 255.0f);
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setImageAlpha(A02);
        }
    }

    @Override // X.AnonymousClass835
    public final void ERh(int i) {
        View view = getView();
        if (!(view instanceof ImageView)) {
            String A0R = AnonymousClass001.A0R("setColorFilter() called with a View of type ", view.getClass().getSimpleName());
            C14360o3.A0B(A0R, 1);
            AbstractC12120kG.A04("CameraButtonImpl", A0R, 817903175, null);
        } else {
            C14360o3.A0C(view, "null cannot be cast to non-null type android.widget.ImageView");
            ((ImageView) view).setColorFilter(i, PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // X.AnonymousClass835
    public final void EW1(final Drawable drawable) {
        View view = getView();
        if (!(view instanceof ImageView)) {
            String A0R = AnonymousClass001.A0R("setImageDrawable() called with a View of type ", view.getClass().getSimpleName());
            C14360o3.A0B(A0R, 1);
            AbstractC12120kG.A04("CameraButtonImpl", A0R, 817903175, null);
            return;
        }
        C11T.A02(new Runnable() { // from class: X.8G9
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = this.getView();
                C14360o3.A0C(view2, "null cannot be cast to non-null type android.widget.ImageView");
                ((ImageView) view2).setImageDrawable(drawable);
            }
        });
    }

    @Override // X.AnonymousClass835
    public final void EhF(boolean z, boolean z2) {
        View[] viewArr = {getView()};
        if (z) {
            C55942hf c55942hf = C150956qv.A02;
            AbstractC125325le.A04(null, viewArr, z2);
        } else {
            C150956qv.A08(viewArr, z2);
        }
    }

    @Override // X.AnonymousClass835
    public final void setEnabled(boolean z) {
        getView().setEnabled(z);
    }
}
