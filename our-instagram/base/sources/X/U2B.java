package X;

import android.location.Location;
import com.instagram.common.session.UserSession;

/* loaded from: classes11.dex */
public final class U2B implements InterfaceC169467hM {
    public boolean A00;
    public final /* synthetic */ AbstractC65919TwQ A01;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001b, code lost:
    
        if (r0.length() == 0) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b1  */
    @Override // X.InterfaceC169457hL
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void DgO(X.UQE r17, X.U3C r18) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U2B.DgO(X.UQE, X.U3C):void");
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN6(UQE uqe, String str) {
        C14360o3.A0B(uqe, 0);
        AbstractC65919TwQ abstractC65919TwQ = this.A01;
        InterfaceC169497hP interfaceC169497hP = abstractC65919TwQ.A0B;
        if (interfaceC169497hP == null) {
            C14360o3.A0F("cache");
            throw C00O.createAndThrow();
        }
        return U3F.A00(abstractC65919TwQ.A0E(), uqe.A01, "typeahead_search_page", str, interfaceC169497hP.BjO(uqe).A04, uqe.A00, 30);
    }

    @Override // X.InterfaceC169477hN
    public final C1ON AN7(String str, String str2) {
        C14360o3.A0B(str, 0);
        AbstractC65919TwQ abstractC65919TwQ = this.A01;
        InterfaceC169497hP interfaceC169497hP = abstractC65919TwQ.A0B;
        if (interfaceC169497hP == null) {
            C14360o3.A0F("cache");
            throw C00O.createAndThrow();
        }
        return U3F.A00(abstractC65919TwQ.A0E(), str, "typeahead_search_page", str2, interfaceC169497hP.BjP(str).A04, "fbsearch/ig_typeahead/", 30);
    }

