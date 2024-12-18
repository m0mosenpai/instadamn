package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7SB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SB implements C7QD {
    public Float A00;
    public final InterfaceC56392iX A01;
    public final InterfaceC165507ad A02;

    public final void A02(C7BU c7bu) {
        InterfaceC56392iX interfaceC56392iX = this.A01;
        interfaceC56392iX.setVisibility(0);
        Float f = this.A00;
        if (f != null) {
            A01(f.floatValue());
        }
        interfaceC56392iX.getView().setBackgroundColor(c7bu.A00);
        ((ImageView) interfaceC56392iX.getView()).setImageTintList(ColorStateList.valueOf(c7bu.A01));
        C0fQ.A00(new ViewOnClickListenerC48032LOb(this, c7bu), interfaceC56392iX.getView());
    }

    public final void A00() {
        InterfaceC56392iX interfaceC56392iX = this.A01;
        interfaceC56392iX.setVisibility(8);
        if (interfaceC56392iX.CWW()) {
            interfaceC56392iX.getView().setOnClickListener(null);
        }
    }

    public final void A01(float f) {
        Float valueOf;
        InterfaceC56392iX interfaceC56392iX = this.A01;
        if (interfaceC56392iX.CGb() == 0) {
            interfaceC56392iX.getView().setTranslationX(f);
            valueOf = null;
        } else {
            valueOf = Float.valueOf(f);
        }
        this.A00 = valueOf;
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A01.getView();
    }

    public C7SB(InterfaceC56392iX interfaceC56392iX, InterfaceC165507ad interfaceC165507ad) {
        this.A01 = interfaceC56392iX;
        this.A02 = interfaceC165507ad;
    }
}
