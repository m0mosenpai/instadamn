package X;

import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;

/* renamed from: X.P4b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56440P4b implements InterfaceC57957Pn3 {
    public final int A00;
    public final Object A01;

    public C56440P4b(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC57957Pn3
    public final void Cwq(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        switch (this.A00) {
            case 0:
                ((N6B) this.A01).A04();
                return;
            case 1:
                AbstractC167007dF.A1K(leadGenFormBaseQuestion, str);
                ((C54841OMk) this.A01).A05(leadGenFormBaseQuestion, str, false);
                return;
            default:
                return;
        }
    }
}
