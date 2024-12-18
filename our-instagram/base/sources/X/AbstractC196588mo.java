package X;

import java.util.HashMap;

/* renamed from: X.8mo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC196588mo {
    public static final void A00(InterfaceC178407wE interfaceC178407wE, Integer num, String str, int i) {
        String str2;
        C14360o3.A0B(interfaceC178407wE, 0);
        HashMap hashMap = new HashMap(1);
        switch (num.intValue()) {
            case 0:
                str2 = "PREVIEW_PHOTO";
                break;
            case 1:
                str2 = "PREVIEW_BITMAP";
                break;
            case 2:
                str2 = "NATIVE_VIEW_SIZE_PHOTO";
                break;
            case 3:
                str2 = "NATIVE_FULL_SIZE_FILE";
                break;
            default:
                str2 = "NATIVE_LOW_LIGHT_PHOTO";
                break;
        }
        hashMap.put("photo_capture_type", str2);
        interfaceC178407wE.Cia(i, "photo_capture_requested", str, hashMap);
    }
}
