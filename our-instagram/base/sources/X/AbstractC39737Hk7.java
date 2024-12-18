package X;

import com.instagram.common.api.base.CacheBehaviorLogger;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hk7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39737Hk7 {
    public static Map A00(JMH jmh) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jmh.getDisplayName() != null) {
            A1I.put("display_name", jmh.getDisplayName());
        }
        if (jmh.getEmoji() != null) {
            A1I.put("emoji", jmh.getEmoji());
        }
        if (jmh.BEj() != null) {
            A1I.put("icon_asset_filled", jmh.BEj());
        }
        if (jmh.BEk() != null) {
            A1I.put("icon_asset_outline", jmh.BEk());
        }
        if (jmh.getName() != null) {
            AbstractC37300Gc1.A14(jmh.getName(), A1I);
        }
        if (jmh.Byf() != null) {
            A1I.put(CacheBehaviorLogger.SOURCE, jmh.Byf());
        }
        if (jmh.CEq() != null) {
            A1I.put("version", jmh.CEq());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
