package X;

import android.view.View;

/* loaded from: classes4.dex */
public final class AS1 implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;

    public AS1(Object obj, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj;
        this.A01 = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A00 != 0) {
            A05 = C0f9.A05(508975552);
            C214969fY c214969fY = ((C9UJ) this.A02).A00;
            int i2 = this.A01;
            C218089kg c218089kg = c214969fY.A00;
            c218089kg.getClass();
            c218089kg.A00 = i2;
            c218089kg.A0A();
            C3DN A01 = C3DN.A00.A01(c214969fY.getContext());
            A01.getClass();
            A01.A0B();
            i = -1901806570;
        } else {
            A05 = C0f9.A05(573599742);
            C214979fZ c214979fZ = ((C9UK) this.A02).A00;
            int i3 = this.A01;
            c214979fZ.A00.getClass();
            C218059kd c218059kd = c214979fZ.A00;
            c218059kd.A00 = i3;
            C218059kd.A00(C5GJ.CREATE_MODE_VIEW_ALL_SELECTION, c218059kd);
            C3DN A012 = C3DN.A00.A01(c214979fZ.getContext());
            A012.getClass();
            A012.A0B();
            i = -383286014;
        }
        C0f9.A0C(i, A05);
    }
}
