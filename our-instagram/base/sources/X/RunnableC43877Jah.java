package X;

/* renamed from: X.Jah, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC43877Jah implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GestureDetectorOnGestureListenerC43829JZs A01;
    public final /* synthetic */ boolean A02;

    public RunnableC43877Jah(GestureDetectorOnGestureListenerC43829JZs gestureDetectorOnGestureListenerC43829JZs, int i, boolean z) {
        this.A01 = gestureDetectorOnGestureListenerC43829JZs;
        this.A00 = i;
        this.A02 = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r7.A0z, 36319463225695691L) != false) goto L23;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            X.JZs r7 = r14.A01
            X.JZt r6 = r7.A14
            X.JZy r9 = r6.A0D
            r5 = 0
            r9.A09 = r5
            r9.A07()
            X.8Yv r8 = r6.A0M
            java.util.Map r0 = r8.A03
            int r2 = r14.A00
            java.lang.Object r1 = X.AbstractC166997dE.A0m(r0, r2)
            com.instagram.ui.widget.mediapicker.Folder r1 = (com.instagram.ui.widget.mediapicker.Folder) r1
            if (r1 != 0) goto L23
            java.lang.String r2 = "GalleryPickerView_error_folder_selection"
            java.lang.String r1 = "Folder is null"
            r0 = 0
            X.AbstractC12120kG.A0A(r2, r1, r0)
        L22:
            return
        L23:
            r6.A0I(r1)
            boolean r0 = r8.A0C(r2)
            r6.A0H(r1, r0)
            com.instagram.ui.widget.mediapicker.Folder r10 = r8.A01
            int r0 = r10.A02
            if (r0 != r2) goto L22
            r6.A0D()
            java.util.List r11 = r9.A0S
            java.lang.Object r12 = X.AbstractC001800i.A0J(r11)
            com.instagram.common.gallery.model.GalleryItem r12 = (com.instagram.common.gallery.model.GalleryItem) r12
            java.util.Set r0 = r10.A05
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L22
            boolean r0 = r9.A07
            if (r0 != 0) goto L22
            r4 = 1
            r6.A03 = r4
            boolean r0 = r14.A02
            if (r0 != 0) goto L93
            if (r12 == 0) goto L93
            boolean r0 = r6.A0L()
            if (r0 == 0) goto L93
            boolean r0 = r7.A1O
            if (r0 != 0) goto L93
            boolean r3 = r7.A1N
            if (r3 != 0) goto L70
            com.instagram.common.session.UserSession r13 = r7.A0z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36319463225695691(0x81085c00001dcb, double:3.031913018445229E-306)
            boolean r0 = X.C18U.A06(r2, r13, r0)
            if (r0 == 0) goto L93
        L70:
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r0 = r7.A0I
            if (r0 != 0) goto L77
            r7.DSA(r12, r5)
        L77:
            r6.A0K(r4, r3)
            if (r3 == 0) goto L8b
            int r0 = r11.size()
            if (r0 <= r4) goto L8b
            java.lang.Object r0 = r11.get(r4)
            com.instagram.common.gallery.model.GalleryItem r0 = (com.instagram.common.gallery.model.GalleryItem) r0
        L88:
            r9.EdU(r0, r4, r5)
        L8b:
            r6.A03 = r5
            r7.A0N = r4
            X.GestureDetectorOnGestureListenerC43829JZs.A0F(r7)
            return
        L93:
            com.instagram.common.session.UserSession r3 = r7.A0z
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36316645727670848(0x8105cc00081240, double:3.0301312213491647E-306)
            java.lang.Boolean r0 = X.AbstractC166997dE.A0c(r2, r3, r0)
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto Lb4
            java.util.List r0 = r10.A01()
            java.lang.Object r0 = r0.get(r5)
            com.instagram.common.gallery.Medium r0 = (com.instagram.common.gallery.Medium) r0
            r8.A0B(r0)
            goto L8b
        Lb4:
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A05()
            if (r0 == 0) goto L8b
            com.instagram.common.gallery.model.GalleryItem r0 = r9.A05()
            goto L88
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC43877Jah.run():void");
    }
}
