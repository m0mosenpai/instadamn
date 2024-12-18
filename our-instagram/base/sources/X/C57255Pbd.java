package X;

import android.app.Activity;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.os.Handler;
import android.view.View;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.payments.dcp.xapp.controller.InAppPurchaseControllerCoro;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.opal.impl.data.OpalProfileData;
import com.instagram.partneranalytics.simcarrier.SimCarrierInfoLogger;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.service.upload.armadilloexpress.RenderVideoStep;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import go.Seq;

/* renamed from: X.Pbd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57255Pbd extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57255Pbd(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v51, types: [X.Np4, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, X.NkG] */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C38321qM c38321qM;
        AbstractC12990ll abstractC12990ll;
        InterfaceC16660sJ interfaceC16660sJ;
        Object value;
        IGFOAMessagingSendToSentLogger A00;
        IGFOAMessagingSendToSentLogger A002;
        OpalProfileData opalProfileData;
        InterfaceC09390do interfaceC09390do;
        C07N c07n;
        Object invoke;
        switch (this.A00) {
            case 0:
            case 1:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A02;
                value = ((CSX) this.A01).A01;
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case 2:
                return new C94T((UserSession) this.A02);
            case 3:
                C006802i A0N = AbstractC43592JPx.A0N();
                ((OFK) this.A02).A09.getValue();
                return new C73673Rt(A0N, 424096228);
            case 4:
                OFK ofk = (OFK) this.A02;
                AnonymousClass945 anonymousClass945 = (AnonymousClass945) ofk.A09.getValue();
                InterfaceC73623Ro interfaceC73623Ro = (InterfaceC73623Ro) this.A01;
                InterfaceC73523Rd interfaceC73523Rd = (InterfaceC73523Rd) ofk.A08.getValue();
                return new C3SC(interfaceC73623Ro, (C3SB) ofk.A00.getValue(), (C23381AYf) ofk.A02.getValue(), (C73673Rt) ofk.A06.getValue(), interfaceC73523Rd, anonymousClass945, (InterfaceExecutorServiceC73393Qq) AbstractC166987dD.A17(ofk.A05));
            case 5:
                InterfaceC09390do interfaceC09390do2 = ((OFK) this.A02).A09;
                InterfaceC10260gi interfaceC10260gi = ((AnonymousClass945) interfaceC09390do2.getValue()).A00;
                if (interfaceC10260gi != null && interfaceC10260gi.AhA(2342163327138406758L)) {
                    interfaceC09390do = new OC3((AnonymousClass945) interfaceC09390do2.getValue()).A01;
                } else {
                    interfaceC09390do = ((ODF) this.A01).A03;
                }
                return interfaceC09390do.getValue();
            case 6:
                return new C94Z((UserSession) this.A02, (Context) this.A01);
            case 7:
                C3RU c3ru = (C3RU) this.A01;
                if (c3ru.CbO()) {
                    return new C55712Ooe(new Object(), AbstractC53716Np5.A00((UserSession) this.A02), c3ru);
                }
                InterfaceC16660sJ interfaceC16660sJ2 = C57652Pi3.A00;
                InterfaceC16660sJ interfaceC16660sJ3 = C57653Pi4.A00;
                InterfaceC16660sJ interfaceC16660sJ4 = C57654Pi5.A00;
                InterfaceC16660sJ interfaceC16660sJ5 = C57655Pi6.A00;
                InterfaceC16660sJ interfaceC16660sJ6 = C57651Pi2.A00;
                long BUS = c3ru.BUS();
                if (BUS != 1) {
                    if (BUS == 2) {
                        interfaceC16660sJ2 = interfaceC16660sJ3;
                    } else if (BUS == 3) {
                        interfaceC16660sJ2 = interfaceC16660sJ4;
                    } else {
                        interfaceC16660sJ2 = interfaceC16660sJ6;
                        if (BUS == 4) {
                            interfaceC16660sJ2 = interfaceC16660sJ5;
                        }
                    }
                }
                return new C55710Ooc(interfaceC16660sJ2);
            case 8:
                return new C94V((UserSession) this.A02);
            case 9:
                return new C2KI((UserSession) this.A02, (Context) this.A01);
            case 10:
                return new C64479TFp((UserSession) this.A02, (Context) this.A01);
            case 11:
                ((View.OnClickListener) this.A01).onClick((View) ((C15370ps) this.A02).A00);
                return C0eB.A00;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 16:
            case 17:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
            case 31:
            case 36:
            case 38:
            case 39:
            case 40:
            default:
                InterfaceC16820sZ interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                if (interfaceC16820sZ == null || (invoke = interfaceC16820sZ.invoke()) == null) {
                    InterfaceC018407e A0i = AbstractC25228BEl.A0i(this.A02);
                    if ((A0i instanceof C07N) && (c07n = (C07N) A0i) != null) {
                        return c07n.getDefaultViewModelCreationExtras();
                    }
                    return C52962bd.A00;
                }
                return invoke;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                InterfaceC74953Yl interfaceC74953Yl = (InterfaceC74953Yl) this.A01;
                Boolean A0b = AbstractC166997dE.A0b();
                interfaceC74953Yl.Egh(A0b);
                C23031Ai A003 = AbstractC23021Ah.A00((UserSession) this.A02);
                AbstractC31171DnF.A1S(A003, A0b, A003.A4L, C23031Ai.A8c, 455);
                return C0eB.A00;
            case 14:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                value = ((C26224Bio) ((InterfaceC30950Dj7) this.A02)).A00;
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case Process.SIGTERM /* 15 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                opalProfileData = ((C26073Bg2) this.A02).A05;
                value = opalProfileData.A05;
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case 18:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                opalProfileData = (OpalProfileData) this.A02;
                value = opalProfileData.A05;
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                UserSession userSession = (UserSession) this.A02;
                AbstractC167007dF.A18(AbstractC23021Ah.A00(userSession).A01, "opal_main_profile_tease_animation_count", AbstractC31172DnG.A01(AbstractC166987dD.A0x(userSession), "opal_main_profile_tease_animation_count") + 1);
                AbstractC43593JPy.A1Q(this.A01);
                return C0eB.A00;
            case 20:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                value = this.A02;
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case 21:
                return new C2KY((Context) this.A01, (UserSession) this.A02);
            case 22:
                return new SimCarrierInfoLogger((Context) this.A01, C12L.A00, (UserSession) this.A02);
            case 30:
                UserSession userSession2 = (UserSession) this.A02;
                C63222SfT c63222SfT = new C63222SfT(new C64102SzJ((Context) this.A01, AbstractC12220kQ.A02(userSession2), OSN.A00));
                C19K A0v = MSY.A0v();
                return new C56138Ovy(new InAppPurchaseControllerCoro(c63222SfT, new C54755OHk(), new C54756OHl(), new R24(userSession2), new Object(), new OHA(userSession2), AbstractC54072NvW.A00(userSession2), A0v));
            case 32:
            case 34:
                ((C47Z) this.A02).A0X((C50729MaV) this.A01);
                return C0eB.A00;
            case 33:
                RenderVideoStep renderVideoStep = (RenderVideoStep) this.A02;
                OXD oxd = (OXD) this.A01;
                C47Z c47z = oxd.A0C;
                if (c47z.A3V == null) {
                    if (c47z.A5V || (c47z.A1G == EnumC40111tc.A0a && c47z.A0D() == ShareType.A0E)) {
                        UserSession userSession3 = renderVideoStep.A00;
                        C06090Tz c06090Tz = C06090Tz.A05;
                        if (C18U.A06(c06090Tz, userSession3, 2342161871151700686L)) {
                            if (!c47z.A61) {
                                c47z.A1N.A00();
                            }
                            InterfaceC70363Du interfaceC70363Du = renderVideoStep.A01;
                            C45120Jxp c45120Jxp = null;
                            interfaceC70363Du.EHi(c47z, null);
                            if (C18U.A06(c06090Tz, userSession3, 36320798960919451L)) {
                                c45120Jxp = AbstractC53749Nq1.A00(userSession3);
                            }
                            c47z.A60 = C18U.A06(c06090Tz, userSession3, 2342163808174678940L);
                            c47z.A61 = C18U.A06(c06090Tz, userSession3, 2342163808174678940L);
                            Integer num = c47z.A2G;
                            if (AbstractC54104Nw2.A00(oxd.A0A, c45120Jxp, oxd.A0B, c47z, C05F.A01)) {
                                if (num != null && (A002 = C163307Sp.A00(userSession3, num.intValue())) != null) {
                                    A002.onLogRenderVideoSuccess();
                                }
                                interfaceC70363Du.EHj(c47z);
                            } else {
                                if (num != null && (A00 = C163307Sp.A00(userSession3, num.intValue())) != null) {
                                    A00.onLogRenderVideoFailed();
                                }
                                interfaceC70363Du.EHh(null, c47z, "", "", null);
                                return new NRJ(C115445Ke.A01(EnumC115415Kb.A0D, "render failed", null, null));
                            }
                        }
                    }
                    c47z.A0g(c47z.A1N.A0F);
                }
                return NRL.A00;
            case 35:
                return new MediaScannerConnection((Context) this.A01, (C55340Oh5) this.A02);
            case 37:
                C26839Bt1 c26839Bt1 = (C26839Bt1) this.A01;
                String str = ((C26001Bep) this.A02).A01;
                C14360o3.A0B(str, 0);
                C140966Yy A0c = AbstractC25231BEo.A0c(c26839Bt1.requireActivity(), c26839Bt1.A00);
                A0c.A08();
                IgFragmentFactoryImpl.A00();
                C35028Fc1 c35028Fc1 = new C35028Fc1();
                c35028Fc1.A0B = str;
                A0c.A0D(c35028Fc1.A02());
                A0c.A04();
                return C0eB.A00;
            case Seq.NULL_REFNUM /* 41 */:
                ((InterfaceC16660sJ) this.A02).invoke(((User) this.A01).getUsername());
                return C0eB.A00;
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                interfaceC16660sJ = (InterfaceC16660sJ) this.A01;
                value = ((InterfaceC74953Yl) this.A02).getValue();
                interfaceC16660sJ.invoke(value);
                return C0eB.A00;
            case 43:
                Handler handler = (Handler) this.A01;
                final InterfaceC16820sZ interfaceC16820sZ2 = (InterfaceC16820sZ) this.A02;
                handler.postAtFrontOfQueue(new Runnable(interfaceC16820sZ2) { // from class: X.2ZP
                    public final /* synthetic */ InterfaceC16820sZ A00;

                    {
                        C14360o3.A0B(interfaceC16820sZ2, 1);
                        this.A00 = interfaceC16820sZ2;
                    }

                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.A00.invoke();
                    }
                });
                return C0eB.A00;
            case 44:
                return new AnonymousClass122((AbstractC12280kW) this.A02, (C17090t4) this.A01);
            case 45:
                Activity activity = (Activity) this.A01;
                if (activity != null) {
                    AbstractC47193KtS.A01.A05(activity, (UserSession) this.A02, AbstractC111324zv.A00(2506), "self_expanded_profile_picture");
                }
                return C0eB.A00;
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                NoteBubbleView noteBubbleView = (NoteBubbleView) this.A02;
                C152716tz.A03(noteBubbleView, (View) this.A01, noteBubbleView.getTextView().getLineCount(), false);
                return C0eB.A00;
            case 47:
                C38321qM c38321qM2 = (C38321qM) this.A01;
                c38321qM2.A0C.ERa(C16930sl.A00);
                abstractC12990ll = (AbstractC12990ll) this.A02;
                c38321qM = c38321qM2;
                c38321qM.AEH(abstractC12990ll);
                return C0eB.A00;
            case 48:
                C38321qM c38321qM3 = (C38321qM) this.A01;
                UserSession userSession4 = (UserSession) this.A02;
                c38321qM3.A0C.ERa(AbstractC166987dD.A1J(userSession4.userId));
                abstractC12990ll = userSession4;
                c38321qM = c38321qM3;
                c38321qM.AEH(abstractC12990ll);
                return C0eB.A00;
        }
    }
}
