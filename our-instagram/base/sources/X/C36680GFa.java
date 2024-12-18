package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GFa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36680GFa implements InterfaceC169507hQ {
    public final /* synthetic */ C34634FNr A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
    @Override // X.InterfaceC169507hQ
    public final void DcI(InterfaceC169517hR interfaceC169517hR) {
        C3AY c3ay;
        C14360o3.A0B(interfaceC169517hR, 0);
        C34634FNr c34634FNr = this.A00;
        InterfaceC169517hR interfaceC169517hR2 = c34634FNr.A03;
        ?? r7 = ((C31671Dvc) interfaceC169517hR2.Bov()).A00;
        String BjQ = interfaceC169517hR2.BjQ();
        if ((BjQ == null || BjQ.length() == 0) && !c34634FNr.A00) {
            if (C18U.A06(C06090Tz.A05, c34634FNr.A01, 36311891198346028L)) {
                c34634FNr.A02.ATO(new EZY(c34634FNr));
                return;
            }
        }
        c34634FNr.A00 = false;
        String BjQ2 = interfaceC169517hR2.BjQ();
        if ((BjQ2 == null || BjQ2.length() == 0) && r7.isEmpty()) {
            G03 g03 = (G03) AbstractC166987dD.A17(c34634FNr.A06);
            UserSession userSession = c34634FNr.A01;
            C2DS A00 = AbstractC28761aE.A00(userSession);
            synchronized (g03) {
                if (!g03.A02 && !g03.A03) {
                    if (!g03.A04) {
                        g03.A04 = true;
                        C1ON A002 = AbstractC34779FUd.A00(g03.A05, null, "reshare", null, null, 0, 0, 0, 0, true);
                        A002.A00 = new EE7(g03);
                        C1GJ.A06(A002, 124, 3, false, false);
                    }
                    Context context = g03.A00;
                    UserSession userSession2 = g03.A05;
                    BigInteger bigInteger = AbstractC31677Dvi.A00;
                    C31675Dvg c31675Dvg = new C31675Dvg(context, userSession2, "coefficient_direct_recipients_ranking_variant_2", new C31680Dvl(A00, 6), true, true, true);
                    c31675Dvg.A04("");
                    c3ay = new C3AY(c31675Dvg.A03(Collections.emptyList()), g03.A01);
                } else {
                    c3ay = new C3AY(AbstractC166987dD.A1F(g03.A07), g03.A01);
                }
            }
            List list = (List) c3ay.A00;
            BigInteger bigInteger2 = AbstractC31677Dvi.A00;
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                DirectShareTarget A0m = AbstractC31172DnG.A0m(it);
                if (!A0m.A0M()) {
                    A1E.add(A0m);
                }
            }
            String str = userSession.userId;
            r7 = AbstractC166987dD.A1E();
            Iterator it2 = A1E.iterator();
            while (it2.hasNext()) {
                DirectShareTarget A0m2 = AbstractC31172DnG.A0m(it2);
                if (!A0m2.A0Y(str)) {
                    r7.add(A0m2);
                }
            }
        }
        InterfaceC06180Ui interfaceC06180Ui = (InterfaceC06180Ui) c34634FNr.A05.getValue();
        String BjQ3 = interfaceC169517hR.BjQ();
        if (BjQ3 == null) {
            BjQ3 = "";
        }
        OD5 od5 = new OD5(BjQ3, null, r7, interfaceC169517hR.isLoading(), interfaceC169517hR.CUG());
        C14360o3.A0B(interfaceC06180Ui, 0);
        interfaceC06180Ui.F8m(od5);
    }

    public C36680GFa(C34634FNr c34634FNr) {
        this.A00 = c34634FNr;
    }
}
