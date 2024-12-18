package X;

import android.widget.NumberPicker;

/* loaded from: classes11.dex */
public final class WP1 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    public WP1(NumberPicker numberPicker, NumberPicker numberPicker2, C15100pQ c15100pQ, C15100pQ c15100pQ2, Integer[] numArr, int i, int i2, int i3) {
        this.A00 = i3;
        this.A07 = numArr;
        this.A05 = numberPicker;
        this.A06 = c15100pQ;
        this.A04 = c15100pQ2;
        this.A02 = i;
        this.A03 = numberPicker2;
        this.A01 = i2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        Integer[] numArr = (Integer[]) this.A07;
        NumberPicker numberPicker2 = (NumberPicker) this.A05;
        C15100pQ c15100pQ = (C15100pQ) this.A06;
        C15100pQ c15100pQ2 = (C15100pQ) this.A04;
        int i3 = this.A02;
        NumberPicker numberPicker3 = (NumberPicker) this.A03;
        int i4 = this.A01;
        int intValue = numArr[numberPicker2.getValue()].intValue();
        if (c15100pQ.A00 == 0 && c15100pQ2.A00 == 0 && intValue <= i3 && numberPicker3.getValue() < i4) {
            numberPicker3.setValue(i4);
        }
    }
}
