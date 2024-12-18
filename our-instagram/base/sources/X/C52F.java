package X;

import com.instagram.common.session.UserSession;
import com.instagram.igsignals.core.IgSignalsExampleData;

/* renamed from: X.52F, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C52F implements InterfaceC108204u7 {
    public IgSignalsExampleData A00;
    public final UserSession A02;
    public final InterfaceC09390do A03 = AbstractC09440dt.A01(new C206879Ds(this, 12));
    public boolean A01 = true;

    public C52F(UserSession userSession) {
        this.A02 = userSession;
    }

    @Override // X.InterfaceC108204u7
    public final IgSignalsExampleData EKW(String str) {
        IgSignalsExampleData igSignalsExampleData = this.A00;
        this.A00 = null;
        if (igSignalsExampleData == null && this.A01) {
            String string = ((InterfaceC19630xq) this.A03.getValue()).getString("casper_example", null);
            if (string == null) {
                string = "";
            }
            if (string.length() != 0) {
                C3R9[] c3r9Arr = IgSignalsExampleData.A06;
                igSignalsExampleData = IgSignalsExampleData.Companion.A00(string);
            }
        }
        if (this.A01) {
            InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A03.getValue()).ARD();
            ARD.EEj("casper_example");
            ARD.apply();
            this.A01 = false;
        }
        return igSignalsExampleData;
    }

    @Override // X.InterfaceC108204u7
    public final void Eou(IgSignalsExampleData igSignalsExampleData) {
        this.A00 = igSignalsExampleData;
        this.A01 = true;
        InterfaceC19610xo ARD = ((InterfaceC19630xq) this.A03.getValue()).ARD();
        ARD.E7K("casper_example", C5KX.A00(C25114B9k.A00, AbstractC73763Sg.A03).A02(igSignalsExampleData, C71739X0e.A00));
        ARD.apply();
    }
}
