package com.instagram.direct.share.ui.mediacomposer.commands.aiagent;

import X.AbstractC162137Nx;
import X.AbstractC167007dF;
import X.C14360o3;
import X.C46992KqB;
import X.EnumC46202Kce;
import X.InterfaceC162057Np;

/* loaded from: classes8.dex */
public final class ImagineAnimateCompositeCommand extends AbstractC162137Nx implements InterfaceC162057Np {
    public static final C46992KqB Companion = new Object();

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, X.7C2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ImagineAnimateCompositeCommand(android.app.Activity r16, com.instagram.common.session.UserSession r17, X.C162097Nt r18, com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand r19) {
        /*
            r15 = this;
            r12 = 1
            r1 = r16
            r2 = r17
            r10 = r18
            r11 = r19
            X.AbstractC167027dH.A0a(r12, r1, r2, r10, r11)
            X.7FY r3 = r11.commandType
            java.lang.String r4 = r11.trigger
            X.7FZ r5 = r11.loggingId
            X.AbstractC31265Don.A00()
            r0 = 2131960576(0x7f132300, float:1.9557825E38)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.7C1 r8 = new X.7C1
            r8.<init>()
            r0 = 101(0x65, float:1.42E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r14 = 0
            r7 = 2131238693(0x7f081f25, float:1.8093672E38)
            r0 = r15
            r13 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimateCompositeCommand.<init>(android.app.Activity, com.instagram.common.session.UserSession, X.7Nt, com.instagram.direct.share.ui.mediacomposer.commands.aiagent.ImagineAnimatePlainTextCommand):void");
    }

    @Override // X.InterfaceC162057Np
    public boolean shouldPrependOnReply(String str, EnumC46202Kce enumC46202Kce) {
        C14360o3.A0B(enumC46202Kce, 1);
        return AbstractC167007dF.A1X(enumC46202Kce, EnumC46202Kce.IMAGINE_ANIMATE);
    }
}
