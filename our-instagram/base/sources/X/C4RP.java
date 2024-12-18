package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.4RP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4RP {
    public static final Handler A0b = new Handler(Looper.getMainLooper());
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public View A04;
    public C95484Ri A05;
    public U9G A06;
    public OLA A07;
    public C4SS A08;
    public C4RH A09;
    public String A0A;
    public boolean A0B;
    public AudioManager A0C;
    public C95744Si A0D;
    public final C4RK A0E;
    public final C95454Rf A0F;
    public final C4R9 A0G;
    public final C4R4 A0H;
    public final C4RQ A0I;
    public final HeroPlayerSetting A0J;
    public final HashMap A0K;
    public final HashMap A0L;
    public final AtomicBoolean A0M;
    public final AtomicBoolean A0N;
    public final AtomicBoolean A0O;
    public final AtomicReference A0P;
    public final AtomicReference A0Q;
    public final AtomicReference A0R;
    public final Context A0S;
    public final Handler A0T;
    public final Looper A0U;
    public final C4R6 A0V;
    public final C4R7 A0W;
    public final C4RF A0X;
    public final Runnable A0Y;
    public final AtomicBoolean A0Z;
    public volatile C95734Sh A0a;

    public C4RP(Context context, Handler handler, Looper looper, C4RG c4rg, C4RK c4rk, C4R9 c4r9, C4RB c4rb, C4R6 c4r6, C4R7 c4r7, C4R4 c4r4, C4RO c4ro, C4RF c4rf, C4RD c4rd, HeroPlayerSetting heroPlayerSetting, C4RH c4rh) {
        this.A0S = context;
        this.A0H = c4r4;
        this.A0V = c4r6;
        this.A0W = c4r7;
        this.A0E = c4rk;
        this.A0X = c4rf;
        this.A09 = c4rh;
        AtomicInteger atomicInteger = C4RQ.A0b;
        C4RQ c4rq = new C4RQ(handler, looper, c4ro, c4rf, new C4RS() { // from class: X.4RR
            @Override // X.C4RS
            public final void Cy0(C98704bq c98704bq) {
            }

            @Override // X.C4RS
            public final void D5g(String str, boolean z) {
                C14360o3.A0B(str, 0);
                final C95734Sh c95734Sh = C4RP.this.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4bt
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void D9S(final long j, final String str, final boolean z) {
                C14360o3.A0B(str, 0);
                C4RP c4rp = C4RP.this;
                if (z) {
                    c4rp.A0Q.set(str);
                    c4rp.A03 = j;
                } else {
                    c4rp.A0P.set(str);
                    c4rp.A00 = j;
                }
                c4rp.A0H.D9S(j, str, z);
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4bu
                        @Override // java.lang.Runnable
                        public final void run() {
                            C95734Sh.this.A02.Civ(j, str, z);
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void DBq(final C98704bq c98704bq, final String str, final List list, long j, boolean z) {
                C14360o3.A0B(c98704bq, 0);
                C14360o3.A0B(str, 2);
                C4RP c4rp = C4RP.this;
                c4rp.A0H.DBq(c98704bq, str, list, j, z);
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    final int i = (int) j;
                    final long A05 = c4rp.A05();
                    final long A04 = c4rp.A04();
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4bx
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4R6 c4r62 = C95734Sh.this.A02;
                            int i2 = i;
                            c4r62.ClH(c98704bq, str, list, i2, A05, A04);
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void DER(C117275Sm c117275Sm, String str, String str2, String str3, long j) {
                C14360o3.A0B(str, 1);
                C14360o3.A0B(str2, 3);
                C14360o3.A0B(str3, 4);
                C4RP c4rp = C4RP.this;
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    c4rp.A0I.A07();
                    c4rp.A04();
                    C95734Sh.A00(c95734Sh, new RunnableC71422Wtk(c95734Sh, c117275Sm));
                }
            }

            @Override // X.C4RS
            public final void DIJ(String str, long j) {
                C14360o3.A0B(str, 0);
                C4RP.this.A0H.DIJ(str, j);
            }

            @Override // X.C4RS
            public final void DLl(String str, byte[] bArr, long j) {
                C14360o3.A0B(bArr, 0);
                C14360o3.A0B(str, 1);
            }

            @Override // X.C4RS
            public final void DPK(String str, byte[] bArr, long j, long j2) {
                C14360o3.A0B(bArr, 0);
                C14360o3.A0B(str, 1);
            }

            @Override // X.C4RS
            public final /* synthetic */ void DPS(C68692VaS c68692VaS) {
            }

            @Override // X.C4RS
            public final void DTa(Object obj) {
                C14360o3.A0B(obj, 0);
            }

            @Override // X.C4RS
            public final void DVN(byte[] bArr, long j) {
                C14360o3.A0B(bArr, 0);
                C4RP.this.A0H.DVN(bArr, j);
            }

            @Override // X.C4RS
            public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 1);
                C14360o3.A0B(c117275Sm, 3);
                C14360o3.A0B(str, 4);
                C4RP c4rp = C4RP.this;
                c4rp.A0O.set(true);
                C4RP.A03(c4rp, true);
                c4rp.A0H.DZ1(c5n5, c117275Sm, c4rv, c4ru, str);
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71628Wxa(c95734Sh, c5n5, c117275Sm, c4rv, c4ru, str, c4rp.A0B));
                }
            }

            @Override // X.C4RS
            public final void DZ6(EnumC46692Ch enumC46692Ch) {
                C14360o3.A0B(enumC46692Ch, 0);
            }

            @Override // X.C4RS
            public final void DZA(C4RU c4ru, float f, long j) {
                C14360o3.A0B(c4ru, 2);
                C95734Sh c95734Sh = C4RP.this.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71424Wtm(c95734Sh, c4ru));
                }
            }

            @Override // X.C4RS
            public final void DaU(final long j, final String str) {
                C14360o3.A0B(str, 1);
                C4RP c4rp = C4RP.this;
                c4rp.A0H.DaU(j, str);
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4ZH
                        @Override // java.lang.Runnable
                        public final void run() {
                            C95734Sh.this.A02.Cku(j, str);
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void Dny(final C4RV c4rv, final C4RU c4ru, final String str, final long j, final boolean z, final boolean z2) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 1);
                C14360o3.A0B(str, 5);
                C4RP c4rp = C4RP.this;
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    final int A08 = (int) c4rp.A0I.A08();
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4ZB
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4R7 c4r72 = C95734Sh.this.A03;
                            int i = A08;
                            C4RU c4ru2 = c4ru;
                            C4RV c4rv2 = c4rv;
                            boolean z3 = z;
                            boolean z4 = z2;
                            c4r72.Clk(c4rv2, c4ru2, str, i, j, z3, z4);
                        }
                    });
                }
                c4rp.A0H.Dnx(z2);
            }

            @Override // X.C4RS
            public final /* synthetic */ void Dp7(C5n5 c5n5) {
            }

            @Override // X.C4RS
            public final void DpT(boolean z) {
            }

            @Override // X.C4RS
            public final void DtM(List list) {
                C14360o3.A0B(list, 0);
            }

            @Override // X.C4RS
            public final void Duk(C117275Sm c117275Sm, C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
                C14360o3.A0B(c98704bq, 0);
                C14360o3.A0B(c98704bq2, 1);
                C14360o3.A0B(str, 3);
                C14360o3.A0B(str2, 5);
                C14360o3.A0B(c117275Sm, 6);
                C4RP c4rp = C4RP.this;
                c4rp.A0H.Duj(c98704bq, c98704bq2, str, str2, list, j);
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71633Wxf(c95734Sh, c117275Sm, c98704bq, c98704bq2, str, str2, list, j));
                }
            }

            @Override // X.C4RS
            public final void Dyn(C4RV c4rv, C4RU c4ru, String str, String str2, String str3, String str4, long j, boolean z) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 1);
                C14360o3.A0B(str, 2);
                C14360o3.A0B(str3, 4);
                C14360o3.A0B(str4, 7);
                C4RP c4rp = C4RP.this;
                c4rp.A0H.Dym();
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC65794TuC(c95734Sh, c4rv, c4ru, str, str2, str3, str4, (int) (SystemClock.elapsedRealtime() - c4rp.A02), j, z, c4rp.A0B));
                }
                C4RP.A00(c4rp, str, j, SystemClock.elapsedRealtime() - c4rp.A02);
                C4RP.A03(c4rp, true);
            }

            @Override // X.C4RS
            public final void Dyu(final C5n5 c5n5, final C4RV c4rv, final C4RU c4ru, final Integer num, final String str, final String str2, final String str3, final boolean z, boolean z2) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 3);
                C14360o3.A0B(c5n5, 4);
                C14360o3.A0B(num, 5);
                C14360o3.A0B(str3, 8);
                C4RP c4rp = C4RP.this;
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.5n8
                        @Override // java.lang.Runnable
                        public final void run() {
                            String A00 = C95744Si.A00(null);
                            C4R6 c4r62 = C95734Sh.this.A02;
                            C4RU c4ru2 = c4ru;
                            String str4 = str;
                            String str5 = str2;
                            C4RV c4rv2 = c4rv;
                            c4r62.Cir(c5n5, c4rv2, c4ru2, num, str4, str5, A00, str3, z);
                        }
                    });
                }
                C4RP.A03(c4rp, true);
                c4rp.A0H.Dyv(c5n5, c4ru.A00());
            }

            @Override // X.C4RS
            public final void DzE(final C5n5 c5n5, final C4RV c4rv, final C4RU c4ru, final Integer num, final String str, final String str2, final String str3, final String str4, final String str5, long j, final long j2, boolean z) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 3);
                C14360o3.A0B(c5n5, 4);
                C14360o3.A0B(num, 6);
                C14360o3.A0B(str3, 8);
                C14360o3.A0B(str5, 11);
                if (z) {
                    C4RP.this.A0H.DzF(c5n5, str5, j, j2, z);
                }
                C4RP c4rp = C4RP.this;
                c4rp.A01 = j2;
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    final int i = (int) j;
                    final String A00 = C0KB.A00(c4rp.A09.BAQ());
                    C14360o3.A07(A00);
                    final boolean z2 = c4rp.A0B;
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.5ti
                        public final /* synthetic */ int A00 = -1;

                        @Override // java.lang.Runnable
                        public final void run() {
                            String A002 = C95744Si.A00(null);
                            C4R6 c4r62 = C95734Sh.this.A02;
                            C4RU c4ru2 = c4ru;
                            String str6 = str;
                            String str7 = str2;
                            C4RV c4rv2 = c4rv;
                            C5n5 c5n52 = c5n5;
                            int i2 = i;
                            Integer num2 = num;
                            long j3 = j2;
                            c4r62.Ckr(c5n52, c4rv2, c4ru2, num2, str6, str7, "unknown", A00, str3, str4, A002, str5, i2, -1, 0, j3, z2);
                        }
                    });
                }
                C4RP.A02(c4rp, false);
                U9G u9g = c4rp.A06;
                if (u9g != null) {
                    U9G.A00(u9g);
                    u9g.removeMessages(2);
                    u9g.A03 = 0;
                    u9g.A01.set(EnumC68129VCn.A04);
                }
            }

            @Override // X.C4RS
            public final void Dzu(int i, int i2, float f) {
                if (i == 0 && i2 == 0) {
                    return;
                }
                C4RP c4rp = C4RP.this;
                c4rp.A09.Dzu(i, i2, f);
                c4rp.A0H.Dzx(i, i2, f);
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh == null) {
                    return;
                }
                C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4c6
                    @Override // java.lang.Runnable
                    public final void run() {
                    }
                });
            }

            @Override // X.C4RS
            public final void E08(final C4RV c4rv, final C4RU c4ru, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final long j, final boolean z, final boolean z2) {
                C14360o3.A0B(c4ru, 0);
                C14360o3.A0B(c4rv, 3);
                C14360o3.A0B(str3, 6);
                C14360o3.A0B(str7, 11);
                C4RP c4rp = C4RP.this;
                if (c4rp.A0N.get() || c4rp.A0J.A24) {
                    c4rp.A0H.E07(c4ru, str4, str3, str5, str6, str7, j, z);
                }
                final C95734Sh c95734Sh = c4rp.A0a;
                long elapsedRealtime = SystemClock.elapsedRealtime() - c4rp.A02;
                if (c95734Sh != null) {
                    final int i = (int) elapsedRealtime;
                    final int i2 = (int) c4rp.A03;
                    final int i3 = (int) c4rp.A00;
                    final String str8 = c4rp.A0A;
                    C14360o3.A0B(str8, 15);
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.5RD
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4R6 c4r62 = C95734Sh.this.A02;
                            C4RU c4ru2 = c4ru;
                            String str9 = str;
                            String str10 = str2;
                            C4RV c4rv2 = c4rv;
                            boolean z3 = z;
                            boolean z4 = z2;
                            String str11 = str3;
                            String str12 = str4;
                            long j2 = j;
                            int i4 = i;
                            c4r62.Clp(c4rv2, c4ru2, str9, str10, str11, str12, str5, str6, str7, str8, i4, i2, i3, j2, z3, z4);
                        }
                    });
                }
                C4RP.A00(c4rp, str3, j, elapsedRealtime);
                U9G u9g = c4rp.A06;
                if (u9g != null) {
                    u9g.A03 = (int) c4ru.A00();
                    u9g.A01.set(EnumC68129VCn.A03);
                    u9g.removeMessages(2);
                    u9g.sendEmptyMessageDelayed(2, 200L);
                }
                if (c4rp.A0J.A2X) {
                    Surface BAQ = c4rp.A09.BAQ();
                    if (BAQ != null) {
                        BAQ.isValid();
                    }
                    C4RP.A02(c4rp, true);
                }
            }

            @Override // X.C4RS
            public final void E1j(C117275Sm c117275Sm) {
                C14360o3.A0B(c117275Sm, 0);
                C4RP c4rp = C4RP.this;
                c4rp.A0H.E1j(c117275Sm);
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71423Wtl(c95734Sh, c117275Sm));
                }
            }

            @Override // X.C4RS
            public final void onCues(List list) {
                C14360o3.A0B(list, 0);
                C4RP.this.A0H.onCues(list);
            }

            @Override // X.C4RS
            public final void D9T(int i, int i2, int i3, int i4) {
                C4RP.this.A0H.D9T(i, i2, i3, i4);
            }

            @Override // X.C4RS
            public final void DPI(boolean z) {
                C4RP c4rp = C4RP.this;
                c4rp.A0B = z;
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71261Wqq(c95734Sh));
                }
            }

            @Override // X.C4RS
            public final void DY8(String str, String str2) {
                final C95734Sh c95734Sh = C4RP.this.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4Td
                        @Override // java.lang.Runnable
                        public final void run() {
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void DZ0() {
                C4RP.this.A0H.DZ0();
            }

            @Override // X.C4RS
            public final void DaY() {
                C4RP.this.A0H.DaY();
            }

            @Override // X.C4RS
            public final void Dou(long j, final long j2, final boolean z, final boolean z2, boolean z3) {
                C4RP c4rp = C4RP.this;
                c4rp.A0H.Dot((int) j2);
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    final int A08 = (int) c4rp.A0I.A08();
                    final long A05 = c4rp.A05();
                    final long A04 = c4rp.A04();
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4ZK
                        @Override // java.lang.Runnable
                        public final void run() {
                            C95734Sh.this.A03.Cj6(null, A08, j2, A05, A04, z, z2);
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void Dzn() {
                C4RP c4rp = C4RP.this;
                final C95734Sh c95734Sh = c4rp.A0a;
                c4rp.A02 = SystemClock.elapsedRealtime();
                if (c95734Sh != null) {
                    final int A08 = (int) c4rp.A0I.A08();
                    final long A05 = c4rp.A05();
                    final long A04 = c4rp.A04();
                    final String str = c4rp.A0A;
                    C14360o3.A0B(str, 3);
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4Th
                        @Override // java.lang.Runnable
                        public final void run() {
                            C95734Sh.this.A02.ClK(null, str, A08, A05, A04);
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void Dzs() {
                C95734Sh c95734Sh = C4RP.this.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC71262Wqr(c95734Sh));
                }
            }

            @Override // X.C4RS
            public final void E1K(boolean z, boolean z2) {
                C4RP c4rp = C4RP.this;
                c4rp.A0H.E1J(z);
                C95484Ri c95484Ri = c4rp.A05;
                if (c95484Ri != null) {
                    synchronized (c95484Ri) {
                    }
                }
            }

            @Override // X.C4RS
            public final void onDrawnToSurface() {
                C4RP c4rp = C4RP.this;
                c4rp.A0H.onDrawnToSurface();
                final C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new Runnable() { // from class: X.4c7
                        @Override // java.lang.Runnable
                        public final void run() {
                            C95734Sh.this.A02.Cix();
                        }
                    });
                }
            }

            @Override // X.C4RS
            public final void onSeeking(long j) {
                C4RP c4rp = C4RP.this;
                c4rp.A0H.onSeeking(j);
                C95734Sh c95734Sh = c4rp.A0a;
                if (c95734Sh != null) {
                    C95734Sh.A00(c95734Sh, new RunnableC65869TvW(c95734Sh, j));
                }
            }
        }, null, c4rd, heroPlayerSetting);
        this.A0I = c4rq;
        this.A0N = new AtomicBoolean(false);
        this.A0O = new AtomicBoolean(false);
        this.A0R = new AtomicReference(Float.valueOf(0.0f));
        this.A0Z = new AtomicBoolean(false);
        this.A0Q = new AtomicReference("Unset");
        this.A0P = new AtomicReference("Unset");
        this.A0M = new AtomicBoolean(false);
        this.A01 = -1L;
        this.A02 = -1L;
        this.A03 = -1L;
        this.A00 = -1L;
        C0K8.A0C("GrootExperimentConfig", "UNSUPPORTED");
        C95454Rf c95454Rf = C95454Rf.A00;
        C14360o3.A07(c95454Rf);
        this.A0F = c95454Rf;
        this.A0A = "NOT_IN_REUSE";
        this.A0Y = new Runnable() { // from class: X.4Rg
            @Override // java.lang.Runnable
            public final void run() {
                C4RP c4rp = C4RP.this;
                View view = c4rp.A04;
                if (view != null && c4rp.A09.BAQ() == null) {
                    view.getParent();
                }
            }
        };
        this.A0L = new HashMap();
        this.A0K = new HashMap();
        if (c4rk != null) {
            c4rk.ADh(c4rq);
        }
        Looper looper2 = handler.getLooper();
        this.A0U = looper2;
        if (!heroPlayerSetting.A2q) {
            this.A0C = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        }
        if (!heroPlayerSetting.A1T) {
            C14360o3.A0A(looper);
            this.A07 = new OLA(new Handler(looper), c4rg, this, c4rb, heroPlayerSetting);
        }
        this.A0J = heroPlayerSetting;
        this.A0T = handler;
        if (!heroPlayerSetting.A1Y) {
            this.A06 = new U9G(looper2, this, this);
        }
        this.A0G = c4r9;
        if (c4r9.A01) {
            this.A05 = new C95484Ri(A0b, new C95474Rh(this), heroPlayerSetting);
        }
        synchronized (this) {
        }
    }

    public final void A0B(ViewGroup viewGroup, Integer num) {
        C14360o3.A0B(viewGroup, 0);
        C4RH c4rh = this.A09;
        Context context = viewGroup.getContext();
        C14360o3.A07(context);
        View AMm = c4rh.AMm(context, this, this);
        this.A04 = AMm;
        if (AMm != null) {
            AMm.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        }
        View view = this.A04;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.A04);
            }
        }
        if (num != null) {
            viewGroup.addView(this.A04, num.intValue());
        } else {
            viewGroup.addView(this.A04);
        }
    }

    public final void A0D(C4SS c4ss) {
        C4ST A06;
        this.A08 = c4ss;
        String str = c4ss.A0K.A0G;
        this.A0a = new C95734Sh(this.A0U, this, this.A0V, this.A0W, str);
        this.A0D = new C95744Si(str);
        if (this.A0G.A00 && str != null && (A06 = A06(c4ss)) != null) {
            this.A09.ACK(A06);
            C95734Sh c95734Sh = this.A0a;
            if (c95734Sh != null) {
                C95734Sh.A00(c95734Sh, new RunnableC65744TtJ(c95734Sh, A06));
            }
        }
        this.A0I.A0E(c4ss);
        OLA ola = this.A07;
        if (ola != null) {
            ola.A05.set(1);
        }
    }

    public final void A0F(String str, float f) {
        OLA ola;
        if (f <= 0.0f) {
            OLA ola2 = this.A07;
            if (ola2 != null) {
                ola2.A00();
            }
            f = 0.0f;
        } else if (this.A0N.get() && (ola = this.A07) != null) {
            ola.A01();
        }
        this.A0R.set(Float.valueOf(f));
        this.A0I.A0G(str, f);
    }

    public static final void A01(C4RP c4rp, String str, boolean z) {
        String str2;
        C4RQ c4rq = c4rp.A0I;
        c4rq.A0F(str);
        boolean z2 = c4rp.A0N.get();
        A03(c4rp, z);
        if (z2) {
            C4R4 c4r4 = c4rp.A0H;
            long A08 = (int) c4rq.A08();
            C5n5 c5n5 = C5n5.A03;
            C14360o3.A0A(c5n5);
            C4SS c4ss = c4rp.A08;
            if (c4ss == null || (str2 = c4ss.A07) == null) {
                str2 = "";
            }
            c4r4.DzF(c5n5, str2, A08, 0L, false);
        }
    }

    public static final void A02(C4RP c4rp, boolean z) {
        if (c4rp.A0Z.compareAndSet(!z, z)) {
            A0b.post(new RunnableC24577AuY(c4rp, z));
        }
    }

    public static final void A03(C4RP c4rp, boolean z) {
        OLA ola;
        c4rp.A0N.set(false);
        if (z && (ola = c4rp.A07) != null) {
            ola.A00();
        }
        A02(c4rp, false);
        U9G u9g = c4rp.A06;
        if (u9g != null) {
            U9G.A00(u9g);
            u9g.removeMessages(2);
            u9g.A03 = 0;
            u9g.A01.set(EnumC68129VCn.A04);
        }
    }

    public final int A04() {
        long j;
        C4RQ c4rq = this.A0I;
        C4RV c4rv = (C4RV) c4rq.A0N.get();
        if (c4rq.A0I()) {
            j = c4rv.A02;
        } else {
            j = 0;
        }
        return (int) j;
    }

    public final int A05() {
        long j;
        C4RQ c4rq = this.A0I;
        if (c4rq.A0I()) {
            j = ((C4RU) c4rq.A0B.get()).A0J;
        } else {
            j = 0;
        }
        return (int) j;
    }

    public final C4ST A06(C4SS c4ss) {
        C4RQ c4rq = this.A0I;
        C4RQ.A05(c4rq, "trySwitchToWarmupPlayer", new Object[0]);
        c4rq.A0W = null;
        c4rq.A0R = 0;
        C459529d A00 = c4rq.A06.A00();
        if (A00 != null) {
            C46602By c46602By = A00.A0J;
            String str = c4ss.A0K.A0G;
            C4ST A01 = C46602By.A01(c46602By, str);
            if (A01 != null) {
                C4RQ.A05(c4rq, "found warmup player", new Object[0]);
                Handler handler = c4rq.A0E;
                handler.sendMessage(handler.obtainMessage(21, A01));
                c4rq.A0W = str;
                c4rq.A0R = A01.A02;
                return A01;
            }
        }
        return null;
    }

    public final void A07() {
        OLA ola;
        if (((Number) this.A0R.get()).floatValue() > 0.0f && (ola = this.A07) != null) {
            ola.A01();
        }
        this.A0I.A0B();
        this.A0N.set(true);
        this.A0O.set(false);
        "unknown".equals("updated");
    }

    public final void A08() {
        Object obj;
        C6Q3 c6q3;
        String str;
        C6Q2 Be3 = this.A09.Be3();
        boolean z = Be3.A00;
        C126145nB c126145nB = null;
        if (z) {
            obj = this.A09.C4P();
        } else {
            obj = null;
        }
        if (obj instanceof C6Q3) {
            c6q3 = (C6Q3) obj;
        } else {
            c6q3 = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && (obj instanceof C126145nB)) {
            c126145nB = (C126145nB) obj;
        }
        C95734Sh c95734Sh = this.A0a;
        if (c95734Sh != null) {
            AbstractC459729h.A01("GrootPlayerLogger", "PlayerId %d disableHeartbeat for vid %s ", Long.valueOf(c95734Sh.A01.A0I.A0S), c95734Sh.A04);
            c95734Sh.A05.set(true);
        }
        C4RQ c4rq = this.A0I;
        if (c4rq.A0J() || this.A0N.get()) {
            AbstractC459729h.A01("GrootPlayer", "Calling release while state is playing", new Object[0]);
        }
        C4RK c4rk = this.A0E;
        C14360o3.A0A(c4rk);
        c4rk.F93();
        if (z) {
            C4SS c4ss = c4rq.A0F.A07;
            if (c4ss != null && (str = c4ss.A0K.A0G) != null) {
                long j = c4rq.A0S;
                C4AN c4an = c4ss.A0K;
                C4ST c4st = new C4ST(null, c126145nB, str, str, c4an.A0A, c4an.A0B, (int) c4rq.A08(), j, 0L);
                c4st.A00 = c6q3;
                c4st.A01 = Be3.A01;
                C4RQ.A05(c4rq, "moveToWarmupPool", new Object[0]);
                Handler handler = c4rq.A0E;
                handler.sendMessage(handler.obtainMessage(38, c4st));
                synchronized (c4rq.A0K) {
                    C95544Ro c95544Ro = c4rq.A02;
                    if (c95544Ro != null) {
                        c95544Ro.A0F(c4rq.A08(), null);
                    }
                }
            }
        } else {
            C4RQ.A05(c4rq, "release", new Object[0]);
            Handler handler2 = c4rq.A0E;
            handler2.sendMessage(handler2.obtainMessage(8));
        }
        A03(this, true);
        this.A0O.set(false);
        this.A0R.set(Float.valueOf(0.0f));
        OLA ola = this.A07;
        if (ola != null) {
            ola.A05.set(1);
            ola.A00();
        }
        this.A0L.clear();
        this.A0K.clear();
        this.A09.Ded();
    }

    public final void A09(Surface surface) {
        this.A0I.A0D(surface);
    }

    public final void A0A(ViewGroup viewGroup) {
        ViewParent viewParent;
        View view;
        ViewParent parent;
        View view2 = this.A04;
        if (view2 != null && (parent = view2.getParent()) != viewGroup) {
            this.A0H.E1j(new C117275Sm(C4Y0.A12, EnumC117265Sl.A0I, StringFormatUtil.formatStrLocaleSafe("mPlayerView's parent %s is not consistent with viewGroup %s passed in detachPlayerView", C0KB.A00(parent), C0KB.A00(viewGroup))));
        }
        View view3 = this.A04;
        if (view3 != null) {
            viewParent = view3.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent == viewGroup && (view = this.A04) != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(this.A04);
            }
        }
        this.A09.D9z(viewGroup);
    }

    public final void A0C(C95544Ro c95544Ro) {
        C4RQ c4rq = this.A0I;
        synchronized (c4rq.A0K) {
            c4rq.A02 = c95544Ro;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.facebook.video.heroplayer.client.HeroClientResultReceiver, java.lang.Object, android.os.ResultReceiver] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.facebook.video.heroplayer.client.HeroClientResultReceiver, java.lang.Object, android.os.ResultReceiver] */
    public final void A0E(final Runnable runnable) {
        if (runnable == null) {
            C4RQ c4rq = this.A0I;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            Object obj = c4rq.A0J;
            synchronized (obj) {
                RunnableC71263Wqs runnableC71263Wqs = new RunnableC71263Wqs(c4rq);
                C4RQ.A05(c4rq, "releaseSurface", new Object[0]);
                ?? resultReceiver = new ResultReceiver(null);
                resultReceiver.A00 = runnableC71263Wqs;
                Handler handler = c4rq.A0E;
                handler.sendMessage(handler.obtainMessage(7, resultReceiver));
                if (!c4rq.A08.A3F) {
                    try {
                        obj.wait(2000L);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
            C4RQ.A05(c4rq, "releaseSurface time: %d", Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
            return;
        }
        C4RQ c4rq2 = this.A0I;
        Runnable runnable2 = new Runnable() { // from class: X.5yO
            @Override // java.lang.Runnable
            public final void run() {
                C4RP.A0b.post(runnable);
            }
        };
        C4RQ.A05(c4rq2, "releaseSurface", new Object[0]);
        ?? resultReceiver2 = new ResultReceiver(null);
        resultReceiver2.A00 = runnable2;
        Handler handler2 = c4rq2.A0E;
        handler2.sendMessage(handler2.obtainMessage(7, resultReceiver2));
    }

    public static final void A00(C4RP c4rp, String str, long j, long j2) {
        String valueOf = String.valueOf(j);
        String valueOf2 = String.valueOf(j2);
        HashMap hashMap = new HashMap(3);
        hashMap.put("start_stall_reason", str);
        hashMap.put("exo_start_stall", valueOf);
        hashMap.put("start_stall", valueOf2);
        C14360o3.A07(Collections.unmodifiableMap(hashMap));
        C206979Ec c206979Ec = new C206979Ec(c4rp, 35);
        if (!c4rp.A0J.A1V) {
            c206979Ec.invoke();
        }
    }
}
