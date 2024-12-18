package com.meta.metaai.promptsheet.creation.impl.viewmodel;

import X.AbstractC52922bZ;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C14360o3;
import X.C27323C4e;
import X.C34941FaR;
import X.CVS;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository;

/* loaded from: classes5.dex */
public final class PromptSheetAIViewModel extends AbstractC52922bZ {
    public final Application A00;
    public final FoaUserSession A01;
    public final C34941FaR A02;
    public final PromptSheetAIRepository A03;
    public final CVS A04;
    public final C05A A05;
    public final C0UO A06;

    public /* synthetic */ PromptSheetAIViewModel(Application application, FoaUserSession foaUserSession, C34941FaR c34941FaR, CVS cvs) {
        PromptSheetAIRepository promptSheetAIRepository = new PromptSheetAIRepository(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A04 = cvs;
        this.A02 = c34941FaR;
        this.A03 = promptSheetAIRepository;
        C27323C4e c27323C4e = C27323C4e.A00;
        C14360o3.A0C(c27323C4e, "null cannot be cast to non-null type com.meta.metaai.promptsheet.creation.impl.viewmodel.MetaAIPromptUIState");
        C008002u A00 = C10E.A00(c27323C4e);
        this.A05 = A00;
        this.A06 = A00;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r7, com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 45
            boolean r0 = X.C57146PWy.A01(r9, r3)
            if (r0 == 0) goto L2c
            r6 = r9
            X.PWy r6 = (X.C57146PWy) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2c
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 == r2) goto L44
            if (r0 == r3) goto L79
            if (r0 == r4) goto L79
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2c:
            X.PWy r6 = new X.PWy
            r6.<init>(r7, r9, r3)
            goto L16
        L32:
            X.AbstractC09560e7.A00(r1)
            com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository r1 = r8.A03
            X.CVS r0 = r8.A04
            r6.A01 = r8
            r6.A00 = r2
            java.lang.Object r1 = r1.A00(r0, r6)
            if (r1 != r5) goto L4b
            return r5
        L44:
            java.lang.Object r8 = r6.A01
            com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r8 = (com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel) r8
            X.AbstractC09560e7.A00(r1)
        L4b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L5e
            X.DGt r0 = X.C29905DGt.A01(r8, r2)
            r6.A01 = r8
            r6.A00 = r3
            java.lang.Object r0 = A01(r8, r1, r6, r0)
        L5b:
            if (r0 != r5) goto L7c
            return r5
        L5e:
            java.lang.String r0 = "Result is null"
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A14(r0)
            r0 = 0
            r6.A01 = r0
            r6.A00 = r4
            X.05A r1 = r8.A05
            X.C4c r0 = new X.C4c
            r0.<init>(r2)
            java.lang.Object r0 = r1.emit(r0, r6)
            if (r0 == r5) goto L7e
            X.0eB r0 = X.C0eB.A00
            goto L5b
        L79:
            X.AbstractC09560e7.A00(r1)
        L7c:
            X.0eB r5 = X.C0eB.A00
        L7e:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel.A00(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r6, java.util.List r7, X.InterfaceC23621Ds r8, X.InterfaceC16820sZ r9) {
        /*
            r3 = 44
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L68
            r4 = r8
            X.PWy r4 = (X.C57146PWy) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r5 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L35
            if (r0 == r1) goto L31
            if (r0 != r2) goto L6e
            java.lang.Object r9 = r4.A01
            X.0sZ r9 = (X.InterfaceC16820sZ) r9
            X.AbstractC09560e7.A00(r5)
        L2b:
            r9.invoke()
        L2e:
            X.0eB r3 = X.C0eB.A00
            return r3
        L31:
            X.AbstractC09560e7.A00(r5)
            goto L2e
        L35:
            X.AbstractC09560e7.A00(r5)
            if (r7 == 0) goto L52
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L52
            X.05A r1 = r6.A05
            X.C4d r0 = new X.C4d
            r0.<init>(r7)
            r4.A01 = r9
            r4.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L2b
            return r3
        L52:
            java.lang.String r0 = "There is no prompts"
            java.lang.IllegalStateException r2 = X.AbstractC166987dD.A14(r0)
            r4.A00 = r1
            X.05A r1 = r6.A05
            X.C4c r0 = new X.C4c
            r0.<init>(r2)
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L2e
            return r3
        L68:
            X.PWy r4 = new X.PWy
            r4.<init>(r6, r8, r3)
            goto L16
        L6e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel.A01(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, java.util.List, X.1Ds, X.0sZ):java.lang.Object");
    }
}
