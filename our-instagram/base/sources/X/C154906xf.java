package X;

import com.instagram.api.schemas.MerchantCheckoutStyle;
import com.instagram.user.model.User;

/* renamed from: X.6xf, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C154906xf {
    public final MerchantCheckoutStyle A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public C154906xf(MerchantCheckoutStyle merchantCheckoutStyle, String str, String str2, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = merchantCheckoutStyle;
    }

    public final boolean A00(User user) {
        if (C14360o3.A0K(user.getId(), this.A01) && C14360o3.A0K(user.getUsername(), this.A02) && user.A1M() == this.A03 && user.A03.BSX() == this.A00) {
            return false;
        }
        return true;
    }
}
