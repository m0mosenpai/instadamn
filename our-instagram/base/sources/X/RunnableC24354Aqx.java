package X;

import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.Aqx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24354Aqx implements Runnable {
    public final /* synthetic */ C184528Gs A00;

    public RunnableC24354Aqx(C184528Gs c184528Gs) {
        this.A00 = c184528Gs;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C184528Gs c184528Gs = this.A00;
        TextureView textureView = c184528Gs.A0D;
        final int width = textureView.getWidth();
        final int height = textureView.getHeight();
        if (c184528Gs.A04 == null) {
            c184528Gs.A04 = new ColorDrawable() { // from class: X.9Rb
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicHeight() {
                    return height;
                }

                @Override // android.graphics.drawable.Drawable
                public final int getIntrinsicWidth() {
                    return width;
                }
            };
            Rect A0U = AbstractC166987dD.A0U();
            RoundedCornerFrameLayout roundedCornerFrameLayout = c184528Gs.A0N;
            roundedCornerFrameLayout.getDrawingRect(A0U);
            AbstractC124845kp.A01(roundedCornerFrameLayout).offsetDescendantRectToMyCoords(roundedCornerFrameLayout, A0U);
            C221619qQ c221619qQ = new C221619qQ(A0U);
            c184528Gs.A07 = c221619qQ;
            C8FC c8fc = new C8FC((C8D0) c221619qQ, (C8FD) null, c184528Gs.A0M, C05F.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 0.07f, 1.75f, -1.0f, -1.0f, -1.0f, 0, false, false, true, false, true, false, true, true, true, true, true, true, false, false);
            Drawable drawable = c184528Gs.A04;
            if (drawable != null) {
                c184528Gs.A0J.A0h(drawable, c184528Gs.A0E, c8fc, null, AbstractC166987dD.A1J(""));
            }
            c184528Gs.A02();
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = c184528Gs.A0N;
        roundedCornerFrameLayout2.setVisibility(0);
        if (!(c184528Gs.A0H.A08.A00 instanceof C81V)) {
            textureView.setVisibility(0);
        } else {
            roundedCornerFrameLayout2.setScaleX(c184528Gs.A03);
            roundedCornerFrameLayout2.setScaleY(c184528Gs.A03);
            C184528Gs.A00(c184528Gs);
        }
        AbstractC125325le A01 = AbstractC125325le.A01(roundedCornerFrameLayout2, 0);
        A01.A0G();
        A01.A0I(1.0f);
        A01.A0H();
    }
}
