package X;

import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Kn4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46809Kn4 {
    public static final JWW A00(C910143t c910143t) {
        ExtendedImageUrl extendedImageUrl = c910143t.A0X;
        if (extendedImageUrl == null) {
            return null;
        }
        C38321qM A00 = AbstractC31409DrE.A00(extendedImageUrl, c910143t.A0Z, c910143t.A0r, c910143t.A0z, String.valueOf(c910143t.A0K));
        if (A00 == null) {
            return null;
        }
        return new JWW(A00);
    }
}
