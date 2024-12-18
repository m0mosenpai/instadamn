package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.VideoVersion;
import java.util.Collections;
import java.util.List;

/* renamed from: X.DrE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC31409DrE {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.1rE, java.lang.Object] */
    public static final C38321qM A00(ImageUrl imageUrl, GifUrlImpl gifUrlImpl, Long l, String str, String str2) {
        Integer num;
        EnumC40111tc enumC40111tc;
        ?? obj = new Object();
        obj.A5j = str2;
        obj.A6M = str;
        if (str != null) {
            num = 1;
        } else {
            num = null;
        }
        obj.A4j = num;
        if (imageUrl != null) {
            List singletonList = Collections.singletonList(new ExtendedImageUrl(imageUrl));
            C14360o3.A07(singletonList);
            obj.EW3(new ImageInfoImpl(null, null, null, singletonList, null));
            obj.A4n = Integer.valueOf(imageUrl.getHeight());
            obj.A4o = Integer.valueOf(imageUrl.getWidth());
        }
        if (gifUrlImpl != null) {
            List singletonList2 = Collections.singletonList(new VideoVersion(null, Integer.valueOf((int) gifUrlImpl.A02.floatValue()), null, Integer.valueOf((int) gifUrlImpl.A03.floatValue()), null, null, gifUrlImpl.A09));
            C14360o3.A07(singletonList2);
            obj.Eh0(singletonList2);
        }
        obj.A56 = l;
        if (gifUrlImpl != null) {
            enumC40111tc = EnumC40111tc.A0a;
        } else {
            enumC40111tc = EnumC40111tc.A0Q;
        }
        obj.A4m = Integer.valueOf(enumC40111tc.A00);
        C38801rC c38801rC = C38321qM.A0h;
        return C38801rC.A02(obj);
    }
}
