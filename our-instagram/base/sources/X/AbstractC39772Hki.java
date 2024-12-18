package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hki, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39772Hki {
    public static Map A00(JLL jll) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        if (jll.AY2() != null) {
            A1I.put("account_id", jll.AY2());
        }
        if (jll.getFullName() != null) {
            A1I.put("full_name", jll.getFullName());
        }
        if (jll.getProfilePicUrl() != null) {
            A1I.put("profile_pic_url", jll.getProfilePicUrl());
        }
        if (jll.getUsername() != null) {
            A1I.put(AbstractC37309GcB.A01(), jll.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
