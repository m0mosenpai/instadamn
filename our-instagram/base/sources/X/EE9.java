package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes6.dex */
public final class EE9 extends AnonymousClass935 {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EE9(UserSession userSession, Object obj, int i) {
        super(userSession);
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C1ON c1on, UserSession userSession, Object obj, int i) {
        c1on.A00 = new EE9(userSession, obj, i);
        C1GJ.A03(c1on);
    }

    @Override // X.AnonymousClass935
    public final void A04(AbstractC115105If abstractC115105If, UserSession userSession) {
        int A03;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1373279597);
                AbstractC167017dG.A1N(userSession, abstractC115105If);
                super.A04(abstractC115105If, userSession);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i = -1003363423;
                break;
            case 1:
                A03 = C0f9.A03(1506413376);
                AbstractC167017dG.A1N(userSession, abstractC115105If);
                super.A04(abstractC115105If, userSession);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i = -359982297;
                break;
            case 2:
                A03 = C0f9.A03(-1595446302);
                AbstractC167017dG.A1N(userSession, abstractC115105If);
                super.A04(abstractC115105If, userSession);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i = 1737077392;
                break;
            case 3:
                A03 = C0f9.A03(1807463604);
                AbstractC167017dG.A1N(userSession, abstractC115105If);
                super.A04(abstractC115105If, userSession);
                ((C1P1) this.A01).onFail(abstractC115105If);
                i = -1375312045;
                break;
            case 4:
                A03 = C0f9.A03(-742604517);
                ((InterfaceC37153GYq) this.A01).D8O(abstractC115105If.A01());
                i = 841059170;
                break;
            case 5:
                A03 = C0f9.A03(-1174998731);
                C32326ELu c32326ELu = (C32326ELu) this.A01;
                AbstractC31557Dth.A00(c32326ELu.mView, false);
                Context context = c32326ELu.A00;
                UserSession userSession2 = c32326ELu.A04;
                C06090Tz c06090Tz = C06090Tz.A05;
                int i2 = 2131959362;
                if (AbstractC31178DnM.A1W(c06090Tz, userSession2)) {
                    i2 = 2131959361;
                }
                if (AbstractC31178DnM.A1W(c06090Tz, c32326ELu.A04)) {
                    str = "direct_expiring_media_create_group_chat_failed";
                } else {
                    str = "direct_expiring_media_create_group_failed";
                }
                C9GR.A01(context, str, i2, 1);
                C32326ELu.A00(c32326ELu);
                C162337Ov.A08(c32326ELu.A02, c32326ELu, c32326ELu.A04);
                i = -1186786306;
                break;
            case 6:
            default:
                super.A04(abstractC115105If, userSession);
                return;
            case 7:
                A03 = C0f9.A03(-289920674);
                EM4 em4 = (EM4) this.A01;
                AbstractC31557Dth.A00(em4.mView, false);
                C9GR.A01(em4.getContext(), "direct_expiring_media_create_group_failed", 2131959362, 1);
                EM4.A02(em4);
                C162337Ov.A08(em4.A00, em4, em4.A01);
                i = 849550635;
                break;
            case 8:
                A03 = AbstractC25231BEo.A0G(abstractC115105If, -4685258);
                ((GZ1) this.A01).onFail(abstractC115105If);
                i = 2106189615;
                break;
            case 9:
                A03 = C0f9.A03(135356795);
                FHT fht = (FHT) this.A01;
                if (fht != null) {
                    fht.A00.DFf();
                }
                i = 2074151113;
                break;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A05(UserSession userSession, Object obj) {
        int A03;
        int i;
        boolean z;
        String str;
        boolean z2;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(15179063);
                int A032 = C0f9.A03(-1489206496);
                AbstractC167017dG.A1N(userSession, obj);
                super.A05(userSession, obj);
                AbstractC31171DnF.A1R(this.A01, obj);
                C0f9.A0A(546038165, A032);
                i = -519689730;
                break;
            case 1:
                A03 = C0f9.A03(-1356724220);
                int A033 = C0f9.A03(1827114313);
                AbstractC167017dG.A1N(userSession, obj);
                super.A05(userSession, obj);
                AbstractC31171DnF.A1R(this.A01, obj);
                C0f9.A0A(304731674, A033);
                i = 1924465549;
                break;
            case 2:
                A03 = C0f9.A03(444850588);
                int A034 = C0f9.A03(1354077165);
                AbstractC167017dG.A1N(userSession, obj);
                super.A05(userSession, obj);
                AbstractC31171DnF.A1R(this.A01, obj);
                C0f9.A0A(-751886126, A034);
                i = -425604895;
                break;
            case 3:
                A03 = C0f9.A03(2038219066);
                int A035 = C0f9.A03(-489153996);
                AbstractC167017dG.A1N(userSession, obj);
                super.A05(userSession, obj);
                AbstractC31171DnF.A1R(this.A01, obj);
                C0f9.A0A(-1795067474, A035);
                i = 559802536;
                break;
            case 4:
                A03 = C0f9.A03(1316867911);
                int A036 = C0f9.A03(-846240298);
                ((InterfaceC37153GYq) this.A01).D8P(((C126455ng) obj).A1E);
                C0f9.A0A(2107795316, A036);
                i = 470754505;
                break;
            case 5:
                A03 = C0f9.A03(-890971719);
                C43707JUs c43707JUs = (C43707JUs) obj;
                int A037 = C0f9.A03(-736659715);
                C83403nh c83403nh = c43707JUs.A00;
                if (c83403nh == null || (c83403nh.A10 == C2EY.A0G && !c43707JUs.CLR())) {
                    z = true;
                } else {
                    z = false;
                }
                C32326ELu c32326ELu = (C32326ELu) this.A01;
                String str3 = c43707JUs.A1E;
                String str4 = c43707JUs.A1L;
                boolean z3 = c43707JUs.A1e;
                UserSession userSession2 = c32326ELu.A04;
                String str5 = c32326ELu.A09;
                String str6 = c32326ELu.A0A;
                EnumC33498ErX enumC33498ErX = c32326ELu.A02;
                if (z) {
                    str = "new";
                } else {
                    str = "existing";
                }
                C162337Ov.A09(enumC33498ErX, c32326ELu, userSession2, str5, str6, str3, str);
                if (c32326ELu.getActivity() != null) {
                    DirectShareTarget directShareTarget = new DirectShareTarget(AbstractC31171DnF.A0N(str3), str4, AbstractC35052FcP.A01(c32326ELu.A0B), z3);
                    AbstractC13670mt.A0B(AbstractC167007dF.A0g(c32326ELu.A01));
                    Intent putExtra = AbstractC31171DnF.A04().putExtra("bundle_extra_share_target", directShareTarget);
                    putExtra.putExtra("bundle_query_session_id", c32326ELu.A07.A0B);
                    if (AbstractC31178DnM.A1X(C06090Tz.A05, c32326ELu.A04, 36330187759174378L)) {
                        FZY fzy = FZY.A00;
                        try {
                            StringWriter stringWriter = new StringWriter();
                            C17z A0A = AbstractC221915u.A00.A0A(stringWriter);
                            C7NS.A00(A0A, directShareTarget);
                            A0A.close();
                            String obj2 = stringWriter.toString();
                            long currentTimeMillis = System.currentTimeMillis();
                            UserSession userSession3 = c32326ELu.A04;
                            AbstractC167017dG.A1O(obj2, userSession3);
                            C1AU A01 = C1AT.A01(userSession3);
                            C1AV c1av = C1AV.A2L;
                            Class<?> cls = fzy.getClass();
                            InterfaceC19630xq A04 = A01.A04(c1av, cls);
                            InterfaceC19610xo ARD = C1AT.A01(userSession3).A04(c1av, cls).ARD();
                            ARD.AHW();
                            ARD.apply();
                            InterfaceC19610xo ARD2 = A04.ARD();
                            ARD2.E7K("direct share target", obj2);
                            ARD2.apply();
                            InterfaceC19610xo ARD3 = A04.ARD();
                            ARD3.E7G("time stamp", currentTimeMillis);
                            ARD3.apply();
                        } catch (IOException unused) {
                            C0w9.A03(C32326ELu.__redex_internal_original_name, "Failed to save cache");
                        }
                    }
                    if (c32326ELu.A0C) {
                        AbstractC25226BEj.A1P(c32326ELu);
                    } else {
                        c32326ELu.getActivity().setResult(-1, putExtra);
                        c32326ELu.getActivity().finish();
                    }
                }
                C0f9.A0A(-671797511, A037);
                i = -1650420296;
                break;
            case 6:
                A03 = C0f9.A03(1472179248);
                C168027ex c168027ex = (C168027ex) obj;
                int A0G = AbstractC25231BEo.A0G(c168027ex, -864645545);
                EVT evt = (EVT) this.A01;
                evt.A02 = c168027ex.getItems();
                evt.A08.A01(EVT.A00(evt));
                C0f9.A0A(2093277108, A0G);
                i = -3581874;
                break;
            case 7:
                A03 = C0f9.A03(1411267350);
                C43707JUs c43707JUs2 = (C43707JUs) obj;
                int A038 = C0f9.A03(307190119);
                C83403nh c83403nh2 = c43707JUs2.A00;
                if (c83403nh2 == null || (c83403nh2.A10 == C2EY.A0G && !c43707JUs2.CLR())) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                EM4 em4 = (EM4) this.A01;
                String str7 = c43707JUs2.A1E;
                String str8 = c43707JUs2.A1L;
                boolean z4 = c43707JUs2.A1e;
                G05 g05 = em4.A02;
                if (g05 != null) {
                    UserSession userSession4 = em4.A01;
                    String str9 = em4.A08;
                    String str10 = g05.A0A;
                    EnumC33498ErX enumC33498ErX2 = em4.A00;
                    if (z2) {
                        str2 = "new";
                    } else {
                        str2 = "existing";
                    }
                    C162337Ov.A09(enumC33498ErX2, em4, userSession4, str9, str10, str7, str2);
                }
                if (em4.getActivity() != null) {
                    Intent putExtra2 = AbstractC31171DnF.A04().putExtra("bundle_extra_share_target", new DirectShareTarget(AbstractC31171DnF.A0N(str7), str8, AbstractC35052FcP.A01(em4.A0E), z4));
                    G05 g052 = em4.A02;
                    if (g052 != null) {
                        putExtra2.putExtra("bundle_query_session_id", g052.A0B);
                    }
                    C006802i.A0p.markerStart(31787378);
                    em4.getActivity().setResult(-1, putExtra2);
                    em4.getActivity().finish();
                }
                C0f9.A0A(-484539337, A038);
                i = 1156734760;
                break;
            case 8:
                A03 = C0f9.A03(908751216);
                int A039 = C0f9.A03(-479585417);
                AbstractC167017dG.A1N(userSession, obj);
                super.A05(userSession, obj);
                ((GZ1) this.A01).onSuccess();
                C0f9.A0A(-1862957503, A039);
                i = 2037321020;
                break;
            case 9:
                A03 = C0f9.A03(408700947);
                ECZ ecz = (ECZ) obj;
                int A0310 = C0f9.A03(1568586316);
                AbstractC167017dG.A1N(userSession, ecz);
                boolean z5 = !ecz.A01;
                boolean z6 = !ecz.A00;
                AbstractC23021Ah.A00(userSession).A1b(z5);
                C23031Ai A00 = AbstractC23021Ah.A00(userSession);
                AbstractC167007dF.A1L(A00, A00.A63, C23031Ai.A8c, 200, z6);
                FHT fht = (FHT) this.A01;
                if (fht != null) {
                    fht.A00.DqL(z5, z6);
                }
                C0f9.A0A(589067170, A0310);
                i = -938960172;
                break;
            default:
                super.A05(userSession, obj);
                return;
        }
        C0f9.A0A(i, A03);
    }

    @Override // X.AnonymousClass935
    public final /* bridge */ /* synthetic */ void A06(UserSession userSession, Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 8:
                A03 = C0f9.A03(1430961814);
                C1574875f c1574875f = (C1574875f) obj;
                int A032 = C0f9.A03(-683093703);
                AbstractC167017dG.A1N(userSession, c1574875f);
                C43707JUs c43707JUs = c1574875f.A02;
                if (c43707JUs != null) {
                    AbstractC28761aE.A00(userSession).FBb(c43707JUs);
                }
                C0f9.A0A(1876752732, A032);
                i = -221006783;
                break;
            case 9:
            default:
                super.A06(userSession, obj);
                return;
            case 10:
                A03 = C0f9.A03(-1075592245);
                C43707JUs c43707JUs2 = (C43707JUs) obj;
                int A033 = C0f9.A03(1109993254);
                C14360o3.A0B(c43707JUs2, 1);
                ((C34959Faj) this.A01).A04.FBa(c43707JUs2, c43707JUs2.A0q, c43707JUs2, true);
                C0f9.A0A(-370694934, A033);
                i = 2110848520;
                break;
        }
        C0f9.A0A(i, A03);
    }
}
