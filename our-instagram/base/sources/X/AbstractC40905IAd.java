package X;

import com.instagram.api.schemas.AudioFilterInfo;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.IAd, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40905IAd {
    public static final void A00(AnonymousClass182 anonymousClass182, List list) {
        anonymousClass182.A0c();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioFilterInfo audioFilterInfo = (AudioFilterInfo) it.next();
            anonymousClass182.A0d();
            anonymousClass182.A0S("filter_type", audioFilterInfo.A00.A00);
            anonymousClass182.A0a();
        }
        anonymousClass182.A0Z();
    }
}
