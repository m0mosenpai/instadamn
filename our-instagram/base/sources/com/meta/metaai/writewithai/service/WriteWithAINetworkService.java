package com.meta.metaai.writewithai.service;

import X.AbstractC25227BEk;
import X.AbstractC28057CYl;
import X.AbstractC40691uc;
import X.B4Z;
import X.C0CA;
import X.C14360o3;
import X.C29532Czk;
import X.C29533Czl;
import X.C2JO;
import X.C40701ud;
import X.CW8;
import X.InterfaceC30851DhQ;
import X.InterfaceC40711ue;
import android.app.Application;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.meta.foa.session.FoaUserSession;

/* loaded from: classes5.dex */
public final class WriteWithAINetworkService {
    public final Application A00;
    public final InterfaceC40711ue A01;
    public final FoaUserSession A02;

    /* JADX WARN: Type inference failed for: r3v2, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public static final C2JO A00(CW8 cw8) {
        InterfaceC30851DhQ interfaceC30851DhQ = cw8.A00;
        if (interfaceC30851DhQ instanceof C29533Czl) {
            ?? graphQlCallInput = new GraphQlCallInput();
            graphQlCallInput.A02().A0E(AbstractC25227BEk.A0T(GraphQlCallInput.A02, ((C29533Czl) interfaceC30851DhQ).A00, "image_url"), "ig_context");
            return graphQlCallInput;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.facebook.graphql.calls.GraphQlCallInput, X.2JO] */
    public static final C2JO A01(CW8 cw8) {
        InterfaceC30851DhQ interfaceC30851DhQ = cw8.A00;
        if (interfaceC30851DhQ instanceof C29532Czk) {
            ?? graphQlCallInput = new GraphQlCallInput();
            ?? graphQlCallInput2 = new GraphQlCallInput();
            graphQlCallInput2.A05("media_urls", ((C29532Czk) interfaceC30851DhQ).A00);
            graphQlCallInput.A06(graphQlCallInput2, "fb_video_context");
            return graphQlCallInput;
        }
        if (interfaceC30851DhQ instanceof C29533Czl) {
            ?? graphQlCallInput3 = new GraphQlCallInput();
            C29533Czl c29533Czl = (C29533Czl) interfaceC30851DhQ;
            C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, c29533Czl.A00, "image_url");
            C0CA.A00(A0T, c29533Czl.A01, "text");
            graphQlCallInput3.A02().A0E(A0T, "ig_stories_context");
            return graphQlCallInput3;
        }
        throw B4Z.A00();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.C28280CdP r10, java.lang.String r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r9 = this;
            r3 = 29
            boolean r0 = X.C29631D3m.A03(r13, r3)
            if (r0 == 0) goto L95
            r5 = r13
            X.D3m r5 = (X.C29631D3m) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L95
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto Lb0
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L9d
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            if (r0 == 0) goto L9b
            X.3NX r6 = X.AbstractC25225BEi.A0z(r0)
            return r6
        L35:
            X.AbstractC09560e7.A00(r1)
            X.1ue r3 = r9.A01
            java.lang.Class<X.CX6> r0 = X.CX6.class
            java.lang.Object r7 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> Lb5
            X.Cpg r7 = (X.C28932Cpg) r7     // Catch: java.lang.Throwable -> Lb5
            X.CW8 r8 = r10.A02
            X.2JO r1 = A01(r8)
            X.2JM r2 = r7.A00
            java.lang.String r0 = "context"
            r2.A00(r1, r0)
            r7.A01 = r4
            java.lang.Integer r0 = r10.A05
            java.lang.String r1 = X.AbstractC28338CeQ.A01(r0)
            java.lang.String r0 = "target_surface"
            r2.A04(r0, r1)
            r7.A02 = r4
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "surface_session_id"
            r2.A04(r0, r1)
            java.lang.String r1 = r8.A02
            java.lang.String r0 = "initial_content"
            r2.A04(r0, r1)
            java.lang.String r0 = "prompt"
            r2.A04(r0, r12)
            int r0 = r10.A00
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            java.lang.String r0 = "output_quantity"
            r2.A03(r0, r1)
            java.lang.String r0 = "prompt_request_id"
            r2.A04(r0, r11)
            com.facebook.pando.PandoGraphQLRequest r2 = r7.A00()
            r0 = 0
            X.1Dk r0 = r2.setMaxToleratedCacheAgeMs(r0)
            r5.A00 = r4
            java.lang.Object r1 = X.CL2.A00(r3, r0, r5)
            if (r1 != r6) goto L24
            return r6
        L95:
            X.D3m r5 = X.C29631D3m.A00(r9, r13, r3)
            goto L16
        L9b:
            r0 = 0
            goto La5
        L9d:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lab
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
        La5:
            X.8jk r6 = new X.8jk
            r6.<init>(r0)
            return r6
        Lab:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb0:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Lb5:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A02(X.CdP, java.lang.String, java.lang.String, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.C28280CdP r9, X.InterfaceC23621Ds r10) {
        /*
            r8 = this;
            r3 = 28
            boolean r0 = X.C29631D3m.A03(r10, r3)
            if (r0 == 0) goto L71
            r5 = r10
            X.D3m r5 = (X.C29631D3m) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L71
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A01
            X.1JX r6 = X.C1JX.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L35
            if (r0 != r4) goto L8b
            X.AbstractC09560e7.A00(r1)
        L24:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L78
            java.lang.Object r0 = X.AbstractC25231BEo.A0n(r1)
            if (r0 == 0) goto L76
            X.3NX r6 = X.AbstractC25225BEi.A0z(r0)
            return r6
        L35:
            X.AbstractC09560e7.A00(r1)
            X.1ue r3 = r8.A01
            java.lang.Class<X.CX9> r0 = X.CX9.class
            java.lang.Object r7 = X.AbstractC25234BEr.A0d(r0)     // Catch: java.lang.Throwable -> L90
            X.CpZ r7 = (X.C28925CpZ) r7     // Catch: java.lang.Throwable -> L90
            java.lang.Integer r0 = r9.A05
            java.lang.String r1 = X.AbstractC28338CeQ.A01(r0)
            X.2JM r2 = r7.A00
            java.lang.String r0 = "target_surface"
            r2.A04(r0, r1)
            r7.A03 = r4
            X.CW8 r0 = r9.A02
            X.2JO r1 = A01(r0)
            java.lang.String r0 = "context"
            r2.A00(r1, r0)
            r7.A02 = r4
            X.1Dk r2 = r7.A00()
            r0 = 0
            X.1Dk r0 = r2.setMaxToleratedCacheAgeMs(r0)
            r5.A00 = r4
            java.lang.Object r1 = X.CL2.A00(r3, r0, r5)
            if (r1 != r6) goto L24
            return r6
        L71:
            X.D3m r5 = X.C29631D3m.A00(r8, r10, r3)
            goto L16
        L76:
            r0 = 0
            goto L80
        L78:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L86
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r0 = r1.A00
        L80:
            X.8jk r6 = new X.8jk
            r6.<init>(r0)
            return r6
        L86:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L90:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.writewithai.service.WriteWithAINetworkService.A03(X.CdP, X.1Ds):java.lang.Object");
    }

    public /* synthetic */ WriteWithAINetworkService(Application application, FoaUserSession foaUserSession) {
        C40701ud A01 = AbstractC40691uc.A01(AbstractC28057CYl.A00(foaUserSession));
        C14360o3.A0B(A01, 3);
        this.A00 = application;
        this.A02 = foaUserSession;
        this.A01 = A01;
    }
}
