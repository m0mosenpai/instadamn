package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.3i0, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80113i0 {
    public final UserSession A00;

    public C80113i0(UserSession userSession) {
        C14360o3.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C80143i3 A00(android.content.Context r13, X.C38321qM r14) {
        /*
            r12 = this;
            r0 = 0
            X.C14360o3.A0B(r14, r0)
            r0 = 1
            X.C14360o3.A0B(r13, r0)
            boolean r0 = r14.Cff()
            r4 = 0
            if (r0 == 0) goto L72
            com.instagram.common.session.UserSession r2 = r12.A00
            java.lang.String r0 = X.AbstractC97414Zb.A02(r2, r14)
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto Lc5
            boolean r0 = X.AbstractC97414Zb.A04(r0)
            if (r0 == 0) goto L72
            X.3i1 r3 = X.EnumC80123i1.A05
            java.lang.String r0 = X.AbstractC97414Zb.A02(r2, r14)
            if (r0 == 0) goto Lbf
            java.io.File r0 = X.AbstractC97414Zb.A01(r13, r2, r0)
            if (r0 == 0) goto Lbf
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC81033jX.A01(r0)
        L31:
            X.0e4 r2 = new X.0e4
            r2.<init>(r3, r0)
        L36:
            java.lang.Object r5 = r2.A00
            X.3i1 r5 = (X.EnumC80123i1) r5
            java.lang.Object r4 = r2.A01
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            java.lang.String r6 = r14.getId()
            if (r6 == 0) goto Lb7
            java.lang.String r7 = r14.BU6()
            java.lang.String r8 = r14.A2g()
            boolean r9 = r14.A5g()
            X.4Vc r0 = r14.A1U()
            if (r0 == 0) goto L70
            boolean r10 = r0.A02
        L58:
            com.instagram.model.mediasize.ExtendedImageUrl r2 = r14.A1n()
            com.instagram.common.typedurl.ImageUrl r3 = r14.A1S()
            X.1rF r0 = r14.A0C
            X.3wh r1 = r0.BQc()
            boolean r11 = r14.A5P()
            X.3i3 r0 = new X.3i3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L70:
            r10 = 0
            goto L58
        L72:
            boolean r0 = r14.A4w()
            if (r0 == 0) goto L89
            X.3i1 r3 = X.EnumC80123i1.A02
            android.net.Uri r1 = r14.A05
            X.C14360o3.A0A(r1)
            r0 = 0
            X.C14360o3.A0B(r1, r0)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.AbstractC81033jX.A00(r1, r0, r0)
            goto L31
        L89:
            com.instagram.model.mediasize.ImageInfo r0 = r14.A1t()
            if (r0 == 0) goto La7
            com.instagram.model.mediasize.ExtendedImageUrl r1 = r14.A1q(r13)
            if (r1 != 0) goto Laf
            X.0wb r3 = X.C18950wb.A01
            r2 = 817899586(0x30c02842, float:1.3981281E-9)
            java.lang.String r1 = "com.instagram.feed.ui.rows.image.FeedImageUseCase#getImageSource() Could not generate imageUrl for mediaId= "
            java.lang.String r0 = r14.getId()
            java.lang.String r0 = X.AnonymousClass001.A0R(r1, r0)
            r3.AEp(r0, r2)
        La7:
            X.3i1 r3 = X.EnumC80123i1.A03
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r4)
            goto L31
        Laf:
            X.3i1 r0 = X.EnumC80123i1.A04
            X.0e4 r2 = new X.0e4
            r2.<init>(r0, r1)
            goto L36
        Lb7:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lbf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        Lc5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80113i0.A00(android.content.Context, X.1qM):X.3i3");
    }
}
