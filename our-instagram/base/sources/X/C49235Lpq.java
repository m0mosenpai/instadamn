package X;

import com.facebook.msys.mci.TraceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.direct.perf.constants.ThreadFetchReason;
import com.instagram.model.direct.DirectThreadKey;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Lpq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49235Lpq implements InterfaceC29301b7 {
    public final UserSession A00;
    public final InterfaceC29301b7 A01;
    public final InterfaceC09390do A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final InterfaceC16820sZ A0D;
    public final InterfaceC16820sZ A0E;

    public C49235Lpq(UserSession userSession, InterfaceC29301b7 interfaceC29301b7) {
        C14360o3.A0B(interfaceC29301b7, 1);
        C50160MDn c50160MDn = new C50160MDn(userSession, 47);
        C50160MDn c50160MDn2 = new C50160MDn(userSession, 48);
        C50160MDn c50160MDn3 = new C50160MDn(userSession, 49);
        MHR mhr = new MHR(userSession, 0);
        MHR mhr2 = new MHR(userSession, 1);
        MHR mhr3 = new MHR(userSession, 2);
        MHR mhr4 = new MHR(userSession, 3);
        MHR mhr5 = new MHR(userSession, 4);
        C50160MDn c50160MDn4 = new C50160MDn(userSession, 46);
        C50219MGa c50219MGa = C50219MGa.A00;
        C50220MGb c50220MGb = C50220MGb.A00;
        C14360o3.A0B(c50219MGa, 12);
        C14360o3.A0B(c50220MGb, 13);
        this.A01 = interfaceC29301b7;
        this.A00 = userSession;
        this.A0E = mhr4;
        this.A0D = c50220MGb;
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0B = MHR.A00(c50160MDn, enumC09460dv, 13);
        this.A04 = MHR.A00(c50160MDn2, enumC09460dv, 6);
        this.A07 = MHR.A00(c50160MDn3, enumC09460dv, 9);
        this.A05 = MHR.A00(mhr3, enumC09460dv, 7);
        this.A06 = MHR.A00(mhr, enumC09460dv, 8);
        this.A03 = MHR.A00(mhr2, enumC09460dv, 5);
        this.A02 = AbstractC09440dt.A00(enumC09460dv, new MHU(49, mhr5, this));
        this.A0A = MHR.A00(c50160MDn4, enumC09460dv, 12);
        this.A0C = MHR.A00(c50219MGa, enumC09460dv, 14);
        this.A08 = MHR.A00(this, enumC09460dv, 10);
        this.A09 = MHR.A00(this, enumC09460dv, 11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ac, code lost:
    
        if (X.AbstractC167007dF.A1Z(r12.A0A) != false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.C19260xA r9, X.InterfaceC37261GbE r10, X.C1OW r11, X.C49235Lpq r12) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49235Lpq.A00(X.0xA, X.GbE, X.1OW, X.Lpq):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.0pQ, java.lang.Object] */
    @Override // X.InterfaceC29301b7
    public final void ENr(C19260xA c19260xA, InterfaceC37261GbE interfaceC37261GbE, C1OW c1ow) {
        C7J1 c7j0;
        boolean A1R = AbstractC167007dF.A1R(0, c1ow, c19260xA);
        C14360o3.A0B(interfaceC37261GbE, 2);
        InterfaceC29021af interfaceC29021af = (InterfaceC29021af) c1ow;
        DirectThreadKey directThreadKey = (DirectThreadKey) interfaceC29021af.C7R().get(0);
        C2DS c2ds = (C2DS) this.A0B.getValue();
        C14360o3.A0A(directThreadKey);
        C81663kb B3U = c2ds.B3U(directThreadKey);
        int i = 1;
        if (AbstractC167007dF.A1Z(this.A03) || (c1ow.A02.A00 == null && (B3U == null || AbstractC31283Dp5.A00(B3U) != A1R || B3U.Aic() == null))) {
            C14360o3.A0B(directThreadKey, 0);
            List list = directThreadKey.A02;
            if ((list == null || list.size() == A1R) && (AbstractC167007dF.A1Z(this.A06) || AbstractC167007dF.A1Z(this.A05) || AbstractC25231BEo.A1b(this.A0E))) {
                long convert = TimeUnit.SECONDS.convert(AbstractC166987dD.A0N(this.A0D.invoke()) - c1ow.A01, TimeUnit.MILLISECONDS);
                InterfaceC09390do interfaceC09390do = this.A02;
                if (AbstractC166987dD.A0N(interfaceC09390do.getValue()) > 0 && convert > AbstractC166987dD.A0N(interfaceC09390do.getValue())) {
                    interfaceC37261GbE.DUq(C114675Fx.A0a, null);
                    return;
                }
                ?? obj = new Object();
                if (interfaceC29021af.Ar9() != C2EY.A1i) {
                    i = 4;
                }
                obj.A00 = i;
                InterfaceC09390do interfaceC09390do2 = this.A07;
                interfaceC09390do2.getValue();
                String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(obj.A00, c1ow.A05);
                if (traceIdForAliasId != null) {
                    interfaceC09390do2.getValue();
                    C120005by.A03(traceIdForAliasId, null, obj.A00, 7034, 0);
                }
                if (B3U != null) {
                    B3U.C7I();
                }
                final C28811aJ c28811aJ = (C28811aJ) this.A04.getValue();
                C49274LqU c49274LqU = new C49274LqU(c19260xA, interfaceC37261GbE, c1ow, this, directThreadKey, traceIdForAliasId, obj);
                String str = directThreadKey.A00;
                final List list2 = directThreadKey.A02;
                if (str == null && list2 != null) {
                    if (C18U.A06(C06090Tz.A05, c28811aJ.A0M, 36325532014490767L)) {
                        final C44069Jdu c44069Jdu = new C44069Jdu(1, c49274LqU, c28811aJ);
                        c7j0 = new C7J1(c44069Jdu, c28811aJ, list2) { // from class: X.9o0
                            public C220169o2 A00;
                            public final List A01;
                            public final /* synthetic */ C28811aJ A02;

                            {
                                this.A02 = c28811aJ;
                                this.A01 = list2;
                            }

                            @Override // X.C7J1
                            public final void A00() {
                                Object obj2;
                                C28811aJ c28811aJ2 = this.A02;
                                Charset charset = C28811aJ.A0v;
                                C4KQ c4kq = c28811aJ2.A0O;
                                List list3 = this.A01;
                                Long valueOf = Long.valueOf(c28811aJ2.A01);
                                List list4 = c4kq.A0B;
                                ArrayList A1E = AbstractC166987dD.A1E();
                                for (Object obj3 : list4) {
                                    if (obj3 instanceof C220169o2) {
                                        A1E.add(obj3);
                                    }
                                }
                                Iterator it = A1E.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj2 = it.next();
                                        if (C14360o3.A0K(((C220169o2) obj2).A00, list3)) {
                                            break;
                                        }
                                    } else {
                                        obj2 = null;
                                        break;
                                    }
                                }
                                C220169o2 c220169o2 = (C220169o2) obj2;
                                if (c220169o2 == null) {
                                    c220169o2 = new C220169o2(c4kq, valueOf, list3);
                                    list4.add(c220169o2);
                                    c4kq.A08();
                                }
                                this.A00 = c220169o2;
                                c220169o2.A06.add(this);
                            }

                            @Override // X.C7J1
                            public final void A01() {
                                C220169o2 c220169o2 = this.A00;
                                if (c220169o2 != null) {
                                    c220169o2.A06(this);
                                    this.A00 = null;
                                }
                            }
                        };
                        c7j0.A03();
                        return;
                    }
                }
                c7j0 = new C7J0(ThreadFetchReason.EAGER_THREAD_RESOLUTION, new C44069Jdu(2, c49274LqU, c28811aJ), c28811aJ, directThreadKey);
                c7j0.A03();
                return;
            }
        }
        L1W l1w = c1ow.A02.A00;
        if (l1w != null && AbstractC46831KnQ.A00(l1w) == A1R) {
            AbstractC46726Klj.A00(this.A00).A02(directThreadKey);
        }
        if (B3U != null) {
            B3U.C7I();
        }
        A00(c19260xA, interfaceC37261GbE, c1ow, this);
    }

    @Override // X.InterfaceC29301b7
    public final boolean CfR(C1OW c1ow, MNP mnp) {
        AbstractC167017dG.A1N(c1ow, mnp);
        return this.A01.CfR(c1ow, mnp);
    }
}
