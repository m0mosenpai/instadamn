package X;

import android.content.Context;
import com.facebook.R;

/* renamed from: X.Vrv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69592Vrv {
    public int A00;
    public final int A01;
    public final int A02;
    public final XAo A03;

    public final void A00(InterfaceC56362iU interfaceC56362iU, int i) {
        int i2 = this.A01;
        if (i != -2) {
            if (i == -1) {
                i = i2;
            }
        } else {
            i = this.A02;
        }
        if (i >= i2) {
            interfaceC56362iU.ESl(i2);
            if (this.A00 != i) {
                this.A00 = i;
                this.A03.DKM();
                return;
            }
            return;
        }
        throw AbstractC31172DnG.A0u();
    }

    public C69592Vrv(Context context, XAo xAo) {
        this.A03 = xAo;
        this.A01 = C3HB.A00(context);
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.bio_product_sticker_width);
    }
}
