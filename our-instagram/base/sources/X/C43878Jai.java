package X;

import java.util.List;
import java.util.Map;

/* renamed from: X.Jai, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43878Jai {
    public Integer A01;
    public boolean A02;
    public final Map A04 = AbstractC166987dD.A1I();
    public final List A03 = AbstractC166987dD.A1E();
    public float A00 = 1.0f;

    public final void A00(int i, int i2) {
        List list = this.A03;
        if (i >= list.size()) {
            AbstractC12120kG.A07("GalleryPreviewInfoCache", AnonymousClass001.A02(i, list.size(), "Tried to update selected Index with oldIndex:", ", but selectedItemIds.size() is "), null);
        } else {
            list.add(i2, list.remove(i));
        }
    }
}
