package X;

import com.facebook.commonavatarliveediting.prefetch.CommonCdlProviderHolder;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.IgCdlProviderBuilder;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.OaP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55069OaP {
    public static C55069OaP A0A;
    public O1H A00;
    public InterfaceC58098PpN A01;
    public CommonCdlProviderHolder A02;
    public O1N A03;
    public IgCdlProviderBuilder A04;
    public C54775OIo A05;
    public C54772OIl A06;
    public QuickPerformanceLogger A07;
    public C19L A08;
    public final C54997OUh A09 = new Object();

    public static final void A00(C55598Omc c55598Omc, OMg oMg, AtomicBoolean atomicBoolean, InterfaceC24901Jp interfaceC24901Jp) {
        if (atomicBoolean.compareAndSet(false, true) && interfaceC24901Jp.isActive()) {
            if (oMg != null) {
                oMg.A01("INIT_PREFETCH");
            }
            interfaceC24901Jp.EKh(C57590Ph2.A00, c55598Omc);
        }
    }

    public static final void A01(C55069OaP c55069OaP, C6FQ c6fq, InterfaceC103384lE interfaceC103384lE, String str) {
        C55143Od2 c55143Od2;
        C54775OIo c54775OIo = c55069OaP.A05;
        if (c54775OIo != null && (c55143Od2 = c54775OIo.A00) != null) {
            c55143Od2.A04();
        }
        if (interfaceC103384lE != null) {
            C6FX A0I = AbstractC31179DnN.A0I(str);
            A0I.A02(null);
            AbstractC25227BEk.A1M(c6fq, A0I, interfaceC103384lE);
        }
    }

    public final boolean A02(C51687MsI c51687MsI) {
        C54772OIl c54772OIl = this.A06;
        String str = "networkProvider";
        if (c54772OIl != null) {
            String A00 = CCA.A00(c54772OIl.A00);
            Map map = c51687MsI.A00;
            if (map != null && map.containsKey(A00)) {
                return true;
            }
            O1H o1h = this.A00;
            if (o1h == null) {
                str = "avatarEmbodimentSupport";
            } else {
                if (!C18U.A06(C06090Tz.A05, o1h.A00, 36317646454986176L)) {
                    Integer num = C05F.A0Y;
                    C54772OIl c54772OIl2 = this.A06;
                    if (c54772OIl2 != null) {
                        if (num != c54772OIl2.A00) {
                            return true;
                        }
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }
}
