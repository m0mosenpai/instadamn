package X;

import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JUs, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43707JUs extends C126455ng implements InterfaceC50443MOx {
    public C83403nh A00;
    public K8O A01;
    public Boolean A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public List A06 = Collections.emptyList();
    public List A07 = Collections.emptyList();
    public boolean A08 = false;

    public final boolean A03() {
        C81613kW c81613kW = this.A0a;
        if (c81613kW != null && c81613kW.A01()) {
            return true;
        }
        return false;
    }

    public final boolean A04(UserSession userSession) {
        C81613kW c81613kW = this.A0a;
        if (c81613kW != null && c81613kW.A03(userSession)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC50443MOx
    public final boolean CLR() {
        Boolean bool = this.A03;
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void A02() {
        super.A01();
        C83403nh c83403nh = this.A00;
        if (c83403nh != null) {
            c83403nh.A1m(C05F.A0j);
        }
        Iterator it = this.A06.iterator();
        while (it.hasNext()) {
            ((C83403nh) it.next()).A1m(C05F.A0j);
        }
        Iterator it2 = this.A07.iterator();
        while (it2.hasNext()) {
            ((C83403nh) it2.next()).A1m(C05F.A0j);
        }
        K8O k8o = this.A01;
        if (k8o != null) {
            Iterator it3 = k8o.A04.iterator();
            while (it3.hasNext()) {
                ((C83403nh) it3.next()).A1m(C05F.A0j);
            }
        }
        if (!CLR()) {
            this.A05 = null;
        }
    }

    public final boolean A05(UserSession userSession) {
        if (!A03() && !A04(userSession)) {
            Iterator it = this.A06.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C83403nh) it.next()).A10 == C2EY.A0n) {
                        break;
                    }
                } else {
                    C133205zm c133205zm = this.A0h;
                    if (c133205zm != null && (c133205zm.A00 != null || c133205zm.A01 != null)) {
                        return true;
                    }
                    C1118752z c1118752z = this.A0o;
                    if (c1118752z != null) {
                        if (!c1118752z.A08) {
                            Long l = c1118752z.A05;
                            if (l != null && System.currentTimeMillis() - l.longValue() < 1209600000) {
                                return true;
                            }
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
