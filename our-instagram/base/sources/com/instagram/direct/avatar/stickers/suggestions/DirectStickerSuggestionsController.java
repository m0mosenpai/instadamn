package com.instagram.direct.avatar.stickers.suggestions;

import X.AbstractC09440dt;
import X.AbstractC166987dD;
import X.AbstractC166997dE;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25231BEo;
import X.AbstractC31178DnM;
import X.AbstractC43593JPy;
import X.AnonymousClass194;
import X.C05F;
import X.C06090Tz;
import X.C09530e4;
import X.C12L;
import X.C14360o3;
import X.C16930sl;
import X.C19L;
import X.C32071E6x;
import X.C47775L7x;
import X.C48254LXd;
import X.C50251MHg;
import X.C9CH;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC13000lm;
import X.L7T;
import X.M8D;
import X.MBo;
import X.MRB;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class DirectStickerSuggestionsController implements InterfaceC13000lm {
    public C9CH A00;
    public C32071E6x A01;
    public L7T A02;
    public Integer A03;
    public String A04;
    public String A05;
    public String A06;
    public C19L A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final UserSession A0B;
    public final C48254LXd A0C;
    public final Executor A0D;
    public final AtomicBoolean A0E;
    public final InterfaceC09390do A0F;
    public final InterfaceC09390do A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final InterfaceC09390do A0L;
    public final InterfaceC09390do A0M;
    public final InterfaceC09390do A0N;
    public final InterfaceC09390do A0O;
    public final InterfaceC09390do A0P;
    public final InterfaceC09390do A0Q;
    public final InterfaceC09390do A0R;
    public volatile C9CH A0S;

    public DirectStickerSuggestionsController(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A0B = userSession;
        this.A0Q = AbstractC09440dt.A01(new C50251MHg(this, 12));
        this.A07 = AbstractC43593JPy.A17(C12L.A00, 891758784, 3);
        this.A0D = M8D.A00;
        this.A0E = AbstractC166997dE.A17();
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0J = C50251MHg.A01(this, enumC09460dv, 5);
        this.A0L = C50251MHg.A01(this, enumC09460dv, 7);
        this.A0F = C50251MHg.A01(this, enumC09460dv, 1);
        this.A0K = C50251MHg.A01(this, enumC09460dv, 6);
        this.A0M = C50251MHg.A01(this, enumC09460dv, 8);
        this.A03 = C05F.A00;
        this.A05 = AbstractC25231BEo.A0p();
        this.A0I = C50251MHg.A01(this, enumC09460dv, 4);
        this.A0G = C50251MHg.A01(this, enumC09460dv, 2);
        this.A0H = C50251MHg.A01(this, enumC09460dv, 3);
        this.A0N = C50251MHg.A01(this, enumC09460dv, 9);
        this.A0R = C50251MHg.A01(this, enumC09460dv, 13);
        this.A01 = new C32071E6x(-1, "Unknown", 8);
        this.A04 = "NotSet";
        this.A0A = true;
        C16930sl c16930sl = C16930sl.A00;
        this.A0S = new C9CH("", "", c16930sl, c16930sl);
        this.A0P = AbstractC09440dt.A01(new C50251MHg(this, 11));
        this.A0C = new C48254LXd(userSession);
        this.A0O = AbstractC09440dt.A01(new C50251MHg(this, 10));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(11:5|6|7|(1:(2:10|11)(2:29|30))(4:31|(2:33|(1:35))|25|26)|12|13|(1:15)|16|(3:18|(1:24)(1:22)|23)|25|26))|38|6|7|(0)(0)|12|13|(0)|16|(0)|25|26) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0054, code lost:
    
        r1 = new X.C09540e5(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 26
            boolean r0 = X.MAF.A01(r6, r3)
            if (r0 == 0) goto L26
            r4 = r6
            X.MAF r4 = (X.MAF) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L31
            if (r0 != r2) goto L2c
            java.lang.Object r5 = r4.A01
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r5 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r5
            goto L4d
        L26:
            X.MAF r4 = new X.MAF
            r4.<init>(r5, r6, r3)
            goto L16
        L2c:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L31:
            X.AbstractC09560e7.A00(r1)
            java.lang.Integer r1 = r5.A03
            java.lang.Integer r0 = X.C05F.A00
            if (r1 != r0) goto L79
            X.0do r0 = r5.A0P     // Catch: java.lang.Throwable -> L53
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L53
            com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl r0 = (com.facebook.avatar.stickerguide.lib.impl.StickerTypeaheadImpl) r0     // Catch: java.lang.Throwable -> L53
            r4.A01 = r5     // Catch: java.lang.Throwable -> L53
            r4.A00 = r2     // Catch: java.lang.Throwable -> L53
            java.lang.Object r1 = r0.A01(r4)     // Catch: java.lang.Throwable -> L53
            if (r1 != r3) goto L50
            return r3
        L4d:
            X.AbstractC09560e7.A00(r1)     // Catch: java.lang.Throwable -> L53
        L50:
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L53
            goto L59
        L53:
            r0 = move-exception
            X.0e5 r1 = new X.0e5
            r1.<init>(r0)
        L59:
            boolean r0 = r1 instanceof X.C09540e5
            r0 = r0 ^ 1
            if (r0 == 0) goto L63
            java.lang.Integer r0 = X.C05F.A01
            r5.A03 = r0
        L63:
            java.lang.Throwable r0 = X.C09550e6.A00(r1)
            if (r0 == 0) goto L79
            boolean r0 = r0 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L7c
            X.0do r0 = r5.A0K
            boolean r0 = X.AbstractC31178DnM.A1a(r0)
            if (r0 != 0) goto L7c
            java.lang.Integer r0 = X.C05F.A0N
        L77:
            r5.A03 = r0
        L79:
            X.0eB r3 = X.C0eB.A00
            return r3
        L7c:
            java.lang.Integer r0 = X.C05F.A0C
            goto L77
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.A00(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r6, X.InterfaceC23621Ds r7) {
        /*
            r4 = 8
            boolean r0 = X.MAK.A01(r7, r4)
            if (r0 == 0) goto L7e
            r3 = r7
            X.MAK r3 = (X.MAK) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7e
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r5 = r3.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L36
            if (r0 == r1) goto L2a
            if (r0 != r4) goto L84
            X.AbstractC09560e7.A00(r5)
        L27:
            X.0eB r2 = X.C0eB.A00
        L29:
            return r2
        L2a:
            java.lang.Object r6 = r3.A02
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r6 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r6
            java.lang.Object r1 = r3.A01
            com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController r1 = (com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController) r1
            X.AbstractC09560e7.A00(r5)
            goto L4e
        L36:
            X.AbstractC09560e7.A00(r5)
            X.0do r0 = r6.A0Q
            java.lang.Object r0 = r0.getValue()
            X.MRB r0 = (X.MRB) r0
            r3.A01 = r6
            r3.A02 = r6
            r3.A00 = r1
            java.lang.Object r5 = r0.E5J(r3)
            if (r5 == r2) goto L29
            r1 = r6
        L4e:
            X.E6x r5 = (X.C32071E6x) r5
            r6.A01 = r5
            X.0do r0 = r1.A0Q
            java.lang.Object r0 = r0.getValue()
            X.MRB r0 = (X.MRB) r0
            boolean r0 = r0.BBA()
            if (r0 != 0) goto L70
            X.0do r0 = r1.A0G
            boolean r0 = X.AbstractC31178DnM.A1a(r0)
            if (r0 == 0) goto L27
            X.0do r0 = r1.A0I
            boolean r0 = X.AbstractC31178DnM.A1a(r0)
            if (r0 == 0) goto L27
        L70:
            r0 = 0
            r3.A01 = r0
            r3.A02 = r0
            r3.A00 = r4
            java.lang.Object r0 = A00(r1, r3)
            if (r0 != r2) goto L27
            return r2
        L7e:
            X.MAK r3 = new X.MAK
            r3.<init>(r6, r7, r4)
            goto L16
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController.A01(com.instagram.direct.avatar.stickers.suggestions.DirectStickerSuggestionsController, X.1Ds):java.lang.Object");
    }

    public static final boolean A02(DirectStickerSuggestionsController directStickerSuggestionsController) {
        return AbstractC31178DnM.A1a(directStickerSuggestionsController.A0K);
    }

    public final C09530e4 A03() {
        InterfaceC09390do interfaceC09390do = this.A0Q;
        return AbstractC166987dD.A1L(((MRB) interfaceC09390do.getValue()).Aji((List) this.A0S.A01), ((MRB) interfaceC09390do.getValue()).F8n((List) this.A0S.A01));
    }

    public final void A04() {
        boolean z = true;
        if (!this.A0A) {
            this.A0A = !((MRB) this.A0Q.getValue()).CLq();
        }
        if (!AbstractC31178DnM.A1a(this.A0K)) {
            if (AnonymousClass194.A07(this.A07)) {
                AnonymousClass194.A05(null, this.A07);
                this.A07 = AbstractC167017dG.A0w(C12L.A00, 891758784);
            }
            L7T l7t = this.A02;
            if (l7t != null) {
                C47775L7x c47775L7x = l7t.A01;
                if (c47775L7x == null || !c47775L7x.A00()) {
                    z = false;
                }
                this.A08 = z;
                return;
            }
            if (AbstractC25225BEi.A07(C06090Tz.A05, this.A0B, 36603515183829956L) <= 0) {
                return;
            }
            this.A08 = true;
            AbstractC166987dD.A1Z(new MBo(this, null, 27), this.A07);
        }
    }

    @Override // X.InterfaceC13000lm
    public final void onSessionWillEnd() {
        AnonymousClass194.A05(null, this.A07);
    }
}
