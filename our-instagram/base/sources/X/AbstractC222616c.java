package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.16c, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC222616c {
    public static final void A01(AnonymousClass182 anonymousClass182, ImageUrl imageUrl) {
        C14360o3.A0B(imageUrl, 1);
        anonymousClass182.A0u(imageUrl.getUrl());
    }

    public static final SimpleImageUrl A00(C16L c16l) {
        String str = null;
        if (c16l.A11() == C16R.A0G) {
            return null;
        }
        try {
            str = c16l.A1P();
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        if (str == null || str.length() == 0) {
            str = "";
        }
        return new SimpleImageUrl(str);
    }
}
