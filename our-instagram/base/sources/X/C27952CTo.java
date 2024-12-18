package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.CTo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27952CTo {
    public final Context A00;
    public final InterfaceC75543aL A01;

    public final void A00(C206189Bb c206189Bb, C27890CRb c27890CRb) {
        C14360o3.A0B(c27890CRb, 0);
        if (c206189Bb != null) {
            TextView textView = c27890CRb.A02;
            textView.setText((CharSequence) c206189Bb.A03);
            AbstractC25227BEk.A11(textView);
            View view = c27890CRb.A00;
            InterfaceC75543aL interfaceC75543aL = this.A01;
            ViewOnClickListenerC28666ClE.A01(view, 4, c206189Bb);
            view.setVisibility(0);
            view.setEnabled(c206189Bb.A01);
            interfaceC75543aL.CzT(view);
            c27890CRb.A01.setVisibility(0);
            return;
        }
        c27890CRb.A01.setVisibility(8);
    }

    public C27952CTo(Context context, InterfaceC75543aL interfaceC75543aL) {
        AbstractC167017dG.A1P(context, interfaceC75543aL);
        this.A00 = context;
        this.A01 = interfaceC75543aL;
    }
}
