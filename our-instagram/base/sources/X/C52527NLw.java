package X;

import android.app.Activity;
import android.content.Context;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;

/* renamed from: X.NLw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52527NLw extends AbstractC1564470p {
    public C54764OHw A00;
    public C196208mB A01;
    public boolean A02;
    public boolean A03;
    public final CallerContext A04;
    public final InterfaceC41501vz A05;
    public final UserSession A06;
    public final N51 A07;

    @Override // X.AbstractC1564470p
    public final void showUpsell(InterfaceC58134Ppx interfaceC58134Ppx, Activity activity) {
        C14360o3.A0B(activity, 1);
        UserSession userSession = this.A06;
        AbstractC25651Mw.A00(userSession).A01(this.A05, C55990OtN.class);
        N51 A00 = AbstractC53980Ntr.A00(userSession, this.entryPoint);
        A00.A01(new PK7(activity, this, A00, interfaceC58134Ppx), activity);
        if (C14360o3.A0K(this.entryPoint, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL") && AbstractC53981Nts.A00(userSession).booleanValue()) {
            this.A03 = true;
        } else {
            InterfaceC19610xo A0e = AbstractC31176DnK.A0e(userSession);
            A0e.E77("fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen", true);
            A0e.apply();
        }
        AbstractC35174FfR.A02(EnumC72435Xdf.A06, userSession, "upsell_impressions", null, 2);
        A00(EnumC201098ur.VIEW, this);
        if (C18U.A06(C06090Tz.A05, userSession, 36319716629945967L)) {
            C149586oB A002 = AbstractC149576oA.A00(userSession);
            String str = this.entryPoint;
            C14360o3.A0B(str, 0);
            A002.A03.remove(str);
        }
    }

    public static final void A00(EnumC201098ur enumC201098ur, C52527NLw c52527NLw) {
        UserSession userSession = c52527NLw.A06;
        C82G c82g = C82G.A0A;
        C82H c82h = C82H.A0R;
        C82I A0H = MSW.A0H();
        A0H.A09(AbstractC166997dE.A0a());
        AbstractC50523MSb.A18(A0H, 1L);
        AbstractC201108us.A00(c82g, enumC201098ur, c82h, A0H, userSession);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (r1.getBoolean(r0, false) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        if (r2.A02(r7.entryPoint) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        r2.A01(r7.entryPoint);
        r2.A00(r7.entryPoint);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r4, 36319716629945967L) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r0 = X.AbstractC149576oA.A00(r4);
        r1 = r7.entryPoint;
        X.C14360o3.A0B(r1, 0);
        r0.A03.remove(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:
    
        if (X.C18U.A06(r3, r4, 2342162725843508846L) == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004f, code lost:
    
        if (r7.A03 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00dc, code lost:
    
        if (r5 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean A01() {
        /*
            r7 = this;
            com.instagram.common.session.UserSession r4 = r7.A06
            X.0Tz r3 = X.C06090Tz.A06
            r0 = 36319716628897376(0x81089700021e60, double:3.032073271650348E-306)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            r5 = 0
            if (r0 != 0) goto Ldc
            java.lang.Boolean r0 = X.AbstractC53981Nts.A00(r4)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb6
            X.MWX r2 = new X.MWX
            r2.<init>(r4)
            java.lang.String r6 = r7.entryPoint
            X.C14360o3.A0B(r6, r5)
            int r1 = r6.hashCode()
            r0 = -1574224499(0xffffffffa22b3d8d, float:-2.3207406E-18)
            if (r1 == r0) goto La5
            r0 = -773734548(0xffffffffd1e1bf6c, float:-1.211974E11)
            if (r1 == r0) goto L94
            r0 = 1949671265(0x74359f61, float:5.755849E31)
            if (r1 != r0) goto L4d
            java.lang.String r0 = "IG_LOGOUT_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xq r1 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "fx_cal_right_before_logout_sso_upsell_seen"
        L47:
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 != 0) goto L51
        L4d:
            boolean r0 = r7.A03
            if (r0 == 0) goto Lb6
        L51:
            java.lang.String r0 = r7.entryPoint
            boolean r0 = r2.A02(r0)
            if (r0 != 0) goto Lb6
            java.lang.String r0 = r7.entryPoint
            r2.A01(r0)
            java.lang.String r0 = r7.entryPoint
            r2.A00(r0)
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319716629945967(0x81089700121e6f, double:3.032073272313481E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 == 0) goto L7e
            X.6oB r0 = X.AbstractC149576oA.A00(r4)
            java.lang.String r1 = r7.entryPoint
            X.C14360o3.A0B(r1, r5)
            java.util.Map r0 = r0.A03
            r0.remove(r1)
        L7e:
            r0 = 2342162725843508846(0x2081089700101e6e, double:4.06534560635803E-152)
            boolean r0 = X.C18U.A06(r3, r4, r0)
            if (r0 == 0) goto Lb6
        L89:
            r5 = 1
        L8a:
            X.Xdf r3 = X.EnumC72435Xdf.A06
            r2 = 2
            r1 = 0
            java.lang.String r0 = "upsell_impression_limit_hit"
            X.AbstractC35174FfR.A02(r3, r4, r0, r1, r2)
        L93:
            return r5
        L94:
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_CHAINING"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xq r1 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "fx_cal_profile_photo_chaining_ac_upsell_seen"
            goto L47
        La5:
            java.lang.String r0 = "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L4d
            com.instagram.common.session.UserSession r0 = r2.A00
            X.0xq r1 = X.AbstractC166987dD.A0x(r0)
            java.lang.String r0 = "fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen"
            goto L47
        Lb6:
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314395164281377(0x8103c000000a21, double:3.028707955999372E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto Ldc
            boolean r0 = r7.A03
            if (r0 != 0) goto L89
            X.0xq r1 = X.AbstractC166987dD.A0x(r4)
            java.lang.String r0 = "fx_cal_ig_fb_feed_crosspost_after_share_ac_upsell_seen"
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto Ldc
            r0 = 2342162725843377772(0x20810897000e1e6c, double:4.06534560624689E-152)
            boolean r5 = X.C18U.A06(r3, r4, r0)
        Ldc:
            if (r5 == 0) goto L93
            goto L8a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52527NLw.A01():boolean");
    }

    @Override // X.AbstractC1564470p
    public final InterfaceC58198Pr4 getUpsellContent() {
        UserSession userSession = this.A06;
        return (PKA) userSession.A01(PKA.class, new C50152MDf(userSession, 20));
    }

    @Override // X.AbstractC1564470p
    public final void prefetchEligibility() {
        boolean z;
        UserSession userSession = this.A06;
        if (!AbstractC53981Nts.A00(userSession).booleanValue()) {
            z = A01();
        } else {
            z = false;
        }
        if (!isKillswitchEnabled() && !z && !isLinked()) {
            AbstractC149576oA.A00(userSession).A09(AbstractC166987dD.A0O(this.context), userSession, null, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL", null, true, false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C52527NLw(UserSession userSession, Context context, String str) {
        super(context, userSession, str);
        AbstractC167017dG.A1Q(userSession, str);
        this.A06 = userSession;
        this.A04 = CallerContext.A01("FxIgFbFeedCrosspostingACUpsellImpl");
        this.A07 = AbstractC53980Ntr.A00(userSession, str);
        this.A05 = C56034Ou6.A00(this, 6);
    }

    @Override // X.AbstractC1564470p
    public final boolean isUpsellEligible() {
        if (!isKillswitchEnabled() && !A01() && !isLinked()) {
            UserSession userSession = this.A06;
            if (AbstractC196078lx.A01(userSession) && !C18U.A06(C06090Tz.A05, userSession, 36329500564275576L)) {
                return false;
            }
            if (!C18U.A06(C06090Tz.A05, userSession, 36319716629749357L) && !AbstractC149576oA.A00(userSession).A0B(userSession, "IG_FB_FEED_CROSS_POSTING_AFTER_SHARE_CHAINING_UPSELL", true)) {
                return false;
            }
            return C18U.A06(C06090Tz.A06, userSession, 36315361531989154L);
        }
        return false;
    }
}
