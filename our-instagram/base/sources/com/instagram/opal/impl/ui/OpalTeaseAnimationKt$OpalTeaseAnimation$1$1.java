package com.instagram.opal.impl.ui;

import X.AbstractC166987dD;
import X.AbstractC23611Dp;
import X.C0eB;
import X.C5Y1;
import X.InterfaceC11380iw;
import X.InterfaceC16620sF;
import X.InterfaceC16820sZ;
import X.InterfaceC23621Ds;
import X.InterfaceC74953Yl;
import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1", f = "OpalTeaseAnimation.kt", i = {}, l = {JITProfilePQR.MEGA_ZIP_NAME_PREFIX_LEN, 47, 54, 55}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class OpalTeaseAnimationKt$OpalTeaseAnimation$1$1 extends AbstractC23611Dp implements InterfaceC16620sF {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C5Y1 A02;
    public final /* synthetic */ InterfaceC74953Yl A03;
    public final /* synthetic */ InterfaceC11380iw A04;
    public final /* synthetic */ UserSession A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ InterfaceC16820sZ A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpalTeaseAnimationKt$OpalTeaseAnimation$1$1(C5Y1 c5y1, InterfaceC74953Yl interfaceC74953Yl, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, String str2, InterfaceC23621Ds interfaceC23621Ds, InterfaceC16820sZ interfaceC16820sZ, int i) {
        super(2, interfaceC23621Ds);
        this.A06 = str;
        this.A07 = str2;
        this.A05 = userSession;
        this.A04 = interfaceC11380iw;
        this.A02 = c5y1;
        this.A01 = i;
        this.A08 = interfaceC16820sZ;
        this.A03 = interfaceC74953Yl;
    }

    @Override // X.C1Dr
    public final InterfaceC23621Ds create(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        String str = this.A06;
        String str2 = this.A07;
        UserSession userSession = this.A05;
        InterfaceC11380iw interfaceC11380iw = this.A04;
        C5Y1 c5y1 = this.A02;
        int i = this.A01;
        return new OpalTeaseAnimationKt$OpalTeaseAnimation$1$1(c5y1, this.A03, interfaceC11380iw, userSession, str, str2, interfaceC23621Ds, this.A08, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[RETURN] */
    @Override // X.C1Dr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            X.1JX r4 = X.C1JX.A02
            int r0 = r14.A00
            r5 = 4
            r3 = 3
            r2 = 1
            r6 = 2
            r13 = 0
            if (r0 == 0) goto L22
            if (r0 == r2) goto L53
            if (r0 == r6) goto L70
            if (r0 == r3) goto L8b
            X.AbstractC09560e7.A00(r15)
        L14:
            X.3Yl r1 = r14.A03
            r0 = 0
            X.AbstractC25227BEk.A1A(r1, r0)
            X.0sZ r0 = r14.A08
            r0.invoke()
        L1f:
            X.0eB r4 = X.C0eB.A00
            return r4
        L22:
            X.AbstractC09560e7.A00(r15)
            X.3Yl r0 = r14.A03
            boolean r0 = X.AbstractC25230BEn.A1X(r0)
            if (r0 == 0) goto L1f
            java.lang.String r12 = r14.A06
            java.lang.String r11 = r14.A07
            com.instagram.common.session.UserSession r8 = r14.A05
            X.0iw r7 = r14.A04
            java.lang.String r9 = "impression"
            java.lang.String r10 = "pull_tease"
            X.AbstractC34277F9x.A00(r7, r8, r9, r10, r11, r12, r13)
            X.5Y1 r8 = r14.A02
            r0 = 0
            java.lang.Float r7 = X.AbstractC25225BEi.A10(r0)
            int r1 = r14.A01
            r0 = 0
            X.BFe r0 = X.C25245BFe.A00(r1, r0)
            r14.A00 = r2
            java.lang.Object r0 = X.AbstractC25228BEl.A14(r8, r0, r7, r14)
            if (r0 != r4) goto L56
            return r4
        L53:
            X.AbstractC09560e7.A00(r15)
        L56:
            X.5Y1 r8 = r14.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r7 = X.AbstractC25225BEi.A10(r0)
            X.DiB r2 = X.AbstractC25328BIx.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            X.BFe r0 = X.C25245BFe.A01(r2, r1, r0)
            r14.A00 = r6
            java.lang.Object r0 = X.AbstractC25228BEl.A14(r8, r0, r7, r14)
            if (r0 != r4) goto L73
            return r4
        L70:
            X.AbstractC09560e7.A00(r15)
        L73:
            X.5Y1 r6 = r14.A02
            r0 = 1065353216(0x3f800000, float:1.0)
            java.lang.Float r2 = X.AbstractC25225BEi.A10(r0)
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            X.BFe r0 = X.C25245BFe.A00(r1, r0)
            r14.A00 = r3
            java.lang.Object r0 = X.AbstractC25228BEl.A14(r6, r0, r2, r14)
            if (r0 != r4) goto L8e
            return r4
        L8b:
            X.AbstractC09560e7.A00(r15)
        L8e:
            X.5Y1 r6 = r14.A02
            r0 = 0
            java.lang.Float r3 = X.AbstractC25225BEi.A10(r0)
            X.DiB r2 = X.AbstractC25328BIx.A03
            r1 = 1000(0x3e8, float:1.401E-42)
            r0 = 0
            X.BFe r0 = X.C25245BFe.A01(r2, r1, r0)
            r14.A00 = r5
            java.lang.Object r0 = X.AbstractC25228BEl.A14(r6, r0, r3, r14)
            if (r0 != r4) goto L14
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.ui.OpalTeaseAnimationKt$OpalTeaseAnimation$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC16620sF
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpalTeaseAnimationKt$OpalTeaseAnimation$1$1) AbstractC166987dD.A1M(obj2, obj, this)).invokeSuspend(C0eB.A00);
    }
}
