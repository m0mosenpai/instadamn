package X;

import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class M7X implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ExtendedImageUrl extendedImageUrl = (ExtendedImageUrl) obj2;
        ExtendedImageUrl extendedImageUrl2 = (ExtendedImageUrl) obj;
        return C2BS.A00(Integer.valueOf(extendedImageUrl.getWidth() * extendedImageUrl.getHeight()), Integer.valueOf(extendedImageUrl2.getWidth() * extendedImageUrl2.getHeight()));
    }
}
