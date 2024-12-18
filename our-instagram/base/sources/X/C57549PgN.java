package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import androidx.media.AudioAttributesCompat;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.facebook.rendercore.text.RCTextView;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdk;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;
import com.facebook.rsys.callcontext.gen.CallContext;
import com.facebook.rsys.roomtypecalling.gen.CallingAppContextUtils;
import com.facebook.rtc.notification.RtcNotificationForegroundService;
import com.facebook.smartcapture.view.IdCaptureBaseActivity;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.realtimeclient.RealtimeClientManager;
import go.Seq;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.PgN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C57549PgN extends C0YY implements InterfaceC16820sZ {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C57549PgN(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static InterfaceC09390do A00(Object obj, EnumC09460dv enumC09460dv, int i) {
        return AbstractC09440dt.A00(enumC09460dv, new C57549PgN(obj, i));
    }

    public static C17050sx A01(Object obj, int i) {
        return AbstractC09440dt.A01(new C57549PgN(obj, i));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // X.InterfaceC16820sZ
    public final /* bridge */ /* synthetic */ Object invoke() {
        C08440c8 c08440c8;
        InterfaceC16820sZ interfaceC16820sZ;
        C55193Odz c55193Odz;
        switch (this.A00) {
            case 0:
                StringBuilder A1C = AbstractC166987dD.A1C();
                A1C.append("Could not find the extension ");
                return AbstractC166997dE.A0v(this.A01, A1C);
            case 1:
                return C0eB.A00;
            case 2:
                BZD bzd = (BZD) this.A01;
                bzd.A04 = null;
                bzd.A03 = null;
                bzd.A00.setEmpty();
                C1WN A00 = C59232nO.A00();
                Object drawable = bzd.getDrawable();
                C14360o3.A0C(drawable, "null cannot be cast to non-null type com.facebook.fresco.vito.core.FrescoDrawableInterface");
                A00.EEL((InterfaceC59242nQ) drawable);
                return C0eB.A00;
            case 3:
                ((RCTextView) this.A01).A04();
                return C0eB.A00;
            case 4:
                return new C55004OVk((UserSession) this.A01);
            case 5:
                UserSession userSession = ((C55004OVk) this.A01).A00;
                Context context = AbstractC12290kX.A00;
                C14360o3.A07(context);
                return new C54776OIp(userSession, context);
            case 6:
                C08730cb c08730cb = C17060sy.A01;
                C55004OVk c55004OVk = (C55004OVk) this.A01;
                Long BTC = c08730cb.A01(c55004OVk.A00).BTC();
                if (BTC != null) {
                    return new MetaAiRsysSdk((C54776OIp) c55004OVk.A01.getValue(), AbstractC43592JPx.A0y(BTC), C12L.A00.AOT(-18, 3));
                }
                throw AbstractC166997dE.A0g();
            case 7:
                return RealtimeClientManager.getInstance(((C54776OIp) this.A01).A01);
            case 8:
                return ((C51999Myp) this.A01).A07.invoke();
            case 9:
                PregenerateSdpWrapper pregenerateSdpWrapper = (PregenerateSdpWrapper) this.A01;
                C14360o3.A0C(pregenerateSdpWrapper, "null cannot be cast to non-null type com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper");
                return pregenerateSdpWrapper.A00;
            case 10:
                String str = ((MetaAiRsysSdk) this.A01).A03;
                C14360o3.A0B(str, 0);
                CallContext createCallContext = CallingAppContextUtils.CProxy.createCallContext(str, null, null, 0, null, null, null, null, null, null, null, null, true, null);
                C14360o3.A07(createCallContext);
                return createCallContext;
            case 11:
                return new OBU(((MetaAiRsysSdkRealTimeSession) this.A01).A01.A05).A02;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return ((MetaAiRsysSdkRealTimeSession) this.A01).A02.A00;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return new OEE(((MetaAiRsysSdkRealTimeSession) this.A01).A01.A05);
            case 14:
                Object systemService = ((Context) this.A01).getApplicationContext().getSystemService(NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
                if (systemService instanceof BluetoothManager) {
                    return systemService;
                }
                return null;
            case Process.SIGTERM /* 15 */:
                return C1CZ.A00((Context) this.A01, null);
            case 16:
                return new C50747Mb5((C55193Odz) this.A01);
            case 17:
                c55193Odz = (C55193Odz) this.A01;
                AudioAttributesCompat audioAttributesCompat = C55193Odz.A0M;
                Queue queue = c55193Odz.A09;
                if (!queue.isEmpty()) {
                    Object remove = queue.remove();
                    if (remove != null) {
                        c55193Odz.A05((C54832OLr) remove, false);
                        return C0eB.A00;
                    }
                    throw AbstractC166987dD.A14("Required value was null.");
                }
                c55193Odz.A04();
                return C0eB.A00;
            case 18:
                C55193Odz c55193Odz2 = (C55193Odz) this.A01;
                AudioAttributesCompat audioAttributesCompat2 = C55193Odz.A0M;
                c55193Odz2.A07.A00("MediaPlayer prepared", new Object[0]);
                C54832OLr c54832OLr = c55193Odz2.A00;
                if (c54832OLr != null) {
                    c55193Odz2.A06.Emj(c54832OLr);
                }
                return C0eB.A00;
            case Process.SIGSTOP /* 19 */:
                c55193Odz = (C55193Odz) this.A01;
                c55193Odz.A04();
                return C0eB.A00;
            case 20:
                return null;
            case 21:
                C55188Odt c55188Odt = (C55188Odt) this.A01;
                C55188Odt.A01(c55188Odt);
                AbstractC53622NnT abstractC53622NnT = c55188Odt.A02;
                if (abstractC53622NnT != null) {
                    C55188Odt.A00(abstractC53622NnT, c55188Odt, false, false);
                }
                return C0eB.A00;
            case 22:
                return ((C55188Odt) this.A01).A0K.invoke();
            case 23:
                OXE.A00.A00("RtcNotificationForegroundService", "Now safe to start foreground");
                RtcNotificationForegroundService rtcNotificationForegroundService = (RtcNotificationForegroundService) this.A01;
                InterfaceC57898Pm2 interfaceC57898Pm2 = rtcNotificationForegroundService.A00;
                if (interfaceC57898Pm2 != null) {
                    interfaceC57898Pm2.cancel();
                }
                rtcNotificationForegroundService.A00 = null;
                Integer num = rtcNotificationForegroundService.A03;
                if (num != null && rtcNotificationForegroundService.A02 == null) {
                    C23821Ep c23821Ep = new C23821Ep(rtcNotificationForegroundService);
                    c23821Ep.A00.cancel(null, num.intValue());
                }
                interfaceC16820sZ = rtcNotificationForegroundService.A04;
                if (interfaceC16820sZ == null) {
                    throw AbstractC166997dE.A0g();
                }
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 24:
                interfaceC16820sZ = (InterfaceC16820sZ) this.A01;
                interfaceC16820sZ.invoke();
                return C0eB.A00;
            case 25:
                return AbstractC166997dE.A0c(C06090Tz.A05, ((C55093Ob4) this.A01).A01, 36325184122270555L);
            case 26:
                return new C55039OZl(((C55093Ob4) this.A01).A00, C57294PcG.A00);
            case 27:
                LinkedHashSet A0l = AbstractC31171DnF.A0l();
                Iterator A1J = AbstractC25226BEj.A1J(((C51760Mtj) this.A01).A02);
                while (A1J.hasNext()) {
                    A0l.add(Long.valueOf(((C51681MsC) A1J.next()).A02));
                }
                return A0l;
            case 28:
                N0V n0v = (N0V) ((Q8F) this.A01);
                C08460cA A002 = C08460cA.A00();
                C08610cP c08610cP = n0v.A00;
                C04240Kq A003 = C08610cP.A00(n0v);
                int i = A002.A00;
                if (android.os.Process.myUid() == i) {
                    AtomicReference atomicReference = A003.A02;
                    c08440c8 = (C08440c8) atomicReference.get();
                    if (c08440c8 == null) {
                        c08440c8 = new C08440c8(C0LG.A00(A003.A00, i, false), A003.A01.getAndIncrement());
                        atomicReference.set(c08440c8);
                    }
                } else {
                    c08440c8 = new C08440c8(C0LG.A00(A003.A00, i, false), A003.A01.getAndIncrement());
                }
                C08610cP.A01(n0v, null, c08440c8.A00, c08610cP);
                return C0eB.A00;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /* 29 */:
                String A004 = C0KB.A00(this.A01);
                C14360o3.A07(A004);
                return AnonymousClass001.A0g("View hash: ", A004, " - size: 0 (cards cleared)");
            case 30:
                return ((IdCaptureBaseActivity) this.A01).A01().A02().ALD();
            case 31:
                return WYZ.A00((WYZ) this.A01);
            case 32:
                throw ((Throwable) this.A01);
            case 33:
                return ((AbstractC54840OMe) this.A01).A05(false);
            case 34:
                return new N17((C54995OUe) this.A01);
            case 35:
                return new N18((C54995OUe) this.A01);
            case 36:
                C65705Tsd.A08.A05.A09(((OKR) this.A01).A00);
                return C0eB.A00;
            case 37:
                C65705Tsd.A08.A05.A0A(((OKR) this.A01).A00);
                return C0eB.A00;
            case 38:
                return new OKR(new Oq2(this.A01, 0));
            case 39:
                return AbstractC40691uc.A01((UserSession) this.A01);
            case 40:
                return C006802i.A0p;
            case Seq.NULL_REFNUM /* 41 */:
                C006802i c006802i = (C006802i) ((InterfaceC09390do) this.A01).getValue();
                C14360o3.A07(c006802i);
                return new AnonymousClass954(c006802i);
            case Seq.RefTracker.REF_OFFSET /* 42 */:
                return new AnonymousClass952((UserSession) this.A01);
            case 43:
                Object obj = this.A01;
                C14360o3.A0B(obj, 0);
                return new AnonymousClass955((InterfaceC19630xq) A01(obj, 45).getValue());
            case 44:
                return new AnonymousClass953((C40701ud) ((InterfaceC09390do) this.A01).getValue());
            case 45:
                return C1AT.A01((UserSession) this.A01).A04(C1AV.A3d, AnonymousClass955.class);
            case JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN /* 46 */:
                return Boolean.valueOf(((C67752UxP) this.A01).D7Z());
            case 47:
                Wap A0H = AbstractC43592JPx.A0H();
                LoggingContext loggingContext = ((UFX) this.A01).A1P;
                Wap.A03(AbstractC31171DnF.A0A(MSY.A0H(A0H.A00, "client_load_ecpemailoptin_fail"), 66), loggingContext, new C65022Tc8(null, loggingContext, "email_optin", 28));
                return C0eB.A00;
            case 48:
                Wap A0H2 = AbstractC43592JPx.A0H();
                UFX ufx = (UFX) this.A01;
                LoggingContext loggingContext2 = ufx.A1P;
                Throwable th = ufx.A0S.A02;
                LinkedHashMap A1I = AbstractC166987dD.A1I();
                if (th != null) {
                    A1I.put("error_message", C2Ql.A00(th));
                }
                A0H2.A0d(loggingContext2, "pux_checkout", A1I);
                return C0eB.A00;
            default:
                ((UFX) this.A01).A1R.A0K();
                return C0eB.A00;
        }
    }
}
