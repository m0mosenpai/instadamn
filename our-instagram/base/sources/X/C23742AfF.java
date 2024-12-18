package X;

import com.instagram.ui.widget.colourwheel.ColourWheelView;

/* renamed from: X.AfF, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23742AfF implements C8QQ {
    public final /* synthetic */ AM2 A00;
    public final /* synthetic */ ColourWheelView A01;

    public C23742AfF(AM2 am2, ColourWheelView colourWheelView) {
        this.A00 = am2;
        this.A01 = colourWheelView;
    }

    @Override // X.C8QQ
    public final void DQR() {
        ColourWheelView colourWheelView = this.A01;
        colourWheelView.setBaseDrawable(this.A00.A0B.A01());
        colourWheelView.A04();
    }
}
