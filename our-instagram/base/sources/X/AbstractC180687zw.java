package X;

import android.widget.TextView;

/* renamed from: X.7zw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC180687zw {
    public static final void A00(C180677zv c180677zv, InterfaceC16820sZ interfaceC16820sZ, boolean z) {
        TextView textView;
        InterfaceC56392iX interfaceC56392iX = c180677zv.A09;
        int i = 8;
        if (z) {
            i = 0;
        }
        interfaceC56392iX.setVisibility(i);
        if (z && (textView = (TextView) interfaceC56392iX.getView()) != null) {
            float f = 1.0f;
            if (AbstractC13620mo.A02(textView.getContext())) {
                f = -1.0f;
            }
            textView.setRotation((-4.9f) * f);
            float f2 = c180677zv.A03;
            textView.setTranslationX(f * (-1.8f) * f2);
            textView.setTranslationY(f2 * (-1.3f));
            textView.setGravity(17);
            AbstractC14680og.A02(textView, C05F.A00, false);
            interfaceC16820sZ.invoke();
        }
    }
}
