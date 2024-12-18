package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.PQo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class RunnableC56998PQo implements Runnable {
    public final /* synthetic */ TouchImageView A00;
    public final /* synthetic */ AbstractC52139N5o A01;

    public RunnableC56998PQo(TouchImageView touchImageView, AbstractC52139N5o abstractC52139N5o) {
        this.A01 = abstractC52139N5o;
        this.A00 = touchImageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC52139N5o abstractC52139N5o = this.A01;
        RectF rectF = abstractC52139N5o.A00;
        if (rectF != null) {
            float f = 1.0f / (rectF.right - rectF.left);
            TouchImageView touchImageView = this.A00;
            RectF rectF2 = touchImageView.A0M;
            float width = rectF2.width() * f;
            float height = rectF2.height() * f;
            rectF2.right = rectF2.left + width;
            rectF2.bottom = rectF2.top + height;
            touchImageView.invalidate();
            RectF rectF3 = abstractC52139N5o.A00;
            if (rectF3 != null) {
                rectF2.offset(rectF2.width() * rectF3.left * (-1.0f), rectF2.height() * rectF3.top * (-1.0f));
                touchImageView.invalidate();
                return;
            }
        }
        C14360o3.A0F("cropRectF");
        throw C00O.createAndThrow();
    }
}
