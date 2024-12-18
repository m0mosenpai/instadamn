package com.instagram.comments.mvvm.data;

import X.AbstractC166987dD;
import X.AbstractC25225BEi;
import X.C05A;
import X.C10E;
import X.C14360o3;
import X.C4A7;
import X.C4A8;
import X.MBT;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class CommentGiphyRepository extends C4A7 {
    public final UserSession A00;
    public final C05A A01;
    public final C05A A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentGiphyRepository(UserSession userSession) {
        super("CommentGiphySuggestionRepository", C4A8.A00(974981769));
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
        this.A02 = AbstractC25225BEi.A1H("");
        this.A01 = C10E.A00(null);
        AbstractC166987dD.A1Z(new MBT(this, null, 17), super.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.comments.mvvm.data.CommentGiphyRepository r8, java.lang.String r9, X.InterfaceC23621Ds r10) {
        /*
            r3 = 24
            boolean r0 = X.MAG.A01(r10, r3)
            if (r0 == 0) goto L9e
            r4 = r10
            X.MAG r4 = (X.MAG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r5 = 3
            r2 = 2
            r7 = 1
            if (r0 == 0) goto L2d
            if (r0 == r7) goto L4a
            if (r0 == r2) goto L7b
            if (r0 != r5) goto La5
            X.AbstractC09560e7.A00(r1)
        L2a:
            X.0eB r3 = X.C0eB.A00
            return r3
        L2d:
            X.AbstractC09560e7.A00(r1)
            com.instagram.common.session.UserSession r6 = r8.A00
            X.Kcd r0 = X.EnumC46201Kcd.GIPHY_GIFS
            java.util.List r1 = X.AbstractC166987dD.A1J(r0)
            com.instagram.api.schemas.GiphyRequestSurface r0 = com.instagram.api.schemas.GiphyRequestSurface.A05
            X.1ON r1 = X.AbstractC47110Ks5.A00(r0, r6, r9, r1)
            r4.A01 = r8
            r4.A00 = r7
            r0 = -5
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r3) goto L51
            return r3
        L4a:
            java.lang.Object r8 = r4.A01
            com.instagram.comments.mvvm.data.CommentGiphyRepository r8 = (com.instagram.comments.mvvm.data.CommentGiphyRepository) r8
            X.AbstractC09560e7.A00(r1)
        L51:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L72
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.K8R r0 = (X.K8R) r0
            X.05A r1 = r8.A01
            X.KiI r0 = r0.A01
            java.util.List r0 = r0.A04
            java.util.List r0 = X.AbstractC43594JPz.A12(r0)
            r4.A01 = r8
            r4.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L82
            return r3
        L72:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 != 0) goto L86
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L7b:
            java.lang.Object r8 = r4.A01
            com.instagram.comments.mvvm.data.CommentGiphyRepository r8 = (com.instagram.comments.mvvm.data.CommentGiphyRepository) r8
            X.AbstractC09560e7.A00(r1)
        L82:
            X.3NX r1 = X.AbstractC25227BEk.A0i()
        L86:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L2a
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Laa
            X.05A r2 = r8.A01
            X.0sl r1 = X.C16930sl.A00
            r0 = 0
            r4.A01 = r0
            r4.A00 = r5
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L2a
            return r3
        L9e:
            X.MAG r4 = new X.MAG
            r4.<init>(r8, r10, r3)
            goto L16
        La5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        Laa:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.comments.mvvm.data.CommentGiphyRepository.A00(com.instagram.comments.mvvm.data.CommentGiphyRepository, java.lang.String, X.1Ds):java.lang.Object");
    }
}
