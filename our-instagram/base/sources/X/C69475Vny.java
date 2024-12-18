package X;

import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Vny, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69475Vny {
    public C51749MtY A00;
    public C69013Vfp A01;
    public OFS A02;
    public C41108IHz A03;
    public OAQ A04;
    public C69135ViQ A05;
    public OUJ A06;
    public LeadGenDisqualifyingScreenData A07;
    public LeadGenPrivacyPolicy A08;
    public String A09;
    public List A0A;
    public List A0B;
    public Map A0C;
    public java.util.Set A0D;
    public boolean A0E;
    public boolean A0F;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [X.Mvo] */
    /* JADX WARN: Type inference failed for: r2v81, types: [X.Mvo] */
    public C69475Vny(C39033HGj c39033HGj) {
        String str;
        C54644OBv c54644OBv;
        List list;
        List<C69444VnT> list2;
        Integer num;
        String str2;
        String str3;
        C68803VcK c68803VcK;
        String str4;
        String str5;
        C68801VcI c68801VcI;
        String str6;
        List list3;
        String str7;
        String str8;
        String str9;
        C68799VcG c68799VcG;
        C14360o3.A0B(c39033HGj, 1);
        this.A0C = new LinkedHashMap();
        String str10 = c39033HGj.A09;
        if (str10 != null) {
            this.A09 = str10;
        }
        C69434VnJ c69434VnJ = c39033HGj.A00;
        if (c69434VnJ != null) {
            C41105IHw c41105IHw = c69434VnJ.A00;
            if (c41105IHw != null) {
                this.A03 = new C41108IHz(c41105IHw);
            }
            C69357Vm3 c69357Vm3 = c69434VnJ.A01;
            if (c69357Vm3 != null) {
                C41011IEg c41011IEg = c39033HGj.A02;
                C68991VfT c68991VfT = c69357Vm3.A00;
                SimpleImageUrl simpleImageUrl = null;
                if (c68991VfT != null) {
                    String str11 = c68991VfT.A01;
                    C68800VcH c68800VcH = c68991VfT.A00;
                    if (c68800VcH != null && (c68799VcG = c68800VcH.A00) != null) {
                        str7 = c68799VcG.A00;
                    } else {
                        str7 = null;
                    }
                    if (str11 != null && str7 != null) {
                        if (c41011IEg != null) {
                            str8 = c41011IEg.A01;
                            ICF icf = c41011IEg.A00;
                            if (icf != null && (str9 = icf.A00) != null) {
                                simpleImageUrl = new SimpleImageUrl(str9);
                            }
                        } else {
                            str8 = null;
                        }
                        simpleImageUrl = new C51846Mvo(simpleImageUrl, new SimpleImageUrl(str7), str8, str11);
                    }
                }
                C62568SGt c62568SGt = c69357Vm3.A02;
                C51845Mvn c51845Mvn = null;
                if (c62568SGt != null) {
                    String str12 = c62568SGt.A02;
                    String str13 = c62568SGt.A01;
                    if (str12 != null && str13 != null) {
                        SCW scw = c62568SGt.A00;
                        c51845Mvn = new C51845Mvn(str12, str13, (scw == null || (list3 = scw.A00) == null) ? new ArrayList() : list3);
                    }
                }
                if (simpleImageUrl != null && c51845Mvn != null) {
                    List list4 = c69357Vm3.A05;
                    C14360o3.A07(list4);
                    C51844Mvm c51844Mvm = null;
                    if (AbstractC167007dF.A1O(list4.size())) {
                        C69121ViB c69121ViB = (C69121ViB) list4.get(0);
                        String str14 = c69121ViB.A02;
                        String str15 = c69121ViB.A00;
                        String str16 = c69121ViB.A01;
                        if (str14 != null && str15 != null && str16 != null) {
                            c51844Mvm = new C51844Mvm(str14, str15, str16);
                        }
                    }
                    C68993VfV c68993VfV = c69357Vm3.A01;
                    C51843Mvl c51843Mvl = null;
                    if (c68993VfV != null && (str6 = c68993VfV.A00) != null) {
                        ArrayList arrayList = new ArrayList();
                        for (C68992VfU c68992VfU : c68993VfV.A01) {
                            String str17 = c68992VfU.A01;
                            String str18 = c68992VfU.A00;
                            if (str17 != null && str18 != null) {
                                arrayList.add(new UQE(str17, str18, 3));
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            c51843Mvl = new C51843Mvl(arrayList, 0, str6);
                        }
                    }
                    C68994VfW c68994VfW = c69357Vm3.A03;
                    C51843Mvl c51843Mvl2 = null;
                    if (c68994VfW != null && (str4 = c68994VfW.A00) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (C69234Vk2 c69234Vk2 : c68994VfW.A01) {
                            String str19 = c69234Vk2.A02;
                            String str20 = c69234Vk2.A01;
                            C68802VcJ c68802VcJ = c69234Vk2.A00;
                            if (c68802VcJ != null && (c68801VcI = c68802VcJ.A00) != null) {
                                str5 = c68801VcI.A00;
                            } else {
                                str5 = null;
                            }
                            if (str19 != null && str20 != null && str5 != null) {
                                SimpleImageUrl simpleImageUrl2 = new SimpleImageUrl(str5);
                                List list5 = c69234Vk2.A03;
                                C14360o3.A07(list5);
                                arrayList2.add(new MUW(simpleImageUrl2, str19, str20, list5));
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            c51843Mvl2 = new C51843Mvl(arrayList2, 1, str4);
                        }
                    }
                    C68995VfX c68995VfX = c69357Vm3.A04;
                    C51843Mvl c51843Mvl3 = null;
                    if (c68995VfX != null && (str2 = c68995VfX.A00) != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (ViC viC : c68995VfX.A01) {
                            String str21 = viC.A02;
                            String str22 = viC.A01;
                            C68804VcL c68804VcL = viC.A00;
                            if (c68804VcL != null && (c68803VcK = c68804VcL.A00) != null) {
                                str3 = c68803VcK.A00;
                            } else {
                                str3 = null;
                            }
                            if (str21 != null && str22 != null && str3 != null) {
                                arrayList3.add(new MUD(str21, str22, new SimpleImageUrl(str3), 25));
                            }
                        }
                        if (!arrayList3.isEmpty()) {
                            c51843Mvl3 = new C51843Mvl(arrayList3, 2, str2);
                        }
                    }
                    this.A00 = new C51749MtY(c51843Mvl, c51843Mvl2, c51843Mvl3, (C51846Mvo) simpleImageUrl, c51844Mvm, c51845Mvn);
                }
            }
            C68999Vfb c68999Vfb = c69434VnJ.A03;
            if (c68999Vfb != null) {
                List list6 = c68999Vfb.A00;
                C14360o3.A07(list6);
                this.A0D = AbstractC001800i.A0k(list6);
                List<C69300Vl8> list7 = c68999Vfb.A01;
                ArrayList A10 = AbstractC31174DnI.A10(list7);
                for (C69300Vl8 c69300Vl8 : list7) {
                    String str23 = c69300Vl8.A01;
                    EnumC53284NhM enumC53284NhM = c69300Vl8.A00;
                    if (enumC53284NhM != null) {
                        int ordinal = enumC53284NhM.ordinal();
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        num = C05F.A0N;
                                    }
                                } else {
                                    num = C05F.A0C;
                                }
                            } else {
                                num = C05F.A01;
                            }
                        } else {
                            num = C05F.A00;
                        }
                        if (str23 != null && num != C05F.A0u) {
                            List list8 = c69300Vl8.A04;
                            C14360o3.A07(list8);
                            A10.add(new C51757Mtg(num, str23, list8, 19));
                        }
                    }
                    num = C05F.A0u;
                    if (str23 != null) {
                        List list82 = c69300Vl8.A04;
                        C14360o3.A07(list82);
                        A10.add(new C51757Mtg(num, str23, list82, 19));
                    }
                }
                this.A0A = A10;
            }
            this.A05 = new C69135ViQ(c39033HGj);
            C54644OBv c54644OBv2 = c69434VnJ.A02;
            if (c54644OBv2 != null) {
                this.A04 = new OAQ(c54644OBv2);
            }
            OD7 od7 = c69434VnJ.A04;
            if (od7 != null) {
                this.A06 = new OUJ(od7, c39033HGj.A08);
            }
            C69434VnJ c69434VnJ2 = c39033HGj.A00;
            if (c69434VnJ2 != null && (list2 = c69434VnJ2.A07) != null && (!list2.isEmpty())) {
                for (C69444VnT c69444VnT : list2) {
                    String str24 = c69444VnT.A0A;
                    if (str24 != null) {
                        if (str24.equals("LeadGenDisqualifyEndScreen")) {
                            this.A07 = new LeadGenDisqualifyingScreenData(c69444VnT.A03, c69444VnT.A02, c69444VnT.A04, c69444VnT.A05);
                        } else if (str24.equals("LeadGenThankYouPage")) {
                            String str25 = c39033HGj.A08;
                            String str26 = c69444VnT.A00;
                            String str27 = c69444VnT.A01;
                            String str28 = c69444VnT.A06;
                            String str29 = c69444VnT.A09;
                            String str30 = c69444VnT.A08;
                            String str31 = c69444VnT.A07;
                            if (str31 != null) {
                                this.A0C.put(str31, new OUJ(str26, str27, str28, str30, str29, str25));
                            }
                        }
                    }
                }
            }
            this.A0B = new ArrayList();
            List<C68997VfZ> list9 = c69434VnJ.A09;
            if (list9 != null) {
                for (C68997VfZ c68997VfZ : list9) {
                    String str32 = c68997VfZ.A00;
                    if (str32 != null && (list = this.A0B) != null) {
                        List list10 = c68997VfZ.A01;
                        C14360o3.A07(list10);
                        list.add(new C38687GzS(list10, 3, str32));
                    }
                }
            }
            String str33 = c39033HGj.A0A;
            String str34 = c39033HGj.A0B;
            String str35 = c39033HGj.A0F;
            C69434VnJ c69434VnJ3 = c39033HGj.A00;
            if (c69434VnJ3 != null && (c54644OBv = c69434VnJ3.A02) != null) {
                str = c54644OBv.A00;
            } else {
                str = c39033HGj.A0E;
            }
            this.A08 = new LeadGenPrivacyPolicy(str33, str34, str35, str, c69434VnJ3 != null ? c69434VnJ3.A05 : null);
            C41011IEg c41011IEg2 = c39033HGj.A02;
            if (c41011IEg2 != null) {
                this.A01 = new C69013Vfp(c41011IEg2);
            }
            OFR ofr = c39033HGj.A04;
            if (ofr != null) {
                this.A02 = new OFS(ofr);
            }
            ICE ice = c39033HGj.A01;
            if (ice != null) {
                this.A0F = ice.A00;
            }
            ICG icg = c39033HGj.A03;
            if (icg != null) {
                java.util.Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(icg.A00));
                this.A0E = unmodifiableSet.contains("review_screen");
                unmodifiableSet.contains("inline_context");
                return;
            }
        }
        C0w9.A03("LeadAdsDataManager error message", AnonymousClass001.A0R("No lead gen data for form id: ", c39033HGj.A09));
    }
}
