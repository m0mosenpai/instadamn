package X;

import com.facebook.graphql.enums.EnumHelper;

/* renamed from: X.KdU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public enum EnumC46252KdU {
    UNSET_OR_UNRECOGNIZED_ENUM_VALUE("UNSET_OR_UNRECOGNIZED_ENUM_VALUE"),
    NOTE("NOTE"),
    STORY("STORY"),
    PROFILE("PROFILE"),
    CLIP("CLIP"),
    FEED("FEED"),
    LIVE("LIVE"),
    COMMENT("COMMENT"),
    LOCATION_SHARE("LOCATION_SHARE"),
    REELS_AUDIO("REELS_AUDIO"),
    MEDIA_NOTE("MEDIA_NOTE"),
    STORY_HIGHLIGHT("STORY_HIGHLIGHT"),
    SOCIAL_CONTEXT("SOCIAL_CONTEXT");

    public final String A00;

    public static EnumC46252KdU A00(String str) {
        return (EnumC46252KdU) EnumHelper.A00(str, UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }

    EnumC46252KdU(String str) {
        this.A00 = str;
    }
}
