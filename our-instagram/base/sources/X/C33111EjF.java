package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.EjF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33111EjF extends AbstractC32533EUj {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33111EjF(AbstractC10360h2 abstractC10360h2, Object obj, Object obj2, int i) {
        super(abstractC10360h2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(-1071451717);
                FHV fhv = (FHV) this.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                C33233ElS c33233ElS = fhv.A00;
                C35246Fgf.A01(c33233ElS, A1E, 2131972429);
                c33233ElS.setItems(A1E);
                c33233ElS.A01.A03(false);
                i = 898688193;
                C0f9.A0A(i, A03);
                return;
            case 1:
                A03 = C0f9.A03(-617542018);
                C33234ElT c33234ElT = ((FPR) this.A02).A00;
                ArrayList A1E2 = AbstractC166987dD.A1E();
                C35246Fgf.A01(c33234ElT, A1E2, 2131972429);
                c33234ElT.setItems(A1E2);
                ((C33234ElT) this.A01).A04.A03(false);
                i = -1162856943;
                C0f9.A0A(i, A03);
                return;
            case 2:
                A03 = AbstractC167017dG.A0N(abstractC115105If, -1201182727);
                AbstractC35254Fgn.A02((Context) this.A01, abstractC115105If);
                i = -795438894;
                C0f9.A0A(i, A03);
                return;
            default:
                A03 = C0f9.A03(-12625190);
                String id = ((C38321qM) this.A02).getId();
                if (id != null) {
                    C0w9.A03("ClipsRemixUtil_configure_audio_for_remix_on_fail", AnonymousClass001.A0R("failure for media id: ", id));
                    AbstractC166987dD.A1Y(this.A01);
                    i = 1815160833;
                    C0f9.A0A(i, A03);
                    return;
                }
                IllegalStateException A0g = AbstractC166997dE.A0g();
                C0f9.A0A(1630933416, A03);
                throw A0g;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x02c5. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.GHY] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r14v7, types: [X.Fgf] */
    /* JADX WARN: Type inference failed for: r8v5, types: [X.Dq0, java.lang.Object] */
    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        Object c35200Ffs;
        String str;
        SYN A00;
        C33621EtX c33621EtX;
        GHY ghy;
        ?? ghy2;
        C35200Ffs c35200Ffs2;
        int i2;
        String A0w;
        String str2;
        switch (this.A00) {
            case 0:
                A03 = C0f9.A03(259966524);
                EDO edo = (EDO) obj;
                int A032 = C0f9.A03(1998853310);
                FRN frn = (FRN) this.A01;
                List list = frn.A07;
                list.clear();
                java.util.Set set = frn.A08;
                set.clear();
                Context context = frn.A02;
                if (!AbstractC14480oK.A01(context)) {
                    InterfaceC02590Ai A0f = AbstractC166987dD.A0f(C35033Fc6.A00(frn.A06), "ig_push_notification_settings_banner");
                    if (A0f.isSampled()) {
                        A0f.AAP("event_type", "impression");
                        A0f.Cht();
                    }
                    C211739Zk c211739Zk = new C211739Zk(context.getString(2131975119), Integer.valueOf(R.drawable.instagram_alert_pano_outline_24));
                    c211739Zk.A00 = 2131975118;
                    c211739Zk.A01 = new G81(frn, 11);
                    list.add(c211739Zk);
                }
                boolean z = false;
                for (E6S e6s : edo.A01) {
                    String str3 = e6s.A00;
                    if (!frn.A09 || AbstractC111324zv.A00(2936).equals(str3) || "text_post_app_push_notifications".equals(str3)) {
                        if (!list.isEmpty()) {
                            list.add(new C35119FeM(true));
                        }
                        String str4 = e6s.A05;
                        if (str4 == null) {
                            str4 = "";
                        }
                        list.add(new C31335Dq0(str4));
                        for (E6O e6o : e6s.A06) {
                            String str5 = e6o.A04;
                            switch (str5.hashCode()) {
                                case -868304044:
                                    if (str5.equals("toggle")) {
                                        String str6 = e6o.A01;
                                        if (!str6.equals("mute_all") && !str6.equals("mute_all_but_dms")) {
                                            if (str6.equals("message_only_meta_toggle")) {
                                                z = Boolean.TRUE.equals(e6o.A00);
                                                c35200Ffs = new C33242Elc(context, frn.A03, frn.A04, frn.A05, frn.A06, e6o.A03, str6, z);
                                                list.add(c35200Ffs);
                                                set.add(c35200Ffs);
                                                break;
                                            } else {
                                                break;
                                            }
                                        } else {
                                            UserSession userSession = frn.A05;
                                            Fragment fragment = frn.A04;
                                            C35033Fc6 c35033Fc6 = frn.A06;
                                            Boolean bool = e6o.A00;
                                            if (bool != null) {
                                                C71603Jf c71603Jf = new C71603Jf(userSession);
                                                long A06 = AbstractC31177DnL.A06();
                                                list.add(new C33243Eld(context, fragment, userSession, C13920nI.A00, AbstractC23021Ah.A00(userSession), c35033Fc6, e6o.A03, str6, bool.booleanValue()));
                                                boolean A01 = AbstractC455527p.A01(userSession);
                                                if (!C18U.A06(C06090Tz.A05, userSession, 36315980007214946L) && !c71603Jf.A01.A1W()) {
                                                    break;
                                                } else {
                                                    boolean A07 = c71603Jf.A07(A06);
                                                    if (A01) {
                                                        i2 = 2131974153;
                                                        if (A07) {
                                                            i2 = 2131974154;
                                                        }
                                                    } else {
                                                        i2 = 2131971395;
                                                        if (A07) {
                                                            i2 = 2131971396;
                                                        }
                                                    }
                                                    C35246Fgf c35246Fgf = new C35246Fgf(fragment.getString(i2));
                                                    int i3 = 2131971394;
                                                    if (A01) {
                                                        i3 = 2131974152;
                                                    }
                                                    ghy2 = new C35246Fgf(fragment.getString(i3));
                                                    ghy = GHY.A00(context, new ViewOnClickListenerC35687FpM(47, fragment, userSession), 2131971413);
                                                    ghy2.A04 = new ViewOnClickListenerC35687FpM(47, fragment, userSession);
                                                    list.add(c35246Fgf);
                                                    list.add(ghy);
                                                    c35200Ffs2 = ghy2;
                                                    list.add(c35200Ffs2);
                                                    break;
                                                }
                                            } else {
                                                break;
                                            }
                                        }
                                    } else {
                                        break;
                                    }
                                    break;
                                case 1134485835:
                                    if (!str5.equals("time_range")) {
                                        break;
                                    } else {
                                        UserSession userSession2 = frn.A05;
                                        Fragment fragment2 = frn.A04;
                                        C35033Fc6 c35033Fc62 = frn.A06;
                                        FHU fhu = new FHU(frn);
                                        String str7 = e6o.A02;
                                        if (str7 != null) {
                                            String[] split = str7.split("-");
                                            if (split.length >= 3) {
                                                String str8 = split[1];
                                                str = split[2];
                                                Object obj2 = new Object();
                                                A00 = SYN.A00(str8);
                                                c33621EtX = obj2;
                                                c33621EtX.A00 = A00;
                                                c33621EtX.A01 = SYN.A00(str);
                                                ghy = new GHY(context, (View.OnClickListener) null, AbstractC167007dF.A0f(context, SYN.A01(c33621EtX.A00), 2131975593));
                                                ghy2 = new GHY(context, (View.OnClickListener) null, AbstractC167007dF.A0f(context, SYN.A01(c33621EtX.A01), 2131975596));
                                                list.add(new C33244Ele(context, fragment2, userSession2, e6o, fhu, c35033Fc62, c33621EtX, ghy, ghy2));
                                                if (str7 != null && str7.startsWith(RealtimeSubscription.GRAPHQL_MQTT_VERSION)) {
                                                    list.add(ghy);
                                                    c35200Ffs2 = ghy2;
                                                    list.add(c35200Ffs2);
                                                    break;
                                                }
                                            }
                                        }
                                        str = "07:00";
                                        Object obj3 = new Object();
                                        A00 = SYN.A00("21:00");
                                        c33621EtX = obj3;
                                        c33621EtX.A00 = A00;
                                        c33621EtX.A01 = SYN.A00(str);
                                        ghy = new GHY(context, (View.OnClickListener) null, AbstractC167007dF.A0f(context, SYN.A01(c33621EtX.A00), 2131975593));
                                        ghy2 = new GHY(context, (View.OnClickListener) null, AbstractC167007dF.A0f(context, SYN.A01(c33621EtX.A01), 2131975596));
                                        list.add(new C33244Ele(context, fragment2, userSession2, e6o, fhu, c35033Fc62, c33621EtX, ghy, ghy2));
                                        if (str7 != null) {
                                            list.add(ghy);
                                            c35200Ffs2 = ghy2;
                                            list.add(c35200Ffs2);
                                        }
                                    }
                                case 1862666772:
                                    if (str5.equals("navigation")) {
                                        boolean equals = e6o.A01.equals("email_and_sms");
                                        String str9 = e6o.A03;
                                        if (equals) {
                                            c35200Ffs2 = new C35200Ffs((View.OnClickListener) ViewOnClickListenerC35689FpO.A00(frn, 15), (CharSequence) str9, (String) null, false);
                                            list.add(c35200Ffs2);
                                            break;
                                        } else {
                                            c35200Ffs = new C35200Ffs((View.OnClickListener) new ViewOnClickListenerC35687FpM(48, frn, e6o), (CharSequence) str9, (String) null, false);
                                            list.add(c35200Ffs);
                                            set.add(c35200Ffs);
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                }
                frn.A01(Boolean.valueOf(z));
                C33233ElS c33233ElS = ((FHV) this.A02).A00;
                c33233ElS.setItems(list);
                c33233ElS.A01.A03(true);
                C0f9.A0A(1637770249, A032);
                i = 374266568;
                break;
            case 1:
                A03 = C0f9.A03(1222473816);
                EDO edo2 = (EDO) obj;
                int A033 = C0f9.A03(286772993);
                C33234ElT c33234ElT = (C33234ElT) this.A01;
                FPR fpr = (FPR) this.A02;
                ArrayList A1E = AbstractC166987dD.A1E();
                if (c33234ElT.A05.equals("supervision")) {
                    C35246Fgf c35246Fgf2 = new C35246Fgf(2131974976);
                    c35246Fgf2.A01 = R.style.igds_body_1;
                    c35246Fgf2.A03 = R.dimen.abc_control_corner_material;
                    A1E.add(c35246Fgf2);
                }
                Context context2 = c33234ElT.getContext();
                for (E6S e6s2 : edo2.A01) {
                    List list2 = e6s2.A06;
                    if (!list2.isEmpty()) {
                        if (!A1E.isEmpty()) {
                            C35119FeM.A00(A1E, true);
                        }
                        String str10 = null;
                        String str11 = ((E6O) list2.get(0)).A04;
                        if (!str11.equals("toggle")) {
                            if (str11.equals("radio")) {
                                String str12 = e6s2.A05;
                                String str13 = e6s2.A04;
                                ?? obj4 = new Object();
                                obj4.A05 = -1;
                                C31335Dq0.A02(obj4);
                                obj4.A0E = str12;
                                obj4.A0F = str13;
                                obj4.A0K = false;
                                obj4.A0M = true;
                                obj4.A0L = false;
                                obj4.A06 = AbstractC167017dG.A06(c33234ElT.requireContext());
                                A1E.add(obj4);
                                if (context2 != null && AbstractC14490oL.A09(context2)) {
                                    C33234ElT.A04(e6s2.A01, A1E);
                                    str10 = C33234ElT.A00(fpr, c33234ElT, list2, A1E);
                                } else {
                                    str10 = C33234ElT.A00(fpr, c33234ElT, list2, A1E);
                                    C33234ElT.A04(e6s2.A01, A1E);
                                }
                                String str14 = e6s2.A03;
                                if (str14 != null && (str2 = e6s2.A02) != null) {
                                    A1E.add(new C34969Fat(str14, new ViewOnClickListenerC35671Fp6(str2, c33234ElT, 15)));
                                }
                            }
                        } else if (context2 != null && AbstractC14490oL.A09(context2)) {
                            C33234ElT.A04(e6s2.A01, A1E);
                            str10 = C33234ElT.A01(fpr, c33234ElT, list2, A1E);
                        } else {
                            str10 = C33234ElT.A01(fpr, c33234ElT, list2, A1E);
                            C33234ElT.A04(e6s2.A01, A1E);
                        }
                        if (c33234ElT.A06 && "video_call".equals(str10)) {
                            c33234ElT.A00 = A1E.size();
                        }
                    }
                }
                C35119FeM.A00(A1E, true);
                A1E.add(new C34969Fat(ViewOnClickListenerC35689FpO.A00(c33234ElT, 17), 2131952473));
                String A002 = AbstractC13180m4.A00(AbstractC12290kX.A00);
                if ("IG".equals(A002)) {
                    A0w = c33234ElT.getString(2131952474);
                } else {
                    A0w = AbstractC31174DnI.A0w(c33234ElT, A002, 2131952477);
                }
                A1E.add(new C35246Fgf(A0w));
                fpr.A00.setItems(A1E);
                if (c33234ElT.A06) {
                    c33234ElT.scrollToPosition(c33234ElT.A00);
                }
                c33234ElT.A04.A03(true);
                C0f9.A0A(-1254382009, A033);
                i = 1424455195;
                break;
            case 2:
                A03 = C0f9.A03(101188680);
                EDU edu = (EDU) obj;
                int A034 = C0f9.A03(-1705805558);
                C14360o3.A0B(edu, 0);
                C140966Yy A0r = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                AbstractC35179FfW.A03();
                AbstractC31175DnJ.A0t(edu.A00(), new C33215El3(), A0r);
                C0f9.A0A(2022139635, A034);
                i = -435645381;
                break;
            default:
                int A035 = C0f9.A03(171691893);
                C38869H9r c38869H9r = (C38869H9r) obj;
                int A0N = AbstractC167017dG.A0N(c38869H9r, 534217067);
                C3XQ c3xq = c38869H9r.A00;
                if (c3xq == null || (c3xq.A01 == null && c3xq.A00 == null)) {
                    String id = ((C38321qM) this.A02).getId();
                    if (id != null) {
                        C0w9.A03("ClipsRemixUtil_configure_audio_for_remix_null_response", AnonymousClass001.A0R("null music metadata for media id: ", id));
                    } else {
                        IllegalStateException A0g = AbstractC166997dE.A0g();
                        C0f9.A0A(-1200867596, A0N);
                        throw A0g;
                    }
                } else {
                    ((C38321qM) this.A02).A0C.EZM(c3xq);
                }
                AbstractC166987dD.A1Y(this.A01);
                C0f9.A0A(-2077181531, A0N);
                C0f9.A0A(-427705552, A035);
                return;
        }
        C0f9.A0A(i, A03);
    }
}
