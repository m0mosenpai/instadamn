package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes6.dex */
public final class EUJ extends C1P1 {
    public final String A00;
    public final /* synthetic */ ENK A01;

    public EUJ(ENK enk, String str) {
        this.A01 = enk;
        this.A00 = str;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03 = C0f9.A03(-1494645674);
        super.onFail(abstractC115105If);
        ENK enk = this.A01;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = enk.A01;
        if (businessFlowAnalyticsLogger != null) {
            String str = enk.A06;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("query_string", enk.A05);
            businessFlowAnalyticsLogger.CjK(new Y7A("page_import_info_city_town", str, ServerW3CShippingAddressConstants.CITY, AbstractC151876sX.A00(abstractC115105If), AbstractC151876sX.A00(abstractC115105If), null, A1G, null));
        }
        if (this.A00.equals(enk.A05)) {
            C32405EPg c32405EPg = enk.A00;
            c32405EPg.A06();
            c32405EPg.A08(c32405EPg.A01, c32405EPg.A00.getString(2131968594));
            c32405EPg.A07();
        }
        C0f9.A0A(2049869640, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(1573861363);
        super.onFinish();
        AbstractC31179DnN.A0u(this.A01);
        C0f9.A0A(1137543786, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(585718026);
        super.onStart();
        AbstractC31179DnN.A0v(this.A01);
        C0f9.A0A(665526257, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C34443FGh c34443FGh;
        List list;
        int A03 = C0f9.A03(989789841);
        EV2 ev2 = (EV2) obj;
        int A032 = C0f9.A03(2131385073);
        super.onSuccess(ev2);
        String str = this.A00;
        ENK enk = this.A01;
        if (str.equals(enk.A05)) {
            if (ev2 != null && (c34443FGh = ev2.A00) != null && (list = c34443FGh.A00) != null) {
                C32405EPg c32405EPg = enk.A00;
                List list2 = c32405EPg.A02;
                list2.clear();
                list2.addAll(list);
                C32405EPg.A00(c32405EPg);
            } else {
                C32405EPg c32405EPg2 = enk.A00;
                c32405EPg2.A06();
                c32405EPg2.A08(c32405EPg2.A01, c32405EPg2.A00.getString(2131968594));
                c32405EPg2.A07();
            }
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = enk.A01;
        if (businessFlowAnalyticsLogger != null) {
            String str2 = enk.A06;
            HashMap A1G = AbstractC166987dD.A1G();
            A1G.put("query_string", enk.A05);
            businessFlowAnalyticsLogger.CjJ(new Y7A("page_import_info_city_town", str2, ServerW3CShippingAddressConstants.CITY, null, null, null, A1G, null));
        }
        C0f9.A0A(1559339809, A032);
        C0f9.A0A(1079472510, A03);
    }
}
