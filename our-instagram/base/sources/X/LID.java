package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public final class LID {
    public final LAI A00;
    public final L8W A01;
    public final L37 A02;
    public final C47683L3q A03;
    public final QuickPerformanceLogger A04;
    public final Executor A05;
    public final Executor A06;
    public final InterfaceC16820sZ hardTimeoutInSecondsForLogin;
    public final InterfaceC16820sZ hardTimeoutInSecondsForRegister;
    public final InterfaceC16820sZ isLoginHighPriorityEnabled;
    public final InterfaceC16820sZ isLoginLongLivedRetryEnabled;
    public final InterfaceC16820sZ isRegisterHighPriorityEnabled;
    public final InterfaceC16820sZ isRegisterLongLivedRetryEnabled;

    public static final LGV A00(LGV lgv) {
        EnumC46211Kcn enumC46211Kcn;
        EnumC46211Kcn enumC46211Kcn2;
        Boolean bool = lgv.A01;
        Number number = lgv.A02;
        Number number2 = lgv.A03;
        if (AbstractC166997dE.A1Z(bool, false) && ((enumC46211Kcn2 = lgv.A00) == null || enumC46211Kcn2 == EnumC46211Kcn.A0A)) {
            enumC46211Kcn = EnumC46211Kcn.A07;
        } else {
            enumC46211Kcn = lgv.A00;
        }
        return new LGV(enumC46211Kcn, bool, number, number2);
    }

    public static final void A01(LID lid, EnumC46211Kcn enumC46211Kcn, LK0 lk0, int i) {
        lid.A01.A01(Integer.valueOf(enumC46211Kcn.A00.intValue()), null, null, i);
        lk0.A05(A00(new LGV(enumC46211Kcn, AbstractC166997dE.A0a(), null, null)));
    }

    public LID(LAI lai, InterfaceC40711ue interfaceC40711ue, QuickPerformanceLogger quickPerformanceLogger, Integer num, Executor executor) {
        AbstractC43594JPz.A1P(lai, interfaceC40711ue);
        L8W l8w = new L8W(quickPerformanceLogger);
        L37 l37 = new L37(lai, interfaceC40711ue, num, executor);
        C47683L3q c47683L3q = new C47683L3q(lai, interfaceC40711ue, num, executor);
        MEY mey = MEY.A00;
        MEZ mez = MEZ.A00;
        C50173MEa c50173MEa = C50173MEa.A00;
        C50174MEb c50174MEb = C50174MEb.A00;
        C50175MEc c50175MEc = C50175MEc.A00;
        C50176MEd c50176MEd = C50176MEd.A00;
        AbstractC25234BEr.A0l(8, mey, mez, c50173MEa, c50174MEb);
        AbstractC25229BEm.A1M(c50175MEc, 12, c50176MEd);
        this.A01 = l8w;
        this.A00 = lai;
        this.A02 = l37;
        this.A03 = c47683L3q;
        this.A04 = quickPerformanceLogger;
        this.A05 = executor;
        this.A06 = executor;
        this.isLoginHighPriorityEnabled = mey;
        this.isRegisterHighPriorityEnabled = mez;
        this.isLoginLongLivedRetryEnabled = c50173MEa;
        this.isRegisterLongLivedRetryEnabled = c50174MEb;
        this.hardTimeoutInSecondsForLogin = c50175MEc;
        this.hardTimeoutInSecondsForRegister = c50176MEd;
    }
}
