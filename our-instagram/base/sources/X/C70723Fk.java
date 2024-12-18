package X;

import android.view.View;

/* renamed from: X.3Fk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C70723Fk {
    public C70733Fl A00 = new C70733Fl();
    public final InterfaceC70703Fi A01;

    public final View A00(int i, int i2, int i3, int i4) {
        InterfaceC70703Fi interfaceC70703Fi = this.A01;
        int BbR = interfaceC70703Fi.BbR();
        int BbL = interfaceC70703Fi.BbL();
        int i5 = -1;
        if (i2 > i) {
            i5 = 1;
        }
        View view = null;
        while (i != i2) {
            View AnU = interfaceC70703Fi.AnU(i);
            int Anc = interfaceC70703Fi.Anc(AnU);
            int Ana = interfaceC70703Fi.Ana(AnU);
            C70733Fl c70733Fl = this.A00;
            c70733Fl.A04 = BbR;
            c70733Fl.A03 = BbL;
            c70733Fl.A02 = Anc;
            c70733Fl.A01 = Ana;
            c70733Fl.A00 = 0;
            c70733Fl.A00 = i3;
            if (c70733Fl.A00()) {
                return AnU;
            }
            if (i4 != 0) {
                c70733Fl.A00 = 0;
                c70733Fl.A00 = i4;
                if (c70733Fl.A00()) {
                    view = AnU;
                }
            }
            i += i5;
        }
        return view;
    }

    public final boolean A01(View view) {
        C70733Fl c70733Fl = this.A00;
        InterfaceC70703Fi interfaceC70703Fi = this.A01;
        int BbR = interfaceC70703Fi.BbR();
        int BbL = interfaceC70703Fi.BbL();
        int Anc = interfaceC70703Fi.Anc(view);
        int Ana = interfaceC70703Fi.Ana(view);
        c70733Fl.A04 = BbR;
        c70733Fl.A03 = BbL;
        c70733Fl.A02 = Anc;
        c70733Fl.A01 = Ana;
        c70733Fl.A00 = 0;
        c70733Fl.A00 = 24579;
        return c70733Fl.A00();
    }

    public C70723Fk(InterfaceC70703Fi interfaceC70703Fi) {
        this.A01 = interfaceC70703Fi;
    }
}
