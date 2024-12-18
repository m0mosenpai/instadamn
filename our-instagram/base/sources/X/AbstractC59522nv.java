package X;

import com.instagram.common.typedurl.ExpirableImageUrl;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2nv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC59522nv {
    public static final ImageUrl A00(ImageUrl imageUrl) {
        if (imageUrl instanceof ExpirableImageUrl) {
            InterfaceC224217b A00 = C3WL.A00((InterfaceC224217b) imageUrl);
            C14360o3.A0A(A00);
            return (ImageUrl) A00;
        }
        return imageUrl;
    }
}
