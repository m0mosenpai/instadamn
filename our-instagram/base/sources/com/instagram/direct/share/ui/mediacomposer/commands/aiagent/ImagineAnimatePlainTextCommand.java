package com.instagram.direct.share.ui.mediacomposer.commands.aiagent;

import X.AbstractC167007dF;
import X.AbstractC45980KWs;
import X.C14360o3;
import X.C46993KqC;
import X.EnumC46202Kce;
import X.InterfaceC162057Np;

/* loaded from: classes8.dex */
public final class ImagineAnimatePlainTextCommand extends AbstractC45980KWs implements InterfaceC162057Np {
    public static final C46993KqC Companion = new Object();
    public static final String TRIGGER_KEY = "animate";

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.7C2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImagineAnimatePlainTextCommand(android.app.Activity r12, com.instagram.common.session.UserSession r13) {
        /*
            r11 = this;
            r1 = r12
            r2 = r13
            X.AbstractC167017dG.A1P(r12, r13)
            X.7FY r3 = X.C7FY.A03
            X.7FZ r5 = X.C7FZ.A04
            X.AbstractC31265Don.A00()
            r0 = 2131960576(0x7f132300, float:1.9557825E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.7C1 r8 = new X.7C1
            r8.<init>()
            r0 = 101(0x65, float:1.42E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "animate"
            r10 = 0
            r7 = 2131238693(0x7f081f25, float:1.8093672E38)
            r0 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand.<init>(android.app.Activity, com.instagram.common.session.UserSession):void");
    }

    @Override // X.InterfaceC162057Np
    public boolean shouldPrependOnReply(String str, EnumC46202Kce enumC46202Kce) {
        C14360o3.A0B(enumC46202Kce, 1);
        return AbstractC167007dF.A1X(enumC46202Kce, EnumC46202Kce.IMAGINE_ANIMATE);
    }
}
