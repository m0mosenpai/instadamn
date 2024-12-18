package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.FfP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35172FfP {
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014f, code lost:
    
        if (r7 == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0157, code lost:
    
        if (r7 == null) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r10, androidx.fragment.app.FragmentActivity r11, X.InterfaceC11380iw r12, com.instagram.common.session.UserSession r13, X.C32056E6i r14, X.EnumC31337Dq2 r15, java.lang.Integer r16) {
        /*
            Method dump skipped, instructions count: 648
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35172FfP.A00(android.content.Context, androidx.fragment.app.FragmentActivity, X.0iw, com.instagram.common.session.UserSession, X.E6i, X.Dq2, java.lang.Integer):void");
    }

    public static final void A01(Context context, FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C32056E6i c32056E6i, Integer num) {
        AbstractC167017dG.A1Q(userSession, c32056E6i);
        A00(context, fragmentActivity, interfaceC11380iw, userSession, c32056E6i, EnumC31337Dq2.A05, num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r1 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
    
        if (r1 != null) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A03(com.instagram.common.session.UserSession r4, X.C32056E6i r5, X.EnumC31337Dq2 r6) {
        /*
            r2 = 2
            java.lang.Class<X.Fbr> r1 = X.C35018Fbr.class
            r0 = 7
            java.lang.Object r4 = X.C31651DvH.A00(r4, r1, r0)
            X.Fbr r4 = (X.C35018Fbr) r4
            int r1 = r6.ordinal()
            r0 = 1
            r3 = 0
            if (r1 == r0) goto L42
            if (r1 == r2) goto L2f
            java.util.List r0 = r5.A0E
            int r0 = r0.size()
            int r2 = r0 + 1
        L1c:
            X.3oI r0 = r5.A06
            if (r0 == 0) goto L2d
            boolean r1 = r0 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
        L22:
            int r0 = r5.A01
            int r0 = r4.A01(r6, r0, r1)
            boolean r0 = X.AbstractC167007dF.A1Q(r2, r0)
            return r0
        L2d:
            r1 = 0
            goto L22
        L2f:
            X.3kP r1 = r5.A04
            if (r1 == 0) goto L3e
            java.util.List r0 = r1.A0B
            if (r0 == 0) goto L3e
            int r2 = r0.size()
        L3b:
            java.util.List r0 = r1.A0D
            goto L50
        L3e:
            r2 = 0
            if (r1 == 0) goto L56
            goto L3b
        L42:
            X.3kP r1 = r5.A04
            if (r1 == 0) goto L58
            java.util.List r0 = r1.A0C
            if (r0 == 0) goto L58
            int r2 = r0.size()
        L4e:
            java.util.List r0 = r1.A0E
        L50:
            if (r0 == 0) goto L56
            int r3 = r0.size()
        L56:
            int r2 = r2 + r3
            goto L1c
        L58:
            r2 = 0
            if (r1 == 0) goto L56
            goto L4e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35172FfP.A03(com.instagram.common.session.UserSession, X.E6i, X.Dq2):boolean");
    }

    public static final boolean A02(UserSession userSession, Capabilities capabilities, C32056E6i c32056E6i, boolean z) {
        InterfaceC83733oI interfaceC83733oI = c32056E6i.A06;
        int i = c32056E6i.A01;
        return AbstractC160887Iw.A00(userSession, c32056E6i.A05, interfaceC83733oI, c32056E6i.A09, i, c32056E6i.A0F, c32056E6i.A0M, c32056E6i.A0H, c32056E6i.A0O, capabilities.A00(EnumC2054697t.A1A), z);
    }
}
