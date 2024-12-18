package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* loaded from: classes12.dex */
public final class YE0 implements BusinessFlowAnalyticsLogger {
    public final C18920wW A00;
    public final String A01;

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cid(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A00 = Y7A.A00(y7a, this.A00, "interest_account_conversion_cancel");
        AbstractC72048XLo.A0T(A00);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        Y7A.A05(A00, y7a, str);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cim(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjJ(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_conversion_fetch_data");
        String str = y7a.A00;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        A0f.AAP("component", str);
        String str3 = y7a.A01;
        if (str3 == null) {
            str3 = "";
        }
        Y7A.A06(A0f, y7a, str3);
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        MSW.A1U(A0f, str2);
        Y7A.A04(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjK(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_conversion_fetch_data_error");
        String str = y7a.A00;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        A0f.AAP("component", str);
        String str3 = y7a.A01;
        if (str3 == null) {
            str3 = "";
        }
        Y7A.A06(A0f, y7a, str3);
        String str4 = this.A01;
        if (str4 == null) {
            str4 = "";
        }
        MSW.A1U(A0f, str4);
        String str5 = y7a.A03;
        if (str5 != null) {
            str2 = str5;
        }
        A0f.AAP("error_message", str2);
        String str6 = y7a.A02;
        if (str6 != null) {
            A0f.AAP("error_identifier", str6);
        }
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjL(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_conversion_finish_step");
        String str = y7a.A01;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        Y7A.A06(A0f, y7a, str);
        String str3 = this.A01;
        if (str3 != null) {
            str2 = str3;
        }
        AbstractC72047XLn.A1X(A0f, str2);
        Y7A.A03(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clj(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clo(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A00 = Y7A.A00(y7a, this.A00, "interest_account_conversion_start_step");
        AbstractC72048XLo.A0T(A00);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        Y7A.A05(A00, y7a, str);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clu(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_conversion_submit");
        String str = y7a.A00;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        A0f.AAP("component", str);
        String str3 = y7a.A01;
        if (str3 == null) {
            str3 = "";
        }
        Y7A.A06(A0f, y7a, str3);
        String str4 = this.A01;
        if (str4 != null) {
            str2 = str4;
        }
        MSW.A1U(A0f, str2);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clv(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A00, "interest_account_conversion_submit_error");
        String str = y7a.A00;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        A0f.AAP("component", str);
        String str3 = y7a.A01;
        if (str3 == null) {
            str3 = "";
        }
        Y7A.A06(A0f, y7a, str3);
        String str4 = this.A01;
        if (str4 == null) {
            str4 = "";
        }
        MSW.A1U(A0f, str4);
        String str5 = y7a.A03;
        if (str5 != null) {
            str2 = str5;
        }
        A0f.AAP("error_message", str2);
        String str6 = y7a.A02;
        if (str6 != null) {
            A0f.AAP("error_identifier", str6);
        }
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cm3(Y7A y7a) {
        C14360o3.A0B(y7a, 0);
        InterfaceC02590Ai A00 = Y7A.A00(y7a, this.A00, "interest_account_conversion_tap_component");
        Y7A.A02(A00, y7a);
        AbstractC72048XLo.A0T(A00);
        String str = this.A01;
        if (str == null) {
            str = "";
        }
        Y7A.A05(A00, y7a, str);
        Y7A.A01(A00, y7a);
        A00.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CmQ(Y7A y7a) {
    }

    public YE0(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }
}
