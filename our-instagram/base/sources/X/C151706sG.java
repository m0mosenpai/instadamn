package X;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.6sG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151706sG {
    public final View A00;
    public final View A01;
    public final ViewGroup A04;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(C25074B7v.A00);
    public final InterfaceC09390do A02 = AbstractC09440dt.A01(MH3.A00);

    public final void A00(boolean z, InterfaceC16820sZ interfaceC16820sZ) {
        View view;
        double d;
        double d2;
        if (this.A04 != null && this.A00 != null && (view = this.A01) != null) {
            InterfaceC09390do interfaceC09390do = this.A03;
            C55982hj c55982hj = (C55982hj) interfaceC09390do.getValue();
            if (z) {
                d = 50.0d;
                d2 = 20.0d;
            } else {
                d = 60.0d;
                d2 = 16.0d;
            }
            c55982hj.A09(C55942hf.A04(d, d2));
            float width = (r7.getWidth() - view.getWidth()) / 2.0f;
            int i = 2;
            if (z) {
                i = 4;
            }
            C35866Fsg c35866Fsg = new C35866Fsg(this, interfaceC16820sZ, width, i);
            InterfaceC09390do interfaceC09390do2 = this.A02;
            ((C55982hj) interfaceC09390do2.getValue()).A0A(c35866Fsg);
            ((C55982hj) interfaceC09390do2.getValue()).A06(((C55982hj) interfaceC09390do2.getValue()).A09.A00 + 1.0d);
            ((C55982hj) interfaceC09390do.getValue()).A0A(new C35865Fsf(c35866Fsg, this, interfaceC16820sZ, z));
        }
    }

    public C151706sG(View view, View view2, ViewGroup viewGroup) {
        this.A04 = viewGroup;
        this.A00 = view;
        this.A01 = view2;
    }
}
