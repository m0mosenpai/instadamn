package X;

import android.util.SparseArray;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.google.common.collect.ImmutableList;
import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Sdq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63144Sdq {
    public C62731SNv A00;
    public boolean A01;
    public final C58443PvM A02;
    public final Q8J A03 = new Q8J(this);

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, X.SNv] */
    public static void A01(C2GT c2gt, AbstractC63144Sdq abstractC63144Sdq) {
        InterfaceC65512Tlh interfaceC65512Tlh;
        C62643SKa c62643SKa;
        C63019Saj c63019Saj;
        String str;
        C62643SKa c62643SKa2;
        String str2;
        C63406Sjd A03;
        boolean z;
        if (abstractC63144Sdq.A01) {
            Q8J q8j = abstractC63144Sdq.A03;
            InterfaceC65512Tlh interfaceC65512Tlh2 = q8j.A01;
            if (interfaceC65512Tlh2 != null) {
                interfaceC65512Tlh2.AOi(q8j);
            }
            C62731SNv c62731SNv = abstractC63144Sdq.A00;
            if (c62731SNv != null) {
                synchronized (c62731SNv) {
                    z = c62731SNv.A02;
                }
                if (!z) {
                    abstractC63144Sdq.A00.A00();
                }
            }
            if (c2gt == null && q8j.A02() != (A03 = C63406Sjd.A03(null))) {
                q8j.A0B(A03);
            }
            abstractC63144Sdq.A00 = new Object();
            C63406Sjd c63406Sjd = new C63406Sjd(EnumC68120VCd.LOADING, null, null);
            C2GT c2gt2 = q8j.A00;
            if (c2gt2 != null) {
                q8j.A0D(c2gt2);
            }
            q8j.A00 = c2gt;
            if (c2gt != null) {
                q8j.A0E(c2gt, new C63625SqX(17, c63406Sjd, q8j));
            }
            C62731SNv c62731SNv2 = abstractC63144Sdq.A00;
            if (abstractC63144Sdq instanceof RER) {
                RER rer = (RER) abstractC63144Sdq;
                C14360o3.A0B(c62731SNv2, 0);
                C58443PvM c58443PvM = rer.A02;
                C1N8 c1n8 = rer.A00;
                SXG sxg = rer.A03;
                C63174SeZ c63174SeZ = rer.A01;
                C14360o3.A0B(c58443PvM, 0);
                AbstractC167027dH.A13(c1n8, sxg, c63174SeZ);
                interfaceC65512Tlh = new C60619REe(c63174SeZ.A02(new T3U(c1n8, c62731SNv2), new SJ1(sxg.A03, sxg.A04, sxg.A05, sxg.A07, sxg.A06, null, sxg.A08), sxg.A00), c58443PvM, sxg);
            } else if (abstractC63144Sdq instanceof REW) {
                REW rew = (REW) abstractC63144Sdq;
                C62522SEy c62522SEy = rew.A03;
                C63001SaP c63001SaP = rew.A00;
                String str3 = c62522SEy.A00;
                String A0n = AbstractC166997dE.A0n();
                String A01 = C2FP.A0C().A01();
                FBPayIGGraphQLQueryExecutor fBPayIGGraphQLQueryExecutor = ((C58443PvM) c62522SEy.A01.get()).A00.A01;
                AbstractC167007dF.A1F(c63001SaP, 0, fBPayIGGraphQLQueryExecutor);
                boolean A0K = C14360o3.A0K(str3, "0");
                C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, A01, AbstractC63083Sc6.A01(0, 9, 114));
                if (!A0K) {
                    String str4 = c63001SaP.A02;
                    if (str4 == null) {
                        str4 = "FBPAY_HUB";
                    }
                    C0CA.A00(A0T, str4, "payment_type");
                    C0CA.A00(A0T, str3, "actor_id");
                    String str5 = c63001SaP.A00;
                    if (str5 != null && (str2 = c63001SaP.A01) != null) {
                        C2JO c2jo = new C2JO();
                        c2jo.A09(str5, "otc_session_id");
                        c2jo.A09(str2, "otc_type");
                        A0T.A0E(c2jo.A02(), "one_time_checkout_input");
                    }
                    if (A0n != null && A0n.length() != 0) {
                        C0CA.A00(A0T, A0n, "client_mutation_id");
                    }
                    String str6 = c63001SaP.A04;
                    if (str6 != null && str6.length() != 0) {
                        C0CA.A00(A0T, str6, "target_account_id");
                    }
                    String str7 = c63001SaP.A03;
                    if (str7 != null && str7.length() != 0) {
                        C0CA.A00(A0T, str7, "receiver_id");
                    }
                    try {
                        C64049SyL c64049SyL = (C64049SyL) AbstractC58323PtF.A0l(null, SRJ.class, "create");
                        AbstractC31173DnH.A1M(A0T, c64049SyL.A00.A00, "input");
                        c64049SyL.A01 = true;
                        PandoGraphQLRequest build = c64049SyL.build();
                        C14360o3.A07(build);
                        interfaceC65512Tlh = C60622REh.A00(null, fBPayIGGraphQLQueryExecutor, build, T7j.A00);
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                        throw AbstractC58318PtA.A0f(e);
                    }
                } else {
                    String str8 = c63001SaP.A04;
                    if (str8 != null && str8.length() != 0) {
                        C0CA.A00(A0T, str8, "payment_account_id");
                        String str9 = c63001SaP.A02;
                        if (str9 == null) {
                            str9 = "UNKNOWN";
                        }
                        C0CA.A00(A0T, str9, "payment_type");
                    }
                    try {
                        C64048SyK c64048SyK = (C64048SyK) AbstractC58323PtF.A0l(null, SRI.class, "create");
                        AbstractC31173DnH.A1M(A0T, c64048SyK.A00.A00, "data");
                        c64048SyK.A01 = true;
                        PandoGraphQLRequest build2 = c64048SyK.build();
                        C14360o3.A07(build2);
                        interfaceC65512Tlh = C60622REh.A00(null, fBPayIGGraphQLQueryExecutor, build2, T7i.A00);
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                        throw AbstractC58318PtA.A0f(e2);
                    }
                }
            } else if (abstractC63144Sdq instanceof RES) {
                RES res = (RES) abstractC63144Sdq;
                C14360o3.A0B(c62731SNv2, 0);
                C58443PvM c58443PvM2 = res.A02;
                C63581Spo c63581Spo = new C63581Spo(15, res.A04);
                SJB sjb = res.A03;
                C63174SeZ c63174SeZ2 = res.A01;
                C14360o3.A0B(sjb, 2);
                C60620REf c60620REf = new C60620REf(c63174SeZ2.A02(new T3V(c63581Spo, c62731SNv2), new SJ1(null, null, null, null, "TRUST_BINDING", null, sjb.A06), sjb.A01), c58443PvM2, sjb);
                SZ5 sz5 = c60620REf.A00;
                SJB sjb2 = c60620REf.A02;
                sz5.A01(new T3S(c60620REf, 2), sjb2.A04, "CREATE_TRUST_BINDING", sjb2.A07, c60620REf.A01.A00.A03);
                interfaceC65512Tlh = c60620REf;
            } else if (abstractC63144Sdq instanceof REU) {
                interfaceC65512Tlh = (InterfaceC65512Tlh) ((REU) abstractC63144Sdq).A00.apply(c62731SNv2);
            } else if (abstractC63144Sdq instanceof REQ) {
                REQ req = (REQ) abstractC63144Sdq;
                if (req.A00 != 0) {
                    C62566SGr c62566SGr = ((C62962SZf) req.A01).A02;
                    String str10 = req.A03;
                    C14360o3.A0B(str10, 1);
                    C2JM A0b = AbstractC25225BEi.A0b();
                    C2JM A0b2 = AbstractC25225BEi.A0b();
                    C04060Jx c04060Jx = GraphQlCallInput.A02;
                    C0CA A0T2 = AbstractC25227BEk.A0T(c04060Jx, AbstractC166997dE.A0n(), "client_mutation_id");
                    A0T2.A0E(AbstractC25227BEk.A0T(c04060Jx, str10, "sensitive_string_value"), "password");
                    interfaceC65512Tlh = C60622REh.A00(c62731SNv2, c62566SGr.A01, new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T2, A0b, "input"), "IgPaymentsPINDeleteMutation", A0b.getParamsCopy(), A0b2.getParamsCopy(), C59539QhD.class, true, null, 8, "input", "payment_pin_delete", AbstractC166987dD.A1E()), C64280T7o.A00);
                } else {
                    C14360o3.A0B(c62731SNv2, 0);
                    c62643SKa = ((T2N) req.A02).A02;
                    c63019Saj = (C63019Saj) req.A01;
                    str = req.A03;
                    interfaceC65512Tlh = c62643SKa.A00(c62731SNv2, AbstractC62185S1g.A00(str), c63019Saj);
                }
            } else if (abstractC63144Sdq instanceof REP) {
                REP rep = (REP) abstractC63144Sdq;
                int i = rep.A00;
                C14360o3.A0B(c62731SNv2, 0);
                Object obj = rep.A02;
                if (i != 0) {
                    c62643SKa2 = ((T2M) obj).A01;
                } else {
                    c62643SKa2 = ((T2O) obj).A01;
                }
                interfaceC65512Tlh = c62643SKa2.A00(c62731SNv2, AbstractC62185S1g.A00("PERSISTENT_UP_TO_DATE"), (C63019Saj) rep.A01);
            } else if (abstractC63144Sdq instanceof REV) {
                REV rev = (REV) abstractC63144Sdq;
                if (rev.A00 != 0) {
                    interfaceC65512Tlh = (InterfaceC65512Tlh) ((C1N8) rev.A01).apply(c62731SNv2);
                } else {
                    C14360o3.A0B(c62731SNv2, 0);
                    c62643SKa = ((C62712SNb) rev.A02).A01;
                    c63019Saj = (C63019Saj) rev.A01;
                    str = "PERSISTENT_UP_TO_5_MINS";
                    interfaceC65512Tlh = c62643SKa.A00(c62731SNv2, AbstractC62185S1g.A00(str), c63019Saj);
                }
            } else if (abstractC63144Sdq instanceof REN) {
                REN ren = (REN) abstractC63144Sdq;
                SCT sct = ren.A00;
                ArrayList A1F = AbstractC166987dD.A1F(C63346Si2.A03(ren.A01).values());
                InterfaceC40711ue interfaceC40711ue = ((C58443PvM) sct.A00.get()).A00.A00;
                C14360o3.A0B(interfaceC40711ue, 2);
                try {
                    C64028Sy0 c64028Sy0 = (C64028Sy0) AbstractC50523MSb.A0R("create", SR7.class);
                    ImmutableList.Builder builder = new ImmutableList.Builder();
                    Iterator it = A1F.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        if (next != null) {
                            builder.add(next);
                        }
                    }
                    ImmutableList build3 = builder.build();
                    C14360o3.A07(build3);
                    c64028Sy0.A00.A05("fbids", build3);
                    c64028Sy0.A02 = true;
                    C1Dk A00 = c64028Sy0.A00();
                    C14360o3.A07(A00);
                    A00.setMaxToleratedCacheAgeMs(0L).setEnsureCacheWrite(false);
                    C60622REh A002 = C60622REh.A00(c62731SNv2, interfaceC40711ue, A00, T7h.A00);
                    A002.A9a(new C64199T3i(sct, 4));
                    interfaceC65512Tlh = A002;
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e3) {
                    throw AbstractC58318PtA.A0f(e3);
                }
            } else if (abstractC63144Sdq instanceof REO) {
                REO reo = (REO) abstractC63144Sdq;
                int i2 = reo.A00;
                InterfaceC65509Tle interfaceC65509Tle = reo.A02;
                SparseArray sparseArray = reo.A01;
                if (i2 == 0) {
                    interfaceC65512Tlh = interfaceC65509Tle.ENp(sparseArray, c62731SNv2);
                } else {
                    interfaceC65512Tlh = interfaceC65509Tle.EFp(sparseArray, c62731SNv2);
                }
            } else {
                RET ret = (RET) abstractC63144Sdq;
                if (c62731SNv2 != null) {
                    T2M t2m = ret.A03;
                    Be9 be9 = ret.A00;
                    String str11 = ret.A06;
                    SKb sKb = t2m.A02;
                    C14360o3.A0A(be9);
                    interfaceC65512Tlh = sKb.A00(c62731SNv2, be9, str11);
                } else {
                    interfaceC65512Tlh = null;
                }
            }
            InterfaceC65512Tlh interfaceC65512Tlh3 = q8j.A01;
            if (interfaceC65512Tlh3 != null) {
                interfaceC65512Tlh3.AOi(q8j);
            }
            q8j.A01 = interfaceC65512Tlh;
            if (q8j.A0C() && interfaceC65512Tlh != null) {
                interfaceC65512Tlh.A9a(q8j);
            }
        }
    }

    public static void A02(AbstractC63144Sdq abstractC63144Sdq) {
        if (!abstractC63144Sdq.A01) {
            abstractC63144Sdq.A01 = true;
            C63406Sjd A0S = AbstractC58318PtA.A0S(abstractC63144Sdq.A03);
            if (A0S == null || A0S.A01 == null) {
                A01(null, abstractC63144Sdq);
            }
        }
    }

    public AbstractC63144Sdq(C58443PvM c58443PvM) {
        this.A02 = c58443PvM;
    }
}
