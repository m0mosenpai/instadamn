package X;

import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.M5c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49987M5c implements Runnable {
    public final /* synthetic */ CommentGiphyMediaInfo A00;
    public final /* synthetic */ CircularImageView A01;
    public final /* synthetic */ KDQ A02;

    public RunnableC49987M5c(CommentGiphyMediaInfo commentGiphyMediaInfo, CircularImageView circularImageView, KDQ kdq) {
        this.A01 = circularImageView;
        this.A02 = kdq;
        this.A00 = commentGiphyMediaInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CircularImageView circularImageView = this.A01;
        C74P A00 = AbstractC47851LBu.A00(circularImageView, this.A00, AbstractC166987dD.A0r(this.A02.A0U));
        if (A00 != null) {
            circularImageView.setImageDrawable(A00);
        }
    }
}
