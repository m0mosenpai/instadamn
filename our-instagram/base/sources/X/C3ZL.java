package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3ZL, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C3ZL {
    public static ImageUrl A00(Context context, ImageUrl imageUrl) {
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            if (url.endsWith("_8.jpg")) {
                int A0A = AbstractC13880nE.A0A(context);
                if (Math.abs(306 - A0A) < Math.abs(1080 - A0A)) {
                    return new SimpleImageUrl(url.replace("_8.jpg", "_6.jpg"));
                }
            }
        }
        return imageUrl;
    }

    public static ExtendedImageUrl A01(Integer num, List list, int i) {
        Integer num2;
        Integer num3;
        Iterator it = list.iterator();
        int i2 = Integer.MAX_VALUE;
        ExtendedImageUrl extendedImageUrl = null;
        while (it.hasNext()) {
            ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) it.next();
            int height = extendedImageUrl2.getHeight();
            int width = extendedImageUrl2.getWidth();
            if (height == width) {
                num3 = C05F.A0C;
            } else {
                num3 = C05F.A01;
            }
            if (num == C05F.A00 || num == num3) {
                int abs = Math.abs(((i / 20) + i) - width);
                if (abs < i2 || (extendedImageUrl != null && abs == i2 && width < extendedImageUrl.getWidth())) {
                    extendedImageUrl = extendedImageUrl2;
                    i2 = abs;
                }
            }
        }
        if (extendedImageUrl == null && num != (num2 = C05F.A00)) {
            return A01(num2, list, i);
        }
        return extendedImageUrl;
    }
}
