package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes9.dex */
public final class OvU implements InterfaceC66482zP {
    public final SpannableStringBuilder A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;

    @Override // X.InterfaceC66482zP
    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    @Override // X.InterfaceC66492zQ
    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        OvU ovU = (OvU) obj;
        C14360o3.A0B(ovU, 0);
        if (AbstractC50102Ry.A00(this.A00, ovU.A00) && C14360o3.A0K(this.A01, ovU.A01)) {
            ImageUrl imageUrl = this.A02;
            ImageUrl imageUrl2 = ovU.A02;
            if (imageUrl == null) {
                if (imageUrl2 == null) {
                    return true;
                }
                return false;
            }
            if (imageUrl.equals(imageUrl2)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public OvU(SpannableStringBuilder spannableStringBuilder, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num) {
        this.A00 = spannableStringBuilder;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A03 = num;
    }
}
