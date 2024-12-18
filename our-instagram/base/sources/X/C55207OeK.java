package X;

import android.content.Context;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.msys.mci.AccountSession;
import com.facebook.rsys.audio.gen.AudioPipelineContext;
import com.facebook.rsys.audiomodule.gen.AudioModule;
import com.facebook.rsys.callmanager.callclient.gen.CallEndedApi;
import com.facebook.rsys.callmanager.gen.CallManagerClient;
import com.facebook.rsys.crypto.gen.CryptoContextHolder;
import com.facebook.rsys.cryptocontextfactory.gen.CryptoContextFactory;
import com.facebook.rsys.devxagent.gen.DevXAgentApi;
import com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy;
import com.facebook.rsys.media.gen.StreamInfo;
import com.facebook.rsys.overlayconfigmanager.OverlayConfigManagerHolder;
import com.facebook.rsys.videorender.gen.VideoRenderApi;
import com.facebook.xanalytics.XAnalyticsHolder;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.proxies.IGRTCCallManager;
import com.instagram.rtc.rsys.proxies.IGRTCSignalingCoordinator;
import com.instagram.rtc.rsys.proxies.IGRTCSyncedClockHolder;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import org.webrtc.ContextUtils;
import org.webrtc.EglBase;

/* renamed from: X.OeK, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55207OeK {
    public static boolean A0W;
    public AccountSession A00;
    public InterfaceC174767qC A01;
    public C52000Myq A02;
    public OL3 A03;
    public O6B A04;
    public AudioPipelineContext A05;
    public final Context A06;
    public final CallManagerClient A07;
    public final DevXAgentApi A08;
    public final C1K4 A09;
    public final C23324AVj A0A;
    public final C006802i A0B;
    public final UserSession A0C;
    public final RealtimeClientManager A0D;
    public final OId A0E;
    public final C54611OAm A0F;
    public final OVi A0G;
    public final O4Z A0H;
    public final OWf A0I;
    public final C54453O4h A0J;
    public final C214059e4 A0K;
    public final AG0 A0L;
    public final O5J A0M;
    public final OHP A0N;
    public final Map A0O;
    public final java.util.Set A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC16820sZ A0R;
    public final InterfaceC16660sJ A0S;
    public final C19L A0T;
    public final InterfaceC19390xP A0U;
    public final InterfaceC06180Ui A0V;

    public static final boolean A05(C52000Myq c52000Myq, C55207OeK c55207OeK) {
        Integer num;
        EngineModel engineModel;
        if (c52000Myq != null) {
            InterfaceC06180Ui interfaceC06180Ui = c55207OeK.A0V;
            C14360o3.A0B(interfaceC06180Ui, 0);
            C51759Mti c51759Mti = (C51759Mti) AbstractC001800i.A0J(interfaceC06180Ui.Bn0());
            if (c51759Mti != null && (engineModel = (EngineModel) c51759Mti.A00) != null) {
                int i = engineModel.state;
                num = Integer.valueOf(i);
                if (num != null && (i == 4 || i == 0)) {
                    OXE.A00.A00("RtcRsysInteractor", "Current call is ended or idle, clearing it now.");
                    c55207OeK.A06(c52000Myq);
                    return true;
                }
            } else {
                num = null;
            }
            OXE.A00.A00("RtcRsysInteractor", AbstractC167017dG.A0n(num, "Current call not eligible to remove. currentState=", AbstractC166987dD.A1C()));
        }
        return false;
    }

    public final void A07(C55720Oom c55720Oom, String str) {
        C52000Myq c52000Myq = this.A02;
        if (c52000Myq != null) {
            C54552O8e c54552O8e = new C54552O8e(c52000Myq, str);
            EglBase.Context context = C54996OUf.A0m;
            UAG uag = c55720Oom.A01;
            if (uag == null) {
                InterfaceC09390do interfaceC09390do = c55720Oom.A0A;
                uag = new UAG(AbstractC166997dE.A0L(AbstractC166987dD.A0d(interfaceC09390do)), C55720Oom.A0B);
                c55720Oom.A01 = uag;
                C55720Oom.A00(c55720Oom);
                MSW.A0B(interfaceC09390do).addView(uag);
                XB0 xb0 = c55720Oom.A02;
                if (xb0 != null) {
                    c55720Oom.A02 = xb0;
                    UAG uag2 = c55720Oom.A01;
                    if (uag2 != null) {
                        uag2.setVideoSizeChangeListener(xb0);
                    }
                }
                uag.setFirstFrameRendered(c55720Oom.A03);
            }
            UAG.A01(uag, context);
            c55720Oom.A00 = c54552O8e;
            VideoRenderApi videoRenderApi = c54552O8e.A00.A01.A0D.A00;
            C0J8.A03(videoRenderApi, "VideoRenderProxy setApi must be called");
            videoRenderApi.setRenderTarget(c54552O8e.A01, uag, new StreamInfo(1, null));
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.9e4] */
    public /* synthetic */ C55207OeK(final Context context, DevXAgentApi devXAgentApi, C23324AVj c23324AVj, final UserSession userSession, RealtimeClientManager realtimeClientManager, OWf oWf, C54453O4h c54453O4h, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, C19L c19l) {
        OHP ohp = new OHP(userSession);
        OVi oVi = new OVi(userSession);
        C55795Oq5 c55795Oq5 = new C55795Oq5(userSession);
        this.A06 = context;
        this.A0C = userSession;
        this.A0I = oWf;
        this.A0A = c23324AVj;
        this.A0R = interfaceC16820sZ;
        this.A0J = c54453O4h;
        this.A0D = realtimeClientManager;
        this.A0T = c19l;
        this.A0S = interfaceC16660sJ;
        this.A08 = devXAgentApi;
        this.A0N = ohp;
        this.A0G = oVi;
        this.A09 = c55795Oq5;
        this.A0F = new C54611OAm();
        this.A0H = new O4Z(this);
        this.A07 = new C52004Myy(this);
        AnonymousClass057 A00 = C10M.A00(C05F.A00, 1, 0);
        this.A0V = A00;
        this.A0U = A00;
        this.A0M = new O5J(userSession);
        this.A0K = new EnvironmentVariablesProxy(context, userSession) { // from class: X.9e4
            public final Context A00;
            public final UserSession A01;

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            @Override // com.facebook.rsys.environmentvariables.gen.EnvironmentVariablesProxy
            public final String copyValue(int i) {
                C17280tP A0y;
                InterfaceC16530ry interfaceC16530ry;
                C0YR[] c0yrArr;
                char c;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 7) {
                            switch (i) {
                                case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                                    if (AbstractC46488Khm.A01) {
                                        A0y = AbstractC166987dD.A0y();
                                        interfaceC16530ry = A0y.A2W;
                                        c0yrArr = C17280tP.A4G;
                                        c = 247;
                                        break;
                                    }
                                    return null;
                                case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A0H;
                                    c0yrArr = C17280tP.A4G;
                                    c = 242;
                                    break;
                                case 14:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A1I;
                                    c0yrArr = C17280tP.A4G;
                                    c = 244;
                                    break;
                                case Process.SIGTERM /* 15 */:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A2b;
                                    c0yrArr = C17280tP.A4G;
                                    c = 246;
                                    break;
                                case 16:
                                    if (AbstractC46488Khm.A01) {
                                        A0y = AbstractC166987dD.A0y();
                                        interfaceC16530ry = A0y.A2X;
                                        c0yrArr = C17280tP.A4G;
                                        c = 248;
                                        break;
                                    }
                                    return null;
                                case 17:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A0G;
                                    c0yrArr = C17280tP.A4G;
                                    c = 241;
                                    break;
                                case 18:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A1H;
                                    c0yrArr = C17280tP.A4G;
                                    c = 243;
                                    break;
                                case Process.SIGSTOP /* 19 */:
                                    A0y = AbstractC166987dD.A0y();
                                    interfaceC16530ry = A0y.A2a;
                                    c0yrArr = C17280tP.A4G;
                                    c = 245;
                                    break;
                                default:
                                    return null;
                            }
                        } else {
                            return AbstractC166997dE.A0z("%s/%s", Arrays.copyOf(new Object[]{this.A00.getCacheDir().getAbsolutePath(), "RsysLogs"}, 2));
                        }
                    } else {
                        A0y = AbstractC166987dD.A0y();
                        interfaceC16530ry = A0y.A2D;
                        c0yrArr = C17280tP.A4G;
                        c = 213;
                    }
                } else {
                    A0y = AbstractC166987dD.A0y();
                    interfaceC16530ry = A0y.A2C;
                    c0yrArr = C17280tP.A4G;
                    c = 214;
                }
                return (String) interfaceC16530ry.CES(A0y, c0yrArr[c]);
            }

            {
                this.A00 = context;
                this.A01 = userSession;
            }
        };
        this.A0P = AbstractC31171DnF.A0l();
        this.A0L = new AG0();
        this.A0Q = C57548PgM.A00(this, 25);
        this.A0B = C006802i.A0p;
        this.A0E = new OId();
        this.A0O = AbstractC166987dD.A1I();
        ContextUtils.initialize(context.getApplicationContext());
        C55720Oom.A0B = userSession;
    }

    public static final C51759Mti A00(AccountSession accountSession, CryptoContextHolder cryptoContextHolder, C55207OeK c55207OeK) {
        String str;
        OXE oxe = OXE.A00;
        oxe.A00("RtcRsysInteractor", "createCallComponents");
        OWM owm = OWM.A03;
        owm.A01("engine_init_start");
        Context context = c55207OeK.A06;
        C006802i c006802i = c55207OeK.A0B;
        C14360o3.A06(c006802i);
        UserSession userSession = c55207OeK.A0C;
        C73254Xys.A00(context, c006802i, AbstractC54148Nwk.A00(userSession));
        if (!A0W) {
            A0W = true;
            AnonymousClass619.A00();
        }
        O5J o5j = c55207OeK.A0M;
        UserSession userSession2 = o5j.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        int i = 9;
        if (C18U.A06(c06090Tz, userSession2, 36319647909289539L)) {
            i = 25;
        }
        if (C18U.A06(c06090Tz, userSession2, 2342166612788129176L)) {
            i |= 32;
        }
        C55747OpG c55747OpG = (C55747OpG) userSession.A01(C55747OpG.class, C57548PgM.A01(userSession, 26));
        C14360o3.A0B(c55747OpG, 1);
        OverlayConfigManagerHolder createOverlayConfigManager = IGRTCCallManager.CProxy.createOverlayConfigManager(i, c55747OpG);
        C14360o3.A07(createOverlayConfigManager);
        if (C18U.A06(c06090Tz, userSession, 2342161076575016824L)) {
            C214059e4 c214059e4 = c55207OeK.A0K;
            AudioPipelineContext audioPipelineContext = new AudioPipelineContext(null, null, null, null, null, c214059e4.copyValue(16), c214059e4.copyValue(12));
            c55207OeK.A05 = audioPipelineContext;
            c55207OeK.A0F.A01 = AudioModule.CProxy.createImp(audioPipelineContext, createOverlayConfigManager);
        }
        c55207OeK.A00 = accountSession;
        Long BTC = AbstractC166997dE.A0Y(userSession).BTC();
        if (BTC != null) {
            str = BTC.toString();
        } else {
            str = null;
        }
        IGRTCSignalingCoordinator createSignalingCoordinator = IGRTCSignalingCoordinator.CProxy.createSignalingCoordinator(userSession.userId, str, new NUH(c55207OeK), null, i);
        C14360o3.A07(createSignalingCoordinator);
        NUF nuf = new NUF(c55207OeK);
        C60542R6f c60542R6f = new C60542R6f();
        C52014MzI c52014MzI = new C52014MzI(context, AbstractC12220kQ.A01(AbstractC31171DnF.A0D("IGRTCEngine"), userSession), OVd.A00(userSession));
        UtC utC = new UtC(userSession);
        C54611OAm c54611OAm = c55207OeK.A0F;
        O4Z o4z = c55207OeK.A0H;
        CallManagerClient callManagerClient = c55207OeK.A07;
        Map map = (Map) c55207OeK.A0R.invoke();
        XAnalyticsHolder CI3 = c55207OeK.A09.CI3();
        C14360o3.A07(CI3);
        DevXAgentApi devXAgentApi = c55207OeK.A08;
        OId oId = c55207OeK.A0E;
        C51759Mti c51759Mti = new C51759Mti(new C54739OFq(context, callManagerClient, cryptoContextHolder, devXAgentApi, c52014MzI, c60542R6f, createOverlayConfigManager, utC, CI3, c55207OeK.A0A, userSession, oId, c54611OAm, o4z, c55207OeK.A0J, o5j, createSignalingCoordinator, (IGRTCSyncedClockHolder) c55207OeK.A0Q.getValue(), nuf, str, map, MSW.A1E(c55207OeK, 39), MSW.A1E(c55207OeK, 40), c55207OeK.A0S, new C57228PbC(c55207OeK, 11)), createSignalingCoordinator);
        owm.A01("engine_init_end");
        oxe.A00("RtcRsysInteractor", "createCallComponents end");
        return c51759Mti;
    }

    public static final void A01(C55207OeK c55207OeK, InterfaceC16660sJ interfaceC16660sJ) {
        UserSession userSession = c55207OeK.A0C;
        AccountSession A02 = C61A.A02(userSession, !userSession.isStopped());
        C60G c60g = C60G.$redex_init_class;
        C30184DRp c30184DRp = new C30184DRp(23, interfaceC16660sJ, A02, c55207OeK);
        C14360o3.A0B(A02, 1);
        Long BTC = AbstractC166997dE.A0Y(userSession).BTC();
        if (BTC == null) {
            AbstractC47102Krx.A00(new C57750Pjd(30, c30184DRp, A02), userSession);
            return;
        }
        CryptoContextHolder createContextHolderWithAccountSession = CryptoContextFactory.CProxy.createContextHolderWithAccountSession(BTC.longValue(), A02);
        C14360o3.A07(createContextHolderWithAccountSession);
        c30184DRp.invoke(createContextHolderWithAccountSession);
    }

    public static final void A02(C55207OeK c55207OeK, InterfaceC16660sJ interfaceC16660sJ) {
        C52000Myq c52000Myq = c55207OeK.A02;
        if (c52000Myq != null) {
            try {
                c52000Myq.A01.A0g.execute(new PRM(c52000Myq, interfaceC16660sJ));
            } catch (RejectedExecutionException e) {
                C0K8.A0J("RtcCallClient", "Call client rejected execution", e);
            }
        }
    }

    public static final void A03(C55207OeK c55207OeK, InterfaceC16660sJ interfaceC16660sJ) {
        OVi oVi = c55207OeK.A0G;
        if (C18U.A06(C06090Tz.A05, oVi.A01, 36323603575614885L)) {
            C51759Mti c51759Mti = oVi.A00;
            if (c51759Mti != null) {
                C14120nc.A00().ATO(new NGY(c51759Mti, interfaceC16660sJ));
                return;
            }
            return;
        }
        ExecutorService executorService = oVi.A02;
        if (executorService.isShutdown() || executorService.isTerminated()) {
            return;
        }
        try {
            C51759Mti c51759Mti2 = oVi.A00;
            if (c51759Mti2 == null) {
                return;
            }
            executorService.execute(new PRN(c51759Mti2, interfaceC16660sJ));
        } catch (RejectedExecutionException e) {
            C0K8.A0J("RtcCallComponentsExecutor", "Operation execution rejected", e);
        }
    }

    public static final void A04(C55207OeK c55207OeK, InterfaceC16660sJ interfaceC16660sJ, boolean z, boolean z2) {
        OVi oVi;
        int i;
        UserSession userSession = c55207OeK.A0C;
        if (!AbstractC47132Ef.A00(userSession).A02()) {
            oVi = c55207OeK.A0G;
            i = 2;
        } else {
            if (z) {
                if (userSession.isStopped()) {
                    return;
                }
                C28531Zo.A04.A0F(userSession, "RtcRsysInteractor");
                C42221xC A00 = C6AE.A02(userSession, EnumC132075xi.A0i, !userSession.isStopped()).A00();
                BQB bqb = new BQB(19, c55207OeK, interfaceC16660sJ, z2);
                C41761wQ A0S = AbstractC31173DnH.A0S();
                A0S.A02(A00.A0G(), new PKE(2, A0S, bqb));
                return;
            }
            oVi = c55207OeK.A0G;
            i = 3;
        }
        oVi.A01(new C57195Paf(c55207OeK, i), interfaceC16660sJ);
    }

    public final void A06(C52000Myq c52000Myq) {
        String str;
        OXE oxe = OXE.A00;
        C52000Myq c52000Myq2 = this.A02;
        RtcCallKey rtcCallKey = null;
        if (c52000Myq2 != null) {
            str = c52000Myq2.A0A;
        } else {
            str = null;
        }
        oxe.A00("RtcRsysInteractor", AnonymousClass001.A0S("finishCall localCallId: ", str, ' '));
        if (c52000Myq == null) {
            A02(this, C57692Pih.A00);
        } else {
            C54996OUf c54996OUf = c52000Myq.A01;
            CallEndedApi callEndedApi = c54996OUf.A01;
            if (callEndedApi != null) {
                callEndedApi.removeCall();
            }
            RtcCallKey rtcCallKey2 = c54996OUf.A05;
            if (rtcCallKey2 != null) {
                rtcCallKey = rtcCallKey2;
                C55135Oc3 c55135Oc3 = this.A0J.A00.A0K;
                C51881MwP c51881MwP = (C51881MwP) c55135Oc3.A00.A00;
                if (rtcCallKey == null && C14360o3.A0K(c51881MwP.A00, rtcCallKey)) {
                    c55135Oc3.A03();
                    return;
                }
            }
        }
        C52000Myq c52000Myq3 = this.A02;
        if (c52000Myq3 != null) {
            rtcCallKey = c52000Myq3.A01.A05;
        }
        C55135Oc3 c55135Oc32 = this.A0J.A00.A0K;
        C51881MwP c51881MwP2 = (C51881MwP) c55135Oc32.A00.A00;
        if (rtcCallKey == null) {
        }
    }

    public final void A08(InterfaceC16820sZ interfaceC16820sZ) {
        AbstractC52007Mz4 A00;
        C52000Myq c52000Myq = this.A02;
        if (c52000Myq != null && (A00 = C52000Myq.A00(c52000Myq)) != null && !A00.isCameraCurrentlyFacingFront() && A00.isSwitchCameraFacingSupported()) {
            A02(this, C57697Pim.A00);
            interfaceC16820sZ.invoke();
        }
    }

    public final void A09(boolean z) {
        A02(this, new DHP(23, this, z));
    }
}
