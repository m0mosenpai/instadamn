package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Ldo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48551Ldo implements InterfaceC58260Ps4 {
    public final float A00;
    public final RectF A01 = AbstractC166987dD.A0X();

    public C48551Ldo(float f) {
        this.A00 = f;
    }

    @Override // X.InterfaceC58260Ps4
    public final RectF Ahm(TouchImageView touchImageView) {
        float A07 = AbstractC166987dD.A07(touchImageView);
        float A08 = AbstractC166987dD.A08(touchImageView);
        float f = A07 / this.A00;
        RectF rectF = this.A01;
        float f2 = A08 / 2.0f;
        float f3 = f / 2.0f;
        rectF.set(0.0f, f2 - f3, A07, f2 + f3);
        return rectF;
    }
}
