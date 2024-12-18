package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.HashMap;

/* renamed from: X.3FY, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3FY extends C1I2 implements View.OnClickListener {
    public long A00;
    public FrameLayout A01;
    public C3FZ A02;
    public boolean A03;
    public final InterfaceC11380iw A04;
    public final UserSession A05;
    public final C3BC A06;
    public final C1M1 A07;
    public final C61842rl A08;
    public final C61842rl A09;
    public final C61552rI A0A;
    public final C3FX A0B;

    public C3FY(Context context, FrameLayout frameLayout, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C61552rI c61552rI, C1M1 c1m1, C61842rl c61842rl, C61842rl c61842rl2, C60882qC c60882qC, C3FX c3fx) {
        C14360o3.A0B(c60882qC, 3);
        C14360o3.A0B(c61842rl, 4);
        C14360o3.A0B(c61842rl2, 5);
        C14360o3.A0B(userSession, 7);
        C14360o3.A0B(c1m1, 10);
        this.A04 = interfaceC11380iw;
        this.A08 = c61842rl;
        this.A09 = c61842rl2;
        this.A05 = userSession;
        this.A0B = c3fx;
        this.A0A = c61552rI;
        this.A07 = c1m1;
        this.A06 = new C3BC(context, this, c60882qC, 2131968468);
        this.A01 = frameLayout;
        this.A02 = C3FZ.A02;
        this.A00 = -1L;
    }

    public static final void A00(C3FY c3fy, Integer num) {
        if (!c3fy.A04(c3fy.A02, num)) {
            c3fy.A02(num);
            c3fy.A08.A09(num);
        }
    }

    public static final void A01(C3FY c3fy, Integer num) {
        if (!c3fy.A04(c3fy.A02, num)) {
            c3fy.A02(num);
            c3fy.A08();
            HashMap hashMap = new HashMap();
            hashMap.put("new_posts_reported", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
            C3FX c3fx = c3fy.A0B;
            c3fx.A00();
            c3fx.A02(C1EN.A0I, hashMap);
        }
    }

    private final void A02(Integer num) {
        String str;
        C61552rI c61552rI = this.A0A;
        StringBuilder sb = new StringBuilder();
        sb.append("NEW_POSTS_PILL_CLICKED_");
        sb.append(this.A02);
        sb.append('_');
        switch (num.intValue()) {
            case 0:
                str = "INDICATOR_TAPPED";
                break;
            case 1:
                str = "SCROLLED_TO_TOP";
                break;
            case 2:
                str = "FEED_DISAPPEARED";
                break;
            case 3:
                str = "FEED_REAPPEARED";
                break;
            case 4:
                str = "APP_BACKGROUNDED";
                break;
            case 5:
                str = "APP_FOREGROUNDED";
                break;
            default:
                str = "PULL_TO_REFRESH";
                break;
        }
        sb.append(str);
        c61552rI.A00(sb.toString());
        AbstractC127075ol.A00(this.A05);
        this.A07.getSessionId();
        this.A04.getModuleName();
    }

    private final boolean A03() {
        HA1 ha1;
        if (!(!this.A08.A0h.A04.isEmpty()) && (ha1 = this.A09.A0d.A02.A02.A01) != null && ha1.A00) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if (r10 == X.C05F.A0N) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A04(X.C3FZ r9, java.lang.Integer r10) {
        /*
            r8 = this;
            com.instagram.common.session.UserSession r4 = r8.A05
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36594968198252535(0x8202ee000607f7, double:3.2061434724596575E-306)
            long r0 = X.C18U.A01(r2, r4, r0)
            long r6 = r3.toMillis(r0)
            r0 = 2342156502435366946(0x208102ee00080822, double:4.060068684170597E-152)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            r5 = 0
            if (r0 != 0) goto L27
            java.lang.Integer r0 = X.C05F.A0Y
            if (r10 == r0) goto L30
            java.lang.Integer r0 = X.C05F.A0j
            if (r10 == r0) goto L30
        L27:
            java.lang.Integer r0 = X.C05F.A0C
            if (r10 == r0) goto L30
            java.lang.Integer r0 = X.C05F.A0N
            r4 = 0
            if (r10 != r0) goto L31
        L30:
            r4 = 1
        L31:
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L43
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r8.A00
            long r2 = r2 - r0
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L47
        L42:
            return r5
        L43:
            X.3FZ r0 = X.C3FZ.A07
            if (r9 != r0) goto L42
        L47:
            if (r4 == 0) goto L42
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FY.A04(X.3FZ, java.lang.Integer):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A05() {
        /*
            r9 = this;
            com.instagram.common.session.UserSession r3 = r9.A05
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36326013050959415(0x810e5100023637, double:3.036055154316038E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            r7 = 0
            if (r0 == 0) goto L47
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r3)
            X.1Am r0 = X.EnumC23071Am.A0U
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L47
            r0 = 36607488027727461(0x820e5100031665, double:3.2140610630329075E-306)
        L24:
            long r0 = X.C18U.A01(r2, r3, r0)
        L28:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.C14360o3.A0A(r0)
            long r0 = r0.longValue()
            int r5 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            if (r5 > 0) goto L42
            r0 = 36594968198514681(0x8202ee000a07f9, double:3.20614347262544E-306)
            long r0 = X.C18U.A01(r2, r3, r0)
        L42:
            long r0 = r4.toMillis(r0)
            return r0
        L47:
            r0 = 36328602916241056(0x8110ac00023ea0, double:3.037692995548698E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L8c
            X.AC6 r0 = X.I21.A00(r3)
            X.1EN r6 = X.C1EN.A0N
            r5 = 0
            java.lang.Integer r0 = r0.A00(r6, r5)
            if (r0 == 0) goto L8c
            X.AC6 r4 = X.I21.A00(r3)
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r3)
            X.1Am r0 = X.EnumC23071Am.A0U
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L7d
            r0 = 36328602916306593(0x8110ac00033ea1, double:3.037692995590144E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L7d
            r5 = 1
        L7d:
            java.lang.Integer r0 = r4.A00(r6, r5)
            if (r0 == 0) goto L89
            int r0 = r0.intValue()
            long r0 = (long) r0
            goto L28
        L89:
            r0 = 0
            goto L28
        L8c:
            r0 = 36329393190158652(0x8111640001413c, double:3.0381927679563633E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L9d
            r0 = 36610868166990047(0x821164000318df, double:3.216198676713295E-306)
            goto L24
        L9d:
            r0 = 36599069892021669(0x8206a900060da5, double:3.208737400115453E-306)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FY.A05():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
    
        if (r8 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0090, code lost:
    
        if (java.lang.Math.abs(java.lang.System.currentTimeMillis() - r7.longValue()) > A05()) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0104, code lost:
    
        return X.C3FZ.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
    
        if (r10 > r8) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009f, code lost:
    
        if (X.C18U.A06(r4, r5, 36329285816369395L) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a3, code lost:
    
        return X.C3FZ.A04;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0101, code lost:
    
        return X.C3FZ.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
    
        if (r7 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        if (r7 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fc, code lost:
    
        if (r7 != null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if (X.C23061Al.A00(r5).A00(X.EnumC23071Am.A0U) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C3FZ A06() {
        /*
            r12 = this;
            X.2rl r0 = r12.A09
            X.2rt r0 = r0.A0e
            java.lang.Long r7 = r0.A05()
            com.instagram.common.session.UserSession r5 = r12.A05
            X.0Tz r4 = X.C06090Tz.A05
            r0 = 36328602916503204(0x8110ac00063ea4, double:3.0376929957144814E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto Lad
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r10 = r0.now()
            long r0 = X.C218914p.A00
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            X.AC6 r3 = X.I21.A00(r5)
            r0 = 36328602916568741(0x8110ac00073ea5, double:3.037692995755927E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto L40
            long r0 = X.C23051Ak.A02
            X.1Ak r1 = X.C23061Al.A00(r5)
            X.1Am r0 = X.EnumC23071Am.A0U
            boolean r1 = r1.A00(r0)
            r0 = 1
            if (r1 != 0) goto L41
        L40:
            r0 = 0
        L41:
            java.lang.String r2 = "warm_start_bg_timer_in_s"
            java.util.concurrent.ConcurrentHashMap r1 = r3.A01
            if (r0 == 0) goto Laa
            java.lang.String r0 = "on_peak_"
        L49:
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r2)
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            r2 = 0
            if (r0 == 0) goto La7
            int r0 = r0.intValue()
            long r0 = (long) r0
        L5c:
            long r8 = r6.toMillis(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lad
        L64:
            X.3GE r0 = X.C3GD.A00(r5)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36880544869515598(0x8306a90012014e, double:3.386743309291374E-306)
            java.lang.String r1 = X.C18U.A04(r4, r2, r0)
            java.lang.String r0 = "warm_start"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto La4
            if (r7 == 0) goto L92
        L7d:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.longValue()
            long r2 = r2 - r0
            long r6 = java.lang.Math.abs(r2)
            long r1 = r12.A05()
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L102
        L92:
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 <= 0) goto L102
        L96:
            r0 = 36329285816369395(0x81114b000740f3, double:3.0381248643396776E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto Lff
            X.3FZ r0 = X.C3FZ.A04
            return r0
        La4:
            if (r7 == 0) goto L102
            goto L7d
        La7:
            r0 = 0
            goto L5c
        Laa:
            java.lang.String r0 = ""
            goto L49
        Lad:
            r0 = 36329393190093115(0x8111640000413b, double:3.0381927679149175E-306)
            boolean r0 = X.C18U.A06(r4, r5, r0)
            if (r0 == 0) goto Ld1
            com.facebook.common.time.AwakeTimeSinceBootClock r0 = com.facebook.common.time.AwakeTimeSinceBootClock.INSTANCE
            long r10 = r0.now()
            long r0 = X.C218914p.A00
            long r10 = r10 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 36610868166924510(0x821164000218de, double:3.2161986766718494E-306)
            long r0 = X.C18U.A01(r4, r5, r0)
            long r8 = r2.toMillis(r0)
            goto L64
        Ld1:
            X.3GE r0 = X.C3GD.A00(r5)
            com.instagram.common.session.UserSession r2 = r0.A02
            r0 = 36880544869515598(0x8306a90012014e, double:3.386743309291374E-306)
            java.lang.String r1 = X.C18U.A04(r4, r2, r0)
            java.lang.String r0 = "warm_start"
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto Lfc
            if (r7 == 0) goto L96
        Lea:
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r7.longValue()
            long r2 = r2 - r0
            long r10 = java.lang.Math.abs(r2)
            long r8 = r12.A05()
            goto L92
        Lfc:
            if (r7 == 0) goto L102
            goto Lea
        Lff:
            X.3FZ r0 = X.C3FZ.A05
            return r0
        L102:
            X.3FZ r0 = X.C3FZ.A02
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FY.A06():X.3FZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (A03() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A07() {
        /*
            r8 = this;
            X.2rl r0 = r8.A08
            X.2rq r0 = r0.A0h
            java.util.List r2 = r0.A04
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L15
            boolean r0 = r8.A03()
            r1 = 0
            if (r0 == 0) goto L16
        L15:
            r1 = 1
        L16:
            boolean r0 = r8.A0B()
            if (r1 == 0) goto L89
            if (r0 != 0) goto L89
            android.widget.FrameLayout r7 = r8.A01
            if (r7 == 0) goto L89
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tz r6 = X.C06090Tz.A05
            r4 = 2342156502435366946(0x208102ee00080822, double:4.060068684170597E-152)
            boolean r0 = X.C18U.A06(r6, r3, r4)
            if (r0 != 0) goto L46
            X.3BC r0 = r8.A06
            X.3BD r1 = r0.A00
            android.view.View r0 = r1.A02
            if (r0 == 0) goto La3
            android.view.ViewParent r0 = r0.getParent()
        L3d:
            boolean r0 = X.AbstractC50102Ry.A00(r0, r7)
            if (r0 != 0) goto L46
            r1.A07(r7)
        L46:
            r1 = 1
            boolean r0 = X.C18U.A06(r6, r3, r4)
            if (r0 == 0) goto L9a
            r8.A03 = r1
        L4f:
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            X.3FZ r0 = X.C3FZ.A03
        L59:
            r8.A02 = r0
            long r0 = java.lang.System.currentTimeMillis()
        L5f:
            r8.A00 = r0
            r8.A09()
            X.2rI r2 = r8.A0A
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "NEW_POSTS_PILL_DISPLAYED_"
            r1.append(r0)
            X.3FZ r0 = r8.A02
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r2.A00(r0)
            X.AbstractC127075ol.A00(r3)
            X.1M1 r0 = r8.A07
            r0.getSessionId()
            X.0iw r0 = r8.A04
            r0.getModuleName()
        L89:
            return
        L8a:
            boolean r0 = r8.A03()
            if (r0 == 0) goto L93
            X.3FZ r0 = X.C3FZ.A07
            goto L59
        L93:
            X.3FZ r0 = X.C3FZ.A02
            r8.A02 = r0
            r0 = -1
            goto L5f
        L9a:
            X.3BC r0 = r8.A06
            r1 = 0
            X.3BD r0 = r0.A00
            r0.A06(r1)
            goto L4f
        La3:
            r0 = 0
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3FY.A07():void");
    }

    public final boolean A0A() {
        int ordinal = this.A02.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                return false;
            }
        } else if ((!this.A08.A0h.A04.isEmpty()) && A0B()) {
            A00(this, C05F.A0u);
            return true;
        }
        if (!A0B()) {
            return false;
        }
        A01(this, C05F.A0u);
        return true;
    }

    public final boolean A0B() {
        if (C18U.A06(C06090Tz.A05, this.A05, 2342156502435366946L)) {
            return this.A03;
        }
        View view = this.A06.A00.A02;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    public final void A08() {
        if (A0B()) {
            this.A0A.A00("NEW_POSTS_PILL_HIDDEN");
            if (C18U.A06(C06090Tz.A05, this.A05, 2342156502435366946L)) {
                this.A03 = false;
            } else {
                this.A06.A00.A05(null);
            }
        }
    }

    public final void A09() {
        if (A0B()) {
            if (!C18U.A06(C06090Tz.A05, this.A05, 2342156502435366946L)) {
                this.A06.A00();
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        IllegalStateException illegalStateException;
        int i;
        int A05 = C0f9.A05(1377451380);
        int ordinal = this.A02.ordinal();
        if (ordinal != 2) {
            if (ordinal != 1) {
                if (ordinal != 0) {
                    illegalStateException = new IllegalStateException("FeedRefreshType should never be DEFAULT_BEHAVIOR in onClick");
                    i = -542874090;
                } else {
                    illegalStateException = new IllegalStateException("FeedRefreshType should never be DEFAULT_BEHAVIOR in onClick");
                    i = -587566934;
                }
                C0f9.A0C(i, A05);
                throw illegalStateException;
            }
            A01(this, C05F.A00);
        } else {
            A00(this, C05F.A00);
        }
        C0f9.A0C(-1771938869, A05);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        int A03 = C0f9.A03(-1959336717);
        A09();
        C0f9.A0A(1737638122, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(348971737, C0f9.A03(-937571498));
    }
}
