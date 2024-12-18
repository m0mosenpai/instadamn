package com.facebook.payments.dcp.xapp.controller;

import X.AbstractC001800i;
import X.AbstractC06930Yk;
import X.AbstractC06950Ym;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23641Du;
import X.AbstractC25225BEi;
import X.AbstractC25230BEn;
import X.AbstractC31174DnI;
import X.AbstractC31176DnK;
import X.AbstractC43591JPw;
import X.AbstractC43594JPz;
import X.AbstractC50522MSa;
import X.AbstractC53427NkG;
import X.AbstractC58318PtA;
import X.AbstractC61290Rl1;
import X.AbstractC61609RqY;
import X.AbstractC61811Ru5;
import X.AbstractC62787SRg;
import X.AbstractC63051SbX;
import X.C06090Tz;
import X.C0K8;
import X.C14360o3;
import X.C16930sl;
import X.C18U;
import X.C195928le;
import X.C19L;
import X.C1E2;
import X.C26076Bg5;
import X.C2JM;
import X.C2JO;
import X.C32933EeE;
import X.C45126Jxv;
import X.C51740MtP;
import X.C54755OHk;
import X.C54756OHl;
import X.C57172PZq;
import X.C57238PbM;
import X.C58510Pwe;
import X.C58894QHe;
import X.C62451SCe;
import X.C62755SPm;
import X.C62949SYr;
import X.C63005SaT;
import X.C63222SfT;
import X.C63701SsF;
import X.C63703SsH;
import X.C63704SsJ;
import X.C63709SsO;
import X.C64006Sxd;
import X.C64102SzJ;
import X.C64103SzK;
import X.C64104SzL;
import X.C64105SzM;
import X.C64109SzQ;
import X.C64110SzR;
import X.C89563yw;
import X.C907442n;
import X.EnumC61182Rgi;
import X.EnumC61185Rgl;
import X.EnumC61207Rh7;
import X.InterfaceC19610xo;
import X.InterfaceC23621Ds;
import X.InterfaceC65317Tht;
import X.InterfaceC65345TiS;
import X.InterfaceC65346TiT;
import X.InterfaceC65347TiU;
import X.InterfaceC65490TlB;
import X.InterfaceC65597Tng;
import X.InterfaceC65615To6;
import X.MIL;
import X.MSV;
import X.MSW;
import X.MUD;
import X.OHA;
import X.QIo;
import X.QIy;
import X.R24;
import X.R25;
import X.R26;
import X.R27;
import X.RO3;
import X.RhW;
import X.SAP;
import X.SCO;
import X.SHC;
import X.SHQ;
import X.SLD;
import X.SMO;
import X.SYG;
import android.app.Activity;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.facebook.endtoend.EndToEnd;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class InAppPurchaseControllerCoro implements InterfaceC65317Tht {
    public QIo A00;
    public InterfaceC65490TlB A01;
    public SCO A02;
    public WeakReference A03;
    public List A04;
    public Map A05;
    public final C63222SfT A06;
    public final C54755OHk A07;
    public final C54756OHl A08;
    public final AbstractC61290Rl1 A09;
    public final AbstractC53427NkG A0A;
    public final C63005SaT A0B;
    public final OHA A0C;
    public final C62949SYr A0D;
    public final C19L A0E;

    public /* synthetic */ InAppPurchaseControllerCoro(C63222SfT c63222SfT, C54755OHk c54755OHk, C54756OHl c54756OHl, AbstractC61290Rl1 abstractC61290Rl1, AbstractC53427NkG abstractC53427NkG, OHA oha, C62949SYr c62949SYr, C19L c19l) {
        C14360o3.A0B(c62949SYr, 4);
        this.A06 = c63222SfT;
        this.A0C = oha;
        this.A0D = c62949SYr;
        this.A08 = c54756OHl;
        this.A07 = c54755OHk;
        this.A09 = abstractC61290Rl1;
        this.A0A = abstractC53427NkG;
        this.A05 = AbstractC06930Yk.A0E();
        this.A0B = new C63005SaT(c63222SfT, abstractC61290Rl1, oha);
        this.A0E = c19l;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.SMO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.SMO, java.lang.Object] */
    public static SMO A00(Purchase purchase, Number number) {
        String A02 = purchase.A02();
        C14360o3.A07(A02);
        int intValue = number.intValue();
        ?? obj = new Object();
        obj.A00 = 0;
        obj.A01 = 0;
        obj.A02 = A02;
        obj.A00 = intValue;
        SHC A00 = obj.A00();
        ?? obj2 = new Object();
        obj2.A00 = 0;
        obj2.A01 = 0;
        obj2.A02 = A00.A02;
        obj2.A00 = A00.A00;
        obj2.A01 = A00.A01;
        obj2.A03 = A00.A03;
        return obj2;
    }

    public static final List A03(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            if (((Purchase) obj).A02.optInt("purchaseState", 1) != 4) {
                A12.add(obj);
            }
        }
        return A12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        if (r14.isEmpty() != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r14.isEmpty() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.SKA] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, X.SKA] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.0sl] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.InterfaceC65345TiS r12, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r13, java.util.List r14, java.util.List r15, java.util.List r16) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0B(X.TiS, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.util.List, java.util.List, java.util.List):void");
    }

    public final void A0G(Activity activity, QIo qIo, InterfaceC65490TlB interfaceC65490TlB, SCO sco) {
        AbstractC167017dG.A1N(activity, qIo);
        this.A03 = AbstractC25225BEi.A16(activity);
        this.A00 = qIo;
        this.A01 = interfaceC65490TlB;
        this.A02 = sco;
        C63222SfT c63222SfT = this.A06;
        String str = qIo.A03;
        String A00 = this.A0B.A00();
        String str2 = qIo.A07;
        Map map = qIo.A09;
        if (map == null) {
            map = AbstractC06930Yk.A0E();
        }
        AbstractC167007dF.A1K(str, A00);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AbstractC58318PtA.A1M(RhW.A0U, str, linkedHashMap);
        AbstractC58318PtA.A1M(RhW.A0n, A00, linkedHashMap);
        if (str2 != null) {
            AbstractC58318PtA.A1M(RhW.A0k, str2, linkedHashMap);
        }
        linkedHashMap.put(RhW.A0c.A00, String.valueOf(false));
        this.A05 = linkedHashMap;
        c63222SfT.A00.Ci3(linkedHashMap, null, "client_execute_dcpiap_init");
        boolean A002 = AbstractC61811Ru5.A00(qIo.A03);
        Map map2 = this.A05;
        if (A002) {
            A0L(qIo, map2);
        } else {
            AbstractC23641Du.A05(new InAppPurchaseControllerCoro$createQuoteAndPayment$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this, interfaceC65490TlB), new C57172PZq(this, qIo, map2, (InterfaceC23621Ds) null, 43), this.A0E);
        }
    }

    public final void A0H(Context context, C51740MtP c51740MtP, InterfaceC65346TiT interfaceC65346TiT) {
        InterfaceC65597Tng c64103SzK;
        C63005SaT c63005SaT = this.A0B;
        C57238PbM c57238PbM = new C57238PbM(this, 31);
        C57238PbM c57238PbM2 = new C57238PbM(this, 32);
        c63005SaT.A00 = context;
        c63005SaT.A03 = interfaceC65346TiT;
        AbstractC61290Rl1 abstractC61290Rl1 = c63005SaT.A06;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        A1I.put(RhW.A0b, String.valueOf(false));
        A1I.put(RhW.A0Z, String.valueOf(true));
        if (c63005SaT.A02()) {
            if (!C14360o3.A0K(c63005SaT.A01, c51740MtP)) {
                c57238PbM2.invoke();
                c63005SaT.A05.A08(c51740MtP.A00, A1I);
                c63005SaT.A01 = c51740MtP;
            }
            c63005SaT.A01(null, EnumC61185Rgl.A0L, null);
            return;
        }
        C63222SfT c63222SfT = c63005SaT.A05;
        c63222SfT.A08(c51740MtP.A00, A1I);
        c63005SaT.A01 = c51740MtP;
        UserSession userSession = ((R24) abstractC61290Rl1).A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 36322057385945065L)) {
            LinkedHashMap A1I2 = AbstractC166987dD.A1I();
            AbstractC63051SbX.A02("DCP not enabled for the user country", A1I2);
            c63005SaT.A01(null, EnumC61185Rgl.A09, A1I2);
            return;
        }
        if (C18U.A06(c06090Tz, userSession, 36322057386141676L)) {
            c64103SzK = new C64104SzL(context, C63005SaT.A08, this, c63222SfT);
        } else {
            c64103SzK = new C64103SzK(context, C63005SaT.A08, this, c63222SfT, abstractC61290Rl1);
        }
        c63005SaT.A02 = c64103SzK;
        if (EndToEnd.isRunningEndToEndTest()) {
            c63005SaT.A04 = true;
            interfaceC65346TiT.Dl7(EnumC61185Rgl.A0L);
        } else {
            InterfaceC65597Tng interfaceC65597Tng = c63005SaT.A02;
            if (interfaceC65597Tng == null) {
                return;
            }
            interfaceC65597Tng.EnA(new C63703SsH(1, c57238PbM, c63005SaT), false);
        }
    }

    public final void A0J(SLD sld, List list, List list2, Map map) {
        LinkedHashMap linkedHashMap;
        Map map2;
        C45126Jxv c45126Jxv;
        if (list.isEmpty()) {
            this.A06.A06(EnumC61185Rgl.A07, null, null);
            return;
        }
        C63005SaT c63005SaT = this.A0B;
        if (!c63005SaT.A02()) {
            if (sld != null) {
                A0E(sld.A00, EnumC61185Rgl.A06);
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.A06.A06(EnumC61185Rgl.A04, ((Purchase) it.next()).A01(), null);
            }
            return;
        }
        if (list2 != null) {
            linkedHashMap = AbstractC25225BEi.A18(AbstractC50522MSa.A09(list2));
            for (Object obj : list2) {
                linkedHashMap.put(((C45126Jxv) obj).A03, obj);
            }
        } else {
            linkedHashMap = null;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Purchase purchase = (Purchase) it2.next();
            if (map != null) {
                map2 = (Map) map.get(purchase.A02());
            } else {
                map2 = null;
            }
            C63222SfT c63222SfT = this.A06;
            String A01 = purchase.A01();
            Map map3 = map2;
            if (map2 == null) {
                map3 = AbstractC06930Yk.A0E();
            }
            LinkedHashMap A03 = AbstractC06930Yk.A03(map3);
            if (A01 != null) {
                AbstractC58318PtA.A1M(RhW.A0V, A01, A03);
            }
            c63222SfT.A00.Ci3(A03, null, "client_create_dcp_external_confirm_init");
            if (linkedHashMap != null && (c45126Jxv = (C45126Jxv) linkedHashMap.get(purchase.A01())) != null) {
                MIL mil = new MIL(3, sld, this, map2, purchase, c45126Jxv);
                if (AbstractC31174DnI.A1a(EnumC61207Rh7.AUTO_RENEW_SUBSCRIPTION, c45126Jxv.A02)) {
                    if (!purchase.A02.optBoolean(MSV.A00(896), true)) {
                        InterfaceC65597Tng interfaceC65597Tng = c63005SaT.A02;
                        if (interfaceC65597Tng != null) {
                            String A02 = purchase.A02();
                            C14360o3.A07(A02);
                            interfaceC65597Tng.A7G(new C63701SsF(mil), A02, false);
                        }
                    } else {
                        c63222SfT.A06(EnumC61185Rgl.A07, purchase.A01(), map2);
                        if (sld != null) {
                            sld.A00(c45126Jxv);
                        }
                    }
                } else {
                    InterfaceC65597Tng interfaceC65597Tng2 = c63005SaT.A02;
                    if (interfaceC65597Tng2 != null) {
                        String A022 = purchase.A02();
                        C14360o3.A07(A022);
                        interfaceC65597Tng2.AJc(new C63704SsJ(mil), A022, false);
                    }
                }
            } else {
                c63222SfT.A03(null, null, purchase.A01(), map2);
                if (sld != null) {
                    A0E(sld.A00, EnumC61185Rgl.A06);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r14.isEmpty() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r15.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dc, code lost:
    
        if (r15.size() != r6.size()) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r6 = X.AbstractC06930Yk.A04(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d2, code lost:
    
        if (r15 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b2  */
    @kotlin.Deprecated(message = "Use queryDcpProductDetailsAsync instead. querySkuDetailsAsync is deprecated by Google since PBL v5.0. We now use queryDcpProductDetailsAsync to query product details from Google. We will remove this method in H2 2024.")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.InterfaceC65347TiU r13, java.util.List r14, java.util.List r15) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0K(X.TiU, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013a, code lost:
    
        if (r14.length() != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (com.facebook.endtoend.EndToEnd.isRunningEndToEndTest() != false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, X.SD8] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, X.SKA] */
    /* JADX WARN: Type inference failed for: r9v2, types: [X.0ps, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0L(X.QIo r22, java.util.Map r23) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0L(X.QIo, java.util.Map):void");
    }

    public final void A0N(List list) {
        ArrayList A12 = AbstractC166997dE.A12(list, 0);
        for (Object obj : list) {
            if (((Purchase) obj).A01() != null) {
                A12.add(obj);
            }
        }
        C63222SfT c63222SfT = this.A06;
        C63005SaT c63005SaT = this.A0B;
        String A00 = c63005SaT.A00();
        C54756OHl c54756OHl = this.A08;
        LinkedHashMap A02 = c63222SfT.A02(c54756OHl, A00, A12, true);
        Iterator A16 = AbstractC166997dE.A16(A02);
        while (A16.hasNext()) {
            c63222SfT.A00.Ci3((Map) A16.next(), null, "client_verify_dcppayment_init");
        }
        this.A0D.A01(this.A07, c54756OHl, new C64110SzR(this, A12, list, A02), c63005SaT.A00(), ((C64102SzJ) c63222SfT.A00).A00, null, A12);
    }

    public final void A0O(List list, boolean z) {
        String str;
        C63222SfT c63222SfT = this.A06;
        C63005SaT c63005SaT = this.A0B;
        String A00 = c63005SaT.A00();
        C54756OHl c54756OHl = this.A08;
        LinkedHashMap A02 = c63222SfT.A02(c54756OHl, A00, list, false);
        Iterator A16 = AbstractC166997dE.A16(A02);
        while (A16.hasNext()) {
            c63222SfT.A00.Ci3((Map) A16.next(), null, "client_verify_dcppayment_init");
        }
        C62949SYr c62949SYr = this.A0D;
        String A002 = c63005SaT.A00();
        String str2 = ((C64102SzJ) c63222SfT.A00).A00;
        C54755OHk c54755OHk = this.A07;
        QIo qIo = this.A00;
        if (qIo != null) {
            str = qIo.A08;
        } else {
            str = null;
        }
        c62949SYr.A01(c54755OHk, c54756OHl, new C64109SzQ(this, list, A02, z), A002, str2, str, list);
    }

    @Override // X.InterfaceC65317Tht
    public final void DcZ(SYG syg, List list) {
        EnumC61185Rgl enumC61185Rgl;
        C14360o3.A0B(syg, 0);
        C63222SfT c63222SfT = this.A06;
        QIo qIo = this.A00;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Purchase purchase = (Purchase) it.next();
                String A02 = purchase.A02();
                LinkedHashMap A03 = AbstractC06930Yk.A03(c63222SfT.A00.BjC(syg, purchase, false));
                if (qIo != null) {
                    A03.put(RhW.A0m.A00, null);
                }
                A1I.put(A02, A03);
            }
        }
        if (syg.A00 == 0 && list != null && !list.isEmpty()) {
            QIo qIo2 = this.A00;
            if (qIo2 != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Purchase purchase2 = (Purchase) it2.next();
                    Map map = (Map) A1I.get(purchase2.A02());
                    if (purchase2.A02.optInt("purchaseState", 1) != 4) {
                        if (map != null) {
                            c63222SfT.A00.Ci3(map, null, "client_create_dcppayment_success");
                        }
                        SCO sco = this.A02;
                        if (sco != null) {
                            sco.A00.F8s(C32933EeE.A00);
                        }
                    } else {
                        if (map != null) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                            AbstractC63051SbX.A02("Transaction is still pending on google", linkedHashMap);
                            c63222SfT.A00.Ci3(linkedHashMap, null, "client_create_dcppayment_fail");
                        }
                        A0E(this, EnumC61185Rgl.A0H);
                    }
                }
                if (AbstractC61811Ru5.A00(qIo2.A03)) {
                    A0J(null, list, null, null);
                    C62949SYr c62949SYr = this.A0D;
                    String A00 = this.A0B.A00();
                    List A1J = AbstractC166987dD.A1J(qIo2.A03);
                    String str = qIo2.A08;
                    enumC61185Rgl = EnumC61185Rgl.A0K;
                    AbstractC167007dF.A1E(A00, 0, enumC61185Rgl);
                    C62949SYr.A00(c62949SYr, A00).accept(new QIy(enumC61185Rgl, EnumC61182Rgi.A07, A00, str, A1J, (List) null, (List) null));
                } else {
                    ArrayList A1E = AbstractC166987dD.A1E();
                    for (Object obj : list) {
                        if (((Purchase) obj).A02.optInt("purchaseState", 1) != 4) {
                            A1E.add(obj);
                        }
                    }
                    A0O(A1E, false);
                    return;
                }
            } else {
                return;
            }
        } else {
            QIo qIo3 = this.A00;
            int i = syg.A00;
            enumC61185Rgl = EnumC61185Rgl.A0Q;
            if (i != 0) {
                if (i != 1) {
                    if (i != 3) {
                        if (i == 7) {
                            enumC61185Rgl = EnumC61185Rgl.A0I;
                        }
                    } else {
                        enumC61185Rgl = EnumC61185Rgl.A05;
                    }
                } else {
                    enumC61185Rgl = EnumC61185Rgl.A0P;
                }
            } else {
                enumC61185Rgl = EnumC61185Rgl.A0L;
            }
            if (qIo3 != null) {
                C62949SYr c62949SYr2 = this.A0D;
                String A002 = this.A0B.A00();
                List A1J2 = AbstractC166987dD.A1J(qIo3.A03);
                String str2 = qIo3.A08;
                C14360o3.A0B(A002, 0);
                C62949SYr.A00(c62949SYr2, A002).accept(new QIy(enumC61185Rgl, EnumC61182Rgi.A07, A002, str2, A1J2, (List) null, (List) null));
            }
            if (A1I.isEmpty()) {
                LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("extra_error_message", "Received empty list of purchases from Google"));
                if (qIo3 != null) {
                    String str3 = qIo3.A03;
                    String A003 = this.A0B.A00();
                    String str4 = qIo3.A07;
                    Map map2 = qIo3.A09;
                    if (map2 == null) {
                        map2 = AbstractC06930Yk.A0E();
                    }
                    AbstractC167007dF.A1K(str3, A003);
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map2);
                    AbstractC58318PtA.A1M(RhW.A0U, str3, linkedHashMap2);
                    AbstractC58318PtA.A1M(RhW.A0n, A003, linkedHashMap2);
                    if (str4 != null) {
                        AbstractC58318PtA.A1M(RhW.A0k, str4, linkedHashMap2);
                    }
                    linkedHashMap2.put(RhW.A0c.A00, String.valueOf(false));
                    A07.putAll(linkedHashMap2);
                }
                c63222SfT.A04(syg, A07);
            } else {
                Iterator A14 = AbstractC166997dE.A14(A1I);
                while (A14.hasNext()) {
                    c63222SfT.A04(syg, (Map) AbstractC31176DnK.A0j(A14));
                }
            }
        }
        A0E(this, enumC61185Rgl);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e A[LOOP:1: B:28:0x0088->B:30:0x008e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r7, java.lang.String r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 16
            boolean r0 = X.MAO.A02(r9, r3)
            if (r0 == 0) goto Ld1
            r5 = r9
            X.MAO r5 = (X.MAO) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ld1
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A03
            X.1JX r4 = X.C1JX.A02
            int r1 = r5.A00
            r3 = 2
            r6 = 1
            if (r1 == 0) goto L49
            if (r1 == r6) goto L6f
            if (r1 != r3) goto Ld8
            java.lang.Object r6 = r5.A01
            java.util.AbstractCollection r6 = (java.util.AbstractCollection) r6
            X.AbstractC09560e7.A00(r0)
        L2b:
            java.util.Iterator r2 = X.AbstractC25226BEj.A1J(r0)
        L2f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.String r1 = X.AbstractC166987dD.A1B(r2)
            boolean r0 = r6.contains(r1)
            if (r0 != 0) goto L2f
            java.lang.String r0 = "purchase_history."
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r1)
            r6.add(r0)
            goto L2f
        L49:
            X.AbstractC09560e7.A00(r0)
            X.SaT r0 = r7.A0B
            boolean r0 = r0.A02()
            if (r0 != 0) goto L57
            X.0sl r6 = X.C16930sl.A00
        L56:
            return r6
        L57:
            X.SfT r0 = r7.A06
            X.To6 r2 = r0.A00
            java.lang.String r1 = "client_load_iap_store_purchases_init"
            r0 = 0
            r2.Ci3(r0, r0, r1)
            r5.A01 = r7
            r5.A02 = r8
            r5.A00 = r6
            r0 = 0
            java.lang.Object r0 = A02(r7, r8, r5, r0)
            if (r0 != r4) goto L7a
            return r4
        L6f:
            java.lang.Object r8 = r5.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r5.A01
            com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r7 = (com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro) r7
            X.AbstractC09560e7.A00(r0)
        L7a:
            X.0e4 r0 = (X.C09530e4) r0
            java.lang.Object r0 = r0.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AbstractC167017dG.A0q(r0)
            java.util.Iterator r1 = r0.iterator()
        L88:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L9c
            java.lang.Object r0 = r1.next()
            com.android.billingclient.api.Purchase r0 = (com.android.billingclient.api.Purchase) r0
            java.lang.String r0 = X.AbstractC61812Ru6.A00(r0)
            r2.add(r0)
            goto L88
        L9c:
            java.util.ArrayList r6 = X.AbstractC166987dD.A1F(r2)
            X.SaT r1 = r7.A0B
            boolean r0 = r1.A02()
            if (r0 == 0) goto L56
            r5.A01 = r6
            r0 = 0
            r5.A02 = r0
            r5.A00 = r3
            X.Tng r3 = r1.A02
            if (r3 == 0) goto Lce
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = X.C89563yw.A01
            X.1Ds r0 = X.C1E2.A02(r5)
            X.3yw r2 = new X.3yw
            r2.<init>(r0)
            X.SsN r1 = new X.SsN
            r1.<init>(r2)
            r0 = 0
            r3.E7U(r1, r8, r0)
            java.lang.Object r0 = r2.A00()
        Lcb:
            if (r0 != r4) goto L2b
            return r4
        Lce:
            X.0sl r0 = X.C16930sl.A00
            goto Lcb
        Ld1:
            X.MAO r5 = new X.MAO
            r5.<init>(r7, r9, r3)
            goto L16
        Ld8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A01(com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.SYG, java.lang.Object] */
    public static final Object A02(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        InterfaceC65597Tng interfaceC65597Tng = inAppPurchaseControllerCoro.A0B.A02;
        if (interfaceC65597Tng != null) {
            if (str != null) {
                SAP sap = new SAP(str);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C89563yw.A01;
                C89563yw c89563yw = new C89563yw(C1E2.A02(interfaceC23621Ds));
                interfaceC65597Tng.E7V(new C63709SsO(inAppPurchaseControllerCoro, c89563yw), sap, z);
                return c89563yw.A00();
            }
            throw AbstractC166987dD.A12("Product type must be set");
        }
        ?? obj = new Object();
        obj.A00 = 2;
        obj.A01 = "";
        return AbstractC166987dD.A1L(obj, C16930sl.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.SIc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.SMO, java.lang.Object] */
    public static final void A04(Activity activity, Purchase purchase, SkuDetails skuDetails, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, Integer num, String str) {
        String str2;
        SMO smo;
        if (activity != null) {
            String str3 = null;
            String str4 = null;
            ArrayList arrayList = null;
            ?? obj = new Object();
            obj.A00 = 0;
            obj.A01 = 0;
            obj.A04 = true;
            if (purchase != null && num != null) {
                JSONObject jSONObject = purchase.A02;
                str2 = jSONObject.optString("obfuscatedAccountId");
                String optString = jSONObject.optString("obfuscatedProfileId");
                if (str2 == null && optString == null) {
                    str2 = null;
                }
                smo = A00(purchase, num);
            } else {
                str2 = str;
                smo = obj;
            }
            if (str != null) {
                str4 = str;
            }
            if (str2 != null) {
                str3 = str2;
            }
            if (skuDetails != null) {
                arrayList = AbstractC31174DnI.A0z(skuDetails);
            }
            InterfaceC65597Tng interfaceC65597Tng = inAppPurchaseControllerCoro.A0B.A02;
            if (interfaceC65597Tng != 0) {
                boolean z = true;
                if (arrayList != null && !arrayList.isEmpty()) {
                    if (!arrayList.contains(null)) {
                        if (arrayList.size() > 1) {
                            JSONObject jSONObject2 = ((SkuDetails) arrayList.get(0)).A00;
                            String optString2 = jSONObject2.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                            int size = arrayList.size();
                            for (int i = 0; i < size; i++) {
                                SkuDetails skuDetails2 = (SkuDetails) arrayList.get(i);
                                if (!optString2.equals("play_pass_subs") && !skuDetails2.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("play_pass_subs") && !optString2.equals(skuDetails2.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE))) {
                                    throw AbstractC166987dD.A12("SKUs should have the same type.");
                                }
                            }
                            String optString3 = jSONObject2.optString("packageName");
                            int size2 = arrayList.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                SkuDetails skuDetails3 = (SkuDetails) arrayList.get(i2);
                                if (!optString2.equals("play_pass_subs") && !skuDetails3.A00.optString(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE).equals("play_pass_subs") && !optString3.equals(skuDetails3.A00.optString("packageName"))) {
                                    throw AbstractC166987dD.A12("All SKUs must have the same package name.");
                                }
                            }
                        }
                        ?? obj2 = new Object();
                        if (((SkuDetails) arrayList.get(0)).A00.optString("packageName").isEmpty()) {
                            z = false;
                        }
                        obj2.A05 = z;
                        obj2.A02 = str3;
                        obj2.A03 = str4;
                        obj2.A00 = smo.A00();
                        obj2.A04 = AbstractC166987dD.A1F(arrayList);
                        obj2.A01 = RO3.A00();
                        interfaceC65597Tng.Cgj(activity, obj2, new C64105SzM(inAppPurchaseControllerCoro));
                        return;
                    }
                    throw AbstractC166987dD.A12("SKU cannot be null.");
                }
                throw AbstractC166987dD.A12("Details of the products must be provided.");
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.SIc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.SMO, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(android.app.Activity r15, com.android.billingclient.api.Purchase r16, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro r17, X.AbstractC61609RqY r18, java.lang.Integer r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A05(android.app.Activity, com.android.billingclient.api.Purchase, com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro, X.RqY, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(SYG syg, InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2) {
        AbstractC61609RqY r27;
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C62755SPm c62755SPm = (C62755SPm) it.next();
            MUD mud = null;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (C14360o3.A0K(((MUD) next).A01, c62755SPm.A00)) {
                        mud = next;
                        break;
                    }
                }
                mud = mud;
            }
            C14360o3.A0B(c62755SPm, 0);
            if (C14360o3.A0K(c62755SPm.A01, "inapp")) {
                r27 = new R25(c62755SPm, mud);
            } else {
                r27 = new R27(c62755SPm, mud);
            }
            A0i.add(r27);
        }
        Iterator it3 = A0i.iterator();
        while (it3.hasNext()) {
            A0D(inAppPurchaseControllerCoro, (AbstractC61609RqY) it3.next());
        }
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0i, 10)));
        Iterator it4 = A0i.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            A18.put(((AbstractC61609RqY) next2).A02(), next2);
        }
        interfaceC65345TiS.Dgd(syg, null, A18);
        C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            A0i2.add(((C62755SPm) it5.next()).A00);
        }
        c63222SfT.A0A(A0i2, inAppPurchaseControllerCoro.A0B.A00());
    }

    public static final void A08(SYG syg, InterfaceC65347TiU interfaceC65347TiU, List list) {
        LinkedHashMap linkedHashMap;
        if (list != null) {
            linkedHashMap = AbstractC25225BEi.A18(AbstractC50522MSa.A09(list));
            for (Object obj : list) {
                String optString = ((SkuDetails) obj).A00.optString("productId");
                C14360o3.A07(optString);
                linkedHashMap.put(optString, obj);
            }
        } else {
            linkedHashMap = null;
        }
        interfaceC65347TiU.Dge(syg, linkedHashMap);
    }

    public static final void A09(SkuDetails skuDetails, InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        C54756OHl c54756OHl = inAppPurchaseControllerCoro.A08;
        String optString = skuDetails.A00.optString("productId");
        C14360o3.A07(optString);
        c54756OHl.A00.put(optString, new C26076Bg5(c54756OHl.A01.now() + 3600000, skuDetails, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.SYG, java.lang.Object] */
    public static final void A0A(InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list) {
        ?? obj = new Object();
        obj.A00 = 5;
        obj.A01 = "";
        interfaceC65345TiS.Dgd(obj, EnumC61185Rgl.A0B, AbstractC06930Yk.A0E());
        C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0q.add(((MUD) it.next()).A01);
        }
        c63222SfT.A07(inAppPurchaseControllerCoro.A0B.A00(), "Internal billing info fetch failed", A0q);
    }

    public static final void A0C(InAppPurchaseControllerCoro inAppPurchaseControllerCoro) {
        C63005SaT c63005SaT = inAppPurchaseControllerCoro.A0B;
        C51740MtP c51740MtP = c63005SaT.A01;
        if (c51740MtP != null && c51740MtP.A01) {
            c63005SaT.A03 = null;
        }
        inAppPurchaseControllerCoro.A01 = null;
        inAppPurchaseControllerCoro.A02 = null;
        inAppPurchaseControllerCoro.A03 = AbstractC25225BEi.A16(null);
    }

    public static final void A0D(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, AbstractC61609RqY abstractC61609RqY) {
        C54755OHk c54755OHk = inAppPurchaseControllerCoro.A07;
        String A02 = abstractC61609RqY.A02();
        C14360o3.A0B(A02, 1);
        c54755OHk.A00.put(A02, new C26076Bg5(c54755OHk.A01.now() + 3600000, abstractC61609RqY, 1));
    }

    public static final void A0E(InAppPurchaseControllerCoro inAppPurchaseControllerCoro, EnumC61185Rgl enumC61185Rgl) {
        InterfaceC65490TlB interfaceC65490TlB = inAppPurchaseControllerCoro.A01;
        if (interfaceC65490TlB != null) {
            interfaceC65490TlB.DcW(enumC61185Rgl);
        }
        C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
        String obj = enumC61185Rgl.toString();
        Map map = inAppPurchaseControllerCoro.A05;
        C14360o3.A0B(obj, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        AbstractC58318PtA.A1M(RhW.A0s, obj, linkedHashMap);
        c63222SfT.A00.Ci3(linkedHashMap, null, "client_execute_dcpiap_fail");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x008a, code lost:
    
        if (r4 != r7) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0F(X.QIo r17, java.util.Map r18, X.InterfaceC23621Ds r19) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro.A0F(X.QIo, java.util.Map, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.SYG, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.SYG, java.lang.Object] */
    public final void A0I(InterfaceC65345TiS interfaceC65345TiS, String str, List list, List list2) {
        List list3;
        List list4;
        C63222SfT c63222SfT;
        String A00;
        String str2;
        if (list == null) {
            list3 = C16930sl.A00;
        } else {
            list3 = list;
        }
        if (list2 == null) {
            list4 = C16930sl.A00;
        } else {
            list4 = list2;
        }
        ArrayList A0S = AbstractC001800i.A0S(list4, list3);
        C63005SaT c63005SaT = this.A0B;
        if (!c63005SaT.A02()) {
            c63222SfT = this.A06;
            A00 = c63005SaT.A00();
            str2 = "IAP is not enabled";
        } else {
            if (c63005SaT.A04) {
                LinkedHashMap A002 = AbstractC62787SRg.A00(list, list2);
                LinkedHashMap A0y = AbstractC43594JPz.A0y(A002);
                Iterator A14 = AbstractC166997dE.A14(A002);
                while (A14.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A14);
                    Object key = A1K.getKey();
                    SkuDetails skuDetails = (SkuDetails) A1K.getValue();
                    C14360o3.A0B(skuDetails, 0);
                    A0y.put(key, new R26(skuDetails, null));
                }
                ?? obj = new Object();
                obj.A00 = 0;
                obj.A01 = "";
                interfaceC65345TiS.Dgd(obj, null, A0y);
                return;
            }
            c63222SfT = this.A06;
            c63222SfT.A09(A0S, c63005SaT.A00());
            if (A0S.isEmpty()) {
                A00 = c63005SaT.A00();
                str2 = "No skus to query";
            } else {
                C54755OHk c54755OHk = this.A07;
                ArrayList A1E = AbstractC166987dD.A1E();
                Iterator it = A0S.iterator();
                while (it.hasNext()) {
                    String A1B = AbstractC166987dD.A1B(it);
                    AbstractC61609RqY A003 = c54755OHk.A00(A1B);
                    if (A003 != null) {
                        AbstractC166997dE.A1R(A1B, A003, A1E);
                    }
                }
                Map A08 = AbstractC06930Yk.A08(A1E);
                if (A0S.size() != A08.size()) {
                    A08 = AbstractC06930Yk.A0E();
                }
                if (MSW.A1b(A08)) {
                    ?? obj2 = new Object();
                    obj2.A00 = 0;
                    obj2.A01 = "";
                    interfaceC65345TiS.Dgd(obj2, null, A08);
                    A00 = c63005SaT.A00();
                    str2 = "Skus already in cache";
                } else {
                    if (C14360o3.A0K(str, "TIER_ID")) {
                        C62949SYr c62949SYr = this.A0D;
                        SHQ shq = new SHQ(interfaceC65345TiS, this, list, list2);
                        C62451SCe c62451SCe = c62949SYr.A00;
                        C2JM A0b = AbstractC25225BEi.A0b();
                        C2JO c2jo = new C2JO();
                        c2jo.A05("product_ids", A0S);
                        c2jo.A09("GOOGLE", "platform");
                        c2jo.A09(AbstractC43591JPw.A00(104), "product_type");
                        AbstractC58318PtA.A1K(c2jo, A0b);
                        C907442n c907442n = new C907442n(A0b, C58894QHe.class, "IGQueryDCPProduct", false);
                        C195928le.A00(c62451SCe.A00).ATV(new C64006Sxd(shq, 14), new C58510Pwe(shq, 24), c907442n);
                        return;
                    }
                    A0B(interfaceC65345TiS, this, list, list2, null);
                    return;
                }
            }
        }
        c63222SfT.A07(A00, str2, A0S);
    }

    public final void A0M(EnumC61185Rgl enumC61185Rgl, List list, Map map) {
        String str;
        EnumC61185Rgl enumC61185Rgl2;
        C63222SfT c63222SfT = this.A06;
        C0K8.A0C("DCP", AbstractC167017dG.A0n(enumC61185Rgl, "Synchronization complete: ", AbstractC166987dD.A1C()));
        LinkedHashMap A01 = C63222SfT.A01(list);
        InterfaceC65615To6 interfaceC65615To6 = c63222SfT.A00;
        boolean z = enumC61185Rgl.A01;
        if (z) {
            str = "client_create_iap_synchronize_fail";
        } else {
            str = "client_create_iap_synchronize_success";
        }
        interfaceC65615To6.Ci3(map, A01, str);
        OHA oha = this.A0C;
        InterfaceC19610xo ARD = oha.A00().A00.ARD();
        ARD.E77("ig_in_app_purchases_synchronization_required", z);
        ARD.apply();
        InterfaceC19610xo ARD2 = oha.A00().A00.ARD();
        ARD2.E77("ig_in_app_purchases_has_been_initialized", true);
        ARD2.apply();
        C63005SaT c63005SaT = this.A0B;
        C51740MtP c51740MtP = c63005SaT.A01;
        if (c51740MtP != null && c51740MtP.A01) {
            if (z) {
                enumC61185Rgl2 = EnumC61185Rgl.A0M;
            } else {
                enumC61185Rgl2 = EnumC61185Rgl.A0N;
            }
            InterfaceC65346TiT interfaceC65346TiT = c63005SaT.A03;
            if (interfaceC65346TiT != null) {
                interfaceC65346TiT.Dl7(enumC61185Rgl2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A07(SYG syg, InterfaceC65345TiS interfaceC65345TiS, InAppPurchaseControllerCoro inAppPurchaseControllerCoro, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A09((SkuDetails) it.next(), inAppPurchaseControllerCoro);
        }
        ArrayList A0i = AbstractC167007dF.A0i(list);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            SkuDetails skuDetails = (SkuDetails) it2.next();
            MUD mud = null;
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next = it3.next();
                    if (C14360o3.A0K(((MUD) next).A01, skuDetails.A00.optString("productId"))) {
                        mud = next;
                        break;
                    }
                }
                mud = mud;
            }
            C14360o3.A0B(skuDetails, 0);
            A0i.add(new R26(skuDetails, mud));
        }
        Iterator it4 = A0i.iterator();
        while (it4.hasNext()) {
            A0D(inAppPurchaseControllerCoro, (AbstractC61609RqY) it4.next());
        }
        LinkedHashMap A18 = AbstractC25225BEi.A18(AbstractC167017dG.A01(AbstractC06950Ym.A1E(A0i, 10)));
        Iterator it5 = A0i.iterator();
        while (it5.hasNext()) {
            Object next2 = it5.next();
            A18.put(((AbstractC61609RqY) next2).A02(), next2);
        }
        interfaceC65345TiS.Dgd(syg, null, A18);
        C63222SfT c63222SfT = inAppPurchaseControllerCoro.A06;
        ArrayList A0i2 = AbstractC167007dF.A0i(list);
        Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            A0i2.add(((SkuDetails) it6.next()).A00.optString("productId"));
        }
        c63222SfT.A0A(A0i2, inAppPurchaseControllerCoro.A0B.A00());
    }
}
