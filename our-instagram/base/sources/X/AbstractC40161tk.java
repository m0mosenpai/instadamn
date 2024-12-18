package X;

import android.content.Context;
import com.facebook.R;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageLoggingData;
import com.instagram.common.typedurl.directlogging.DirectImageLoggingData;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC40161tk {
    public static final ExtendedImageUrl A01(Context context, ImageInfo imageInfo) {
        C14360o3.A0B(context, 1);
        if (imageInfo == null) {
            return null;
        }
        return A04(imageInfo, C05F.A00, Math.min(AbstractC13880nE.A0A(context), 1080));
    }

    public static final ExtendedImageUrl A03(ImageInfo imageInfo, Integer num) {
        C14360o3.A0B(imageInfo, 0);
        Context context = AbstractC12290kX.A00;
        C14360o3.A07(context);
        int min = Math.min((AbstractC13880nE.A0A(context) - (context.getResources().getDimensionPixelSize(R.dimen.photo_grid_spacing) * 2)) / 3, 240);
        List AlQ = imageInfo.AlQ();
        if (AlQ == null) {
            AlQ = C16930sl.A00;
        }
        return C3ZL.A01(num, AlQ, min);
    }

    public static final ExtendedImageUrl A04(ImageInfo imageInfo, Integer num, int i) {
        C14360o3.A0B(imageInfo, 0);
        List AlQ = imageInfo.AlQ();
        if (AlQ == null) {
            AlQ = C16930sl.A00;
        }
        return C3ZL.A01(num, AlQ, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (X.AbstractC81033jX.A03(r0) != false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.instagram.model.mediasize.ImageInfo A05(com.instagram.model.mediasize.ImageInfo r3, java.util.List r4) {
        /*
            r2 = 1
            X.C14360o3.A0B(r4, r2)
            java.util.List r0 = r3.AlQ()
            if (r0 == 0) goto L17
            java.util.List r0 = r3.AlQ()
            r1 = 0
            if (r0 == 0) goto L29
            boolean r0 = r0.isEmpty()
            if (r0 != r2) goto L29
        L17:
            java.lang.String r1 = "ImageInfo"
            java.lang.String r0 = "ImageInfo must have at least 1 valid URL"
            X.C0w9.A03(r1, r0)
        L1e:
            X.IMD r0 = r3.AKm()
            r0.A03 = r4
            com.instagram.model.mediasize.ImageInfo r0 = r0.A00()
            return r0
        L29:
            java.util.List r0 = r3.AlQ()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r0.get(r1)
            com.instagram.common.typedurl.ImageUrlBase r0 = (com.instagram.common.typedurl.ImageUrlBase) r0
        L35:
            boolean r0 = X.AbstractC81033jX.A03(r0)
            if (r0 == 0) goto L1e
            goto L17
        L3c:
            r0 = 0
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC40161tk.A05(com.instagram.model.mediasize.ImageInfo, java.util.List):com.instagram.model.mediasize.ImageInfo");
    }

    public static final void A06(ImageLoggingData imageLoggingData, ImageInfo imageInfo, Boolean bool) {
        C14360o3.A0B(imageInfo, 0);
        List<ExtendedImageUrl> AlQ = imageInfo.AlQ();
        if (AlQ != null) {
            for (ExtendedImageUrl extendedImageUrl : AlQ) {
                extendedImageUrl.A00 = imageLoggingData;
                extendedImageUrl.A02 = bool;
            }
        }
    }

    public static final float A00(ImageInfo imageInfo) {
        List AlQ;
        ExtendedImageUrl extendedImageUrl;
        int height;
        if (imageInfo != null && (AlQ = imageInfo.AlQ()) != null && (extendedImageUrl = (ExtendedImageUrl) AbstractC001800i.A0O(AlQ, 0)) != null && (height = extendedImageUrl.getHeight()) != 0) {
            return extendedImageUrl.getWidth() / height;
        }
        return 1.0f;
    }

    public static final ExtendedImageUrl A02(ImageInfo imageInfo) {
        return A03(imageInfo, C05F.A01);
    }

    public static final boolean A08(UserSession userSession, ImageInfo imageInfo) {
        ExtendedImageUrl extendedImageUrl;
        List AlQ;
        if (imageInfo != null && (AlQ = imageInfo.AlQ()) != null) {
            extendedImageUrl = (ExtendedImageUrl) AbstractC001800i.A0J(AlQ);
        } else {
            extendedImageUrl = null;
        }
        if (extendedImageUrl == null) {
            return false;
        }
        long A01 = C18U.A01(C06090Tz.A05, userSession, 36611538182084895L);
        if (extendedImageUrl.getHeight() < A01 && extendedImageUrl.getWidth() < A01) {
            return false;
        }
        return true;
    }

    public static final void A07(DirectImageLoggingData directImageLoggingData, ImageInfo imageInfo) {
        List AlQ = imageInfo.AlQ();
        if (AlQ != null) {
            Iterator it = AlQ.iterator();
            while (it.hasNext()) {
                ImageLoggingData imageLoggingData = ((ExtendedImageUrl) it.next()).A00;
                if (imageLoggingData != null) {
                    ((PPRLoggingData) imageLoggingData).A00 = directImageLoggingData;
                }
            }
        }
    }
}
