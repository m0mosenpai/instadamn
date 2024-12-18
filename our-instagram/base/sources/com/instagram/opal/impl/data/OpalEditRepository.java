package com.instagram.opal.impl.data;

import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC23021Ah;
import X.AbstractC25225BEi;
import X.AbstractC31171DnF;
import X.AbstractC40691uc;
import X.C008002u;
import X.C05A;
import X.C0YR;
import X.C14360o3;
import X.C16930sl;
import X.C23031Ai;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import X.C51761Mtk;
import X.C74;
import X.InterfaceC16530ry;
import X.InterfaceC19610xo;
import X.InterfaceC19630xq;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes9.dex */
public final class OpalEditRepository extends C4A7 {
    public final Context A00;
    public final UserSession A01;
    public final C40701ud A02;
    public final C05A A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OpalEditRepository(Context context, UserSession userSession) {
        super("Opal", C4A8.A01(72627069, 3));
        Object value;
        C74 c74;
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        AbstractC167017dG.A1P(userSession, context);
        C14360o3.A0B(A01, 3);
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = A01;
        C008002u A1H = AbstractC25225BEi.A1H(new C51761Mtk((OpalProfileData) null, (C74) null, (DefaultConstructorMarker) null, 3, 46));
        this.A03 = A1H;
        User A0Y = AbstractC166997dE.A0Y(userSession);
        OpalProfileData opalProfileData = new OpalProfileData(C74.A07, A0Y.getId(), A0Y.getUsername(), "", "", null, "", C16930sl.A00, 0, AbstractC167007dF.A1W(A0Y.A03.BYy()), false, false, false);
        do {
            value = A1H.getValue();
            c74 = (C74) ((C51761Mtk) value).A02;
            AbstractC167017dG.A1N(opalProfileData, c74);
        } while (!A1H.AIi(value, new C51761Mtk(opalProfileData, c74)));
    }

    private final void A00() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01);
        InterfaceC19630xq interfaceC19630xq = A00.A01;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        ARD.E7D("opal_delight_animation_count", 0);
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        ARD2.E7D("opal_main_profile_tease_animation_count", 0);
        ARD2.apply();
        InterfaceC19610xo ARD3 = interfaceC19630xq.ARD();
        ARD3.E7D("opal_profile_menu_option_view_count", 0);
        ARD3.apply();
        InterfaceC19610xo ARD4 = interfaceC19630xq.ARD();
        ARD4.E7D("opal_profile_tease_animation_count", 0);
        ARD4.apply();
        InterfaceC16530ry interfaceC16530ry = A00.A4v;
        C0YR[] c0yrArr = C23031Ai.A8c;
        interfaceC16530ry.Egi(A00, false, c0yrArr[453]);
        AbstractC31171DnF.A1S(A00, false, A00.A5T, c0yrArr, 454);
        AbstractC31171DnF.A1S(A00, false, A00.A5U, c0yrArr, 456);
        AbstractC31171DnF.A1S(A00, false, A00.A4L, c0yrArr, 455);
        InterfaceC19610xo ARD5 = interfaceC19630xq.ARD();
        ARD5.E77("has_seen_feed_opal_indicator_tooltip", false);
        ARD5.apply();
    }

    public static boolean A01(C51761Mtk c51761Mtk, C74 c74, Object obj, C05A c05a) {
        return c05a.AIi(obj, C51761Mtk.A00((OpalProfileData) c51761Mtk.A00, c74));
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008e, code lost:
    
        if (r13 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
    
        r13 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r3 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        r9 = X.C74.A04;
        r18 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x009e, code lost:
    
        if (r3 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a0, code lost:
    
        r17 = r3.BsV();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r4.A03.BYy() == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        r18 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
    
        r8 = new com.instagram.opal.impl.data.OpalProfileData(r9, r10, r11, r12, r13, null, r15, X.C16930sl.A00, r17, r18, false, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ed, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0093, code lost:
    
        r15 = r3.Ag0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        if (r15 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
    
        if (r3 != null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(com.instagram.opal.impl.data.OpalProfileData r28, X.InterfaceC23621Ds r29) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A02(com.instagram.opal.impl.data.OpalProfileData, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r2 = r3.getValue();
        r1 = X.C74.A04;
        X.AbstractC167017dG.A1N(r6, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        if (r3.AIi(r2, new X.C51761Mtk(r6, r1)) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        return X.C0eB.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r2 = r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (A01((X.C51761Mtk) r2, X.C74.A03, r2, r3) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.opal.impl.data.OpalProfileData r13, X.InterfaceC23621Ds r14) {
        /*
            r12 = this;
            r3 = 22
            boolean r0 = X.C57145PWx.A02(r14, r3)
            if (r0 == 0) goto L83
            r11 = r14
            X.PWx r11 = (X.C57145PWx) r11
            int r2 = r11.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r11.A00 = r2
        L16:
            java.lang.Object r6 = r11.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r11.A00
            r4 = 1
            if (r0 == 0) goto L55
            if (r0 != r4) goto L88
            java.lang.Object r0 = r11.A01
            com.instagram.opal.impl.data.OpalEditRepository r0 = (com.instagram.opal.impl.data.OpalEditRepository) r0
            X.AbstractC09560e7.A00(r6)
        L28:
            com.instagram.opal.impl.data.OpalProfileData r6 = (com.instagram.opal.impl.data.OpalProfileData) r6
            X.05A r3 = r0.A03
            if (r6 == 0) goto L45
        L2e:
            java.lang.Object r2 = r3.getValue()
            X.C74 r1 = X.C74.A04
            X.AbstractC167017dG.A1N(r6, r1)
            X.Mtk r0 = new X.Mtk
            r0.<init>(r6, r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L2e
        L42:
            X.0eB r5 = X.C0eB.A00
        L44:
            return r5
        L45:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Mtk r1 = (X.C51761Mtk) r1
            X.C74 r0 = X.C74.A03
            boolean r0 = A01(r1, r0, r2, r3)
            if (r0 == 0) goto L45
            goto L42
        L55:
            X.AbstractC09560e7.A00(r6)
            X.05A r3 = r12.A03
        L5a:
            java.lang.Object r2 = r3.getValue()
            X.C74 r1 = X.C74.A05
            r10 = r13
            X.AbstractC167017dG.A1N(r13, r1)
            X.Mtk r0 = new X.Mtk
            r0.<init>(r13, r1)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L5a
            com.instagram.opal.impl.data.OpalRepoUtil r6 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            android.content.Context r7 = r12.A00
            com.instagram.common.session.UserSession r8 = r12.A01
            X.1ud r9 = r12.A02
            r11.A01 = r12
            r11.A00 = r4
            java.lang.Object r6 = r6.A01(r7, r8, r9, r10, r11)
            if (r6 == r5) goto L44
            r0 = r12
            goto L28
        L83:
            X.PWx r11 = X.C57145PWx.A00(r12, r14, r3)
            goto L16
        L88:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A03(com.instagram.opal.impl.data.OpalProfileData, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r24) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalEditRepository.A04(X.1Ds):java.lang.Object");
    }
}
