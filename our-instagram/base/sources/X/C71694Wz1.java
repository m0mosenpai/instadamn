package X;

import android.os.BaseBundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.BoostedPostAudienceOption;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.activity.PromoteActivity;
import com.instagram.business.promote.model.PromoteAudience;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteLaunchOrigin;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Wz1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71694Wz1 implements InterfaceC19960yQ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C71694Wz1(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A05 = str;
        this.A03 = obj4;
        this.A02 = obj;
        this.A01 = obj3;
        this.A04 = obj2;
    }

    @Override // X.InterfaceC19960yQ
    public final /* bridge */ /* synthetic */ Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        Fragment c67892V0z;
        BaseBundle baseBundle;
        String str;
        ImageUrl imageUrl;
        if (this.A00 != 0) {
            Map map = (Map) this.A03;
            map.put(this.A05, obj);
            C15100pQ c15100pQ = (C15100pQ) this.A02;
            int i = c15100pQ.A00 - 1;
            c15100pQ.A00 = i;
            if (i == 0) {
                PromoteActivity promoteActivity = (PromoteActivity) this.A04;
                List list = (List) this.A01;
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AbstractC65702TsY.A1T(it.next(), arrayList, map);
                }
                VG4 vg4 = VG4.A17;
                if (!promoteActivity.isDestroyed() && !promoteActivity.isFinishing()) {
                    AbstractC115105If abstractC115105If = null;
                    if (arrayList.size() == list.size()) {
                        C70399WUb A0N = AbstractC65702TsY.A0N(promoteActivity.A07);
                        PromoteData promoteData = promoteActivity.A00;
                        String str2 = "promoteData";
                        if (promoteData != null) {
                            String str3 = promoteData.A1K;
                            if (str3 != null) {
                                A0N.A01 = str3;
                            }
                            A0N.A0X(vg4.toString(), "initial_fetch", null);
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                C67837UzA c67837UzA = (C67837UzA) ((AbstractC115105If) it2.next()).A00();
                                if (c67837UzA != null && (c67837UzA.A01 == null || c67837UzA.A06)) {
                                    arrayList2.add(c67837UzA);
                                }
                            }
                            if (arrayList2.size() != list.size()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : arrayList) {
                                    if (!AbstractC001800i.A0u(arrayList2, ((AbstractC115105If) obj2).A00())) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                abstractC115105If = (AbstractC115105If) AbstractC001800i.A0J(arrayList3);
                            } else {
                                UserSession session = promoteActivity.getSession();
                                PromoteData promoteData2 = promoteActivity.A00;
                                if (promoteData2 != null) {
                                    PromoteState promoteState = promoteActivity.A01;
                                    if (promoteState != null) {
                                        C14360o3.A0B(session, 0);
                                        C67837UzA c67837UzA2 = (C67837UzA) AbstractC001800i.A0J(arrayList2);
                                        if (c67837UzA2 != null) {
                                            VRR.A00(promoteActivity, vg4, c67837UzA2, promoteData2, promoteState, session);
                                        }
                                        ArrayList A0q = AbstractC167017dG.A0q(arrayList2);
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            C69494VoH c69494VoH = ((C67837UzA) it3.next()).A03;
                                            if (c69494VoH == null || (imageUrl = c69494VoH.A0F) == null || (str = imageUrl.getUrl()) == null) {
                                                str = "";
                                            }
                                            A0q.add(str);
                                        }
                                        promoteData2.A1w = A0q;
                                        PromoteActivity.A03(promoteActivity);
                                        C70816WhZ.A01(C67908V1x.A00, VRD.A00(promoteActivity.getSession()), "fetch_init_promote_success");
                                        PromoteData promoteData3 = promoteActivity.A00;
                                        if (promoteData3 != null) {
                                            PromoteLaunchOrigin promoteLaunchOrigin = promoteData3.A0v;
                                            PromoteLaunchOrigin promoteLaunchOrigin2 = PromoteLaunchOrigin.A05;
                                            if (promoteLaunchOrigin == promoteLaunchOrigin2 && (baseBundle = (BaseBundle) promoteActivity.A06.getValue()) != null) {
                                                String string = baseBundle.getString("objective");
                                                int i2 = baseBundle.getInt("default_budget");
                                                int i3 = baseBundle.getInt("default_duration");
                                                PromoteData promoteData4 = promoteActivity.A00;
                                                if (promoteData4 != null) {
                                                    promoteData4.A0v = promoteLaunchOrigin2;
                                                    promoteData4.A0i = VPS.A00(string);
                                                    PromoteState promoteState2 = promoteActivity.A01;
                                                    if (promoteState2 != null) {
                                                        PromoteData promoteData5 = promoteActivity.A00;
                                                        if (promoteData5 != null) {
                                                            promoteState2.A09(promoteData5, BoostedPostAudienceOption.A0K.toString());
                                                            PromoteData promoteData6 = promoteActivity.A00;
                                                            if (promoteData6 != null) {
                                                                promoteData6.A22.put(promoteData6.A1Z, PromoteAudience.A0E);
                                                                PromoteData promoteData7 = promoteActivity.A00;
                                                                if (promoteData7 != null) {
                                                                    promoteData7.A08 = i2;
                                                                    promoteData7.A09 = i3;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (promoteActivity.A01 != null) {
                                                PromoteData promoteData8 = promoteActivity.A00;
                                                if (promoteData8 != null) {
                                                    if (!PromoteState.A02(promoteData8)) {
                                                        PromoteData promoteData9 = promoteActivity.A00;
                                                        if (promoteData9 != null) {
                                                            if (promoteData9.A0v != promoteLaunchOrigin2) {
                                                                if (promoteData9.A2i) {
                                                                    UserSession session2 = promoteActivity.getSession();
                                                                    C14360o3.A0B(session2, 0);
                                                                    if (C18U.A06(C06090Tz.A05, session2, 36321782508037960L)) {
                                                                        PromoteState promoteState3 = promoteActivity.A01;
                                                                        if (promoteState3 != null) {
                                                                            PromoteData promoteData10 = promoteActivity.A00;
                                                                            if (promoteData10 != null) {
                                                                                promoteState3.A04(XIGIGBoostDestination.A04, promoteData10);
                                                                                PromoteData promoteData11 = promoteActivity.A00;
                                                                                if (promoteData11 != null) {
                                                                                    promoteData11.A2n = true;
                                                                                    AbstractC65702TsY.A0q();
                                                                                    if (promoteActivity.A00 != null) {
                                                                                        c67892V0z = new V0X();
                                                                                        C140966Yy c140966Yy = new C140966Yy(promoteActivity, promoteActivity.getSession());
                                                                                        c140966Yy.A0D = false;
                                                                                        c140966Yy.A0B(null, c67892V0z);
                                                                                        c140966Yy.A04();
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                AbstractC65702TsY.A0q();
                                                                c67892V0z = new V10();
                                                                C140966Yy c140966Yy2 = new C140966Yy(promoteActivity, promoteActivity.getSession());
                                                                c140966Yy2.A0D = false;
                                                                c140966Yy2.A0B(null, c67892V0z);
                                                                c140966Yy2.A04();
                                                            }
                                                        }
                                                    }
                                                    PromoteData promoteData12 = promoteActivity.A00;
                                                    if (promoteData12 != null) {
                                                        boolean A01 = AbstractC69922Vxn.A01(promoteData12, promoteActivity.getSession());
                                                        C69798Vvi A02 = AbstractC155756z4.A00().A02();
                                                        if (A01) {
                                                            c67892V0z = A02.A02(VG4.A1E);
                                                        } else {
                                                            c67892V0z = new C67892V0z();
                                                        }
                                                        C140966Yy c140966Yy22 = new C140966Yy(promoteActivity, promoteActivity.getSession());
                                                        c140966Yy22.A0D = false;
                                                        c140966Yy22.A0B(null, c67892V0z);
                                                        c140966Yy22.A04();
                                                    }
                                                }
                                            }
                                            C14360o3.A0F("promoteState");
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                    str2 = "promoteState";
                                }
                            }
                        }
                        C14360o3.A0F(str2);
                        throw C00O.createAndThrow();
                    }
                    PromoteActivity.A07(promoteActivity, abstractC115105If);
                }
            }
        } else {
            C38321qM c38321qM = (C38321qM) obj;
            C1Y6.A02((C1Y6) this.A04, new C69667Vt8((FragmentActivity) this.A02, (InterfaceC11380iw) this.A01, (UserSession) this.A03, c38321qM, this.A05), c38321qM.A5b());
        }
        return C0eB.A00;
    }
}
