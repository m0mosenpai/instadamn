package X;

import android.util.Pair;
import com.fbpay.w3c.CardDetails;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public final class TW1 implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public TW1(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        C63406Sjd c63406Sjd;
        Object A1E;
        String str;
        HashMap A10;
        switch (this.A00) {
            case 0:
                C63380Siu c63380Siu = (C63380Siu) this.A01;
                CardDetails cardDetails = (CardDetails) this.A02;
                CardDetails A01 = AbstractC63348Si5.A01((String) obj, "", "", String.valueOf(cardDetails.A03), String.valueOf(cardDetails.A04));
                c63380Siu.A0Q.A00.A06.A01 = AbstractC61727Rsi.A00(A01);
                C63380Siu.A03(c63380Siu, A01);
                return null;
            case 1:
                List list = ((C61575Rpy) obj).A07;
                if (list != null && !list.isEmpty()) {
                    int A0H = AbstractC166987dD.A0H(((Pair) this.A02).second);
                    if (A0H >= list.size()) {
                        A0H = AbstractC25226BEj.A05(list);
                    }
                    return list.get(A0H);
                }
                return null;
            case 2:
            case 3:
            case 4:
            default:
                Q8S q8s = (Q8S) this.A02;
                return q8s.A01.A04((C61549RpU) obj, q8s.A00);
            case 5:
                C63406Sjd c63406Sjd2 = (C63406Sjd) obj;
                if (C63406Sjd.A0G(c63406Sjd2)) {
                    return C63406Sjd.A05(null, c63406Sjd2.A02);
                }
                if (C63406Sjd.A0J(c63406Sjd2)) {
                    SPK spk = ((SE3) C63406Sjd.A08(c63406Sjd2)).A00;
                    C63346Si2 c63346Si2 = ((C62962SZf) this.A01).A00.A01;
                    for (C63152Se0 c63152Se0 : ((SXG) this.A02).A09) {
                        if (c63152Se0.A05.equalsIgnoreCase(spk.A04)) {
                            return C63406Sjd.A04(c63346Si2.A05(spk, c63152Se0));
                        }
                    }
                    throw AbstractC166987dD.A18("Not found!");
                }
                return C63406Sjd.A03(null);
            case 6:
                c63406Sjd = (C63406Sjd) obj;
                Object obj2 = c63406Sjd.A01;
                if (obj2 != null) {
                    A1E = AbstractC166987dD.A1E();
                    Object obj3 = ((C3AY) obj2).A01;
                    if (obj3 != null) {
                        Iterator A1J = AbstractC25226BEj.A1J(obj3);
                        while (A1J.hasNext()) {
                            Object next = A1J.next();
                            if (AbstractC166987dD.A1a(((C1N8) this.A02).apply(next))) {
                                A1E.add(next);
                            }
                        }
                    }
                    return C63406Sjd.A02(c63406Sjd, A1E);
                }
                A1E = 0;
                return C63406Sjd.A02(c63406Sjd, A1E);
            case 7:
                c63406Sjd = (C63406Sjd) obj;
                Object obj4 = c63406Sjd.A01;
                if (obj4 != null) {
                    SEB seb = (SEB) obj4;
                    C2GC c2gc = ((REW) this.A01).A01;
                    if (c2gc != null) {
                        X509Certificate x509Certificate = seb.A00;
                        if (x509Certificate != null) {
                            str = Long.toString(TimeUnit.MILLISECONDS.toSeconds(x509Certificate.getNotAfter().getTime() - new Date().getTime()));
                        } else {
                            str = "na";
                        }
                        Map map = ((SJ1) this.A02).A00;
                        if (map == null) {
                            A10 = AbstractC166987dD.A1G();
                        } else {
                            A10 = AbstractC58318PtA.A10(map);
                        }
                        A10.put("sec_type", "use_encryption_key");
                        A10.put("ptt_encryption_key_life_in_sec", str);
                        try {
                            c2gc.Chz("client_load_paysec_success", A10);
                        } catch (Exception unused) {
                        }
                    }
                    A1E = AbstractC166987dD.A16(seb.A01);
                    return C63406Sjd.A02(c63406Sjd, A1E);
                }
                A1E = 0;
                return C63406Sjd.A02(c63406Sjd, A1E);
        }
    }
}
