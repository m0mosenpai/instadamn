package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Hmj, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class AbstractC39896Hmj {
    public static Map A00(InterfaceC1118052h interfaceC1118052h) {
        LinkedHashMap A1I = AbstractC166987dD.A1I();
        interfaceC1118052h.isVerified();
        A1I.put("is_verified", Boolean.valueOf(interfaceC1118052h.isVerified()));
        if (interfaceC1118052h.getProfilePicUrl() != null) {
            A1I.put("profile_pic_url", interfaceC1118052h.getProfilePicUrl());
        }
        if (interfaceC1118052h.getUsername() != null) {
            A1I.put(AbstractC37310GcC.A00(), interfaceC1118052h.getUsername());
        }
        return AbstractC06930Yk.A0B(A1I);
    }
}
