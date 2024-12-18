package X;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* loaded from: classes8.dex */
public abstract class LHF {
    public static final L5J A00(View view, UserSession userSession) {
        C14360o3.A0B(userSession, 0);
        Integer num = C05F.A01;
        L5J l5j = new L5J(view, userSession, num, num);
        l5j.A06 = false;
        l5j.A05 = false;
        l5j.A07 = false;
        return l5j;
    }

    public static final void A02(InterfaceC11380iw interfaceC11380iw, ImageUrl imageUrl, C51622Yk c51622Yk, String str, int i, boolean z) {
        int i2 = 0;
        View contentView = c51622Yk.getContentView();
        if (contentView != null) {
            IgImageView A0T = AbstractC167007dF.A0T(contentView, R.id.reel_tagging_bubble_image);
            TextView A0N = AbstractC167007dF.A0N(contentView, R.id.reel_tagging_bubble_title);
            A0N.setText(str);
            if (z) {
                AbstractC166997dE.A0S(contentView, R.id.reel_tagging_bubble_subtitle).setVisibility(0);
            } else {
                A0N.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.reel_tagging_chevron, 0);
            }
            if (imageUrl != null) {
                A0T.setUrl(imageUrl, interfaceC11380iw);
                AbstractC31172DnG.A1E(contentView.getResources(), A0T, i);
            } else {
                i2 = 8;
            }
            A0T.setVisibility(i2);
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public static final void A01(View view, View view2, C51622Yk c51622Yk) {
        View[] viewArr;
        if (view != null && c51622Yk != null) {
            if (view2 instanceof TextureView) {
                viewArr = new View[]{view, view2};
            } else {
                viewArr = new View[]{view};
            }
            Paint paint = AbstractC47965LHl.A00;
            int length = viewArr.length;
            int i = 0;
            View view3 = viewArr[0];
            if (view3 != null) {
                Rect A0U = AbstractC166987dD.A0U();
                view3.getWindowVisibleDisplayFrame(A0U);
                Bitmap[] bitmapArr = new Bitmap[length];
                Bitmap A01 = AbstractC47965LHl.A01(A0U, bitmapArr, new Rect[length], viewArr, 15, 12);
                do {
                    Bitmap bitmap = bitmapArr[i];
                    if (bitmap != null && !bitmap.isRecycled()) {
                        bitmap.recycle();
                    }
                    i++;
                } while (i < length);
                if (A01 != null) {
                    c51622Yk.A01(A01, AbstractC13880nE.A0A(AbstractC166997dE.A0L(view)) / A01.getWidth());
                }
            }
        }
    }
}
