package com.facebook.smartcapture.logging;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class AuthenticityUploadMedium {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ AuthenticityUploadMedium[] $VALUES;
    public final String value;
    public static final AuthenticityUploadMedium SC_V2_AUTO = new AuthenticityUploadMedium("SC_V2_AUTO", 0, "SC_V2_AUTO");
    public static final AuthenticityUploadMedium CAMERA_MANUAL = new AuthenticityUploadMedium("CAMERA_MANUAL", 1, "CAMERA_MANUAL");
    public static final AuthenticityUploadMedium IMAGE_PICKER = new AuthenticityUploadMedium("IMAGE_PICKER", 2, "IMAGE_PICKER");
    public static final AuthenticityUploadMedium SELFIE_VIDEO_NATIVE = new AuthenticityUploadMedium("SELFIE_VIDEO_NATIVE", 3, "SELFIE_VIDEO_NATIVE");
    public static final AuthenticityUploadMedium SELFIE_PHOTO_NATIVE = new AuthenticityUploadMedium("SELFIE_PHOTO_NATIVE", 4, "SELFIE_PHOTO_NATIVE");
    public static final AuthenticityUploadMedium UNKNOWN = new AuthenticityUploadMedium("UNKNOWN", 5, "UNKNOWN");

    public static final /* synthetic */ AuthenticityUploadMedium[] $values() {
        return new AuthenticityUploadMedium[]{SC_V2_AUTO, CAMERA_MANUAL, IMAGE_PICKER, SELFIE_VIDEO_NATIVE, SELFIE_PHOTO_NATIVE, UNKNOWN};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        AuthenticityUploadMedium[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static AuthenticityUploadMedium valueOf(String str) {
        return (AuthenticityUploadMedium) Enum.valueOf(AuthenticityUploadMedium.class, str);
    }

    public static AuthenticityUploadMedium[] values() {
        return (AuthenticityUploadMedium[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public AuthenticityUploadMedium(String str, int i, String str2) {
        this.value = str2;
    }
}
