package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Wgt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70780Wgt implements InterfaceC12870lZ {
    public static volatile C70780Wgt A07;
    public final long A00;
    public final W93 A01;
    public final C41711wL A02;
    public final Map A03;
    public final C13920nI A04 = C13920nI.A00;
    public static final C69512Vpp A06 = new Object();
    public static final long A05 = TimeUnit.HOURS.toMillis(168);

    public final void A00(C75363a3 c75363a3, String str, String str2) {
        String str3 = c75363a3.A0G;
        if (str3.length() != 0 && str2 != null && str != null) {
            boolean z = true;
            List A0m = AbstractC167007dF.A0m(str3, "_", 0);
            if (A0m.size() < 2 || !C14360o3.A0K(A0m.get(1), str2)) {
                z = false;
            }
            W93 w93 = this.A01;
            C69622VsP c69622VsP = new C69622VsP(str3, str, c75363a3.A06, System.currentTimeMillis(), z, c75363a3.A0T);
            C1ZT AR9 = w93.A04.AR9();
            AR9.A09(str3, c69622VsP.toString());
            AR9.A03();
        }
    }

    public C70780Wgt(W93 w93, C41711wL c41711wL, long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.A02 = c41711wL;
        this.A01 = w93;
        this.A00 = j7;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.A03 = linkedHashMap;
        linkedHashMap.put(VD9.A06, Long.valueOf(j));
        linkedHashMap.put(VD9.A08, Long.valueOf(j2));
        linkedHashMap.put(VD9.A02, Long.valueOf(j3));
        linkedHashMap.put(VD9.A04, Long.valueOf(j4));
        linkedHashMap.put(VD9.A03, Long.valueOf(j5));
        linkedHashMap.put(VD9.A05, Long.valueOf(j6));
        C218914p.A05(this);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppBackgrounded() {
        int A03 = C0f9.A03(134808824);
        C14120nc.A00().ATO(new V6C(this));
        C0f9.A0A(-1673121762, A03);
    }

    @Override // X.InterfaceC12870lZ
    public final void onAppForegrounded() {
        C0f9.A0A(1916193164, C0f9.A03(619304636));
    }
}
