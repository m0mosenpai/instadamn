package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Ows, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56185Ows implements InterfaceC58260Ps4 {
    public final RectF A00 = AbstractC166987dD.A0X();

    @Override // X.InterfaceC58260Ps4
    public final RectF Ahm(TouchImageView touchImageView) {
        int width = touchImageView.getWidth();
        int height = touchImageView.getHeight();
        RectF rectF = this.A00;
        int i = height / 2;
        int i2 = width / 2;
        rectF.set(0.0f, i - i2, width, i + i2);
        return rectF;
    }
}
