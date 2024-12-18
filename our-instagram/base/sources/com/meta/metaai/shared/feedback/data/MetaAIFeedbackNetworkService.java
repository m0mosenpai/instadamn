package com.meta.metaai.shared.feedback.data;

import X.AbstractC167017dG;
import X.AbstractC28057CYl;
import X.AbstractC40691uc;
import X.C40701ud;
import X.InterfaceC40711ue;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class MetaAIFeedbackNetworkService {
    public final Application A00;
    public final InterfaceC40711ue A01;
    public final FoaUserSession A02;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r7 = this;
            r4 = 22
            boolean r0 = X.C29631D3m.A03(r13, r4)
            if (r0 == 0) goto L8b
            r3 = r13
            X.D3m r3 = (X.C29631D3m) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8b
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r1 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r0 = r3.A00
            r2 = 1
            if (r0 == 0) goto L35
            if (r0 != r2) goto La5
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L92
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            if (r0 == 0) goto L90
            X.3NX r4 = X.AbstractC25225BEi.A0z(r0)
            return r4
        L35:
            X.AbstractC09560e7.A00(r1)
            X.1ue r1 = r7.A01
            java.lang.Class<X.CX2> r0 = X.CX2.class
            java.lang.Object r5 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> Laa
            X.Cpi r5 = (X.C28934Cpi) r5     // Catch: java.lang.Throwable -> Laa
            X.2JM r6 = r5.A00
            java.lang.String r0 = "metagen_request_id"
            r6.A04(r0, r8)
            boolean r0 = X.AbstractC167007dF.A1W(r8)
            r5.A03 = r0
            java.lang.String r0 = "metagen_response_id"
            r6.A04(r0, r9)
            boolean r0 = X.AbstractC167007dF.A1W(r9)
            r5.A04 = r0
            java.lang.String r0 = "feedback_kind"
            r6.A04(r0, r10)
            boolean r0 = X.AbstractC167007dF.A1W(r10)
            r5.A01 = r0
            java.lang.String r0 = "intent_task"
            r6.A04(r0, r11)
            boolean r0 = X.AbstractC167007dF.A1W(r11)
            r5.A02 = r0
            java.lang.String r0 = "surface"
            r6.A04(r0, r12)
            boolean r0 = X.AbstractC167007dF.A1W(r12)
            r5.A05 = r0
            com.facebook.pando.PandoGraphQLRequest r0 = r5.A00()
            X.C14360o3.A07(r0)
            r3.A00 = r2
            java.lang.Object r1 = X.CL2.A00(r1, r0, r3)
            if (r1 != r4) goto L24
            return r4
        L8b:
            X.D3m r3 = X.C29631D3m.A00(r7, r13, r4)
            goto L16
        L90:
            r0 = 0
            goto L9a
        L92:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto La0
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
        L9a:
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
            return r4
        La0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Laa:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.shared.feedback.data.MetaAIFeedbackNetworkService.A00(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ MetaAIFeedbackNetworkService(Application application, FoaUserSession foaUserSession) {
        C40701ud A01 = AbstractC40691uc.A01(AbstractC28057CYl.A00(foaUserSession));
        AbstractC167017dG.A1Q(application, A01);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A01;
    }
}
