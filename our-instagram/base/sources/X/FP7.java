package X;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class FP7 {
    public final /* synthetic */ C32727Eas A00;

    public FP7(C32727Eas c32727Eas) {
        this.A00 = c32727Eas;
    }

    public final void A00(EnumC33424Epv enumC33424Epv) {
        C32727Eas c32727Eas = this.A00;
        c32727Eas.getAdapter().A08(C16930sl.A00);
        c32727Eas.getAdapter().notifyDataSetChanged();
        ((AbstractC32730Eaw) c32727Eas.A01.getValue()).A0G(enumC33424Epv);
        C35267Fh2 c35267Fh2 = (C35267Fh2) ((EOD) c32727Eas).A04.getValue();
        InterfaceC02590Ai A00 = C35267Fh2.A00(c35267Fh2);
        if (A00.isSampled()) {
            C35267Fh2.A04(A00, c35267Fh2);
            AbstractC31171DnF.A1B(A00, "filter_suggested_channels");
            AbstractC31171DnF.A1E(A00, "inbox_directory_sheet");
            AbstractC25232BEp.A1K(A00, "pill_button");
            AbstractC31172DnG.A1P(A00, c35267Fh2.A00);
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("chosen_filter", enumC33424Epv.A03);
            AbstractC31174DnI.A1F(A00, A1G);
        }
    }
}
