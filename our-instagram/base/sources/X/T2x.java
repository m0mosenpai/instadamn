package X;

import android.os.Bundle;
import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.auth.models.PttPayload;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public final class T2x implements InterfaceC65507Tlc {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public T2x(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = obj;
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyJ(Throwable th) {
        C58252li c58252li;
        int i = this.A00;
        C58770Q8c c58770Q8c = (C58770Q8c) this.A01;
        if (i != 0) {
            c58252li = c58770Q8c.A04;
        } else {
            c58252li = c58770Q8c.A03;
        }
        c58252li.A0A(C63406Sjd.A06(th));
    }

    @Override // X.InterfaceC65507Tlc
    public final void CyK(SGB sgb) {
        String str;
        if (this.A00 != 0) {
            Bundle bundle = sgb.A00;
            if (bundle != null && bundle.getBoolean("AUTH_FLOW_UTIL_HAVE_ASKED_FOR_BIO_SETUP", false)) {
                C58770Q8c c58770Q8c = (C58770Q8c) this.A01;
                AbstractC63246Sg0.A02(c58770Q8c.A02, c58770Q8c.A04, C63628Sqa.A00(this, 28));
                return;
            }
            C58770Q8c c58770Q8c2 = (C58770Q8c) this.A01;
            C63152Se0 c63152Se0 = sgb.A01;
            String str2 = this.A03;
            String str3 = this.A04;
            Bundle bundle2 = (Bundle) this.A02;
            C58252li c58252li = c58770Q8c2.A04;
            c58252li.A0A(C63406Sjd.A03(null));
            int A03 = c58770Q8c2.A01.A03(15);
            if (A03 != 0) {
                c58252li.A0A(C63406Sjd.A05(null, new C64864TXp(A03)));
                return;
            }
            try {
                C63152Se0 A06 = c58770Q8c2.A08.A06("BIO", Collections.emptyList());
                FBPayLoggerData A0W = AbstractC58319PtB.A0W(bundle2);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("AUTH_METHOD_TYPE", "BIO");
                A0b.putString("PAYMENT_TYPE", str3);
                A0b.putParcelable("logger_data", A0W);
                SE2 se2 = new SE2(A0b);
                Bundle bundle3 = se2.A01;
                AbstractC63243Sfx.A02(str2, bundle3);
                if ("SETUP_PIN_TO_CREATE_BIO_HUB".equals(str2)) {
                    str = "CREATE_BIO";
                } else {
                    str = "VERIFY_BIO";
                }
                AbstractC63243Sfx.A03(str, bundle3);
                PttPayload byBio = PttPayload.byBio(C2FP.A0C().A01(), c58770Q8c2.A00.getPackageName(), A06.A07, Collections.emptyList());
                C62962SZf c62962SZf = c58770Q8c2.A07;
                C63152Se0[] c63152Se0Arr = {c63152Se0, A06};
                HashSet A1H = AbstractC166987dD.A1H();
                Collections.addAll(A1H, c63152Se0Arr);
                C64193T3c c64193T3c = new C64193T3c(0, c58770Q8c2, se2);
                String string = bundle3.getString("PAYMENT_ACCOUNT_ID");
                Map A01 = SSA.A01(bundle3);
                C14360o3.A0B(A01, 5);
                T3Z A00 = AbstractC63063Sbk.A00(c64193T3c, A1H);
                C14360o3.A0B(byBio, 1);
                SXG sxg = new SXG(A00, byBio, "CREATE_AUTH_TICKET_BASED_FACTOR", string, null, null, null, null, A01, A1H);
                C58443PvM c58443PvM = c62962SZf.A01;
                C63582Spp c63582Spp = new C63582Spp(c62962SZf, sxg, str3, 6);
                C63174SeZ c63174SeZ = c62962SZf.A00;
                C14360o3.A0B(c58443PvM, 0);
                C14360o3.A0B(c63174SeZ, 2);
                C60624REj c60624REj = new C60624REj(c63582Spp, c63174SeZ, c58443PvM, sxg);
                AbstractC63144Sdq.A02(c60624REj);
                Q8J q8j = ((AbstractC63144Sdq) c60624REj).A03;
                C62962SZf.A00(q8j, c63174SeZ);
                C63628Sqa.A03(q8j, c58252li, c58770Q8c2, 29);
                C2FP.A03().A01.Chz("create_biometric", SSA.A01(bundle3));
                return;
            } catch (Exception e) {
                C0K8.A0F("DefaultAuthTicketManager", "create AT Safe", e);
                c58252li.A0A(C63406Sjd.A05(null, new C64864TXp("Unable create auth ticket", 103)));
                return;
            }
        }
        C2GC c2gc = C2FP.A03().A01;
        Bundle bundle4 = ((SE2) this.A02).A01;
        c2gc.Chz("fbpay_remove_biometric", SSA.A01(bundle4));
        C58770Q8c c58770Q8c3 = (C58770Q8c) this.A01;
        C62962SZf c62962SZf2 = c58770Q8c3.A07;
        String str4 = this.A04;
        String str5 = this.A03;
        C63346Si2 c63346Si2 = c58770Q8c3.A08;
        PttPayload deleteBio = PttPayload.deleteBio(str5);
        C63152Se0 c63152Se02 = sgb.A01;
        c63152Se02.getClass();
        HashSet A0x = AbstractC58322PtE.A0x(c63152Se02);
        String string2 = bundle4.getString("PAYMENT_ACCOUNT_ID");
        Map A012 = SSA.A01(bundle4);
        AbstractC167007dF.A1G(deleteBio, 2, A012);
        SXG sxg2 = new SXG(AbstractC63063Sbk.A00(new C64192T3b(c63346Si2, 1), A0x), deleteBio, "REVOKE_AUTH_TICKET", string2, null, null, null, null, A012, A0x);
        Q8J A002 = AbstractC63245Sfz.A00(new C63550SpI(c62962SZf2, sxg2, str4, str5, 1), c62962SZf2, c62962SZf2.A01, sxg2);
        c58770Q8c3.A03.A0E(A002, new C63625SqX(6, A002, this));
    }
}
