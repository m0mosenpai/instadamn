package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.7SO, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C7SO implements C7QD {
    public final InterfaceC56392iX A00;
    public final InterfaceC165427aV A01;

    public final void A00(K2X k2x) {
        InterfaceC56392iX interfaceC56392iX = this.A00;
        interfaceC56392iX.setVisibility(0);
        ImageView imageView = (ImageView) interfaceC56392iX.getView();
        imageView.setVisibility(0);
        imageView.setBackgroundColor(k2x.A00);
        imageView.setImageTintList(ColorStateList.valueOf(k2x.A01));
        C0fQ.A00(new ViewOnClickListenerC48031LOa(this, k2x), imageView);
    }

    @Override // X.C7QD
    public final View BKF() {
        return this.A00.getView();
    }

    public C7SO(InterfaceC56392iX interfaceC56392iX, InterfaceC165427aV interfaceC165427aV) {
        this.A00 = interfaceC56392iX;
        this.A01 = interfaceC165427aV;
    }
}
