package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.tigon.tigonhuc.HucClient;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.M5b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49986M5b implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ RoundedCornerImageView A01;
    public final /* synthetic */ KDQ A02;

    public RunnableC49986M5b(CommentGiphyMediaInfo commentGiphyMediaInfo, RoundedCornerImageView roundedCornerImageView, KDQ kdq) {
        this.A01 = roundedCornerImageView;
        this.A02 = kdq;
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float A04;
        float A042;
        RoundedCornerImageView roundedCornerImageView = this.A01;
        KDQ kdq = this.A02;
        UserSession A0r = AbstractC166987dD.A0r(kdq.A0U);
        CommentGiphyMediaInfo commentGiphyMediaInfo = this.A00;
        C74P A00 = AbstractC47851LBu.A00(roundedCornerImageView, commentGiphyMediaInfo, A0r);
        if (A00 != null) {
            Float A01 = AbstractC47851LBu.A01(commentGiphyMediaInfo);
            if (A01 != null) {
                float floatValue = A01.floatValue();
                ViewGroup.LayoutParams layoutParams = roundedCornerImageView.getLayoutParams();
                if (floatValue > 1.0f) {
                    layoutParams.width = AbstractC166987dD.A0C(kdq.requireContext(), 160);
                    A042 = AbstractC13880nE.A04(kdq.requireContext(), HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                } else {
                    Context requireContext = kdq.requireContext();
                    if (floatValue < 1.0f) {
                        A04 = AbstractC13880nE.A04(requireContext, HucClient.BODY_UPLOAD_TIMEOUT_SECONDS);
                    } else {
                        A04 = AbstractC13880nE.A04(requireContext, 160);
                    }
                    layoutParams.width = (int) A04;
                    A042 = AbstractC13880nE.A04(kdq.requireContext(), 160);
                }
                layoutParams.height = (int) A042;
                roundedCornerImageView.setLayoutParams(layoutParams);
            }
            roundedCornerImageView.setImageDrawable(A00);
        }
    }
}
