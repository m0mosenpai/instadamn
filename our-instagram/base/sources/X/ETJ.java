package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class ETJ extends C1P1 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C31338Dq3 A02;
    public final /* synthetic */ C5HW A03;

    public ETJ(Context context, C31338Dq3 c31338Dq3, C5HW c5hw, int i) {
        this.A02 = c31338Dq3;
        this.A03 = c5hw;
        this.A00 = i;
        this.A01 = context;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-715841242);
        C31338Dq3 c31338Dq3 = this.A02;
        C5HW c5hw = this.A03;
        int i = this.A00;
        C31338Dq3.A04(c31338Dq3, c5hw, "delete_notification_failed", i);
        if (C31338Dq3.A05(c31338Dq3)) {
            C193328hC A0I = AbstractC31171DnF.A0I(this.A01);
            A0I.A09(2131968507);
            A0I.A04();
            AbstractC166987dD.A1W(A0I);
        }
        c31338Dq3.A06.COe(c5hw, i);
        C0f9.A0A(810103964, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1945652317);
        int A032 = C0f9.A03(-1525136955);
        C31338Dq3.A04(this.A02, this.A03, "delete_notification_success", this.A00);
        C0f9.A0A(-1253618389, A032);
        C0f9.A0A(-990436935, A03);
    }
}
