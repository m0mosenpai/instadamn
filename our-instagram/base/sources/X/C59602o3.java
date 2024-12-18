package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2o3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C59602o3 {
    public final ImageUrl A00;
    public final boolean A01;
    public final boolean A02;

    public C59602o3(ImageUrl imageUrl, boolean z, boolean z2) {
        C14360o3.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A02 = z;
        this.A01 = z2;
    }

    public final String A00() {
        String str = ((ImageCacheKey) this.A00.AjX()).A03;
        C14360o3.A07(str);
        return str;
    }
}
