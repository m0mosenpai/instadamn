package X;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.util.lifecycle.ViewOwnerTracker;
import com.facebook.endtoend.EndToEnd;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes11.dex */
public final class WYB implements C4R4, View.OnAttachStateChangeListener, C4QY {
    public static final HandlerThread A0P;
    public View A00;
    public C69047Vgo A01;
    public ViewOwnerTracker A02;
    public C4RP A03;
    public String A05;
    public InterfaceC16660sJ A06;
    public InterfaceC16660sJ A07;
    public boolean A08;
    public android.net.Uri A09;
    public C6I A0A;
    public UP4 A0B;
    public C4AN A0C;
    public Float A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public final Context A0K;
    public final C4AK A0M;
    public final Integer A0N;
    public final Integer A0O;
    public final CU4 A0L = new CU4(new C57238PbM(this, 36));
    public Integer A04 = C05F.A00;

    @Override // X.C4R4
    public final void D9S(long j, String str, boolean z) {
    }

    @Override // X.C4R4
    public final void D9T(int i, int i2, int i3, int i4) {
    }

    @Override // X.C4R4
    public final void DBq(C98704bq c98704bq, String str, List list, long j, boolean z) {
    }

    @Override // X.C4R4
    public final void DIJ(String str, long j) {
    }

    @Override // X.C4R4
    public final void DVN(byte[] bArr, long j) {
    }

    @Override // X.C4R4
    public final void DZ0() {
    }

    @Override // X.C4R4
    public final void DaY() {
    }

    @Override // X.C4R4
    public final void DrA() {
    }

    @Override // X.C4R4
    public final void Duj(C98704bq c98704bq, C98704bq c98704bq2, String str, String str2, List list, long j) {
    }

    @Override // X.C4R4
    public final void Dzx(int i, int i2, float f) {
    }

    @Override // X.C4R4
    public final void E1J(boolean z) {
    }

    @Override // X.C4R4
    public final void E1j(C117275Sm c117275Sm) {
    }

