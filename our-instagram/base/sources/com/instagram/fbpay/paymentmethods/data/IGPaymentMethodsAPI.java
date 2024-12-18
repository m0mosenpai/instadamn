package com.instagram.fbpay.paymentmethods.data;

import X.AbstractC40691uc;
import X.C14360o3;
import X.C40701ud;
import X.C58444PvN;
import X.C64199T3i;
import X.InterfaceC65392TjP;
import X.InterfaceC65512Tlh;
import com.instagram.common.session.UserSession;

/* loaded from: classes10.dex */
public final class IGPaymentMethodsAPI {
    public InterfaceC65512Tlh A00;
    public final C58444PvN A01;
    public final InterfaceC65392TjP A02;
    public final UserSession A03;
    public final C40701ud A04;
    public final String A05;

    public IGPaymentMethodsAPI(UserSession userSession, String str) {
        C14360o3.A0B(userSession, 1);
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = AbstractC40691uc.A01(userSession);
        this.A01 = new C58444PvN();
        this.A02 = new C64199T3i(this, 3);
    }
}
