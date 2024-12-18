package X;

import android.os.Bundle;
import android.view.View;

/* renamed from: X.OjG, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class ViewOnClickListenerC55405OjG implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;

    public ViewOnClickListenerC55405OjG(Object obj, int i, int i2, int i3) {
        this.A00 = i3;
        this.A03 = obj;
        this.A01 = i;
        this.A02 = i2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        int i2;
        O86 o86;
        if (this.A00 != 0) {
            A05 = C0f9.A05(-1533051804);
            C52577NNx c52577NNx = (C52577NNx) this.A03;
            int i3 = this.A01;
            C50902MeX c50902MeX = (C50902MeX) c52577NNx.A07.getValue();
            O86 o862 = c50902MeX.A00;
            if (o862 != null) {
                i2 = o862.A01.size();
            } else {
                i2 = 0;
            }
            if (i3 < i2 && (o86 = c50902MeX.A00) != null) {
                O86 o863 = new O86(o86.A01, i3);
                c50902MeX.A00 = o863;
                c50902MeX.A03.Egh(o863);
            }
            OAT oat = ((NOX) c52577NNx.A09.getValue()).A06;
            int i4 = this.A02;
            InterfaceC58268PsC interfaceC58268PsC = oat.A00;
            String str = oat.A01;
            String A01 = AnonymousClass001.A01('/', i3, i4);
            String str2 = oat.A02;
            Bundle A0b = AbstractC166987dD.A0b();
            if (str2 != null) {
                A0b.putString("form_id", str2);
            }
            interfaceC58268PsC.Ci4(A0b, str, "lead_gen_thank_you_screen_with_multi_submit", "multi_submit_ads_continue_button_click", A01);
            i = 873691708;
        } else {
            A05 = C0f9.A05(1445207475);
            InterfaceC16620sF interfaceC16620sF = ((C51161Mj4) this.A03).A03;
            if (interfaceC16620sF != null) {
                interfaceC16620sF.invoke(Integer.valueOf(this.A01), Integer.valueOf(this.A02));
            }
            i = 8527234;
        }
        C0f9.A0C(i, A05);
    }
}
