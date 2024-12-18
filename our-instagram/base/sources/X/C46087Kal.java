package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kal, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46087Kal extends C30P {
    public final UserSession A00;
    public final C47946LGa A01;
    public final C7DP A02;
    public final C7DO A03;
    public final boolean A04;

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, X.4Sf] */
    @Override // X.C30P
    public final void A0A(C19280xC c19280xC, C4SW c4sw) {
        C14360o3.A0B(c19280xC, 0);
        ?? obj = new Object();
        C47946LGa c47946LGa = this.A01;
        Integer valueOf = Integer.valueOf(c47946LGa.A00);
        obj.A0K = valueOf;
        if (valueOf != null) {
            c19280xC.A08(valueOf, AbstractC111324zv.A00(1216));
        }
        Integer A0s = AbstractC43592JPx.A0s(c47946LGa.A03);
        obj.A0L = A0s;
        if (A0s != null) {
            c19280xC.A08(A0s, "reel_size");
        }
        Boolean valueOf2 = Boolean.valueOf(this.A04);
        obj.A03 = valueOf2;
        if (valueOf2 != null) {
            c19280xC.A09("is_replay", valueOf2);
        }
        if (c4sw != null) {
            c4sw.A07 = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C46087Kal(UserSession userSession, C47946LGa c47946LGa, C7DO c7do, InterfaceC60442pS interfaceC60442pS, String str, boolean z) {
        super(interfaceC60442pS, str);
        C7DP c7dp = new C7DP(userSession);
        this.A01 = c47946LGa;
        this.A04 = z;
        this.A00 = userSession;
        this.A02 = c7dp;
        this.A03 = c7do;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [X.0Zx, X.4So] */
    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C95804So A05(Object obj) {
        EnumC95784Sm enumC95784Sm = EnumC95784Sm.ORGANIC;
        String A00 = this.A03.A00();
        ?? c0Zx = new C0Zx();
        c0Zx.A05("media_id", -1L);
        AbstractC43594JPz.A1A(enumC95784Sm, c0Zx, this);
        c0Zx.A06("tracking_token", "-1");
        c0Zx.A06("encrypted_logging_policy", "encrypted_only");
        c0Zx.A06("persistent_id", A00);
        return c0Zx;
    }

    @Override // X.C30P
    public final /* bridge */ /* synthetic */ C4T2 A06(C4T2 c4t2, Object obj) {
        C75363a3 c75363a3;
        String str;
        C48648LfZ c48648LfZ = (C48648LfZ) obj;
        AbstractC167007dF.A1K(c48648LfZ, c4t2);
        super.A06(c4t2, c48648LfZ);
        C45093JxN c45093JxN = c48648LfZ.A00;
        if (AbstractC167007dF.A1X(c45093JxN.A0B, EnumC40111tc.A0a)) {
            c75363a3 = c45093JxN.A00();
        } else {
            c75363a3 = null;
        }
        boolean A1T = AbstractC167007dF.A1T(c48648LfZ.A04);
        c4t2.A06("video_format", C4T3.A01(c75363a3, false, c45093JxN.A0R));
        Boolean valueOf = Boolean.valueOf(A1T);
        c4t2.A03("is_instamadillo", valueOf);
        EnumC92794Ds enumC92794Ds = c48648LfZ.A01;
        boolean A1b = AbstractC31177DnL.A1b(valueOf);
        String str2 = "ig_advanced_crypto_transport";
        if (!A1b) {
            if (enumC92794Ds == EnumC92794Ds.A05) {
                str2 = "ig_django";
            } else if (enumC92794Ds != EnumC92794Ds.A04) {
                str2 = enumC92794Ds == EnumC92794Ds.A06 ? "ig_django_msys_mixed" : "ig_messenger_infra";
            }
        }
        c4t2.A06(TraceFieldType.TransportType, str2);
        c4t2.A03("is_vm", Boolean.valueOf(c48648LfZ.A09));
        c4t2.A05("ephemeral_lifetime_ms", c48648LfZ.A07);
        EnumC40111tc enumC40111tc = c48648LfZ.A03;
        if (enumC40111tc != null) {
            str = LH6.A00(enumC40111tc);
        } else {
            str = "unknown";
        }
        c4t2.A06("media_type", str);
        c4t2.A06("media_product_type", LH6.A02(c48648LfZ.A06));
        c4t2.A06("interface_identifier", LH6.A01(c48648LfZ.A05));
        c4t2.A06("open_thread_id", c48648LfZ.A08);
        return c4t2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    @Override // X.C30P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ X.C4SH A07(java.lang.Object r42) {
        /*
            r41 = this;
            r9 = r42
            X.LfZ r9 = (X.C48648LfZ) r9
            r6 = 0
            X.C14360o3.A0B(r9, r6)
            r3 = r41
            X.7DP r0 = r3.A02
            com.instagram.common.session.UserSession r4 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36320287859548470(0x81091c00022136, double:3.032434520214261E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto Lb8
            r0 = 36322014436272078(0x810aae000027ce, double:3.033526414286637E-306)
            boolean r0 = X.C18U.A06(r2, r4, r0)
            if (r0 != 0) goto Lb8
            X.JxN r8 = r9.A00
            X.4hU r2 = r8.A07
            r15 = 0
            if (r2 == 0) goto Lb5
            X.4hY r4 = r2.A05
        L2f:
            r1 = 1
            r37 = 0
            if (r4 == 0) goto La6
            X.2pS r3 = r3.A00
            boolean r0 = X.AbstractC75423a9.A02(r4, r3)
            if (r0 == 0) goto L99
            java.lang.String r5 = r2.A0F
            r38 = 1
        L40:
            com.instagram.user.model.User r0 = r8.A0C
            if (r0 == 0) goto L48
            com.instagram.user.model.FollowStatus r15 = r0.B7L()
        L48:
            java.lang.String r4 = r8.A01()
            X.3bi r13 = X.EnumC76383bi.A06
            r17 = 0
            X.C14360o3.A0B(r4, r1)
            boolean r0 = X.AbstractC167007dF.A1W(r2)
            r36 = r0 ^ 1
            java.lang.String r10 = r8.A0L
            java.lang.String r7 = r8.A0I
            java.lang.String r3 = r8.A0M
            boolean r2 = r8.A0Q
            long r0 = r8.A03
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 / r11
            X.1tc r14 = r9.A03
            X.3a3 r16 = r8.A00()
            X.4SH r12 = new X.4SH
            r23 = r17
            r24 = r17
            r25 = r17
            r26 = r17
            r27 = r17
            r28 = r17
            r29 = r17
            r30 = r17
            r31 = r17
            r32 = r17
            r33 = r17
            r34 = r0
            r39 = r2
            r40 = r6
            r21 = r5
            r22 = r3
            r19 = r10
            r20 = r7
            r18 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r37, r38, r39, r40)
            return r12
        L99:
            boolean r0 = X.AbstractC75423a9.A01(r4, r3)
            if (r0 == 0) goto La8
            java.lang.String r5 = r2.A0L
            r38 = 0
            r37 = 1
            goto L40
        La6:
            r5 = r15
            goto Lb2
        La8:
            java.lang.Boolean r0 = r2.A0A
            boolean r0 = X.AbstractC166997dE.A1Z(r0, r1)
            if (r0 == 0) goto La6
            java.lang.String r5 = r2.A0I
        Lb2:
            r38 = 0
            goto L40
        Lb5:
            r4 = r15
            goto L2f
        Lb8:
            r12 = 0
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46087Kal.A07(java.lang.Object):X.4SH");
    }

    @Override // X.C30P
    public final Integer A08() {
        return C05F.A04;
    }
}
