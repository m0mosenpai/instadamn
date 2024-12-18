package X;

import android.widget.NumberPicker;

/* renamed from: X.OlE, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55520OlE implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;

    public C55520OlE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        if (this.A00 != 0) {
            InterfaceC09390do interfaceC09390do = ((C52122N4v) this.A01).A04;
            ((C50984Mfr) interfaceC09390do.getValue()).A01(i2 + 1);
            ((C50984Mfr) interfaceC09390do.getValue()).A00();
        } else {
            C210739Tv c210739Tv = ((N4O) this.A01).A02;
            if (c210739Tv == null) {
                C14360o3.A0F("musicOverlayDurationViewModel");
                throw C00O.createAndThrow();
            }
            MSX.A19(c210739Tv.A00, i2);
        }
    }
}
