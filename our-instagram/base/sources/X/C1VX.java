package X;

import android.view.View;
import android.widget.ImageView;

/* renamed from: X.1VX, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1VX {
    public static C1V7 A00;
    public static C1V7 A01;
    public static C1V7 A02;
    public static C1V7 A03;
    public static final View.OnAttachStateChangeListener A04;

    static {
        C1V7 c1v7 = C1VY.A01;
        A03 = c1v7;
        C1V7 c1v72 = C1VY.A00;
        A02 = c1v72;
        A01 = c1v7;
        A00 = c1v72;
        A04 = new View.OnAttachStateChangeListener() { // from class: X.1Vb
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                Runnable Bm6;
                C14360o3.A0B(view, 0);
                InterfaceC59242nQ A002 = C1VX.A00(view);
                if (A002 != null && (Bm6 = A002.Bm6()) != null) {
                    Bm6.run();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C14360o3.A0B(view, 0);
                InterfaceC59242nQ A002 = C1VX.A00(view);
                if (A002 != null) {
                    if (((Boolean) C1VX.A01.get()).booleanValue()) {
                        C59232nO.A00().EE1(A002);
                    }
                    if (((Boolean) C1VX.A00.get()).booleanValue()) {
                        C59232nO.A00().EEG(A002);
                    }
                }
            }
        };
    }

    public static final InterfaceC59242nQ A00(View view) {
        Object background;
        if (view instanceof ImageView) {
            background = ((ImageView) view).getDrawable();
        } else {
            background = view.getBackground();
        }
        if (background instanceof InterfaceC59242nQ) {
            return (InterfaceC59242nQ) background;
        }
        return null;
    }
}
