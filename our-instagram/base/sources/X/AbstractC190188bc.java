package X;

import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;

/* renamed from: X.8bc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC190188bc {
    public static final EnumC190198bd A00(CreationLayoutConfig creationLayoutConfig) {
        if (creationLayoutConfig == null) {
            return null;
        }
        if (creationLayoutConfig.CV5()) {
            return EnumC190198bd.FOOTER_BELOW_MEDIA;
        }
        if (creationLayoutConfig.BRK() > 0) {
            return EnumC190198bd.FOOTER_PINNED_IN_MEDIA_OVERLAPS_NAV_BAR;
        }
        return EnumC190198bd.FOOTER_PINNED_IN_MEDIA;
    }
}
