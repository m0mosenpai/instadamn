package com.instagram.reels.comments.repository;

import X.C149526o3;
import X.InterfaceC11380iw;

/* loaded from: classes3.dex */
public final class StoryCommentsRepository {
    public final C149526o3 A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C38321qM r10, java.lang.String r11, X.InterfaceC23621Ds r12) {
        /*
            r9 = this;
            r3 = 45
            boolean r0 = X.C9CY.A00(r12, r3)
            if (r0 == 0) goto L8d
            r5 = r12
            X.9CY r5 = (X.C9CY) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r1 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r5.A00
            r6 = 1
            if (r0 == 0) goto L42
            if (r0 != r6) goto Lc0
            java.lang.Object r10 = r5.A01
            X.1qM r10 = (X.C38321qM) r10
            X.AbstractC09560e7.A00(r1)
        L28:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto Lb6
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.N2I r0 = (X.N2I) r0
            X.Prj r0 = r0.A00
            if (r0 != 0) goto L93
            java.lang.String r0 = "response"
            X.C14360o3.A0F(r0)
            X.00O r1 = X.C00O.createAndThrow()
            throw r1
        L42:
            X.AbstractC09560e7.A00(r1)
            java.lang.String r7 = r10.getId()
            if (r7 == 0) goto Lc8
            X.6o3 r0 = r9.A00
            r5.A01 = r10
            r5.A00 = r6
            com.instagram.common.session.UserSession r1 = r0.A00
            r3 = 0
            r8 = 0
            r0 = -2
            X.1Ms r2 = new X.1Ms
            r2.<init>(r1, r0)
            java.lang.Integer r0 = X.C05F.A01
            r2.A09(r0)
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r0 = "media/story_comment/post/"
            java.lang.String r0 = X.AbstractC13670mt.A06(r0, r1)
            r2.A0B(r0)
            java.lang.Class<X.N2I> r1 = X.N2I.class
            java.lang.Class<X.ONZ> r0 = X.ONZ.class
            r2.A0P(r8, r1, r0, r3)
            java.lang.String r0 = "comment_text"
            r2.A9s(r0, r11)
            java.lang.String r0 = "media_id"
            r2.A9s(r0, r7)
            r2.A0R = r6
            X.1ON r2 = r2.A0N()
            r1 = 1253316102(0x4ab41606, float:5901059.0)
            r0 = 3
            java.lang.Object r1 = r2.A02(r5, r1, r0, r3)
            if (r1 != r4) goto L28
            return r4
        L8d:
            X.9CY r5 = new X.9CY
            r5.<init>(r9, r12, r3)
            goto L16
        L93:
            X.Mv0 r0 = (X.C51796Mv0) r0
            X.1rO r2 = r0.A00
            if (r2 == 0) goto Lc8
            X.C14360o3.A0B(r10, r6)
            X.1rF r0 = r10.A0C
            java.util.List r0 = r0.C1L()
            if (r0 == 0) goto Lb3
            java.util.ArrayList r0 = X.AbstractC001800i.A0T(r2, r0)
        La8:
            X.1rF r1 = r10.A0C
            r1.Eeu(r0)
            X.3NX r4 = new X.3NX
            r4.<init>(r2)
            return r4
        Lb3:
            X.0sl r0 = X.C16930sl.A00
            goto La8
        Lb6:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto Lc8
            X.B4Z r1 = new X.B4Z
            r1.<init>()
            throw r1
        Lc0:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        Lc8:
            X.0eB r0 = X.C0eB.A00
            X.8jk r4 = new X.8jk
            r4.<init>(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.comments.repository.StoryCommentsRepository.A00(X.1qM, java.lang.String, X.1Ds):java.lang.Object");
    }

    public StoryCommentsRepository(InterfaceC11380iw interfaceC11380iw, C149526o3 c149526o3) {
        this.A00 = c149526o3;
        interfaceC11380iw.getModuleName();
    }
}
