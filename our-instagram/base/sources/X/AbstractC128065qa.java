package X;

import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5qa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC128065qa {
    public static final C38695H2g A01(C38688GzT c38688GzT) {
        C37471Gep c37471Gep;
        C14360o3.A0B(c38688GzT, 0);
        C38758H4y c38758H4y = null;
        new C1DY((C1DV) new C37761pD(null), 6, false);
        JKT jkt = new C38695H2g(null, null, null, null, null).A01;
        C38321qM c38321qM = (C38321qM) c38688GzT.A01;
        InterfaceC43584JMs interfaceC43584JMs = (InterfaceC43584JMs) c38688GzT.A00;
        H4O h4o = (H4O) c38688GzT.A02;
        Integer num = (Integer) c38688GzT.A03;
        H4O h4o2 = null;
        C1DY c1dy = new C1DY((C1DV) new C37761pD(null), 6, false);
        if (interfaceC43584JMs != null) {
            c37471Gep = interfaceC43584JMs.Eqa(c1dy);
        } else {
            c37471Gep = null;
        }
        if (jkt != null) {
            c38758H4y = jkt.Ez7(c1dy);
        }
        if (h4o != null) {
            h4o2 = h4o;
        }
        return new C38695H2g(c37471Gep, h4o2, c38758H4y, c38321qM, num);
    }

    public static final C120985dq A02(InterfaceC111044zG interfaceC111044zG) {
        Integer CBl;
        C14360o3.A0B(interfaceC111044zG, 0);
        C3x9 clipsMetadata = interfaceC111044zG.BQN().A0C.getClipsMetadata();
        if (clipsMetadata != null) {
            C38321qM BQN = interfaceC111044zG.BQN();
            C128865s0 AKg = clipsMetadata.AKg();
            String A38 = interfaceC111044zG.BQN().A38();
            if (A38 != null) {
                AKg.A0Y = A38;
                BQN.A43(AKg.A00());
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if ((interfaceC111044zG.CBl() == null || ((CBl = interfaceC111044zG.CBl()) != null && CBl.intValue() == 7)) && interfaceC111044zG.BQN().A0C.getClipsMetadata() == null && interfaceC111044zG.BQN().A1z() == null) {
            return new C120985dq(new C37683GiK(EnumC129395t1.A0H, interfaceC111044zG.BQN()));
        }
        return new C120985dq(new C128075qb(interfaceC111044zG.BQN(), null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01f3, code lost:
    
        if (r6.isEmpty() != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0246, code lost:
    
        if (r6 != null) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C120985dq A03(X.InterfaceC43554JLo r41) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC128065qa.A03(X.JLo):X.5dq");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C37469Gen A04(InterfaceC43584JMs interfaceC43584JMs) {
        C38321qM c38321qM;
        C38011pl c38011pl;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        C14360o3.A0B(interfaceC43584JMs, 0);
        C38321qM c38321qM2 = (C38321qM) interfaceC43584JMs.getItems().get(0);
        Long AiY = interfaceC43584JMs.AiY();
        if (AiY != null) {
            c38321qM2.A0C.EQb(AiY);
        }
        EnumC40111tc A00 = AbstractC40091ta.A00(interfaceC43584JMs.BRq());
        if (EnumC40111tc.A09 != A00 || (c38321qM = C38321qM.A0h.A0D(interfaceC43584JMs.getMediaId(), interfaceC43584JMs.getItems())) == null) {
            c38321qM = (C38321qM) interfaceC43584JMs.getItems().get(0);
        }
        C37468Gem c37468Gem = new C37468Gem();
        c37468Gem.A0L = c38321qM;
        c37468Gem.A0M = A00;
        c37468Gem.A01 = interfaceC43584JMs.B82();
        c37468Gem.A0n = interfaceC43584JMs.getItems();
        c37468Gem.A05 = interfaceC43584JMs.AmK();
        c37468Gem.A0J = interfaceC43584JMs.BQT();
        c37468Gem.A08 = interfaceC43584JMs.Asp();
        c37468Gem.A0e = interfaceC43584JMs.getDominantColor();
        c37468Gem.A0a = interfaceC43584JMs.Baa();
        c37468Gem.A0g = interfaceC43584JMs.BKx();
        c37468Gem.A0q = ImmutableList.copyOf((Collection) interfaceC43584JMs.BDm());
        c37468Gem.A0l = interfaceC43584JMs.CAR();
        c37468Gem.A0b = interfaceC43584JMs.AZR();
        ((AbstractC40901ux) c37468Gem).A00 = ImmutableList.copyOf((Collection) interfaceC43584JMs.getCookies());
        interfaceC43584JMs.BIt();
        c37468Gem.A0Z = interfaceC43584JMs.AZE();
        c37468Gem.A0m = ImmutableList.copyOf((Collection) interfaceC43584JMs.Abm());
        c37468Gem.A0h = interfaceC43584JMs.BNT();
        C671831j c671831j = C671831j.A0D;
        InterfaceC38021pm Anu = interfaceC43584JMs.Anu();
        IntentAwareAdsInfoIntf intentAwareAdsInfoIntf = null;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        if (Anu != null) {
            c38011pl = Anu.F7F();
        } else {
            c38011pl = null;
        }
        c37468Gem.A00 = new C671831j(objArr10 == true ? 1 : 0, c38011pl, objArr9 == true ? 1 : 0, i, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 16382, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
        c37468Gem.A0P = interfaceC43584JMs.Bm0();
        c37468Gem.A0Q = interfaceC43584JMs.Bm1();
        c37468Gem.A0U = interfaceC43584JMs.Ccp();
        interfaceC43584JMs.AyU();
        c37468Gem.A0p = interfaceC43584JMs.Azx();
        c37468Gem.A09 = interfaceC43584JMs.B02();
        c37468Gem.A04 = interfaceC43584JMs.Atg();
        c37468Gem.A02 = interfaceC43584JMs.AaF();
        c37468Gem.A0S = interfaceC43584JMs.B1h();
        c37468Gem.A0o = interfaceC43584JMs.Ark();
        c37468Gem.A0X = interfaceC43584JMs.CFr();
        c37468Gem.A0K = interfaceC43584JMs.BVd();
        c37468Gem.A03 = interfaceC43584JMs.AaR();
        c37468Gem.A0F = interfaceC43584JMs.BYm();
        JKB BVB = interfaceC43584JMs.BVB();
        if (BVB != null) {
            intentAwareAdsInfoIntf = BVB.BIo();
        }
        c37468Gem.A0E = intentAwareAdsInfoIntf;
        c37468Gem.A0i = interfaceC43584JMs.BVG();
        c37468Gem.A0V = interfaceC43584JMs.Bv2();
        c37468Gem.A0R = interfaceC43584JMs.B1Q();
        c37468Gem.A0T = interfaceC43584JMs.CSS();
        c37468Gem.A0D = interfaceC43584JMs.BMq();
        return c37468Gem.A01();
    }

    public static final List A05(UserSession userSession, List list) {
        C120985dq c120985dq;
        Integer num;
        int i;
        String str;
        C14360o3.A0B(userSession, 1);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C111034zF c111034zF = (C111034zF) it.next();
                C14360o3.A0B(c111034zF, 0);
                C38321qM BQN = c111034zF.BQN();
                C3x9 clipsMetadata = BQN.A0C.getClipsMetadata();
                if (clipsMetadata != null) {
                    C128865s0 AKg = clipsMetadata.AKg();
                    String A38 = BQN.A38();
                    if (A38 != null) {
                        AKg.A0Y = A38;
                        BQN.A43(AKg.A00());
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
                Integer CBl = c111034zF.CBl();
                if ((CBl == null || CBl.intValue() == 7) && BQN.A0C.getClipsMetadata() == null && BQN.A1z() == null) {
                    c120985dq = new C120985dq(new C37683GiK(EnumC129395t1.A0H, BQN));
                } else {
                    c120985dq = null;
                    if (CBl != null && CBl.intValue() == 2) {
                        if (C18U.A06(C06090Tz.A05, userSession, 2342161536137631997L)) {
                            try {
                                c120985dq = C128085qc.A03(AbstractC40881uv.A00(BQN));
                            } catch (NullPointerException unused) {
                                C0f5 AEp = C18950wb.A01.AEp("ClipsItemDictIntf.toClipsItemWithAd", 817902528);
                                if (BQN.A6E()) {
                                    num = C05F.A0N;
                                } else if (BQN.A6D()) {
                                    num = C05F.A0C;
                                } else if (BQN.CdW()) {
                                    num = C05F.A01;
                                } else {
                                    num = C05F.A00;
                                }
                                AEp.ABW("AdType", AbstractC110244xu.A00(num));
                                Integer BRq = BQN.A0C.BRq();
                                if (BRq != null) {
                                    i = BRq.intValue();
                                } else {
                                    i = -1;
                                }
                                AEp.ABU("MediaType", i);
                                boolean z = false;
                                if (BQN.A0C.getInjected() != null) {
                                    z = true;
                                }
                                AEp.ABX("Injected", z);
                                InterfaceC39541sb injected = BQN.A0C.getInjected();
                                if (injected == null || (str = injected.AZE()) == null) {
                                    str = "N/A";
                                }
                                AEp.ABW("AdId", str);
                                AEp.ABW("MediaId", BQN.BqK());
                                AEp.report();
                            }
                        } else {
                            c120985dq = C128085qc.A03(AbstractC40881uv.A00(BQN));
                        }
                    } else {
                        c120985dq = new C120985dq(new C128075qb(BQN, null));
                    }
                }
                if (c120985dq != null) {
                    arrayList.add(c120985dq);
                }
            }
            return arrayList;
        }
        return C16930sl.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List A06(UserSession userSession, List list, List list2, int i) {
        InterfaceC43576JMk BWY;
        int i2;
        InterfaceC38021pm Anu;
        Integer C5S;
        InterfaceC38021pm Anu2;
        InterfaceC38021pm Anu3;
        C38011pl F7F;
        C671831j c671831j;
        C38011pl c38011pl;
        C14360o3.A0B(list, 1);
        ArrayList arrayList = new ArrayList();
        if (!list.isEmpty() && !list2.isEmpty()) {
            int size = list2.size();
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC43554JLo interfaceC43554JLo = (InterfaceC43554JLo) list.get(i3);
                C120985dq c120985dq = (C120985dq) list2.get(i3);
                int i4 = 0;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                Object[] objArr13 = 0;
                Object[] objArr14 = 0;
                Object[] objArr15 = 0;
                Object[] objArr16 = 0;
                Object[] objArr17 = 0;
                Object[] objArr18 = 0;
                Object[] objArr19 = 0;
                Object[] objArr20 = 0;
                Object[] objArr21 = 0;
                Object[] objArr22 = 0;
                Object[] objArr23 = 0;
                Object[] objArr24 = 0;
                Object[] objArr25 = 0;
                Object[] objArr26 = 0;
                C14360o3.A0B(interfaceC43554JLo, 0);
                C14360o3.A0B(c120985dq, 2);
                InterfaceC43584JMs AZH = interfaceC43554JLo.AZH();
                if (AZH != null) {
                    JKB BVB = AZH.BVB();
                    if (BVB != null) {
                        InterfaceC38021pm Anu4 = ((InterfaceC43584JMs) AbstractC001800i.A0I(BVB.BVF())).Anu();
                        if (Anu4 != null) {
                            c38011pl = Anu4.F7F();
                        } else {
                            c38011pl = null;
                        }
                        Object[] objArr27 = 0;
                        Object[] objArr28 = 0;
                        int i5 = 16382;
                        C671831j c671831j2 = new C671831j(null, c38011pl, 0 == true ? 1 : 0, i4, objArr26 == true ? 1 : 0, objArr25 == true ? 1 : 0, objArr24 == true ? 1 : 0, objArr23 == true ? 1 : 0, i5, objArr22 == true ? 1 : 0, objArr21 == true ? 1 : 0, objArr20 == true ? 1 : 0, objArr19 == true ? 1 : 0);
                        if (C1LE.A09(userSession) && i > 0) {
                            c671831j2.A0B(c671831j2.A09() + i);
                        }
                        c671831j = new C671831j(objArr28 == true ? 1 : 0, c38011pl, objArr27 == true ? 1 : 0, objArr18 == true ? 1 : 0, objArr17 == true ? 1 : 0, objArr16 == true ? 1 : 0, objArr15 == true ? 1 : 0, objArr14 == true ? 1 : 0, i5, objArr13 == true ? 1 : 0, objArr12 == true ? 1 : 0, objArr11 == true ? 1 : 0, objArr10 == true ? 1 : 0);
                        arrayList.add(new C206239Bg(c120985dq, c671831j));
                    } else {
                        C671831j c671831j3 = C671831j.A0D;
                        Anu3 = AZH.Anu();
                        if (Anu3 == null) {
                            F7F = null;
                            c671831j = new C671831j(null, F7F, 0 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 16382, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                            if (C1LE.A09(userSession) && i > 0) {
                                c671831j.A0B(c671831j.A09() + i);
                            }
                            arrayList.add(new C206239Bg(c120985dq, c671831j));
                        }
                    }
                } else {
                    InterfaceC43576JMk BWY2 = interfaceC43554JLo.BWY();
                    if (BWY2 != null) {
                        C06090Tz c06090Tz = C06090Tz.A06;
                        if (C18U.A06(c06090Tz, userSession, 36313712265529558L) || C18U.A06(c06090Tz, userSession, 36319450340793796L) || C18U.A06(c06090Tz, userSession, 36320584212161213L) || C18U.A06(c06090Tz, userSession, 36325136877499160L)) {
                            C671831j c671831j4 = C671831j.A0D;
                            Anu3 = BWY2.Anu();
                        }
                    }
                }
                F7F = Anu3.F7F();
                c671831j = new C671831j(null, F7F, 0 == true ? 1 : 0, objArr9 == true ? 1 : 0, objArr8 == true ? 1 : 0, objArr7 == true ? 1 : 0, objArr6 == true ? 1 : 0, objArr5 == true ? 1 : 0, 16382, objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, objArr == true ? 1 : 0);
                if (C1LE.A09(userSession)) {
                    c671831j.A0B(c671831j.A09() + i);
                }
                arrayList.add(new C206239Bg(c120985dq, c671831j));
            }
            if (C18U.A06(C06090Tz.A05, userSession, 36318479682509016L)) {
                ArrayList arrayList2 = new ArrayList(AbstractC06950Ym.A1E(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (true) {
                    int i6 = -1;
                    if (!it.hasNext()) {
                        break;
                    }
                    C40861ut c40861ut = (C40861ut) ((C206239Bg) it.next()).A04;
                    if (c40861ut != null) {
                        i6 = c40861ut.A09();
                    }
                    arrayList2.add(Integer.valueOf(i6));
                }
                if (!C14360o3.A0K(AbstractC001800i.A0Z(arrayList2), arrayList2)) {
                    ArrayList arrayList3 = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        InterfaceC43554JLo interfaceC43554JLo2 = (InterfaceC43554JLo) it2.next();
                        InterfaceC43584JMs AZH2 = interfaceC43554JLo2.AZH();
                        if ((AZH2 != null && (Anu2 = AZH2.Anu()) != null && (C5S = Anu2.C5S()) != null) || ((BWY = interfaceC43554JLo2.BWY()) != null && (Anu = BWY.Anu()) != null && (C5S = Anu.C5S()) != null)) {
                            i2 = C5S.intValue();
                        } else {
                            i2 = -1;
                        }
                        arrayList3.add(Integer.valueOf(i2));
                    }
                    C18950wb c18950wb = C18950wb.A01;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Sponsored Item Sync Delivery Discrepancy, indexList: ");
                    sb.append(arrayList2);
                    sb.append("response: ");
                    sb.append(arrayList3);
                    c18950wb.AEp(sb.toString(), 976028688).report();
                }
                return AbstractC001800i.A0g(arrayList, new J63());
            }
            return arrayList;
        }
        return arrayList;
    }

    public static final C111034zF A00(C120985dq c120985dq) {
        C38321qM c38321qM;
        if (c120985dq != null && (c38321qM = c120985dq.A02) != null) {
            return new C111034zF(c38321qM, Integer.valueOf(c120985dq.A01.ordinal()));
        }
        return null;
    }

    public static final List A07(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(A02((C111034zF) it.next()));
            }
            return arrayList;
        }
        return C16930sl.A00;
    }
}
