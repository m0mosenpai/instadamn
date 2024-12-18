package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44456JlO extends C193578hc {
    public final C42221xC A00;
    public final C41761wQ A01;
    public final UserSession A02;
    public final KPI A03;
    public final C48519LdH A04;
    public final Integer A05;
    public final List A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC19390xP A08;
    public final C05A A09;
    public final C0UO A0A;
    public final InterfaceC24731Iq A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44456JlO(Application application, C42221xC c42221xC, UserSession userSession, KPI kpi, C48519LdH c48519LdH, Integer num) {
        super(application);
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(c42221xC, application, c48519LdH, kpi, num);
        this.A02 = userSession;
        this.A00 = c42221xC;
        this.A04 = c48519LdH;
        this.A03 = kpi;
        this.A05 = num;
        this.A01 = AbstractC31174DnI.A0S();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        int i = C3JM.A00;
        C24721Ip c24721Ip = new C24721Ip(i);
        this.A0B = c24721Ip;
        this.A07 = new C24721Ip(i);
        C008002u A00 = C10E.A00(KP7.A00);
        this.A09 = A00;
        this.A06 = AbstractC166987dD.A1E();
        this.A08 = AbstractC07080Za.A03(c24721Ip);
        this.A0A = AbstractC208910l.A02(A00);
        ((C47313KvO) AbstractC47205Kte.A01.getValue()).A00 = kpi;
    }

    public final void A0E(InterfaceC50380MMi interfaceC50380MMi) {
        List list;
        String obj;
        int i;
        if (C45130JyW.A00(interfaceC50380MMi, 0)) {
            list = this.A06;
            Rk3 rk3 = (Rk3) ((C45130JyW) interfaceC50380MMi).A01;
            obj = rk3.getMessage();
            if (obj == null) {
                i = rk3.A00.A00;
                obj = String.valueOf(i);
            }
        } else if (C45130JyW.A00(interfaceC50380MMi, 1)) {
            list = this.A06;
            Throwable th = (Throwable) ((C45130JyW) interfaceC50380MMi).A01;
            obj = th.getMessage();
            if (obj == null) {
                obj = String.valueOf(th);
            }
        } else {
            boolean z = interfaceC50380MMi instanceof C45129JyV;
            list = this.A06;
            if (z) {
                i = ((C45129JyV) interfaceC50380MMi).A00;
                obj = String.valueOf(i);
            } else {
                obj = interfaceC50380MMi.toString();
            }
        }
        list.add(obj);
        KPI kpi = this.A03;
        kpi.A05("GDRIVE_LOGIN_FAIL");
        AbstractC43594JPz.A1H(kpi, list);
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A01.A01();
        ((C47313KvO) AbstractC47205Kte.A01.getValue()).A00 = null;
    }
}