    @Override // X.C4R4
    public final void onDrawnToSurface() {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C14360o3.A0B(view, 0);
        if (view instanceof ViewGroup) {
            if (this.A03 == null) {
                UP4 up4 = this.A0B;
                String str = this.A05;
                if (str != null) {
                    String str2 = this.A0G;
                    String str3 = this.A0H;
                    String str4 = this.A0F;
                    C6I c6i = this.A0A;
                    if (c6i != null) {
                        A03(this.A09, c6i, up4, str, str2, str3, str4, this.A0I);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.A00 == null) {
                this.A00 = viewGroup;
                C4RP c4rp = this.A03;
                if (c4rp != null) {
                    c4rp.A0B(viewGroup, null);
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C14360o3.A0B(view, 0);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (this.A00 != null) {
                this.A00 = null;
                C4RP c4rp = this.A03;
                if (c4rp != null) {
                    c4rp.A0A(viewGroup);
                }
            }
            A02();
        }
    }

    static {
        HandlerThread handlerThread = new HandlerThread("GrootVideoPlayerThread", -2);
        AbstractC09770fa.A00(handlerThread);
        A0P = handlerThread;
    }

    private final void A00(Integer num) {
        this.A04 = num;
        C69047Vgo c69047Vgo = this.A01;
        if (c69047Vgo != null) {
            C102884kP c102884kP = c69047Vgo.A01;
            InterfaceC103384lE interfaceC103384lE = c69047Vgo.A02;
            C6FX c6fx = new C6FX();
            c6fx.A01(AbstractC68318VMe.A00(num));
            C6FG c6fg = c69047Vgo.A00;
            c6fx.A02(c6fg);
            AbstractC65702TsY.A1Q(c6fg, c102884kP, c6fx, interfaceC103384lE);
        }
    }

    public final void A01() {
        boolean z;
        C4RP c4rp = this.A03;
        if (c4rp != null && c4rp.A0I.A0J()) {
            z = true;
            C4RP c4rp2 = this.A03;
            if (c4rp2 != null) {
                C4RP.A01(c4rp2, "player_initiated", true);
            }
        } else {
            z = false;
        }
        this.A08 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0010, code lost:
    
        if (r3.A08 != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A02() {
        /*
            r3 = this;
            X.4RP r0 = r3.A03
            if (r0 == 0) goto L44
            r1 = 1
            X.4RQ r0 = r0.A0I
            boolean r0 = r0.A0J()
            if (r0 == r1) goto L12
            boolean r0 = r3.A08
            r1 = 0
            if (r0 == 0) goto L13
        L12:
            r1 = 1
        L13:
            r3.A0J = r1
            X.4RP r0 = r3.A03
            if (r0 == 0) goto L47
            X.4RQ r0 = r0.A0I
            long r1 = r0.A08()
            int r0 = (int) r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L24:
            r3.A0E = r0
            X.4RP r0 = r3.A03
            if (r0 == 0) goto L45
            X.4RQ r0 = r0.A0I
            float r0 = r0.A0Q
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L32:
            r3.A0D = r0
            X.4RP r0 = r3.A03
            if (r0 == 0) goto L3b
            r0.A08()
        L3b:
            r0 = 0
            r3.A03 = r0
            r3.A0C = r0
            java.lang.Integer r0 = X.C05F.A00
            r3.A04 = r0
        L44:
            return
        L45:
            r0 = 0
            goto L32
        L47:
            r0 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WYB.A02():void");
    }

    /* JADX WARN: Type inference failed for: r17v2, types: [X.4AO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.Object, X.29c] */
    /* JADX WARN: Type inference failed for: r23v0, types: [X.4RB, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.lang.Object, X.4R6] */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, X.4R7] */
    /* JADX WARN: Type inference failed for: r27v0, types: [X.4RO, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r28v0, types: [java.lang.Object, X.4RF] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, X.4Rk] */
    public final void A03(android.net.Uri uri, C6I c6i, UP4 up4, String str, String str2, String str3, String str4, boolean z) {
        Float f;
        int i;
        C4RH wyx;
        boolean z2;
        android.net.Uri uri2;
        C4AN c4an;
        boolean z3;
        boolean z4;
        C18920wW A00;
        float f2;
        C4RP c4rp;
        this.A0B = up4;
        this.A05 = str;
        this.A0G = str2;
        this.A0H = str3;
        this.A0F = str4;
        this.A0A = c6i;
        this.A0I = z;
        this.A09 = uri;
        if (up4 != null) {
            f = up4.A01;
        } else {
            f = null;
        }
        Double d = null;
        C121745fS c121745fS = new C121745fS(false);
        int ordinal = c6i.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 3;
                } else {
                    throw new RuntimeException();
                }
            } else {
                i = 2;
            }
        } else {
            i = 1;
        }
        c121745fS.A01 = i;
        if (f != null) {
            d = Double.valueOf(f.floatValue());
        }
        c121745fS.A00 = d;
        c121745fS.A05 = true;
        c121745fS.A06 = true;
        c121745fS.A03 = true;
        c121745fS.A04 = true;
        if (Build.VERSION.SDK_INT >= 29) {
            wyx = AbstractC68317VMd.A00(c121745fS);
        } else {
            wyx = new WYX(c121745fS, new C70469WYa((XC8[]) Arrays.copyOf(new XC8[]{null, null}, 2)));
        }
        C4R9 c4r9 = new C4R9();
        c4r9.A01 = false;
        c4r9.A00 = true;
        HandlerThread handlerThread = A0P;
        if (!handlerThread.isAlive()) {
            handlerThread.start();
        }
        Context context = this.A0K;
        Looper looper = handlerThread.getLooper();
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        ?? obj = new Object();
        ?? obj2 = new Object();
        ?? obj3 = new Object();
        Handler A0J = AbstractC167007dF.A0J();
        ?? obj4 = new Object();
        Object systemService = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        C14360o3.A0C(systemService, MSV.A00(7));
        C4RG c4rg = new C4RG((AudioManager) systemService);
        C4RK c4rk = C4RK.A01;
        ?? obj5 = new Object();
        C69497VpS c69497VpS = W2C.A04;
        synchronized (c69497VpS) {
            z2 = W2C.A03;
        }
        if (!z2) {
            W2K w2k = new W2K(HeroPlayerSetting.A3e, new Object(), new HashMap());
            synchronized (c69497VpS) {
                if (!W2C.A03) {
                    W2C.A02 = new W2C(w2k, new WeakReference(context));
                    W2C.A03 = true;
                }
            }
        }
        final W2C A002 = c69497VpS.A00();
        C4RD c4rd = new C4RD(new C4R2() { // from class: X.WYL
            @Override // X.C4R2
            public final /* bridge */ /* synthetic */ C459529d AXY() {
                W2C w2c = W2C.this;
                W2K w2k2 = w2c.A00;
                Map map = w2k2.A02;
                return C459529d.A01((Context) w2c.A01.get(), w2k2.A00, w2k2.A01, map, null, null);
            }
        });
        HeroPlayerSetting heroPlayerSetting = c69497VpS.A00().A00.A00;
        C14360o3.A0A(heroPlayerSetting);
        C4RP c4rp2 = new C4RP(context, A0J, looper, c4rg, c4rk, c4r9, obj4, obj2, obj3, this, obj5, obj, c4rd, heroPlayerSetting, wyx);
        this.A03 = c4rp2;
        if (up4 != null) {
            uri2 = up4.A00;
        } else {
            uri2 = null;
        }
        C16920sk A0E = AbstractC06930Yk.A0E();
        TextUtils.isEmpty(str4);
        if (TextUtils.isEmpty(str4)) {
            z3 = false;
            z4 = false;
            c4an = new C4AN(uri2, uri, C4AM.GENERAL, C4AK.PROGRESSIVE, str, null, null, str2, str3, "UNKNOWN", null, "AUDIO_VIDEO", null, null, null, A0E, false, false, false, false);
        } else {
            z3 = false;
            z4 = false;
            c4an = new C4AN(uri2, uri, C4AM.GENERAL, C4AK.DASH_VOD, str, str4, null, str2, str3, "UNKNOWN", null, "AUDIO_VIDEO", null, null, null, A0E, false, false, false, false);
        }
        this.A0C = c4an;
        UserSession A08 = C023409i.A0A.A08(C70014VzZ.A00);
        C42351xP c42351xP = C41711wL.A01(A08).A00.A0H.A12;
        if (!EndToEnd.isRunningEndToEndTest() && !c42351xP.A0K) {
            A00 = AbstractC12220kQ.A02(A08);
        } else {
            A00 = AbstractC12220kQ.A00(null, C12180kM.A05, A08);
        }
        C14360o3.A06(c42351xP);
        ?? obj6 = new Object();
        C3N4 A003 = C3N3.A00(A08);
        String str5 = c42351xP.A04;
        C14360o3.A07(str5);
        String A004 = AbstractC111324zv.A00(1859);
        if (str5.length() == 0) {
            c42351xP.A04 = A004;
        } else if (!AbstractC001900j.A0a(str5, A004, false)) {
            c42351xP.A04 = AnonymousClass001.A0g(str5, ", ", A004);
        }
        C95544Ro c95544Ro = new C95544Ro(A00, c4rp2, new C95514Rl(c42351xP, obj6), c42351xP, obj6, null, null, A003);
        WYD wyd = new WYD(c4an, new WeakReference(this));
        c4rp2.A0I.A0G.A00.add(c95544Ro);
        c4rp2.A0C(c95544Ro);
        c95544Ro.A0H(W13.A00, wyd, AbstractC68330VMq.A00(c4an.A0G));
        c4rp2.A0D(new C4SS(new AudioFocusLossSettings(), EnumC46372Az.IN_PLAY, new Object(), c4an, null, C05F.A00, "", "", new ArrayList(), new ArrayList(), 0, 0, -1, -1, -1, -1, -1, false, false, false, false, false, false, false, false, false, false, false, false, false, z3, z4));
        if (this.A0J && (c4rp = this.A03) != null) {
            c4rp.A07();
        }
        Integer num = this.A0E;
        if (num != null) {
            int intValue = num.intValue();
            C4RP c4rp3 = this.A03;
            if (c4rp3 != null) {
                c4rp3.A0I.A0C(intValue);
            }
        }
        Float f3 = this.A0D;
        if (f3 != null) {
            f2 = f3.floatValue();
        } else {
            c4rp2 = this.A03;
            if (z) {
                if (c4rp2 == null) {
                    return;
                } else {
                    f2 = 0.0f;
                }
            } else {
                if (c4rp2 == null) {
                    return;
                }
                c4rp2.A0F("player_initiated", 1.0f);
                return;
            }
        }
        c4rp2.A0F("player_initiated", f2);
    }

    @Override // X.C4QY
    public final C4AK CFc() {
        return this.A0M;
    }

    @Override // X.C4QY
    public final Integer CFp() {
        return this.A0N;
    }

    @Override // X.C4QY
    public final Integer CFx() {
        return this.A0O;
    }

    @Override // X.C4R4
    public final void DZ1(C5n5 c5n5, C117275Sm c117275Sm, C4RV c4rv, C4RU c4ru, String str) {
        A00(C05F.A15);
        this.A0L.A00();
    }

    @Override // X.C4R4
    public final void DaU(long j, String str) {
        A00(C05F.A01);
    }

    @Override // X.C4R4
    public final void Dnx(boolean z) {
        A00(C05F.A0u);
    }

    @Override // X.C4R4
    public final void Dot(int i) {
        Integer num;
        C4RP c4rp = this.A03;
        if (c4rp != null && c4rp.A0I.A0J()) {
            num = C05F.A0C;
        } else {
            num = C05F.A0Y;
        }
        A00(num);
    }

    @Override // X.C4R4
    public final void Dym() {
        this.A0L.A00();
    }

    @Override // X.C4R4
    public final void Dyv(C5n5 c5n5, long j) {
        C4RP c4rp = this.A03;
        if (c4rp != null && !c4rp.A0I.A0X) {
            A00(C05F.A0j);
            this.A0L.A00();
        }
    }

    @Override // X.C4R4
    public final void DzF(C5n5 c5n5, String str, long j, long j2, boolean z) {
        A00(C05F.A0Y);
        this.A0L.A00();
    }

    @Override // X.C4R4
    public final void E07(C4RU c4ru, String str, String str2, String str3, String str4, String str5, long j, boolean z) {
        A00(C05F.A0C);
        if (this.A07 != null) {
            CU4 cu4 = this.A0L;
            if (!cu4.A00) {
                cu4.A00 = true;
                cu4.A01.post(cu4.A02);
            }
        }
    }

    @Override // X.C4R4
    public final void onSeeking(long j) {
        A00(C05F.A0N);
    }

    public WYB(Context context) {
        C4AK c4ak;
        Integer num;
        this.A0K = context;
        C4AN c4an = this.A0C;
        if (c4an != null) {
            c4ak = c4an.A07;
        } else {
            c4ak = null;
        }
        this.A0M = c4ak;
        View view = this.A00;
        if (view != null) {
            num = Integer.valueOf(view.getHeight());
        } else {
            num = null;
        }
        this.A0N = num;
        View view2 = this.A00;
        this.A0O = view2 != null ? Integer.valueOf(view2.getWidth()) : null;
    }

    @Override // X.C4R4
    public final void onCues(List list) {
        InterfaceC16660sJ interfaceC16660sJ;
        if ((!list.isEmpty()) && (interfaceC16660sJ = this.A06) != null) {
            interfaceC16660sJ.invoke(AbstractC001800i.A0P("\n", "", "", list, X5L.A00));
        }
    }
}
