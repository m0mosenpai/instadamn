package com.instagram.interactive.prompt.pivot.repository;

import X.AbstractC018607g;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25235BEs;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C38964HDs;
import X.C42183ImV;
import X.IZA;
import X.InterfaceC11380iw;
import android.content.Context;
import com.instagram.api.schemas.MediaPromptPrefType;
import com.instagram.api.schemas.PromptFirstMediaType;
import com.instagram.common.session.UserSession;

/* loaded from: classes7.dex */
public final class PromptPivotPageRepository {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final C38964HDs A02;
    public final C05A A03;
    public final C05A A04;
    public final C05A A05;
    public final C05A A06;
    public final C05A A07;
    public final C05A A08;
    public final C0UO A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;
    public final C0UO A0D;
    public final Context A0E;
    public final AbstractC018607g A0F;
    public final IZA A0G;
    public final String A0H;
    public final C0UO A0I;

    public PromptPivotPageRepository(Context context, AbstractC018607g abstractC018607g, InterfaceC11380iw interfaceC11380iw, UserSession userSession, IZA iza, String str, String str2) {
        AbstractC167017dG.A1U(abstractC018607g, iza);
        this.A0H = str2;
        this.A0E = context;
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A0F = abstractC018607g;
        this.A0G = iza;
        this.A02 = new C38964HDs(context, abstractC018607g, interfaceC11380iw, userSession, new C42183ImV(this, str, str2));
        C008002u A1A = AbstractC25235BEs.A1A(false);
        this.A05 = A1A;
        this.A0B = A1A;
        C008002u A1A2 = AbstractC25235BEs.A1A(true);
        this.A07 = A1A2;
        this.A0I = A1A2;
        C008002u A00 = C10E.A00(null);
        this.A06 = A00;
        C14360o3.A0C(A00, "null cannot be cast to non-null type kotlinx.coroutines.flow.StateFlow<com.instagram.clips.pivot.header.data.PivotPageDefaultHeaderModel?>");
        this.A0C = A00;
        MediaPromptPrefType mediaPromptPrefType = MediaPromptPrefType.A04;
        C008002u A1H = AbstractC25225BEi.A1H(mediaPromptPrefType);
        this.A03 = A1H;
        this.A09 = A1H;
        C008002u A1H2 = AbstractC25225BEi.A1H(mediaPromptPrefType);
        this.A08 = A1H2;
        this.A0D = A1H2;
        C008002u A1H3 = AbstractC25225BEi.A1H(PromptFirstMediaType.A04);
        this.A04 = A1H3;
        this.A0A = A1H3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r16) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository.A00(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 47
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L77
            r5 = r7
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r1 = r5.A00
            r4 = 1
            if (r1 == 0) goto L45
            if (r1 != r4) goto L93
            java.lang.Object r2 = r5.A01
            com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository r2 = (com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository) r2
            X.AbstractC09560e7.A00(r0)
        L28:
            boolean r1 = r0 instanceof X.C3NX
            if (r1 == 0) goto L7d
            X.0UO r0 = r2.A0D
            java.lang.Object r0 = r0.getValue()
            com.instagram.api.schemas.MediaPromptPrefType r0 = (com.instagram.api.schemas.MediaPromptPrefType) r0
            com.instagram.api.schemas.MediaPromptPrefType r3 = X.AbstractC190208be.A00(r0)
            X.05A r1 = r2.A08
        L3a:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIi(r0, r3)
            if (r0 == 0) goto L3a
        L44:
            return r3
        L45:
            X.AbstractC09560e7.A00(r0)
            com.instagram.common.session.UserSession r2 = r6.A01
            X.0UO r0 = r6.A0D
            java.lang.Object r1 = r0.getValue()
            r5.A01 = r6
            r5.A00 = r4
            X.1Ms r2 = X.AbstractC167017dG.A0c(r2)
            java.lang.String r0 = "clips/prompt_stickers/update_notification_settings/"
            r2.A0B(r0)
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.A06
            if (r1 != r0) goto L74
            java.lang.String r1 = "off"
        L63:
            java.lang.String r0 = "value"
            X.1ON r1 = X.AbstractC31178DnM.A0K(r2, r0, r1)
            r0 = 1115933683(0x4283cbf3, float:65.89834)
            java.lang.Object r0 = r1.A00(r0, r5)
            if (r0 == r3) goto L44
            r2 = r6
            goto L28
        L74:
            java.lang.String r1 = "on"
            goto L63
        L77:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r7, r3)
            goto L16
        L7d:
            boolean r0 = r0 instanceof X.C194848jk
            if (r0 == 0) goto L8e
            r3 = 0
            X.0iw r0 = r2.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "notification setting update failed"
            X.C0w9.A03(r1, r0)
            return r3
        L8e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L93:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.interactive.prompt.pivot.repository.PromptPivotPageRepository.A01(X.1Ds):java.lang.Object");
    }
}
