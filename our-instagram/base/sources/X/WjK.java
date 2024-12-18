package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class WjK implements InterfaceC50420MOa {
    public final C45105JxZ A00;
    public final InterfaceC71949XCb A01;
    public final boolean A02;

    @Override // X.InterfaceC50420MOa
    public final C199928sw AEl(Context context) {
        String A0p;
        Drawable drawable;
        int i;
        C14360o3.A0B(context, 0);
        if (this.A02) {
            A0p = AbstractC166997dE.A0p(context, 2131960773);
            drawable = context.getDrawable(R.drawable.instagram_star_off_pano_outline_24);
            i = 1;
        } else {
            A0p = AbstractC166997dE.A0p(context, 2131960389);
            drawable = context.getDrawable(R.drawable.instagram_star_pano_outline_24);
            i = 2;
        }
        return new C199928sw(null, drawable, null, new C70939Wki(this, i), null, A0p, 0, 0, 0, false, false, false, true, false, false, false);
    }

    public WjK(C45105JxZ c45105JxZ, InterfaceC71949XCb interfaceC71949XCb, boolean z) {
        this.A00 = c45105JxZ;
        this.A02 = z;
        this.A01 = interfaceC71949XCb;
    }
}