    @Override // X.InterfaceC169477hN
    public final C24531Hw AN8(UQE uqe, String str) {
        C14360o3.A0B(uqe, 0);
        AbstractC65919TwQ abstractC65919TwQ = this.A01;
        InterfaceC169497hP interfaceC169497hP = abstractC65919TwQ.A0B;
        if (interfaceC169497hP == null) {
            C14360o3.A0F("cache");
            throw C00O.createAndThrow();
        }
        String str2 = interfaceC169497hP.BjO(uqe).A04;
        UserSession A0E = abstractC65919TwQ.A0E();
        String str3 = uqe.A01;
        String str4 = null;
        C14360o3.A0B(A0E, 0);
        Location performIntegrityChecks = C1VW.performIntegrityChecks(null);
        C23711Eb c23711Eb = new C23711Eb(A0E, 768890804, 1, false);
        c23711Eb.A06();
        c23711Eb.A0B("fbsearch/typeahead_stream/");
        c23711Eb.A01 = new C23751Eh(new C07510aQ(A0E), new C25611Mr(null), U3A.class, true, false);
        ((AbstractC23721Ec) c23711Eb).A06 = EnumC23341Bw.CriticalAPI;
        c23711Eb.A0V = true;
        c23711Eb.A9s("query", str3);
        c23711Eb.A9s("count", String.valueOf(30));
        c23711Eb.A9s("context", "blended");
        String str5 = null;
        if (performIntegrityChecks != null) {
            str4 = Double.valueOf(performIntegrityChecks.getLatitude()).toString();
        }
        c23711Eb.A9s("lat", str4);
        if (performIntegrityChecks != null) {
            str5 = Double.valueOf(performIntegrityChecks.getLongitude()).toString();
        }
        c23711Eb.A9s("lng", str5);
        AbstractC37303Gc4.A15(c23711Eb);
        c23711Eb.A9s("search_surface", "typeahead_search_page");
        c23711Eb.A0H("rank_token", str2);
        c23711Eb.A0H("page_token", str);
        return c23711Eb.A0N();
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dfn(UQE uqe) {
        C9QE.A02(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfo(String str) {
        C14360o3.A0B(str, 0);
        C65973TxQ c65973TxQ = this.A01.A0D;
        if (c65973TxQ == null) {
            C14360o3.A0F("searchQueryPerfLogger");
            throw C00O.createAndThrow();
        }
        C65973TxQ.A00(c65973TxQ, str, null, 0, 0, false);
        C65973TxQ.A02(c65973TxQ, str, "SEARCH_QUERY_REQUEST_DROPPED", (short) 2);
    }

    @Override // X.InterfaceC169457hL
    public final void Dfq(UQE uqe, AbstractC115105If abstractC115105If) {
        C14360o3.A0B(uqe, 0);
        AbstractC65919TwQ abstractC65919TwQ = this.A01;
        String str = uqe.A01;
        AbstractC65919TwQ.A0B(abstractC65919TwQ, str);
        C50526MSf c50526MSf = (C50526MSf) abstractC65919TwQ.A0G.get(uqe.A00);
        if (c50526MSf != null) {
            c50526MSf.A00 = true;
            c50526MSf.A01 = false;
        }
        abstractC65919TwQ.A0H = true;
        AbstractC65919TwQ.A0A(abstractC65919TwQ);
        abstractC65919TwQ.A0K(str, false);
        C65973TxQ c65973TxQ = abstractC65919TwQ.A0D;
        String str2 = "searchQueryPerfLogger";
        if (c65973TxQ != null) {
            c65973TxQ.A03(str);
            C65973TxQ c65973TxQ2 = abstractC65919TwQ.A0D;
            if (c65973TxQ2 != null) {
                C65960TxC c65960TxC = abstractC65919TwQ.A07;
                if (c65960TxC == null) {
                    str2 = "dataSource";
                } else {
                    c65973TxQ2.A04(str, null, 0, c65960TxC.A01.A00.size(), false);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169457hL
    public final void Dft(AbstractC115105If abstractC115105If, String str) {
        C14360o3.A0B(str, 0);
        AbstractC65919TwQ abstractC65919TwQ = this.A01;
        AbstractC65919TwQ.A0B(abstractC65919TwQ, str);
        abstractC65919TwQ.A0H = true;
        AbstractC65919TwQ.A0A(abstractC65919TwQ);
        abstractC65919TwQ.A0K(str, false);
        C65973TxQ c65973TxQ = abstractC65919TwQ.A0D;
        String str2 = "searchQueryPerfLogger";
        if (c65973TxQ != null) {
            c65973TxQ.A03(str);
            C65973TxQ c65973TxQ2 = abstractC65919TwQ.A0D;
            if (c65973TxQ2 != null) {
                C65960TxC c65960TxC = abstractC65919TwQ.A07;
                if (c65960TxC == null) {
                    str2 = "dataSource";
                } else {
                    c65973TxQ2.A04(str, null, 0, c65960TxC.A01.A00.size(), false);
                    return;
                }
            }
        }
        C14360o3.A0F(str2);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void Dg0(UQE uqe) {
        C9QE.A03(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void Dg3(String str) {
    }

    @Override // X.InterfaceC169457hL
    public final /* synthetic */ void DgG(UQE uqe) {
        C9QE.A04(uqe, this);
    }

    @Override // X.InterfaceC169457hL
    public final void DgJ(String str) {
        C14360o3.A0B(str, 0);
        C65973TxQ c65973TxQ = this.A01.A0D;
        if (c65973TxQ == null) {
            C14360o3.A0F("searchQueryPerfLogger");
            throw C00O.createAndThrow();
        }
        U1D u1d = (U1D) c65973TxQ.A00.get(str);
        if (u1d != null) {
            u1d.A01("SEARCH_QUERY_REQUEST_START", null);
        }
    }

    public U2B(AbstractC65919TwQ abstractC65919TwQ) {
        this.A01 = abstractC65919TwQ;
    }

    @Override // X.InterfaceC169467hM
    public final C1GL BqZ() {
        return this.A01;
    }

    @Override // X.InterfaceC169477hN
    public final boolean Cdt() {
        return this.A01.A0R;
    }

    @Override // X.InterfaceC169457hL
    public final /* bridge */ /* synthetic */ void DgS(InterfaceC40821up interfaceC40821up, String str) {
        U3C u3c = (U3C) interfaceC40821up;
        AbstractC167017dG.A1N(str, u3c);
        DgO(new UQE(str), u3c);
    }

    @Override // X.InterfaceC169477hN
    public final void DpU(boolean z) {
        String str;
        if (this.A00 != z) {
            this.A00 = z;
            if (z) {
                AbstractC65919TwQ abstractC65919TwQ = this.A01;
                InterfaceC190488c6 A0F = abstractC65919TwQ.A0F();
                String str2 = abstractC65919TwQ.A01.A01;
                String E6e = abstractC65919TwQ.A0i.E6e(new UQE(str2, "fbsearch/ig_typeahead/", 10));
                C65960TxC c65960TxC = abstractC65919TwQ.A07;
                if (c65960TxC == null) {
                    str = "dataSource";
                } else {
                    C65956Tx8 c65956Tx8 = c65960TxC.A01;
                    if (abstractC65919TwQ.A04 == null) {
                        str = "loggingFilter";
                    } else {
                        A0F.Cld(U3J.A00(c65956Tx8), str2, E6e);
                        return;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            }
        }
    }
}
