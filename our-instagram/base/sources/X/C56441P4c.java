package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.List;

/* renamed from: X.P4c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56441P4c implements InterfaceC57957Pn3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C56441P4c(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC57957Pn3
    public final void Cwq(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        switch (this.A00) {
            case 0:
                boolean A1R = AbstractC167007dF.A1R(0, leadGenFormBaseQuestion, str);
                C54841OMk c54841OMk = (C54841OMk) this.A01;
                c54841OMk.A05(leadGenFormBaseQuestion, str, false);
                MSW.A0d(c54841OMk.A00).A03(leadGenFormBaseQuestion);
                List list = leadGenFormBaseQuestion.A0C;
                boolean z = true;
                if (list == null || list.contains(str) != A1R) {
                    z = false;
                }
                c54841OMk.A06(!z);
                AbstractC51367MmS abstractC51367MmS = (AbstractC51367MmS) this.A02;
                IgdsBottomButtonLayout igdsBottomButtonLayout = abstractC51367MmS.A09;
                if (igdsBottomButtonLayout == null) {
                    return;
                }
                igdsBottomButtonLayout.setVisibility(0);
                igdsBottomButtonLayout.setPrimaryAction(AbstractC31172DnG.A05(abstractC51367MmS).getString(2131964842), new Ok5(8, c54841OMk, z));
                return;
            case 1:
                boolean A1R2 = AbstractC167007dF.A1R(0, leadGenFormBaseQuestion, str);
                ((C54841OMk) this.A01).A05(leadGenFormBaseQuestion, str, false);
                AbstractC51367MmS abstractC51367MmS2 = (AbstractC51367MmS) this.A02;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = abstractC51367MmS2.A09;
                if (igdsBottomButtonLayout2 == null) {
                    return;
                }
                igdsBottomButtonLayout2.setPrimaryButtonEnabled(A1R2);
                return;
            default:
                return;
        }
    }
}
