package X;

import android.widget.ImageView;
import com.facebook.R;

/* loaded from: classes9.dex */
public final class PHN implements InterfaceC150976qx {
    public final int A00;
    public final Object A01;

    public PHN(C56163OwV c56163OwV, int i) {
        this.A00 = i;
        this.A01 = c56163OwV;
    }

    @Override // X.InterfaceC150976qx
    public final void Dbl(AbstractC125325le abstractC125325le, float f) {
        ImageView A0C;
        int i;
        if (this.A00 != 0) {
            if (f == 0.0f && (A0C = MSW.A0C(((C56163OwV) this.A01).A09)) != null) {
                i = R.drawable.instagram_circle_x_pano_filled_24;
            } else {
                return;
            }
        } else if (f <= 0.8f || (A0C = MSW.A0C(((C56163OwV) this.A01).A09)) == null) {
            return;
        } else {
            i = R.drawable.instagram_heart_pano_outline_24;
        }
        A0C.setImageResource(i);
    }
}
