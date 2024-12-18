package X;

import android.view.View;

/* renamed from: X.5TN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5TN implements C5TO {
    public static final C5TN A00 = new Object();

    @Override // X.C5TO
    public final InterfaceC16820sZ COl(final C5TM c5tm) {
        View.OnAttachStateChangeListener onAttachStateChangeListener = new View.OnAttachStateChangeListener() { // from class: X.5TP
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
                C5TM c5tm2 = C5TM.this;
                if (!AbstractC105064oM.A02(c5tm2)) {
                    c5tm2.A04();
                }
            }
        };
        c5tm.addOnAttachStateChangeListener(onAttachStateChangeListener);
        InterfaceC1128257o interfaceC1128257o = new InterfaceC1128257o() { // from class: X.5TQ
            @Override // X.InterfaceC1128257o
            public final void DeW() {
                C5TM.this.A04();
            }
        };
        AbstractC105064oM.A00(c5tm).A00.add(interfaceC1128257o);
        return new C9FP(2, onAttachStateChangeListener, c5tm, interfaceC1128257o);
    }
}
