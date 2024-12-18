package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.commonavatarliveediting.CdlProviderImpl;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public abstract class OMs {
    public int A00;
    public int A01;
    public C54712OEo A02;
    public String A03;
    public String A04;
    public String A05;
    public Map A06;
    public Map A07;
    public Map A08;
    public final C55555Olp A0C;
    public final Object A0D = new Object();
    public Map A0A = AbstractC06930Yk.A0E();
    public Map A09 = AbstractC06930Yk.A0E();
    public Map A0B = AbstractC06930Yk.A0E();
    public final CopyOnWriteArrayList A0E = new CopyOnWriteArrayList();

    public final void A05(AbstractC53425NkE abstractC53425NkE) {
        OMg oMg;
        String str;
        C54753OHi c54753OHi;
        Iterator it = this.A0E.iterator();
        while (it.hasNext()) {
            C55127Obo c55127Obo = (C55127Obo) it.next();
            if (abstractC53425NkE instanceof C51489Moa) {
                if (((C51489Moa) abstractC53425NkE).A00) {
                    C55127Obo.A00(c55127Obo);
                }
                OMg oMg2 = c55127Obo.A05;
                if (oMg2 != null) {
                    oMg2.A02("CDL_GENERATE_AVATAR");
                }
            } else if (!(abstractC53425NkE instanceof C51487MoY) && !(abstractC53425NkE instanceof C51486MoX)) {
                if (abstractC53425NkE instanceof C51491Moc) {
                    if (((C51491Moc) abstractC53425NkE).A01) {
                        C55127Obo.A00(c55127Obo);
                    }
                    C54753OHi c54753OHi2 = c55127Obo.A02;
                    if (c54753OHi2 != null) {
                        c54753OHi2.A00(C05F.A0N, null);
                    }
                    OMg oMg3 = c55127Obo.A05;
                    if (oMg3 != null) {
                        oMg3.A02("AVATAR_MEMORY_LOAD");
                    }
                } else if (abstractC53425NkE instanceof C51490Mob) {
                    OMg oMg4 = c55127Obo.A05;
                    if (oMg4 != null) {
                        oMg4.A01("CDL_GENERATE_AVATAR");
                    }
                    OMg oMg5 = c55127Obo.A05;
                    if (oMg5 != null) {
                        oMg5.A03("isAvatarFetchedFromCache", Boolean.valueOf(((C51490Mob) abstractC53425NkE).A01));
                    }
                } else if (abstractC53425NkE instanceof C51488MoZ) {
                    String str2 = ((C51488MoZ) abstractC53425NkE).A00;
                    C55127Obo.A01(c55127Obo);
                    OL0 ol0 = c55127Obo.A03;
                    if (ol0 != null) {
                        ol0.A03.A00();
                        ol0.A01(EnumC53100NeD.A02, str2);
                        oMg = c55127Obo.A05;
                        if (oMg != null) {
                            str = "CDL_AVATAR_GENERATION_FAILED";
                            oMg.A04(str, (short) 3);
                        }
                    } else {
                        C14360o3.A0F("fallbackLogic");
                        throw C00O.createAndThrow();
                    }
                } else if (abstractC53425NkE instanceof C51494Mof) {
                    OMg oMg6 = c55127Obo.A05;
                    if (oMg6 != null) {
                        oMg6.A01("EFFECT_RENDER");
                    }
                    C19L c19l = c55127Obo.A0C;
                    C12T c12t = C12P.A00;
                    AbstractC23641Du.A05(AnonymousClass131.A00, new PYY(c55127Obo, (InterfaceC23621Ds) null, 1.0f), c19l);
                    C54753OHi c54753OHi3 = c55127Obo.A02;
                    if (c54753OHi3 != null) {
                        c54753OHi3.A00(C05F.A01, null);
                    }
                } else if (!(abstractC53425NkE instanceof C51492Mod) && !(abstractC53425NkE instanceof C51493Moe)) {
                    if ((abstractC53425NkE instanceof C51485MoW) && (c54753OHi = c55127Obo.A02) != null) {
                        C09530e4 c09530e4 = ((C51485MoW) abstractC53425NkE).A00;
                        String str3 = (String) c09530e4.A00;
                        String obj = c09530e4.A01.toString();
                        C14360o3.A0B(str3, 0);
                        if (obj != null) {
                            C6FG c6fg = c54753OHi.A00;
                            C102884kP c102884kP = c54753OHi.A01;
                            InterfaceC103384lE A0B = c102884kP.A0B(56);
                            if (A0B != null) {
                                AbstractC166987dD.A1Z(new C50115MAo(c102884kP, A0B, c6fg, str3, obj, null, 1), AbstractC50523MSb.A0e());
                            }
                        }
                    }
                } else {
                    OL0 ol02 = c55127Obo.A03;
                    if (ol02 != null) {
                        ol02.A03.A00();
                        ol02.A01(EnumC53100NeD.A03, null);
                        oMg = c55127Obo.A05;
                        if (oMg != null) {
                            str = "EFFECT_RENDER_FAILED";
                            oMg.A04(str, (short) 3);
                        }
                    } else {
                        C14360o3.A0F("fallbackLogic");
                        throw C00O.createAndThrow();
                    }
                }
            }
        }
    }

    public void A02() {
        this.A0C.A01 = null;
    }

    public final void A03() {
        String str;
        int i = this.A01;
        int i2 = this.A00;
        if (this.A03 != null && i == i2) {
            C55555Olp c55555Olp = this.A0C;
            JSONObject A02 = OXf.A02("complete");
            C55143Od2 c55143Od2 = c55555Olp.A00;
            if (c55143Od2 == null) {
                str = "provider";
            } else {
                c55143Od2.A0D.A02.A00(A02);
                Iterator it = this.A0E.iterator();
                while (it.hasNext()) {
                    C55127Obo c55127Obo = (C55127Obo) it.next();
                    str = "fallbackLogic";
                    c55127Obo.A0A = false;
                    C55127Obo.A01(c55127Obo);
                    OMg oMg = c55127Obo.A05;
                    if (oMg != null) {
                        oMg.A01("AVATAR_MEMORY_LOAD");
                    }
                    OMg oMg2 = c55127Obo.A05;
                    if (oMg2 != null) {
                        oMg2.A05((short) 2);
                    }
                    c55127Obo.A05 = null;
                    C54753OHi c54753OHi = c55127Obo.A02;
                    if (c54753OHi != null) {
                        c54753OHi.A00(C05F.A0Y, null);
                    }
                    OL0 ol0 = c55127Obo.A03;
                    if (ol0 != null) {
                        ol0.A03.A00();
                    }
                }
                A04();
                return;
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    }

    public final void A04() {
        synchronized (this.A0D) {
            this.A03 = null;
        }
    }

    public final void A06(String str, Map map) {
        boolean z;
        if (this instanceof C51495Mog) {
            C51495Mog c51495Mog = (C51495Mog) this;
            C14360o3.A0B(str, 0);
            InterfaceC58017Po2 interfaceC58017Po2 = (InterfaceC58017Po2) c51495Mog.A03.get();
            if (interfaceC58017Po2 != null) {
                C65075Td4 c65075Td4 = new C65075Td4(c51495Mog, 15);
                OBR obr = ((CdlProviderImpl) interfaceC58017Po2).A00;
                if (obr != null) {
                    C50269MHy c50269MHy = new C50269MHy(str, c65075Td4, 3);
                    LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                    obr.A00.generateBlendWeightsForConfig(map, liveEditingRawMemoryPointerHolder, new C55616Omz(liveEditingRawMemoryPointerHolder, c50269MHy));
                    return;
                }
                return;
            }
            return;
        }
        if (!(this instanceof C51497Moi)) {
            return;
        }
        C51497Moi c51497Moi = (C51497Moi) this;
        C14360o3.A0B(str, 0);
        if (c51497Moi.A04) {
            Map map2 = c51497Moi.A09;
            C51653Mrk c51653Mrk = c51497Moi.A00;
            if (c51653Mrk != null) {
                z = c51653Mrk.A0E;
            } else {
                z = false;
            }
            LinkedHashMap A04 = AbstractC06930Yk.A04(map2, OXf.A00(map, z));
            C14360o3.A0B(A04, 0);
            c51497Moi.A09 = A04;
            return;
        }
        if (C14360o3.A0K(c51497Moi.A03, map) || map.isEmpty()) {
            return;
        }
        c51497Moi.A03 = map;
        C54806OKa A0I = MSW.A0I(c51497Moi.A02);
        if (A0I == null) {
            return;
        }
        C54499O6b c54499O6b = A0I.A00;
        if (c54499O6b == null) {
            MSW.A1J();
            throw C00O.createAndThrow();
        }
        c54499O6b.A00.updateBlendWeights(str, map);
    }

    public final void A07(String str, Map map) {
        C54806OKa A0I;
        if (!(this instanceof C51495Mog) && (this instanceof C51497Moi)) {
            C51497Moi c51497Moi = (C51497Moi) this;
            C14360o3.A0B(str, 0);
            if (c51497Moi.A04) {
                LinkedHashMap A04 = AbstractC06930Yk.A04(c51497Moi.A09, map);
                C14360o3.A0B(A04, 0);
                c51497Moi.A09 = A04;
            } else {
                if (map.isEmpty() || (A0I = MSW.A0I(c51497Moi.A02)) == null) {
                    return;
                }
                C54499O6b c54499O6b = A0I.A00;
                if (c54499O6b == null) {
                    MSW.A1J();
                    throw C00O.createAndThrow();
                }
                c54499O6b.A00.updateAvatarBodyMorphs(str, map);
            }
        }
    }

    public final void A08(String str, Map map) {
        C54806OKa A0I;
        if (!(this instanceof C51495Mog) && (this instanceof C51497Moi)) {
            C51497Moi c51497Moi = (C51497Moi) this;
            C14360o3.A0B(str, 0);
            if (c51497Moi.A04) {
                LinkedHashMap A04 = AbstractC06930Yk.A04(c51497Moi.A0B, map);
                C14360o3.A0B(A04, 0);
                c51497Moi.A0B = A04;
            } else {
                if (map.isEmpty() || (A0I = MSW.A0I(c51497Moi.A02)) == null) {
                    return;
                }
                C54499O6b c54499O6b = A0I.A00;
                if (c54499O6b == null) {
                    MSW.A1J();
                    throw C00O.createAndThrow();
                }
                c54499O6b.A00.updateAvatarSkeleton(str, map);
            }
        }
    }

    public final void A09(String str, Map map, Float[] fArr) {
        if (this instanceof C51495Mog) {
            C51495Mog c51495Mog = (C51495Mog) this;
            C14360o3.A0B(str, 0);
            if (!C14360o3.A0K(((OMs) c51495Mog).A06, map)) {
                ((OMs) c51495Mog).A01 = (((OMs) c51495Mog).A01 | 2) ^ 2;
                ((OMs) c51495Mog).A04 = str;
                ((OMs) c51495Mog).A06 = map;
                c51495Mog.A01 = null;
                Iterator it = c51495Mog.A0E.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                InterfaceC58017Po2 interfaceC58017Po2 = (InterfaceC58017Po2) c51495Mog.A03.get();
                if (interfaceC58017Po2 != null) {
                    C50269MHy c50269MHy = new C50269MHy(str, c51495Mog, 4);
                    CdlProviderImpl cdlProviderImpl = (CdlProviderImpl) interfaceC58017Po2;
                    synchronized (cdlProviderImpl) {
                        cdlProviderImpl.A05.put(str, AbstractC25226BEj.A1L(new C57161PZf(fArr, map, cdlProviderImpl, c50269MHy, str, null, 1), cdlProviderImpl.A09));
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this instanceof C51497Moi) {
            C51497Moi c51497Moi = (C51497Moi) this;
            C14360o3.A0B(str, 0);
            if (c51497Moi.A04) {
                LinkedHashMap A04 = AbstractC06930Yk.A04(c51497Moi.A0A, map);
                C14360o3.A0B(A04, 0);
                c51497Moi.A0A = A04;
                return;
            }
            if (!C14360o3.A0K(((OMs) c51497Moi).A06, map) && !map.isEmpty()) {
                ((OMs) c51497Moi).A01 = (((OMs) c51497Moi).A01 | 2) ^ 2;
                Iterator it2 = c51497Moi.A0E.iterator();
                while (it2.hasNext()) {
                    it2.next();
                }
                ((OMs) c51497Moi).A03 = str;
                ((OMs) c51497Moi).A06 = map;
                C54806OKa c54806OKa = (C54806OKa) c51497Moi.A02.get();
                if (c54806OKa != null) {
                    C54499O6b c54499O6b = c54806OKa.A00;
                    if (c54499O6b == null) {
                        MSW.A1J();
                        throw C00O.createAndThrow();
                    }
                    c54499O6b.A00.requestAvatarUpdate(1, str, map, true);
                }
            }
        }
    }

    public final void A0A(Map map) {
        boolean z;
        if (this instanceof C51497Moi) {
            C51497Moi c51497Moi = (C51497Moi) this;
            Map map2 = ((OMs) c51497Moi).A08;
            if (map2 != null) {
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                Iterator A15 = AbstractC166997dE.A15(map2);
                while (A15.hasNext()) {
                    Map.Entry A1K = AbstractC166987dD.A1K(A15);
                    if (map.containsKey(A1K.getKey())) {
                        AbstractC31177DnL.A1S(A1K, A1I);
                    }
                }
                C51653Mrk c51653Mrk = c51497Moi.A00;
                if (c51653Mrk != null) {
                    z = c51653Mrk.A0E;
                } else {
                    z = false;
                }
                LinkedHashMap A04 = AbstractC06930Yk.A04(A1I, OXf.A00(map, z));
                C54806OKa c54806OKa = (C54806OKa) c51497Moi.A02.get();
                if (c54806OKa != null) {
                    String A00 = AbstractC53674NoP.A00();
                    boolean A1V = AbstractC167007dF.A1V(A04);
                    C54499O6b c54499O6b = c54806OKa.A00;
                    if (c54499O6b == null) {
                        MSW.A1J();
                    } else {
                        c54499O6b.A00.requestAvatarUpdate(A1V ? 1 : 0, A00, A04, A1V);
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if ((this.A01 & 4) != 0) {
            C55143Od2 c55143Od2 = this.A0C.A00;
            if (c55143Od2 == null) {
                C14360o3.A0F("provider");
            } else {
                c55143Od2.A0E.A00.updateSliderValues(map);
                return;
            }
        } else {
            this.A07 = map;
            return;
        }
        throw C00O.createAndThrow();
    }

    public final boolean A0B(MUW muw) {
        if (this instanceof C51495Mog) {
            C51495Mog c51495Mog = (C51495Mog) this;
            String str = muw.A02;
            String str2 = muw.A03;
            if (C14360o3.A0K(str2, ((OMs) c51495Mog).A05)) {
                return false;
            }
            ((OMs) c51495Mog).A05 = str2;
            ((OMs) c51495Mog).A03 = str;
            c51495Mog.A00 = null;
            boolean containsKey = muw.A05().containsKey("root");
            int i = 5;
            if (containsKey) {
                i = 7;
            }
            ((OMs) c51495Mog).A00 = i;
            ((OMs) c51495Mog).A01 &= 4;
            String str3 = ((OMs) c51495Mog).A03;
            if (str3 != null) {
                c51495Mog.A05(new C51491Moc(str3, false));
                InterfaceC58017Po2 interfaceC58017Po2 = (InterfaceC58017Po2) c51495Mog.A03.get();
                if (interfaceC58017Po2 != null) {
                    interfaceC58017Po2.AWn(Boolean.valueOf(containsKey), null, str, muw.A05(), new MC7((InterfaceC23621Ds) null, c51495Mog, muw, 7));
                }
                return true;
            }
            throw AbstractC166997dE.A0g();
        }
        if (this instanceof C51497Moi) {
            C51497Moi c51497Moi = (C51497Moi) this;
            String str4 = muw.A02;
            if (c51497Moi.A01 == null) {
                c51497Moi.A01 = muw;
            }
            ((OMs) c51497Moi).A05 = muw.A03;
            ((OMs) c51497Moi).A03 = str4;
            c51497Moi.A04 = true;
            if (str4 != null) {
                c51497Moi.A05(new C51491Moc(str4, true));
                int i2 = 5;
                if (muw.A05().containsKey("root")) {
                    i2 = 7;
                }
                ((OMs) c51497Moi).A00 = i2;
                ((OMs) c51497Moi).A01 &= 4;
                C54806OKa c54806OKa = (C54806OKa) c51497Moi.A02.get();
                if (c54806OKa == null) {
                    return true;
                }
                Map A05 = muw.A05();
                C54499O6b c54499O6b = c54806OKa.A00;
                if (c54499O6b == null) {
                    MSW.A1J();
                } else {
                    c54499O6b.A00.requestAvatarUpdate(0, str4, A05, true);
                    return true;
                }
            } else {
                throw AbstractC166997dE.A0g();
            }
        } else {
            C51496Moh c51496Moh = (C51496Moh) this;
            String str5 = muw.A02;
            if (c51496Moh.A01 == null) {
                c51496Moh.A01 = muw;
            }
            ((OMs) c51496Moh).A03 = str5;
            if (str5 != null) {
                c51496Moh.A05(new C51491Moc(str5, true));
                ((OMs) c51496Moh).A00 = 7;
                ((OMs) c51496Moh).A01 &= 4;
                WeakReference weakReference = c51496Moh.A02;
                C54806OKa A0I = MSW.A0I(weakReference);
                if (A0I != null) {
                    A0I.A00(c51496Moh);
                    C55555Olp c55555Olp = c51496Moh.A04;
                    C54499O6b c54499O6b2 = A0I.A00;
                    if (c54499O6b2 != null) {
                        LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder = new LiveEditingRawMemoryPointerHolder();
                        c54499O6b2.A00.getAlePointerHolder(liveEditingRawMemoryPointerHolder);
                        C55143Od2 c55143Od2 = c55555Olp.A00;
                        if (c55143Od2 == null) {
                            C14360o3.A0F("provider");
                        } else {
                            c55143Od2.A0E.A00.setAle(liveEditingRawMemoryPointerHolder);
                        }
                    }
                    MSW.A1J();
                }
                C54806OKa A0I2 = MSW.A0I(weakReference);
                if (A0I2 == null) {
                    return true;
                }
                Map A052 = muw.A05();
                C54499O6b c54499O6b3 = A0I2.A00;
                if (c54499O6b3 != null) {
                    c54499O6b3.A00.requestAvatarUpdate(0, str5, A052, false);
                    return true;
                }
                MSW.A1J();
            } else {
                throw AbstractC166997dE.A0g();
            }
        }
        throw C00O.createAndThrow();
    }

    public OMs(C55555Olp c55555Olp) {
        this.A0C = c55555Olp;
    }
}
