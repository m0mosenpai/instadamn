package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.common.dextricks.StringTreeSet;
import com.facebook.forker.Process;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebookpay.offsite.models.message.PayButtonCTAType$Companion;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.user.model.UpcomingEvent;
import go.Seq;
import instagram.features.clips.edit.ClipsEditMetadataController;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;
import instagram.features.stories.fragment.ReelViewerFragment;
import java.io.File;

/* renamed from: X.Ogi, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class DialogInterfaceOnClickListenerC55320Ogi implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public DialogInterfaceOnClickListenerC55320Ogi(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static DialogInterfaceOnClickListenerC55320Ogi A00(Object obj, int i) {
        return new DialogInterfaceOnClickListenerC55320Ogi(obj, i);
    }

    public static void A01(C193328hC c193328hC, CharSequence charSequence, Object obj, String str, String str2) {
        c193328hC.A05 = str;
        c193328hC.A0r(charSequence);
        c193328hC.A0h(new DialogInterfaceOnShowListenerC55325Ogn(obj, 3));
        c193328hC.A0c(new DialogInterfaceOnClickListenerC55320Ogi(obj, 12), str2);
        c193328hC.A0g(new DialogInterfaceOnDismissListenerC55324Ogm(obj, 13));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C52164N6q c52164N6q;
        IGTVUploadViewModel A0b;
        Object obj;
        C50992Mfz c50992Mfz;
        String str;
        boolean z;
        Activity activity;
        AbstractC10360h2 abstractC10360h2;
        C41181vS c41181vS;
        UserSession userSession;
        C55177Odh c55177Odh;
        boolean z2;
        C55626OnB c55626OnB;
        MU0 mu0;
        String str2;
        SZ2 sz2;
        String str3;
        Object obj2;
        Object obj3;
        C19L A0a;
        InterfaceC16620sF c57158PZc;
        Context context;
        C38321qM c38321qM;
        String str4;
        InterfaceC23621Ds interfaceC23621Ds;
        int i2;
        AbstractC52922bZ abstractC52922bZ;
        AbstractC52922bZ A0Z;
        InterfaceC23621Ds interfaceC23621Ds2;
        int i3;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                c52164N6q = ((C56063Oug) this.A01).A01;
                String str5 = MSX.A0R(c52164N6q.A0B).A02;
                File file = AbstractC916948n.A04;
                if (file == null) {
                    file = AbstractC23881Ey.A00().CHo(null, 1511144637);
                    AbstractC916948n.A04 = file;
                }
                InterfaceC09390do interfaceC09390do = c52164N6q.A0D;
                IGTVUploadViewModel A0b2 = MSW.A0b(interfaceC09390do);
                String str6 = A0b2.A0M.A0J;
                if (str6 == null || str6.length() == 0) {
                    A0b2.ESH(A0b2.A02().A02.A33);
                }
                if (str5.length() <= 0) {
                    str5 = null;
                }
                AbstractC166987dD.A1Z(new PZP(file, A0b2.A01(str5), A0b2, null, 9), AbstractC141776au.A00(A0b2));
                A0b2.A0E.getValue();
                A0b = MSW.A0b(interfaceC09390do);
                obj = C52535NMh.A00;
                A0b.A04(c52164N6q, obj);
                return;
            case 2:
                c52164N6q = ((C56063Oug) this.A01).A01;
                A0b = MSW.A0b(c52164N6q.A0D);
                obj = C52531NMd.A00;
                A0b.A04(c52164N6q, obj);
                return;
            case 3:
                NMX nmx = (NMX) this.A01;
                MSW.A0b(nmx.A0Y).A0M.A0E = null;
                MSW.A0c(nmx).A0G = null;
                MSW.A0c(nmx).A0L = null;
                NMX.A09(nmx);
                return;
            case 4:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                NMX nmx2 = (NMX) this.A01;
                C35133Fea.A01(nmx2.requireContext(), AbstractC166987dD.A0r(nmx2.A0W), c35133Fea, new SXK("https://help.instagram.com/270447560766967"), AbstractC166997dE.A0N(nmx2).getString(2131965052));
                return;
            case 5:
                N5U n5u = (N5U) this.A01;
                C23031Ai A10 = AbstractC25226BEj.A10(n5u.A0D);
                AbstractC167007dF.A1L(A10, A10.A7E, C23031Ai.A8c, 168, false);
                if (!n5u.A06) {
                    return;
                }
                C54796OJo A00 = N5U.A00(n5u);
                str2 = n5u.A00;
                C14360o3.A0B(str2, 0);
                sz2 = A00.A03;
                str3 = "warning_settings_toggle_off";
                sz2.A01(str2, str3);
                return;
            case 6:
                android.net.Uri A03 = AbstractC08820cl.A03("https://help.instagram.com/563153788532689");
                N5U n5u2 = (N5U) this.A01;
                C12260kU.A0G(n5u2.requireContext(), A03);
                if (!n5u2.A06) {
                    return;
                }
                C54796OJo A002 = N5U.A00(n5u2);
                str2 = n5u2.A00;
                C14360o3.A0B(str2, 0);
                sz2 = A002.A03;
                str3 = "warning_learn_more_clicked";
                sz2.A01(str2, str3);
                return;
            case 7:
                C54796OJo c54796OJo = (C54796OJo) this.A01;
                dialogInterface.getClass();
                SZ2.A00(c54796OJo.A03, "settings_clear_cancel_clicked", null);
                dialogInterface.dismiss();
                return;
            case 8:
                obj2 = ((C26086BgF) this.A01).A01;
                obj3 = ((C38687GzS) obj2).A00;
                AbstractC166987dD.A1Y(obj3);
                return;
            case 9:
                obj2 = ((C26086BgF) this.A01).A02;
                obj3 = ((C38687GzS) obj2).A00;
                AbstractC166987dD.A1Y(obj3);
                return;
            case 10:
                ((InterfaceC58153PqI) this.A01).Dar();
                return;
            case 11:
                P4Y p4y = (P4Y) ((InterfaceC58153PqI) this.A01);
                int i4 = p4y.A00;
                Object obj4 = p4y.A01;
                if (i4 != 0) {
                    N6C n6c = (N6C) obj4;
                    c50992Mfz = (C50992Mfz) n6c.A0F.getValue();
                    InterfaceC09390do interfaceC09390do2 = n6c.A0G;
                    str = MSW.A0g(interfaceC09390do2).A00;
                    z = MSW.A0g(interfaceC09390do2).A03;
                } else {
                    C52572NNs c52572NNs = (C52572NNs) obj4;
                    c50992Mfz = (C50992Mfz) c52572NNs.A03.getValue();
                    InterfaceC09390do interfaceC09390do3 = c52572NNs.A04;
                    str = ((AbstractC51031Mge) interfaceC09390do3.getValue()).A00;
                    z = ((NP0) interfaceC09390do3.getValue()).A00;
                }
                c50992Mfz.A01(str, z);
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                ((InterfaceC58153PqI) this.A01).DVA();
                return;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                dialogInterface.dismiss();
                AbstractC25228BEl.A1P(this.A01);
                return;
            case 14:
                ((P64) this.A01).A03.Dxf();
                return;
            case Process.SIGTERM /* 15 */:
                AbstractC43594JPz.A1T(((C51001Mg8) ((C52140N5p) this.A01).A02.getValue()).A06);
                return;
            case 16:
                C51001Mg8 c51001Mg8 = (C51001Mg8) ((C52140N5p) this.A01).A02.getValue();
                AbstractC166997dE.A1Y(c51001Mg8.A06, true);
                C51001Mg8.A00(c51001Mg8);
                return;
            case 17:
                MSY.A0T((NQ4) this.A01).A00(new C52636NQj(false, false));
                return;
            case 18:
                AbstractC31177DnL.A12((Fragment) this.A01);
                return;
            case Process.SIGSTOP /* 19 */:
            case 20:
            case 33:
            case 43:
            case 49:
            default:
                obj3 = this.A01;
                AbstractC166987dD.A1Y(obj3);
                return;
            case 21:
                C54802OJw c54802OJw = (C54802OJw) this.A01;
                C38321qM c38321qM2 = c54802OJw.A0C.A0b;
                c38321qM2.getClass();
                UserSession userSession2 = c54802OJw.A0B;
                AbstractC172137li.A03(c54802OJw.A07, userSession2, c38321qM2, AbstractC166987dD.A10(userSession2), C54802OJw.class, c54802OJw.A09.getModuleName());
                return;
            case 22:
            case 23:
            case 26:
            case 27:
                ((C145256gk) this.A01).A00();
                return;
            case 24:
            case 25:
                C55909Os0 c55909Os0 = (C55909Os0) this.A01;
                activity = c55909Os0.A04;
                abstractC10360h2 = c55909Os0.A07;
                c41181vS = c55909Os0.A0F;
                userSession = c55909Os0.A0B;
                new C55084Oag(activity, abstractC10360h2, userSession, c41181vS).A03(null, c41181vS.A0U());
                return;
            case 28:
                C55908Orz c55908Orz = (C55908Orz) this.A01;
                activity = c55908Orz.A01;
                abstractC10360h2 = c55908Orz.A04;
                c41181vS = c55908Orz.A0A;
                userSession = c55908Orz.A07;
                new C55084Oag(activity, abstractC10360h2, userSession, c41181vS).A03(null, c41181vS.A0U());
                return;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                dialogInterface.dismiss();
                return;
            case 30:
                dialogInterface.dismiss();
                OC7 oc7 = (OC7) this.A01;
                oc7.A03.A03(AbstractC166987dD.A10(oc7.A01), "reel_viewer_see_highlights_button");
                return;
            case 31:
                c55177Odh = ((C54460O4o) this.A01).A00.A0H;
                z2 = true;
                c55177Odh.A03(new C56698PEq(z2));
                return;
            case 32:
                c55177Odh = ((C54460O4o) this.A01).A00.A0H;
                z2 = false;
                c55177Odh.A03(new C56698PEq(z2));
                return;
            case 34:
                ((PC2) this.A01).A01.A0M();
                return;
            case 35:
                AbstractC25231BEo.A16((Fragment) this.A01);
                return;
            case 36:
                ((N55) this.A01).A0S = true;
                return;
            case 37:
                ((InterfaceC58068Pot) this.A01).D20();
                return;
            case 38:
                c55626OnB = (C55626OnB) this.A01;
                c55626OnB.A09.Dp0();
                mu0 = MU0.ONE_TIME_OFF;
                C55626OnB.A00(mu0, c55626OnB);
                return;
            case 39:
                c55626OnB = (C55626OnB) this.A01;
                c55626OnB.A09.DmS(c55626OnB.A03, c55626OnB.A08);
                mu0 = MU0.ONE_TIME_ON;
                C55626OnB.A00(mu0, c55626OnB);
                return;
            case 40:
            case Seq.NULL_REFNUM /* 41 */:
                C55626OnB c55626OnB2 = (C55626OnB) this.A01;
                c55626OnB2.A09.D9P(c55626OnB2.A03, c55626OnB2.A08);
                return;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                N6R n6r = ((C55009OVr) this.A01).A02;
                C51626MrJ c51626MrJ = n6r.A03;
                if (c51626MrJ == null) {
                    C14360o3.A0F("viewState");
                    throw C00O.createAndThrow();
                }
                UpcomingEvent upcomingEvent = c51626MrJ.A01;
                if (upcomingEvent == null) {
                    return;
                }
                A0a = AbstractC25229BEm.A0a(n6r);
                c57158PZc = new C57158PZc(upcomingEvent, n6r, null, 20);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 44:
                ((C50988Mfv) ((OBF) this.A01).A02.getValue()).A00(true);
                return;
            case 45:
                AbstractC52922bZ A0Z2 = AbstractC25225BEi.A0Z(((OBH) this.A01).A02);
                A0a = AbstractC141776au.A00(A0Z2);
                interfaceC23621Ds = null;
                i2 = 18;
                abstractC52922bZ = A0Z2;
                c57158PZc = new C57164PZi(abstractC52922bZ, interfaceC23621Ds, i2);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                AbstractC52922bZ A0Z3 = AbstractC25225BEi.A0Z(((OBH) this.A01).A02);
                A0a = AbstractC141776au.A00(A0Z3);
                interfaceC23621Ds = null;
                i2 = 17;
                abstractC52922bZ = A0Z3;
                c57158PZc = new C57164PZi(abstractC52922bZ, interfaceC23621Ds, i2);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 47:
                AbstractC52922bZ A0Z4 = AbstractC25225BEi.A0Z(((C54730OFh) this.A01).A0D);
                EnumC53204Ng2 enumC53204Ng2 = EnumC53204Ng2.A03;
                A0a = AbstractC141776au.A00(A0Z4);
                c57158PZc = new C57169PZn(A0Z4, enumC53204Ng2, null, 42);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 48:
                C50960MfT c50960MfT = (C50960MfT) ((C52834NZr) this.A01).A0E.getValue();
                c50960MfT.A02.A0L(false, false);
                A0a = AbstractC141776au.A00(c50960MfT);
                interfaceC23621Ds = null;
                i2 = 40;
                abstractC52922bZ = c50960MfT;
                c57158PZc = new C57164PZi(abstractC52922bZ, interfaceC23621Ds, i2);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /* 50 */:
                A0Z = AbstractC25225BEi.A0Z(((C56049OuO) this.A01).A0V);
                A0a = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds2 = null;
                i3 = 7;
                c57158PZc = new PZD(A0Z, interfaceC23621Ds2, i3);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 51:
                A0Z = AbstractC25225BEi.A0Z(((N6P) this.A01).A02);
                A0a = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds2 = null;
                i3 = 18;
                c57158PZc = new PZD(A0Z, interfaceC23621Ds2, i3);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 52:
                AbstractC52922bZ A0Z5 = AbstractC25225BEi.A0Z(((N6P) this.A01).A02);
                A0a = AbstractC141776au.A00(A0Z5);
                c57158PZc = new PZY(A0Z5, null, 45);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 53:
                A0Z = AbstractC25225BEi.A0Z(((OyP) this.A01).A0F);
                A0a = AbstractC141776au.A00(A0Z);
                interfaceC23621Ds2 = null;
                i3 = 35;
                c57158PZc = new PZD(A0Z, interfaceC23621Ds2, i3);
                AbstractC166987dD.A1Z(c57158PZc, A0a);
                return;
            case 54:
                C56806PIx c56806PIx = ((OW8) this.A01).A06;
                if (c56806PIx == null) {
                    return;
                }
                c56806PIx.A02(false, false);
                return;
            case 55:
                ((C55092Ob3) this.A01).A0C.A08();
                return;
            case 56:
                C50870Me1 c50870Me1 = (C50870Me1) this.A01;
                c50870Me1.A0E.A0a(c50870Me1.A0B, c50870Me1.A0I, false);
                C8JY c8jy = c50870Me1.A0C;
                C1QT c1qt = c8jy.A02;
                c1qt.flowMarkPoint(c8jy.A01, "SOUND_SYNC_QUITTED");
                c1qt.flowEndCancel(c8jy.A01, CancelReason.USER_CANCELLED);
                c8jy.A01 = 0L;
                boolean z3 = c50870Me1.A0W;
                C8XO c8xo = c50870Me1.A0A;
                if (z3) {
                    c8xo.A00(C8XI.A03);
                    c50870Me1.A07.A0W();
                    return;
                } else {
                    c8xo.A00(C8XI.A04);
                    return;
                }
            case 57:
                ClipsEditMetadataController clipsEditMetadataController = (ClipsEditMetadataController) this.A01;
                AbstractC167007dF.A0x(clipsEditMetadataController.optionsContainer);
                clipsEditMetadataController.A0W = true;
                ClipsEditMetadataController.A0C(clipsEditMetadataController);
                return;
            case 58:
                C448424o c448424o = ((C22C) ((OJ6) this.A01).A02.A02.getValue()).A0C;
                InterfaceC02590Ai A0f = AbstractC166987dD.A0f(c448424o.A01, "ig_camera_nux");
                if (!A0f.isSampled()) {
                    return;
                }
                MSW.A1R(A0f, "SPINS_INVITE_PARTICIPATION");
                A0f.AAP("nux_step", PayButtonCTAType$Companion.CONTINUE);
                AbstractC50522MSa.A1E(A0f, "camera_session_id", MSX.A0f(c448424o.A04));
                MSW.A1Q(A0f);
                MSW.A1M(EnumC50631MWs.A0L, A0f);
                A0f.AAP("ui_text", "get started");
                A0f.A8R(EnumC53336Nim.SPINNABLE_REEL, "spin_type");
                A0f.Cht();
                return;
            case 59:
                ((IgdsListCell) this.A01).setChecked(true);
                return;
            case 60:
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) ((ViewOnClickListenerC55463OkI) this.A01).A01;
                C1ON c1on = reelMoreOptionsFragment.A01;
                if (c1on != null) {
                    c1on.cancel();
                }
                reelMoreOptionsFragment.A0M = false;
                reelMoreOptionsFragment.mSaveButton = null;
                AbstractC25226BEj.A1Q(reelMoreOptionsFragment);
                return;
            case 61:
                ReelViewerFragment reelViewerFragment = (ReelViewerFragment) this.A01;
                C145176gc c145176gc = reelViewerFragment.A3H;
                C41181vS AuU = reelViewerFragment.AuU();
                Fragment fragment = (Fragment) c145176gc.A1B.get();
                if (fragment == null || (context = fragment.getContext()) == null || AuU == null || (c38321qM = AuU.A0b) == null || (str4 = c38321qM.A0c.A01) == null) {
                    return;
                }
                c145176gc.A0E(AuU, "stories_golden_window_tip_boost_tap");
                AbstractC41776Ies.A03(context, str4);
                return;
            case 62:
                ReelViewerFragment reelViewerFragment2 = (ReelViewerFragment) this.A01;
                reelViewerFragment2.A3H.A0E(reelViewerFragment2.AuU(), "stories_golden_window_tip_dismiss_tap");
                return;
            case StringTreeSet.PAYLOAD_MASK /* 63 */:
                C56255Oy2 c56255Oy2 = (C56255Oy2) this.A01;
                AbstractC23021Ah.A00(c56255Oy2.A0C).A14("reel", false);
                C56255Oy2.A04(c56255Oy2);
                dialogInterface.dismiss();
                return;
        }
    }
}
