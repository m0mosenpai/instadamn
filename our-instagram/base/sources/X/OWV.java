package X;

import com.instagram.common.session.UserSession;
import com.instagram.service.tigon.IGAuthedTigonService;
import com.instagram.service.tigon.IGTigonService;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class OWV {
    public static OWV A05;
    public static final C54747OFz A06 = new Object();
    public WeakReference A00;
    public String A01;
    public final O6V A02;
    public final List A03 = AbstractC166987dD.A1E();
    public final AtomicInteger A04 = MSW.A1C(0);

    /* JADX WARN: Type inference failed for: r1v5, types: [X.OF5, java.lang.Object] */
    public final synchronized C54806OKa A00(C51653Mrk c51653Mrk) {
        C54806OKa c54806OKa;
        Integer num;
        String A0T = AnonymousClass001.A0T(c51653Mrk.A0A, c51653Mrk.A0B, '|');
        WeakReference weakReference = this.A00;
        if (weakReference == null || MSW.A0I(weakReference) == null) {
            this.A01 = null;
            this.A04.set(0);
        }
        if (C14360o3.A0K(A0T, this.A01)) {
            WeakReference weakReference2 = this.A00;
            if (weakReference2 != null && (c54806OKa = (C54806OKa) weakReference2.get()) != null) {
                this.A04.incrementAndGet();
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            c54806OKa = new C54806OKa(c51653Mrk, this.A02);
            if (c54806OKa.A00 == null) {
                O6V o6v = c54806OKa.A02;
                C51653Mrk c51653Mrk2 = c54806OKa.A01;
                UserSession userSession = o6v.A00;
                IGAuthedTigonService iGAuthedTigonService = IGAuthedTigonService.getInstance(userSession);
                C14360o3.A07(iGAuthedTigonService);
                IGTigonService tigonService = IGTigonService.getTigonService(userSession);
                C14360o3.A07(tigonService);
                File CHo = AbstractC23881Ey.A00().CHo(null, 1881128843);
                CHo.mkdirs();
                String A19 = AbstractC166987dD.A19(C1HO.A06());
                C54654OCg c54654OCg = new C54654OCg(MSX.A0i(CHo));
                c54654OCg.A00 = iGAuthedTigonService;
                c54654OCg.A01 = tigonService;
                c54654OCg.A02 = A19;
                String str = c51653Mrk2.A0A;
                C14360o3.A0B(str, 0);
                c54654OCg.A03 = str;
                String str2 = c51653Mrk2.A0B;
                C14360o3.A0B(str2, 0);
                if (c51653Mrk2.A0E) {
                    num = C05F.A00;
                } else {
                    num = C05F.A01;
                }
                String str3 = c51653Mrk2.A08;
                Integer num2 = c51653Mrk2.A07;
                ?? obj = new Object();
                obj.A06 = c54654OCg.A02;
                obj.A07 = c54654OCg.A03;
                obj.A08 = str2;
                obj.A04 = c54654OCg.A04;
                obj.A00 = c54654OCg.A00;
                obj.A01 = c54654OCg.A01;
                obj.A03 = num;
                obj.A05 = str3;
                obj.A02 = num2;
                c54806OKa.A00 = new C54499O6b(obj);
            }
            this.A04.set(1);
            WeakReference weakReference3 = this.A00;
            if (weakReference3 != null) {
                weakReference3.clear();
            }
            this.A00 = AbstractC25225BEi.A16(c54806OKa);
            this.A01 = A0T;
            Iterator it = this.A03.iterator();
            while (it.hasNext()) {
                ((InterfaceC57901Pm5) it.next()).CwK(c54806OKa);
            }
        }
        return c54806OKa;
    }

    public final synchronized void A01() {
        if (this.A04.decrementAndGet() == 0) {
            WeakReference weakReference = this.A00;
            if (weakReference != null) {
                C54806OKa A0I = MSW.A0I(weakReference);
                if (A0I != null) {
                    C54499O6b c54499O6b = A0I.A00;
                    if (c54499O6b == null) {
                        MSW.A1J();
                        throw C00O.createAndThrow();
                    }
                    c54499O6b.A00.removeNotificationDelegate();
                }
                weakReference.clear();
            }
            this.A01 = null;
        }
    }

    public OWV(O6V o6v) {
        this.A02 = o6v;
    }
}
