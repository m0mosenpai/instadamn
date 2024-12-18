package X;

/* loaded from: classes11.dex */
public abstract class VS6 {
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        if (r9 != null) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.content.Context r17, X.ViewOnKeyListenerC67976V4r r18, X.V2M r19, X.UJ0 r20, X.InterfaceC11380iw r21, com.instagram.user.model.Product r22, java.lang.String r23) {
        /*
            r2 = 1
            r5 = r20
            X.C14360o3.A0B(r5, r2)
            r1 = 2
            r12 = r18
            r14 = r19
            r11 = r21
            X.AbstractC25233BEq.A0x(r1, r14, r12, r11)
            r0 = 6
            r15 = r23
            X.C14360o3.A0B(r15, r0)
            com.instagram.feed.widget.IgProgressImageView r4 = r5.A01
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r4.getIgImageView()
            r0.clearColorFilter()
            X.3iw r0 = new X.3iw
            r0.<init>()
            r4.setProgressiveImageConfig(r0)
            r4.setEnableProgressBar(r2)
            java.util.List r0 = r14.A02
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Laf
            r0 = 0
            r4.setOnClickListener(r0)
        L36:
            com.instagram.model.mediasize.ImageInfo r9 = r14.A01
            if (r9 == 0) goto La7
            java.util.List r1 = r9.AlQ()
            if (r1 == 0) goto La7
            r0 = 0
            java.lang.Object r0 = X.AbstractC001800i.A0O(r1, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto La7
            int r0 = r0.getWidth()
            float r8 = (float) r0
        L4e:
            java.util.List r1 = r9.AlQ()
            if (r1 == 0) goto Lac
            r0 = 0
            java.lang.Object r0 = X.AbstractC001800i.A0O(r1, r0)
            com.instagram.model.mediasize.ExtendedImageUrl r0 = (com.instagram.model.mediasize.ExtendedImageUrl) r0
            if (r0 == 0) goto Lac
            int r0 = r0.getHeight()
            float r7 = (float) r0
        L62:
            X.Vjm r6 = r14.C37()
            if (r6 == 0) goto Lbd
            X.W4P r3 = r6.A01
            X.W4H r0 = r3.A03
            r10 = r17
            int r1 = X.AbstractC69925Vxq.A00(r10, r0)
            X.W4H r0 = r3.A00
            int r0 = X.AbstractC69925Vxq.A00(r10, r0)
            int r1 = r1 + r0
            float r2 = (float) r1
            X.W4H r0 = r3.A01
            int r1 = X.AbstractC69925Vxq.A00(r10, r0)
            X.W4H r0 = r3.A02
            int r0 = X.AbstractC69925Vxq.A00(r10, r0)
            int r1 = r1 + r0
            float r0 = (float) r1
            float r8 = r8 + r0
            float r7 = r7 + r2
            float r8 = r8 / r7
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r5.A02
            r0.A00 = r8
            com.instagram.model.mediasize.ExtendedImageUrl r0 = X.AbstractC40161tk.A01(r10, r9)
            if (r0 == 0) goto L98
            r4.setUrl(r0, r11)
        L98:
            android.view.View r2 = r5.A00
            X.AbstractC69925Vxq.A01(r2, r3)
            int r1 = r6.A00
            r0 = 0
            X.C14360o3.A0B(r2, r0)
            r2.setBackgroundColor(r1)
            return
        La7:
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto Lac
            goto L4e
        Lac:
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L62
        Laf:
            X.IjQ r10 = new X.IjQ
            r13 = r22
            r16 = r1
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.C0fQ.A00(r10, r4)
            goto L36
        Lbd:
            java.lang.IllegalStateException r0 = X.AbstractC166997dE.A0g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VS6.A00(android.content.Context, X.V4r, X.V2M, X.UJ0, X.0iw, com.instagram.user.model.Product, java.lang.String):void");
    }
}
