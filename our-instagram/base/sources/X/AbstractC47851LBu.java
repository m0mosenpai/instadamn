package X;

import android.content.Context;
import android.view.View;
import com.facebook.R;
import com.instagram.api.schemas.CommentGiphyMediaFixedHeightImages;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.LBu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47851LBu {
    public static final C74P A00(View view, CommentGiphyMediaInfo commentGiphyMediaInfo, UserSession userSession) {
        CommentGiphyMediaImages commentGiphyMediaImages;
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages;
        Float f;
        Float f2;
        C74V A00;
        AbstractC167007dF.A1K(view, userSession);
        String str = commentGiphyMediaInfo.A03;
        if (str != null && (commentGiphyMediaImages = commentGiphyMediaInfo.A01) != null && (commentGiphyMediaFixedHeightImages = commentGiphyMediaImages.A00) != null) {
            String url = commentGiphyMediaFixedHeightImages.getUrl();
            String CHQ = commentGiphyMediaFixedHeightImages.CHQ();
            if (commentGiphyMediaFixedHeightImages.CHg() != null) {
                f = Float.valueOf(r0.intValue());
            } else {
                f = null;
            }
            if (commentGiphyMediaFixedHeightImages.BDS() != null) {
                f2 = Float.valueOf(r0.intValue());
            } else {
                f2 = null;
            }
            if (url != null && f != null && f2 != null) {
                float floatValue = f.floatValue();
                float floatValue2 = f2.floatValue();
                GifUrlImpl gifUrlImpl = new GifUrlImpl(url, CHQ, floatValue, floatValue2);
                float f3 = floatValue;
                if (floatValue > floatValue2) {
                    f3 = floatValue2;
                }
                Context A0L = AbstractC166997dE.A0L(view);
                float A002 = AbstractC13690mv.A00(A0L, 1.0f);
                float f4 = floatValue / floatValue2;
                int A01 = AbstractC13690mv.A01(A0L, (int) f3);
                float f5 = A01;
                if (f4 < 1.0f) {
                    A00 = C74U.A00(f4, (int) (f5 * f4), A01, -1);
                } else {
                    A00 = C74U.A00(f4, A01, (int) (f5 / f4), -1);
                }
                return new C74P(A0L, userSession, A00, gifUrlImpl, (GifUrlImpl) null, C05F.A00, str, A002, AbstractC167007dF.A09(A0L, R.attr.stickerLoadingStartColor), AbstractC167007dF.A09(A0L, R.attr.stickerLoadingEndColor), false);
            }
        }
        return null;
    }

    public static final Float A01(CommentGiphyMediaInfo commentGiphyMediaInfo) {
        CommentGiphyMediaFixedHeightImages commentGiphyMediaFixedHeightImages;
        Float f;
        Float f2;
        CommentGiphyMediaImages commentGiphyMediaImages = commentGiphyMediaInfo.A01;
        if (commentGiphyMediaImages != null && (commentGiphyMediaFixedHeightImages = commentGiphyMediaImages.A00) != null) {
            if (commentGiphyMediaFixedHeightImages.CHg() != null) {
                f = Float.valueOf(r0.intValue());
            } else {
                f = null;
            }
            if (commentGiphyMediaFixedHeightImages.BDS() != null) {
                f2 = Float.valueOf(r0.intValue());
            } else {
                f2 = null;
            }
            if (f != null && f2 != null) {
                return Float.valueOf(f.floatValue() / f2.floatValue());
            }
        }
        return null;
    }
}
