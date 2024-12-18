package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import com.facebook.common.dextricks.OptSvcAnalyticsStore;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.video.common.livestreaming.LiveStreamingError;
import com.instagram.common.api.base.CacheBehaviorLogger;
import com.instagram.common.session.UserSession;
import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.video.live.mvvm.model.enums.IgLiveBroadcastType;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import com.instagram.video.live.streaming.common.BroadcastType;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Nct, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53021Nct extends AbstractC55102ObF implements InterfaceC58006Pnq {
    public static final long A0k = TimeUnit.SECONDS.toMillis(20);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Bitmap A06;
    public Bitmap A07;
    public SurfaceTexture A08;
    public Surface A09;
    public AbstractC53633Nne A0A;
    public AbstractC70118W4q A0B;
    public OL3 A0C;
    public N3J A0D;
    public PJC A0E;
    public InterfaceC58192Pqy A0F;
    public C55142Ocx A0G;
    public PJF A0H;
    public PJG A0I;
    public Integer A0J;
    public Integer A0K;
    public List A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public final AbstractC018607g A0V;
    public final OVc A0W;
    public final C54845OMq A0X;
    public final InterfaceC11380iw A0Y;
    public final OL4 A0Z;
    public final C56805PIw A0a;
    public final C55085Oah A0b;
    public final C54732OFj A0c;
    public final OJW A0d;
    public final InterfaceC58089PpE A0e;
    public final InterfaceC16660sJ A0f;
    public final InterfaceC16600sD A0g;
    public final C19L A0h;
    public final boolean A0i;
    public final C54494O5w A0j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C53021Nct(Context context, AbstractC018607g abstractC018607g, C54845OMq c54845OMq, InterfaceC174767qC interfaceC174767qC, C1815383g c1815383g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, OL4 ol4, C56805PIw c56805PIw, C55085Oah c55085Oah, C54732OFj c54732OFj, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16600sD interfaceC16600sD, C19L c19l, boolean z) {
        super(context, interfaceC174767qC, c1815383g, userSession);
        AbstractC25229BEm.A1J(userSession, 2, c1815383g);
        this.A0Y = interfaceC11380iw;
        this.A0V = abstractC018607g;
        this.A0h = c19l;
        this.A0a = c56805PIw;
        this.A0b = c55085Oah;
        this.A0c = c54732OFj;
        this.A0U = z;
        this.A0X = c54845OMq;
        this.A0Z = ol4;
        this.A0g = interfaceC16600sD;
        this.A0f = interfaceC16660sJ;
        this.A0i = C18U.A06(C06090Tz.A05, userSession, 36310877586063710L);
        this.A0D = new N3J();
        Integer num = C05F.A00;
        this.A0J = num;
        this.A0K = num;
        this.A0O = true;
        this.A0L = C16930sl.A00;
        this.A0e = new PJE(userSession, this);
        long j = A0k;
        this.A0d = new OJW(new PJA(this), new MW9(this, 9), j);
        this.A0W = new OVc(new O6A(userSession));
        this.A0d.A00 = true;
        this.A0j = (C54494O5w) OQX.A01(interfaceC11380iw, userSession).A02.getValue();
        if (c54845OMq != null) {
            c54845OMq.A04(new N1N(this, 4), "IgLiveStreamingController");
        }
    }

    public static final PJF A00(C53021Nct c53021Nct) {
        float A0H;
        float A09;
        PJF pjf = c53021Nct.A0H;
        if (pjf == null) {
            Context context = ((AbstractC55102ObF) c53021Nct).A05;
            UserSession userSession = ((AbstractC55102ObF) c53021Nct).A07;
            String str = c53021Nct.A0D.A0C;
            Pair pair = ((OW7) OYB.A00(userSession).A01.getValue()).A07;
            if (pair == null) {
                A0H = c53021Nct.A02;
                A09 = c53021Nct.A03;
            } else {
                A0H = AbstractC166987dD.A0H(pair.second);
                Object obj = pair.first;
                C14360o3.A06(obj);
                A09 = AbstractC166987dD.A09(obj);
            }
            float f = c53021Nct.A0D.A0A;
            O9F o9f = new O9F(AbstractC166987dD.A0B(f, 0.5f) * 2, AbstractC166987dD.A0B(f * (A0H / A09), 0.5f) * 2);
            InterfaceC174767qC interfaceC174767qC = ((AbstractC55102ObF) c53021Nct).A06;
            OL3 ol3 = c53021Nct.A0C;
            if (ol3 == null) {
                C14360o3.A0F("previewProvider");
                throw C00O.createAndThrow();
            }
            PJF pjf2 = new PJF(context, interfaceC174767qC, userSession, ol3, c53021Nct.A0b, c53021Nct.A0e, o9f, str, true);
            pjf2.A05 = c53021Nct.A0D.A0K;
            c53021Nct.A0H = pjf2;
            return pjf2;
        }
        return pjf;
    }

    public static final void A03(AbstractC53633Nne abstractC53633Nne, C53021Nct c53021Nct, Integer num, String str, boolean z) {
        Integer num2;
        if (c53021Nct.A0K == C05F.A0C) {
            OJW ojw = c53021Nct.A0d;
            if (!ojw.A00) {
                ojw.A00 = true;
                C55142Ocx c55142Ocx = c53021Nct.A0G;
                if (c55142Ocx != null) {
                    c55142Ocx.A04();
                }
                c53021Nct.A04(abstractC53633Nne, z);
                C56805PIw c56805PIw = c53021Nct.A0a;
                c56805PIw.A0L.removeCallbacks(c56805PIw.A0S);
                C56805PIw.A0A(c56805PIw);
                int intValue = num.intValue();
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 4) {
                            num2 = C05F.A00;
                        } else {
                            num2 = C05F.A05;
                        }
                    } else {
                        num2 = C05F.A0Y;
                    }
                } else {
                    num2 = C05F.A02;
                }
                C14360o3.A0B(num2, 0);
                if (num2 == C05F.A05) {
                    c56805PIw.A0Y.incrementAndGet();
                }
                AbstractC50523MSb.A15(C56805PIw.A03(c56805PIw, C05F.A0u), OQV.A00(num2), str);
                c53021Nct.A0M(num);
            }
        }
    }

    public static final void A05(ODP odp, C53021Nct c53021Nct) {
        C73314Y4c c73314Y4c = ((AbstractC55102ObF) c53021Nct).A09;
        c73314Y4c.A09.obtainMessage(2, odp.A03, odp.A02, null).sendToTarget();
        OYB.A00(((AbstractC55102ObF) c53021Nct).A07).A01(MSY.A0D(Integer.valueOf(odp.A01), odp.A00), null, null);
    }

    public static final void A06(BroadcastType broadcastType, C53021Nct c53021Nct) {
        C56805PIw c56805PIw = c53021Nct.A0a;
        String name = broadcastType.name();
        C14360o3.A0B(name, 0);
        c56805PIw.A09 = name;
        OYB.A00(((AbstractC55102ObF) c53021Nct).A07).A00(null, null, null, null, null, null, null, name);
        C14360o3.A0B(broadcastType.toString(), 1);
    }

    public static final void A07(C53021Nct c53021Nct) {
        Surface surface;
        IgLiveBroadcastType igLiveBroadcastType;
        String str;
        if (c53021Nct.A0K == C05F.A00) {
            Integer num = C05F.A01;
            c53021Nct.A0K = num;
            if (c53021Nct.A0i) {
                igLiveBroadcastType = IgLiveBroadcastType.A02;
            } else {
                igLiveBroadcastType = IgLiveBroadcastType.A04;
            }
            int i = c53021Nct.A03;
            int i2 = c53021Nct.A02;
            C56805PIw c56805PIw = c53021Nct.A0a;
            c56805PIw.A01 = SystemClock.elapsedRealtime();
            C25531Mh A0A = AbstractC31171DnF.A0A(MSY.A0H(c56805PIw.A0N, "ig_broadcast_waterfall"), 198);
            A0A.A0R(OptSvcAnalyticsStore.LOGGING_KEY_STEP, "broadcast_create_attempt");
            String A05 = c56805PIw.A0Q.A05();
            C14360o3.A07(A05);
            A0A.A0R("waterfall_id", A05);
            A0A.A0R("container_module", c56805PIw.A0O.getModuleName());
            AbstractC55113ObX.A02(c56805PIw.A0K, A0A);
            A0A.Cht();
            UserSession userSession = ((AbstractC55102ObF) c53021Nct).A07;
            C54732OFj c54732OFj = c53021Nct.A0c;
            boolean z = c54732OFj.A0D;
            String str2 = c54732OFj.A0B;
            boolean z2 = c54732OFj.A08;
            String str3 = c54732OFj.A05;
            String str4 = c54732OFj.A04;
            List list = c54732OFj.A06;
            C3PO c3po = c54732OFj.A02;
            boolean z3 = c54732OFj.A09;
            boolean z4 = c54732OFj.A07;
            long j = c54732OFj.A0A;
            String A0t = AbstractC166997dE.A0t(userSession);
            String str5 = c54732OFj.A0C;
            C25621Ms A0q = AbstractC25228BEl.A0q(userSession);
            A0q.A09(num);
            A0q.A0B("live/create/");
            A0q.A9s("broadcast_type", igLiveBroadcastType.name());
            if (z) {
                str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
            } else {
                str = "0";
            }
            A0q.A9s(AbstractC111324zv.A00(225), str);
            A0q.A9s(AbstractC111324zv.A00(5084), String.valueOf(i));
            A0q.A9s(AbstractC111324zv.A00(5083), String.valueOf(i2));
            A0q.A0I("user_pay_enabled", z2);
            A0q.A9s("should_use_rsys_rtc_infra", "false");
            A0q.A0D("source_type", 5);
            if (z3) {
                A0q.A0F("fan_club_subscribe_enabled", Boolean.valueOf(z3));
            }
            if (str2.length() > 0) {
                A0q.A9s("creator_geo_gating_info", str2);
            }
            A0q.A0I("sup_active", z4);
            if (str3 != null) {
                A0q.A9s("broadcast_message", str3);
            }
            if (str4 != null) {
                A0q.A9s("goal_setting_message", str4);
            }
            if (!list.isEmpty()) {
                StringWriter A0O = AbstractC37300Gc1.A0O();
                C17z A06 = AbstractC37301Gc2.A06(A0O);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    BrandedContentTag A0n = MSW.A0n(it);
                    A0n.A04 = false;
                    AbstractC54880OPb.A00(A06, A0n);
                }
                A06.A0Z();
                A0q.A9s("sponsor_tags", MSY.A0e(A06, A0O));
            }
            if (c3po != null) {
                A0q.A0A(c3po.A00, "visibility");
            }
            if (j > 0) {
                A0q.A0E("note_id", j);
            }
            if (str5 != null) {
                A0q.A0H("thread_igid", str5);
            }
            if (A0t != null) {
                A0q.A9s("camera_session_id", A0t);
            }
            C1ON A0R = AbstractC31172DnG.A0R(null, A0q, N3J.class, OQI.class, true);
            C50689MZh.A00(A0R, c53021Nct, 32);
            C1GJ.A00(((AbstractC55102ObF) c53021Nct).A05, c53021Nct.A0V, A0R);
        }
        if (c53021Nct.A0K != C05F.A0N && (surface = c53021Nct.A09) != null) {
            ((AbstractC55102ObF) c53021Nct).A09.A09.obtainMessage(1, surface).sendToTarget();
        }
        if (c53021Nct.A0G == null) {
            C55142Ocx c55142Ocx = new C55142Ocx(((AbstractC55102ObF) c53021Nct).A05, ((AbstractC55102ObF) c53021Nct).A07, ((AbstractC55102ObF) c53021Nct).A01, ((AbstractC55102ObF) c53021Nct).A00);
            c55142Ocx.A0B = c53021Nct;
            c53021Nct.A0G = c55142Ocx;
        }
    }

    public static final void A08(C53021Nct c53021Nct) {
        c53021Nct.A0a.A0F("stop camera");
        HandlerC72131XPd handlerC72131XPd = ((AbstractC55102ObF) c53021Nct).A09.A09;
        handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(5));
        ((AbstractC55102ObF) c53021Nct).A08.A01();
    }

    public static final void A09(C53021Nct c53021Nct, Exception exc, String str) {
        C0K8.A0F("IgLiveStreamingController", AnonymousClass001.A0R("Rollback Live Swap: ", str), exc);
        C56805PIw c56805PIw = c53021Nct.A0a;
        String message = exc.getMessage();
        InterfaceC02590Ai A0H = MSY.A0H(c56805PIw.A0N, "ig_broadcast_waterfall");
        C56805PIw.A06(A0H, c56805PIw, "broadcast_liveswap_connect_to_mws_failed");
        AbstractC37301Gc2.A15(A0H, c56805PIw.A0O);
        C56805PIw.A05(A0H, c56805PIw, (float) c56805PIw.A02);
        AbstractC37300Gc1.A0l(A0H, c56805PIw.A0A);
        A0H.AAP("reason", str);
        A0H.AAP("error", message);
        A0H.A9K("remote_ended", AbstractC167007dF.A0d());
        A0H.Cht();
        C55085Oah c55085Oah = c53021Nct.A0b;
        C19260xA c19260xA = new C19260xA();
        C19260xA.A00(c19260xA, str, "info");
        C19260xA.A00(c19260xA, "live_swap_failed", "eventName");
        C19260xA.A00(c19260xA, c55085Oah.A02.userId, "multiPartyLiveUserID");
        C19260xA.A00(c19260xA, "ANDROID_BROADCASTER", CacheBehaviorLogger.SOURCE);
        C55085Oah.A00(c19260xA, c55085Oah, "multi_party_live_failure", "ERROR", "ANDROID_BROADCASTER");
        A06(BroadcastType.A04, c53021Nct);
        AbstractC70118W4q.A01(c53021Nct.A0B, exc);
        c53021Nct.A0B = null;
        c53021Nct.A0P = false;
        A0A(c53021Nct, C05F.A0Y);
        PJF pjf = c53021Nct.A0H;
        if (pjf != null) {
            A01();
            pjf.EE8(null, false);
            c53021Nct.A0H = null;
        }
    }

    public static final void A0A(C53021Nct c53021Nct, Integer num) {
        OJW ojw = c53021Nct.A0d;
        if ((ojw.A00 || c53021Nct.A0S) && c53021Nct.A0K == C05F.A0C && !c53021Nct.A0Q && !c53021Nct.A0O) {
            ojw.A00 = false;
            c53021Nct.A0S = false;
            C52245NAj c52245NAj = new C52245NAj(3, num, c53021Nct);
            A01();
            InterfaceC58192Pqy interfaceC58192Pqy = c53021Nct.A0F;
            if (interfaceC58192Pqy != null) {
                interfaceC58192Pqy.EnI(new C52245NAj(4, c52245NAj, c53021Nct));
            } else {
                c52245NAj.A03(AbstractC166987dD.A14("mCurrentStreamingSession == NULL"));
            }
        }
    }

    public final O69 A0J() {
        return new O69(AbstractC167007dF.A1X(this.A0F, this.A0H));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K() {
        /*
            r4 = this;
            java.lang.Integer r0 = r4.A0K
            java.lang.Integer r3 = X.C05F.A0N
            if (r0 == r3) goto L30
            X.OJW r0 = r4.A0d
            android.os.Handler r1 = r0.A02
            java.lang.Runnable r0 = r0.A04
            r1.removeCallbacks(r0)
            boolean r0 = r4.A0T
            if (r0 == 0) goto L33
            X.Ocx r0 = r4.A0G
            if (r0 == 0) goto L31
            android.graphics.Bitmap r0 = r0.A04
        L19:
            r4.A06 = r0
            A08(r4)
        L1e:
            X.Ocx r0 = r4.A0G
            if (r0 == 0) goto L25
            r0.A04()
        L25:
            r1 = 1
            X.NAf r0 = new X.NAf
            r0.<init>(r4, r1)
            r4.A04(r0, r1)
            r4.A0K = r3
        L30:
            return
        L31:
            r0 = 0
            goto L19
        L33:
            int r1 = r4.A03
            int r0 = r4.A01
            if (r1 != r0) goto L52
            int r1 = r4.A02
            int r0 = r4.A00
            if (r1 != r0) goto L52
            X.Y4c r1 = r4.A09
            r0 = 3
            X.NAl r2 = new X.NAl
            r2.<init>(r4, r0)
            X.XPd r1 = r1.A09
            r0 = 7
            android.os.Message r0 = r1.obtainMessage(r0, r2)
            r0.sendToTarget()
            goto L1e
        L52:
            android.graphics.Bitmap r0 = r4.A07
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53021Nct.A0K():void");
    }

    public final void A0L(AbstractC70118W4q abstractC70118W4q) {
        InterfaceC58192Pqy interfaceC58192Pqy;
        Bitmap bitmap;
        if (this.A0B != null) {
            C0w9.A01.EmN("IgLiveStreamingController", "Only one invite is allowed simultaneously.");
            abstractC70118W4q.A03(new Exception("Only one invite is allowed simultaneously."));
            return;
        }
        O69 A0J = A0J();
        if (A0J.A00) {
            abstractC70118W4q.A04(A0J);
            return;
        }
        this.A0B = abstractC70118W4q;
        if (this.A0T) {
            C55142Ocx c55142Ocx = this.A0G;
            if (c55142Ocx != null) {
                bitmap = c55142Ocx.A04;
            } else {
                bitmap = null;
            }
            this.A07 = bitmap;
        } else {
            super.A09.A09.obtainMessage(7, new C52247NAl(this, 5)).sendToTarget();
        }
        DLog.d(DLogTag.LIVE.INSTANCE, "Start LiveSwap", new Object[0]);
        C56805PIw.A0B(this.A0a, C05F.A0V);
        if (this.A0P || (interfaceC58192Pqy = this.A0F) == null || !C14360o3.A0K(this.A0I, interfaceC58192Pqy)) {
            return;
        }
        this.A0P = true;
        A03(new C52241NAf(this, 4), this, C05F.A0C, null, false);
        A06(BroadcastType.A06, this);
    }

    public final void A0M(Integer num) {
        C56805PIw c56805PIw;
        String str;
        Integer num2;
        String str2 = "null_reason";
        if (this.A0d.A00 && !this.A0P) {
            if (num == null) {
                num2 = C05F.A00;
            } else {
                num2 = num;
            }
            C11T.A02(new RunnableC57023PRo(this, num2));
            c56805PIw = this.A0a;
            if (num != null) {
                str2 = AbstractC54271Nyr.A00(num);
            }
            str = "broadcast interrupted";
        } else {
            C11T.A02(new RunnableC56951POs(this));
            c56805PIw = this.A0a;
            if (num != null) {
                str2 = AbstractC54271Nyr.A00(num);
            }
            str = "broadcast resumed";
        }
        c56805PIw.A0H(str, str2);
    }

    public final void A0N(boolean z, boolean z2) {
        InterfaceC02590Ai A0H;
        int i;
        if (this.A0T != z || z2) {
            this.A0T = z;
            if (z) {
                C55142Ocx c55142Ocx = this.A0G;
                if (c55142Ocx != null && c55142Ocx.A0E) {
                    c55142Ocx.A04();
                }
                C55142Ocx c55142Ocx2 = this.A0G;
                if (c55142Ocx2 != null) {
                    c55142Ocx2.A03 = this.A01;
                    c55142Ocx2.A02 = this.A00;
                    c55142Ocx2.A0A = (YQR) AbstractC001800i.A0J(this.A0L);
                    c55142Ocx2.A09 = C17060sy.A01.A01(c55142Ocx2.A0J).A0C();
                    c55142Ocx2.A05 = null;
                    c55142Ocx2.A08 = null;
                    c55142Ocx2.A04 = null;
                }
                super.A08.A01();
                C55142Ocx c55142Ocx3 = this.A0G;
                if (c55142Ocx3 != null) {
                    c55142Ocx3.A05(this.A09);
                }
            } else {
                this.A0S = true;
                C55142Ocx c55142Ocx4 = this.A0G;
                if (c55142Ocx4 != null) {
                    c55142Ocx4.A04();
                }
                HandlerC72131XPd handlerC72131XPd = super.A09.A09;
                handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(4));
                InterfaceC58192Pqy interfaceC58192Pqy = this.A0F;
                if (interfaceC58192Pqy != null) {
                    interfaceC58192Pqy.EoX(null, false);
                }
                A07(this);
            }
        }
        C56805PIw c56805PIw = this.A0a;
        c56805PIw.A0F = z;
        long j = 0;
        InterfaceC02550Ad interfaceC02550Ad = c56805PIw.A0N;
        if (z) {
            A0H = MSY.A0H(interfaceC02550Ad, "ig_live_broadcast_video_toggled_off");
            i = 231;
        } else {
            A0H = MSY.A0H(interfaceC02550Ad, "ig_live_broadcast_video_toggled_on");
            i = 232;
        }
        C25531Mh A0A = AbstractC31171DnF.A0A(A0H, i);
        A0A.A0R("view_mode", "host");
        String str = c56805PIw.A0P.userId;
        C14360o3.A0B(str, 0);
        A0A.A0Q("a_pk", AbstractC003100w.A0k(10, str));
        String str2 = c56805PIw.A08;
        if (str2 != null) {
            j = MSZ.A0D(str2);
        }
        C56805PIw.A09(A0A, c56805PIw, j);
        C1GJ.A03(AbstractC55182Odn.A03(super.A07, MSX.A0Y(z ? 1 : 0), this.A0D.A0C));
    }

    @Override // X.InterfaceC58006Pnq
    public final void CsP(YQR yqr) {
        InterfaceC58192Pqy interfaceC58192Pqy = this.A0F;
        if (interfaceC58192Pqy != null) {
            interfaceC58192Pqy.CsN(yqr);
        }
    }

    public static final void A01() {
        if (C14360o3.A0K(Looper.myLooper(), Looper.getMainLooper())) {
        } else {
            throw AbstractC31172DnG.A0u();
        }
    }

    public static final void A02(LiveStreamingError liveStreamingError, BroadcastFailureType broadcastFailureType, C53021Nct c53021Nct) {
        c53021Nct.A0K();
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("endBroadcastWithFailure(");
        A1C.append(broadcastFailureType);
        C0K8.A0D("IgLiveStreamingController", AbstractC167017dG.A0n(liveStreamingError, "): ", A1C));
        C56805PIw c56805PIw = c53021Nct.A0a;
        int i = liveStreamingError.errorCode;
        String str = liveStreamingError.domain;
        if (str == null) {
            str = "";
        }
        c56805PIw.A0D(i, str, liveStreamingError.reason, liveStreamingError.description, liveStreamingError.fullDescription);
        OVc oVc = c53021Nct.A0W;
        LiveStreamingError liveStreamingError2 = liveStreamingError.innerError;
        if (liveStreamingError2 == null) {
            liveStreamingError2 = liveStreamingError;
        }
        oVc.A01("started", "failed", "broadcast_session_failed", AbstractC06930Yk.A06(AbstractC166987dD.A1L("error_class", liveStreamingError.domain), AbstractC166987dD.A1L(TraceFieldType.ErrorCode, String.valueOf(liveStreamingError.errorCode)), AbstractC166987dD.A1L("error_message", liveStreamingError.reason), AbstractC166987dD.A1L("error_trace", liveStreamingError.fullDescription), AbstractC166987dD.A1L("inner_error_class", liveStreamingError2.domain), AbstractC166987dD.A1L("inner_error_code", String.valueOf(liveStreamingError2.errorCode)), AbstractC166987dD.A1L("inner_error_message", liveStreamingError2.reason), AbstractC166987dD.A1L("inner_error_trace", liveStreamingError2.fullDescription)).toString());
        if (!c53021Nct.A0N) {
            c53021Nct.A0N = true;
            C11T.A02(new RunnableC57057PSw(liveStreamingError, broadcastFailureType, c53021Nct));
        }
    }

    private final void A04(AbstractC53633Nne abstractC53633Nne, boolean z) {
        A01();
        this.A0a.A0F("stop encoding");
        HandlerC72131XPd handlerC72131XPd = super.A09.A09;
        handlerC72131XPd.sendMessageAtFrontOfQueue(handlerC72131XPd.obtainMessage(4));
        this.A0A = new C52244NAi(abstractC53633Nne, this, z);
    }

    @Override // X.AbstractC55102ObF
    public final void A0D() {
        super.A0D();
        A0K();
    }
}
