package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class EZY extends AbstractRunnableC14200nk {
    public final /* synthetic */ C34634FNr A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EZY(C34634FNr c34634FNr) {
        super(1326144141, 3, false, false);
        this.A00 = c34634FNr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FIG fig = (FIG) this.A00.A04.getValue();
        FGN fgn = fig.A01;
        C121305eT A01 = fig.A00.A01("call_recipients");
        C14360o3.A0B(A01, 0);
        List list = A01.A02;
        if (list.isEmpty()) {
            C34634FNr c34634FNr = fgn.A00;
            c34634FNr.A03.Eby("");
            c34634FNr.A00 = true;
            return;
        }
        InterfaceC06180Ui interfaceC06180Ui = (InterfaceC06180Ui) fgn.A00.A05.getValue();
        ArrayList A1E = AbstractC166987dD.A1E();
        for (Object obj : list) {
            DirectShareTarget directShareTarget = (DirectShareTarget) obj;
            if (!directShareTarget.A0M() && !directShareTarget.A0L()) {
                A1E.add(obj);
            }
        }
        OD5 od5 = new OD5("", A01.A01, A1E, false, false);
        C14360o3.A0B(interfaceC06180Ui, 0);
        interfaceC06180Ui.F8m(od5);
    }
}
