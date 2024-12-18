package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.L7k, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47764L7k {
    public final UserSession A00;
    public final MQ4 A01;
    public final Map A02;
    public final Map A03;
    public final InterfaceC08830cm A04;

    public C47764L7k(UserSession userSession) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        C14360o3.A0B(userSession, 1);
        M8T m8t = new M8T(new JQK(LGP.A01, 9), 14);
        C49307Lr1 c49307Lr1 = new C49307Lr1(userSession, new M8T(userSession, 13));
        C2EY c2ey = C2EY.A1F;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342156760132946144L)) {
            obj = new C49302Lqw(userSession);
        } else {
            obj = c49307Lr1;
        }
        C09530e4 A1L = AbstractC166987dD.A1L(c2ey, obj);
        C2EY c2ey2 = C2EY.A1g;
        if (C18U.A06(c06090Tz, userSession, 2342156760133011681L)) {
            obj2 = new C49306Lr0(userSession);
        } else {
            obj2 = c49307Lr1;
        }
        C09530e4 A1L2 = AbstractC166987dD.A1L(c2ey2, obj2);
        C2EY c2ey3 = C2EY.A1V;
        if (C18U.A06(c06090Tz, userSession, 2342156760133077218L)) {
            obj3 = new C49305Lqz(userSession);
        } else {
            obj3 = c49307Lr1;
        }
        C09530e4 A1L3 = AbstractC166987dD.A1L(c2ey3, obj3);
        C2EY c2ey4 = C2EY.A0W;
        if (C18U.A06(c06090Tz, userSession, 2342156760133470436L)) {
            obj4 = new C49300Lqu(userSession);
        } else {
            obj4 = c49307Lr1;
        }
        C09530e4 A1L4 = AbstractC166987dD.A1L(c2ey4, obj4);
        C2EY c2ey5 = C2EY.A0t;
        if (C18U.A06(c06090Tz, userSession, 2342156760133667046L)) {
            obj5 = new C49301Lqv(userSession);
        } else {
            obj5 = c49307Lr1;
        }
        C09530e4 A1L5 = AbstractC166987dD.A1L(c2ey5, obj5);
        C2EY c2ey6 = C2EY.A1Q;
        if (C18U.A06(c06090Tz, userSession, 2342156760133273827L)) {
            obj6 = new C49303Lqx(userSession);
        } else {
            obj6 = c49307Lr1;
        }
        LinkedHashMap A06 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, A1L4, A1L5, AbstractC166987dD.A1L(c2ey6, obj6), AbstractC166987dD.A1L(C2EY.A1z, new C49304Lqy(userSession)));
        LinkedHashMap A062 = AbstractC06930Yk.A06(AbstractC166987dD.A1L(c2ey, new C49302Lqw(userSession)), AbstractC166987dD.A1L(c2ey2, new C49306Lr0(userSession)), AbstractC166987dD.A1L(c2ey3, new C49305Lqz(userSession)), AbstractC166987dD.A1L(c2ey4, new C49300Lqu(userSession)), AbstractC166987dD.A1L(c2ey5, new C49301Lqv(userSession)));
        C14360o3.A0B(A06, 4);
        C14360o3.A0B(A062, 5);
        this.A00 = userSession;
        this.A04 = m8t;
        this.A01 = c49307Lr1;
        this.A03 = A06;
        this.A02 = A062;
    }

    public final void A00(L4I l4i) {
        MQ4 mq4;
        if (l4i.A05) {
            Object obj = this.A02.get(l4i.A01);
            if (obj != null) {
                mq4 = (MQ4) obj;
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            mq4 = (MQ4) this.A03.get(l4i.A01);
            if (mq4 == null) {
                mq4 = this.A01;
            }
        }
        mq4.EOO(l4i);
    }
}
