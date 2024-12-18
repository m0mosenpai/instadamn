package X;

import com.instagram.api.schemas.SoundPlatformProduct;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HkS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39756HkS {
    public static Map A00(JK8 jk8) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jk8.Ah2() != null) {
            A1I.put("body_text", jk8.Ah2());
        }
        if (jk8.Bya() != null) {
            SoundPlatformProduct Bya = jk8.Bya();
            C14360o3.A0B(Bya, 0);
            A1I.put("sound_platform_product", Bya.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
