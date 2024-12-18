package X;

import android.view.View;
import android.widget.CompoundButton;

/* loaded from: classes11.dex */
public final class U6X implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ U6V A01;
    public final /* synthetic */ C6FG A02;
    public final /* synthetic */ C102884kP A03;
    public final /* synthetic */ InterfaceC103384lE A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public U6X(View view, U6V u6v, C6FG c6fg, C102884kP c102884kP, InterfaceC103384lE interfaceC103384lE, boolean z, boolean z2) {
        this.A01 = u6v;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = interfaceC103384lE;
        this.A03 = c102884kP;
        this.A02 = c6fg;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            XEP xep = (XEP) this.A00;
            xep.setOnCheckedChangeListener(null);
            xep.setChecked(this.A05);
            xep.setOnCheckedChangeListener(this);
        }
        InterfaceC103384lE interfaceC103384lE = this.A04;
        if (interfaceC103384lE != null) {
            C102884kP c102884kP = this.A03;
            C6FX A0I = AbstractC31179DnN.A0I(c102884kP);
            A0I.A02(Boolean.valueOf(z));
            C6FG c6fg = this.A02;
            A0I.A03(c6fg, 2);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, A0I, interfaceC103384lE);
        }
    }
}
