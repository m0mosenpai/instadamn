package X;

import android.content.Context;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.OMw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54847OMw {
    public static OWe A00(N1N n1n, C195988ln c195988ln, String str) {
        c195988ln.A01("sup:MediaStreamControllerDelegate", str);
        return (OWe) n1n.A01;
    }

    public void A01() {
        AbstractC53434NkN abstractC53434NkN;
        InterfaceC57911PmH nx2;
        AbstractC55106ObM A01;
        if (this instanceof N1N) {
            N1N n1n = (N1N) this;
            if (2 - n1n.A00 == 0) {
                OWe A00 = A00(n1n, AbstractC195978lm.A02, "MediaStreamStateListener:onConnect");
                A00.A0B.A03();
                AbstractC55106ObM A012 = A00.A01();
                if (A012 != null && (A01 = A00.A01()) != null) {
                    C0UO c0uo = A012.A04;
                    A01.A0F(((C9BE) c0uo.getValue()).A03, ((C9BE) c0uo.getValue()).A01, ((C9BE) c0uo.getValue()).A06, ((C9BE) c0uo.getValue()).A07, true);
                }
                AbstractC55106ObM A013 = A00.A01();
                if (A013 != null && A013.A0I()) {
                    AbstractC55106ObM A014 = A00.A01();
                    if (A014 != null) {
                        A014.A07();
                    }
                    AbstractC55106ObM A015 = A00.A01();
                    if (A015 != null) {
                        A015.A0C(null, null, true, null);
                    }
                    InterfaceC58128Ppr interfaceC58128Ppr = A00.A04;
                    if (interfaceC58128Ppr != null) {
                        interfaceC58128Ppr.DYJ();
                    }
                }
                C23031Ai c23031Ai = A00.A0D;
                InterfaceC16530ry interfaceC16530ry = c23031Ai.A4r;
                C0YR[] c0yrArr = C23031Ai.A8c;
                if (!AbstractC167017dG.A1b(c23031Ai, interfaceC16530ry, c0yrArr, 126)) {
                    InterfaceC57998Pni interfaceC57998Pni = A00.A03;
                    if (interfaceC57998Pni != null) {
                        interfaceC57998Pni.FAU();
                    }
                    AbstractC167007dF.A1L(c23031Ai, interfaceC16530ry, c0yrArr, 126, true);
                }
                C54786OJd c54786OJd = A00.A0A;
                if (c54786OJd != null) {
                    ((OKR) c54786OJd.A06.getValue()).A00();
                }
                ((OKR) A00.A0E.getValue()).A00();
                C54845OMq c54845OMq = A00.A01;
                if (c54845OMq != null) {
                    abstractC53434NkN = c54845OMq.A0B.BsZ();
                } else {
                    abstractC53434NkN = null;
                }
                if (abstractC53434NkN instanceof N16) {
                    nx2 = new NX3(A00);
                } else {
                    nx2 = new NX2(A00);
                }
                A00.A00 = nx2;
            }
        }
    }

    public final void A02() {
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (1 - n1o.A00 == 0) {
                C195988ln c195988ln = AbstractC195978lm.A02;
                N55 n55 = (N55) n1o.A02;
                c195988ln.A01(n55.A0Z, "MediaStreamStateListener:onConnectedToolkit");
                C50936Mf5 c50936Mf5 = (C50936Mf5) n55.A0c.getValue();
                c50936Mf5.A03.Egh(EnumC53156NfB.A02);
                JEZ jez = new JEZ(n55, 23);
                AbstractC53606NnD.A06 = jez;
                String str = AbstractC53606NnD.A02;
                if (str != null) {
                    jez.invoke(str);
                }
                JEZ jez2 = new JEZ(n55, 24);
                AbstractC53606NnD.A08 = jez2;
                String str2 = AbstractC53606NnD.A05;
                if (str2 != null) {
                    jez2.invoke(str2);
                }
                JEZ jez3 = new JEZ(n55, 25);
                AbstractC53606NnD.A07 = jez3;
                String str3 = AbstractC53606NnD.A04;
                if (str3 != null) {
                    jez3.invoke(str3);
                }
                String str4 = n55.A0O;
                if (str4 != null && str4.length() != 0) {
                    InterfaceC09390do interfaceC09390do = n55.A0a;
                    C23031Ai A0l = AbstractC25230BEn.A0l(interfaceC09390do);
                    InterfaceC16530ry interfaceC16530ry = A0l.A8B;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    if (!MSX.A0j(A0l, interfaceC16530ry, c0yrArr, 347).equals(n55.A0O)) {
                        C23031Ai A0l2 = AbstractC25230BEn.A0l(interfaceC09390do);
                        String valueOf = String.valueOf(n55.A0O);
                        C14360o3.A0B(valueOf, 0);
                        AbstractC31171DnF.A1S(A0l2, valueOf, A0l2.A8B, c0yrArr, 347);
                    }
                }
                String str5 = n55.A0P;
                if (str5 != null && str5.length() != 0) {
                    InterfaceC09390do interfaceC09390do2 = n55.A0a;
                    C23031Ai A0l3 = AbstractC25230BEn.A0l(interfaceC09390do2);
                    InterfaceC16530ry interfaceC16530ry2 = A0l3.A8C;
                    C0YR[] c0yrArr2 = C23031Ai.A8c;
                    if (!MSX.A0j(A0l3, interfaceC16530ry2, c0yrArr2, 348).equals(n55.A0P)) {
                        C23031Ai A0l4 = AbstractC25230BEn.A0l(interfaceC09390do2);
                        String valueOf2 = String.valueOf(n55.A0P);
                        C14360o3.A0B(valueOf2, 0);
                        AbstractC31171DnF.A1S(A0l4, valueOf2, A0l4.A8C, c0yrArr2, 348);
                    }
                }
                String str6 = n55.A0Q;
                if (str6 != null && str6.length() != 0) {
                    InterfaceC09390do interfaceC09390do3 = n55.A0a;
                    C23031Ai A0l5 = AbstractC25230BEn.A0l(interfaceC09390do3);
                    InterfaceC16530ry interfaceC16530ry3 = A0l5.A8A;
                    C0YR[] c0yrArr3 = C23031Ai.A8c;
                    if (!MSX.A0j(A0l5, interfaceC16530ry3, c0yrArr3, 349).equals(n55.A0Q)) {
                        C23031Ai A0l6 = AbstractC25230BEn.A0l(interfaceC09390do3);
                        String valueOf3 = String.valueOf(n55.A0Q);
                        C14360o3.A0B(valueOf3, 0);
                        AbstractC31171DnF.A1S(A0l6, valueOf3, A0l6.A8A, c0yrArr3, 349);
                    }
                }
                N55.A00(n55);
                N55.A03(n55, true);
                InterfaceC09390do interfaceC09390do4 = n55.A0b;
                ((OKL) interfaceC09390do4.getValue()).A01(RealtimeConstants.MQTT_CONNECTED, null);
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(((OKL) interfaceC09390do4.getValue()).A00, "smart_glasses_toolkit_connected");
                A0f.AAP("event_type", "impression");
                A0f.AAP("item", "connected_label");
                A0f.Cht();
                n55.A0T = false;
            }
        }
    }

    public final void A03() {
        int intValue;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (1 - n1o.A00 == 0) {
                C195988ln c195988ln = AbstractC195978lm.A02;
                N55 n55 = (N55) n1o.A02;
                String str = n55.A0Z;
                c195988ln.A01(str, "MediaStreamStateListener:onConnectionStarted");
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("MediaStreamStateListener:onConnectionStarted w/ Status: ");
                c195988ln.A01(str, AbstractC166997dE.A0v(n55.A0N, A1C));
                Integer num = n55.A0N;
                if (num == null || ((intValue = num.intValue()) != 5 && intValue != 2)) {
                    ((C50936Mf5) n55.A0c.getValue()).A03.Egh(EnumC53156NfB.A03);
                }
            }
        }
    }

    public void A04() {
        AbstractC55106ObM A00;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            switch (n1o.A00) {
                case 1:
                    C195988ln c195988ln = AbstractC195978lm.A02;
                    N55 n55 = (N55) n1o.A02;
                    String str = n55.A0Z;
                    c195988ln.A01(str, "MediaStreamStateListener:onDisconnected");
                    n55.A0T = false;
                    InterfaceC09390do interfaceC09390do = n55.A0c;
                    ((C50936Mf5) interfaceC09390do.getValue()).A03.Egh(EnumC53156NfB.A05);
                    ((C50936Mf5) interfaceC09390do.getValue()).A04.Egh(null);
                    ((OKL) n55.A0b.getValue()).A01(RealtimeConstants.MQTT_DISCONNECTED, null);
                    C190298bn A01 = C190298bn.A03.A01(AbstractC166987dD.A0r(n55.A0a));
                    if (A01 != null && (A00 = A01.A00()) != null) {
                        A00.A08(new N1R(false));
                    }
                    c195988ln.A01(str, "MediaStreamStateListener:onDisconnected -- attempt delayedErrorToConnect job");
                    n55.A0R = AbstractC25226BEj.A1L(new PZW((Object) n55, AbstractC25230BEn.A0s(n55.A0R), 45, true), AbstractC25229BEm.A0a(n55));
                    return;
                case 2:
                default:
                    return;
                case 3:
                    C56805PIw.A0B(OQX.A00((C52154N6e) n1o.A02), C05F.A0R);
                    return;
            }
        }
        N1N n1n = (N1N) this;
        switch (n1n.A00) {
            case 2:
                C195988ln c195988ln2 = AbstractC195978lm.A02;
                OWe A002 = A00(n1n, c195988ln2, "MediaStreamStateListener:onDisconnect");
                AbstractC55106ObM A012 = A002.A01();
                boolean z = false;
                if (A012 != null && A012.A0I()) {
                    AbstractC55106ObM A013 = A002.A01();
                    if (A013 != null) {
                        A013.A07();
                    }
                    A002.A0B.A04(new N1A("LIVE_STREAM_CONNECT_FAIL"));
                }
                if (OWe.A00(A002)) {
                    c195988ln2.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:startErrorToConnectJob onDisconnected");
                    InterfaceC16660sJ interfaceC16660sJ = A002.A06;
                    if (interfaceC16660sJ != null) {
                        AbstractC25227BEk.A1Q(interfaceC16660sJ, true);
                    }
                }
                C54786OJd c54786OJd = A002.A0A;
                if (c54786OJd != null) {
                    C54845OMq c54845OMq = A002.A01;
                    if (c54845OMq != null) {
                        z = c54845OMq.A0J;
                    }
                    c54786OJd.A00(z);
                    ((OKR) c54786OJd.A06.getValue()).A01();
                }
                ((OKR) A002.A0E.getValue()).A01();
                return;
            case 3:
                ((C54845OMq) n1n.A01).A06("sup:IgLiveCaptureFragment_DISCONNECT_ON_STREAM_ENDED");
                return;
            default:
                return;
        }
    }

    public final void A05() {
        AbstractC55106ObM A00;
        AbstractC55106ObM A002;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            switch (n1o.A00) {
                case 0:
                    C8JI c8ji = (C8JI) n1o.A02;
                    c8ji.A06 = true;
                    C195988ln c195988ln = AbstractC195978lm.A02;
                    c195988ln.A01("sup:SupDelegate", "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Entered");
                    ((C54845OMq) n1o.A01).A06("sup:SupDelegate|SupLiveDelegate_KEY");
                    if (C14360o3.A0K(c8ji.A0A.A08.A00, C208509Kk.A00)) {
                        if (!C18U.A06(C06090Tz.A05, c8ji.A09, 36319750988635807L)) {
                            return;
                        }
                    }
                    String str = AbstractC53606NnD.A02;
                    OV2 ov2 = OV2.A00;
                    Context context = c8ji.A07;
                    String A003 = ov2.A00(context);
                    UserSession userSession = c8ji.A09;
                    C23031Ai A004 = AbstractC23021Ah.A00(userSession);
                    InterfaceC16530ry interfaceC16530ry = A004.A6a;
                    C0YR[] c0yrArr = C23031Ai.A8c;
                    String A0j = MSX.A0j(A004, interfaceC16530ry, c0yrArr, 344);
                    if (A0j == null || A0j.length() == 0) {
                        C23031Ai A005 = AbstractC23021Ah.A00(userSession);
                        AbstractC31171DnF.A1S(A005, C18U.A04(C06090Tz.A05, userSession, 36884195590537782L), A005.A6a, c0yrArr, 344);
                    }
                    C23031Ai A006 = AbstractC23021Ah.A00(userSession);
                    String A0j2 = MSX.A0j(A006, A006.A89, c0yrArr, 345);
                    if (A0j2 == null || A0j2.length() == 0) {
                        C23031Ai A007 = AbstractC23021Ah.A00(userSession);
                        AbstractC31171DnF.A1S(A007, C18U.A04(C06090Tz.A05, userSession, 36884195590603319L), A007.A89, c0yrArr, 345);
                    }
                    C15370ps A1F = AbstractC25225BEi.A1F();
                    C15370ps A1F2 = AbstractC25225BEi.A1F();
                    C23031Ai A008 = AbstractC23021Ah.A00(userSession);
                    if (!AbstractC25225BEi.A1a(A003, AbstractC31171DnF.A0Y(A008, A008.A6a, c0yrArr, 344))) {
                        A003 = null;
                    }
                    A1F.A00 = A003;
                    if (!AbstractC25225BEi.A1a(str, AbstractC31171DnF.A0Y(A008, A008.A89, c0yrArr, 345))) {
                        str = null;
                    }
                    A1F2.A00 = str;
                    Object obj = A1F.A00;
                    if (obj != null || str != null) {
                        String str2 = (String) obj;
                        C25621Ms A0c = AbstractC167017dG.A0c(userSession);
                        A0c.A0B("metaverse_bridges/set_versions_for_sn_and_mwa/");
                        if (str2 != null) {
                            A0c.A9s("meta_wearables_app_version", str2);
                        }
                        if (str != null) {
                            A0c.A9s("supernova_firmware_version", str);
                        }
                        C1ON A0U = MSZ.A0U(A0c);
                        A0U.A00 = new NAD(11, A1F2, A1F, userSession);
                        C1GJ.A06(A0U, 7978703, 3, false, false);
                    }
                    C23031Ai A009 = AbstractC23021Ah.A00(userSession);
                    String A04 = AbstractC12880la.A04(context);
                    C14360o3.A0B(A04, 0);
                    AbstractC31171DnF.A1S(A009, A04, A009.A5u, c0yrArr, 346);
                    AbstractC55106ObM A0010 = C8JI.A00(c8ji);
                    if (A0010 == null) {
                        return;
                    }
                    c195988ln.A01("sup:SupDelegate", "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Setting glasses icon as available");
                    A0010.A05();
                    AbstractC55106ObM.A01(A0010, 28, true, !AbstractC23021Ah.A00(userSession).A1z(), false, false, false);
                    c8ji.A0B.A0z.A00().A08.add(new C208259Jk(A0010, 4));
                    if (A0010.A0K() || A0010.A0I() || !C8JI.A05(c8ji)) {
                        return;
                    }
                    c195988ln.A01("sup:SupDelegate", "sup:SupDelegate|SupLiveDelegate_KEY callback onDiscovered -- Calling connectToDevice");
                    C55054Oa5.A00(false);
                    AbstractC55106ObM A0011 = C8JI.A00(c8ji);
                    if (A0011 == null) {
                        return;
                    }
                    A0011.A0E(true);
                    return;
                case 1:
                    C195988ln c195988ln2 = AbstractC195978lm.A02;
                    N55 n55 = (N55) n1o.A02;
                    String str3 = n55.A0Z;
                    c195988ln2.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Entered");
                    AbstractC55106ObM A0012 = C190298bn.A03.A00(n55.requireContext(), AbstractC166987dD.A0r(n55.A0a)).A00();
                    c195988ln2.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Setting Glasses as Available");
                    if (!A0012.A0G()) {
                        c195988ln2.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Showing Dialog");
                        C11T.A02(new PRY(n55, A0012));
                    }
                    A0012.A05();
                    if (A0012.A0K() || A0012.A0I()) {
                        return;
                    }
                    if (A0012.A0G()) {
                        n55.A0T = true;
                        c195988ln2.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Calling connectToDevice");
                        n55.A0R = AbstractC25226BEj.A1L(new PZW((Object) n55, AbstractC25230BEn.A0s(n55.A0R), 45, false), AbstractC25229BEm.A0a(n55));
                        return;
                    }
                    c195988ln2.A01(str3, "sup:SupGlassesToolkit_KEY callback onDiscovered -- Permissions not allowed");
                    AbstractC23641Du.A05(AbstractC25231BEo.A0e(C12L.A00), new PYs(n55, null, 22), AbstractC25229BEm.A0a(n55));
                    return;
                case 2:
                    ((C54845OMq) n1o.A01).A06("sup:SupDelegate|SupLiveDelegate_KEY");
                    OL4 ol4 = (OL4) n1o.A02;
                    C190308bo c190308bo = C190298bn.A03;
                    UserSession userSession2 = ol4.A06;
                    C190298bn A01 = c190308bo.A01(userSession2);
                    if (A01 != null && (A002 = A01.A00()) != null && !A002.A0L()) {
                        return;
                    }
                    C190298bn A012 = c190308bo.A01(userSession2);
                    if (A012 != null && (A00 = A012.A00()) != null) {
                        A00.A05();
                    }
                    ol4.A00(true);
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if (r0.A0I() != true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.N1N
            if (r0 == 0) goto L4e
            r1 = r9
            X.N1N r1 = (X.N1N) r1
            int r0 = r1.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L4e
            X.8ln r6 = X.AbstractC195978lm.A02
            java.lang.String r5 = "sup:MediaStreamControllerDelegate"
            java.lang.String r0 = "MediaStreamStateListener:onInitial"
            X.OWe r4 = A00(r1, r6, r0)
            X.ObM r0 = r4.A01()
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L26
            boolean r0 = r0.A0I()
            r1 = 1
            if (r0 == r3) goto L27
        L26:
            r1 = 0
        L27:
            java.lang.String r2 = "MediaStreamStateListener:startErrorToConnectJob onInitial"
            java.lang.String r7 = "LIVE_STREAM_CONNECT_FAIL"
            X.ObM r0 = r4.A01()
            if (r1 == 0) goto L4f
            if (r0 == 0) goto L36
            r0.A07()
        L36:
            X.Ocj r1 = r4.A0B
            X.N1A r0 = new X.N1A
            r0.<init>(r7)
            r1.A04(r0)
            r6.A01(r5, r2)
            X.0sJ r1 = r4.A06
            if (r1 == 0) goto L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
        L4b:
            r1.invoke(r0)
        L4e:
            return
        L4f:
            if (r0 == 0) goto L4e
            X.0UO r0 = r0.A03
            java.lang.Object r1 = r0.getValue()
            X.Nnk r1 = (X.AbstractC53639Nnk) r1
            if (r1 == 0) goto L4e
            boolean r0 = r1 instanceof X.N1P
            if (r0 == 0) goto L4e
            X.N1P r1 = (X.N1P) r1
            X.MtL r0 = r1.A00
            java.lang.Object r0 = r0.A01
            X.O6x r0 = (X.AbstractC54520O6x) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 == r0) goto L4e
            X.Ocj r1 = r4.A0B
            X.N1A r0 = new X.N1A
            r0.<init>(r7)
            r1.A04(r0)
            boolean r0 = X.OWe.A00(r4)
            if (r0 == 0) goto L4e
            r6.A01(r5, r2)
            X.0sJ r1 = r4.A06
            if (r1 == 0) goto L4e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54847OMw.A06():void");
    }

    public void A07() {
        C54845OMq c54845OMq;
        AbstractC52072N1x abstractC52072N1x;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (3 - n1o.A00 == 0) {
                C174757qB.A05(EnumC222819sM.A04, (C174757qB) n1o.A01);
                C56805PIw.A0B(OQX.A00((C52154N6e) n1o.A02), C05F.A0Q);
                return;
            }
            return;
        }
        N1N n1n = (N1N) this;
        switch (n1n.A00) {
            case 0:
                C54845OMq.A00((C54845OMq) n1n.A01);
                return;
            case 1:
                AbstractC195978lm.A02.A01(C1813982r.A0Z, "MediaStreamStateListener:onStreamStarted");
                C55872OrM c55872OrM = (C55872OrM) n1n.A01;
                C1813982r c1813982r = c55872OrM.A01;
                C174757qB c174757qB = c1813982r.A02;
                if (c174757qB == null) {
                    return;
                }
                C196518mh A01 = C174757qB.A01(c174757qB);
                if (A01 instanceof C212319b0) {
                    C176017sK c176017sK = ((C212319b0) A01).A00;
                    if (c176017sK == null) {
                        C14360o3.A0F("supernovaBasicRecordingComponent");
                        throw C00O.createAndThrow();
                    }
                    C23416AZp c23416AZp = c176017sK.A00;
                    if (c23416AZp != null && (c54845OMq = c55872OrM.A00) != null) {
                        c54845OMq.A0D = c23416AZp;
                        c54845OMq.A0C = c23416AZp;
                        c54845OMq.A0B.EPz(new C55791Oq0(c54845OMq, c23416AZp));
                    }
                }
                if (c1813982r.A0M.A08.A00 == C208509Kk.A00) {
                    c55872OrM.A00.A0B.ETo(true);
                }
                C174757qB.A05(EnumC222819sM.A04, c174757qB);
                return;
            case 2:
                OWe A00 = A00(n1n, AbstractC195978lm.A02, "MediaStreamStateListener:onStreamStarted");
                AbstractC55106ObM A012 = A00.A01();
                if (A012 != null) {
                    A012.A0C(null, null, AbstractC166997dE.A0a(), null);
                }
                InterfaceC16820sZ interfaceC16820sZ = A00.A05;
                if (interfaceC16820sZ != null) {
                    interfaceC16820sZ.invoke();
                }
                C55141Ocj c55141Ocj = A00.A0B;
                AbstractC54520O6x abstractC54520O6x = (AbstractC54520O6x) c55141Ocj.A03.invoke();
                if (abstractC54520O6x != null && (abstractC54520O6x instanceof AbstractC52072N1x) && (abstractC52072N1x = c55141Ocj.A00) != null) {
                    C55141Ocj.A01(c55141Ocj, abstractC52072N1x, abstractC54520O6x);
                }
                InterfaceC58128Ppr interfaceC58128Ppr = A00.A04;
                if (interfaceC58128Ppr == null) {
                    return;
                }
                interfaceC58128Ppr.DJa();
                return;
            case 3:
            default:
                return;
            case 4:
                C53021Nct c53021Nct = (C53021Nct) n1n.A01;
                PYu.A01(c53021Nct, c53021Nct.A0h, 14);
                return;
        }
    }

    public void A08() {
        if (this instanceof N1N) {
            N1N n1n = (N1N) this;
            switch (n1n.A00) {
                case 0:
                    C54845OMq.A00((C54845OMq) n1n.A01);
                    return;
                case 1:
                case 2:
                case 3:
                default:
                    return;
                case 4:
                    C53021Nct c53021Nct = (C53021Nct) n1n.A01;
                    PYu.A01(c53021Nct, c53021Nct.A0h, 15);
                    return;
            }
        }
    }

    public final void A09(int i) {
        AbstractC55106ObM A01;
        C50936Mf5 c50936Mf5;
        EnumC53156NfB enumC53156NfB;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (1 - n1o.A00 == 0) {
                C195988ln c195988ln = AbstractC195978lm.A02;
                N55 n55 = (N55) n1o.A02;
                String str = n55.A0Z;
                c195988ln.A01(str, AnonymousClass001.A0O("MediaStreamStateListener:onHardwareStatusEvent ", i));
                if (i != 2 && i != 3 && i != 4 && i != 5) {
                    return;
                }
                c195988ln.A01(str, AnonymousClass001.A0O("MediaStreamStateListener:onHardwareStatusEvent UPDATE TO ", i));
                n55.A0N = Integer.valueOf(i);
                if (i != 2) {
                    if (i != 4) {
                        return;
                    }
                    c195988ln.A01(str, "MediaStreamStateListener:onHardwareStatusEvent UI UPDATE CHANGE");
                    c50936Mf5 = (C50936Mf5) n55.A0c.getValue();
                    enumC53156NfB = EnumC53156NfB.A03;
                } else {
                    c195988ln.A01(str, "MediaStreamStateListener:onHardwareStatusEvent Disconnected from App");
                    c50936Mf5 = (C50936Mf5) n55.A0c.getValue();
                    enumC53156NfB = EnumC53156NfB.A04;
                }
                c50936Mf5.A03.Egh(enumC53156NfB);
                return;
            }
            return;
        }
        if (!(this instanceof N1N)) {
            return;
        }
        N1N n1n = (N1N) this;
        if (2 - n1n.A00 != 0) {
            return;
        }
        if (i != 18) {
            if (i != 19 || (A01 = A00(n1n, AbstractC195978lm.A02, "onHardwareStatusEvent DEVICE_IS_READY").A01()) == null) {
                return;
            }
            AbstractC55106ObM.A01(A01, 15, false, false, false, false, true);
            return;
        }
        AbstractC55106ObM A012 = A00(n1n, AbstractC195978lm.A02, "onHardwareStatusEvent NO_DEVICE_READY").A01();
        if (A012 != null) {
            AbstractC55106ObM.A01(A012, 15, false, false, false, false, false);
        }
    }

    public final void A0A(int i) {
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (1 - n1o.A00 == 0) {
                C195988ln c195988ln = AbstractC195978lm.A02;
                N55 n55 = (N55) n1o.A02;
                c195988ln.A01(n55.A0Z, AnonymousClass001.A0O("MediaStreamStateListener:onToolkitHealthEvent received update ", i));
                InterfaceC09390do interfaceC09390do = n55.A0c;
                C50936Mf5 c50936Mf5 = (C50936Mf5) interfaceC09390do.getValue();
                c50936Mf5.A03.Egh(EnumC53156NfB.A02);
                C50936Mf5 c50936Mf52 = (C50936Mf5) interfaceC09390do.getValue();
                c50936Mf52.A04.Egh(AbstractC31171DnF.A0V(i));
            }
        }
    }

    public final void A0B(AbstractC53624NnV abstractC53624NnV) {
        AbstractC55106ObM A01;
        AbstractC55106ObM A012;
        AbstractC55106ObM A00;
        if (this instanceof N1O) {
            N1O n1o = (N1O) this;
            if (1 - n1o.A00 == 0) {
                C195988ln c195988ln = AbstractC195978lm.A02;
                N55 n55 = (N55) n1o.A02;
                c195988ln.A01(n55.A0Z, "MediaStreamStateListener:onError");
                InterfaceC09390do interfaceC09390do = n55.A0c;
                ((C50936Mf5) interfaceC09390do.getValue()).A03.Egh(EnumC53156NfB.A05);
                ((C50936Mf5) interfaceC09390do.getValue()).A04.Egh(null);
                C190298bn A013 = C190298bn.A03.A01(AbstractC166987dD.A0r(n55.A0a));
                if (A013 != null && (A00 = A013.A00()) != null) {
                    A00.A08(new N1R(false));
                }
                ((OKL) n55.A0b.getValue()).A01(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE, abstractC53624NnV.A00());
                return;
            }
            return;
        }
        if (!(this instanceof N1N)) {
            return;
        }
        N1N n1n = (N1N) this;
        switch (n1n.A00) {
            case 2:
                C195988ln c195988ln2 = AbstractC195978lm.A02;
                OWe A002 = A00(n1n, c195988ln2, "MediaStreamStateListener:onError");
                AbstractC55106ObM A014 = A002.A01();
                if (A014 != null && A014.A0I() && (A012 = A002.A01()) != null) {
                    A012.A07();
                }
                A002.A0B.A04(abstractC53624NnV);
                if (C14360o3.A0K(abstractC53624NnV.A00(), "STREAM_STOPPED_REASON_TAMPER_DETECTED") && (A01 = A002.A01()) != null && !A01.A0J()) {
                    InterfaceC16620sF interfaceC16620sF = A002.A07;
                    if (interfaceC16620sF == null) {
                        return;
                    }
                    interfaceC16620sF.invoke(true, C52059N1k.A00);
                    return;
                }
                if (!OWe.A00(A002)) {
                    return;
                }
                c195988ln2.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:startErrorToConnectJob onError");
                InterfaceC16660sJ interfaceC16660sJ = A002.A06;
                if (interfaceC16660sJ == null) {
                    return;
                }
                interfaceC16660sJ.invoke(true);
                return;
            case 3:
            default:
                return;
            case 4:
                C53021Nct c53021Nct = (C53021Nct) n1n.A01;
                PYu.A01(c53021Nct, c53021Nct.A0h, 13);
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A0C(X.AbstractC53435NkO r8) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC54847OMw.A0C(X.NkO):void");
    }

    public final void A0D(boolean z) {
        if (this instanceof N1N) {
            N1N n1n = (N1N) this;
            if (2 - n1n.A00 == 0) {
                OWe A00 = A00(n1n, AbstractC195978lm.A02, AnonymousClass001.A1D("MediaStreamStateListener:onStreamingProtocolChanged, isOnWifi: ", z));
                AbstractC55106ObM A01 = A00.A01();
                if (A01 != null) {
                    A01.A0C(AbstractC166997dE.A0b(), null, null, Boolean.valueOf(z));
                }
                InterfaceC57998Pni interfaceC57998Pni = A00.A03;
                if (interfaceC57998Pni != null) {
                    interfaceC57998Pni.FAU();
                }
            }
        }
    }
}
