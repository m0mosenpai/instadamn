package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes11.dex */
public final class WOM implements ViewTreeObserver.OnPreDrawListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WOM(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        int i = this.A00;
        View view = (View) this.A01;
        switch (i) {
            case 0:
                MSX.A13(view, this);
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                W3M w3m = (W3M) this.A02;
                w3m.A0A.set(iArr[0], iArr[1], r2 + view.getWidth(), iArr[1] + view.getHeight());
                ViewGroup viewGroup = w3m.A0B;
                float width = viewGroup.getWidth() / (view.getWidth() / view.getHeight());
                float height = (viewGroup.getHeight() - width) * 0.5f;
                w3m.A09.set(0.0f, height, viewGroup.getWidth(), width + height);
                return true;
            case 1:
                view.setScrollY(((C65853TvE) this.A02).A00);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (!viewTreeObserver.isAlive()) {
                    return true;
                }
                viewTreeObserver.removeOnPreDrawListener(this);
                return true;
            default:
                MSX.A13(view, this);
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                ViewOnKeyListenerC67975V4q viewOnKeyListenerC67975V4q = (ViewOnKeyListenerC67975V4q) this.A02;
                int[] iArr3 = viewOnKeyListenerC67975V4q.A0K;
                int i2 = iArr3[0] - iArr2[0];
                int i3 = iArr3[1] - iArr2[1];
                if (viewOnKeyListenerC67975V4q.A0L != null) {
                    float width2 = r1[0] / view.getWidth();
                    view.setPivotX(0.0f);
                    view.setPivotY(0.0f);
                    view.setScaleX(width2);
                    view.setScaleY(r1[1] / view.getHeight());
                }
                view.setTranslationX(i2);
                view.setTranslationY(i3);
                C55982hj c55982hj = viewOnKeyListenerC67975V4q.A0E;
                c55982hj.A08(0.0d, true);
                c55982hj.A0A(viewOnKeyListenerC67975V4q);
                c55982hj.A03();
                return true;
        }
    }
}
