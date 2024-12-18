package X;

import android.app.Application;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.JlU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44462JlU extends C193578hc {
    public final C41761wQ A00;
    public final UserSession A01;
    public final KPB A02;
    public final KPU A03;
    public final C48519LdH A04;
    public final Integer A05;
    public final List A06;
    public final InterfaceC24731Iq A07;
    public final InterfaceC24731Iq A08;
    public final InterfaceC19390xP A09;
    public final InterfaceC19390xP A0A;
    public final InterfaceC19390xP A0B;
    public final C05A A0C;
    public final C0UO A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44462JlU(Application application, UserSession userSession, KPU kpu, C48519LdH c48519LdH, Integer num, InterfaceC19390xP interfaceC19390xP) {
        super(application);
        C14360o3.A0B(userSession, 1);
        AbstractC25234BEr.A1R(application, num, interfaceC19390xP, c48519LdH, kpu);
        this.A01 = userSession;
        this.A05 = num;
        this.A09 = interfaceC19390xP;
        this.A04 = c48519LdH;
        this.A03 = kpu;
        this.A00 = AbstractC31174DnI.A0S();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C24721Ip.A05;
        C3JM c3jm = InterfaceC24731Iq.A00;
        int i = C3JM.A00;
        C24721Ip c24721Ip = new C24721Ip(i);
        this.A07 = c24721Ip;
        this.A0B = AbstractC07080Za.A03(c24721Ip);
        C24721Ip c24721Ip2 = new C24721Ip(i);
        this.A08 = c24721Ip2;
        C008002u A00 = C10E.A00(KP3.A00);
        this.A0C = A00;
        this.A0D = AbstractC208910l.A02(A00);
        this.A0A = AbstractC07080Za.A03(c24721Ip2);
        this.A02 = AbstractC46737Klu.A00(userSession);
        this.A06 = AbstractC166987dD.A1E();
        ((C47313KvO) AbstractC47205Kte.A01.getValue()).A00 = kpu;
    }

    public static final void A01(C44462JlU c44462JlU, Exception exc) {
        String A00;
        List list = c44462JlU.A06;
        if (exc == null || (A00 = exc.toString()) == null) {
            A00 = MSV.A00(169);
        }
        list.add(A00);
        KPU kpu = c44462JlU.A03;
        kpu.A05("GDRIVE_RESTORE_FAIL");
        kpu.A09("GDRIVE_FAILURE_REASON", AbstractC31173DnH.A1b(list, 0));
    }

    public final void A0E() {
        KPU kpu = this.A03;
        if (kpu.A0A()) {
            kpu.A05("RESTORE_LANDING_NUX_DISMISSED");
            kpu.A07("END_REASON", "RESTORE_LANDING_NUX_CLOSED");
            kpu.A01();
        }
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        this.A00.A01();
        ((C47313KvO) AbstractC47205Kte.A01.getValue()).A00 = null;
    }

    public static KPU A00(InterfaceC09390do interfaceC09390do) {
        return ((C44462JlU) interfaceC09390do.getValue()).A03;
    }
}
