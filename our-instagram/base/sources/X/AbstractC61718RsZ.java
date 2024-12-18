package X;

import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import java.util.Map;

/* renamed from: X.RsZ, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC61718RsZ {
    public static final void A00(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        QIy qIy = c62620SJd.A07;
        if (qIy == null) {
            QIy qIy2 = c62620SJd.A06;
            String str = qIy2.A05;
            String str2 = qIy2.A06;
            QIj qIj = (QIj) qIy2.A01;
            QIj qIj2 = (QIj) qIy2.A04;
            QIj qIj3 = (QIj) qIy2.A03;
            QIp qIp = (QIp) qIy2.A00;
            Map map = (Map) qIy2.A02;
            AbstractC25229BEm.A1I(str, 0, map);
            c62620SJd.A07 = new QIy(qIp, qIj, qIj2, qIj3, str, str2, map);
            return;
        }
        QIp qIp2 = (QIp) c62620SJd.A06.A00;
        if (qIp2 != null && AbstractC62771SQn.A01(new AutofillData(AbstractC61726Rsh.A00(qIp2)))) {
            qIy.A00 = new QIp(qIp2.A0M, qIp2.A04, qIp2.A03, qIp2.A05, qIp2.A0H, qIp2.A0I, qIp2.A0J, qIp2.A01, qIp2.A02, qIp2.A0D, qIp2.A0G, qIp2.A06, qIp2.A07, qIp2.A08, qIp2.A09, qIp2.A0A, qIp2.A0B, qIp2.A0C, qIp2.A0E, qIp2.A0F, qIp2.A0K, qIp2.A0L, 1);
        }
        QIj qIj4 = (QIj) c62620SJd.A06.A04;
        if (qIj4 != null && AbstractC63348Si5.A03(AbstractC63348Si5.A00(qIj4))) {
            qIy.A04 = new QIj(qIj4.A01, qIj4.A02, qIj4.A04, qIj4.A05, qIj4.A03, 0);
        }
        QIj qIj5 = (QIj) c62620SJd.A06.A03;
        if (qIj5 != null && AbstractC63348Si5.A03(AbstractC63348Si5.A00(qIj5))) {
            qIy.A03 = new QIj(qIj5.A01, qIj5.A02, qIj5.A04, qIj5.A05, qIj5.A03, 0);
        }
        QIj qIj6 = (QIj) c62620SJd.A06.A01;
        if (qIj6 == null || !AbstractC63348Si5.A03(AbstractC63348Si5.A00(qIj6))) {
            return;
        }
        qIy.A01 = new QIj(qIj6.A01, qIj6.A02, qIj6.A04, qIj6.A05, qIj6.A03, 0);
    }
}
