package X;

import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4eS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC100044eS {
    public final List A00 = new ArrayList();

    public long A03() {
        return 0L;
    }

    public boolean A05() {
        return false;
    }

    public boolean A0A() {
        return true;
    }

    public boolean A0B() {
        throw C00O.createAndThrow();
    }

    public boolean A0C() {
        return false;
    }

    public long A00() {
        if (this instanceof C100034eR) {
            return C18U.A01(C06090Tz.A05, ((C100034eR) this).A00, 36594573061523218L);
        }
        return LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
    }

    public long A01() {
        if (this instanceof C100034eR) {
            return C18U.A01(C06090Tz.A05, ((C100034eR) this).A00, 36594573061129999L);
        }
        return StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS;
    }

    public long A02() {
        if (this instanceof C100034eR) {
            return C18U.A01(C06090Tz.A05, ((C100034eR) this).A00, 36594573061195536L);
        }
        if (this instanceof C100304es) {
            return 64L;
        }
        return 16L;
    }

    public final List A04() {
        if (this instanceof C100034eR) {
            C100034eR c100034eR = (C100034eR) this;
            if (C18U.A06(C06090Tz.A05, c100034eR.A00, 36313098088351512L)) {
                ((AbstractC100044eS) c100034eR).A00.add(new Object());
            }
            return ((AbstractC100044eS) c100034eR).A00;
        }
        if (this instanceof C100304es) {
            C100304es c100304es = (C100304es) this;
            List list = ((AbstractC100044eS) c100304es).A00;
            if (!list.isEmpty()) {
                return list;
            }
            list.addAll(c100304es.A00.A00.A02().A04());
            return list;
        }
        return this.A00;
    }

    public boolean A06() {
        if (this instanceof C100034eR) {
            return C18U.A06(C06090Tz.A05, ((C100034eR) this).A00, 36313098084746991L);
        }
        return true;
    }

    public boolean A07() {
        if (this instanceof C100034eR) {
            return C18U.A06(C06090Tz.A05, ((C100034eR) this).A00, 36313098087499534L);
        }
        return true;
    }

    public boolean A08() {
        if (this instanceof C100034eR) {
            return C18U.A06(C06090Tz.A05, ((C100034eR) this).A00, 36313098086254336L);
        }
        if (this instanceof C100304es) {
            return true;
        }
        return false;
    }

    public boolean A09() {
        if (this instanceof C100034eR) {
            return C18U.A06(C06090Tz.A05, ((C100034eR) this).A00, 36313098086778629L);
        }
        if (this instanceof C100304es) {
            return true;
        }
        return false;
    }
}
