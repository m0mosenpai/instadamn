package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.enums.EnumEntries;

/* renamed from: X.Sfk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63232Sfk {
    public static final Integer A00(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        QIl qIl = c62620SJd.A00;
        if (AbstractC58320PtC.A1W(qIl.A03, C63269SgT.A0C)) {
            if (AbstractC58320PtC.A1W(qIl.A03, C63269SgT.A07)) {
                return C05F.A0C;
            }
            return C05F.A01;
        }
        return C05F.A00;
    }

    public static final String A01(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        QIl qIl = c62620SJd.A00;
        if (AbstractC58320PtC.A1W(qIl.A03, C63269SgT.A0C)) {
            if (AbstractC58320PtC.A1W(qIl.A03, C63269SgT.A07)) {
                return "CONTACT_AND_PAYMENT_AUTOFILL";
            }
            return "PAYMENT_AUTOFILL";
        }
        return "CONTACT_AUTOFILL";
    }

    public static final boolean A02(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        QIl qIl = c62620SJd.A00;
        if (qIl.A01 != null && !A03(c62620SJd) && AbstractC001800i.A0u(C63269SgT.A04, qIl.A01)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(C62620SJd c62620SJd) {
        C14360o3.A0B(c62620SJd, 0);
        EnumEntries enumEntries = EnumC61168RgU.A01;
        ArrayList A0q = AbstractC167017dG.A0q(enumEntries);
        Iterator<E> it = enumEntries.iterator();
        while (it.hasNext()) {
            A0q.add(((EnumC61168RgU) it.next()).A00);
        }
        if (!(A0q instanceof Collection) || !A0q.isEmpty()) {
            Iterator it2 = A0q.iterator();
            while (it2.hasNext()) {
                if (C14360o3.A0K(it2.next(), c62620SJd.A00.A01)) {
                    return true;
                }
            }
        }
        return false;
    }
}
