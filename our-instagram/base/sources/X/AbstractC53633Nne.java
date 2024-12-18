package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.widget.TextView;
import com.facebook.mediastreaming.bundledservices.LiveStreamSessionProbe;
import com.facebook.mediastreaming.client.livestreaming.LiveStreamingClient;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.modal.ModalActivity;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;

/* renamed from: X.Nne, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53633Nne {
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00ee. Please report as an issue. */
    public final void A00() {
        long j;
        long j2;
        long j3;
        InterfaceC58192Pqy interfaceC58192Pqy;
        AbstractC70118W4q c52245NAj;
        boolean z;
        Runnable runnableC57021PRm;
        InterfaceC58192Pqy interfaceC58192Pqy2;
        AbstractC53633Nne abstractC53633Nne;
        boolean z2;
        AbstractC53633Nne abstractC53633Nne2;
        if (this instanceof C52244NAi) {
            C52244NAi c52244NAi = (C52244NAi) this;
            interfaceC58192Pqy2 = c52244NAi.A01.A0F;
            if (interfaceC58192Pqy2 != null) {
                z2 = c52244NAi.A02;
                abstractC53633Nne2 = c52244NAi.A00;
                interfaceC58192Pqy2.EoX(abstractC53633Nne2, z2);
                return;
            } else {
                AbstractC53633Nne abstractC53633Nne3 = c52244NAi.A00;
                if (abstractC53633Nne3 == null) {
                    return;
                }
                runnableC57021PRm = new PLS(abstractC53633Nne3);
                C11T.A02(runnableC57021PRm);
                return;
            }
        }
        if (this instanceof C52243NAh) {
            C52243NAh c52243NAh = (C52243NAh) this;
            Bundle A0b = AbstractC166987dD.A0b();
            AbstractC53560NmS abstractC53560NmS = c52243NAh.A02;
            C54730OFh c54730OFh = c52243NAh.A01;
            C52918NbD c52918NbD = (C52918NbD) abstractC53560NmS;
            A0b.putString("args.broadcast_id", c52918NbD.A00);
            A0b.putString("args.media_id", c52918NbD.A04);
            A0b.putString("args.server_info", c52918NbD.A06);
            A0b.putString("args.video_call_id", c52918NbD.A07);
            A0b.putString("args.broadcaster_id", c52918NbD.A02);
            A0b.putString("args.invite_type", c52918NbD.A03);
            A0b.putString("args.broadcast_message", c52918NbD.A01);
            A0b.putString("args.tracking_token", c52918NbD.A05);
            A0b.putBoolean("args.live_trace_enabled", false);
            A0b.putStringArrayList("args.tagged_business_partner_ids", c52918NbD.A08);
            InterfaceC174767qC interfaceC174767qC = (InterfaceC174767qC) AbstractC166987dD.A17(c54730OFh.A0C);
            if (interfaceC174767qC != null) {
                A0b.putBoolean("args.camera_front_facing", interfaceC174767qC.CR9());
            }
            UserSession userSession = c54730OFh.A04;
            AbstractC59962oe abstractC59962oe = c52243NAh.A00;
            AbstractC31176DnK.A0d(abstractC59962oe.getActivity(), A0b, userSession, ModalActivity.class, AbstractC111324zv.A00(4842)).A0D(abstractC59962oe, 5151);
            return;
        }
        if (this instanceof C52242NAg) {
            C52242NAg c52242NAg = (C52242NAg) this;
            if (c52242NAg.A00 != 0) {
                PJG pjg = (PJG) c52242NAg.A02;
                int i = pjg.A08;
                float f = 1.0f;
                if (i != 0) {
                    f = (pjg.A09 * 1.0f) / i;
                }
                C55692OoJ c55692OoJ = pjg.A0H;
                C55219Oei.A07("initializeLiveStream", new Object[0]);
                LiveStreamingClient liveStreamingClient = c55692OoJ.A01;
                if (liveStreamingClient != null) {
                    liveStreamingClient.updateAspectRatio(f);
                    c55692OoJ.A02 = C05F.A0C;
                }
                abstractC53633Nne = (AbstractC53633Nne) c52242NAg.A01;
            } else {
                interfaceC58192Pqy2 = ((C53020Ncs) c52242NAg.A02).A07;
                if (interfaceC58192Pqy2 != null) {
                    z2 = true;
                    abstractC53633Nne2 = (AbstractC53633Nne) c52242NAg.A01;
                    interfaceC58192Pqy2.EoX(abstractC53633Nne2, z2);
                    return;
                } else {
                    abstractC53633Nne = (AbstractC53633Nne) c52242NAg.A01;
                    if (abstractC53633Nne == null) {
                        return;
                    }
                }
            }
            abstractC53633Nne.A00();
            return;
        }
        C52241NAf c52241NAf = (C52241NAf) this;
        switch (c52241NAf.A00) {
            case 0:
                return;
            case 1:
                C53021Nct c53021Nct = (C53021Nct) c52241NAf.A01;
                interfaceC58192Pqy = c53021Nct.A0F;
                if (interfaceC58192Pqy == null) {
                    return;
                }
                c52245NAj = new C52245NAj(2, interfaceC58192Pqy, c53021Nct);
                z = true;
                C53021Nct.A01();
                interfaceC58192Pqy.EE8(c52245NAj, z);
                return;
            case 2:
                C53021Nct c53021Nct2 = (C53021Nct) c52241NAf.A01;
                if (c53021Nct2.A0O) {
                    c53021Nct2.A0R = true;
                    return;
                } else {
                    runnableC57021PRm = new RunnableC57021PRm(c53021Nct2.A0D, c53021Nct2);
                    C11T.A02(runnableC57021PRm);
                    return;
                }
            case 3:
                C53021Nct c53021Nct3 = (C53021Nct) c52241NAf.A01;
                DLogTag.LIVE live = DLogTag.LIVE.INSTANCE;
                DLog.d(live, "Completed LiveSwap", new Object[0]);
                PJF pjf = c53021Nct3.A0H;
                if (pjf != null) {
                    c53021Nct3.A0F = pjf;
                    C53021Nct.A06(pjf.A0B, c53021Nct3);
                    pjf.EQ2(c53021Nct3.A0M);
                    c53021Nct3.A0P = false;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (!AbstractC167007dF.A1X(c53021Nct3.A0K, C05F.A0N) && c53021Nct3.A0F != null) {
                        C53021Nct.A06(BroadcastType.A03, c53021Nct3);
                        C53021Nct.A0A(c53021Nct3, C05F.A0Y);
                        AbstractC70118W4q.A02(c53021Nct3.A0B, c53021Nct3.A0J());
                        c53021Nct3.A0B = null;
                        PJG pjg2 = c53021Nct3.A0I;
                        if (pjg2 != null) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            C56805PIw c56805PIw = c53021Nct3.A0a;
                            LiveStreamSessionProbe liveStreamSessionProbe = pjg2.A0H.A00;
                            if (liveStreamSessionProbe != null) {
                                j = liveStreamSessionProbe.getAudioPts();
                            } else {
                                j = 0;
                            }
                            C55692OoJ c55692OoJ2 = pjg2.A0H;
                            LiveStreamSessionProbe liveStreamSessionProbe2 = c55692OoJ2.A00;
                            if (liveStreamSessionProbe2 != null) {
                                j2 = liveStreamSessionProbe2.getVideoPts();
                            } else {
                                j2 = 0;
                            }
                            LiveStreamSessionProbe liveStreamSessionProbe3 = c55692OoJ2.A00;
                            if (liveStreamSessionProbe3 != null) {
                                j3 = liveStreamSessionProbe3.getAudioPtsStreamTime();
                            } else {
                                j3 = 0;
                            }
                            long j4 = elapsedRealtime2 - c53021Nct3.A04;
                            InterfaceC02590Ai A0H = MSY.A0H(c56805PIw.A0N, "ig_broadcast_waterfall");
                            C56805PIw.A06(A0H, c56805PIw, "broadcast_liveswap");
                            AbstractC37301Gc2.A15(A0H, c56805PIw.A0O);
                            C56805PIw.A05(A0H, c56805PIw, (float) c56805PIw.A02);
                            AbstractC37300Gc1.A0l(A0H, c56805PIw.A0A);
                            Double valueOf = Double.valueOf(0.0d);
                            A0H.A8I("audio_buffer_duration_seconds", valueOf);
                            A0H.A8I("video_buffer_duration_seconds", valueOf);
                            A0H.A8I("last_audio_pts", Double.valueOf(((float) j) / 1000.0f));
                            A0H.A8I("last_video_pts", Double.valueOf(((float) j2) / 1000.0f));
                            A0H.A8I("last_audio_pts_streamtime", Double.valueOf(((float) j3) / 1000.0f));
                            A0H.A8I("call_started_to_socket_writability_latency_seconds", Double.valueOf(((float) j4) / 1000.0f));
                            A0H.A8I("call_joined_to_socket_writability_latency_seconds", Double.valueOf(((float) (elapsedRealtime2 - elapsedRealtime)) / 1000.0f));
                            A0H.Cht();
                            C53021Nct.A01();
                            pjg2.EE8(null, false);
                            c53021Nct3.A05 = pjg2.C9p();
                            c53021Nct3.A0I = null;
                        }
                        DLog.d(live, "Complete LiveSwap", new Object[0]);
                        return;
                    }
                    c53021Nct3.A0B = null;
                    return;
                }
                throw AbstractC166997dE.A0g();
            case 4:
                try {
                    C53021Nct c53021Nct4 = (C53021Nct) c52241NAf.A01;
                    PJF A00 = C53021Nct.A00(c53021Nct4);
                    C52241NAf c52241NAf2 = new C52241NAf(c53021Nct4, 3);
                    C53021Nct.A01();
                    A00.CNo(c52241NAf2);
                    c53021Nct4.A04 = SystemClock.elapsedRealtime();
                    return;
                } catch (Exception e) {
                    C53021Nct c53021Nct5 = (C53021Nct) c52241NAf.A01;
                    AbstractC55102ObF.A0C(c53021Nct5, e);
                    C53021Nct.A09(c53021Nct5, e, "2p session creation failed");
                    return;
                }
            case 5:
                C53020Ncs c53020Ncs = (C53020Ncs) c52241NAf.A01;
                interfaceC58192Pqy = c53020Ncs.A07;
                if (interfaceC58192Pqy == null) {
                    return;
                }
                c52245NAj = new C52247NAl(c53020Ncs, 6);
                z = true;
                interfaceC58192Pqy.EE8(c52245NAj, z);
                return;
            default:
                C53020Ncs.A02((C53020Ncs) c52241NAf.A01);
                return;
        }
    }

    public final void A01(Exception exc) {
        C53021Nct c53021Nct;
        String str;
        if (this instanceof C52242NAg) {
            C52242NAg c52242NAg = (C52242NAg) this;
            if (1 - c52242NAg.A00 == 0) {
                ((AbstractC53633Nne) c52242NAg.A01).A01(exc);
                return;
            }
            return;
        }
        if (!(this instanceof C52241NAf)) {
            return;
        }
        C52241NAf c52241NAf = (C52241NAf) this;
        switch (c52241NAf.A00) {
            case 0:
                C66485UJn c66485UJn = (C66485UJn) c52241NAf.A01;
                int i = C3OO.FLAG_ADAPTER_FULLUPDATE;
                TextView textView = c66485UJn.A04;
                textView.setClickable(true);
                textView.setAlpha(1.0f);
                return;
            case 1:
            case 5:
            default:
                return;
            case 2:
                C53021Nct c53021Nct2 = (C53021Nct) c52241NAf.A01;
                AbstractC55102ObF.A0C(c53021Nct2, exc);
                if (exc instanceof C53404Njt) {
                    C53404Njt c53404Njt = (C53404Njt) exc;
                    AbstractC55102ObF.A0B(c53404Njt.A00, c53021Nct2, c53404Njt.A01, exc.getMessage(), exc);
                    return;
                } else {
                    BroadcastFailureType broadcastFailureType = BroadcastFailureType.A03;
                    C14360o3.A0B("ApiInitBroadcast", 1);
                    AbstractC55102ObF.A0B(broadcastFailureType, c53021Nct2, "ApiInitBroadcast", null, exc);
                    return;
                }
            case 3:
                c53021Nct = (C53021Nct) c52241NAf.A01;
                AbstractC55102ObF.A0C(c53021Nct, exc);
                str = "2p session init failed";
                break;
            case 4:
                c53021Nct = (C53021Nct) c52241NAf.A01;
                AbstractC55102ObF.A0C(c53021Nct, exc);
                str = "Stopping 1p session failed";
                break;
            case 6:
                C53020Ncs c53020Ncs = (C53020Ncs) c52241NAf.A01;
                BroadcastFailureType broadcastFailureType2 = BroadcastFailureType.A03;
                String message = exc.getMessage();
                if (message == null) {
                    message = "null_message";
                }
                C53020Ncs.A01(broadcastFailureType2, c53020Ncs, "initLiveStreamingSession", message);
                if (!c53020Ncs.A0G) {
                    return;
                }
                C55085Oah c55085Oah = c53020Ncs.A0J;
                String obj = exc.toString();
                String message2 = exc.getMessage();
                C14360o3.A0B(obj, 0);
                C19260xA c19260xA = new C19260xA();
                C19260xA.A00(c19260xA, obj, "info");
                C19260xA.A00(c19260xA, message2, "errorMessage");
                C19260xA.A00(c19260xA, "GUEST_JOIN_FAILED", "eventName");
                C19260xA.A00(c19260xA, c55085Oah.A02.userId, "multiPartyLiveUserID");
                C19260xA.A00(c19260xA, "ANDROID_BROADCASTER", CacheBehaviorLogger.SOURCE);
                C55085Oah.A00(c19260xA, c55085Oah, "GUEST_JOIN_FAILED", "ERROR", "BROADCASTER");
                return;
        }
        C53021Nct.A09(c53021Nct, exc, str);
    }
}
