package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.instagram.common.ui.widget.imageview.TransitionCarouselImageView;
import com.instagram.creation.base.ui.degreelabel.PillDegreeLabelManager;
import com.instagram.creation.base.ui.filterview.FilterViewContainer;

/* renamed from: X.JjK, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class HandlerC44381JjK extends Handler {
    public final int A00;
    public final Object A01;

    public HandlerC44381JjK(PillDegreeLabelManager pillDegreeLabelManager) {
        this.A00 = 1;
        this.A01 = pillDegreeLabelManager;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.A00) {
            case 0:
                C14360o3.A0B(message, 0);
                TransitionCarouselImageView transitionCarouselImageView = (TransitionCarouselImageView) this.A01;
                if (!transitionCarouselImageView.isShown()) {
                    TransitionCarouselImageView.A03(transitionCarouselImageView);
                    return;
                } else {
                    if (message.what != 0) {
                        return;
                    }
                    if (transitionCarouselImageView.A0K) {
                        transitionCarouselImageView.A0H.start();
                    }
                    transitionCarouselImageView.A0G.start();
                    return;
                }
            case 1:
                if (message.what != 1) {
                    return;
                }
                PillDegreeLabelManager pillDegreeLabelManager = (PillDegreeLabelManager) this.A01;
                pillDegreeLabelManager.A01 = true;
                PillDegreeLabelManager.A04(pillDegreeLabelManager);
                return;
            case 2:
                C14360o3.A0B(message, 0);
                if (message.what != 0) {
                    return;
                }
                FilterViewContainer filterViewContainer = (FilterViewContainer) this.A01;
                if (filterViewContainer.A03 == null) {
                    return;
                }
                filterViewContainer.A06 = true;
                return;
            default:
                if (message.what == 1) {
                    C44272JhO c44272JhO = (C44272JhO) this.A01;
                    C44274JhQ c44274JhQ = c44272JhO.A06;
                    C44059Jdk c44059Jdk = c44274JhQ.A00;
                    c44059Jdk.getClass();
                    c44059Jdk.A02();
                    if (60000 - c44274JhQ.A01.A00() > 0 && c44272JhO.A01 == C05F.A01) {
                        c44272JhO.A03.sendEmptyMessageDelayed(1, 40L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC44381JjK(Looper looper, Object obj, int i) {
        super(looper);
        this.A00 = i;
        this.A01 = obj;
    }
}
