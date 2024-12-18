package X;

import com.facebook.quicklog.reliability.UserFlowConfig;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GsJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38274GsJ {
    public static volatile C38274GsJ A04;
    public ArrayList A00 = AbstractC166987dD.A1E();
    public boolean A01;
    public final C1QT A02;
    public final UserSession A03;

    public final void A02(C41181vS c41181vS, String str) {
        String str2;
        C14360o3.A0B(c41181vS, 0);
        if (A01(this)) {
            C1QT c1qt = this.A02;
            String str3 = c41181vS.A0j;
            C14360o3.A07(str3);
            if (!c1qt.isOngoingFlow(c1qt.generateFlowId(17308601, String.valueOf(str3).hashCode()))) {
                this.A00 = AbstractC166987dD.A1E();
                this.A01 = false;
                long generateFlowId = c1qt.generateFlowId(17308601, String.valueOf(str3).hashCode());
                c1qt.flowStartIfNotOngoing(generateFlowId, new UserFlowConfig(str, true));
                c1qt.flowAnnotate(generateFlowId, UserFlowLoggerImpl.SOURCE_ANNOTATION, str);
                A01(this);
                Long A00 = A00(this, str3);
                if (A00 != null) {
                    long longValue = A00.longValue();
                    EnumC40111tc A0C = c41181vS.A0C();
                    ArrayList arrayList = null;
                    if (A0C != null) {
                        str2 = A0C.name();
                    } else {
                        str2 = null;
                    }
                    c1qt.flowAnnotate(longValue, "media_type", str2);
                    c1qt.flowAnnotate(longValue, MSV.A00(1394), c41181vS.A0B().name());
                    List A0c = c41181vS.A0c();
                    if (A0c != null) {
                        arrayList = AbstractC167017dG.A0q(A0c);
                        Iterator it = A0c.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((C84823qW) it.next()).A12.name());
                        }
                    }
                    c1qt.flowAnnotate(longValue, "stickers", String.valueOf(arrayList));
                    C38321qM c38321qM = c41181vS.A0b;
                    if (c38321qM != null) {
                        c1qt.flowAnnotate(longValue, "cross_shared_to_fb", c38321qM.A5W() ? 1 : 0);
                    }
                    c1qt.flowAnnotate(longValue, "is_expired", c41181vS.A1D());
                }
            }
        }
    }

    public final void A03(String str) {
        Long A00;
        C14360o3.A0B(str, 0);
        if (A01(this) && (A00 = A00(this, str)) != null) {
            this.A02.flowAnnotate(A00.longValue(), "loaded_from_memory", 1);
        }
    }

    public final void A04(String str, String str2) {
        Long A00;
        C14360o3.A0B(str, 0);
        if (A01(this) && (A00 = A00(this, str)) != null) {
            long longValue = A00.longValue();
            C1QT c1qt = this.A02;
            c1qt.flowAnnotate(longValue, "cancel_reason", str2);
            c1qt.flowEndCancel(longValue, str2);
        }
    }

    public static final Long A00(C38274GsJ c38274GsJ, String str) {
        C1QT c1qt = c38274GsJ.A02;
        long generateFlowId = c1qt.generateFlowId(17308601, String.valueOf(str).hashCode());
        if (c1qt.isOngoingFlow(generateFlowId)) {
            return Long.valueOf(generateFlowId);
        }
        return null;
    }

    public static final boolean A01(C38274GsJ c38274GsJ) {
        return C18U.A06(C06090Tz.A05, c38274GsJ.A03, 36325519129588875L);
    }

    public C38274GsJ(UserSession userSession) {
        this.A03 = userSession;
        this.A02 = C1QS.A00(userSession);
    }
}
