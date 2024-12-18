package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: X.9Kb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C208429Kb {
    public static final C208429Kb A00 = new Object();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(com.instagram.common.gallery.Medium r5, com.instagram.common.session.UserSession r6, X.C177937vS r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L51
            X.2iX r0 = r7.A0B
            if (r0 == 0) goto L51
            android.view.View r0 = r0.getView()
            r3 = 2
            if (r0 == 0) goto L51
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L51
            X.22C r0 = X.AnonymousClass229.A01(r6)
            X.5Hg r4 = r0.A0J()
            if (r4 == 0) goto L58
            int r1 = r4.ordinal()
            r0 = 3
            if (r1 == r3) goto L55
            if (r1 == r0) goto L52
            r0 = 8
            if (r1 != r0) goto L58
            r3 = r2
        L2c:
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r5.A0G
            java.lang.String r1 = r0.A03
            X.0sl r0 = X.C16930sl.A00
            X.9vG r0 = X.AbstractC178007vZ.A01(r6, r1, r0)
            if (r0 == 0) goto L3c
            com.instagram.api.schemas.WearablesAppAttributionType r2 = r0.A01()
        L3c:
            X.5Hg r0 = X.EnumC114925Hg.DIRECT_THREAD
            if (r4 != r0) goto L46
            boolean r0 = X.F28.A00(r6)
            if (r0 != 0) goto L51
        L46:
            X.C8i r1 = X.C8i.GALLERY_WEARABLES_ICON_IMPRESSION
            int r0 = r5.A05
            java.lang.String r0 = java.lang.String.valueOf(r0)
            X.CZH.A01(r1, r2, r6, r0, r3)
        L51:
            return
        L52:
            java.lang.String r3 = "reels_gallery"
            goto L2c
        L55:
            java.lang.String r3 = "story_gallery"
            goto L2c
        L58:
            java.lang.String r3 = java.lang.String.valueOf(r4)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C208429Kb.A02(com.instagram.common.gallery.Medium, com.instagram.common.session.UserSession, X.7vS):void");
    }

    public static final Bitmap A00(C177977vW c177977vW) {
        BitmapDrawable bitmapDrawable;
        Drawable drawable = c177977vW.A03.A07.getDrawable();
        if (!(drawable instanceof BitmapDrawable) || (bitmapDrawable = (BitmapDrawable) drawable) == null) {
            return null;
        }
        return bitmapDrawable.getBitmap();
    }

    public static final void A01(C206279Bk c206279Bk, C193528hX c193528hX, C177977vW c177977vW) {
        boolean z = false;
        if (c206279Bk.A02 == C05F.A01) {
            z = true;
            C206019Ah.A02(c206279Bk, c177977vW.A03);
        }
        if (c193528hX != null) {
            C45127Jxw c45127Jxw = c177977vW.A03.A03;
            if (c45127Jxw != null) {
                Object obj = c45127Jxw.A00;
                C14360o3.A0B(obj, 0);
                if (c193528hX.A00) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = c193528hX.A01;
                    if (concurrentLinkedQueue.size() < 12) {
                        concurrentLinkedQueue.add(obj);
                    }
                }
            } else {
                return;
            }
        } else if (!z) {
            return;
        }
        c177977vW.A03.A03 = null;
    }

    public static final void A03(Medium medium, C177937vS c177937vS, C177977vW c177977vW, InterfaceC195388ke interfaceC195388ke, boolean z) {
        BBC bbc;
        GalleryItem.LocalGalleryMedium A0d = AbstractC167017dG.A0d(medium);
        Bitmap A002 = A00(c177977vW);
        if (A002 != null && AbstractC188868Yc.A05(c177977vW.A03.A07, medium)) {
            if (z) {
                c177937vS.A03 = true;
            }
            bbc = new C9NP(A002);
        } else {
            bbc = AiD.A00;
        }
        interfaceC195388ke.DNu(A0d, bbc, c177977vW.getAbsoluteAdapterPosition(), z);
    }

    public static final void A04(Medium medium, C177977vW c177977vW, InterfaceC195388ke interfaceC195388ke) {
        BBC bbc;
        GalleryItem.LocalGalleryMedium A0d = AbstractC167017dG.A0d(medium);
        Bitmap A002 = A00(c177977vW);
        if (A002 != null && AbstractC188868Yc.A05(c177977vW.A03.A07, medium)) {
            bbc = new C9NP(A002);
        } else {
            bbc = AiD.A00;
        }
        interfaceC195388ke.DNQ(A0d, bbc, c177977vW.getAbsoluteAdapterPosition());
    }
}
