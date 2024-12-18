package X;

import com.instagram.api.schemas.MediaType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hln, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39839Hln {
    public static Map A00(C5FH c5fh) {
        String str;
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c5fh.Aec() != null) {
            A1I.put("avatar_sticker_cdn_url", c5fh.Aec());
        }
        if (c5fh.Aee() != null) {
            A1I.put("avatar_sticker_ikid", c5fh.Aee());
        }
        if (c5fh.CBX() != null) {
            MediaType CBX = c5fh.CBX();
            if (CBX != null) {
                str = CBX.A00;
            } else {
                str = null;
            }
            AbstractC37300Gc1.A16(str, A1I);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
