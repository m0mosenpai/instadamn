package X;

import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;

/* loaded from: classes12.dex */
public final class YE2 implements BusinessFlowAnalyticsLogger {
    public final C18920wW A00;
    public final String A01;

    public static C18920wW A00(YE2 ye2, Object obj) {
        C14360o3.A0B(obj, 0);
        return ye2.A00;
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cim(Y7A y7a) {
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CmQ(Y7A y7a) {
    }

    public YE2(InterfaceC11380iw interfaceC11380iw, AbstractC12990ll abstractC12990ll, String str) {
        this.A01 = str;
        this.A00 = AbstractC12220kQ.A01(interfaceC11380iw, abstractC12990ll);
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cid(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2013));
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
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjJ(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2014));
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
        Y7A.A08(A0f, y7a, "waterfall_id", str2);
        Y7A.A04(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjK(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2015));
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
        Y7A.A07(A0f, y7a, "waterfall_id", str2);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void CjL(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), "business_signup_finish_step");
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
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clj(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), "business_signup_skip");
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
        MSW.A1U(A0f, str2);
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clo(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), "business_signup_start_step");
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
    public final void Clu(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2016));
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
        Y7A.A01(A0f, y7a);
        String str4 = y7a.A00;
        if (str4 != null) {
            A0f.AAP("component", str4);
        }
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Clv(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2017));
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
        Y7A.A01(A0f, y7a);
        String str4 = y7a.A00;
        if (str4 != null) {
            A0f.AAP("component", str4);
        }
        String str5 = y7a.A03;
        if (str5 != null) {
            A0f.AAP("error_message", str5);
        }
        A0f.Cht();
    }

    @Override // com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger
    public final void Cm3(Y7A y7a) {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(A00(this, y7a), AbstractC111324zv.A00(2018));
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
        AbstractC72047XLn.A1X(A0f, str2);
        Y7A.A03(A0f, y7a);
        Y7A.A01(A0f, y7a);
        A0f.Cht();
    }
}
