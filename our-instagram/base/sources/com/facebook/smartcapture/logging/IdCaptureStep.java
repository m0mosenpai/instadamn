package com.facebook.smartcapture.logging;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class IdCaptureStep {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ IdCaptureStep[] $VALUES;
    public final String text;
    public static final IdCaptureStep INITIAL = new IdCaptureStep("INITIAL", 0, "initial");
    public static final IdCaptureStep ONBOARDING = new IdCaptureStep("ONBOARDING", 1, "onboarding");
    public static final IdCaptureStep PERMISSIONS = new IdCaptureStep("PERMISSIONS", 2, "permissions_granting");
    public static final IdCaptureStep CHOOSE_DOC_TYPE = new IdCaptureStep("CHOOSE_DOC_TYPE", 3, "id_type_selection");
    public static final IdCaptureStep FIRST_PHOTO_CAPTURE = new IdCaptureStep("FIRST_PHOTO_CAPTURE", 4, "first_photo_capture");
    public static final IdCaptureStep FIRST_PHOTO_CONFIRMATION = new IdCaptureStep("FIRST_PHOTO_CONFIRMATION", 5, "first_photo_confirmation");
    public static final IdCaptureStep SECOND_PHOTO_CAPTURE = new IdCaptureStep("SECOND_PHOTO_CAPTURE", 6, "second_photo_capture");
    public static final IdCaptureStep SECOND_PHOTO_CONFIRMATION = new IdCaptureStep("SECOND_PHOTO_CONFIRMATION", 7, "second_photo_confirmation");

    public static final /* synthetic */ IdCaptureStep[] $values() {
        return new IdCaptureStep[]{INITIAL, ONBOARDING, PERMISSIONS, CHOOSE_DOC_TYPE, FIRST_PHOTO_CAPTURE, FIRST_PHOTO_CONFIRMATION, SECOND_PHOTO_CAPTURE, SECOND_PHOTO_CONFIRMATION};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        IdCaptureStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static IdCaptureStep valueOf(String str) {
        return (IdCaptureStep) Enum.valueOf(IdCaptureStep.class, str);
    }

    public static IdCaptureStep[] values() {
        return (IdCaptureStep[]) $VALUES.clone();
    }

    public final String getText() {
        return this.text;
    }

    public IdCaptureStep(String str, int i, String str2) {
        this.text = str2;
    }
}
