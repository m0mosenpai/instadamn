package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3jX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC81033jX {
    public static final SimpleImageUrl A01(File file) {
        return A02(file, -1, -1);
    }

    public static final boolean A05(List list) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (A03((ImageUrl) it.next())) {
                }
            }
            return false;
        }
        return true;
    }

    public static final boolean A03(ImageUrl imageUrl) {
        String url;
        if (imageUrl != null && (url = imageUrl.getUrl()) != null && url.length() != 0) {
            return false;
        }
        return true;
    }

    public static final SimpleImageUrl A00(android.net.Uri uri, int i, int i2) {
        return new SimpleImageUrl(uri.toString(), i, i2);
    }

    public static final SimpleImageUrl A02(File file, int i, int i2) {
        android.net.Uri fromFile = android.net.Uri.fromFile(file);
        C14360o3.A07(fromFile);
        return A00(fromFile, i, i2);
    }

    public static final boolean A04(String str) {
        if (AbstractC08820cl.A03(str).isOpaque() && !AbstractC002300n.A0h(str, "data:image/jpeg;base64,", false)) {
            return false;
        }
        return true;
    }
}
