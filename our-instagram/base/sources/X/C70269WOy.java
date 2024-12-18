package X;

import android.widget.NumberPicker;

/* renamed from: X.WOy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70269WOy implements NumberPicker.OnScrollListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ NumberPicker A02;
    public final /* synthetic */ NumberPicker A03;
    public final /* synthetic */ C15100pQ A04;
    public final /* synthetic */ C15100pQ A05;
    public final /* synthetic */ Integer[] A06;

    public C70269WOy(NumberPicker numberPicker, NumberPicker numberPicker2, C15100pQ c15100pQ, C15100pQ c15100pQ2, Integer[] numArr, int i, int i2) {
        this.A05 = c15100pQ;
        this.A06 = numArr;
        this.A03 = numberPicker;
        this.A04 = c15100pQ2;
        this.A01 = i;
        this.A02 = numberPicker2;
        this.A00 = i2;
    }

    @Override // android.widget.NumberPicker.OnScrollListener
    public final void onScrollStateChange(NumberPicker numberPicker, int i) {
        C15100pQ c15100pQ = this.A05;
        c15100pQ.A00 = i;
        Integer[] numArr = this.A06;
        NumberPicker numberPicker2 = this.A03;
        C15100pQ c15100pQ2 = this.A04;
        int i2 = this.A01;
        NumberPicker numberPicker3 = this.A02;
        int i3 = this.A00;
        int intValue = numArr[numberPicker2.getValue()].intValue();
        if (c15100pQ.A00 == 0 && c15100pQ2.A00 == 0 && intValue <= i2 && numberPicker3.getValue() < i3) {
            numberPicker3.setValue(i3);
        }
    }
}
