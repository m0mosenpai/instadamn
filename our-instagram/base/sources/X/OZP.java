package X;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes9.dex */
public final class OZP {
    public static final C57782Pk9 A00;
    public static final OZP A01 = new Object();
    public static final java.util.Set A04 = AbstractC31171DnF.A0l();
    public static final OR1 A02 = OR1.A00;
    public static final Map A03 = new ConcurrentHashMap();

    public static final C57782Pk9 A00(String str) {
        C57782Pk9 c57782Pk9;
        int i;
        C14360o3.A0B(str, 0);
        AbstractC09800fd.A01("RpStores.getStoreForLocalCallId", -524061286);
        try {
            java.util.Set set = A04;
            if (set.contains(str)) {
                c57782Pk9 = A00;
            } else {
                c57782Pk9 = (C57782Pk9) A03.get(str);
            }
            if (c57782Pk9 != null) {
                if (c57782Pk9.equals(A00)) {
                    OXE.A00.A04("RpStores", AnonymousClass001.A0R("Accessing an RpStore after the Call has ended & UI is finished. localCallId=", str), null);
                }
            } else {
                synchronized (A01) {
                    if (set.contains(str)) {
                        c57782Pk9 = A00;
                        i = 1226204948;
                    } else {
                        Map map = A03;
                        c57782Pk9 = (C57782Pk9) map.get(str);
                        if (c57782Pk9 == null) {
                            OXE.A00.A00("RpStores", AnonymousClass001.A0R("Creating store for ", str));
                            C30194DRz c30194DRz = new C30194DRz(new InterfaceC16620sF[]{C57229PbD.A00, C57230PbE.A00}, 6);
                            C51732MtD c51732MtD = new C51732MtD(null, AbstractC06930Yk.A0E());
                            ArrayList A17 = AbstractC25225BEi.A17(1);
                            A17.add(AbstractC54328Nzm.A00);
                            InterfaceC31063Dl5 A002 = AbstractC54921OQw.A00(c51732MtD, new MI6(A17, str, 0, true), c30194DRz);
                            C14360o3.A0C(A002, "null cannot be cast to non-null type com.facebook.rp.platform.statemanagement.RpStore");
                            c57782Pk9 = (C57782Pk9) A002;
                            map.put(str, c57782Pk9);
                        } else {
                            i = 270771411;
                        }
                    }
                }
                AbstractC09800fd.A00(i);
                return c57782Pk9;
            }
            i = 894498819;
            AbstractC09800fd.A00(i);
            return c57782Pk9;
        } catch (Throwable th) {
            AbstractC09800fd.A00(-1402391769);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.OZP, java.lang.Object] */
    static {
        InterfaceC31063Dl5 A002 = AbstractC54921OQw.A00(C51732MtD.A02, null, C57758Pjl.A00);
        A00 = new C57782Pk9("CALL_ENDED_NO_OP_STORE", A002.B9j(), A002, true);
    }
}
