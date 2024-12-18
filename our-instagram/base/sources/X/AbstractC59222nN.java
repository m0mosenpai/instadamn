package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.2nN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59222nN {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(final View view, final InterfaceC59212nM interfaceC59212nM, C27771Wf c27771Wf, InterfaceC59172nI interfaceC59172nI, final Object obj) {
        Object background;
        final InterfaceC59242nQ interfaceC59242nQ;
        Runnable Bm6;
        C14360o3.A0B(c27771Wf, 1);
        C59232nO.A01();
        Resources resources = view.getResources();
        C14360o3.A07(resources);
        new Rect(0, 0, view.getWidth(), view.getHeight());
        final C2nP c2nP = new C2nP(resources, c27771Wf, interfaceC59172nI, false);
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            background = imageView.getDrawable();
            if (!(background instanceof InterfaceC59242nQ)) {
                final InterfaceC59242nQ interfaceC59242nQ2 = (InterfaceC59242nQ) C59232nO.A00().AM5();
                if (((Boolean) C1VX.A03.get()).booleanValue()) {
                    interfaceC59242nQ2.EhD(new InterfaceC107934tc() { // from class: X.4tb
                        @Override // X.InterfaceC107934tc
                        public final void E1A(boolean z) {
                            if (!z) {
                                C59232nO.A00().EE1(InterfaceC59242nQ.this);
                                return;
                            }
                            Runnable Bm62 = InterfaceC59242nQ.this.Bm6();
                            if (Bm62 == null) {
                                return;
                            }
                            Bm62.run();
                        }
                    });
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                C14360o3.A0C(interfaceC59242nQ2, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                imageView.setImageDrawable((Drawable) interfaceC59242nQ2);
                interfaceC59242nQ = interfaceC59242nQ2;
            }
            interfaceC59242nQ = (InterfaceC59242nQ) background;
        } else {
            background = view.getBackground();
            if (!(background instanceof InterfaceC59242nQ)) {
                final InterfaceC59242nQ interfaceC59242nQ3 = (InterfaceC59242nQ) C59232nO.A00().AM5();
                if (((Boolean) C1VX.A03.get()).booleanValue()) {
                    interfaceC59242nQ3.EhD(new InterfaceC107934tc() { // from class: X.4tb
                        @Override // X.InterfaceC107934tc
                        public final void E1A(boolean z) {
                            if (!z) {
                                C59232nO.A00().EE1(InterfaceC59242nQ.this);
                                return;
                            }
                            Runnable Bm62 = InterfaceC59242nQ.this.Bm6();
                            if (Bm62 == null) {
                                return;
                            }
                            Bm62.run();
                        }
                    });
                }
                C14360o3.A0C(interfaceC59242nQ3, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                view.setBackground((Drawable) interfaceC59242nQ3);
                interfaceC59242nQ = interfaceC59242nQ3;
            }
            interfaceC59242nQ = (InterfaceC59242nQ) background;
        }
        C2nP BGo = interfaceC59242nQ.BGo();
        if (BGo != null && !BGo.equals(c2nP)) {
            C59232nO.A00().EEL(interfaceC59242nQ);
        }
        interfaceC59242nQ.EcP(new Runnable() { // from class: X.2ne
            @Override // java.lang.Runnable
            public final void run() {
                C1WN A00 = C59232nO.A00();
                InterfaceC59242nQ interfaceC59242nQ4 = interfaceC59242nQ;
                C2nP c2nP2 = c2nP;
                Object obj2 = obj;
                View view2 = view;
                A00.AUt(new Rect(0, 0, view2.getWidth(), view2.getHeight()), null, null, null, interfaceC59242nQ4, c2nP2, interfaceC59212nM, null, obj2);
            }
        });
        if ((((Boolean) C1VX.A02.get()).booleanValue() || view.isAttachedToWindow()) && (Bm6 = interfaceC59242nQ.Bm6()) != null) {
            Bm6.run();
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = C1VX.A04;
        view.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        view.addOnAttachStateChangeListener(onAttachStateChangeListener);
    }
}
