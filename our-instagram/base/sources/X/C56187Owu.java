package X;

import android.graphics.RectF;
import com.instagram.common.ui.widget.touchimageview.TouchImageView;

/* renamed from: X.Owu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56187Owu implements InterfaceC58260Ps4 {
    public final RectF A00 = AbstractC166987dD.A0X();
    public final boolean A01;

    public C56187Owu(boolean z) {
        this.A01 = z;
    }

    @Override // X.InterfaceC58260Ps4
    public final RectF Ahm(TouchImageView touchImageView) {
        float f;
        float A07 = AbstractC166987dD.A07(touchImageView);
        float A08 = AbstractC166987dD.A08(touchImageView);
        float f2 = A07 / 3.0f;
        if (this.A01) {
            f = 1.3333334f * f2;
        } else {
            f = f2;
        }
        RectF rectF = this.A00;
        float f3 = A08 / 2.0f;
        float f4 = f / 2.0f;
        rectF.set(f2, f3 - f4, A07 - f2, f3 + f4);
        return rectF;
    }
}
