package X;

import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q8D extends C193578hc {
    public static final java.util.Set A0J = AbstractC16830sb.A07("IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_BINDING_UPDATER", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "UNKNOWN");
    public static final C11L A0K = new C11L("^\\d{3,4}$");
    public long A00;
    public EnumC61219RhJ A01;
    public String A02;
    public String A03;
    public String A04;
    public List A05;
    public final Application A06;
    public final C58252li A07;
    public final C2GS A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final InterfaceC58362lv A0C;
    public final C0JM A0D;
    public final C62761SPt A0E;
    public final Integer A0F;
    public final String A0G;
    public final InterfaceC09390do A0H;
    public final Bundle A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    public Q8D(Application application, Bundle bundle) {
        super(application);
        String string;
        C14360o3.A0B(application, 1);
        this.A06 = application;
        this.A0I = bundle;
        if (bundle != null && (string = bundle.getString("keyCredentialId")) != null) {
            this.A0G = string;
            this.A0F = Integer.valueOf(bundle.getInt("qplInstanceKey"));
            this.A05 = AbstractC166987dD.A1E();
            this.A08 = AbstractC58318PtA.A0J();
            this.A09 = AbstractC58318PtA.A0J();
            C58252li A0I = AbstractC58318PtA.A0I();
            this.A07 = A0I;
            this.A0A = new C2GT("");
            this.A0B = new C2GT("");
            C62761SPt A02 = C2J8.A04.A02();
            this.A0E = A02;
            C03250Di c03250Di = C03250Di.A00;
            C14360o3.A07(c03250Di);
            this.A0D = c03250Di;
            this.A0C = C63628Sqa.A00(this, 15);
            this.A00 = -1L;
            this.A00 = C63021Sam.A02.now();
            A0I.A0B(EnumC61121Rfb.A04);
            C58252li A01 = C75M.A01(A02.A00(), new C50269MHy(string, A02, 11));
            AbstractC58321PtD.A1D(A01, A0I, new C65076Td9(22, this, A01), 3);
            this.A0H = AbstractC09440dt.A00(EnumC09460dv.A02, new C57243PbR(this, 0));
            return;
        }
        throw AbstractC166987dD.A12("INTENT_KEY_CREDENTIAL_ID is missing from Intent extras");
    }

    public static final void A01(Q8D q8d, long j) {
        long now = q8d.A0D.now();
        long now2 = C63021Sam.A02.now();
        C62761SPt c62761SPt = q8d.A0E;
        String str = q8d.A0G;
        String str2 = (String) q8d.A0A.A02();
        if (str2 == null) {
            str2 = "";
        }
        Q8H A03 = c62761SPt.A03(str, str2, q8d.A02, false);
        AbstractC58321PtD.A1D(A03, q8d.A07, new C65024TcA(A03, q8d, now, j, now2), 3);
    }

    public final void A0E() {
        C58252li c58252li = this.A07;
        if (c58252li.A02() == EnumC61121Rfb.A05) {
            Iterator it = A00(this).iterator();
            while (it.hasNext()) {
                c58252li.A0D((C2GT) it.next());
            }
            c58252li.A0B(EnumC61121Rfb.A04);
            if (this.A09.A02() != EnumC61075Rep.A02) {
                long now = this.A0D.now();
                String str = (String) this.A0B.A02();
                if (str != null) {
                    Q8H A02 = this.A0E.A02(this.A0G, str, "IAB_AUTOFILL");
                    AbstractC58321PtD.A1D(A02, c58252li, new C65021Tc7(now, this, A02, 1), 3);
                    return;
                }
                return;
            }
            A01(this, -1L);
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot confirm card details from state ");
        throw AbstractC58320PtC.A0n(c58252li.A02(), A1C);
    }

    public static final List A00(Q8D q8d) {
        C2GS c2gs;
        EnumC61075Rep enumC61075Rep = (EnumC61075Rep) q8d.A09.A02();
        if (enumC61075Rep != null) {
            int A06 = AbstractC58318PtA.A06(enumC61075Rep, S6I.A00);
            if (A06 != 1) {
                if (A06 != 2) {
                    if (A06 == 3) {
                        return AbstractC16960so.A1Q(q8d.A0B, q8d.A0A);
                    }
                } else {
                    c2gs = q8d.A0B;
                }
            } else {
                c2gs = q8d.A0A;
            }
            return AbstractC166987dD.A1J(c2gs);
        }
        throw AbstractC166987dD.A14("Illegal scenario");
    }
}
