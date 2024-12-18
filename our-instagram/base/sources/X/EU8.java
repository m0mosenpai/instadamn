package X;

import android.text.TextUtils;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* loaded from: classes6.dex */
public final class EU8 extends C1P1 {
    public final /* synthetic */ EO0 A00;

    public EU8(EO0 eo0) {
        this.A00 = eo0;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1991111091);
        EO0 eo0 = this.A00;
        String string = eo0.getString(2131961897);
        if (abstractC115105If instanceof C115115Ig) {
            Object A00 = abstractC115105If.A00();
            A00.getClass();
            C40781ul c40781ul = (C40781ul) A00;
            if (!TextUtils.isEmpty(c40781ul.getErrorMessage())) {
                string = c40781ul.getErrorMessage();
            }
        }
        C9GR.A0G(string);
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = eo0.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clv(new Y7A("business_contact_info", eo0.A07, null, string, null, null, EO0.A00(eo0), null));
        }
        C0f9.A0A(-568924760, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1890940640);
        EO0 eo0 = this.A00;
        eo0.A0B = false;
        AbstractC31178DnM.A0v(eo0);
        C0f9.A0A(1745158325, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1147531691);
        EO0 eo0 = this.A00;
        eo0.A0B = true;
        AbstractC31178DnM.A0v(eo0);
        C0f9.A0A(-1693893026, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = C0f9.A03(1135510658);
        int A032 = C0f9.A03(-366053818);
        EO0 eo0 = this.A00;
        eo0.A0F = true;
        eo0.A0G.post(new RunnableC36808GKh(this));
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = eo0.A03;
        if (businessFlowAnalyticsLogger != null) {
            businessFlowAnalyticsLogger.Clu(new Y7A("business_contact_info", eo0.A07, "contact_option", null, null, null, EO0.A00(eo0), null));
        }
        C0f9.A0A(987570797, A032);
        C0f9.A0A(1120817697, A03);
    }
}
