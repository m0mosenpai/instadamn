package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import java.util.List;

/* loaded from: classes9.dex */
public final class ODx {
    public final long A00;
    public final ImageUrl A01;
    public final ImageInfo A02;
    public final Integer A03;
    public final String A04;
    public final List A05;

    public ODx(ImageUrl imageUrl, ImageInfo imageInfo, Integer num, String str, List list, long j) {
        MSZ.A1O(str, num);
        this.A04 = str;
        this.A00 = j;
        this.A05 = list;
        this.A03 = num;
        this.A01 = imageUrl;
        this.A02 = imageInfo;
    }
}
