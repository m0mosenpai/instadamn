package X;

import android.util.SparseArray;
import com.fbpay.w3c.Address;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.W3CCardDetail;
import com.fbpay.w3c.security.SecurityProviderEphemeral;
import java.util.Arrays;

/* renamed from: X.SPt, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62761SPt {
    public C5G6 A00;
    public final InterfaceC08830cm A01;

    public C62761SPt(InterfaceC08830cm interfaceC08830cm) {
        C14360o3.A0B(interfaceC08830cm, 1);
        this.A01 = interfaceC08830cm;
    }

    public final Q8H A02(String str, String str2, String str3) {
        C14360o3.A0B(str, 0);
        C60616REb ADd = ((C62706SMu) this.A01.get()).A04.ADd(str, str2, str3);
        C14360o3.A0B(ADd, 0);
        return new Q8H(ADd);
    }

    public final Q8H A03(String str, String str2, String str3, boolean z) {
        InterfaceC16660sJ c65026TcC;
        AbstractC167007dF.A1K(str, str2);
        C62903SWj c62903SWj = new C62903SWj(str, str2);
        InterfaceC08830cm interfaceC08830cm = this.A01;
        C62739SOf c62739SOf = new C62739SOf(((C62706SMu) interfaceC08830cm.get()).A00(null, null), new DRW(c62903SWj, 11));
        C64202T3r c64202T3r = (C64202T3r) ((C62706SMu) interfaceC08830cm.get()).A04;
        C58444PvN c58444PvN = new C58444PvN();
        C49352Or A01 = c64202T3r.A01(str3);
        SNN snn = (SNN) SecurityProviderEphemeral.A00.invoke();
        if (z) {
            c65026TcC = new MIO(A01, c64202T3r, snn, c58444PvN, str, 16);
        } else {
            c65026TcC = new C65026TcC(A01, c64202T3r, snn, c58444PvN, str, str2, 2);
        }
        snn.A01(c65026TcC);
        C62739SOf[] c62739SOfArr = {c62739SOf, new C62739SOf(c58444PvN, new DRW(c62903SWj, 12))};
        C58444PvN c58444PvN2 = new C58444PvN();
        int i = 0;
        do {
            C62739SOf c62739SOf2 = c62739SOfArr[i];
            c62739SOf2.A00.A9a(new C64200T3j(0, c62739SOf2, c58444PvN2));
            i++;
        } while (i < 2);
        return new Q8H(c58444PvN2);
    }

    public final C58252li A00() {
        String str;
        C62706SMu c62706SMu = (C62706SMu) this.A01.get();
        C5G6 c5g6 = this.A00;
        String str2 = null;
        if (c5g6 != null) {
            QIh qIh = c5g6.A00.A09;
            str = qIh.A05;
            str2 = qIh.A04;
        } else {
            str = null;
        }
        C60621REg A00 = c62706SMu.A00(str, str2);
        C14360o3.A0B(A00, 0);
        return C75M.A01(new Q8H(A00), C65063Tcs.A00);
    }

    public final Q8H A01(CardDetails cardDetails) {
        Integer num;
        C62706SMu c62706SMu = (C62706SMu) this.A01.get();
        W3CCardDetail w3CCardDetail = new W3CCardDetail(cardDetails, null, "", null, null, false);
        T3Q t3q = new T3Q(c62706SMu.A05.A00, "IAB_AUTOFILL");
        SparseArray A0G = AbstractC58318PtA.A0G();
        CardDetails cardDetails2 = w3CCardDetail.A00;
        Integer num2 = cardDetails2.A03;
        Integer num3 = cardDetails2.A04;
        if (num3 != null) {
            num = Integer.valueOf(num3.intValue() % 100);
        } else {
            num = null;
        }
        A0G.append(14, AbstractC166997dE.A0z("%02d%02d", Arrays.copyOf(new Object[]{num2, num}, 2)));
        A0G.append(15, cardDetails2.A09);
        A0G.append(13, cardDetails2.A07);
        Address address = cardDetails2.A00;
        if (address != null) {
            String str = address.A00;
            if (str != null && AbstractC25225BEi.A1Y(str)) {
                A0G.append(2, str);
            }
            String str2 = address.A05;
            if (str2 != null && AbstractC25225BEi.A1Y(str2)) {
                A0G.append(5, str2);
            }
            String str3 = address.A06;
            if (str3 != null && AbstractC25225BEi.A1Y(str3)) {
                A0G.append(6, str3);
            }
            String str4 = address.A01;
            if (str4 != null && AbstractC25225BEi.A1Y(str4)) {
                A0G.append(7, str4);
            }
            String str5 = address.A04;
            if (str5 != null && AbstractC25225BEi.A1Y(str5)) {
                A0G.append(8, str5);
            }
            String str6 = address.A02;
            if (str6 != null && AbstractC25225BEi.A1Y(str6)) {
                A0G.append(21, str6);
            }
            String str7 = address.A07;
            if (str7 != null && AbstractC25225BEi.A1Y(str7)) {
                A0G.append(9, str7);
            }
        }
        C64197T3g c64197T3g = new C64197T3g(t3q.ENp(A0G, null), new X58(new DRW(c62706SMu, 3), 48));
        C14360o3.A0B(c64197T3g, 0);
        return new Q8H(c64197T3g);
    }

    public final String A04() {
        return new C49352Or(((C64202T3r) ((C62706SMu) this.A01.get()).A04).A01.userId).A00();
    }
}
