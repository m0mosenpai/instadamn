package X;

import android.widget.RadioGroup;

/* loaded from: classes8.dex */
public final class LRJ implements RadioGroup.OnCheckedChangeListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LRJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        int i2 = this.A00;
        C35124FeR c35124FeR = (C35124FeR) AbstractC25225BEi.A13(this.A01, i);
        switch (i2) {
            case 0:
                boolean equals = "right_side".equals(c35124FeR.A02);
                C48605Leh c48605Leh = (C48605Leh) this.A02;
                C23031Ai c23031Ai = c48605Leh.A05;
                AbstractC167007dF.A1L(c23031Ai, c23031Ai.A61, C23031Ai.A8c, 297, equals);
                C48605Leh.A00(c48605Leh);
                MOU mou = c48605Leh.A00;
                if (mou == null) {
                    return;
                }
                mou.DSp();
                return;
            case 1:
                String str = c35124FeR.A02;
                C14360o3.A07(str);
                Integer A0i = AbstractC003100w.A0i(str);
                if (A0i == null) {
                    return;
                }
                C46054Ka9 c46054Ka9 = (C46054Ka9) this.A02;
                int intValue = A0i.intValue();
                InterfaceC19610xo ARD = ((C44100JeP) AbstractC43592JPx.A0c(c46054Ka9.A0B).A0A.getValue()).A00.ARD();
                ARD.E7D("EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS", intValue);
                ARD.apply();
                return;
            default:
                String str2 = c35124FeR.A02;
                C14360o3.A07(str2);
                Integer A0i2 = AbstractC003100w.A0i(str2);
                if (A0i2 != null) {
                    C46054Ka9 c46054Ka92 = (C46054Ka9) this.A02;
                    int intValue2 = A0i2.intValue();
                    Jn4 A0c = AbstractC43592JPx.A0c(c46054Ka92.A0B);
                    InterfaceC09390do interfaceC09390do = A0c.A0A;
                    C44100JeP c44100JeP = (C44100JeP) interfaceC09390do.getValue();
                    if (C44100JeP.A04(c44100JeP)) {
                        InterfaceC19610xo ARD2 = c44100JeP.A00.ARD();
                        ARD2.E7D("EB_CUTOVER_TIMESTAMP_OVERRIDE_MS", intValue2);
                        ARD2.apply();
                    }
                    if (C6CB.A02(AbstractC43593JPy.A0P(A0c.A0C), 36315928476651325L) && intValue2 >= ((LF2) A0c.A0B.getValue()).A00) {
                        InterfaceC19610xo ARD3 = ((C44100JeP) interfaceC09390do.getValue()).A00.ARD();
                        ARD3.EEj("EB_BlOCK_FIRST_SHOWN_TIMESTAMP_OVERRIDE_MS");
                        ARD3.apply();
                    }
                    A0c.A0K.F8m(A0i2);
                    return;
                }
                return;
        }
    }
}
