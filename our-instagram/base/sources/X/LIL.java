package X;

import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.gallery.GalleryPreviewInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public final class LIL {
    public static final LIL A00 = new Object();

    public final void A01(EnumC114925Hg enumC114925Hg, UserSession userSession, List list, Map map, boolean z) {
        C14360o3.A0B(userSession, 0);
        boolean A1V = AbstractC167007dF.A1V(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryItem galleryItem = (GalleryItem) it.next();
            A00(enumC114925Hg, galleryItem, userSession, (GalleryPreviewInfo) map.get(galleryItem.A0A), z, A1V);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0074, code lost:
    
        if (r1 != null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A00(X.EnumC114925Hg r22, com.instagram.common.gallery.model.GalleryItem r23, com.instagram.common.session.UserSession r24, com.instagram.creation.capture.gallery.GalleryPreviewInfo r25, boolean r26, boolean r27) {
        /*
            r3 = r23
            r2 = r24
            X.AbstractC167017dG.A1N(r2, r3)
            com.instagram.common.gallery.Medium r5 = r3.A00
            if (r5 == 0) goto L71
            r0 = r25
            if (r25 == 0) goto L7f
            com.instagram.creation.base.CropInfo r1 = r0.A00
        L11:
            X.22C r0 = X.AnonymousClass229.A01(r2)
            X.24v r12 = r0.A0A
            boolean r0 = r3.A06()
            r21 = 1
            if (r0 == 0) goto L21
            r21 = 2
        L21:
            X.8hB r9 = X.EnumC193318hB.A04
            if (r1 == 0) goto L72
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L72
            int r3 = r0.width()
        L2d:
            android.graphics.Rect r0 = r1.A02
            if (r0 == 0) goto L77
            int r0 = r0.height()
        L35:
            int r4 = r1.A01
            int r6 = r1.A00
        L39:
            long r1 = r5.A01()
            java.lang.Long r18 = java.lang.Long.valueOf(r1)
            java.lang.String r7 = r5.A0X
            int r1 = r5.A03
            double r1 = (double) r1
            java.lang.Double r15 = X.AbstractC37302Gc3.A0S(r1)
            r19 = 0
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r27)
            X.9tY r8 = X.EnumC223419tY.OPEN_CAMERA
            com.instagram.common.gallery.metadata.MediaUploadMetadata r11 = r5.A0G
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r26)
            long r1 = r5.A0C
            java.lang.Integer r16 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r17 = java.lang.Integer.valueOf(r6)
            r26 = 0
            r10 = r22
            r20 = r7
            r22 = r3
            r23 = r0
            r24 = r1
            X.C449124v.A05(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)
        L71:
            return
        L72:
            int r3 = r5.A0B
            if (r1 == 0) goto L77
            goto L2d
        L77:
            int r0 = r5.A04
            if (r1 != 0) goto L35
            int r4 = r5.A0B
            r6 = r0
            goto L39
        L7f:
            r1 = 0
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIL.A00(X.5Hg, com.instagram.common.gallery.model.GalleryItem, com.instagram.common.session.UserSession, com.instagram.creation.capture.gallery.GalleryPreviewInfo, boolean, boolean):void");
    }
}
