package X;

import com.instagram.mediakit.model.MediaKitSectionType;
import java.util.AbstractMap;

/* loaded from: classes9.dex */
public abstract class OPN {
    public static EnumC53360NjB A00(C51850Mvs c51850Mvs, AbstractMap abstractMap, int i) {
        abstractMap.put("section_id", c51850Mvs.A03);
        abstractMap.put("section_position", String.valueOf(i));
        return A01(c51850Mvs.A01);
    }

    public static final EnumC53360NjB A01(MediaKitSectionType mediaKitSectionType) {
        if (mediaKitSectionType != null) {
            int ordinal = mediaKitSectionType.ordinal();
            if (ordinal != 3) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 4) {
                            return EnumC53360NjB.TEXT;
                        }
                        return null;
                    }
                    return EnumC53360NjB.INSIGHTS;
                }
                return EnumC53360NjB.ACCOUNTS;
            }
            return EnumC53360NjB.MEDIA_POSTS;
        }
        return null;
    }
}
