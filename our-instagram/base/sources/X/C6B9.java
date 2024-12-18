package X;

import com.facebook.flexlayout.layoutoutput.LayoutOutput;

/* renamed from: X.6B9, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6B9 implements C2W5 {
    public final Integer[] A00;
    public final LayoutOutput A01;
    public final C2WC A02;

    @Override // X.C2W5
    public final Object BMS() {
        return null;
    }

    @Override // X.C2W5
    public final int Bat() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bau() {
        return 0;
    }

    @Override // X.C2W5
    public final int Baw() {
        return 0;
    }

    @Override // X.C2W5
    public final int Bax() {
        return 0;
    }

    @Override // X.C2W5
    public final C2W5 AnV(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (C2W5) layoutOutput.measureResults[i];
    }

    @Override // X.C2W5
    public final int Ang() {
        return this.A01.measureResults.length;
    }

    @Override // X.C2W5
    public final C2WC Bmi() {
        return this.A02;
    }

    @Override // X.C2W5
    public final int CI4(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[C05F.A00(3).length + (i * C05F.A00(4).length)];
    }

    @Override // X.C2W5
    public final int CIb(int i) {
        LayoutOutput layoutOutput = this.A01;
        Integer[] numArr = this.A00;
        if (numArr != null && numArr.length > i) {
            i = numArr[i].intValue();
        }
        return (int) layoutOutput.arr[C05F.A00(3).length + (i * C05F.A00(4).length) + 1];
    }

    @Override // X.C2W5
    public final int getHeight() {
        return (int) this.A01.arr[1];
    }

    @Override // X.C2W5
    public final int getWidth() {
        return (int) this.A01.arr[0];
    }

    public C6B9(LayoutOutput layoutOutput, C2WC c2wc, Integer[] numArr) {
        this.A01 = layoutOutput;
        this.A02 = c2wc;
        this.A00 = numArr;
    }
}
