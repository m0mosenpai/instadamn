package com.facebook.smartcapture.logging;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class IdCaptureButton {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ IdCaptureButton[] $VALUES;
    public final String text;
    public static final IdCaptureButton DOWNLOAD_RETRY = new IdCaptureButton("DOWNLOAD_RETRY", 0, "download_retry");
    public static final IdCaptureButton RETAKE_PHOTO = new IdCaptureButton("RETAKE_PHOTO", 1, "retake_photo");
    public static final IdCaptureButton EXPAND_FULL_PHOTO = new IdCaptureButton("EXPAND_FULL_PHOTO", 2, "expand_full_photo");
    public static final IdCaptureButton CAPTURE_STEP_BACK_BUTTON = new IdCaptureButton("CAPTURE_STEP_BACK_BUTTON", 3, "capture_step_back_button");
    public static final IdCaptureButton SHOW_PHOTO_REQUIREMENTS = new IdCaptureButton("SHOW_PHOTO_REQUIREMENTS", 4, SelfieCaptureLoggingEvents.SHOW_PHOTO_REQUIREMENTS);
    public static final IdCaptureButton ONBOARDING_SKIP = new IdCaptureButton("ONBOARDING_SKIP", 5, SelfieCaptureLoggingEvents.ONBOARDING_SKIP);

    public static final /* synthetic */ IdCaptureButton[] $values() {
        return new IdCaptureButton[]{DOWNLOAD_RETRY, RETAKE_PHOTO, EXPAND_FULL_PHOTO, CAPTURE_STEP_BACK_BUTTON, SHOW_PHOTO_REQUIREMENTS, ONBOARDING_SKIP};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        IdCaptureButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static IdCaptureButton valueOf(String str) {
        return (IdCaptureButton) Enum.valueOf(IdCaptureButton.class, str);
    }

    public static IdCaptureButton[] values() {
        return (IdCaptureButton[]) $VALUES.clone();
    }

    public final String getText() {
        return this.text;
    }

    public IdCaptureButton(String str, int i, String str2) {
        this.text = str2;
    }
}
