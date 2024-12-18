package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;

/* renamed from: X.Kkl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46668Kkl {
    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
            case 1:
                return "FILL_SCREEN";
            case 2:
                return "SQUARE_CROP";
            default:
                return "CLIP_TRANSFORM";
        }
    }
}
