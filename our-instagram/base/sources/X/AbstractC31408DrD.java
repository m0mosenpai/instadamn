package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.DrD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class AbstractC31408DrD {
    public static Map A00(C52Z c52z) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (c52z.AqO() != null) {
            A1I.put("connected_user_id", c52z.AqO());
        }
        if (c52z.BAz() != null) {
            A1I.put("harm_type", c52z.BAz());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
