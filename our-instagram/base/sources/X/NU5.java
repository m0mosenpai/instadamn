package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class NU5 extends AbstractC54988OTw {
    public float A00;
    public InterfaceC25156BBa A01;
    public InterfaceC25157BBb A02;
    public CameraAREffect A03;
    public CameraAREffect A04;
    public C55035OZg A05;
    public ODI A06;
    public ODJ A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final Context A0D;
    public final C189708ap A0E;
    public final C54823OLg A0F;
    public final C23324AVj A0G;
    public final UserSession A0H;
    public final C1814582x A0I;
    public final OHG A0J;
    public final O4W A0K;
    public final C54803OJx A0L;
    public final C54550O8c A0M;
    public final OHI A0N;
    public final OEZ A0O;
    public final C54767OIe A0P;
    public final OWf A0Q;
    public final OLL A0R;
    public final java.util.Set A0S;
    public final java.util.Set A0T;
    public final InterfaceC16820sZ A0U;
    public final InterfaceC16820sZ A0V;
    public final C05A A0W;
    public final C05A A0X;
    public final C05A A0Y;
    public final C05A A0Z;

    public static void A09(EnumC53240Ngd enumC53240Ngd, Integer num, String str, Map map) {
        map.put(enumC53240Ngd, new OJ0(enumC53240Ngd, num, str, null));
        OJ0 oj0 = (OJ0) map.get(enumC53240Ngd);
        if (oj0 != null) {
            C54979OTl c54979OTl = oj0.A02;
            c54979OTl.A01 = c54979OTl.A02.now();
        }
    }

    public static final void A0E(NU5 nu5, Integer num, Integer num2, String str) {
        int i;
        C51887MwV A00;
        A0C(nu5, num2);
        C54767OIe c54767OIe = nu5.A0P;
        AbstractC25230BEn.A15(1, str, num2);
        Map map = c54767OIe.A02;
        EnumC53240Ngd enumC53240Ngd = EnumC53240Ngd.A03;
        Long l = null;
        A09(enumC53240Ngd, num2, str, map);
        N8K A002 = OZ9.A00(str);
        OWf oWf = c54767OIe.A01;
        Integer num3 = C05F.A00;
        String str2 = A002.A01;
        String str3 = A002.A02;
        OJ0 oj0 = (OJ0) map.get(enumC53240Ngd);
        if (oj0 != null) {
            l = Long.valueOf(oj0.A00());
        }
        oWf.A02(new PB7(num3, num2, l, str2, str3));
        if (str.equals("simple_gradient_background_0")) {
            nu5.A0I.A00();
            A00 = C51887MwV.A00(null, null, null, null, null, null, A00(nu5), null, null, null, null, null, str, null, null, null, null, null, null, 0.0f, -4097, false, false, false, false, false, false, false, false, false, false, false, false, false);
            A0A(nu5, A00);
            return;
        }
        OEZ oez = nu5.A0O;
        if (num != null) {
            i = num.intValue();
        } else {
            i = OZ9.A00(str).A00;
        }
        Drawable A003 = AbstractC56412ia.A00(oez.A02.getResources(), i);
        C14360o3.A0C(A003, AbstractC111324zv.A00(1139));
        ((C3PR) A003).A01(new C56169Owc(str, oez, 1));
    }

    public final void A0L(Integer num, String str, String str2, String str3, String str4) {
        String str5;
        AbstractC167007dF.A1F(str, 0, num);
        if (AbstractC25231BEo.A1b(this.A0U)) {
            if (!C18U.A06(C06090Tz.A05, this.A0J.A00, 36313914127944000L)) {
                return;
            }
        }
        CameraAREffect cameraAREffect = A00(this).A05;
        if (cameraAREffect != null) {
            str5 = cameraAREffect.A0K;
        } else {
            str5 = null;
        }
        if (C14360o3.A0K(str5, str)) {
            return;
        }
        if (str2 == null) {
            C54803OJx c54803OJx = this.A0L;
            C19L c19l = c54803OJx.A08;
            if (c19l == null) {
                return;
            }
            AbstractC166987dD.A1Z(new C71766X2c(num, c54803OJx, null, null, str, str4, null, 3), c19l);
            return;
        }
        this.A07 = new ODJ(num, str, str2, str3, str4);
        A0A(this, C51887MwV.A00(null, null, null, null, null, null, A00(this), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -2097153, false, false, false, false, false, true, false, false, false, false, false, false, false));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NU5(Context context, C23324AVj c23324AVj, UserSession userSession, NU1 nu1, C54446O4a c54446O4a, OWf oWf, OLL oll, InterfaceC16820sZ interfaceC16820sZ) {
        super(c54446O4a);
        Integer num;
        C55035OZg c55035OZg;
        C54823OLg c54823OLg = new C54823OLg(userSession);
        OHG ohg = new OHG(userSession);
        C54803OJx c54803OJx = new C54803OJx(AbstractC166987dD.A0O(context), userSession);
        OEZ oez = new OEZ(context, OZ9.A00, c54823OLg, C12L.A00, userSession);
        C1814582x c1814582x = new C1814582x();
        C189708ap c189708ap = new C189708ap(userSession);
        C54550O8c c54550O8c = new C54550O8c(userSession, context);
        C54767OIe c54767OIe = new C54767OIe(oWf);
        OHI ohi = new OHI(nu1);
        this.A0D = context;
        this.A0H = userSession;
        this.A0G = c23324AVj;
        this.A0Q = oWf;
        this.A0R = oll;
        this.A0F = c54823OLg;
        this.A0J = ohg;
        this.A0L = c54803OJx;
        this.A0O = oez;
        this.A0I = c1814582x;
        this.A0E = c189708ap;
        this.A0M = c54550O8c;
        this.A0P = c54767OIe;
        this.A0U = interfaceC16820sZ;
        this.A0N = ohi;
        Integer num2 = C05F.A00;
        this.A08 = num2;
        this.A0S = AbstractC31171DnF.A0l();
        O4W o4w = new O4W(this);
        this.A0K = o4w;
        if (c54823OLg.A02() && (c55035OZg = this.A05) != null) {
            num = c55035OZg.A01;
        } else {
            num = null;
        }
        C16930sl c16930sl = C16930sl.A00;
        this.A0W = AbstractC25225BEi.A1H(new C51887MwV(null, null, null, null, null, EnumC53279NhH.A04, num2, num2, num2, num, null, "simple_gradient_background_0", null, c16930sl, c16930sl, c16930sl, c16930sl, c16930sl, 0.0f, false, false, false, false, false, false, false, false, false, false, false, false, AbstractC25231BEo.A1b(interfaceC16820sZ)));
        this.A0X = AbstractC25225BEi.A1H(EnumC53154Nf9.A05);
        this.A0Y = AbstractC25235BEs.A1A(false);
        this.A0Z = AbstractC25225BEi.A1H(new C51729Mt8(3, 5, false));
        this.A0T = AbstractC31171DnF.A0l();
        this.A09 = num2;
        this.A0V = C57548PgM.A01(this, 19);
        c54803OJx.A00 = new OHH(this);
        oez.A00 = new O4U(this);
        C55614Omx c55614Omx = new C55614Omx(this);
        AKM akm = c23324AVj.A08;
        akm.A03 = c55614Omx;
        akm.A04 = new C55615Omy(this);
        if (c54823OLg.A00() instanceof NUJ) {
            akm.A02 = c1814582x;
        }
        akm.A05 = new O4V(this);
        C55035OZg c55035OZg2 = new C55035OZg();
        this.A05 = c55035OZg2;
        c55035OZg2.A00 = o4w;
    }

    public static final C51887MwV A00(NU5 nu5) {
        return (C51887MwV) nu5.A0W.getValue();
    }

    public static final Boolean A01(CameraAREffect cameraAREffect, NU5 nu5) {
        boolean z;
        UserSession userSession = nu5.A0J.A00;
        C06090Tz c06090Tz = C06090Tz.A05;
        if (C18U.A06(c06090Tz, userSession, 2342156180312360762L) && C18U.A06(c06090Tz, userSession, 36313368667228071L)) {
            if (cameraAREffect != null && (AbstractC54160Nww.A00(cameraAREffect) || cameraAREffect.A0Z.get("peerOutput") != null)) {
                z = false;
            } else {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        return null;
    }

    private final void A03() {
        C51887MwV A00;
        A00 = C51887MwV.A00(null, null, null, null, null, null, A00(this), null, null, null, null, null, null, null, null, null, null, AbstractC001800i.A0S(AbstractC16960so.A1Q(OZ9.A00("simple_gradient_background_1"), OZ9.A00("simple_gradient_background_2"), OZ9.A00("simple_gradient_background_3"), OZ9.A00("simple_gradient_background_4"), OZ9.A00("simple_gradient_background_5"), OZ9.A00("simple_gradient_background_6"), OZ9.A00("simple_gradient_background_7"), OZ9.A00("simple_gradient_background_8"), OZ9.A00("simple_gradient_background_9"), OZ9.A00("simple_gradient_background_10")), AbstractC166987dD.A1J(OZ9.A00("simple_gradient_background_0"))), null, 0.0f, -65, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A0A(this, A00);
    }

    public static final void A04(CameraAREffect cameraAREffect, NU5 nu5, Integer num, String str) {
        if (!AbstractC25231BEo.A1b(nu5.A0U) && !nu5.A0J(cameraAREffect, str)) {
            C54803OJx c54803OJx = nu5.A0L;
            C14360o3.A0B(cameraAREffect, 0);
            String A1A = AbstractC166987dD.A1A(cameraAREffect.A0K, c54803OJx.A0E);
            long A05 = AbstractC43592JPx.A05(cameraAREffect.A0K);
            Integer num2 = C05F.A01;
            if (num != num2 && num != C05F.A0C) {
                OLL oll = nu5.A0R;
                String str2 = cameraAREffect.A0S;
                String url = cameraAREffect.A07.getUrl();
                UserSession userSession = nu5.A0H;
                String str3 = userSession.userId;
                String B8y = AbstractC166997dE.A0Y(userSession).B8y();
                C14360o3.A0B(str3, 3);
                C55207OeK.A02(oll.A00.A0Z, new MIY(str2, url, str3, B8y, A1A, 1, A05));
            }
            nu5.A02();
            long A052 = AbstractC43592JPx.A05(cameraAREffect.A0K);
            if (A1A == null && (num == num2 || num == C05F.A0C || num == C05F.A0N)) {
                nu5.A0I(EnumC53279NhH.A06, false);
            }
            nu5.A07(cameraAREffect, false);
            if (cameraAREffect.A0N()) {
                OW9 ow9 = nu5.A0R.A00;
                C55207OeK.A02(ow9.A0Z, new JXD(A052, 16));
                ow9.A0J.A00.A00();
            }
            if (cameraAREffect.A0Z.get("participant") != null) {
                C55207OeK.A02(nu5.A0R.A00.A0Z, new JXD(A052, 15));
            }
            A05(cameraAREffect, nu5, num, str, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0101, code lost:
    
        if (r4.A0M() != true) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0115, code lost:
    
        if (r10.A01() == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        if (r3 == X.EnumC53240Ngd.A09) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01fb, code lost:
    
        if (r43 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A05(com.instagram.camera.effect.models.CameraAREffect r43, X.NU5 r44, java.lang.Integer r45, java.lang.String r46, java.lang.String r47) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A05(com.instagram.camera.effect.models.CameraAREffect, X.NU5, java.lang.Integer, java.lang.String, java.lang.String):void");
    }

    private final void A06(CameraAREffect cameraAREffect, String str) {
        String str2;
        if (cameraAREffect != null) {
            str2 = cameraAREffect.A0K;
        } else {
            str2 = null;
        }
        if (C14360o3.A0K(str2, String.valueOf(C18U.A01(C06090Tz.A05, this.A0J.A00, 36611370677967120L)))) {
            this.A0G.A08.A06.A00(new JSONObject(AbstractC167007dF.A0n("imageUrl", str)));
        }
    }

    private final void A07(CameraAREffect cameraAREffect, boolean z) {
        A0D(this, C05F.A00);
        CameraAREffect cameraAREffect2 = A00(this).A05;
        if (cameraAREffect2 != null && cameraAREffect2.A0N() && (cameraAREffect == null || !cameraAREffect.A0N())) {
            C55207OeK.A02(this.A0R.A00.A0Z, MLN.A00);
        }
        CameraAREffect cameraAREffect3 = A00(this).A05;
        if (cameraAREffect3 != null && cameraAREffect3.A0Z.get("participant") != null) {
            C55207OeK.A02(this.A0R.A00.A0Z, MLM.A00);
        }
        if (z) {
            A02();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r3 == X.C88Z.A08) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A08(X.C88X r5, X.NU5 r6) {
        /*
            X.88Z r1 = r5.A04
            if (r1 != 0) goto L6
            X.88Z r1 = X.C88Z.A0G
        L6:
            X.88Z r0 = X.C88Z.A07
            if (r1 == r0) goto L31
            X.MwV r0 = A00(r6)
            boolean r4 = r0.A0L
            X.88Z r3 = r5.A04
            X.88Z r0 = X.C88Z.A06
            if (r3 == r0) goto L1b
            X.88Z r0 = X.C88Z.A08
            r2 = 0
            if (r3 != r0) goto L1c
        L1b:
            r2 = 1
        L1c:
            r1 = 0
            if (r2 != 0) goto L2d
            if (r4 == 0) goto L32
            X.88Z r0 = X.C88Z.A0J
            if (r3 == r0) goto L2d
            X.88Z r0 = X.C88Z.A05
            if (r3 == r0) goto L2d
            X.88Z r0 = X.C88Z.A0H
            if (r3 != r0) goto L32
        L2d:
            r0 = 1
        L2e:
            A0H(r6, r0, r1)
        L31:
            return
        L32:
            r0 = 0
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A08(X.88X, X.NU5):void");
    }

    public static final void A0A(NU5 nu5, C51887MwV c51887MwV) {
        C05A c05a = nu5.A0W;
        C51887MwV A00 = C51887MwV.A00(null, null, null, null, null, null, c51887MwV, null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, Integer.MAX_VALUE, false, false, false, false, false, false, false, false, false, false, false, false, AbstractC25231BEo.A1b(nu5.A0U));
        C14360o3.A0B(c05a, 0);
        c05a.F8m(A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        if (r0.A0M() != true) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r5.A01() == false) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0B(X.NU5 r18, java.lang.Integer r19) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A0B(X.NU5, java.lang.Integer):void");
    }

    public static final void A0C(NU5 nu5, Integer num) {
        Long l;
        C54767OIe c54767OIe = nu5.A0P;
        String str = A00(nu5).A0C;
        AbstractC167017dG.A1N(str, num);
        Map map = c54767OIe.A02;
        EnumC53240Ngd enumC53240Ngd = EnumC53240Ngd.A03;
        OJ0 oj0 = (OJ0) map.get(enumC53240Ngd);
        if (oj0 != null) {
            C54979OTl c54979OTl = oj0.A02;
            c54979OTl.A00 = c54979OTl.A02.now();
            N8K A00 = OZ9.A00(str);
            OWf oWf = c54767OIe.A01;
            Integer num2 = C05F.A01;
            String str2 = A00.A01;
            String str3 = A00.A02;
            OJ0 oj02 = (OJ0) map.get(enumC53240Ngd);
            if (oj02 != null) {
                l = Long.valueOf(oj02.A00());
            } else {
                l = null;
            }
            oWf.A02(new PB7(num2, num, l, str2, str3));
        }
        map.remove(enumC53240Ngd);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r18 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0F(X.NU5 r16, java.lang.Integer r17, java.lang.String r18) {
        /*
            r3 = r16
            X.MwV r0 = A00(r3)
            java.lang.String r0 = r0.A0D
            r10 = r18
            boolean r0 = X.C14360o3.A0K(r0, r10)
            if (r0 != 0) goto L94
            X.MwV r0 = A00(r3)
            java.lang.String r2 = r0.A0D
            X.MwV r8 = A00(r3)
            r9 = 0
            r4 = 0
            r16 = -2049(0xfffffffffffff7ff, float:NaN)
            r11 = r9
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            X.MwV r0 = X.C51887MwV.A07(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            A0A(r3, r0)
            X.OLL r0 = r3.A0R
            X.OW9 r0 = r0.A00
            X.OeK r0 = r0.A0Z
            X.Myq r1 = r0.A02
            r13 = r17
            if (r1 == 0) goto L95
            X.0do r0 = r1.A0B
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof com.instagram.rtc.rsys.camera.IgLiteCameraProxy
            if (r0 == 0) goto L95
            X.Mz4 r1 = X.C52000Myq.A00(r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.rtc.rsys.camera.IgLiteCameraProxy"
            X.C14360o3.A0C(r1, r0)
            com.instagram.rtc.rsys.camera.IgLiteCameraProxy r1 = (com.instagram.rtc.rsys.camera.IgLiteCameraProxy) r1
            X.Aa5 r1 = r1.A04()
            r0 = 1
            X.9eC r1 = X.AG0.A00(r1, r4)
            if (r1 == 0) goto L95
            if (r18 != 0) goto L98
            r1.A01 = r4
        L5a:
            if (r2 == 0) goto L94
            X.OIe r8 = r3.A0P
            X.MwV r0 = A00(r3)
            boolean r6 = r0.A0L
            java.util.Map r5 = r8.A02
            X.Ngd r4 = X.EnumC53240Ngd.A06
            java.lang.Object r7 = r5.get(r4)
            X.OJ0 r7 = (X.OJ0) r7
            if (r7 == 0) goto L91
            X.OTl r3 = r7.A02
            X.1EL r0 = r3.A02
            long r0 = r0.now()
            r3.A00 = r0
            X.OWf r3 = r8.A01
            java.lang.Integer r12 = X.C05F.A01
            long r0 = r7.A00()
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            X.PB8 r11 = new X.PB8
            r15 = r2
            r16 = r6
            r11.<init>(r12, r13, r14, r15, r16)
            r3.A02(r11)
        L91:
            r5.put(r4, r9)
        L94:
            return
        L95:
            if (r18 == 0) goto L5a
            goto La1
        L98:
            r1.A01 = r0
            int r0 = java.lang.Integer.parseInt(r10)
            r1.A00(r0)
        La1:
            X.OIe r5 = r3.A0P
            X.MwV r0 = A00(r3)
            boolean r4 = r0.A0L
            java.util.Map r1 = r5.A02
            X.Ngd r0 = X.EnumC53240Ngd.A06
            A09(r0, r13, r10, r1)
            X.OWf r0 = r5.A01
            java.lang.Integer r12 = X.C05F.A00
            X.PB8 r11 = new X.PB8
            r15 = r10
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r0.A02(r11)
            goto L5a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A0F(X.NU5, java.lang.Integer, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (r14 != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0G(X.NU5 r12, java.lang.Integer r13, boolean r14) {
        /*
            X.05A r3 = r12.A0Z
            java.lang.Object r0 = r3.getValue()
            X.Mt8 r0 = (X.C51729Mt8) r0
            boolean r0 = r0.A02
            if (r0 == r14) goto L7a
            java.lang.Object r0 = r3.getValue()
            X.Mt8 r0 = (X.C51729Mt8) r0
            int r1 = r0.A01
            r0 = 5
            X.Mt8 r2 = new X.Mt8
            r2.<init>(r1, r14, r0)
            r3.F8m(r2)
            X.OLL r1 = r12.A0R
            boolean r0 = r2.A02
            int r3 = r2.A01
            r1.A02(r0, r3)
            java.lang.Integer r7 = X.C05F.A00
            if (r13 != r7) goto L7b
            X.O8c r0 = r12.A0M
            X.O3t r0 = r0.A00
            X.0xq r2 = r0.A00
            X.0xo r1 = r2.ARD()
            java.lang.String r0 = "rtc_should_auto_apply_touch_up"
            r1.E77(r0, r14)
            r1.apply()
            java.lang.String r1 = "rtc_touch_up_toast_display_count"
            r11 = 0
            int r4 = r2.getInt(r1, r11)
            if (r14 == 0) goto L7e
            r0 = 3
            if (r4 >= r0) goto L61
            X.OHI r0 = r12.A0N
            X.NU1 r0 = r0.A00
            java.lang.Integer r6 = X.C05F.A05
            long r9 = java.lang.System.currentTimeMillis()
            java.lang.String[] r8 = new java.lang.String[r11]
            X.MwI r5 = new X.MwI
            r5.<init>(r6, r7, r8, r9, r11)
            r0.A02(r5)
            int r0 = r4 + 1
            X.AbstractC167007dF.A18(r2, r1, r0)
        L61:
            X.OIe r5 = r12.A0P
            java.util.Map r4 = r5.A02
            X.Ngd r1 = X.EnumC53240Ngd.A0A
            java.lang.String r0 = "TOUCH_UP_METRIC"
            r2 = 0
            A09(r1, r13, r0, r4)
            X.OWf r1 = r5.A01
            X.PB5 r0 = new X.PB5
            r0.<init>(r7, r13, r2, r2)
            r1.A02(r0)
            r5.A00(r3)
        L7a:
            return
        L7b:
            if (r14 == 0) goto L7e
            goto L61
        L7e:
            X.OIe r8 = r12.A0P
            java.util.Map r7 = r8.A02
            X.Ngd r6 = X.EnumC53240Ngd.A0A
            java.lang.Object r5 = r7.get(r6)
            X.OJ0 r5 = (X.OJ0) r5
            r4 = 0
            if (r5 == 0) goto Lab
            X.OTl r2 = r5.A02
            X.1EL r0 = r2.A02
            long r0 = r0.now()
            r2.A00 = r0
            X.OWf r3 = r8.A01
            java.lang.Integer r2 = X.C05F.A01
            long r0 = r5.A00()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            X.PB5 r0 = new X.PB5
            r0.<init>(r2, r13, r1, r4)
            r3.A02(r0)
        Lab:
            r7.put(r6, r4)
            X.OCA r2 = r8.A00
            X.0nk r1 = r2.A01
            if (r1 == 0) goto Lb9
            X.0nr r0 = r2.A02
            r0.A02(r1)
        Lb9:
            r2.A01 = r4
            r0 = -1
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A0G(X.NU5, java.lang.Integer, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0078, code lost:
    
        if (r39 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00f3, code lost:
    
        if (r39 == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A0H(X.NU5 r38, boolean r39, boolean r40) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A0H(X.NU5, boolean, boolean):void");
    }

    private final boolean A0J(CameraAREffect cameraAREffect, String str) {
        if (cameraAREffect != null && cameraAREffect.A0j) {
            C189708ap c189708ap = this.A0E;
            if (!c189708ap.A00()) {
                if (cameraAREffect.A0N() && !AbstractC31171DnF.A1W(this.A0H, str)) {
                    C150736qU c150736qU = c189708ap.A00;
                    if (c150736qU == null) {
                        C14360o3.A0F("sparkARFLMConsentManager");
                        throw C00O.createAndThrow();
                    }
                    EnumC150766qZ enumC150766qZ = c150736qU.A04;
                    if (enumC150766qZ == null) {
                        enumC150766qZ = EnumC150766qZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    }
                    if (enumC150766qZ == EnumC150766qZ.WITHDRAWN) {
                        OHI ohi = this.A0N;
                        String str2 = cameraAREffect.A0S;
                        C14360o3.A07(str2);
                        String[] strArr = {str2, AbstractC43592JPx.A0w(cameraAREffect.A07)};
                        ohi.A00.A02(new C51874MwI(C05F.A0Q, C05F.A00, strArr, System.currentTimeMillis(), false));
                        this.A0R.A00(AbstractC43592JPx.A05(cameraAREffect.A0K));
                        return true;
                    }
                }
                this.A04 = cameraAREffect;
                A0A(this, C51887MwV.A00(null, null, null, null, null, null, A00(this), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -16777217, false, false, false, false, false, false, false, true, false, false, false, false, false));
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b0, code lost:
    
        if (r5 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x011b, code lost:
    
        if (r1 != true) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a7  */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0K(X.InterfaceC58296Pso r18) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NU5.A0K(X.Pso):void");
    }

    private final void A02() {
        CameraAREffect cameraAREffect = A00(this).A06;
        if (cameraAREffect != null) {
            C55207OeK.A02(this.A0R.A00.A0Z, new JXD(AbstractC43592JPx.A05(cameraAREffect.A0K), 13));
        }
    }

    public static final void A0D(NU5 nu5, Integer num) {
        C51887MwV A00;
        A00 = C51887MwV.A00(null, null, null, null, null, null, A00(nu5), null, num, null, null, null, null, null, null, null, null, null, null, 0.0f, -17, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A0A(nu5, A00);
    }

    private final void A0I(EnumC53279NhH enumC53279NhH, Boolean bool) {
        C51887MwV A00;
        Integer num;
        String str;
        A00 = C51887MwV.A00(null, null, null, null, null, enumC53279NhH, A00(this), null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, -32769, false, false, false, false, false, false, false, false, false, false, false, false, false);
        A0A(this, A00);
        if (bool.equals(AbstractC166997dE.A0b())) {
            C54550O8c c54550O8c = this.A0M;
            int ordinal = enumC53279NhH.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        num = C05F.A0C;
                    } else {
                        return;
                    }
                } else {
                    num = C05F.A01;
                }
            } else {
                num = C05F.A00;
            }
            C54439O3t c54439O3t = c54550O8c.A00;
            switch (num.intValue()) {
                case 0:
                    str = "EFFECTS_TAB";
                    break;
                case 1:
                    str = "GROUP_EFFECTS_TAB";
                    break;
                default:
                    str = "SOLO_BACKGROUNDS_TAB";
                    break;
            }
            InterfaceC19610xo ARD = c54439O3t.A00.ARD();
            ARD.E7K("rtc_last_used_effects_tab", str);
            ARD.apply();
        }
    }
}
