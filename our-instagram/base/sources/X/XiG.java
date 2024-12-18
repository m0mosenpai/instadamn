package X;

import com.facebook.common.dextricks.JITProfilePQR;
import com.instagram.react.modules.base.IgReactQEModule;

/* loaded from: classes12.dex */
public abstract class XiG {
    public static final EnumC72420XdQ A00(Integer num) {
        switch (num.intValue()) {
            case 2:
                return EnumC72420XdQ.POST_IS_RESHARE_FROM_THREADS;
            case 3:
                return EnumC72420XdQ.POST_WITH_PAID_PARTNERSHIP;
            case 4:
                return EnumC72420XdQ.POST_CAPTION_LIMIT;
            case 5:
                return EnumC72420XdQ.POST_AUDIENCE_CLOSE_FRIENDS;
            case 6:
                return EnumC72420XdQ.POST_IS_OPEN_CAROUSEL;
            case 7:
                return EnumC72420XdQ.POST_DIRECT_TO_PROFILE;
            case 8:
                return EnumC72420XdQ.POST_HAS_POLL;
            case 9:
                return EnumC72420XdQ.POST_WITH_FLIPSIDE;
            case 10:
                return EnumC72420XdQ.POST_WITH_FUNDRAISER;
            case 11:
                return EnumC72420XdQ.POST_CONTAIN_VIDEO;
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
                return EnumC72420XdQ.MORE_THAN_TEN_CAROUSEL_ITEMS;
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
                return EnumC72420XdQ.POST_WITH_EVENT_REMINDER;
            case 14:
                return EnumC72420XdQ.POST_WITH_SCHEDULE;
            default:
                return EnumC72420XdQ.UNKNOWN;
        }
    }
}
