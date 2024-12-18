package X;

import android.view.ViewTreeObserver;
import com.instagram.api.schemas.MediaCroppingCoordinatesIntf;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JgL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class ViewTreeObserverOnPreDrawListenerC44216JgL implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ MediaCroppingCoordinatesIntf A02;
    public final /* synthetic */ IgImageView A03;

    public ViewTreeObserverOnPreDrawListenerC44216JgL(MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf, IgImageView igImageView, int i, int i2) {
        this.A03 = igImageView;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = mediaCroppingCoordinatesIntf;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        IgImageView igImageView = this.A03;
        if (igImageView.getWidth() > 0) {
            int i = this.A01;
            int i2 = this.A00;
            MediaCroppingCoordinatesIntf mediaCroppingCoordinatesIntf = this.A02;
            float AtG = mediaCroppingCoordinatesIntf.AtG();
            float AtI = mediaCroppingCoordinatesIntf.AtI();
            float AtJ = mediaCroppingCoordinatesIntf.AtJ();
            if (AtG >= 0.0f && AtI >= 0.0f && AtJ >= 0.0f && AtI - AtG > 0.0f) {
                AbstractC44215JgK.A00(igImageView, AtG, AtI, AtJ, i, i2);
            }
            igImageView.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        return true;
    }
}
