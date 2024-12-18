package X;

import com.instagram.model.androidlink.AndroidLink;
import com.instagram.model.androidlink.AndroidLinkImpl;

/* renamed from: X.5Hm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC114965Hm {
    public static final EnumC906041v A01(AndroidLink androidLink) {
        C14360o3.A0B(androidLink, 0);
        Integer BNX = androidLink.BNX();
        if (BNX != null) {
            return (EnumC906041v) EnumC906041v.A01.get(BNX.intValue());
        }
        return null;
    }

    public static final AndroidLinkImpl A00(String str) {
        return new AndroidLinkImpl(null, null, null, null, null, null, Integer.valueOf(EnumC906041v.AD_DESTINATION_WEB.A00), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, str);
    }
}
