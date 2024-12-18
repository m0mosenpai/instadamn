package X;

import android.content.Context;
import android.widget.ListView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.systrace.Systrace;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.reels.question.model.QuestionResponseModel;
import com.instagram.reels.question.model.QuestionResponsesModel;
import com.instagram.ui.widget.refresh.RefreshableListView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.GsZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38290GsZ extends AbstractC154286wd {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public C38290GsZ(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    public static void A00(C1ON c1on, C154796xU c154796xU, Object obj, int i, boolean z) {
        c154796xU.A03(c1on, new C38290GsZ(i, obj, z));
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-878901559);
                HDF hdf = (HDF) this.A01;
                C9GR.A0F(hdf.getActivity(), "could_not_refresh_feed", 2131956848);
                HDF.A01(hdf);
                i = 1070734028;
                break;
            case 1:
                A03 = C0f9.A03(754515067);
                i = 872901879;
                break;
            case 2:
                A03 = C0f9.A03(-155516598);
                ((C39146HKz) this.A01).A03.Dfp();
                i = -1586019549;
                break;
            case 3:
                A03 = C0f9.A03(-2073013934);
                ((HL2) this.A01).A04.Dfp();
                i = 519319370;
                break;
            case 4:
                A03 = C0f9.A03(-2106083848);
                HDJ hdj = (HDJ) this.A01;
                C9GR.A0F(hdj.getActivity(), "photos_of_you_request_failed", 2131956848);
                C0fA.A00(hdj.A04, 459300816);
                HDJ.A01(hdj);
                i = -396639937;
                break;
            case 5:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1419821907);
                C42509Iro c42509Iro = ((J1G) this.A01).A01;
                C9GR.A0B(c42509Iro.A00, "CountdownList_something_went_wrong");
                c42509Iro.A05.notifyDataSetChanged();
                i = 392102893;
                break;
            case 6:
                A03 = C0f9.A03(-327986632);
                C41189ILc c41189ILc = ((J1J) this.A01).A02;
                C9GR.A01(c41189ILc.A00, "QuestionResponsesList_request_error", 2131972429, 1);
                c41189ILc.A01.notifyDataSetChanged();
                i = 1982850728;
                break;
            case 7:
                A03 = C0f9.A03(918334613);
                ((HL3) this.A01).A05.Dfp();
                i = -1579655749;
                break;
            case 8:
                A03 = C0f9.A03(1175495417);
                HDK hdk = (HDK) this.A01;
                hdk.A03.A0C();
                C9GR.A0F(hdk.getActivity(), AbstractC111324zv.A00(3037), 2131956848);
                HDK.A01(hdk);
                i = 639769374;
                break;
            case 9:
                A03 = C0f9.A03(-468791897);
                ((C39145HKy) this.A01).A01.Dfp();
                i = -149697636;
                break;
            default:
                A03 = C0f9.A03(1293221249);
                ((HL4) this.A01).A09.Dfp();
                i = -851263737;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1200408065);
                ListView A02 = AbstractC37300Gc1.A02((AbstractC05560Rg) this.A01);
                C14360o3.A0C(A02, MSV.A00(16));
                ((RefreshableListView) A02).setIsLoading(false);
                i = 653999406;
                break;
            case 1:
                A03 = C0f9.A03(-1831118102);
                i = -865677389;
                break;
            case 2:
                A03 = C0f9.A03(594726679);
                ((C39146HKz) this.A01).A03.Dfz();
                i = 898418392;
                break;
            case 3:
                A03 = C0f9.A03(-1488387897);
                ((HL2) this.A01).A04.Dfz();
                i = 1398415879;
                break;
            case 4:
                A03 = C0f9.A03(-385103344);
                i = -604328116;
                break;
            case 5:
                A03 = C0f9.A03(-1919662591);
                i = -77959372;
                break;
            case 6:
                A03 = C0f9.A03(379322196);
                i = 797773449;
                break;
            case 7:
                A03 = C0f9.A03(1405849013);
                ((HL3) this.A01).A05.Dfz();
                i = 1654247050;
                break;
            case 8:
                A03 = C0f9.A03(-601833383);
                i = 1150159136;
                break;
            case 9:
                A03 = C0f9.A03(372463294);
                ((C39145HKy) this.A01).A01.Dfz();
                i = -1046165819;
                break;
            default:
                A03 = C0f9.A03(-1482656774);
                ((HL4) this.A01).A09.Dfz();
                i = 583563978;
                break;
        }
        C0f9.A0A(i, A03);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onStart() {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-269361380);
                HDF hdf = (HDF) this.A01;
                if (hdf.A0W() != null) {
                    RefreshableListView refreshableListView = (RefreshableListView) hdf.A0W();
                    if (refreshableListView != null) {
                        refreshableListView.setIsLoading(true);
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(-1988894956, A03);
                        throw A0g;
                    }
                }
                HDF.A01(hdf);
                i = 1241400502;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(1204303428);
                i = 1643158368;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-51619391);
                ((C39146HKz) this.A01).A03.DgF();
                i = 1380198351;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A03 = C0f9.A03(-647609299);
                ((HL2) this.A01).A04.DgF();
                i = 1364494732;
                C0f9.A0A(i, A03);
                return;
            case 4:
                A03 = C0f9.A03(-183593084);
                i = -1845226810;
                C0f9.A0A(i, A03);
                return;
            case 5:
                A03 = C0f9.A03(-1420257367);
                i = -1569621781;
                C0f9.A0A(i, A03);
                return;
            case 6:
                A03 = C0f9.A03(348530029);
                ((J1J) this.A01).A02.A01.notifyDataSetChanged();
                i = -188832351;
                C0f9.A0A(i, A03);
                return;
            case 7:
                A03 = C0f9.A03(-1748952590);
                ((HL3) this.A01).A05.DgF();
                i = -1609178147;
                C0f9.A0A(i, A03);
                return;
            case 8:
                A03 = C0f9.A03(1822474842);
                i = 878891046;
                C0f9.A0A(i, A03);
                return;
            case 9:
                A03 = C0f9.A03(149908560);
                ((C39145HKy) this.A01).A01.DgF();
                i = 20981277;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(1056497015);
                ((HL4) this.A01).A09.DgF();
                i = 455064078;
                C0f9.A0A(i, A03);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        String str;
        int i;
        int A032;
        int i2;
        long j;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(386105368);
                C32206EDf c32206EDf = (C32206EDf) obj;
                int A0N = AbstractC167017dG.A0N(c32206EDf, -21828911);
                HDF hdf = (HDF) this.A01;
                HDF.A01(hdf);
                boolean z = this.A02;
                str = "adapter";
                if (z) {
                    HEN hen = hdf.A00;
                    if (hen != null) {
                        hen.A02.A04();
                        hen.A0C();
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                HEN hen2 = hdf.A00;
                if (hen2 != null) {
                    int A02 = hen2.A02.A02() * 3;
                    List list = c32206EDf.A01;
                    int size = list.size();
                    ArrayList A17 = AbstractC25225BEi.A17(size);
                    for (int i3 = 0; i3 < size; i3++) {
                        int i4 = A02 + i3;
                        int i5 = i4 / 3;
                        int i6 = i4 % 3;
                        A17.add(new C9BP(new C43121yf(C3ZH.A03(hdf.requireContext(), AbstractC166987dD.A0r(hdf.A07), AbstractC25225BEi.A0x(list, i3), C05F.A01, "archive_feed"), new C75Q(i5, i6)), i5, i6));
                    }
                    C42981yQ A00 = AbstractC42951yN.A00(AbstractC166987dD.A0r(hdf.A07));
                    if (z) {
                        A00.A06("archive_feed", A17);
                    } else {
                        A00.A05("archive_feed", A17);
                    }
                    HEN hen3 = hdf.A00;
                    if (hen3 != null) {
                        hen3.A02.A0B(c32206EDf.A01);
                        hen3.A0C();
                        C3CO c3co = hdf.A01;
                        if (c3co == null) {
                            str = "mediaUpdateListener";
                        } else {
                            c3co.A00();
                            C0f9.A0A(1109282465, A0N);
                            i = 870492549;
                            C0f9.A0A(i, A03);
                            return;
                        }
                    }
                }
                C14360o3.A0F(str);
                throw C00O.createAndThrow();
            case 1:
                A03 = C0f9.A03(-1212389932);
                C74293Vk c74293Vk = (C74293Vk) obj;
                int A0N2 = AbstractC167017dG.A0N(c74293Vk, 1654324891);
                C38333GtS c38333GtS = (C38333GtS) this.A01;
                List list2 = c74293Vk.A06;
                C14360o3.A07(list2);
                c38333GtS.A07(new L09(list2, this.A02));
                C0f9.A0A(-381060892, A0N2);
                i = 245104597;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = C0f9.A03(-588117708);
                C74293Vk c74293Vk2 = (C74293Vk) obj;
                int A0N3 = AbstractC167017dG.A0N(c74293Vk2, -1489958860);
                ((C39146HKz) this.A01).A03.DgU(null, null, c74293Vk2.A06, null, true, this.A02);
                C0f9.A0A(-1838289308, A0N3);
                i = -506954745;
                C0f9.A0A(i, A03);
                return;
            case 3:
                A032 = C0f9.A03(190118553);
                C74293Vk c74293Vk3 = (C74293Vk) obj;
                int A033 = C0f9.A03(2122443748);
                ArrayList A12 = AbstractC166997dE.A12(c74293Vk3, 0);
                Iterator it = c74293Vk3.A06.iterator();
                while (it.hasNext()) {
                    A12.add(it.next());
                }
                ((HL2) this.A01).A04.DgU(null, null, A12, null, false, this.A02);
                C0f9.A0A(-1789732332, A033);
                i2 = -1946205173;
                C0f9.A0A(i2, A032);
                return;
            case 4:
                A032 = C0f9.A03(1912141244);
                C74293Vk c74293Vk4 = (C74293Vk) obj;
                int A034 = C0f9.A03(1727950471);
                boolean z2 = this.A02;
                if (z2) {
                    HDJ hdj = (HDJ) this.A01;
                    hdj.EMT();
                    hdj.A0M.clear();
                    HEI hei = hdj.A04;
                    hei.A07.A04();
                    C0fA.A00(hei, -1812157705);
                }
                if (!c74293Vk4.A06.isEmpty()) {
                    List list3 = c74293Vk4.A06;
                    HDJ hdj2 = (HDJ) this.A01;
                    hdj2.A0M.addAll(list3);
                    ListIterator listIterator = list3.listIterator();
                    java.util.Set C2v = AbstractC166987dD.A0x(hdj2.A03).C2v("profile_pending_hide_or_remove_medias");
                    while (listIterator.hasNext()) {
                        Object next = listIterator.next();
                        next.getClass();
                        if (C2v.contains(AbstractC37300Gc1.A0V(next))) {
                            listIterator.remove();
                        }
                    }
                    HEI hei2 = hdj2.A04;
                    hei2.A07.A0B(list3);
                    C0fA.A00(hei2, 1777587124);
                    HEI hei3 = hdj2.A04;
                    hei3.A07.A01 = hdj2.A08.CLJ();
                    C0fA.A00(hei3, -527475741);
                    Context context = hdj2.getContext();
                    if (context != null) {
                        List list4 = c74293Vk4.A06;
                        ArrayList A1E = AbstractC166987dD.A1E();
                        for (int i7 = 0; i7 < list4.size(); i7++) {
                            C3ZM A035 = C3ZH.A03(context, hdj2.A03, AbstractC25225BEi.A0x(list4, i7), C05F.A01, "feed_photos_of_you");
                            C75Q c75q = new C75Q(i7 / 3, i7 % 3);
                            A1E.add(new C9BP(new C43121yf(A035, c75q), c75q.A01, c75q.A00));
                        }
                        C42981yQ A002 = AbstractC42951yN.A00(hdj2.A03);
                        if (z2) {
                            A002.A06("feed_photos_of_you", A1E);
                        } else {
                            A002.A05("feed_photos_of_you", A1E);
                        }
                    }
                }
                HDJ hdj3 = (HDJ) this.A01;
                HEI hei4 = hdj3.A04;
                hei4.A04 = true;
                HEI.A00(hei4);
                HDJ.A01(hdj3);
                hdj3.A00.A0T();
                C0f9.A0A(-1682914600, A034);
                i2 = -775002204;
                C0f9.A0A(i2, A032);
                return;
            case 5:
                A032 = C0f9.A03(-268164504);
                C214509eo c214509eo = (C214509eo) obj;
                int A0N4 = AbstractC167017dG.A0N(c214509eo, -2047149200);
                C42509Iro c42509Iro = ((J1G) this.A01).A01;
                boolean z3 = this.A02;
                C38368Gu4 c38368Gu4 = c42509Iro.A05;
                List A003 = c214509eo.A00();
                if (z3) {
                    c38368Gu4.A02.clear();
                }
                List list5 = c38368Gu4.A02;
                if (!list5.containsAll(A003)) {
                    list5.addAll(A003);
                    List list6 = c38368Gu4.A01;
                    list6.clear();
                    list6.addAll(c38368Gu4.A03);
                    list6.addAll(list5);
                    c38368Gu4.notifyDataSetChanged();
                }
                C0f9.A0A(-1919406810, A0N4);
                i2 = 1226305309;
                C0f9.A0A(i2, A032);
                return;
            case 6:
                A032 = C0f9.A03(-215485753);
                int A036 = C0f9.A03(1770224718);
                J1J j1j = (J1J) this.A01;
                C41189ILc c41189ILc = j1j.A02;
                C38592Gxv c38592Gxv = ((C73449YDs) obj).A00.A00;
                if (c38592Gxv == null) {
                    str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
                QuestionResponsesModel questionResponsesModel = c38592Gxv.A00;
                C1DS.A00(j1j.A00);
                boolean z4 = this.A02;
                C38370Gu6 c38370Gu6 = c41189ILc.A01;
                if (z4) {
                    c38370Gu6.A01.clear();
                }
                Iterator it2 = questionResponsesModel.A0A.iterator();
                while (it2.hasNext()) {
                    c38370Gu6.A01.add(new C41628IbJ((QuestionResponseModel) it2.next(), questionResponsesModel));
                }
                C38370Gu6.A00(c38370Gu6);
                C0f9.A0A(1519744965, A036);
                i2 = 1646867753;
                C0f9.A0A(i2, A032);
                return;
            case 7:
                A032 = C0f9.A03(-1360709050);
                C33136Ejf c33136Ejf = (C33136Ejf) obj;
                int A037 = C0f9.A03(838483460);
                HL3 hl3 = (HL3) this.A01;
                C42345Ip7 A004 = FXK.A00(hl3.A04);
                boolean z5 = this.A02;
                C14360o3.A0B(c33136Ejf, 0);
                if (z5) {
                    A004.A00 = true;
                    A004.A01.clear();
                }
                A004.A01.add(c33136Ejf);
                ArrayList A1E2 = AbstractC166987dD.A1E();
                Iterator it3 = c33136Ejf.A01.iterator();
                while (it3.hasNext()) {
                    A1E2.add(((C40958ICf) it3.next()).A00);
                }
                hl3.A05.DgU(null, null, A1E2, null, false, z5);
                C0f9.A0A(-64121543, A037);
                i2 = -1679703952;
                C0f9.A0A(i2, A032);
                return;
            case 8:
                A032 = C0f9.A03(-1352780412);
                C33136Ejf c33136Ejf2 = (C33136Ejf) obj;
                int A038 = C0f9.A03(2031735373);
                boolean z6 = this.A02;
                if (z6) {
                    HEJ hej = ((HDK) this.A01).A03;
                    hej.A00.A04();
                    hej.A0C();
                }
                ArrayList A1E3 = AbstractC166987dD.A1E();
                Iterator it4 = c33136Ejf2.A01.iterator();
                while (it4.hasNext()) {
                    A1E3.add(((C40958ICf) it4.next()).A00);
                }
                HDK hdk = (HDK) this.A01;
                HEJ hej2 = hdk.A03;
                C155946zO c155946zO = hej2.A00;
                c155946zO.A0B(A1E3);
                c155946zO.A01 = hej2.A04.CLJ();
                hej2.A0C();
                C155936zN c155936zN = hdk.A02;
                if (z6) {
                    AbstractC97064Xr.A00(c155936zN.A00, c155936zN.A02, true);
                }
                int size2 = A1E3.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    C38321qM c38321qM = (C38321qM) A1E3.get(i8);
                    if (c38321qM.A55()) {
                        c38321qM.Cff();
                        try {
                            j = 1;
                            if (Systrace.A0E(1L)) {
                                C0fO.A01("preloadResources", 1877607526);
                            }
                            ImageUrl A1S = c38321qM.A1S();
                            if (A1S != null) {
                                C1OG A0J = C25821No.A00().A0J(A1S, c155936zN.A01.getModuleName());
                                A0J.A0I = true;
                                c155936zN.A03.add(new J61(i8, new J33(A0J.A00())));
                            }
                            c38321qM.A0p();
                            c38321qM.Cff();
                            if (Systrace.A0E(1L)) {
                                C0fO.A00(357032026);
                            }
                        } catch (Throwable th) {
                            if (Systrace.A0E(j)) {
                                C0fO.A00(40312831);
                            }
                            throw th;
                        }
                    }
                }
                List list7 = c155936zN.A03;
                C01T.A1C(list7);
                Iterator it5 = list7.iterator();
                while (it5.hasNext()) {
                    ((J61) it5.next()).run();
                }
                list7.clear();
                HDK.A01(hdk);
                C0f9.A0A(101566995, A038);
                i2 = -1807333813;
                C0f9.A0A(i2, A032);
                return;
            case 9:
                A03 = C0f9.A03(-844371255);
                HB4 hb4 = (HB4) obj;
                int A039 = C0f9.A03(347525566);
                C14360o3.A0B(hb4, 0);
                ((C39145HKy) this.A01).A01.DgU(null, null, hb4.A04, null, false, this.A02);
                C0f9.A0A(331038655, A039);
                i = -1521780878;
                C0f9.A0A(i, A03);
                return;
            default:
                A032 = C0f9.A03(909001502);
                C74293Vk c74293Vk5 = (C74293Vk) obj;
                int A0N5 = AbstractC167017dG.A0N(c74293Vk5, 1521860451);
                HL4 hl4 = (HL4) this.A01;
                boolean A1Z = AbstractC167007dF.A1Z(hl4.A0C);
                C3XH c3xh = C3XG.A0A;
                List list8 = c74293Vk5.A06;
                C14360o3.A07(list8);
                ArrayList A0U = AbstractC001800i.A0U(c3xh.A06(list8));
                if (A1Z) {
                    LinkedHashSet A0l = AbstractC31171DnF.A0l();
                    Iterator it6 = A0U.iterator();
                    while (it6.hasNext()) {
                        Object next2 = it6.next();
                        if (hl4.A09.BRa(next2).A2l) {
                            A0l.add(next2);
                        }
                    }
                    A0U.removeAll(A0l);
                } else {
                    String str2 = hl4.A02;
                    if (str2 != null) {
                        Iterator it7 = A0U.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                C3XG A0D = AbstractC37300Gc1.A0D(it7);
                                C38321qM A0E = AbstractC37300Gc1.A0E(A0D);
                                if (A0E != null && str2.equals(A0E.A2u())) {
                                    A0U.remove(A0D);
                                }
                            }
                        }
                        hl4.A02 = null;
                    }
                }
                if (A0U.isEmpty()) {
                    HL4.A02(hl4, true);
                }
                hl4.A09.DgU(null, null, A0U, null, true, this.A02);
                C0f9.A0A(2089061744, A0N5);
                i2 = -662319102;
                C0f9.A0A(i2, A032);
                return;
        }
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(1777990462);
                C0f9.A0A(-379587259, C0f9.A03(839806501));
                i = -339049548;
                break;
            case 1:
                A03 = C0f9.A03(-1087617517);
                C0f9.A0A(698411925, C0f9.A03(-46817429));
                i = 2088815876;
                break;
            case 2:
                A03 = C0f9.A03(1793237801);
                C0f9.A0A(1236596851, C0f9.A03(-1639960225));
                i = -1003843055;
                break;
            case 3:
                A03 = C0f9.A03(366464733);
                C0f9.A0A(-1332114010, C0f9.A03(203012159));
                i = -353235080;
                break;
            case 4:
                A03 = C0f9.A03(-1030836325);
                C39139HKs c39139HKs = (C39139HKs) obj;
                int A032 = C0f9.A03(-1663744182);
                Boolean bool = c39139HKs.A00;
                if (bool != null && bool.booleanValue()) {
                    HDJ hdj = (HDJ) this.A01;
                    User A10 = AbstractC166987dD.A10(hdj.A03);
                    if (A10.getId().equals(hdj.A0C)) {
                        A10.A03.Ege(c39139HKs.A00);
                        AnonymousClass189.A00(hdj.A03).A03(A10);
                    }
                }
                C0f9.A0A(1769677403, A032);
                i = 1376617918;
                break;
            case 5:
                A03 = C0f9.A03(354784983);
                C0f9.A0A(-658335366, C0f9.A03(1487291529));
                i = -2068918739;
                break;
            case 6:
                A03 = C0f9.A03(139086560);
                C0f9.A0A(-438768884, C0f9.A03(-739980537));
                i = -1066411020;
                break;
            case 7:
                A03 = C0f9.A03(1914949086);
                C0f9.A0A(-253606309, C0f9.A03(-2056300544));
                i = 1085935458;
                break;
            case 8:
                A03 = C0f9.A03(-1351036869);
                C0f9.A0A(-564443904, C0f9.A03(808448102));
                i = -1444987212;
                break;
            case 9:
                A03 = C0f9.A03(563371906);
                C0f9.A0A(-144563648, C0f9.A03(1780092356));
                i = 902203471;
                break;
            default:
                A03 = C0f9.A03(-56978028);
                C0f9.A0A(-2135307495, C0f9.A03(-511263398));
                i = 1015351690;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
