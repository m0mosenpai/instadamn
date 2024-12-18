package X;

import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import java.util.Iterator;

/* renamed from: X.Vxr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69926Vxr {
    public static final WritableNativeArray A00(java.util.Set set) {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C65741TtG c65741TtG = (C65741TtG) it.next();
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("pk", Double.parseDouble(c65741TtG.A06().getId()));
            writableNativeMap.putBoolean("is_verified", c65741TtG.A06().isVerified());
            writableNativeMap.putBoolean("is_private", AbstractC167007dF.A1X(c65741TtG.A06().A0M(), C05F.A0C));
            writableNativeMap.putString(AbstractC65711Tsk.A01(22, 8, 113), c65741TtG.A06().getUsername());
            writableNativeMap.putString("full_name", c65741TtG.A06().getFullName());
            writableNativeMap.putString("profile_pic_url", c65741TtG.A06().Bhu().getUrl());
            writableNativeMap.putString("profile_pic_id", c65741TtG.A06().A03.getProfilePicId());
            writableNativeArray.pushMap(writableNativeMap);
        }
        return writableNativeArray;
    }
}
