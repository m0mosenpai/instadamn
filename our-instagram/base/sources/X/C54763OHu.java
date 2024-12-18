package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import java.util.Map;

/* renamed from: X.OHu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C54763OHu {
    public Map A00 = AbstractC166987dD.A1G();
    public Map A01 = AbstractC166987dD.A1G();

    public final void A00(C5L6 c5l6, SurfaceCropFilter surfaceCropFilter, String str) {
        Map map = this.A01;
        if (map.containsKey(str) && ((Map) map.get(str)).containsKey(c5l6)) {
            return;
        }
        if (!map.containsKey(str)) {
            map.put(str, AbstractC166987dD.A1G());
        }
        Map map2 = (Map) map.get(str);
        if (map2 == null) {
            return;
        }
        map2.put(c5l6, Float.valueOf(surfaceCropFilter.A00.A06.A06));
    }
}
