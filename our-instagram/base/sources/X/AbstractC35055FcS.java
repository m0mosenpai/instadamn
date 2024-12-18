package X;

import com.instagram.common.session.UserSession;
import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.FcS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35055FcS {
    public static InterfaceC37154GYr A02(UserSession userSession, ChannelCreationSource channelCreationSource, EnumC33330EoP enumC33330EoP) {
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = new ChannelCreationFlowExtraArgs(null, null, null);
        C14360o3.A0B(userSession, 0);
        return A00(userSession, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, false).A00();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r7.A02 == null) goto L8;
     */
    @kotlin.Deprecated(message = "Should only be used internally once already in the creation flow", replaceWith = @kotlin.ReplaceWith(expression = "getInstance", imports = {}))
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C34674FPj A00(com.instagram.common.session.UserSession r6, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r7, com.instagram.direct.channels.analytics.ChannelCreationSource r8, X.EnumC33330EoP r9, boolean r10) {
        /*
            X.AbstractC167017dG.A1N(r6, r8)
            r0 = 3
            android.os.Bundle r0 = X.AbstractC31174DnI.A0E(r7, r0)
            X.FPj r3 = new X.FPj
            r3.<init>(r0)
            com.instagram.direct.channels.analytics.ChannelCreationSource r5 = com.instagram.direct.channels.analytics.ChannelCreationSource.A0C
            if (r8 != r5) goto L1a
            java.lang.String r0 = r7.A01
            if (r0 == 0) goto L1a
            java.lang.String r0 = r7.A02
            r4 = 1
            if (r0 != 0) goto L1b
        L1a:
            r4 = 0
        L1b:
            X.G1i r0 = new X.G1i
            r0.<init>()
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.A01
            r1.add(r0)
            X.G1j r0 = new X.G1j
            r0.<init>(r8)
            r1.add(r0)
            X.G1k r0 = new X.G1k
            r0.<init>(r6)
            r1.add(r0)
            X.G1n r0 = new X.G1n
            r0.<init>(r6, r4)
            r1.add(r0)
            X.G1m r0 = new X.G1m
            r0.<init>(r6, r9)
            r1.add(r0)
            X.G1l r0 = new X.G1l
            r0.<init>(r7)
            r1.add(r0)
            if (r10 != 0) goto L5b
            android.os.Bundle r0 = r3.A00
            X.G1q r1 = new X.G1q
            r1.<init>(r0, r6)
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A02
            r0.add(r1)
        L5b:
            android.os.Bundle r2 = r3.A00
            if (r8 != r5) goto L6a
            X.G1u r1 = new X.G1u
            r1.<init>(r2, r6, r4)
        L64:
            java.util.concurrent.ConcurrentLinkedQueue r0 = r3.A02
            r0.add(r1)
            return r3
        L6a:
            X.G1r r0 = new X.G1r
            r0.<init>(r2, r6)
            java.util.concurrent.ConcurrentLinkedQueue r1 = r3.A02
            r1.add(r0)
            X.G1t r0 = new X.G1t
            r0.<init>(r2, r6)
            r1.add(r0)
            X.G1s r0 = new X.G1s
            r0.<init>(r2, r6)
            r1.add(r0)
            X.G1p r1 = new X.G1p
            r1.<init>(r2, r6)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35055FcS.A00(com.instagram.common.session.UserSession, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs, com.instagram.direct.channels.analytics.ChannelCreationSource, X.EoP, boolean):X.FPj");
    }

    public static InterfaceC37154GYr A01(UserSession userSession, ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs, ChannelCreationSource channelCreationSource, EnumC33330EoP enumC33330EoP, boolean z) {
        return A00(userSession, channelCreationFlowExtraArgs, channelCreationSource, enumC33330EoP, z).A00();
    }
}
