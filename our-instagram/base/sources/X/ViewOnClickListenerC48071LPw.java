package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.react.views.textinput.ReactTextInputManager;
import com.instagram.creator.ghostwriter.ui.GhostWriterView;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.LPw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewOnClickListenerC48071LPw implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public ViewOnClickListenerC48071LPw(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C44546Jmq A00(ViewOnClickListenerC48071LPw viewOnClickListenerC48071LPw) {
        return (C44546Jmq) ((C46051Ka6) viewOnClickListenerC48071LPw.A01).A04.getValue();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int A05;
        int i;
        Object value;
        Integer num;
        List list;
        String str;
        EnumC46208Kck enumC46208Kck;
        Integer num2;
        Integer num3;
        Integer num4;
        Integer num5;
        EnumC46208Kck enumC46208Kck2;
        EnumC46208Kck enumC46208Kck3;
        switch (this.A00) {
            case 0:
                A05 = C0f9.A05(-62545911);
                GhostWriterView ghostWriterView = (GhostWriterView) this.A01;
                C44492Jly c44492Jly = ghostWriterView.A00;
                if (c44492Jly == null) {
                    str = "viewModel";
                    break;
                } else {
                    String A0g = AbstractC167007dF.A0g(ghostWriterView.A03);
                    C14360o3.A0B(A0g, 0);
                    if (c44492Jly.A01 == null) {
                        C05A c05a = c44492Jly.A03;
                        do {
                            value = c05a.getValue();
                            num = C05F.A00;
                            list = (List) ((C51761Mtk) value).A00;
                            C14360o3.A0B(list, 1);
                        } while (!c05a.AIi(value, new C51761Mtk(num, list)));
                        C45127Jxw c45127Jxw = c44492Jly.A00;
                        c44492Jly.A01 = AbstractC23641Du.A03(num, AnonymousClass191.A00, new MC9(c44492Jly, c45127Jxw, A0g, (InterfaceC23621Ds) null, 32), AbstractC141776au.A00(c44492Jly));
                    }
                    i = 1402571045;
                    C0f9.A0C(i, A05);
                    return;
                }
            case 1:
                A05 = C0f9.A05(688601261);
                C45482KBu c45482KBu = (C45482KBu) this.A01;
                ArrayList arrayList = c45482KBu.A04;
                C189448aO A0g2 = AbstractC25231BEo.A0g(c45482KBu.A06);
                A0g2.A0d = AbstractC166997dE.A0N(c45482KBu).getString(2131957179);
                C189478aR A00 = A0g2.A00();
                FragmentActivity requireActivity = c45482KBu.requireActivity();
                KDE kde = new KDE();
                AbstractC25233BEq.A15(kde, "audio_sections", arrayList);
                A00.A02(requireActivity, kde);
                i = 181750891;
                C0f9.A0C(i, A05);
                return;
            case 2:
                A05 = C0f9.A05(-90930200);
                ((L5F) this.A01).A07.invoke();
                i = 1868307392;
                C0f9.A0C(i, A05);
                return;
            case 3:
                A05 = C0f9.A05(702096498);
                ((L5F) this.A01).A07.invoke();
                i = -1191423093;
                C0f9.A0C(i, A05);
                return;
            case 4:
                A05 = C0f9.A05(270070900);
                C214759fD c214759fD = (C214759fD) this.A01;
                FragmentActivity activity = c214759fD.getActivity();
                if (activity != null) {
                    Collection collection = (Collection) ((C44476Jli) c214759fD.A0d.getValue()).A02.getValue();
                    Bundle A0C = AbstractC31177DnL.A0C(collection);
                    A0C.putParcelableArrayList("emoji_pong_users", AbstractC166987dD.A1F(collection));
                    C45524KDp c45524KDp = new C45524KDp();
                    c45524KDp.setArguments(A0C);
                    C189448aO A0g3 = AbstractC25231BEo.A0g(c214759fD.A0b);
                    A0g3.A0d = c214759fD.getString(2131961739);
                    A0g3.A0U = new C49623LwG(c214759fD, 6);
                    AbstractC31173DnH.A0w(activity, c45524KDp, A0g3);
                    c214759fD.A0T = true;
                }
                i = 302719358;
                C0f9.A0C(i, A05);
                return;
            case 5:
                A05 = C0f9.A05(-1291383605);
                C44546Jmq A002 = A00(this);
                A002.A0B.Egh(BHS.A00(new Object[0], 2131962649));
                A002.A04.A02(C43597JQd.A00(A002.A02, A002, 6), C49732Ly1.A00);
                i = 1688687492;
                C0f9.A0C(i, A05);
                return;
            case 6:
                A05 = C0f9.A05(-653597002);
                C44546Jmq A003 = A00(this);
                A003.A0B.Egh(BHS.A00(new Object[0], 2131962648));
                A003.A04.A02(C43597JQd.A00(A003.A02, A003, 3), C49729Lxy.A00);
                i = 2045065240;
                C0f9.A0C(i, A05);
                return;
            case 7:
                A05 = C0f9.A05(-934460946);
                C44546Jmq A004 = A00(this);
                A004.A04.A02(C43597JQd.A00(A004.A02, A004, 7), C49733Ly2.A00);
                i = -1595299407;
                C0f9.A0C(i, A05);
                return;
            case 8:
                A05 = C0f9.A05(143834507);
                C44546Jmq A005 = A00(this);
                A005.A04.A02(C43597JQd.A00(A005.A02, A005, 2), C49728Lxx.A00);
                i = 671110468;
                C0f9.A0C(i, A05);
                return;
            case 9:
                A05 = C0f9.A05(-44360694);
                C44546Jmq A006 = A00(this);
                A006.A04.A02(C43597JQd.A00(A006.A02, A006, 5), C49731Ly0.A00);
                i = -1179570040;
                C0f9.A0C(i, A05);
                return;
            case 10:
                A05 = C0f9.A05(-235627802);
                C46051Ka6 c46051Ka6 = (C46051Ka6) this.A01;
                C44546Jmq c44546Jmq = (C44546Jmq) c46051Ka6.A04.getValue();
                LGY.A00(c46051Ka6.requireActivity(), EnumC46208Kck.A03, (EnumC46149Kbn) c44546Jmq.A0D.getValue(), AbstractC46741Kly.A00(c44546Jmq.A05), C05F.A0Y);
                i = -149873554;
                C0f9.A0C(i, A05);
                return;
            case 11:
                A05 = C0f9.A05(-1222734139);
                C46051Ka6 c46051Ka62 = (C46051Ka6) this.A01;
                C44546Jmq c44546Jmq2 = (C44546Jmq) c46051Ka62.A04.getValue();
                LGY.A00(c46051Ka62.requireActivity(), EnumC46208Kck.A0N, (EnumC46149Kbn) c44546Jmq2.A0D.getValue(), AbstractC46741Kly.A00(c44546Jmq2.A05), C05F.A0Y);
                i = 321562115;
                C0f9.A0C(i, A05);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                A05 = C0f9.A05(-1676559537);
                AbstractC25230BEn.A0l(((C46051Ka6) this.A01).A03).A0W(0);
                i = -1248737809;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                A05 = C0f9.A05(-1769430926);
                C140966Yy c140966Yy = A00(this).A01;
                c140966Yy.A0D(new KB9());
                c140966Yy.A04();
                i = -1537747717;
                C0f9.A0C(i, A05);
                return;
            case 14:
                A05 = C0f9.A05(195437489);
                C44546Jmq A007 = A00(this);
                C44546Jmq.A01(A007, "create backup started");
                AbstractC43593JPy.A1S(A007, null, AbstractC141776au.A00(A007), 34);
                i = -1013507534;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGTERM /* 15 */:
                A05 = C0f9.A05(1047272981);
                C44546Jmq A008 = A00(this);
                C44546Jmq.A01(A008, "save started");
                AbstractC43593JPy.A1S(A008, null, AbstractC141776au.A00(A008), 38);
                i = -1935463494;
                C0f9.A0C(i, A05);
                return;
            case 16:
                A05 = C0f9.A05(1929759526);
                AbstractC52922bZ A0Z = AbstractC25225BEi.A0Z(((C46051Ka6) this.A01).A04);
                AbstractC43593JPy.A1S(A0Z, null, AbstractC141776au.A00(A0Z), 36);
                i = -28629027;
                C0f9.A0C(i, A05);
                return;
            case 17:
                A05 = C0f9.A05(1559106169);
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(((C46051Ka6) this.A01).A04);
                AbstractC43593JPy.A1S(A0Z2, null, AbstractC141776au.A00(A0Z2), 37);
                i = 584902876;
                C0f9.A0C(i, A05);
                return;
            case 18:
                A05 = C0f9.A05(-148359496);
                AbstractC52922bZ A0Z3 = AbstractC25225BEi.A0Z(((C46051Ka6) this.A01).A04);
                AbstractC43593JPy.A1S(A0Z3, null, AbstractC141776au.A00(A0Z3), 35);
                i = 1421181793;
                C0f9.A0C(i, A05);
                return;
            case Process.SIGSTOP /* 19 */:
                A05 = C0f9.A05(-37052687);
                C46051Ka6 c46051Ka63 = (C46051Ka6) this.A01;
                LLQ.A06(c46051Ka63, EnumC193348hE.A03, 2131962631, 2131977166, null, null, null, null, new MHL(c46051Ka63.A04.getValue(), 45), 2131962630, 2131968555);
                i = -25135654;
                C0f9.A0C(i, A05);
                return;
            case 20:
                A05 = C0f9.A05(-1429163747);
                C140966Yy c140966Yy2 = A00(this).A01;
                c140966Yy2.A0D(new C46054Ka9());
                c140966Yy2.A04();
                i = -1931151313;
                C0f9.A0C(i, A05);
                return;
            case 21:
                A05 = C0f9.A05(747482498);
                C46051Ka6 c46051Ka64 = (C46051Ka6) this.A01;
                C44546Jmq c44546Jmq3 = (C44546Jmq) c46051Ka64.A04.getValue();
                FragmentActivity requireActivity2 = c46051Ka64.requireActivity();
                AbstractC46741Kly.A00(c44546Jmq3.A05).A02(requireActivity2, AbstractC166987dD.A0b(), (EnumC46149Kbn) c44546Jmq3.A0D.getValue(), C05F.A0Y, null);
                i = 88284968;
                C0f9.A0C(i, A05);
                return;
            case 22:
                A05 = C0f9.A05(1442409290);
                C44546Jmq A009 = A00(this);
                A009.A04.A02(C43597JQd.A00(A009.A03, A009, 8), C49734Ly3.A00);
                i = 1208168725;
                C0f9.A0C(i, A05);
                return;
            case 23:
                A05 = C0f9.A05(231696764);
                C44546Jmq A0010 = A00(this);
                A0010.A04.A02(C43597JQd.A00(A0010.A03, A0010, 4), C49730Lxz.A00);
                i = -2040717371;
                C0f9.A0C(i, A05);
                return;
            case 24:
                A05 = C0f9.A05(-767594783);
                C6AE.A02(A00(this).A05, EnumC132075xi.A05, true).A00.A00();
                i = 944404003;
                C0f9.A0C(i, A05);
                return;
            case 25:
                A05 = C0f9.A05(-829812923);
                C44546Jmq A0011 = A00(this);
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putString("BUNDLE_SURFACE", A0011.A0D.getValue().toString());
                C140966Yy c140966Yy3 = A0011.A01;
                c140966Yy3.A0B(A0b, new KBA());
                c140966Yy3.A04();
                i = 2076620789;
                C0f9.A0C(i, A05);
                return;
            case 26:
                A05 = C0f9.A05(1360092168);
                A00(this).A07.A05(C05F.A0Y);
                i = -178136812;
                C0f9.A0C(i, A05);
                return;
            case 27:
                A05 = C0f9.A05(353846689);
                KP1 kp1 = (KP1) this.A01;
                kp1.A0F(true);
                KPI kpi = ((C44477Jlj) kp1.A03.getValue()).A01;
                kpi.A07("SETUP_TYPE", "GDRIVE");
                kpi.A05("HARD_BLOCK_3P_LEADING_SCREEN_CONTINUE_WITH_GOOGLE_TAP");
                kpi.A05("GDRIVE_LAUNCH_AUTH");
                kp1.A0G(true);
                i = 1908723757;
                C0f9.A0C(i, A05);
                return;
            case 28:
                A05 = C0f9.A05(809196731);
                KP1 kp12 = (KP1) this.A01;
                A01(((C44477Jlj) kp12.A03.getValue()).A01, kp12, "HARD_BLOCK_3P_LEADING_SCREEN_MORE_OPTIONS_TAP");
                i = 162788804;
                C0f9.A0C(i, A05);
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                A05 = C0f9.A05(703826939);
                KP0 kp0 = (KP0) this.A01;
                kp0.A0F(true);
                KPI kpi2 = ((C44472Jle) kp0.A04.getValue()).A01;
                kpi2.A07("SETUP_TYPE", "GDRIVE");
                kpi2.A05("SOFT_BLOCK_3P_LEADING_SCREEN_CONTINUE_WITH_GOOGLE_TAP");
                kpi2.A05("GDRIVE_LAUNCH_AUTH");
                kp0.A0G(true);
                i = -2027636069;
                C0f9.A0C(i, A05);
                return;
            case 30:
                A05 = C0f9.A05(2135999595);
                KP0 kp02 = (KP0) this.A01;
                A01(((C44472Jle) kp02.A04.getValue()).A01, kp02, "SOFT_BLOCK_3P_LEADING_SCREEN_MORE_OPTIONS_TAP");
                i = 229679188;
                C0f9.A0C(i, A05);
                return;
            case 31:
                A05 = C0f9.A05(2125906157);
                C45793KOy c45793KOy = (C45793KOy) this.A01;
                KPU A0012 = C44462JlU.A00(c45793KOy.A05);
                A0012.A05("RESTORE_LANDING_NUX_SYNC_NOW_TAP");
                A0012.A07("RESTORE_TYPE", "GDRIVE");
                c45793KOy.A0G(false);
                i = 464877457;
                C0f9.A0C(i, A05);
                return;
            case 32:
                A05 = C0f9.A05(-1878977945);
                C45793KOy c45793KOy2 = (C45793KOy) this.A01;
                C44462JlU.A00(c45793KOy2.A05).A05("RESTORE_LANDING_NUX_USE_OTC_TAP");
                if (AbstractC43594JPz.A1b(c45793KOy2.A04)) {
                    enumC46208Kck = EnumC46208Kck.A0M;
                } else {
                    enumC46208Kck = EnumC46208Kck.A0J;
                }
                AbstractC43592JPx.A1K(c45793KOy2, enumC46208Kck, AbstractC43593JPy.A0U(c45793KOy2));
                i = 608468429;
                C0f9.A0C(i, A05);
                return;
            case 33:
                A05 = C0f9.A05(166805435);
                C45793KOy c45793KOy3 = (C45793KOy) this.A01;
                KPU A0013 = C44462JlU.A00(c45793KOy3.A05);
                A0013.A05("RESTORE_LANDING_NUX_NEED_HELP_TAP");
                A0013.A07("END_REASON", "NEED_HELP_BUTTON_TAPPED");
                A0013.A01();
                AbstractC41776Ies.A09(c45793KOy3.requireActivity(), AbstractC166987dD.A0r(((KCM) c45793KOy3).A00), C2Fb.A1g, "https://help.instagram.com/1992818607740142", "encrypted_backups_gdrive_restore_flow");
                i = 361183002;
                C0f9.A0C(i, A05);
                return;
            case 34:
                A05 = C0f9.A05(650233753);
                C45793KOy c45793KOy4 = (C45793KOy) this.A01;
                C44462JlU.A00(c45793KOy4.A05).A05("RESTORE_LANDING_NUX_TRY_ANOTHER_WAY_TAP");
                EnumC193348hE enumC193348hE = EnumC193348hE.A04;
                if (c45793KOy4.A03) {
                    num2 = 2131961848;
                } else {
                    num2 = null;
                }
                if (c45793KOy4.A02) {
                    num3 = 2131961849;
                } else {
                    num3 = null;
                }
                LLQ.A06(c45793KOy4, enumC193348hE, null, num2, num3, C50247MHc.A01(c45793KOy4, 20), C50247MHc.A01(c45793KOy4, 21), C50247MHc.A01(c45793KOy4, 22), C50247MHc.A01(c45793KOy4, 23), 2131961850, 2131961847);
                i = -327929599;
                C0f9.A0C(i, A05);
                return;
            case 35:
                A05 = C0f9.A05(1799579763);
                C45794KOz c45794KOz = (C45794KOz) this.A01;
                KPU A0014 = C44462JlU.A00(c45794KOz.A06);
                A0014.A05("RESTORE_LANDING_NUX_SYNC_NOW_TAP");
                A0014.A07("RESTORE_TYPE", "GDRIVE");
                c45794KOz.A0G(false);
                i = -1674695175;
                C0f9.A0C(i, A05);
                return;
            case 36:
                A05 = C0f9.A05(14366447);
                C45794KOz c45794KOz2 = (C45794KOz) this.A01;
                C44462JlU.A00(c45794KOz2.A06).A05("RESTORE_LANDING_NUX_USE_OTC_TAP");
                AbstractC43592JPx.A1K(c45794KOz2, EnumC46208Kck.A0M, AbstractC43593JPy.A0U(c45794KOz2));
                i = -124379367;
                C0f9.A0C(i, A05);
                return;
            case 37:
                A05 = C0f9.A05(656909090);
                C45794KOz c45794KOz3 = (C45794KOz) this.A01;
                KPU A0015 = C44462JlU.A00(c45794KOz3.A06);
                A0015.A05("RESTORE_LANDING_NUX_NEED_HELP_TAP");
                A0015.A07("END_REASON", "NEED_HELP_BUTTON_TAPPED");
                A0015.A01();
                AbstractC41776Ies.A09(c45794KOz3.requireActivity(), AbstractC166987dD.A0r(((KCM) c45794KOz3).A00), C2Fb.A1g, "https://help.instagram.com/1992818607740142", "encrypted_backups_gdrive_restore_flow_2");
                i = -2115925316;
                C0f9.A0C(i, A05);
                return;
            case 38:
                A05 = C0f9.A05(1762997041);
                C45794KOz c45794KOz4 = (C45794KOz) this.A01;
                C44462JlU.A00(c45794KOz4.A06).A05("RESTORE_LANDING_NUX_TRY_ANOTHER_WAY_TAP");
                EnumC193348hE enumC193348hE2 = EnumC193348hE.A04;
                if (c45794KOz4.A03) {
                    num4 = 2131961848;
                } else {
                    num4 = null;
                }
                if (c45794KOz4.A02) {
                    num5 = 2131961849;
                } else {
                    num5 = null;
                }
                LLQ.A06(c45794KOz4, enumC193348hE2, null, num4, num5, C50247MHc.A01(c45794KOz4, 32), C50247MHc.A01(c45794KOz4, 33), C50247MHc.A01(c45794KOz4, 34), C50247MHc.A01(c45794KOz4, 35), 2131961850, 2131961847);
                i = 528277654;
                C0f9.A0C(i, A05);
                return;
            case 39:
                A05 = C0f9.A05(-2068858275);
                C3DN A0016 = C3DN.A00.A00((Activity) this.A01);
                if (A0016 != null) {
                    A0016.A0Y();
                }
                i = -160367788;
                C0f9.A0C(i, A05);
                return;
            case 40:
                A05 = C0f9.A05(670772603);
                C45813KPs c45813KPs = (C45813KPs) this.A01;
                c45813KPs.A03 = C05F.A00;
                C45813KPs.A0B(c45813KPs);
                i = 1226126774;
                C0f9.A0C(i, A05);
                return;
            case Seq.NULL_REFNUM /* 41 */:
                A05 = C0f9.A05(536621731);
                C45813KPs c45813KPs2 = (C45813KPs) this.A01;
                c45813KPs2.A03 = C05F.A01;
                C45813KPs.A0B(c45813KPs2);
                i = 405481376;
                C0f9.A0C(i, A05);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                A05 = C0f9.A05(784419674);
                C45813KPs c45813KPs3 = (C45813KPs) this.A01;
                c45813KPs3.A03 = C05F.A00;
                C45813KPs.A0B(c45813KPs3);
                i = 147726798;
                C0f9.A0C(i, A05);
                return;
            case 43:
                A05 = C0f9.A05(-378504940);
                C45813KPs c45813KPs4 = (C45813KPs) this.A01;
                c45813KPs4.A03 = C05F.A01;
                C45813KPs.A0B(c45813KPs4);
                i = -1846115013;
                C0f9.A0C(i, A05);
                return;
            case 44:
                A05 = C0f9.A05(-1031695640);
                C45813KPs c45813KPs5 = (C45813KPs) this.A01;
                C44478Jlk c44478Jlk = (C44478Jlk) c45813KPs5.A0B.getValue();
                Integer num6 = c45813KPs5.A03;
                if (num6 == null) {
                    str = "selectStatus";
                    break;
                } else {
                    String str2 = "GDRIVE";
                    if (num6 == C05F.A00) {
                        c44478Jlk.A00.A07("SETUP_TYPE", "GDRIVE");
                    }
                    int intValue = num6.intValue();
                    if (intValue != 0) {
                        if (intValue == 1) {
                            str2 = "PIN_CODE";
                        } else {
                            throw B4Z.A00();
                        }
                    }
                    KPI kpi3 = c44478Jlk.A00;
                    kpi3.A07("MORE_OPTIONS_SELECTION", str2);
                    kpi3.A05("MORE_OPTIONS_CONTINUE_TAP");
                    Bundle A0b2 = AbstractC166987dD.A0b();
                    A0b2.putBoolean("BUNDLE_HIDE_MORE_OPTIONS", true);
                    ((C2DE) c45813KPs5.A0A.getValue()).Crr(A0b2, c45813KPs5, c45813KPs5.A00);
                    i = 622152202;
                    C0f9.A0C(i, A05);
                    return;
                }
            case 45:
                A05 = C0f9.A05(1942956003);
                C45811KPq c45811KPq = (C45811KPq) this.A01;
                c45811KPq.A01 = true;
                C44541Jml.A00(c45811KPq.A05).A05("OTC_DEVICE_LIST_RESEND_CODE_TAP");
                C06C.A00(AbstractC31178DnM.A06("shouldResendKey", true), c45811KPq, "resendRequestKey");
                AbstractC25226BEj.A1Q(c45811KPq);
                i = 1312766094;
                C0f9.A0C(i, A05);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                A05 = C0f9.A05(1705930394);
                C45811KPq c45811KPq2 = (C45811KPq) this.A01;
                C44541Jml.A00(c45811KPq2.A05).A05("OTC_DEVICE_LIST_NEED_HELP_TAP");
                AbstractC41776Ies.A09(c45811KPq2.requireActivity(), AbstractC166987dD.A0r(((KCM) c45811KPq2).A00), C2Fb.A1g, "https://help.instagram.com/219914557612468", C45811KPq.__redex_internal_original_name);
                i = 702994075;
                C0f9.A0C(i, A05);
                return;
            case 47:
                A05 = C0f9.A05(-2021388124);
                C45812KPr c45812KPr = (C45812KPr) this.A01;
                c45812KPr.A00 = true;
                C44541Jml.A00(c45812KPr.A05).A05("OTC_DEVICE_LIST_RESEND_CODE_TAP");
                C06C.A00(AbstractC31178DnM.A06("shouldResendKey", true), c45812KPr, "resendRequestKey");
                AbstractC25226BEj.A1Q(c45812KPr);
                i = 779112809;
                C0f9.A0C(i, A05);
                return;
            case 48:
                A05 = C0f9.A05(-1633188609);
                C45812KPr c45812KPr2 = (C45812KPr) this.A01;
                C44541Jml.A00(c45812KPr2.A05).A05("OTC_DEVICE_LIST_NEED_HELP_TAP");
                AbstractC41776Ies.A09(c45812KPr2.requireActivity(), AbstractC166987dD.A0r(((KCM) c45812KPr2).A00), C2Fb.A1g, "https://help.instagram.com/219914557612468", C45812KPr.__redex_internal_original_name);
                i = -1218896715;
                C0f9.A0C(i, A05);
                return;
            case 49:
                A05 = C0f9.A05(-289538002);
                C45803KPi c45803KPi = (C45803KPi) this.A01;
                KPC kpc = ((C44525JmV) c45803KPi.A04.getValue()).A03;
                kpc.A05("OTC_DISPLAY_CODE_DONE_TAP");
                kpc.A02();
                AbstractC43593JPy.A0U(c45803KPi).APg(c45803KPi);
                i = 756854255;
                C0f9.A0C(i, A05);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A05 = C0f9.A05(-503186910);
                C45801KPg c45801KPg = (C45801KPg) this.A01;
                AbstractC43592JPx.A0b(c45801KPg.A00).A05("OTC_DISPLAY_CODE_CONFIRM_THIS_WAS_ME_TAP");
                AbstractC43592JPx.A1K(c45801KPg, EnumC46208Kck.A0F, AbstractC43593JPy.A0U(c45801KPg));
                i = 1182259437;
                C0f9.A0C(i, A05);
                return;
            case 51:
                A05 = C0f9.A05(145451152);
                C45801KPg c45801KPg2 = (C45801KPg) this.A01;
                AbstractC43592JPx.A0b(c45801KPg2.A00).A05("OTC_DISPLAY_CODE_CONFIRM_THIS_WASNT_ME_TAP");
                FragmentActivity requireActivity3 = c45801KPg2.requireActivity();
                InterfaceC09390do interfaceC09390do = ((KCM) c45801KPg2).A00;
                C140966Yy A0P = AbstractC31173DnH.A0P(requireActivity3, AbstractC166987dD.A0r(interfaceC09390do));
                A0P.A0B(null, C3BH.A00().A01().A00(AbstractC166987dD.A0r(interfaceC09390do), null));
                A0P.A04();
                AbstractC43593JPy.A0U(c45801KPg2).APg(c45801KPg2);
                i = -1360502206;
                C0f9.A0C(i, A05);
                return;
            case 52:
                A05 = C0f9.A05(-264942515);
                C45801KPg c45801KPg3 = (C45801KPg) this.A01;
                AbstractC43592JPx.A0b(c45801KPg3.A00).A05("OTC_DISPLAY_CODE_CONFIRM_LEARN_MORE_TAP");
                AbstractC41776Ies.A09(c45801KPg3.requireActivity(), AbstractC166987dD.A0r(((KCM) c45801KPg3).A00), C2Fb.A1f, "https://help.instagram.com/219914557612468", C45801KPg.__redex_internal_original_name);
                i = -1943580395;
                C0f9.A0C(i, A05);
                return;
            case 53:
                A05 = C0f9.A05(1372161649);
                C45816KPv c45816KPv = (C45816KPv) this.A01;
                InterfaceC09390do interfaceC09390do2 = c45816KPv.A08;
                ((C44458JlQ) interfaceC09390do2.getValue()).A06.A05("OTC_ENTER_PIN_VIEW_YOUR_DEVICES_TAP");
                if (AbstractC43594JPz.A1b(c45816KPv.A07)) {
                    enumC46208Kck2 = EnumC46208Kck.A0E;
                } else {
                    enumC46208Kck2 = EnumC46208Kck.A0D;
                }
                C2DE A0U = AbstractC43593JPy.A0U(c45816KPv);
                Collection collection2 = (Collection) ((C44458JlQ) interfaceC09390do2.getValue()).A00.getValue();
                Bundle A0C2 = AbstractC31177DnL.A0C(collection2);
                A0C2.putParcelableArrayList("deviceListKey", AbstractC166987dD.A1F(collection2));
                A0U.Crr(A0C2, c45816KPv, enumC46208Kck2);
                i = -696503562;
                C0f9.A0C(i, A05);
                return;
            case 54:
                A05 = C0f9.A05(-940309410);
                C45806KPl c45806KPl = (C45806KPl) this.A01;
                AbstractC43592JPx.A0b(c45806KPl.A01).A05("OTC_LANDING_NUX_SEND_CODE_TAP");
                AbstractC43592JPx.A1K(c45806KPl, EnumC46208Kck.A0J, AbstractC43593JPy.A0U(c45806KPl));
                i = 2089826704;
                C0f9.A0C(i, A05);
                return;
            case 55:
                A05 = C0f9.A05(-523696721);
                C45808KPn c45808KPn = (C45808KPn) this.A01;
                AbstractC43592JPx.A0b(c45808KPn.A02).A05("OTC_LANDING_NUX_SEND_CODE_TAP");
                AbstractC43592JPx.A1K(c45808KPn, EnumC46208Kck.A0M, AbstractC43593JPy.A0U(c45808KPn));
                i = -839030206;
                C0f9.A0C(i, A05);
                return;
            case 56:
                A05 = C0f9.A05(850221751);
                C45814KPt c45814KPt = (C45814KPt) this.A01;
                InterfaceC09390do interfaceC09390do3 = c45814KPt.A07;
                ((C44457JlP) interfaceC09390do3.getValue()).A07.A05("OTC_RESTORE_WAIT_RESEND_TAP");
                ((C44457JlP) interfaceC09390do3.getValue()).A0E(true);
                IgdsBottomButtonLayout igdsBottomButtonLayout = c45814KPt.A01;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setPrimaryButtonEnabled(false);
                }
                CountDownTimer countDownTimer = c45814KPt.A00;
                if (countDownTimer == null) {
                    str = "countDownTimer";
                    break;
                } else {
                    countDownTimer.start();
                    i = 1030393728;
                    C0f9.A0C(i, A05);
                    return;
                }
            case 57:
                A05 = C0f9.A05(-95678670);
                C45814KPt c45814KPt2 = (C45814KPt) this.A01;
                ((C44457JlP) c45814KPt2.A07.getValue()).A07.A05("OTC_RESTORE_WAIT_VIEW_YOUR_DEVICES_TAP");
                AbstractC43592JPx.A1K(c45814KPt2, EnumC46208Kck.A0E, AbstractC43593JPy.A0U(c45814KPt2));
                i = 1656069777;
                C0f9.A0C(i, A05);
                return;
            case 58:
                A05 = C0f9.A05(-591025181);
                KCM kcm = (KCM) this.A01;
                AbstractC43592JPx.A1K(kcm, EnumC46208Kck.A03, AbstractC43593JPy.A0U(kcm));
                i = 700750508;
                C0f9.A0C(i, A05);
                return;
            case 59:
                A05 = C0f9.A05(-1900633773);
                C45810KPp c45810KPp = (C45810KPp) this.A01;
                ((C44501Jm7) c45810KPp.A03.getValue()).A03.A05("HARD_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP");
                AbstractC43592JPx.A1K(c45810KPp, EnumC46208Kck.A03, AbstractC43593JPy.A0U(c45810KPp));
                i = -1702663028;
                C0f9.A0C(i, A05);
                return;
            case 60:
                A05 = C0f9.A05(1791589582);
                C45810KPp c45810KPp2 = (C45810KPp) this.A01;
                A01(((C44501Jm7) c45810KPp2.A03.getValue()).A03, c45810KPp2, "HARD_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP");
                i = 120903598;
                C0f9.A0C(i, A05);
                return;
            case 61:
                A05 = C0f9.A05(1649604228);
                C45800KPf c45800KPf = (C45800KPf) this.A01;
                ((C44468Jla) c45800KPf.A00.getValue()).A00.A05("SOFT_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP");
                AbstractC43592JPx.A1K(c45800KPf, EnumC46208Kck.A03, AbstractC43593JPy.A0U(c45800KPf));
                i = -1889807429;
                C0f9.A0C(i, A05);
                return;
            case 62:
                A05 = C0f9.A05(1294664198);
                C45800KPf c45800KPf2 = (C45800KPf) this.A01;
                A01(((C44468Jla) c45800KPf2.A00.getValue()).A00, c45800KPf2, "SOFT_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP");
                i = 1492506230;
                C0f9.A0C(i, A05);
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                A05 = C0f9.A05(-1133345557);
                ((Activity) this.A01).onBackPressed();
                i = 975331765;
                C0f9.A0C(i, A05);
                return;
            case 64:
                A05 = C0f9.A05(-1171600842);
                C45815KPu c45815KPu = (C45815KPu) this.A01;
                ((C44460JlS) c45815KPu.A0E.getValue()).A08.A05("PIN_RESTORE_USE_OTC_TAP");
                if (AbstractC43594JPz.A1b(c45815KPu.A0D)) {
                    enumC46208Kck3 = EnumC46208Kck.A0M;
                } else {
                    enumC46208Kck3 = EnumC46208Kck.A0J;
                }
                AbstractC43592JPx.A1K(c45815KPu, enumC46208Kck3, AbstractC43593JPy.A0U(c45815KPu));
                i = 695530861;
                C0f9.A0C(i, A05);
                return;
            case 65:
                A05 = C0f9.A05(-1475541409);
                C45815KPu c45815KPu2 = (C45815KPu) this.A01;
                ((C44460JlS) c45815KPu2.A0E.getValue()).A08.A05("PIN_RESTORE_NEED_HELP_TAP");
                AbstractC41776Ies.A09(c45815KPu2.requireActivity(), AbstractC166987dD.A0r(((KCM) c45815KPu2).A00), C2Fb.A1g, "https://help.instagram.com/1992818607740142", C45815KPu.__redex_internal_original_name);
                i = 1158581794;
                C0f9.A0C(i, A05);
                return;
            case 66:
                A05 = C0f9.A05(-855994348);
                C45807KPm c45807KPm = (C45807KPm) this.A01;
                ((C44469Jlb) c45807KPm.A01.getValue()).A00.A05("SOFT_BLOCK_PIN_LEADING_SCREEN_CREATE_PIN_TAP");
                AbstractC43592JPx.A1K(c45807KPm, EnumC46208Kck.A03, AbstractC43593JPy.A0U(c45807KPm));
                i = 793725832;
                C0f9.A0C(i, A05);
                return;
            case 67:
                A05 = C0f9.A05(-1020425227);
                C45807KPm c45807KPm2 = (C45807KPm) this.A01;
                A01(((C44469Jlb) c45807KPm2.A01.getValue()).A00, c45807KPm2, "SOFT_BLOCK_PIN_LEADING_SCREEN_MORE_OPTIONS_TAP");
                i = 1901994952;
                C0f9.A0C(i, A05);
                return;
            case 68:
                A05 = C0f9.A05(-768881391);
                ((Activity) this.A01).onBackPressed();
                i = -1943761700;
                C0f9.A0C(i, A05);
                return;
            case 69:
                A05 = C0f9.A05(-1498032011);
                KCM kcm2 = (KCM) this.A01;
                kcm2.requireActivity();
                C140966Yy A0r = AbstractC25225BEi.A0r(kcm2.requireActivity(), AbstractC166987dD.A0r(kcm2.A00));
                A0r.A0D(new C46054Ka9());
                A0r.A04();
                i = -1689280060;
                C0f9.A0C(i, A05);
                return;
            default:
                A05 = C0f9.A05(-1746251107);
                C46054Ka9 c46054Ka9 = (C46054Ka9) this.A01;
                Jn4 A0c = AbstractC43592JPx.A0c(c46054Ka9.A0B);
                Context requireContext = c46054Ka9.requireContext();
                LinearLayout linearLayout = new LinearLayout(requireContext);
                linearLayout.setOrientation(1);
                linearLayout.setPadding(20, 20, 20, 20);
                EditText editText = new EditText(requireContext);
                editText.setHint(requireContext.getString(2131966663));
                editText.setInputType(ReactTextInputManager.INPUT_TYPE_KEYBOARD_DECIMAL_PAD);
                float f = ((C3LC) A0c.A0D.getValue()).A00.getFloat("CUSTOM_DISK_SPACE_THRESHOLD", 0.0f);
                if (f != 0.0f) {
                    editText.setText(String.valueOf(f));
                }
                linearLayout.addView(editText);
                Button button = new Button(requireContext);
                AbstractC166987dD.A1P(requireContext, button, 2131966667);
                ViewOnClickListenerC48066LPr.A00(button, 48, editText, A0c);
                linearLayout.addView(button);
                AlertDialog.Builder builder = new AlertDialog.Builder(requireContext);
                builder.setView(linearLayout);
                builder.show();
                i = 2017871982;
                C0f9.A0C(i, A05);
                return;
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public static void A01(AbstractC2056898s abstractC2056898s, KCM kcm, String str) {
        abstractC2056898s.A05(str);
        LHn.A00(kcm.A0C()).Crr(new Bundle(), kcm, EnumC46208Kck.A0C);
    }
}
