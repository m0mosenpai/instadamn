package X;

import android.os.Bundle;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class GOJ implements Runnable {
    public final /* synthetic */ EV0 A00;
    public final /* synthetic */ EDX A01;

    public GOJ(EV0 ev0, EDX edx) {
        this.A00 = ev0;
        this.A01 = edx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C32271EJg c32271EJg = (C32271EJg) this.A00.A01;
        c32271EJg.A07.getClass();
        EnumC33365Eoy enumC33365Eoy = c32271EJg.A0E;
        EnumC33365Eoy enumC33365Eoy2 = EnumC33365Eoy.A07;
        if (enumC33365Eoy == enumC33365Eoy2) {
            AbstractC31172DnG.A1A();
            ArrayList<String> arrayList = this.A01.A03;
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC34231F8d.A00(A0b, enumC33365Eoy2);
            A0b.putStringArrayList("backup_codes_key", arrayList);
            C33231ElP c33231ElP = new C33231ElP();
            AbstractC31177DnL.A15(c33231ElP, AbstractC31173DnH.A0J(A0b, c33231ElP, c32271EJg), c32271EJg.A07);
            return;
        }
        C53U c53u = (C53U) c32271EJg.getTargetFragment();
        if (c53u == null || !c53u.CK6()) {
            AbstractC25226BEj.A1Q(c32271EJg);
        }
        AbstractC25651Mw.A00(c32271EJg.A07).E4s(new C3HS(c32271EJg.requireContext(), AbstractC03270Dk.A02(c32271EJg.A07), this.A01.A01));
    }
}
