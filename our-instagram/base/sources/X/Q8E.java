package X;

import android.app.Application;
import android.os.Bundle;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q8E extends C193578hc {
    public long A00;
    public EnumC61219RhJ A01;
    public C62761SPt A02;
    public String A03;
    public String A04;
    public String A05;
    public List A06;
    public final Application A07;
    public final C58252li A08;
    public final C2GS A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final C0JM A0D;
    public final Integer A0E;
    public final String A0F;
    public final InterfaceC09390do A0G;
    public final Bundle A0H;
    public final InterfaceC58362lv A0I;
    public static final java.util.Set A0K = AbstractC16830sb.A07("IAB_AUTOFILL", "IAB_AUTOFILL_MIGRATION", "IAB_AUTOFILL_BINDING_UPDATER", "IAB_AUTOFILL_CROSS_APP", "IAB_AUTOFILL_CROSS_APP_MIGRATION", "IAB_AUTOFILL_SILENT_BINDING", "IAB_AUTOFILL_UNBOUND_CARD_TRUSTED_DEVICE_CHAIN", "UNKNOWN");
    public static final C11L A0L = new C11L("^\\d{16}$");
    public static final C11L A0J = new C11L("^\\d{3,4}$");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v10, types: [X.2GT, X.2GS] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.2GT, X.2GS] */
    public Q8E(Application application, Bundle bundle) {
        super(application);
        String string;
        C14360o3.A0B(application, 1);
        this.A07 = application;
        this.A0H = bundle;
        if (bundle != null && (string = bundle.getString("keyCredentialId")) != null) {
            this.A0F = string;
            this.A0E = Integer.valueOf(bundle.getInt("qplInstanceKey"));
            this.A06 = AbstractC166987dD.A1E();
            this.A09 = AbstractC58318PtA.A0J();
            this.A0A = AbstractC58318PtA.A0J();
            C58252li A0I = AbstractC58318PtA.A0I();
            this.A08 = A0I;
            this.A0B = new C2GT("");
            this.A0C = new C2GT("");
            this.A02 = C2J8.A04.A02();
            C03250Di c03250Di = C03250Di.A00;
            C14360o3.A07(c03250Di);
            this.A0D = c03250Di;
            this.A0I = new C63627SqZ(this, 49);
            this.A00 = -1L;
            this.A00 = C63021Sam.A02.now();
            A0I.A0B(EnumC61125Rff.A04);
            C62761SPt c62761SPt = this.A02;
            C58252li A01 = C75M.A01(c62761SPt.A00(), new C50269MHy(string, c62761SPt, 11));
            AbstractC58321PtD.A1D(A01, A0I, new X67(10, A01, this), 36);
            this.A0G = AbstractC09440dt.A01(new X2w(this, 19));
            return;
        }
        throw AbstractC166987dD.A12("INTENT_KEY_CREDENTIAL_ID is missing from Intent extras");
    }

    private final List A00() {
        C2GS c2gs;
        EnumC61076Req enumC61076Req = (EnumC61076Req) this.A0A.A02();
        if (enumC61076Req != null) {
            int A06 = AbstractC58318PtA.A06(enumC61076Req, AbstractC62328S6y.A00);
            if (A06 != 1) {
                if (A06 != 2) {
                    if (A06 == 3) {
                        return AbstractC16960so.A1Q(this.A0C, this.A0B);
                    }
                } else {
                    c2gs = this.A0C;
                }
            } else {
                c2gs = this.A0B;
            }
            return AbstractC166987dD.A1J(c2gs);
        }
        throw AbstractC166987dD.A14("Illegal scenario");
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0pT, java.lang.Object] */
    public static final void A02(Q8E q8e, long j) {
        ?? obj = new Object();
        obj.A00 = q8e.A0D.now();
        long now = C63021Sam.A02.now();
        C62761SPt c62761SPt = q8e.A02;
        String str = q8e.A0F;
        Object A02 = q8e.A0B.A02();
        C14360o3.A0A(A02);
        Q8H A03 = c62761SPt.A03(str, (String) A02, q8e.A03, false);
        AbstractC58321PtD.A1D(A03, q8e.A08, new C65025TcB(A03, q8e, obj, j, now), 36);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.0pT, java.lang.Object] */
    public final void A0E() {
        C58252li c58252li = this.A08;
        if (c58252li.A02() == EnumC61125Rff.A05) {
            Iterator it = A00().iterator();
            while (it.hasNext()) {
                c58252li.A0D((C2GT) it.next());
            }
            c58252li.A0B(EnumC61125Rff.A04);
            if (this.A0A.A02() != EnumC61076Req.A02) {
                ?? obj = new Object();
                obj.A00 = this.A0D.now();
                String str = (String) this.A0C.A02();
                if (str != null) {
                    Q8H A02 = this.A02.A02(this.A0F, str, "IAB_AUTOFILL");
                    AbstractC58321PtD.A1D(A02, c58252li, new DHZ(47, A02, this, obj), 36);
                    return;
                }
                return;
            }
            A02(this, -1L);
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot confirm card details from state ");
        throw AbstractC58320PtC.A0n(c58252li.A02(), A1C);
    }

    public static final void A01(Q8E q8e) {
        Iterator it = q8e.A00().iterator();
        while (it.hasNext()) {
            q8e.A08.A0E((C2GT) it.next(), q8e.A0I);
        }
    }
}
