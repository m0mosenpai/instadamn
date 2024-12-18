package X;

import android.R;
import android.content.Context;
import android.os.Looper;
import android.widget.AbsListView;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.MarkerEditor;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6Xq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C140626Xq extends C1I7 implements AbsListView.OnScrollListener, C1NJ, InterfaceC81993lL, InterfaceC58852mj {
    public static final long A0H;
    public static final long A0I;
    public long A00;
    public HandlerC25861Nt A01;
    public C69583As A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public int A0B;
    public final UserSession A0C;
    public final Reel A0D;
    public final InterfaceC140616Xp A0E;
    public final C82013lN A0F;
    public final Context A0G;

    public static void A02(final C140626Xq c140626Xq) {
        c140626Xq.A08 = true;
        UserSession userSession = c140626Xq.A0C;
        boolean z = C18U.A06(C06090Tz.A05, userSession, 36329638003491281L) && c140626Xq.A03.equals("feed_timeline");
        InterfaceC16660sJ interfaceC16660sJ = new InterfaceC16660sJ() { // from class: X.6Xt
            @Override // X.InterfaceC16660sJ
            public final Object invoke(Object obj) {
                C140626Xq c140626Xq2 = C140626Xq.this;
                C140626Xq.A01(c140626Xq2);
                c140626Xq2.A0E.DqK(c140626Xq2.A09, c140626Xq2.A00);
                return null;
            }
        };
        C14360o3.A0B(userSession, 0);
        AbstractC60912qF.A01(userSession, null, null, interfaceC16660sJ, z);
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        timeUnit.toMillis(2L);
        A0I = timeUnit.toMillis(5L);
        A0H = timeUnit.toMillis(20L);
    }

    private void A00() {
        C41181vS A09;
        Reel reel = this.A0D;
        UserSession userSession = this.A0C;
        if (!reel.A15(userSession) && (A09 = new C41551w4(userSession, reel).A09(userSession)) != null && A09.A1o()) {
            C75363a3 A0M = A09.A0M(userSession);
            Context context = this.A0G;
            if (A0M != null && context != null) {
                C4VX c4vx = new C4VX(context, userSession, A0M, this.A03);
                c4vx.A02 = true;
                C4VZ.A00(c4vx.A00());
            }
        }
    }

    public static void A01(C140626Xq c140626Xq) {
        String str;
        if (c140626Xq.A07) {
            UserSession userSession = c140626Xq.A0C;
            if (C18U.A06(C06090Tz.A05, userSession, 36317491837146339L) && C2I7.A00(c140626Xq.A03, "feed_timeline")) {
                str = "reel_feed_timeline";
            } else {
                str = c140626Xq.A03;
            }
            C14360o3.A0B(userSession, 0);
            C12210kP c12210kP = new C12210kP(userSession);
            c12210kP.A01 = str;
            C25531Mh A0D = C25531Mh.A0D(c12210kP.A00());
            if (((AbstractC02600Aj) A0D).A00.isSampled()) {
                long currentTimeMillis = System.currentTimeMillis() - c140626Xq.A00;
                A0D.A0R(DatePickerDialogModule.ARG_MODE, "story_viewer_fetch");
                A0D.A0Q("time_elapsed", Long.valueOf(currentTimeMillis));
                A0D.A0m(str);
                A0D.A0Q("version", 4L);
                A0D.A0Q("spinner_position", Long.valueOf(c140626Xq.A0B));
                A0D.Cht();
            }
        }
        c140626Xq.A07 = false;
        c140626Xq.A01.removeCallbacksAndMessages(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r2.startsWith("search") != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A03(boolean r11) {
        /*
            r10 = this;
            com.instagram.model.reels.Reel r7 = r10.A0D
            com.instagram.common.session.UserSession r4 = r10.A0C
            boolean r0 = r7.A15(r4)
            r6 = 0
            if (r0 == 0) goto L1c
            boolean r0 = r7.A0z(r4)
            if (r0 == 0) goto L1c
            android.content.Context r1 = r10.A0G
            java.lang.String r0 = "preloadFirstImage_error"
            X.C9GR.A0A(r1, r0)
            r7.A0R(r4)
        L1b:
            return
        L1c:
            X.1w4 r0 = new X.1w4
            r0.<init>(r4, r7)
            X.1vS r9 = r0.A09(r4)
            X.3As r1 = r10.A02
            r1.A02(r7, r9, r11)
            boolean r0 = r10.A08
            if (r0 != 0) goto L44
            boolean r0 = r9.A17()
            if (r0 != 0) goto L40
            boolean r0 = r9.A18()
            if (r0 != 0) goto L40
            boolean r0 = r7.A18(r4)
            if (r0 == 0) goto L44
        L40:
            A02(r10)
            return
        L44:
            android.content.Context r0 = r10.A0G
            com.instagram.common.typedurl.ImageUrl r5 = r9.A08(r0)
            if (r5 != 0) goto L66
            X.0wb r2 = X.C18950wb.A01
            r1 = 817899688(0x30c028a8, float:1.3981394E-9)
            java.lang.String r0 = "ReelPreloadLauncher"
            X.0f5 r2 = r2.AEp(r0, r1)
            X.1vY r0 = r9.A0e
            java.lang.String r1 = r0.name()
            java.lang.String r0 = "reel_preload_first_image_unexpected_reel_type"
            r2.ABW(r0, r1)
            r2.report()
            goto L40
        L66:
            r8 = 1
            r10.A09 = r8
            X.3At r0 = r1.A01
            X.3Av r1 = r0.A04
            r0 = 0
            r1.A08(r0)
            X.6Xy r0 = X.AbstractC140696Xx.A00(r4)
            r0.A0C(r9, r8)
            X.1No r3 = X.C25821No.A00()
            java.lang.String r2 = r10.A03
            java.lang.String r1 = "feed_timeline"
            boolean r0 = r2.startsWith(r1)
            if (r0 != 0) goto L8e
            java.lang.String r1 = "search"
            boolean r0 = r2.startsWith(r1)
            if (r0 == 0) goto L8f
        L8e:
            r2 = r1
        L8f:
            X.1OG r5 = r3.A0J(r5, r2)
            r9.A02()
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36612367110445442(0x8212c100011982, double:3.217146614590248E-306)
            long r3 = X.C18U.A01(r2, r4, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto La8
            r8 = 0
        La8:
            r5.A0M = r8
            r5.A0I = r6
            r5.A02(r10)
            java.lang.String r0 = r7.getId()
            r5.A08 = r0
            r5.A01()
            boolean r0 = r10.A08
            if (r0 != 0) goto L1b
            r10.A09 = r6
            X.6Xp r0 = r10.A0E
            r0.onStart()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C140626Xq.A03(boolean):void");
    }

    public final /* bridge */ /* synthetic */ void A04() {
        UserSession userSession;
        if (!this.A07) {
            this.A07 = true;
            this.A00 = System.currentTimeMillis();
            Reel reel = this.A0D;
            if (reel.A0d()) {
                C105824pt c105824pt = reel.A0H;
                c105824pt.getClass();
                UserSession userSession2 = this.A0C;
                C75363a3 A04 = c105824pt.A04(userSession2);
                if (A04 != null) {
                    C4AG.A00(userSession2).A01(new C4AD(A04, this.A03));
                }
            }
            HandlerC25861Nt handlerC25861Nt = this.A01;
            final long j = A0I;
            handlerC25861Nt.A02(new Runnable(j) { // from class: X.6Xr
                public final long A00;

                {
                    this.A00 = j;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Reel launching took longer than ");
                    sb.append(this.A00);
                    sb.append(" ms. Reel loaded: ");
                    C140626Xq c140626Xq = C140626Xq.this;
                    long j2 = C140626Xq.A0I;
                    sb.append(c140626Xq.A0D.A0z(c140626Xq.A0C));
                    sb.append(" Image loaded: ");
                    sb.append(c140626Xq.A08);
                    sb.append(" Source module: ");
                    sb.append(c140626Xq.A03);
                    String obj = sb.toString();
                    C0K8.A0C("ReelPreloadLauncher", obj);
                    C0w9.A03("ReelPreloadLauncher", obj);
                }
            }, 736949603, j);
            final long j2 = A0H;
            handlerC25861Nt.A02(new Runnable(j2) { // from class: X.6Xr
                public final long A00;

                {
                    this.A00 = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Reel launching took longer than ");
                    sb.append(this.A00);
                    sb.append(" ms. Reel loaded: ");
                    C140626Xq c140626Xq = C140626Xq.this;
                    long j22 = C140626Xq.A0I;
                    sb.append(c140626Xq.A0D.A0z(c140626Xq.A0C));
                    sb.append(" Image loaded: ");
                    sb.append(c140626Xq.A08);
                    sb.append(" Source module: ");
                    sb.append(c140626Xq.A03);
                    String obj = sb.toString();
                    C0K8.A0C("ReelPreloadLauncher", obj);
                    C0w9.A03("ReelPreloadLauncher", obj);
                }
            }, 736949603, j2);
            if (!this.A06) {
                userSession = this.A0C;
                if (C75653aW.A05(userSession, reel, this.A04)) {
                    this.A02.A01.A03.A08(null);
                    A03(true);
                    A00();
                    handlerC25861Nt.A02(new Runnable() { // from class: X.6Xs
                        @Override // java.lang.Runnable
                        public final void run() {
                            C140626Xq c140626Xq = C140626Xq.this;
                            if (!c140626Xq.A05 && !c140626Xq.A08) {
                                C140626Xq.A02(c140626Xq);
                            }
                        }
                    }, 736949603, C18U.A01(C06090Tz.A05, userSession, 36612367110379905L));
                }
            }
            HashMap hashMap = new HashMap();
            this.A02.A01.A03.A08(null);
            userSession = this.A0C;
            C140706Xy A00 = AbstractC140696Xx.A00(userSession);
            String id = reel.getId();
            C14360o3.A0B(id, 0);
            Long A01 = C140706Xy.A01(A00, id, null);
            if (A01 != null) {
                A00.A00.flowMarkPoint(A01.longValue(), "json_early_fetch_start");
            }
            String str = this.A04;
            if (str != null) {
                hashMap.put("media_id", str);
            }
            if (this.A06) {
                hashMap.put("force_load_from_network", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            if (this.A0A) {
                hashMap.put("obfuscate_request", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            }
            this.A0E.onStart();
            C82013lN c82013lN = this.A0F;
            c82013lN.A02(C3G5.A0I, reel.getId(), this.A03, hashMap);
            c82013lN.A05(this, reel.getId(), this.A04, this.A06);
            handlerC25861Nt.A02(new Runnable() { // from class: X.6Xs
                @Override // java.lang.Runnable
                public final void run() {
                    C140626Xq c140626Xq = C140626Xq.this;
                    if (!c140626Xq.A05 && !c140626Xq.A08) {
                        C140626Xq.A02(c140626Xq);
                    }
                }
            }, 736949603, C18U.A01(C06090Tz.A05, userSession, 36612367110379905L));
        }
    }

    public final void A05(Integer num) {
        int A03;
        String str;
        if (this.A07) {
            C69583As c69583As = this.A02;
            Reel reel = this.A0D;
            c69583As.A04(reel, AbstractC54130NwS.A00(num));
            C140706Xy A00 = AbstractC140696Xx.A00(this.A0C);
            C14360o3.A0B(reel, 0);
            UserSession userSession = A00.A01;
            if (reel.A0O(userSession).isEmpty()) {
                A03 = -1;
            } else {
                A03 = reel.A03(userSession);
            }
            C41181vS A0B = reel.A0B(userSession, A03);
            String id = reel.getId();
            C14360o3.A07(id);
            if (A0B != null) {
                str = C140706Xy.A02(A0B);
            } else {
                str = null;
            }
            Long A01 = C140706Xy.A01(A00, id, str);
            if (A01 != null) {
                A00.A00.flowEndCancel(A01.longValue(), AbstractC54130NwS.A00(num));
            }
        }
        this.A05 = true;
        A01(this);
        this.A0E.onCancel();
        this.A0F.A04(this, this.A0D.getId());
    }

    @Override // X.C1NJ
    public final void Cza(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        C41181vS A09;
        if (!this.A05) {
            UserSession userSession = this.A0C;
            Reel reel = this.A0D;
            C41551w4 c41551w4 = new C41551w4(userSession, reel);
            if (!c41551w4.A0E(userSession) && (A09 = c41551w4.A09(userSession)) != null) {
                AbstractC140696Xx.A00(userSession).A0D(A09, true);
            }
            C69583As c69583As = this.A02;
            boolean z = this.A09;
            C14360o3.A0B(reel, 0);
            MarkerEditor withMarker = c69583As.A00.withMarker(R.drawable.alert_light_frame, reel.getId().hashCode());
            withMarker.annotate("media_loaded_from_cache", String.valueOf(z));
            withMarker.point("REEL_MEDIA_RECEIVED");
            withMarker.markerEditingCompleted();
            C69593At c69593At = c69583As.A01;
            c69593At.A0K("media_loaded_from_cache", z);
            C69613Av c69613Av = c69593At.A04;
            if (z) {
                c69613Av.A02();
            } else {
                c69613Av.A05();
            }
            if (!this.A08) {
                A02(this);
            }
        }
    }

    @Override // X.C1NJ
    public final void DLP(InterfaceC59502nt interfaceC59502nt, C82183lf c82183lf) {
        C41181vS A09;
        if (!this.A05) {
            UserSession userSession = this.A0C;
            C41551w4 c41551w4 = new C41551w4(userSession, this.A0D);
            if (!c41551w4.A0E(userSession) && (A09 = c41551w4.A09(userSession)) != null) {
                C140706Xy A00 = AbstractC140696Xx.A00(userSession);
                String str = A09.A0k;
                C14360o3.A07(str);
                Long A01 = C140706Xy.A01(A00, str, C140706Xy.A02(A09));
                if (A01 != null) {
                    long longValue = A01.longValue();
                    C1QT c1qt = A00.A00;
                    c1qt.flowMarkPoint(longValue, "media_early_fetch_fail");
                    c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "media_early_fetch_fail");
                }
            }
            A01(this);
            this.A0E.DFw(this.A00);
        }
    }

    @Override // X.C1NJ
    public final void DLW(InterfaceC59502nt interfaceC59502nt, int i) {
        UserSession userSession = this.A0C;
        long A01 = C18U.A01(C06090Tz.A06, userSession, 36612367110445442L);
        if (!this.A05 && !this.A08 && A01 >= 0 && i >= A01) {
            C18U.A01(C06090Tz.A05, userSession, 36612367110445442L);
            A02(this);
        }
    }

    @Override // X.InterfaceC81993lL
    public final void DPz(String str, boolean z) {
        if (!this.A05) {
            Reel reel = this.A0D;
            UserSession userSession = this.A0C;
            boolean A15 = reel.A15(userSession);
            C140706Xy A00 = AbstractC140696Xx.A00(userSession);
            String id = reel.getId();
            C14360o3.A0B(id, 0);
            Long A01 = C140706Xy.A01(A00, id, null);
            if (A15) {
                if (A01 != null) {
                    long longValue = A01.longValue();
                    C1QT c1qt = A00.A00;
                    c1qt.flowMarkPoint(longValue, "json_early_fetch_fail");
                    c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_early_fetch_fail");
                }
                A01(this);
                this.A0E.DFw(this.A00);
                return;
            }
            if (A01 != null) {
                A00.A00.flowMarkPoint(A01.longValue(), "json_early_fetch_success");
            }
            A03(z);
            A00();
        }
    }

    @Override // X.InterfaceC58852mj
    public final void DTb(InterfaceC59502nt interfaceC59502nt, C73033Pe c73033Pe) {
        if (!this.A08 && !this.A05) {
            A02(this);
        }
    }

    public C140626Xq(Context context, UserSession userSession, Reel reel, InterfaceC140616Xp interfaceC140616Xp, C82013lN c82013lN, String str, int i) {
        this.A0G = context;
        this.A0F = c82013lN;
        this.A0D = reel;
        this.A0C = userSession;
        this.A0E = interfaceC140616Xp;
        this.A03 = str;
        this.A0B = i;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        this.A01 = new HandlerC25861Nt(myLooper);
        this.A02 = AbstractC69573Ar.A00(userSession);
    }

    @Override // X.InterfaceC81993lL
    public final void DPm(String str) {
        A01(this);
        if (!this.A05) {
            C140706Xy A00 = AbstractC140696Xx.A00(this.A0C);
            String id = this.A0D.getId();
            C14360o3.A0B(id, 0);
            Long A01 = C140706Xy.A01(A00, id, null);
            if (A01 != null) {
                long longValue = A01.longValue();
                C1QT c1qt = A00.A00;
                c1qt.flowMarkPoint(longValue, "json_early_fetch_fail");
                c1qt.flowAnnotate(longValue, TraceFieldType.FailureReason, "json_early_fetch_fail");
            }
            this.A0E.DFw(this.A00);
        }
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        int A03 = C0f9.A03(659361416);
        A05(C05F.A00);
        C0f9.A0A(2106717625, A03);
    }
}
