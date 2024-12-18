package com.instagram.creation.genai.aistickers.data;

import X.C14360o3;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AIStickersGhostPromptsRepository extends C4A7 {
    public final UserSession A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIStickersGhostPromptsRepository(UserSession userSession) {
        super("AIStickers", C4A8.A00(678177204));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.Kv8, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.InterfaceC23621Ds r19) {
        /*
            r18 = this;
            r3 = 44
            r5 = r19
            boolean r0 = X.MAM.A02(r5, r3)
            r6 = r18
            if (r0 == 0) goto L97
            r4 = r5
            X.MAM r4 = (X.MAM) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r4.A00 = r2
        L1a:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L5e
            if (r0 != r5) goto Lb6
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La0
            X.2JS r4 = X.AbstractC25232BEp.A18(r1)
            if (r4 == 0) goto La9
            java.lang.Class<X.Qaq> r3 = X.C59218Qaq.class
            r2 = 0
            java.lang.String r1 = "xfb_ig_ai_stickers_ghost_prompts_json"
            r0 = 696197213(0x297f205d, float:5.6649445E-14)
            X.2JS r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto La9
            java.lang.String r0 = "ghost_prompts_json"
            java.lang.String r2 = r1.getOptionalStringField(r2, r0)
            if (r2 == 0) goto La9
            java.lang.String r1 = "{\"prompts\":"
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.AnonymousClass001.A0S(r1, r2, r0)
            X.16L r0 = X.C16V.A00(r0)
            X.Kv8 r3 = X.AbstractC46694KlD.parseFromJson(r0)
            X.C14360o3.A07(r3)
            return r3
        L5e:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1ud r2 = X.AbstractC40691uc.A01(r0)
            r13 = 0
            X.2JM r1 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r7 = X.AbstractC25225BEi.A0c()
            java.util.Map r9 = r1.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.Qar> r11 = X.C59219Qar.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGAIStickersGhostPromptsJSONQuery"
            r12 = 0
            java.lang.String r16 = "xfb_ig_ai_stickers_ghost_prompts_json"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A00 = r5
            java.lang.Object r1 = r2.A04(r6, r4)
            if (r1 != r3) goto L28
            return r3
        L97:
            r0 = 42
            X.MAM r4 = new X.MAM
            r4.<init>(r6, r5, r3, r0)
            goto L1a
        La0:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto La9
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La9:
            X.0sl r0 = X.C16930sl.A00
            X.C14360o3.A0B(r0, r5)
            X.Kv8 r3 = new X.Kv8
            r3.<init>()
            r3.A00 = r0
            return r3
        Lb6:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository.A00(X.1Ds):java.lang.Object");
    }
}
