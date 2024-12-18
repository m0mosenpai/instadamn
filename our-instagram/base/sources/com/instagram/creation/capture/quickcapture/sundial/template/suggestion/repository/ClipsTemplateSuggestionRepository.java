package com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository;

import X.AbstractC43593JPy;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* loaded from: classes8.dex */
public final class ClipsTemplateSuggestionRepository {
    public final long A00 = AbstractC43593JPy.A09(TimeUnit.DAYS);
    public final UserSession A01;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r4 = 15
            boolean r0 = X.MAM.A02(r8, r4)
            if (r0 == 0) goto L89
            r3 = r8
            X.MAM r3 = (X.MAM) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L89
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r2 = r3.A01
            X.1JX r4 = X.C1JX.A02
            int r1 = r3.A00
            r0 = 1
            if (r1 == 0) goto L38
            if (r1 != r0) goto L91
            X.AbstractC09560e7.A00(r2)
        L24:
            X.3NY r2 = (X.C3NY) r2
            boolean r0 = r2 instanceof X.C3NX
            r4 = 0
            if (r0 == 0) goto L37
            java.lang.Object r0 = X.AbstractC43594JPz.A0r(r2)
            X.Jvw r0 = (X.C45006Jvw) r0
            X.4zF r0 = r0.A00
            if (r0 == 0) goto L37
            X.1qM r4 = r0.A00
        L37:
            return r4
        L38:
            X.AbstractC09560e7.A00(r2)
            r3.A00 = r0
            com.instagram.common.session.UserSession r0 = r6.A01
            X.1Ms r5 = X.AbstractC25228BEl.A0q(r0)
            java.lang.Integer r0 = X.C05F.A0N
            r5.A08(r0)
            long r0 = r6.A00
            r5.A01 = r0
            java.lang.String r0 = "clips/suggested_template"
            java.lang.String r0 = X.AnonymousClass001.A0R(r0, r7)
            r5.A0A = r0
            r0 = 0
            java.lang.Long r2 = X.AbstractC25231BEo.A0j(r0, r7)
            r5.A05()
            r5.A03()
            java.lang.String r0 = "api/v1/clips/suggested_template/"
            r5.A0B(r0)
            java.lang.Class<X.K7r> r1 = X.K7r.class
            java.lang.Class<X.LAl> r0 = X.LAl.class
            r5.A0R(r1, r0)
            if (r2 == 0) goto L76
            long r1 = r2.longValue()
            java.lang.String r0 = "audio_id"
            r5.A0E(r0, r1)
        L76:
            X.1ON r1 = r5.A0N()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetSuggestedTemplateResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetSuggestedTemplateResponse>>"
            X.C14360o3.A0C(r1, r0)
            r0 = 1166333110(0x4584d4b6, float:4250.589)
            java.lang.Object r2 = r1.A00(r0, r3)
            if (r2 != r4) goto L24
            return r4
        L89:
            r0 = 42
            X.MAM r3 = new X.MAM
            r3.<init>(r6, r8, r4, r0)
            goto L16
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.template.suggestion.repository.ClipsTemplateSuggestionRepository.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public ClipsTemplateSuggestionRepository(UserSession userSession) {
        this.A01 = userSession;
    }
}
