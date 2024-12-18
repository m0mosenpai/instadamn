package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import com.instagram.igsignalsproducts.ttnc.IgSignalsTtncEstimator;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* loaded from: classes9.dex */
public final class PZ5 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final long A03;
    public final Object A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ5(C37726Gj1 c37726Gj1, InterfaceC23621Ds interfaceC23621Ds, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A03 = j;
        this.A04 = c37726Gj1;
        this.A05 = z;
    }

    public static void A00(NMF nmf, long j) {
        nmf.A01(new Long(j));
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        if (this.A02 != 0) {
            PZ5 pz5 = new PZ5((C37726Gj1) this.A04, interfaceC23621Ds, this.A03, this.A05);
            pz5.A01 = obj;
            return pz5;
        }
        return new PZ5((IgSignalsTtncEstimator) this.A04, (Integer) this.A01, interfaceC23621Ds, this.A03, this.A05);
    }

    @Override // X.C1Dr
    public final Object invokeSuspend(Object obj) {
        C55134Oc1 c55134Oc1;
        int i;
        int i2;
        int i3;
        long j;
        int i4;
        AbstractC1117051t kys;
        C19L c19l;
        if (this.A02 != 0) {
            C1JX c1jx = C1JX.A02;
            if (this.A00 != 0) {
                c19l = (C19L) this.A01;
                AbstractC09560e7.A00(obj);
            } else {
                AbstractC09560e7.A00(obj);
                c19l = (C19L) this.A01;
                long j2 = this.A03;
                this.A01 = c19l;
                this.A00 = 1;
                if (AbstractC89993zf.A01(this, j2) == c1jx) {
                    return c1jx;
                }
            }
            if (AnonymousClass194.A07(c19l)) {
                ((C37726Gj1) this.A04).A0B(null, null, this.A05);
            }
        } else if (this.A00 != 0) {
            AbstractC09560e7.A00(obj);
        } else {
            AbstractC09560e7.A00(obj);
            IgSignalsTtncEstimator igSignalsTtncEstimator = (IgSignalsTtncEstimator) this.A04;
            Integer num = (Integer) this.A01;
            boolean z = this.A05;
            long j3 = this.A03;
            this.A00 = 1;
            if (igSignalsTtncEstimator.A01 == null) {
                if (igSignalsTtncEstimator.A04 && (num == C05F.A00 || num == C05F.A01)) {
                    num = C05F.A0C;
                }
                Integer num2 = C05F.A0C;
                if (num != num2 || igSignalsTtncEstimator.A03) {
                    C54967OSx c54967OSx = igSignalsTtncEstimator.A0A;
                    C15790qZ A04 = AbstractC15820qc.A04();
                    Integer num3 = A04.A01;
                    Integer num4 = C05F.A00;
                    if (num3 != num4) {
                        Integer num5 = A04.A00;
                        Integer num6 = num;
                        C51959Mxg c51959Mxg = new C51959Mxg(num6, num3, num5, num4, j3);
                        OAJ A00 = igSignalsTtncEstimator.A0B.A00();
                        List<C51959Mxg> list = A00.A02;
                        int size = list.size();
                        if (num != C05F.A0N && z && size >= 10) {
                            NMO nmo = igSignalsTtncEstimator.A02;
                            if (nmo == null) {
                                C54030Nug c54030Nug = NMO.A04;
                                UserSession userSession = igSignalsTtncEstimator.A07;
                                nmo = new NMO(userSession);
                                C108284uF A002 = AbstractC108254uC.A00(userSession).A00(nmo, MSW.A1E(c54030Nug, 28), new C57234PbI(c54030Nug, 1));
                                nmo.A00 = A002;
                                InterfaceC57950Pmw interfaceC57950Pmw = igSignalsTtncEstimator.A09;
                                if (interfaceC57950Pmw != null) {
                                    A002.A03.add(interfaceC57950Pmw);
                                }
                                if (igSignalsTtncEstimator.A0F) {
                                    AbstractC1117051t abstractC1117051t = igSignalsTtncEstimator.A00;
                                    if (abstractC1117051t != null) {
                                        C108284uF c108284uF = nmo.A00;
                                        if (c108284uF != null) {
                                            c108284uF.A01 = abstractC1117051t;
                                        }
                                        C14360o3.A0F("productCore");
                                        throw C00O.createAndThrow();
                                    }
                                    C06090Tz c06090Tz = C06090Tz.A05;
                                    String A042 = C18U.A04(c06090Tz, userSession, 36884715282498129L);
                                    if (A042.length() == 0) {
                                        String A043 = C18U.A04(c06090Tz, userSession, 36884715281973839L);
                                        String A044 = C18U.A04(c06090Tz, userSession, 36884715282104912L);
                                        long A01 = C18U.A01(c06090Tz, userSession, 36603240305333159L);
                                        if (A043.length() != 0 && A044.length() != 0) {
                                            C226418s A012 = C226218q.A01(AbstractC12960li.A00);
                                            StringBuilder A11 = AbstractC166997dE.A11(A043);
                                            A11.append('_');
                                            A11.append(A044);
                                            A11.append('_');
                                            A11.append(A01);
                                            C226418s.A06(A012.A02, "ttnc_estimator_model", A11.toString());
                                            kys = new IgSignalsDcpPredictor(userSession, new C1116951r(A01, A043, A044), C05F.A01);
                                        }
                                    } else {
                                        long A013 = C18U.A01(c06090Tz, userSession, 36603240305333159L);
                                        C226418s.A06(C226218q.A01(AbstractC12960li.A00).A02, "ttnc_estimator_model", AnonymousClass001.A0Q("tree_model_", A013));
                                        kys = new KYS(new KYT(A042));
                                    }
                                    C108284uF c108284uF2 = nmo.A00;
                                    if (c108284uF2 != null) {
                                        c108284uF2.A01 = kys;
                                        igSignalsTtncEstimator.A00 = kys;
                                    }
                                    C14360o3.A0F("productCore");
                                    throw C00O.createAndThrow();
                                }
                                igSignalsTtncEstimator.A02 = nmo;
                            }
                            C108284uF c108284uF3 = nmo.A00;
                            if (c108284uF3 != null) {
                                AbstractC55167OdV abstractC55167OdV = (AbstractC55167OdV) c108284uF3.A06.invoke("generic_id:todo");
                                abstractC55167OdV.A00 = c108284uF3;
                                NML nml = (NML) abstractC55167OdV;
                                if (nml != null) {
                                    NMF nmf = nml.A0T;
                                    C15900qk.A01();
                                    Context context = c54967OSx.A00;
                                    A00(nmf, C15900qk.A00(context, true) / 1048576);
                                    NMF nmf2 = nml.A03;
                                    switch (num3.intValue()) {
                                        case 0:
                                            i = 0;
                                            break;
                                        case 1:
                                            i = 1;
                                            break;
                                        case 2:
                                            i = 2;
                                            break;
                                        default:
                                            i = 3;
                                            break;
                                    }
                                    NMF.A00(nmf2, i);
                                    NMF nmf3 = nml.A02;
                                    switch (num5.intValue()) {
                                        case 1:
                                            i2 = 1;
                                            break;
                                        case 2:
                                            i2 = 2;
                                            break;
                                        case 3:
                                            i2 = 3;
                                            break;
                                        case 4:
                                            i2 = 4;
                                            break;
                                        default:
                                            i2 = 5;
                                            break;
                                    }
                                    NMF.A00(nmf3, i2);
                                    NMF.A00(nml.A0p, C04100Kb.A00(context));
                                    NMF.A00(nml.A0B, AbstractC37302Gc3.A02(AbstractC31171DnF.A0T(igSignalsTtncEstimator.A07, C17060sy.A01).B7X()));
                                    NMF nmf4 = nml.A0A;
                                    switch (num.intValue()) {
                                        case 1:
                                            i3 = 1;
                                            break;
                                        case 2:
                                            i3 = 2;
                                            break;
                                        case 3:
                                            i3 = 3;
                                            break;
                                        default:
                                            i3 = 0;
                                            break;
                                    }
                                    NMF.A00(nmf4, i3);
                                    C51959Mxg c51959Mxg2 = A00.A00;
                                    if (c51959Mxg2 != null) {
                                        long j4 = c51959Mxg2.A04;
                                        i4 = c51959Mxg2.A00;
                                        j = AbstractC166987dD.A0L(j3 - (j4 + i4));
                                    } else {
                                        j = -1;
                                        i4 = -1;
                                    }
                                    long j5 = j3 - 900000;
                                    OL9 ol9 = new OL9(A04, num6, "ttnc", j5);
                                    long j6 = j3 - 3600000;
                                    Integer num7 = num;
                                    OL9 ol92 = new OL9(A04, num7, "ttnc", j6);
                                    long j7 = j3 - 86400000;
                                    Integer num8 = num;
                                    OL9 ol93 = new OL9(A04, num8, "ttnc", j7);
                                    long j8 = j3 - 172800000;
                                    Integer num9 = num;
                                    OL9 ol94 = new OL9(A04, num9, "ttnc", j8);
                                    long j9 = j3 - 604800000;
                                    Integer num10 = num;
                                    OL9 ol95 = new OL9(A04, num10, "ttnc", j9);
                                    List A1Q = AbstractC16960so.A1Q(ol9, ol92, ol93, ol94, ol95);
                                    for (C51959Mxg c51959Mxg3 : list) {
                                        Iterator it = A1Q.iterator();
                                        while (it.hasNext()) {
                                            ((OL9) it.next()).A01(c51959Mxg3, num2);
                                        }
                                    }
                                    C54686ODm A003 = ol9.A00();
                                    C54686ODm A004 = ol92.A00();
                                    C54686ODm A005 = ol93.A00();
                                    C54686ODm A006 = ol94.A00();
                                    C54686ODm A007 = ol95.A00();
                                    A00(nml.A0G, j);
                                    NMF.A00(nml.A0C, i4);
                                    A00(nml.A0U, A003.A00);
                                    A00(nml.A0X, A004.A00);
                                    A00(nml.A0Y, A005.A00);
                                    A00(nml.A0Z, A006.A00);
                                    A00(nml.A0V, A007.A00);
                                    A00(nml.A0W, A007.A01);
                                    A00(nml.A0a, A003.A02);
                                    A00(nml.A0d, A004.A02);
                                    A00(nml.A0e, A005.A02);
                                    A00(nml.A0f, A006.A02);
                                    A00(nml.A0b, A007.A02);
                                    A00(nml.A0c, A007.A03);
                                    A00(nml.A0g, A003.A04);
                                    A00(nml.A0k, A005.A04);
                                    A00(nml.A0l, A006.A04);
                                    A00(nml.A0h, A007.A04);
                                    A00(nml.A0i, A007.A05);
                                    Integer num11 = C05F.A01;
                                    OL9 ol96 = new OL9(A04, num6, "ttnc", j5);
                                    OL9 ol97 = new OL9(A04, num7, "ttnc", j6);
                                    List A1Q2 = AbstractC16960so.A1Q(ol96, ol97, new OL9(A04, num8, "ttnc", j7), new OL9(A04, num9, "ttnc", j8), new OL9(A04, num10, "ttnc", j9));
                                    for (C51959Mxg c51959Mxg4 : list) {
                                        Iterator it2 = A1Q2.iterator();
                                        while (it2.hasNext()) {
                                            ((OL9) it2.next()).A01(c51959Mxg4, num11);
                                        }
                                    }
                                    C54686ODm A008 = ol96.A00();
                                    C54686ODm A009 = ol97.A00();
                                    A00(nml.A04, A008.A01);
                                    A00(nml.A05, A009.A01);
                                    A00(nml.A06, A008.A03);
                                    A00(nml.A07, A009.A03);
                                    A00(nml.A08, A008.A05);
                                    A00(nml.A09, A009.A05);
                                    OL9 ol98 = new OL9(A04, num6, "server_total", j5);
                                    OL9 ol99 = new OL9(A04, num7, "server_total", j6);
                                    OL9 ol910 = new OL9(A04, num8, "server_total", j7);
                                    OL9 ol911 = new OL9(A04, num9, "server_total", j8);
                                    OL9 ol912 = new OL9(A04, num10, "server_total", j9);
                                    List A1Q3 = AbstractC16960so.A1Q(ol98, ol99, ol910, ol911, ol912);
                                    for (C51959Mxg c51959Mxg5 : list) {
                                        Iterator it3 = A1Q3.iterator();
                                        while (it3.hasNext()) {
                                            ((OL9) it3.next()).A01(c51959Mxg5, num2);
                                        }
                                    }
                                    C54686ODm A0010 = ol98.A00();
                                    C54686ODm A0011 = ol99.A00();
                                    C54686ODm A0012 = ol910.A00();
                                    C54686ODm A0013 = ol911.A00();
                                    C54686ODm A0014 = ol912.A00();
                                    A00(nml.A0M, A0010.A00);
                                    A00(nml.A0O, A0011.A00);
                                    A00(nml.A0P, A0012.A00);
                                    A00(nml.A0Q, A0013.A00);
                                    A00(nml.A0N, A0014.A00);
                                    OL9 ol913 = new OL9(A04, num6, "server_ranking", j5);
                                    OL9 ol914 = new OL9(A04, num7, "server_ranking", j6);
                                    OL9 ol915 = new OL9(A04, num8, "server_ranking", j7);
                                    OL9 ol916 = new OL9(A04, num9, "server_ranking", j8);
                                    OL9 ol917 = new OL9(A04, num10, "server_ranking", j9);
                                    List A1Q4 = AbstractC16960so.A1Q(ol913, ol914, ol915, ol916, ol917);
                                    for (C51959Mxg c51959Mxg6 : list) {
                                        Iterator it4 = A1Q4.iterator();
                                        while (it4.hasNext()) {
                                            ((OL9) it4.next()).A01(c51959Mxg6, num2);
                                        }
                                    }
                                    C54686ODm A0015 = ol913.A00();
                                    C54686ODm A0016 = ol914.A00();
                                    C54686ODm A0017 = ol915.A00();
                                    C54686ODm A0018 = ol916.A00();
                                    C54686ODm A0019 = ol917.A00();
                                    A00(nml.A0H, A0015.A00);
                                    A00(nml.A0J, A0016.A00);
                                    A00(nml.A0K, A0017.A00);
                                    A00(nml.A0L, A0018.A00);
                                    A00(nml.A0I, A0019.A00);
                                    C51u A02 = igSignalsTtncEstimator.A02(j3);
                                    int A0H = AbstractC166987dD.A0H(A02.A00);
                                    int A0H2 = AbstractC166987dD.A0H(A02.A01);
                                    int A0H3 = AbstractC166987dD.A0H(A02.A02);
                                    NMF.A00(nml.A0o, A0H);
                                    NMF.A00(nml.A0m, A0H2);
                                    NMF.A00(nml.A0n, (A0H * 24 * 60) + (A0H2 * 60) + A0H3);
                                    C51u A022 = igSignalsTtncEstimator.A02(j3 + TimeZone.getDefault().getOffset(j3));
                                    int A0H4 = AbstractC166987dD.A0H(A022.A00);
                                    int A0H5 = AbstractC166987dD.A0H(A022.A01);
                                    int A0H6 = AbstractC166987dD.A0H(A022.A02);
                                    NMF.A00(nml.A0F, A0H4);
                                    NMF.A00(nml.A0D, A0H5);
                                    NMF.A00(nml.A0E, (A0H4 * 24 * 60) + (A0H5 * 60) + A0H6);
                                    c55134Oc1 = new C55134Oc1(c51959Mxg, nml, igSignalsTtncEstimator.A0E, igSignalsTtncEstimator.A05, igSignalsTtncEstimator.A06, igSignalsTtncEstimator.A0H);
                                    igSignalsTtncEstimator.A01 = c55134Oc1;
                                }
                            }
                            C14360o3.A0F("productCore");
                            throw C00O.createAndThrow();
                        }
                        c55134Oc1 = new C55134Oc1(c51959Mxg, null, igSignalsTtncEstimator.A0E, igSignalsTtncEstimator.A05, igSignalsTtncEstimator.A06, igSignalsTtncEstimator.A0H);
                        igSignalsTtncEstimator.A01 = c55134Oc1;
                    }
                }
            }
        }
        return C0eB.A00;
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PZ5) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PZ5(IgSignalsTtncEstimator igSignalsTtncEstimator, Integer num, InterfaceC23621Ds interfaceC23621Ds, long j, boolean z) {
        super(2, interfaceC23621Ds);
        this.A04 = igSignalsTtncEstimator;
        this.A01 = num;
        this.A05 = z;
        this.A03 = j;
    }
}
