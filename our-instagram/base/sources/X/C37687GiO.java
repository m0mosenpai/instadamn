package X;

import android.util.Pair;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.GiO, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37687GiO extends C31D {
    public final JPb A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final C31A A03;
    public final JHU A04;
    public final C37526Gfi A05;
    public final AbstractC39459Hbl A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final AnonymousClass318 A0C;
    public final InterfaceC114715Gb A0D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37687GiO(JPb jPb, UserSession userSession, AnonymousClass318 anonymousClass318, InterfaceC60442pS interfaceC60442pS, InterfaceC114715Gb interfaceC114715Gb, C31A c31a, JHU jhu, AbstractC39459Hbl abstractC39459Hbl, String str) {
        super(userSession, anonymousClass318, interfaceC60442pS, interfaceC114715Gb, c31a, str, null);
        C14360o3.A0B(str, 3);
        this.A01 = userSession;
        this.A02 = interfaceC60442pS;
        this.A07 = str;
        this.A0C = anonymousClass318;
        this.A03 = c31a;
        this.A06 = abstractC39459Hbl;
        this.A0D = interfaceC114715Gb;
        this.A00 = jPb;
        this.A04 = jhu;
        this.A05 = new C37526Gfi(interfaceC60442pS, userSession, new C37688GiP(this));
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A09 = C18U.A06(c06090Tz, userSession, 36322834775026359L);
        this.A08 = C18U.A06(c06090Tz, userSession, 36318526924134656L);
        this.A0B = C18U.A06(c06090Tz, userSession, 36315593460420022L);
        this.A0A = C18U.A06(c06090Tz, userSession, 36315593460354485L);
    }

    @Override // X.C31D, X.C31I
    public final void CiC(C38321qM c38321qM, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, String str3, String str4, String str5, HashMap hashMap, List list, List list2, List list3, float f, int i) {
        List list4;
        int i2;
        ArrayList arrayList;
        C38321qM c38321qM2;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        List Ag9;
        C38321qM c38321qM3;
        BrandSafetyContentBlocklistBitmapQLObj AiW2;
        List Ag92;
        Integer A0i;
        C14360o3.A0B(list, 0);
        AbstractC167027dH.A13(list2, list3, str);
        C14360o3.A0B(str2, 5);
        AbstractC167007dF.A1I(str3, 7, hashMap);
        UserSession userSession = this.A01;
        InterfaceC60442pS interfaceC60442pS = this.A02;
        String str6 = super.A00;
        ArrayList arrayList2 = null;
        if (c38321qM != null) {
            list4 = c38321qM.A3b();
        } else {
            list4 = null;
        }
        AbstractC39459Hbl abstractC39459Hbl = this.A06;
        String str7 = (String) AbstractC001800i.A0O(list3, 0);
        int i3 = -1;
        if (str7 != null && (A0i = AbstractC003100w.A0i(str7)) != null) {
            i2 = A0i.intValue() - 1;
        } else {
            i2 = -1;
        }
        C120985dq A0G = abstractC39459Hbl.A0G(i2);
        if (A0G != null && (c38321qM3 = A0G.A02) != null && (AiW2 = c38321qM3.A0C.AiW()) != null && (Ag92 = AiW2.Ag9()) != null) {
            arrayList = C5IK.A00.A01(Ag92);
        } else {
            arrayList = null;
        }
        String str8 = (String) AbstractC001800i.A0O(list3, 0);
        if (str8 != null) {
            i3 = AbstractC25227BEk.A06(AbstractC003100w.A0i(str8), -1);
        }
        C120985dq A0G2 = abstractC39459Hbl.A0G(i3);
        if (A0G2 != null && (c38321qM2 = A0G2.A02) != null && (AiW = c38321qM2.A0C.AiW()) != null && (Ag9 = AiW.Ag9()) != null) {
            arrayList2 = C5IK.A00.A01(Ag9);
        }
        C32U.A0R(userSession, c38321qM, interfaceC60442pS, num, num2, num3, num4, str, str2, str3, str6, str4, str5, hashMap, list, list2, list3, list4, arrayList, arrayList2, f, i);
    }

    @Override // X.C31D, X.C31E
    public final void CkJ(InterfaceC42381xS interfaceC42381xS) {
        C0f5 AEp;
        String str;
        String A13;
        String str2;
        StringBuilder A11;
        String id;
        C14360o3.A0B(interfaceC42381xS, 0);
        C120985dq c120985dq = (C120985dq) ((C206239Bg) interfaceC42381xS.BUM()).A03;
        C38321qM A05 = c120985dq.A05();
        if (A05 != null) {
            if (AbstractC37647Ghg.A00(c120985dq)) {
                AEp = C18950wb.A01.AEp("logInvalidContent: Clips unit is not an ad", 817903741);
                A11 = AbstractC166987dD.A1C();
                A11.append("ad_id: [");
                A11.append(AbstractC25226BEj.A1E(c120985dq));
                A11.append("] tracking_token: [");
                A11.append(c120985dq.A06().A0j);
                A11.append("] media_id: [");
                A11.append(A05.getId());
                A11.append("] ad_client_delivery_session_id: [");
                id = super.A00;
            } else if (c120985dq.A0H()) {
                AEp = C18950wb.A01.AEp("logInvalidContent: Clips unit is not an ad", 817903741);
                A11 = AbstractC166997dE.A11("id: [");
                A11.append(c120985dq.getId());
                A11.append("] tracking_token: [");
                A11.append(c120985dq.A0P);
                A11.append("] media_id: [");
                id = A05.getId();
            } else {
                if (c120985dq.A01 != EnumC129395t1.A05) {
                    return;
                }
                AEp = C18950wb.A01.AEp("logInvalidContent: Invalid brand survey content", 817903741);
                String id2 = c120985dq.getId();
                String str3 = c120985dq.A0P;
                IKS A04 = c120985dq.A04();
                String str4 = null;
                if (A04 != null) {
                    str = A04.A04;
                } else {
                    str = null;
                }
                A13 = AnonymousClass001.A13("id: [", id2, "] tracking_token: [", str3, "] ad_id: [", str);
                if (A13 == null) {
                    if (A04 != null) {
                        str2 = A04.A06;
                    } else {
                        str2 = null;
                    }
                    A13 = AnonymousClass001.A0R("] survey_id: [", str2);
                    if (A13 == null) {
                        if (A04 != null) {
                            str4 = A04.A07;
                        }
                        A13 = AnonymousClass001.A0R("] survey_type: [", str4);
                        if (A13 == null) {
                            A13 = "]";
                        }
                    }
                }
                AEp.ABW(DialogModule.KEY_MESSAGE, A13);
                AEp.report();
            }
            A11.append(id);
            A11.append(']');
            A13 = A11.toString();
            AEp.ABW(DialogModule.KEY_MESSAGE, A13);
            AEp.report();
        }
    }

    public static final void A01(C120985dq c120985dq, C82713mZ c82713mZ, C37687GiO c37687GiO) {
        C75113Zb c75113Zb;
        Integer A2N;
        if (c120985dq != null) {
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                c75113Zb = c37687GiO.A06.BRZ(c38321qM);
            } else {
                c75113Zb = null;
            }
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null && (A2N = c38321qM2.A2N()) != null) {
                c82713mZ.A0E = A2N.intValue();
            }
            if (c75113Zb != null) {
                Pair A04 = c75113Zb.A04();
                if (A04 != null) {
                    String str = (String) A04.first;
                    if (str != null) {
                        c82713mZ.A6L = str;
                    }
                    String str2 = (String) A04.second;
                    if (str2 != null) {
                        c82713mZ.A6K = str2;
                    }
                }
                Pair A03 = c75113Zb.A03();
                if (A03 != null) {
                    Number number = (Number) A03.first;
                    if (number != null) {
                        c82713mZ.A0D = number.intValue();
                    }
                    Number number2 = (Number) A03.second;
                    if (number2 != null) {
                        c82713mZ.A0C = number2.intValue();
                    }
                }
            }
        }
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Ci7(Integer num, Object obj) {
        String str;
        int i;
        C38649Gyq BzJ;
        C206239Bg c206239Bg = (C206239Bg) obj;
        AbstractC167007dF.A1K(c206239Bg, num);
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        if (AbstractC37647Ghg.A00(c120985dq)) {
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, "delivery");
            A04.A7R = "ad";
            UserSession userSession = this.A01;
            A04.A0K(userSession, c120985dq.A06());
            A04.A2x = num;
            A04.A21 = Boolean.valueOf(c206239Bg.A01);
            Integer num2 = (Integer) c206239Bg.A00;
            if (num2 != null) {
                str = AbstractC37798GkD.A01(num2);
            } else {
                str = null;
            }
            A04.A56 = str;
            C40861ut c40861ut = (C40861ut) c206239Bg.A04;
            if (c40861ut != null) {
                i = c40861ut.A09();
            } else {
                i = -1;
            }
            A04.A0G = i;
            A04.A4S = super.A00;
            AbstractC37300Gc1.A10(userSession, A04);
            String str2 = c120985dq.A06().A0f;
            if (str2 != null) {
                A04.A5d = str2;
            }
            String str3 = c120985dq.A06().A0c;
            if (str3 != null) {
                A04.A5e = str3;
            }
            AbstractC37303Gc4.A1D(userSession, A04);
            JHU jhu = this.A04;
            if (jhu != null && (BzJ = jhu.BzJ(c206239Bg)) != null) {
                C11520jB A0B = AbstractC37300Gc1.A0B();
                A0B.A0A("rendering_metadata", I9L.A00(BzJ));
                A04.A0E(A0B);
            }
            if (c120985dq.A0G()) {
                C9C2 c9c2 = c120985dq.A03().A01;
                List list = (List) c9c2.A00;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    A04.A0K(userSession, (C40971v4) it.next());
                    A00((IntentAwareAdsInfoIntf) c9c2.A01, A04);
                    C32U.A0I(userSession, A04, interfaceC60442pS, C05F.A01);
                }
                IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = (IntentAwareAdsInfoIntf) c9c2.A01;
                Integer BVJ = intentAwareAdsInfoIntf.BVJ();
                if (BVJ != null && BVJ.intValue() == 10) {
                    C37526Gfi c37526Gfi = this.A05;
                    ArrayList A1E = AbstractC166987dD.A1E();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str4 = ((C40971v4) it2.next()).A0S;
                        C14360o3.A0B(str4, 0);
                        Long A0k = AbstractC003100w.A0k(10, str4);
                        if (A0k != null) {
                            A1E.add(A0k);
                        }
                    }
                    c37526Gfi.A01(intentAwareAdsInfoIntf, null, A1E);
                    return;
                }
                return;
            }
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Ci8(InterfaceC42381xS interfaceC42381xS, Object obj) {
        Integer num;
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        if (this.A08 && ((num = c1pz.A0B) == C05F.A0N || num == C05F.A0Y)) {
            return;
        }
        A02(interfaceC42381xS, c1pz, "invalidation");
    }

    @Override // X.C31E
    public final /* bridge */ /* synthetic */ void Ci9(InterfaceC42381xS interfaceC42381xS, Object obj) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        if (this.A09) {
            C3YM.A00(this.A01).A05(this.A02, Integer.valueOf(this.A00.C09((C120985dq) ((C206239Bg) interfaceC42381xS.BUM()).A03).A06()));
        }
        A02(interfaceC42381xS, c1pz, "insertion_success");
    }

    @Override // X.C31F
    public final /* bridge */ /* synthetic */ void CiA(C1PZ c1pz, Long l, Object obj, String str, String str2, String str3, String str4, Collection collection, Collection collection2, Map map, Map map2, boolean z) {
        Long l2;
        HashMap hashMap;
        String str5;
        Integer num;
        C206239Bg c206239Bg = (C206239Bg) obj;
        AbstractC167027dH.A0a(0, c206239Bg, str, collection, collection2);
        C14360o3.A0B(c1pz, 11);
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        boolean A0G = c120985dq.A0G();
        if (A0G && C42159Im7.A01(c120985dq).size() > 0) {
            this.A05.A02(C42159Im7.A00(c120985dq), str);
            if (!C18U.A06(C06090Tz.A05, this.A01, 36327855591996338L)) {
                return;
            }
        }
        Long l3 = null;
        String str6 = null;
        if (AbstractC37647Ghg.A00(c120985dq)) {
            if (this.A09) {
                C3YM.A00(this.A01).A06(this.A02, Integer.valueOf(this.A00.C09(c120985dq).A06()));
            }
            C42545IsO c42545IsO = new C42545IsO(1, c206239Bg, c1pz, this);
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A02;
            ArrayList A1F = AbstractC166987dD.A1F(collection);
            ArrayList A1F2 = AbstractC166987dD.A1F(collection2);
            String str7 = super.A00;
            if (map != null) {
                hashMap = new HashMap(map);
            } else {
                hashMap = null;
            }
            if (A0G) {
                str5 = c120985dq.getId();
            } else {
                str5 = null;
            }
            C38321qM c38321qM = c120985dq.A02;
            if (c38321qM != null) {
                num = Integer.valueOf(c38321qM.A0n());
            } else {
                num = null;
            }
            C38321qM c38321qM2 = c120985dq.A02;
            if (c38321qM2 != null) {
                str6 = c38321qM2.A2w();
            }
            C32U.A0M(userSession, c42545IsO, c120985dq, interfaceC60442pS, num, l, str, str2, str3, str4, str7, null, str5, str6, hashMap, A1F, A1F2, z);
            return;
        }
        if (!c120985dq.A0H()) {
            return;
        }
        ArrayList A0i = AbstractC167007dF.A0i(collection2);
        int i = 0;
        for (Object obj2 : collection2) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC16960so.A1U();
                throw C00O.createAndThrow();
            }
            AbstractC166997dE.A1R(AbstractC31171DnF.A0V(i), obj2, A0i);
            i = i2;
        }
        Map A08 = AbstractC06930Yk.A08(A0i);
        UserSession userSession2 = this.A01;
        if (!C18U.A06(C06090Tz.A05, userSession2, 36324780395213277L)) {
            return;
        }
        InterfaceC60442pS interfaceC60442pS2 = this.A02;
        C31A c31a = this.A03;
        String AUe = c31a.AUe(c206239Bg);
        if (AUe == null) {
            AUe = "";
        }
        String str8 = this.A07;
        Long A0V = AbstractC31171DnF.A0V(c31a.AUK(c206239Bg));
        Long A0V2 = AbstractC31171DnF.A0V(c31a.AUL(c206239Bg));
        Long A0V3 = AbstractC31171DnF.A0V(c31a.AUM(c206239Bg));
        Long A0V4 = AbstractC31171DnF.A0V(c31a.AUN(c206239Bg));
        c31a.AUQ(c206239Bg);
        String AUP = c31a.AUP(c206239Bg);
        if (AUP != null) {
            l2 = AbstractC003100w.A0k(10, AUP);
        } else {
            l2 = null;
        }
        String ATy = c31a.ATy(c206239Bg);
        if (ATy != null) {
            l3 = AbstractC003100w.A0k(10, ATy);
        }
        C32U.A07(interfaceC60442pS2, userSession2, A0V, A0V2, A0V3, A0V4, l2, l3, AUe, str8, null, A08);
    }

    @Override // X.C31D, X.C31E
    public final /* bridge */ /* synthetic */ void Cit(InterfaceC42381xS interfaceC42381xS, Object obj, String str) {
        C1PZ c1pz = (C1PZ) obj;
        AbstractC167017dG.A1N(interfaceC42381xS, c1pz);
        C120985dq c120985dq = (C120985dq) ((C206239Bg) interfaceC42381xS.BUM()).A03;
        if (AbstractC37647Ghg.A00(c120985dq)) {
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82713mZ c82713mZ = new C82713mZ(interfaceC60442pS, "ad_exit_pool");
            UserSession userSession = this.A01;
            c82713mZ.A0K(userSession, c120985dq.A06());
            c82713mZ.A7R = "ad";
            c82713mZ.A0G = c1pz.A03;
            c82713mZ.A4S = super.A00;
            C32U.A0H(userSession, c82713mZ, interfaceC60442pS);
        }
    }

    public static final void A00(IntentAwareAdsInfoIntf intentAwareAdsInfoIntf, C82713mZ c82713mZ) {
        C11520jB A0B = AbstractC37300Gc1.A0B();
        A0B.A04(C5I8.A4W, AbstractC166997dE.A0b());
        A0B.A04(C5I8.A5y, Long.valueOf(AbstractC37302Gc3.A04(intentAwareAdsInfoIntf.BVJ())));
        A0B.A04(C5I8.A5w, intentAwareAdsInfoIntf.BVL());
        A0B.A04(C5I8.A5v, intentAwareAdsInfoIntf.BVC());
        A0B.A04(C5I8.A60, intentAwareAdsInfoIntf.BVL());
        A0B.A05(C5I8.A7w, intentAwareAdsInfoIntf.Brx());
        A0B.A05(C5I8.A5x, intentAwareAdsInfoIntf.BIG());
        c82713mZ.A0E(A0B);
    }

    private final void A02(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, String str) {
        String str2;
        String str3;
        long j;
        Long l;
        Long l2;
        C206239Bg c206239Bg = (C206239Bg) interfaceC42381xS.BUM();
        C120985dq c120985dq = (C120985dq) c206239Bg.A03;
        if (AbstractC37647Ghg.A00(c120985dq)) {
            InterfaceC60442pS interfaceC60442pS = this.A02;
            C82713mZ A04 = AbstractC82703mY.A04(c120985dq, interfaceC60442pS, str);
            UserSession userSession = this.A01;
            AbstractC37303Gc4.A1E(userSession, A04, c120985dq.A06(), interfaceC42381xS);
            AbstractC37303Gc4.A1G(A04, this, interfaceC42381xS, c1pz);
            A04.A21 = Boolean.valueOf(c206239Bg.A01);
            Integer num = (Integer) c206239Bg.A00;
            Long l3 = null;
            if (num != null) {
                str2 = AbstractC37798GkD.A01(num);
            } else {
                str2 = null;
            }
            A04.A56 = str2;
            AbstractC37300Gc1.A10(userSession, A04);
            C671831j c671831j = (C671831j) c206239Bg.A04;
            if (c671831j != null) {
                A04.A3m = AbstractC31171DnF.A0V(c671831j.A05());
                A04.A3n = AbstractC31171DnF.A0V(c671831j.A04);
            }
            A01(c120985dq, A04, this);
            AbstractC37303Gc4.A1D(userSession, A04);
            AnonymousClass318 anonymousClass318 = this.A0C;
            if (anonymousClass318.A00() != null) {
                A04.A2d = Double.valueOf(System.currentTimeMillis() - r0.longValue());
            }
            Long l4 = anonymousClass318.A0N;
            if (l4 != null) {
                A04.A4L = Long.valueOf(System.currentTimeMillis() - l4.longValue());
            }
            String str4 = c120985dq.A06().A0f;
            if (str4 != null) {
                A04.A5d = str4;
            }
            String str5 = c120985dq.A06().A0c;
            if (str5 != null) {
                A04.A5e = str5;
            }
            Integer num2 = C05F.A00;
            Integer num3 = c1pz.A0C;
            if (num2 == num3) {
                A04.A0G = c1pz.A03;
                String str6 = c1pz.A0F;
                if (str6 != null) {
                    A04.A7B = str6;
                }
                if (this.A09) {
                    C3YO A00 = C3YM.A00(userSession);
                    AbstractC37302Gc3.A1O(interfaceC60442pS, A04, A00);
                    A04.A31 = A00.A01(interfaceC60442pS);
                    A04.A32 = A00.A02(interfaceC60442pS);
                    A00.A06(interfaceC60442pS, Integer.valueOf(this.A00.C09(c120985dq).A06()));
                }
            } else if (C05F.A01 == num3) {
                A04.A08 = c1pz.A03;
                A04.A02 = c1pz.A00;
                C38321qM A05 = c120985dq.A05();
                if (A05 != null) {
                    String A0U = AbstractC37303Gc4.A0U(A04, A05);
                    if (A0U.length() > 0) {
                        A04.A6J = A0U;
                    }
                }
            }
            String str7 = (String) AbstractC001800i.A0J(c1pz.A00());
            if (str7 != null) {
                A04.A7W = str7;
                A04.A84 = c1pz.A00();
            }
            IntentAwareAdsInfoIntf A002 = c120985dq.A00();
            if (A002 != null) {
                A00(A002, A04);
                if (str.equals("insertion_success")) {
                    C37526Gfi c37526Gfi = this.A05;
                    Long A0V = AbstractC31171DnF.A0V(c1pz.A03);
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c37526Gfi.A01, "instagram_ad_pivots_insertion_success");
                    if (A0f.isSampled()) {
                        if (A0V != null) {
                            j = A0V.longValue();
                        } else {
                            j = -1;
                        }
                        C37526Gfi.A00(A0f, c37526Gfi, j);
                        Integer Bry = A002.Bry();
                        if (Bry != null) {
                            l = AbstractC25229BEm.A0n(Bry);
                        } else {
                            l = null;
                        }
                        A0f.A9K("hscroll_seed_ad_position", l);
                        AbstractC37301Gc2.A15(A0f, c37526Gfi.A00);
                        AbstractC37302Gc3.A0v(A0f, A002);
                        Integer BVJ = A002.BVJ();
                        if (BVJ != null) {
                            l2 = AbstractC25229BEm.A0n(BVJ);
                        } else {
                            l2 = null;
                        }
                        A0f.A9K("multi_ads_type_number", l2);
                        AbstractC37301Gc2.A14(A0f, A002);
                        A0f.AAP("client_insertion_source", A002.BIG());
                        String Brx = A002.Brx();
                        if (Brx != null) {
                            l3 = AbstractC166997dE.A0j(Brx);
                        }
                        AbstractC37303Gc4.A0d(A0f, A002, l3);
                        A0f.Cht();
                    }
                } else if (str.equals("invalidation") && (str3 = (String) AbstractC001800i.A0J(c1pz.A00())) != null) {
                    this.A05.A02(A002, str3);
                }
            }
            if (c120985dq.A0G()) {
                Iterator it = C42159Im7.A01(c120985dq).iterator();
                while (it.hasNext()) {
                    A04.A0K(userSession, (C40971v4) it.next());
                    C32U.A0I(userSession, A04, interfaceC60442pS, C05F.A01);
                }
                return;
            }
            C32U.A0H(userSession, A04, interfaceC60442pS);
        }
    }
}
