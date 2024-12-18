package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C149596oC {
    public C41761wQ A00;
    public final UserSession A01;
    public final AtomicReference A02;

    public C149596oC(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A01 = userSession;
        this.A02 = new AtomicReference(null);
    }

    public final void A02(C2EC c2ec) {
        C81613kW Aic = c2ec.Aic();
        if (Aic != null) {
            UserSession userSession = this.A01;
            if (Aic.A01() || Aic.A03(userSession)) {
                List A00 = A00(c2ec);
                if (!A00.isEmpty()) {
                    A01(this, A00, false);
                    if (C18U.A06(C06090Tz.A05, userSession, 36320790370984854L)) {
                        LCH.A01(new C50370MLx(21, A00, (Object) null), userSession);
                    }
                }
            }
        }
    }

    public static final void A01(C149596oC c149596oC, List list, boolean z) {
        UserSession userSession = c149596oC.A01;
        if (C18U.A06(C06090Tz.A05, userSession, 36320790370919317L)) {
            LCH.A01(new DHP(12, list, z), userSession);
            c149596oC.A02.set(list);
        }
    }

    public final void A03(C2EC c2ec) {
        UserSession userSession = this.A01;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342161871143967353L)) {
            if (C18U.A06(c06090Tz, userSession, 2342161871143967353L) && ((C18U.A06(c06090Tz, userSession, 36328993759576000L) || C18U.A06(c06090Tz, userSession, 36328993759641537L)) && this.A00 == null)) {
                C50261MHq c50261MHq = new C50261MHq(this, 22);
                C41761wQ c41761wQ = new C41761wQ(null);
                this.A00 = c41761wQ;
                c41761wQ.A02(C6AH.A00(userSession).A0B, new B46(c50261MHq));
            }
            List A00 = A00(c2ec);
            if (!A00.isEmpty()) {
                A01(this, A00, C18U.A06(c06090Tz, userSession, 36328993759510463L));
                if (C18U.A06(c06090Tz, userSession, 36328993759707074L)) {
                    LCH.A01(new C50370MLx(21, A00, (Object) null), userSession);
                }
            }
        }
    }

    private final List A00(C2EC c2ec) {
        C81613kW Aic;
        C01L A1I = C0eM.A1I();
        if (c2ec != null && (Aic = c2ec.Aic()) != null) {
            UserSession userSession = this.A01;
            if (Aic.A01() || Aic.A03(userSession)) {
                List<String> BSF = c2ec.BSF();
                ArrayList arrayList = new ArrayList();
                for (String str : BSF) {
                    C14360o3.A0A(str);
                    C14360o3.A0B(str, 0);
                    Long A0k = AbstractC003100w.A0k(10, str);
                    if (A0k != null) {
                        arrayList.add(A0k);
                    }
                }
                A1I.addAll(arrayList);
            }
        }
        Long BTC = C17060sy.A01.A01(this.A01).BTC();
        if (BTC != null) {
            A1I.add(BTC);
        }
        return C0eM.A1J(A1I);
    }
}
