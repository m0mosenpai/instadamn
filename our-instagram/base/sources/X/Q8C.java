package X;

import android.app.Application;
import android.os.Bundle;
import com.fbpay.w3c.CardDetails;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class Q8C extends C193578hc {
    public static final C11L A0D = new C11L("^\\d{3,4}$");
    public long A00;
    public String A01;
    public List A02;
    public final C58252li A03;
    public final C2GS A04;
    public final C2GS A05;
    public final C2GS A06;
    public final C0JM A07;
    public final C62761SPt A08;
    public final Integer A09;
    public final List A0A;
    public final Application A0B;
    public final Bundle A0C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.2GT, X.2GS] */
    public Q8C(Application application, Bundle bundle) {
        super(application);
        ArrayList parcelableArrayList;
        C14360o3.A0B(application, 1);
        this.A0B = application;
        this.A0C = bundle;
        if (bundle != null && (parcelableArrayList = bundle.getParcelableArrayList("cardDetailsList")) != null) {
            this.A0A = parcelableArrayList;
            this.A09 = Integer.valueOf(bundle.getInt("qplInstanceKey"));
            this.A02 = AbstractC166987dD.A1E();
            C2GS A0J = AbstractC58318PtA.A0J();
            this.A04 = A0J;
            C58252li A0I = AbstractC58318PtA.A0I();
            this.A03 = A0I;
            this.A06 = new C2GT("");
            C2GS A0J2 = AbstractC58318PtA.A0J();
            this.A05 = A0J2;
            C62761SPt A02 = C2J8.A04.A02();
            this.A08 = A02;
            C03250Di c03250Di = C03250Di.A00;
            C14360o3.A07(c03250Di);
            this.A07 = c03250Di;
            this.A00 = -1L;
            this.A00 = C63021Sam.A02.now();
            A0I.A0B(EnumC61120Rfa.A04);
            if (AbstractC25226BEj.A1b(parcelableArrayList)) {
                A0I.A0B(EnumC61120Rfa.A03);
                this.A01 = A02.A04();
                A0J2.A0B(AbstractC001800i.A0I(parcelableArrayList));
                A00(this);
                return;
            }
            A0I.A0B(EnumC61120Rfa.A02);
            A0J.A0B(new QIi(null, null, "error_card_not_found", -1L, -1L, -1L));
            return;
        }
        throw AbstractC166987dD.A12("INTENT_KEY_CARD_DETAILS_LIST is missing from Intent extras");
    }

    public static final void A00(Q8C q8c) {
        C63628Sqa A00 = C63628Sqa.A00(q8c, 11);
        C58252li c58252li = q8c.A03;
        c58252li.A0E(q8c.A06, A00);
        c58252li.A0E(q8c.A05, C63628Sqa.A00(q8c, 12));
    }

    public final void A0E() {
        String str;
        C58252li c58252li = this.A03;
        if (c58252li.A02() == EnumC61120Rfa.A05) {
            C2GS c2gs = this.A06;
            c58252li.A0D(c2gs);
            C2GS c2gs2 = this.A05;
            c58252li.A0D(c2gs2);
            c58252li.A0B(EnumC61120Rfa.A04);
            long now = this.A07.now();
            long now2 = C63021Sam.A02.now();
            CardDetails cardDetails = (CardDetails) c2gs2.A02();
            if (cardDetails != null && (str = cardDetails.A08) != null) {
                C62761SPt c62761SPt = this.A08;
                String str2 = (String) c2gs.A02();
                if (str2 == null) {
                    str2 = "";
                }
                Q8H A03 = c62761SPt.A03(str, str2, this.A01, false);
                AbstractC58321PtD.A1D(A03, c58252li, new C29923DHl(1, now2, now, A03, this), 1);
                return;
            }
            return;
        }
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Cannot confirm card details from state ");
        throw AbstractC58320PtC.A0n(c58252li.A02(), A1C);
    }
}
