package X;

/* loaded from: classes9.dex */
public final class OO9 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(android.view.View r3, X.OO9 r4, java.lang.StringBuilder r5) {
        /*
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            r2 = 0
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r1 = r3.getChildCount()
        Lb:
            if (r2 >= r1) goto L94
            android.view.View r0 = r3.getChildAt(r2)
            X.C14360o3.A07(r0)
            A00(r0, r4, r5)
            int r2 = r2 + 1
            goto Lb
        L1a:
            boolean r0 = r3 instanceof android.widget.ImageView
            if (r0 == 0) goto L94
            java.lang.String r0 = "w:"
            r5.append(r0)
            r1 = r3
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            int r0 = r1.getWidth()
            r5.append(r0)
            java.lang.String r0 = ",h:"
            r5.append(r0)
            int r0 = r1.getHeight()
            r5.append(r0)
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            boolean r0 = r1 instanceof X.InterfaceC80783j8
            if (r0 == 0) goto Lac
            java.lang.String r0 = ",image:"
            r5.append(r0)
            X.3j8 r1 = (X.InterfaceC80783j8) r1
            java.lang.String r0 = r1.BGc()
        L4c:
            r5.append(r0)
        L4f:
            boolean r0 = r3 instanceof com.instagram.common.ui.widget.imageview.IgImageView
            if (r0 == 0) goto L8f
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            com.instagram.common.typedurl.ImageUrl r0 = r3.A0C
            if (r0 == 0) goto Laa
            java.lang.String r4 = r0.getUrl()
            if (r4 == 0) goto L83
            java.lang.String r1 = "oh="
            r3 = 0
            int r0 = r4.length()
            int r0 = r0 + (-1)
            int r2 = X.AbstractC001900j.A07(r4, r1, r0)
            r1 = -1
            if (r2 == r1) goto L9a
            r0 = 38
            int r0 = X.AbstractC001900j.A04(r4, r0, r2)
            if (r0 == r1) goto L95
            java.lang.String r1 = X.AbstractC25227BEk.A0w(r4, r3, r2)
            java.lang.String r0 = X.AbstractC43592JPx.A0z(r4, r0)
            java.lang.String r4 = X.AnonymousClass001.A0R(r1, r0)
        L83:
            java.lang.String r0 = ",url:"
            r5.append(r0)
            if (r4 != 0) goto L8c
            java.lang.String r4 = " not set"
        L8c:
            r5.append(r4)
        L8f:
            java.lang.String r0 = "\n"
            r5.append(r0)
        L94:
            return
        L95:
            java.lang.String r4 = r4.substring(r3, r2)
            goto La6
        L9a:
            r0 = 63
            int r0 = X.AbstractC001900j.A04(r4, r0, r3)
            if (r0 == r1) goto L83
            java.lang.String r4 = r4.substring(r3, r0)
        La6:
            X.C14360o3.A07(r4)
            goto L83
        Laa:
            r4 = 0
            goto L83
        Lac:
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Ld2
            android.graphics.drawable.BitmapDrawable r1 = (android.graphics.drawable.BitmapDrawable) r1
            android.graphics.Bitmap r1 = r1.getBitmap()
            if (r1 == 0) goto L4f
            java.lang.String r0 = ",bmp:"
            r5.append(r0)
            int r0 = r1.getWidth()
            r5.append(r0)
            java.lang.String r0 = "x"
            r5.append(r0)
            int r0 = r1.getHeight()
            r5.append(r0)
            goto L4f
        Ld2:
            if (r1 == 0) goto L4f
            java.lang.String r0 = ",drawable (no bitmap info):"
            r5.append(r0)
            java.lang.String r0 = X.MSY.A0h(r1)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OO9.A00(android.view.View, X.OO9, java.lang.StringBuilder):void");
    }
}
