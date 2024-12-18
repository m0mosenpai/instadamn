package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes8.dex */
public final class LAI {
    public final C47967LIb A00;
    public final LLH A01;
    public final LightweightQuickPerformanceLogger A02;
    public final AtomicInteger A03;
    public final boolean A04;

    public LAI(L36 l36, C47214Ktn c47214Ktn, AbstractC135836Cl abstractC135836Cl, LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, C47311KvM c47311KvM, boolean z) {
        C14360o3.A0B(lightweightQuickPerformanceLogger, 7);
        C47967LIb c47967LIb = new C47967LIb(c47214Ktn, abstractC135836Cl);
        LLH llh = new LLH(l36, c47214Ktn, abstractC135836Cl, lightweightQuickPerformanceLogger, c47311KvM);
        this.A00 = c47967LIb;
        this.A01 = llh;
        this.A04 = z;
        this.A02 = lightweightQuickPerformanceLogger;
        this.A03 = new AtomicInteger(0);
    }

    public final LK0 A07(String str) {
        C14360o3.A0B(str, 0);
        LK0 A00 = LK0.A00();
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021647318, this.A03.getAndIncrement());
        abstractC47797L9f.A00();
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A002);
        } else {
            K3W k3w = c47967LIb.A02;
            C44176Jff c44176Jff = new C44176Jff(c47967LIb, A002, 1);
            InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, c44176Jff);
            AbstractC25231BEo.A1C(A0H, new LUF(k3w, A0I, str, 1), A0I);
        }
        LK0.A02(A002, A00, abstractC47797L9f, 2);
        return A00;
    }

    public final LK0 A01() {
        int andIncrement;
        LK0 A02;
        int i;
        LK0 A00 = LK0.A00();
        boolean z = this.A04;
        if (z) {
            andIncrement = 0;
        } else {
            andIncrement = this.A03.getAndIncrement();
        }
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021652813, andIncrement);
        abstractC47797L9f.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = abstractC47797L9f.A02;
        int i2 = abstractC47797L9f.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021652813, i2, CacheBehaviorLogger.SOURCE, "IG");
        if (z) {
            abstractC47797L9f.A02("GRAPHQL");
            A02 = this.A01.A06("IG", false, false);
            i = 4;
        } else {
            abstractC47797L9f.A02("MSYS");
            A02 = this.A00.A02(Integer.valueOf(i2));
            i = 5;
        }
        LK0.A02(A02, A00, abstractC47797L9f, i);
        return A00;
    }

    public final LK0 A02() {
        Object c44826Jt0;
        if (this.A04) {
            LLH llh = this.A01;
            LK0 A00 = LK0.A00();
            if (!AbstractC25231BEo.A1b(llh.A01.A00)) {
                c44826Jt0 = new C44827Jt1(new Exception());
            } else {
                L36 l36 = llh.A00;
                if (l36.A03) {
                    List list = l36.A01;
                    if (list != null) {
                        c44826Jt0 = new C44826Jt0(new C47215Kto(LLH.A01(list)));
                    } else {
                        C14360o3.A0F("virtualDevicesList");
                        throw C00O.createAndThrow();
                    }
                } else {
                    LK0.A02(llh.A06("fetchVirtualDevicesMetadata", false, true), llh, A00, 0);
                    return A00;
                }
            }
            A00.A05(c44826Jt0);
            return A00;
        }
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A002);
            return A002;
        }
        K3W k3w = c47967LIb.A02;
        C44176Jff c44176Jff = new C44176Jff(c47967LIb, A002, 6);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, c44176Jff);
        AbstractC43594JPz.A1G(A0H, new C44176Jff(k3w, A0I, 22), A0I);
        return A002;
    }

    public final LK0 A04(EnumC46206Kci enumC46206Kci) {
        C47967LIb c47967LIb = this.A00;
        LK0 A00 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A00);
            return A00;
        }
        K3W k3w = c47967LIb.A02;
        Number number = enumC46206Kci.A00;
        JRS A002 = JRS.A00(A00, 4);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A002);
        AbstractC43594JPz.A1G(A0H, new JVY(4, number, A0I, k3w), A0I);
        return A00;
    }

    public final LK0 A05(EnumC46206Kci enumC46206Kci, String str, String str2) {
        boolean A1a = AbstractC167017dG.A1a(str, str2);
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021646192, this.A03.getAndIncrement());
        String name = enumC46206Kci.name();
        C14360o3.A0B(name, 0);
        abstractC47797L9f.A00();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = abstractC47797L9f.A02;
        int i = abstractC47797L9f.A01;
        lightweightQuickPerformanceLogger.markerAnnotate(1021646192, i, "vd_type", name);
        LK0 A00 = LK0.A00();
        abstractC47797L9f.A02("MSYS");
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A002);
        } else {
            lightweightQuickPerformanceLogger.markerPoint(1021646192, i, "eb_manager_add_device_begin");
            K3W k3w = c47967LIb.A02;
            Number number = enumC46206Kci.A00;
            Integer valueOf = Integer.valueOf(i);
            JVY jvy = new JVY(0, c47967LIb, abstractC47797L9f, A002);
            InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, jvy);
            AbstractC25231BEo.A1C(A0H, new C48191LUp(k3w, A0I, number, valueOf, str, str2, 0), A0I);
        }
        LK0.A02(A002, A00, abstractC47797L9f, A1a ? 1 : 0);
        return A00;
    }

    public final LK0 A00() {
        LK0 A00 = LK0.A00();
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021655799, this.A03.getAndIncrement());
        abstractC47797L9f.A00();
        abstractC47797L9f.A02("MSYS");
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A002);
        } else {
            K3W k3w = c47967LIb.A02;
            C44176Jff c44176Jff = new C44176Jff(c47967LIb, A002, 2);
            InterfaceExecutorC135866Co A0C = AbstractC43592JPx.A0C(k3w, 2);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0C, c44176Jff);
            AbstractC43594JPz.A1G(A0C, new C44176Jff(k3w, A0I, 17), A0I);
        }
        LK0.A02(A002, A00, abstractC47797L9f, 3);
        return A00;
    }

    public final LK0 A03() {
        LK0 A00 = LK0.A00();
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021642512, this.A03.getAndIncrement());
        abstractC47797L9f.A00();
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        if (!AbstractC25231BEo.A1b(c47967LIb.A01.A00)) {
            C47967LIb.A01(A002);
        } else {
            K3W k3w = c47967LIb.A02;
            C44176Jff c44176Jff = new C44176Jff(c47967LIb, A002, 7);
            InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
            MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, c44176Jff);
            AbstractC43594JPz.A1G(A0H, new C44176Jff(k3w, A0I, 20), A0I);
        }
        LK0.A02(A002, abstractC47797L9f, A00, 7);
        return A00;
    }

    public final LK0 A06(Integer num) {
        int i;
        LK0 A00 = LK0.A00();
        AbstractC47797L9f abstractC47797L9f = new AbstractC47797L9f(this.A02, 1021654781, this.A03.getAndIncrement());
        abstractC47797L9f.A00();
        C47967LIb c47967LIb = this.A00;
        LK0 A002 = LK0.A00();
        K3W k3w = c47967LIb.A02;
        switch (num.intValue()) {
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            default:
                i = 2;
                break;
        }
        Integer valueOf = Integer.valueOf(i);
        JRS A003 = JRS.A00(A002, 7);
        InterfaceExecutorC135866Co A0H = AbstractC43593JPy.A0H(k3w);
        MailboxFutureImpl A0I = AbstractC43593JPy.A0I(A0H, A003);
        AbstractC43594JPz.A1G(A0H, new JVY(7, valueOf, A0I, k3w), A0I);
        LK0.A02(A002, abstractC47797L9f, A00, 6);
        return A00;
    }
}
