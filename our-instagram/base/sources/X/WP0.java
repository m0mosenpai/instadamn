package X;

import android.widget.NumberPicker;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;

/* loaded from: classes11.dex */
public final class WP0 implements NumberPicker.OnValueChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WP0(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj3;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.widget.NumberPicker.OnValueChangeListener
    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        int i3;
        long j;
        switch (this.A00) {
            case 0:
                AbstractC68223VIj.A00 = i2;
                C102884kP c102884kP = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE = (InterfaceC103384lE) this.A03;
                C6FX c6fx = new C6FX();
                c6fx.A01(Integer.valueOf(i2 + 1));
                C6FP.A03((C6FG) this.A01, c102884kP, c6fx.A00(), interfaceC103384lE);
                return;
            case 1:
                C102884kP c102884kP2 = (C102884kP) this.A02;
                InterfaceC103384lE interfaceC103384lE2 = (InterfaceC103384lE) this.A03;
                C6FX A0I = AbstractC31179DnN.A0I(c102884kP2);
                A0I.A02(Integer.valueOf(i));
                A0I.A03(Integer.valueOf(i2), 2);
                C6FG c6fg = (C6FG) this.A01;
                A0I.A03(c6fg, 3);
                AbstractC65702TsY.A1Q(c6fg, c102884kP2, A0I, interfaceC103384lE2);
                return;
            default:
                V02 v02 = (V02) this.A03;
                boolean A1N = AbstractC167007dF.A1N(i2);
                v02.A03 = A1N;
                NumberPicker numberPicker2 = (NumberPicker) this.A02;
                numberPicker2.setDisplayedValues(null);
                int i4 = 4;
                if (A1N) {
                    i4 = 6;
                }
                int i5 = 0;
                numberPicker2.setMinValue(0);
                numberPicker2.setMaxValue(i4 - 1);
                String[] strArr = new String[i4];
                do {
                    i3 = i5 + 1;
                    strArr[i5] = String.valueOf(i3);
                    i5 = i3;
                } while (i3 < i4);
                numberPicker2.setDisplayedValues(strArr);
                v02.A00 = numberPicker2.getValue() + 1;
                NumberPicker numberPicker3 = (NumberPicker) this.A01;
                numberPicker3.setDisplayedValues(null);
                numberPicker3.setMinValue(0);
                numberPicker3.setMaxValue(1);
                numberPicker3.setDisplayedValues(V02.A00(v02));
                long A03 = AbstractC50524MSc.A03();
                boolean z = v02.A03;
                long j2 = v02.A00;
                if (z) {
                    j = SandboxRepository.CACHE_TTL;
                } else {
                    j = 604800;
                }
                v02.A01 = A03 + (j2 * j);
                return;
        }
    }
}
