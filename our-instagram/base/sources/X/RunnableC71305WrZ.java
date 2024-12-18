package X;

import android.widget.ImageView;

/* renamed from: X.WrZ, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC71305WrZ implements Runnable {
    public final /* synthetic */ C70185WFo A00;

    public RunnableC71305WrZ(C70185WFo c70185WFo) {
        this.A00 = c70185WFo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C70185WFo c70185WFo = this.A00;
        ImageView imageView = c70185WFo.A02;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            ImageView imageView2 = c70185WFo.A02;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
                return;
            }
        }
        C14360o3.A0F("instructionImageView");
        throw C00O.createAndThrow();
    }
}
