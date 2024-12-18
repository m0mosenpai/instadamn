package X;

import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.business.promote.model.AudiencePotentialReachRating;
import com.instagram.business.promote.model.PromoteAudienceInfo;
import com.instagram.business.promote.model.PromoteAudiencePotentialReach;
import com.instagram.business.promote.model.PromoteAudiencePotentialReachStore;
import com.instagram.business.promote.model.PromoteData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes11.dex */
public final class V25 extends AbstractC67958V3x {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public V25(C70399WUb c70399WUb, WDA wda, PromoteAudienceInfo promoteAudienceInfo) {
        this.A00 = 1;
        this.A02 = wda;
        this.A01 = promoteAudienceInfo;
        super.A02 = "";
        super.A01 = AbstractC31173DnH.A0g();
        super.A00 = c70399WUb;
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1485735114);
                ((W6E) this.A01).A02.A0M((VG4) this.A02, "business_integrity_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = 897885168;
                break;
            case 1:
                A03 = C0f9.A03(758224553);
                C14360o3.A0B(abstractC115105If, 0);
                WDA wda = (WDA) this.A02;
                C70399WUb.A00(wda.A08.A0y).A0M(wda.A05, "potential_people_reach_fetch", abstractC115105If.A01());
                WDA.A00(wda, 0, 0, false);
                WDA.A01(wda, AudiencePotentialReachRating.A06);
                super.onFail(abstractC115105If);
                i = -211449916;
                break;
            case 2:
                A03 = C0f9.A03(-2061479898);
                C14360o3.A0B(abstractC115105If, 0);
                C69655Vsw c69655Vsw = (C69655Vsw) this.A02;
                c69655Vsw.A03.A0Z(VG4.A0B.toString(), "delete_audience", abstractC115105If.A01());
                ((View) this.A01).setEnabled(true);
                C9GR.A01(c69655Vsw.A02, "boost_audience_delete_failure", 2131970365, 0);
                super.onFail(abstractC115105If);
                i = -1214695969;
                break;
            case 3:
                A03 = AbstractC167017dG.A0N(abstractC115105If, 1422050776);
                V0P v0p = (V0P) this.A02;
                C70399WUb c70399WUb = v0p.A04;
                if (c70399WUb != null) {
                    c70399WUb.A0M(VG4.A0r, "interest_search_fetch", abstractC115105If.A01());
                }
                List emptyList = Collections.emptyList();
                C14360o3.A07(emptyList);
                V0P.A02(v0p, emptyList);
                super.onFail(abstractC115105If);
                i = -1466203772;
                break;
            case 4:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -2003177858);
                V0O v0o = (V0O) this.A02;
                AbstractC65702TsY.A0N(v0o.A0D).A0M(VG4.A0r, "interest_search_fetch", abstractC115105If.A01());
                List emptyList2 = Collections.emptyList();
                C14360o3.A07(emptyList2);
                V0O.A02(v0o, emptyList2);
                super.onFail(abstractC115105If);
                i = 218278905;
                break;
            case 5:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -494957776);
                AbstractC65702TsY.A0N(((C67875V0g) this.A02).A0D).A0M(VG4.A0z, "regional_search_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = 611508436;
                break;
            case 6:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1256518486);
                AbstractC65702TsY.A0N(((V04) this.A02).A09).A0M(VG4.A0z, "regional_search_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = -275626144;
                break;
            default:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1447908370);
                C70399WUb c70399WUb2 = ((V0H) this.A02).A02;
                if (c70399WUb2 == null) {
                    C14360o3.A0F("logger");
                    throw C00O.createAndThrow();
                }
                c70399WUb2.A0M(VG4.A0z, "local_search_fetch", abstractC115105If.A01());
                super.onFail(abstractC115105If);
                i = -1055637819;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AbstractC67958V3x, X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1322569685);
                super.onStart();
                i = 1177441897;
                break;
            case 1:
                A03 = C0f9.A03(1015489831);
                super.onStart();
                WDA wda = (WDA) this.A02;
                WDA.A01(wda, null);
                wda.A03.setVisibility(8);
                wda.A02.setVisibility(8);
                wda.A01.setVisibility(0);
                i = -1977368993;
                break;
            default:
                super.onStart();
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        ImmutableList copyOf;
        ImmutableList copyOf2;
        ImmutableList copyOf3;
        ImmutableList copyOf4;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(579143982);
                C67825Uyy c67825Uyy = (C67825Uyy) obj;
                int A032 = C0f9.A03(-884674309);
                W6E w6e = (W6E) this.A01;
                w6e.A02.A0E((VG4) this.A02, "business_integrity_fetch");
                if (!c67825Uyy.A01) {
                    w6e.A03.A0u.A00 = c67825Uyy.A00;
                }
                A01(c67825Uyy);
                C0f9.A0A(-377000915, A032);
                i = 1132388616;
                break;
            case 1:
                A03 = C0f9.A03(1016510474);
                PromoteAudiencePotentialReach promoteAudiencePotentialReach = (PromoteAudiencePotentialReach) obj;
                int A0N = AbstractC167017dG.A0N(promoteAudiencePotentialReach, -269934788);
                WDA wda = (WDA) this.A02;
                C70399WUb.A00(wda.A08.A0y).A0E(wda.A05, "potential_people_reach_fetch");
                PromoteAudiencePotentialReachStore promoteAudiencePotentialReachStore = wda.A07;
                Object obj2 = this.A01;
                if (promoteAudiencePotentialReach.A03 != AudiencePotentialReachRating.A06) {
                    promoteAudiencePotentialReachStore.A00.put(obj2, promoteAudiencePotentialReach);
                }
                WDA.A00(wda, promoteAudiencePotentialReach.A01, promoteAudiencePotentialReach.A02, WGs.A0R(promoteAudiencePotentialReach));
                WDA.A01(wda, promoteAudiencePotentialReach.A03);
                A01(promoteAudiencePotentialReach);
                C0f9.A0A(2082821401, A0N);
                i = -1668847063;
                break;
            case 2:
                A03 = C0f9.A03(1893356326);
                InterfaceC40821up interfaceC40821up = (C40781ul) obj;
                int A033 = C0f9.A03(-1583131557);
                C14360o3.A0B(interfaceC40821up, 0);
                C69655Vsw c69655Vsw = (C69655Vsw) this.A02;
                c69655Vsw.A03.A0S(VG4.A0B.toString(), "delete_audience");
                c69655Vsw.A06.A0C(false);
                A01(interfaceC40821up);
                C0f9.A0A(-2032611082, A033);
                i = 423277567;
                break;
            case 3:
                A03 = C0f9.A03(-2017293213);
                C67808Uyh c67808Uyh = (C67808Uyh) obj;
                int A0N2 = AbstractC167017dG.A0N(c67808Uyh, 311829381);
                V0P v0p = (V0P) this.A02;
                C70399WUb c70399WUb = v0p.A04;
                if (c70399WUb != null) {
                    c70399WUb.A0E(VG4.A0r, "interest_search_fetch");
                }
                C69678VtN c69678VtN = v0p.A0G;
                String obj3 = this.A01.toString();
                List list = c67808Uyh.A00;
                if (list == null) {
                    copyOf = ImmutableList.of();
                } else {
                    copyOf = ImmutableList.copyOf((Collection) list);
                }
                C14360o3.A07(copyOf);
                c69678VtN.A01(obj3, copyOf);
                List list2 = c67808Uyh.A00;
                if (list2 == null) {
                    copyOf2 = ImmutableList.of();
                } else {
                    copyOf2 = ImmutableList.copyOf((Collection) list2);
                }
                C14360o3.A07(copyOf2);
                V0P.A02(v0p, copyOf2);
                A01(c67808Uyh);
                C0f9.A0A(-2001088573, A0N2);
                i = -1311229037;
                break;
            case 4:
                A03 = C0f9.A03(1853875975);
                C67808Uyh c67808Uyh2 = (C67808Uyh) obj;
                int A0N3 = AbstractC167017dG.A0N(c67808Uyh2, -896953720);
                V0O v0o = (V0O) this.A02;
                AbstractC65702TsY.A0N(v0o.A0D).A0E(VG4.A0r, "interest_search_fetch");
                C69678VtN c69678VtN2 = v0o.A0C;
                String obj4 = this.A01.toString();
                List list3 = c67808Uyh2.A00;
                if (list3 == null) {
                    copyOf3 = ImmutableList.of();
                } else {
                    copyOf3 = ImmutableList.copyOf((Collection) list3);
                }
                C14360o3.A07(copyOf3);
                c69678VtN2.A01(obj4, copyOf3);
                List list4 = c67808Uyh2.A00;
                if (list4 == null) {
                    copyOf4 = ImmutableList.of();
                } else {
                    copyOf4 = ImmutableList.copyOf((Collection) list4);
                }
                C14360o3.A07(copyOf4);
                V0O.A02(v0o, copyOf4);
                A01(c67808Uyh2);
                C0f9.A0A(-29439803, A0N3);
                i = -1255132596;
                break;
            case 5:
                A03 = C0f9.A03(-315048260);
                C67809Uyi c67809Uyi = (C67809Uyi) obj;
                int A0N4 = AbstractC167017dG.A0N(c67809Uyi, -1643293809);
                C67875V0g c67875V0g = (C67875V0g) this.A02;
                AbstractC65702TsY.A0N(c67875V0g.A0D).A0E(VG4.A0z, "regional_search_fetch");
                List list5 = c67809Uyi.A00;
                if (list5 == null) {
                    list5 = new ArrayList();
                }
                c67875V0g.A0B.A01(this.A01.toString(), new ArrayList(list5));
                list5.removeAll(((PromoteData) AbstractC166987dD.A17(c67875V0g.A0E)).A0o.A05);
                C67875V0g.A01(c67875V0g, list5);
                A01(c67809Uyi);
                C0f9.A0A(-28054191, A0N4);
                i = -534702036;
                break;
            case 6:
                A03 = C0f9.A03(637557268);
                C67809Uyi c67809Uyi2 = (C67809Uyi) obj;
                int A0N5 = AbstractC167017dG.A0N(c67809Uyi2, 2124496716);
                V04 v04 = (V04) this.A02;
                AbstractC65702TsY.A0N(v04.A09).A0E(VG4.A0z, "regional_search_fetch");
                List list6 = c67809Uyi2.A00;
                if (list6 == null) {
                    list6 = new ArrayList();
                }
                v04.A07.A01(this.A01.toString(), new ArrayList(list6));
                list6.removeAll(((UFT) v04.A0B.getValue()).A06().A05);
                V04.A00(v04, list6);
                A01(c67809Uyi2);
                C0f9.A0A(-31220911, A0N5);
                i = -1629197287;
                break;
            default:
                A03 = C0f9.A03(1151977587);
                C67809Uyi c67809Uyi3 = (C67809Uyi) obj;
                int A034 = C0f9.A03(-2020002468);
                C14360o3.A0B(c67809Uyi3, 0);
                V0H v0h = (V0H) this.A02;
                C70399WUb c70399WUb2 = v0h.A02;
                if (c70399WUb2 == null) {
                    str = "logger";
                } else {
                    c70399WUb2.A0E(VG4.A0z, "local_search_fetch");
                    List list7 = c67809Uyi3.A00;
                    if (list7 == null) {
                        list7 = new ArrayList();
                    }
                    v0h.A08.A01(this.A01.toString(), list7);
                    UGa uGa = v0h.A04;
                    if (uGa == null) {
                        str = "addressTypeaheadAdapter";
                    } else {
                        C14360o3.A0B(list7, 0);
                        uGa.A00 = list7;
                        uGa.notifyDataSetChanged();
                        A01(c67809Uyi3);
                        C0f9.A0A(1188901038, A034);
                        i = 82635802;
                        break;
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V25(C70399WUb c70399WUb, Object obj, Object obj2, String str, int i) {
        super(c70399WUb, str);
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }
}
