package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2LK, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2LK {
    public final List A00;

    public C2LK(final UserSession userSession) {
        this.A00 = AbstractC16960so.A1Q(new C2LP(userSession) { // from class: X.2LN
            public final C006802i A00;
            public final C2LR A01;

            {
                C14360o3.A0B(userSession, 1);
                this.A01 = (C2LR) userSession.A01(C2LR.class, new DGZ(userSession, 14));
                this.A00 = C006802i.A0p;
            }

            @Override // X.C2LP
            public final void AI5() {
                if (this.A01.A02) {
                    InterfaceC07320a6 interfaceC07320a6 = this.A00.A0G;
                    interfaceC07320a6.AHu(485);
                    interfaceC07320a6.AHu(525);
                    interfaceC07320a6.AHr(1060769838);
                }
                if (C2LR.A03) {
                    this.A00.A0G.AHu(3359);
                }
            }

            @Override // X.C2LP
            public final void E3A() {
                C2LR c2lr = this.A01;
                if (c2lr.A02 && c2lr.A01) {
                    InterfaceC07320a6 interfaceC07320a6 = this.A00.A0G;
                    interfaceC07320a6.E39(485, 1);
                    interfaceC07320a6.E39(525, 1);
                    interfaceC07320a6.E38(1060769838, 1);
                }
                if (C2LR.A03) {
                    this.A00.A0G.E39(3359, 1);
                }
            }
        }, new C2LU(userSession), new C2LP(userSession) { // from class: X.2LW
            public final C006802i A00;
            public final boolean A01;
            public final boolean A02;

            {
                C14360o3.A0B(userSession, 1);
                C06090Tz c06090Tz = C06090Tz.A05;
                this.A02 = C18U.A06(c06090Tz, userSession, 36314519718333097L);
                this.A01 = C18U.A06(c06090Tz, userSession, 36314519718398634L);
                this.A00 = C006802i.A0p;
            }

            @Override // X.C2LP
            public final void AI5() {
                if (this.A02) {
                    InterfaceC07320a6 interfaceC07320a6 = this.A00.A0G;
                    interfaceC07320a6.AHu(6096);
                    interfaceC07320a6.AHu(7614);
                }
            }

            @Override // X.C2LP
            public final void E3A() {
                if (this.A02 && this.A01) {
                    InterfaceC07320a6 interfaceC07320a6 = this.A00.A0G;
                    interfaceC07320a6.E39(6096, 1);
                    interfaceC07320a6.E39(7614, 1);
                }
            }
        }, new C2LP(userSession) { // from class: X.2LY
            public final C006802i A00;
            public final C48582La A01;
            public final List A02;

            {
                List list;
                C14360o3.A0B(userSession, 1);
                C48582La c48582La = new C48582La(userSession);
                this.A01 = c48582La;
                this.A00 = C006802i.A0p;
                if (c48582La.A00) {
                    C09530e4 c09530e4 = new C09530e4(31784972, Boolean.valueOf(c48582La.A08));
                    Boolean valueOf = Boolean.valueOf(c48582La.A01);
                    C09530e4 c09530e42 = new C09530e4(31784971, valueOf);
                    C09530e4 c09530e43 = new C09530e4(1060769838, valueOf);
                    C09530e4 c09530e44 = new C09530e4(20122678, Boolean.valueOf(c48582La.A03));
                    Boolean valueOf2 = Boolean.valueOf(c48582La.A05);
                    list = AbstractC16960so.A1Q(c09530e4, c09530e42, c09530e43, c09530e44, new C09530e4(20132307, valueOf2), new C09530e4(20131727, valueOf2), new C09530e4(20119557, valueOf2), new C09530e4(20127832, valueOf2), new C09530e4(20119555, Boolean.valueOf(c48582La.A02)), new C09530e4(20131826, Boolean.valueOf(c48582La.A09)), new C09530e4(20128172, Boolean.valueOf(c48582La.A04)), new C09530e4(20126309, Boolean.valueOf(c48582La.A06)), new C09530e4(20133400, Boolean.valueOf(c48582La.A07)));
                } else {
                    list = C16930sl.A00;
                }
                this.A02 = list;
            }

            @Override // X.C2LP
            public final void AI5() {
                List list = this.A02;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.A00.A0G.AHr(((Number) ((C09530e4) it.next()).A00).intValue());
                    arrayList.add(C0eB.A00);
                }
            }

            @Override // X.C2LP
            public final void E3A() {
                List<C09530e4> list = this.A02;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                for (C09530e4 c09530e4 : list) {
                    int intValue = ((Number) c09530e4.A00).intValue();
                    if (((Boolean) c09530e4.A01).booleanValue()) {
                        this.A00.A0G.E38(intValue, 1);
                    }
                    arrayList.add(C0eB.A00);
                }
            }
        });
    }
}
