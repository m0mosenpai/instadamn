package com.instagram.wellbeing.respectfulcommentnudge.impl;

import X.C14360o3;
import X.C189448aO;
import X.C189478aR;
import X.C1YH;
import X.C3DN;
import X.F86;
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class RespectfulNudgePluginImpl {
    public static RespectfulNudgePluginImpl A02;
    public final C1YH A00;
    public final RepositoryImpl A01;

    /* JADX WARN: Multi-variable type inference failed */
    public RespectfulNudgePluginImpl() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RespectfulNudgePluginImpl(C1YH c1yh, RepositoryImpl repositoryImpl, DefaultConstructorMarker defaultConstructorMarker, int i) {
        RepositoryImpl repositoryImpl2 = new RepositoryImpl(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 3);
        C1YH c1yh2 = C1YH.A00;
        C14360o3.A0B(c1yh2, 2);
        this.A01 = repositoryImpl2;
        this.A00 = c1yh2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum A01(X.C18920wW r13, com.instagram.common.session.UserSession r14, X.C38321qM r15, java.lang.Integer r16, java.lang.String r17, java.lang.String r18, java.util.List r19, X.InterfaceC23621Ds r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A01(X.0wW, com.instagram.common.session.UserSession, X.1qM, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, X.1Ds, boolean):java.lang.Enum");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002e, code lost:
    
        if (((X.C3DP) r0).A0h != true) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A03(android.app.Activity r13, X.C18920wW r14, com.instagram.common.session.UserSession r15, X.C38321qM r16, X.InterfaceC168477fh r17, X.EnumC168447fe r18, java.lang.String r19, java.lang.String r20) {
        /*
            r12 = this;
            r4 = 0
            r2 = r18
            X.C14360o3.A0B(r2, r4)
            r1 = 1
            r6 = r16
            X.C14360o3.A0B(r6, r1)
            r0 = 4
            r3 = 9
            X.C14360o3.A0B(r15, r0)
            r0 = 5
            X.C14360o3.A0B(r13, r0)
            r0 = 6
            r5 = r14
            X.C14360o3.A0B(r14, r0)
            r0 = 7
            r8 = r17
            X.C14360o3.A0B(r8, r0)
            X.3DO r0 = X.C3DN.A00
            X.3DN r0 = r0.A00(r13)
            if (r0 == 0) goto L30
            X.3DP r0 = (X.C3DP) r0
            boolean r0 = r0.A0h
            r11 = 1
            if (r0 == r1) goto L31
        L30:
            r11 = 0
        L31:
            int r1 = r2.ordinal()
            r7 = r12
            if (r1 == r4) goto L99
            r0 = 2
            if (r1 == r0) goto L7c
            r0 = 8
            if (r1 == r0) goto L5e
            if (r1 != r3) goto L5d
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.AbstractC60492pY.A04(r0, r15)
            X.N46 r2 = new X.N46
            r2.<init>()
            r2.setArguments(r0)
            X.O9J r0 = new X.O9J
            r0.<init>(r12, r8)
            r2.A00 = r0
        L58:
            if (r11 != 0) goto L5d
            A00(r13, r2, r15)
        L5d:
            return
        L5e:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            X.AbstractC60492pY.A04(r1, r15)
            java.lang.String r0 = "nudge_type"
            r1.putSerializable(r0, r2)
            X.N4d r2 = new X.N4d
            r2.<init>()
            r2.setArguments(r1)
            X.PJY r0 = new X.PJY
            r0.<init>(r14, r12, r8)
            r2.A00 = r0
            goto L58
        L7c:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.AbstractC60492pY.A04(r0, r15)
            X.BrR r2 = new X.BrR
            r2.<init>()
            r2.setArguments(r0)
            X.CSZ r3 = new X.CSZ
            r4 = r14
            r5 = r6
            r6 = r12
            r7 = r8
            r8 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            r2.A00 = r3
            goto L58
        L99:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            X.AbstractC60492pY.A04(r0, r15)
            X.N4I r2 = new X.N4I
            r2.<init>()
            r2.setArguments(r0)
            X.OEl r4 = new X.OEl
            r9 = r19
            r10 = r20
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r2.A00 = r4
            goto L58
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A03(android.app.Activity, X.0wW, com.instagram.common.session.UserSession, X.1qM, X.7fh, X.7fe, java.lang.String, java.lang.String):void");
    }

    public static final void A00(Activity activity, Fragment fragment, UserSession userSession) {
        C189478aR A00 = F86.A00(C3DN.A00.A00(activity));
        C189448aO c189448aO = new C189448aO(userSession);
        if (A00 != null) {
            A00.A0F(fragment, c189448aO);
        } else {
            c189448aO.A00().A02(activity, fragment);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum A02(X.C18920wW r12, com.instagram.common.session.UserSession r13, java.lang.Integer r14, X.InterfaceC23621Ds r15) {
        /*
            r11 = this;
            r3 = 46
            boolean r0 = X.C9CX.A00(r15, r3)
            if (r0 == 0) goto L75
            r5 = r15
            X.9CX r5 = (X.C9CX) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r7 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L33
            if (r0 != r6) goto L89
            X.AbstractC09560e7.A00(r1)
        L24:
            X.7fd r1 = (X.EnumC168437fd) r1
            int r0 = r1.ordinal()
            switch(r0) {
                case 0: goto L86;
                case 1: goto L86;
                case 2: goto L80;
                case 3: goto L7d;
                case 4: goto L86;
                case 5: goto L86;
                case 6: goto L86;
                case 7: goto L86;
                case 8: goto L86;
                case 9: goto L86;
                case 10: goto L86;
                case 11: goto L86;
                case 12: goto L86;
                case 13: goto L86;
                case 14: goto L83;
                case 15: goto L86;
                default: goto L2d;
            }
        L2d:
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        L33:
            X.AbstractC09560e7.A00(r1)
            com.instagram.wellbeing.respectfulcommentnudge.data.RepositoryImpl r4 = r11.A01
            r3 = 0
            X.C14360o3.A0B(r13, r3)
            X.1Ai r0 = X.AbstractC23021Ah.A00(r13)
            X.0xq r10 = r0.A01
            java.lang.String r0 = "media_creation_nudge_shown_count"
            int r1 = r10.getInt(r0, r3)
            if (r1 == 0) goto L68
            r0 = 7
            if (r1 > r0) goto L91
            long r8 = java.lang.System.currentTimeMillis()
            r0 = 0
            java.lang.String r2 = "media_creation_nudge_last_seen_time_ms"
            long r0 = r10.getLong(r2, r0)
            long r8 = r8 - r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 1
            long r1 = r2.toMillis(r0)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L91
        L68:
            java.lang.String r0 = X.AbstractC167327dl.A00(r14)
            r5.A00 = r6
            java.lang.Enum r1 = r4.A01(r13, r0, r5)
            if (r1 != r7) goto L24
            return r7
        L75:
            r0 = 42
            X.9CX r5 = new X.9CX
            r5.<init>(r11, r15, r3, r0)
            goto L16
        L7d:
            X.7fe r7 = X.EnumC168447fe.A02
            return r7
        L80:
            X.7fe r7 = X.EnumC168447fe.A03
            return r7
        L83:
            X.7fe r7 = X.EnumC168447fe.A0H
            return r7
        L86:
            X.7fe r7 = X.EnumC168447fe.A0D
            return r7
        L89:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L91:
            java.lang.Integer r0 = X.C05F.A0N
            if (r14 == r0) goto L96
            r6 = 0
        L96:
            X.C14360o3.A0B(r12, r3)
            java.lang.Integer r0 = X.C05F.A0j
            X.C1YH.A03(r12, r0, r6)
            X.7fe r7 = X.EnumC168447fe.A0D
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wellbeing.respectfulcommentnudge.impl.RespectfulNudgePluginImpl.A02(X.0wW, com.instagram.common.session.UserSession, java.lang.Integer, X.1Ds):java.lang.Enum");
    }
}
