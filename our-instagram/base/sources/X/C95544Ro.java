package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4Ro, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C95544Ro implements C4RS {
    public long A00;
    public long A01;
    public C95904Sz A02;
    public C4SK A03;
    public C98704bq A04;
    public C98704bq A05;
    public String A06;
    public InterfaceC95764Sk A07;
    public String A08;
    public final C4RP A09;
    public final C95514Rl A0A;
    public final C95564Rq A0B;
    public final C42351xP A0C;
    public final C95504Rk A0D;
    public final InterfaceC09390do A0E;
    public final InterfaceC02550Ad A0F;
    public final C95554Rp A0G;
    public final C95534Rn A0H;
    public final C95524Rm A0I;
    public final C3N6 A0J;
    public final ConcurrentLinkedQueue A0K;
    public final AtomicBoolean A0L;
    public final AtomicBoolean A0M;
    public final AtomicLong A0N;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.4Rp, java.lang.Object] */
    public C95544Ro(InterfaceC02550Ad interfaceC02550Ad, C4RP c4rp, C95514Rl c95514Rl, C42351xP c42351xP, C95504Rk c95504Rk, C95534Rn c95534Rn, C95524Rm c95524Rm, C3N6 c3n6) {
        C14360o3.A0B(c42351xP, 3);
        this.A0F = interfaceC02550Ad;
        this.A0I = c95524Rm;
        this.A0C = c42351xP;
        this.A0D = c95504Rk;
        this.A09 = c4rp;
        this.A0A = c95514Rl;
        this.A0J = c3n6;
        this.A0H = c95534Rn;
        this.A0E = AbstractC09440dt.A00(EnumC09460dv.A02, new C206979Ec(this, 36));
        this.A0G = new Object();
        this.A0L = new AtomicBoolean(false);
        this.A0N = new AtomicLong(0L);
        this.A0M = new AtomicBoolean(false);
        this.A0B = new C95564Rq(c42351xP, c95524Rm);
        this.A0K = new ConcurrentLinkedQueue();
    }

    public static final Double A01(String str) {
        String str2;
        String str3;
        if (str == null || (str2 = (String) AbstractC001800i.A0L(AbstractC001900j.A0R(str, new String[]{InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1}, 0))) == null || (str3 = (String) AbstractC001800i.A0K(AbstractC001900j.A0R(str2, new String[]{":"}, 0))) == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str3));
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.4Rp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, X.4Sw] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, X.4Sw] */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.4Rp, java.lang.Object] */
    public final void A0H(InterfaceC95764Sk interfaceC95764Sk, C4SK c4sk, long j) {
        C95524Rm c95524Rm;
        String str;
        Runnable runnableC24287Aps;
        if (c4sk != null) {
            C42351xP c42351xP = this.A0C;
            if (!AbstractC001900j.A0a(c42351xP.A05, AbstractC95214Qh.A00(c4sk.BTX()), false)) {
                this.A00 = j;
                this.A0L.set(false);
                if (c42351xP.A06) {
                    this.A07 = interfaceC95764Sk;
                }
                this.A03 = c4sk;
                C4T2 c4t2 = null;
                C95804So BoM = c4sk.BoM();
                String A01 = this.A0G.A01(BoM, this.A00);
                InterfaceC02550Ad interfaceC02550Ad = this.A0F;
                C95554Rp.A00(interfaceC02550Ad, BoM, c42351xP, "client_metadata_provider_setup", A01);
                long j2 = this.A00;
                C95504Rk c95504Rk = this.A0D;
                C3N6 c3n6 = this.A0J;
                ?? obj = new Object();
                obj.A00 = BoM;
                obj.A01 = new Object();
                obj.A02 = c42351xP;
                obj.A03 = c3n6;
                this.A02 = new C95904Sz(BoM, interfaceC95764Sk, new C95884Sx(interfaceC02550Ad, obj), c42351xP, c95504Rk, j2);
                C95514Rl c95514Rl = this.A0A;
                String A02 = A02(this);
                long j3 = this.A00;
                InterfaceC95764Sk interfaceC95764Sk2 = this.A07;
                c95514Rl.A03.set(A02);
                C95504Rk c95504Rk2 = c95514Rl.A00;
                ?? obj2 = new Object();
                obj2.A00 = BoM;
                obj2.A01 = new Object();
                obj2.A02 = c42351xP;
                obj2.A03 = c3n6;
                c95514Rl.A01.put(A02, new C95904Sz(BoM, interfaceC95764Sk2, new C95884Sx(interfaceC02550Ad, obj2), c42351xP, c95504Rk2, j3));
                long j4 = c42351xP.A03;
                if (c42351xP.A09 && j4 != -1) {
                    if (c42351xP.A0J) {
                        runnableC24287Aps = (Runnable) this.A0E.getValue();
                    } else {
                        runnableC24287Aps = new RunnableC24287Aps(this);
                    }
                    c95504Rk.A00(runnableC24287Aps, j4);
                } else {
                    c95514Rl.A01();
                }
                this.A01 = 0L;
                this.A05 = null;
                C4SK c4sk2 = this.A03;
                if (c4sk2 != null && (c4t2 = c4sk2.BHi(A02(this))) != null) {
                    c4t2.A03("playback_is_first_video", Boolean.valueOf(c95514Rl.A02.compareAndSet(false, true)));
                    c4t2.A03("is_initial_tag_metadata", true);
                }
                A0G(c4t2);
                String A022 = A02(this);
                C95904Sz A00 = c95514Rl.A00(this.A02, A022);
                if (A00 != null) {
                    if (c42351xP.A0I) {
                        if (c95514Rl.A02(this.A00, false)) {
                            str = "started";
                        } else {
                            str = "unpaused";
                        }
                    } else {
                        str = null;
                    }
                    long j5 = this.A01;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    C4RQ c4rq = this.A09.A0I;
                    A00.A01(null, null, null, Long.valueOf(c4rq.A0S), null, "prepare_started", A022, str, null, String.valueOf(c4rq.A0S), 0L, j5, elapsedRealtime, false);
                    this.A0B.A00(C4TA.A0D, A022);
                }
                C95564Rq c95564Rq = this.A0B;
                String A023 = A02(this);
                if (c95564Rq.A00.A0E && (c95524Rm = c95564Rq.A01) != null) {
                    int hashCode = A023.hashCode();
                    QuickPerformanceLogger quickPerformanceLogger = c95524Rm.A00;
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerStart(409476402, hashCode);
                    }
                    if (quickPerformanceLogger != null) {
                        quickPerformanceLogger.markerAnnotate(409476402, hashCode, "MEDIA_ID", j);
                    }
                }
            }
        }
    }

    public final void A0I(C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 1);
        C14360o3.A0B(str, 3);
        if (this.A0C.A0B) {
            A0D(c117275Sm, c4rv, c4ru, str);
        }
    }

    @Override // X.C4RS
    public final /* synthetic */ void Cy0(C98704bq c98704bq) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void D5g(String str, boolean z) {
    }

    @Override // X.C4RS
    public final void D9S(long j, String str, boolean z) {
    }

    @Override // X.C4RS
    public final void D9T(int i, int i2, int i3, int i4) {
    }

    @Override // X.C4RS
    public final void DBq(C98704bq c98704bq, String str, List list, long j, boolean z) {
        C14360o3.A0B(c98704bq, 0);
        C14360o3.A0B(str, 2);
        if (!this.A0C.A0B) {
            A0C(this, c98704bq);
        }
    }

    @Override // X.C4RS
    public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
        C14360o3.A0B(str3, 4);
        if (!this.A0C.A0B) {
            A06(this, c117275Sm, str3);
        }
    }

    @Override // X.C4RS
    public final /* synthetic */ void DIJ(String str, long j) {
    }

    @Override // X.C4RS
    public final void DLl(String str, byte[] bArr, long j) {
    }

    @Override // X.C4RS
    public final void DPK(String str, byte[] bArr, long j, long j2) {
    }

    @Override // X.C4RS
    public final void DPS(C68692VaS c68692VaS) {
        C14360o3.A0B(c68692VaS, 0);
    }

    @Override // X.C4RS
    public final void DTa(Object obj) {
    }

    @Override // X.C4RS
    public final void DVN(byte[] bArr, long j) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DY8(String str, String str2) {
    }

    @Override // X.C4RS
    public final /* synthetic */ void DZ0() {
    }

    @Override // X.C4RS
    public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 1);
        C14360o3.A0B(c117275Sm, 3);
        C14360o3.A0B(str, 4);
        if (!this.A0C.A0B) {
            A0D(c117275Sm, c4rv, c4ru, str);
        }
    }

    @Override // X.C4RS
    public final /* synthetic */ void DZ6(EnumC46692Ch enumC46692Ch) {
    }

    @Override // X.C4RS
    public final void DaY() {
    }

    @Override // X.C4RS
    public final void Dny(C4RV c4rv, C4RU c4ru, String str, long j, boolean z, boolean z2) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 1);
        if (!this.A0C.A0B) {
            A07(this, c4rv, c4ru);
        }
    }

    @Override // X.C4RS
    public final /* synthetic */ void Dp7(C5n5 c5n5) {
    }

    @Override // X.C4RS
    public final void DpT(boolean z) {
    }

    @Override // X.C4RS
    public final void DtM(List list) {
    }

    @Override // X.C4RS
    public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
    }

    @Override // X.C4RS
    public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 1);
        C14360o3.A0B(str4, 7);
        if (!this.A0C.A0B) {
            A08(this, c4rv, c4ru, str4);
        }
    }

    @Override // X.C4RS
    public final void Dyu(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, boolean z, boolean z2) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 3);
        C14360o3.A0B(str3, 8);
        if (!this.A0C.A0B) {
            A0B(this, c4rv, c4ru, str3, z2);
        }
    }

    @Override // X.C4RS
    public final void DzE(C5n5 c5n5, C4RV c4rv, C4RU c4ru, Integer num, String str, String str2, String str3, String str4, String str5, long j, long j2, boolean z) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 3);
        C14360o3.A0B(str5, 11);
        if (!this.A0C.A0B) {
            A0A(this, c4rv, c4ru, str5, j);
        }
    }

    @Override // X.C4RS
    public final void Dzs() {
    }

    @Override // X.C4RS
    public final void E08(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, boolean z2) {
        C14360o3.A0B(c4ru, 0);
        C14360o3.A0B(c4rv, 3);
        if (!this.A0C.A0B) {
            A09(this, c4rv, c4ru, str4);
        }
    }

    @Override // X.C4RS
    public final void E1K(boolean z, boolean z2) {
    }

    @Override // X.C4RS
    public final void E1j(C117275Sm c117275Sm) {
    }

    @Override // X.C4RS
    public final void onCues(List list) {
    }

    @Override // X.C4RS
    public final void onDrawnToSurface() {
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.4So] */
    private final C95804So A00() {
        C95804So BoM;
        C4SK c4sk = this.A03;
        if (c4sk == null || (BoM = c4sk.BoM()) == null) {
            long j = this.A00;
            ?? c0Zx = new C0Zx();
            c0Zx.A05("media_id", Long.valueOf(j));
            c0Zx.A01(EnumC95784Sm.ORGANIC, "tracking_type");
            c0Zx.A06("current_watching_module", MediaStreamTrack.VIDEO_TRACK_KIND);
            return c0Zx;
        }
        return BoM;
    }

    public static final String A02(C95544Ro c95544Ro) {
        C95224Qi BOk;
        C4SK c4sk = c95544Ro.A03;
        if (c4sk != null && (BOk = c4sk.BOk()) != null) {
            return BOk.A00();
        }
        return "DEFAULT_TOKEN";
    }

    public static final void A03(C95544Ro c95544Ro) {
        long j;
        Runnable runnableC24287Aps;
        C42351xP c42351xP = c95544Ro.A0C;
        if (c42351xP.A09) {
            if (c95544Ro.A0L.get()) {
                j = c42351xP.A02;
            } else {
                j = c42351xP.A03;
            }
            if (j != -1) {
                C95514Rl c95514Rl = c95544Ro.A0A;
                c95514Rl.A01();
                C4RP c4rp = c95544Ro.A09;
                C4RQ c4rq = c4rp.A0I;
                if (c4rq.A0J() && c4rp.A0N.get()) {
                    String A02 = A02(c95544Ro);
                    C95904Sz A00 = c95514Rl.A00(c95544Ro.A02, A02);
                    long A08 = (int) c4rq.A08();
                    if (A00 != null) {
                        A00.A01(null, null, null, null, null, "heartbeat", A02, null, null, null, A08, c95544Ro.A01, SystemClock.elapsedRealtime(), false);
                        A00.A00();
                    }
                    if (c42351xP.A0J) {
                        runnableC24287Aps = (Runnable) c95544Ro.A0E.getValue();
                    } else {
                        runnableC24287Aps = new RunnableC24287Aps(c95544Ro);
                    }
                    c95544Ro.A0D.A00(runnableC24287Aps, j);
                }
            }
        }
    }

    public static final void A04(C95544Ro c95544Ro) {
        String A02 = A02(c95544Ro);
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, A02);
        if (A00 != null) {
            C4RQ c4rq = c95544Ro.A09.A0I;
            A00.A01(null, null, null, Long.valueOf(c4rq.A0S), null, "requested_seek", A02, null, null, String.valueOf(c4rq.A0S), (int) c4rq.A08(), c95544Ro.A01, SystemClock.elapsedRealtime(), false);
        }
    }

    public static final void A05(C95544Ro c95544Ro, long j, boolean z) {
        String A02 = A02(c95544Ro);
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, A02);
        if (A00 != null) {
            A00.A01(null, Boolean.valueOf(z), null, null, null, "stopped_buffering", A02, null, null, null, j, c95544Ro.A01, SystemClock.elapsedRealtime(), false);
            c95544Ro.A0B.A00(C4TA.A0L, A02);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.5hv, X.0Zx] */
    public static final void A06(C95544Ro c95544Ro, C117275Sm c117275Sm, String str) {
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, str);
        if (A00 != 0) {
            long A08 = (int) c95544Ro.A09.A0I.A08();
            ?? c0Zx = new C0Zx();
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "error_recovery_attempt");
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "error_recovery_attempt");
            if (c117275Sm != null) {
                HashMap hashMap = new HashMap();
                C4Y0 c4y0 = c117275Sm.A00;
                hashMap.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, c4y0.toString());
                hashMap.put("error", c4y0.name());
                hashMap.put(DevServerEntity.COLUMN_DESCRIPTION, c117275Sm.A02);
                hashMap.put("domain", c117275Sm.A01.toString());
                hashMap.put("last_encoding_tag", c95544Ro.A08);
            }
            A00.A01(c0Zx, null, null, null, null, "error", str, null, null, null, A08, c95544Ro.A01, SystemClock.elapsedRealtime(), false);
        }
    }

    public static final void A07(C95544Ro c95544Ro, C4RV c4rv, C4RU c4ru) {
        String A02 = A02(c95544Ro);
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, A02);
        if (A00 != null) {
            long j = c4rv.A02;
            if (j > 0) {
                c95544Ro.A01 = j;
            }
            A00.A01(null, null, null, null, null, "started_buffering", A02, null, null, null, c4ru.A00(), c4ru.A0U, SystemClock.elapsedRealtime(), false);
            c95544Ro.A0B.A00(C4TA.A0M, A02);
        }
    }

    public static final void A08(C95544Ro c95544Ro, C4RV c4rv, C4RU c4ru, String str) {
        Long l;
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, str);
        if (A00 != null) {
            long j = c4rv.A02;
            if (j > 0) {
                c95544Ro.A01 = j;
            }
            long A002 = c4ru.A00();
            long j2 = c95544Ro.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            String A02 = A02(c95544Ro);
            if (j > 0) {
                long j3 = j - c4ru.A0B;
                if (j3 < 0) {
                    j3 = 0;
                }
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            A00.A01(null, null, null, null, l, "cancelled", A02, null, null, null, A002, j2, elapsedRealtime, false);
            A00.A00();
            C95564Rq c95564Rq = c95544Ro.A0B;
            String A022 = A02(c95544Ro);
            c95564Rq.A00(C4TA.A04, A022);
            c95564Rq.A01(A022);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.0pT, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.4T2, X.0Zx] */
    public static final void A09(final C95544Ro c95544Ro, C4RV c4rv, C4RU c4ru, String str) {
        String str2;
        Integer num;
        String str3 = str;
        InterfaceC02550Ad interfaceC02550Ad = c95544Ro.A0F;
        C42351xP c42351xP = c95544Ro.A0C;
        C95554Rp.A00(interfaceC02550Ad, c95544Ro.A00(), c42351xP, "client_video_started_playing", null);
        String A02 = A02(c95544Ro);
        C95514Rl c95514Rl = c95544Ro.A0A;
        C95904Sz A00 = c95514Rl.A00(c95544Ro.A02, A02);
        if (A00 != null) {
            ((C95884Sx) A00.videoLoggerHandler).A00.A00 = c95544Ro.A00();
            C95804So c95804So = null;
            if (c42351xP.A0I) {
                if (c95514Rl.A02(c95544Ro.A00, true)) {
                    str2 = "started";
                } else {
                    str2 = "unpaused";
                }
            } else {
                str2 = null;
            }
            long j = c4rv.A02;
            if (j <= 0) {
                j = c4ru.A0U;
            }
            c95544Ro.A01 = j;
            long A002 = c4ru.A00();
            long j2 = c95544Ro.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4RQ c4rq = c95544Ro.A09.A0I;
            A00.A01(null, null, null, Long.valueOf(c4rq.A0S), null, "started_playing", A02, str2, null, String.valueOf(c4rq.A0S), A002, j2, elapsedRealtime, false);
            if (c95544Ro.A0N.getAndSet(c4rq.A0S) != c4rq.A0S) {
                C4SK c4sk = c95544Ro.A03;
                if (c4sk != null) {
                    num = c4sk.BTX();
                } else {
                    num = null;
                }
                if (num == C05F.A04) {
                    str3 = null;
                }
                ?? c0Zx = new C0Zx();
                if (str3 != null) {
                    c0Zx.A06("fb_manifest_identifier", str3);
                }
                c0Zx.A03("is_predictive_playback", Boolean.valueOf(c4rv.A0B));
                String str4 = c4ru.A0V;
                if (str4 != null) {
                    c0Zx.A06("client_latency_setting", str4);
                }
                c0Zx.A03("is_mixed_codec_manifest", Boolean.valueOf(c4ru.A0P));
                int i = c4ru.A05;
                c0Zx.A05("available_qualities_count", Long.valueOf(i));
                boolean z = true;
                if (i <= 1) {
                    z = false;
                }
                c0Zx.A03("is_abr_enabled", Boolean.valueOf(z));
                c95544Ro.A0G(c0Zx);
                c95544Ro.A0D.A00(new Runnable() { // from class: X.5RK
                    @Override // java.lang.Runnable
                    public final void run() {
                        C95544Ro.this.A0G(null);
                    }
                }, 0L);
            }
            C95534Rn c95534Rn = c95544Ro.A0H;
            if (c95534Rn != null) {
                C5RL.A00 = c95534Rn.A00;
                long j3 = c95544Ro.A01;
                C4SK c4sk2 = c95544Ro.A03;
                if (c4sk2 != null) {
                    c95804So = c4sk2.BoM();
                }
                boolean z2 = c42351xP.A08;
                long j4 = c42351xP.A01;
                long j5 = c42351xP.A00;
                if (c95804So != null) {
                    Object obj = c95804So.A00.get("tracking_type");
                    C14360o3.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                    if (C14360o3.A0K(obj, "paid") && z2) {
                        long j6 = j4 * 1000;
                        long j7 = j5 * 1000;
                        if (j3 >= j7) {
                            j3 = j7;
                        }
                        Handler handler = new Handler(Looper.getMainLooper());
                        handler.post(new RunnableC64707TQo(handler, new Object(), j3, j6));
                    }
                }
            }
            c95544Ro.A06 = A02;
            c95544Ro.A0B.A00(C4TA.A0N, A02);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0036, code lost:
    
        if (r30.A0O != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0A(X.C95544Ro r28, X.C4RV r29, X.C4RU r30, java.lang.String r31, long r32) {
        /*
            r4 = r28
            X.4Rl r1 = r4.A0A
            X.4Sz r0 = r4.A02
            r8 = r31
            X.4Sz r13 = r1.A00(r0, r8)
            if (r13 == 0) goto L77
            r0 = r29
            long r0 = r0.A02
            r11 = 0
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L1a
            r4.A01 = r0
        L1a:
            long r6 = r4.A01
            long r28 = android.os.SystemClock.elapsedRealtime()
            r14 = 0
            X.4RP r2 = r4.A09
            X.4RQ r5 = r2.A0I
            long r2 = r5.A0S
            java.lang.Long r17 = java.lang.Long.valueOf(r2)
            r9 = r30
            long r2 = r9.A0E
            int r10 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r10 > 0) goto L38
            boolean r3 = r9.A0O
            r2 = 0
            if (r3 == 0) goto L39
        L38:
            r2 = 1
        L39:
            java.lang.Boolean r16 = java.lang.Boolean.valueOf(r2)
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 <= 0) goto L78
            long r2 = r9.A0B
            long r0 = r0 - r2
            int r2 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r2 >= 0) goto L4a
            r0 = 0
        L4a:
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
        L4e:
            long r0 = r5.A0S
            java.lang.String r23 = java.lang.String.valueOf(r0)
            java.lang.String r19 = "paused"
            r30 = 0
            r24 = r32
            r15 = r14
            r21 = r14
            r22 = r14
            r26 = r6
            r20 = r8
            r13.A01(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26, r28, r30)
            r13.A00()
            X.4Rq r2 = r4.A0B
            java.lang.String r1 = A02(r4)
            X.4TA r0 = X.C4TA.A09
            r2.A00(r0, r1)
            r2.A01(r1)
        L77:
            return
        L78:
            r18 = 0
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95544Ro.A0A(X.4Ro, X.4RV, X.4RU, java.lang.String, long):void");
    }

    public static final void A0B(C95544Ro c95544Ro, C4RV c4rv, C4RU c4ru, String str, boolean z) {
        C95904Sz A00 = c95544Ro.A0A.A00(c95544Ro.A02, str);
        if (A00 != null) {
            long j = c4rv.A02;
            if (j > 0) {
                c95544Ro.A01 = j;
            }
            A00.A01(null, null, null, null, null, "completed", str, null, null, null, c4ru.A00(), c95544Ro.A01, SystemClock.elapsedRealtime(), z);
            A00.A00();
            if (z) {
                long j2 = c95544Ro.A01;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C4RQ c4rq = c95544Ro.A09.A0I;
                A00.A01(null, null, null, Long.valueOf(c4rq.A0S), null, "started_playing", str, null, null, String.valueOf(c4rq.A0S), 0L, j2, elapsedRealtime, z);
            }
            c95544Ro.A0B.A00(C4TA.A06, A02(c95544Ro));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r6 = r10.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (X.AbstractC002300n.A0g(r0, r6, false) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
    
        r0 = r9.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        r0 = r0.A0D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        if (X.AbstractC002300n.A0g(r0, r6, false) != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r8 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r5 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if ((!r6.equals("0")) == false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        if (r5 == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        r9.A04 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r8 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        r9.A05 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
    
        r0 = r9.A03;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        if (r0 == null) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0057, code lost:
    
        r1 = r0.BTX();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005b, code lost:
    
        r3 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
    
        if (r1 != X.C05F.A04) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0060, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r0 = new X.C11L("mpd_qe=(.*?)\\)").A06(r6, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006c, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006e, code lost:
    
        r1 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
    
        if (r1 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        r0 = r1.A09(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r0 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0079, code lost:
    
        r4 = r0.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        if (r8 == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007d, code lost:
    
        r2 = new X.C0Zx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if (r3 == null) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0084, code lost:
    
        r2.A06("representation_id", r3);
        r2.A06("video_representation_id", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
    
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
    
        if (r0 <= 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        r2.A05("encoded_bitrate_client_side", java.lang.Long.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x009c, code lost:
    
        r0 = A01(r10.A0C);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r0 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a4, code lost:
    
        r2.A04("unified_upload_mos_client_side", java.lang.Double.valueOf(r0.doubleValue()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x000d, code lost:
    
        if (X.AbstractC002300n.A0h(r2, org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND, false) != true) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b1, code lost:
    
        r1 = A01(r10.A09);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b7, code lost:
    
        if (r1 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b9, code lost:
    
        r2.A04("playback_resolution_mos", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00be, code lost:
    
        r1 = r9.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
    
        if (r1 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
    
        r2.A06("encoding_tag_video", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c7, code lost:
    
        if (r4 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c9, code lost:
    
        r2.A06("mpd_qe_experiment", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ce, code lost:
    
        r9.A0G(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00d1, code lost:
    
        if (r5 == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d3, code lost:
    
        r2 = new X.C0Zx();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d8, code lost:
    
        if (r3 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00da, code lost:
    
        r2.A06("audio_representation_id", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00df, code lost:
    
        r0 = r10.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e1, code lost:
    
        if (r0 <= 0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00e3, code lost:
    
        r2.A05("encoded_bitrate_client_side", java.lang.Long.valueOf(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ed, code lost:
    
        r1 = r9.A08;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ef, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f1, code lost:
    
        r2.A06("encoding_tag_audio", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00f6, code lost:
    
        r9.A0G(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (X.AbstractC002300n.A0h(r2, org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND, false) != true) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00fa, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00fd, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x003f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0100, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0103, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r9.A08 = r10.A07;
        r0 = r9.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0010, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if (r0 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        r0 = r0.A0D;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [X.4T2, X.0Zx] */
    /* JADX WARN: Type inference failed for: r2v3, types: [X.4T2, X.0Zx] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0C(X.C95544Ro r9, X.C98704bq r10) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C95544Ro.A0C(X.4Ro, X.4bq):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [X.5hv, X.0Zx] */
    private final void A0D(C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        Long l;
        C95904Sz A00 = this.A0A.A00(this.A02, str);
        if (A00 != 0) {
            long A08 = (int) this.A09.A0I.A08();
            ?? c0Zx = new C0Zx();
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "failed_playing");
            c0Zx.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "failed_playing");
            C4Y0 c4y0 = c117275Sm.A00;
            c0Zx.A06(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, c4y0.toString());
            c0Zx.A06("error", c4y0.name());
            c0Zx.A06(DevServerEntity.COLUMN_DESCRIPTION, c117275Sm.A02);
            c0Zx.A06("domain", c117275Sm.A01.toString());
            c0Zx.A06("last_encoding_tag", this.A08);
            long j = c4rv.A02;
            if (j > 0) {
                this.A01 = j;
            }
            long j2 = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (j > 0) {
                long j3 = j - c4ru.A0B;
                if (j3 < 0) {
                    j3 = 0;
                }
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            A00.A01(c0Zx, null, null, null, l, "error", str, null, null, null, A08, j2, elapsedRealtime, false);
            A00.A00();
            C95564Rq c95564Rq = this.A0B;
            String A02 = A02(this);
            c95564Rq.A00(C4TA.A0A, A02);
            c95564Rq.A01(A02);
        }
    }

    public final void A0E() {
        String str;
        InterfaceC02550Ad interfaceC02550Ad = this.A0F;
        C42351xP c42351xP = this.A0C;
        C95554Rp.A00(interfaceC02550Ad, A00(), c42351xP, "client_video_requested_playing", null);
        String A02 = A02(this);
        C95514Rl c95514Rl = this.A0A;
        C95904Sz A00 = c95514Rl.A00(this.A02, A02);
        if (A00 != null) {
            if (c42351xP.A0I) {
                if (c95514Rl.A02(this.A00, false)) {
                    str = "started";
                } else {
                    str = "unpaused";
                }
            } else {
                str = null;
            }
            long j = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C4RQ c4rq = this.A09.A0I;
            A00.A01(null, null, null, Long.valueOf(c4rq.A0S), null, "requested_playing", A02, str, null, String.valueOf(c4rq.A0S), 0L, j, elapsedRealtime, false);
            this.A0B.A00(C4TA.A0I, A02);
        }
    }

    public final void A0F(long j, String str) {
        String str2 = this.A06;
        if (str2 == null) {
            str2 = A02(this);
        }
        C95564Rq c95564Rq = this.A0B;
        c95564Rq.A00(C4TA.A0H, str2);
        c95564Rq.A01(str2);
        C95904Sz A00 = this.A0A.A00(this.A02, str2);
        if (A00 != null) {
            A00.A01(null, null, null, null, null, "requested_pause", str2, null, str, null, j, this.A01, SystemClock.elapsedRealtime(), false);
            if (this.A0C.A0F) {
                A00.A00();
            }
        }
    }

    public final void A0G(C4T2 c4t2) {
        if (c4t2 != null) {
            String A02 = A02(this);
            C95904Sz A00 = this.A0A.A00(this.A02, A02);
            long A08 = (int) this.A09.A0I.A08();
            if (A00 == null) {
                C4SK c4sk = this.A03;
                if (c4sk != null) {
                    c4sk.EW8(c4t2, A02);
                    return;
                }
                return;
            }
            long j = this.A01;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            A00.A02.getAndIncrement();
            A00.A01.offer(new C4T9(null, c4t2, null, null, null, null, "tags_changed", A02, null, null, null, elapsedRealtime, A08, j, false));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
    @Override // X.C4RS
    public final void DPI(boolean z) {
        if (!this.A0C.A0B) {
            ?? c0Zx = new C0Zx();
            c0Zx.A03("is_broadcast_interrupted", Boolean.valueOf(z));
            A0G(c0Zx);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
    @Override // X.C4RS
    public final void DZA(C4RU c4ru, float f, long j) {
        if (!this.A0C.A0B) {
            ?? c0Zx = new C0Zx();
            c0Zx.A04("playback_speed", Double.valueOf(f));
            A0G(c0Zx);
        }
    }

    @Override // X.C4RS
    public final void DaU(long j, String str) {
        this.A0B.A00(C4TA.A0C, A02(this));
    }

    @Override // X.C4RS
    public final void Dou(long j, long j2, boolean z, boolean z2, boolean z3) {
        if (!this.A0C.A0B) {
            A05(this, j, z3);
        }
    }

    @Override // X.C4RS
    public final void Dzn() {
        C42351xP c42351xP = this.A0C;
        if (c42351xP.A0D && !c42351xP.A0C) {
            A0E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.4T2, X.0Zx] */
    @Override // X.C4RS
    public final void Dzu(int i, int i2, float f) {
        if (!this.A0C.A0B) {
            ?? c0Zx = new C0Zx();
            c0Zx.A05("video_width", Long.valueOf(i));
            c0Zx.A05("video_height", Long.valueOf(i2));
            A0G(c0Zx);
        }
    }

    @Override // X.C4RS
    public final void onSeeking(long j) {
        if (!this.A0C.A0B) {
            A04(this);
        }
    }
}
