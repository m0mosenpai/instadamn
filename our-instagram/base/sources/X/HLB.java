package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public final class HLB extends AbstractC154286wd {
    public final boolean A00;
    public final /* synthetic */ HL0 A01;

    public HLB(HL0 hl0, boolean z) {
        this.A01 = hl0;
        this.A00 = z;
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List list;
        int A03 = C0f9.A03(-2007487384);
        HBB hbb = (HBB) obj;
        int A032 = C0f9.A03(298819763);
        C14360o3.A0B(hbb, 0);
        List list2 = hbb.A04;
        HL0 hl0 = this.A01;
        UserSession userSession = hl0.A00;
        C14360o3.A0B(userSession, 1);
        if (list2 != null && !list2.isEmpty()) {
            list = C127895qI.A06(userSession, null, list2);
        } else {
            list = C16930sl.A00;
        }
        ArrayList A00 = AbstractC40614HzY.A00(hl0.A02, list);
        AbstractC69735VuV abstractC69735VuV = (AbstractC69735VuV) userSession.A01(HKI.class, J85.A00);
        String str = hl0.A04.A04;
        if (str != null) {
            String str2 = hl0.A03.A00.A03.A07;
            boolean z = this.A00;
            abstractC69735VuV.A02(list, str, str2, null, null, z);
            hl0.A01.DgU(null, null, A00, null, false, z);
            C0f9.A0A(1616877797, A032);
            C0f9.A0A(-438977180, A03);
            return;
        }
        IllegalStateException A0g = AbstractC166997dE.A0g();
        C0f9.A0A(320499873, A032);
        throw A0g;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-2105513024);
        this.A01.A01.Dfp();
        C0f9.A0A(-1379372815, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(320460649);
        this.A01.A01.Dfz();
        C0f9.A0A(-1134842781, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(1532852259);
        this.A01.A01.DgF();
        C0f9.A0A(-1834092092, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = C0f9.A03(-548524080);
        C0f9.A0A(-501095398, C0f9.A03(1559748270));
        C0f9.A0A(1761006681, A03);
    }
}
