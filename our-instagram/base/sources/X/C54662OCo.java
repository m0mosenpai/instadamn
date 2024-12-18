package X;

import android.graphics.Rect;
import android.graphics.RectF;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.OCo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54662OCo {
    public final Rect A00;
    public final RectF A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;

    public C54662OCo(Rect rect, ImageUrl imageUrl, String str, String str2) {
        this.A00 = rect;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = imageUrl;
        this.A01 = MX2.A07(rect, imageUrl.getWidth(), imageUrl.getHeight());
    }
}
