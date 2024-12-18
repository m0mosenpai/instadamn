package X;

import com.instagram.api.schemas.MediaGiftCountVisibilityState;
import com.instagram.api.schemas.MediaGiftingState;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hpn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC40061Hpn {
    public static Map A00(JKO jko) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jko.B9r() != null) {
            MediaGiftCountVisibilityState B9r = jko.B9r();
            C14360o3.A0B(B9r, 0);
            A1I.put(AbstractC111324zv.A00(2430), B9r.A00);
        }
        if (jko.BQn() != null) {
            MediaGiftingState BQn = jko.BQn();
            C14360o3.A0B(BQn, 0);
            A1I.put("media_gifting_state", BQn.A00);
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
