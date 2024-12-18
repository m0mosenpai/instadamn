package com.facebook.smartcapture.docauth;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CaptureState {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CaptureState[] $VALUES;
    public final String text;
    public static final CaptureState INITIAL = new CaptureState("INITIAL", 0, "initial");
    public static final CaptureState DOWNLOADING_DEPS = new CaptureState("DOWNLOADING_DEPS", 1, "downloading_deps");
    public static final CaptureState DOWNLOAD_FAILED = new CaptureState("DOWNLOAD_FAILED", 2, "download_failed");
    public static final CaptureState ID_TYPE_DETECTION = new CaptureState("ID_TYPE_DETECTION", 3, "looking_for_id");
    public static final CaptureState ID_FOUND = new CaptureState("ID_FOUND", 4, "id_found");
    public static final CaptureState BLUR_DETECTED = new CaptureState("BLUR_DETECTED", 5, "blur_detected");
    public static final CaptureState GLARE_DETECTED = new CaptureState("GLARE_DETECTED", 6, "glare_detected");
    public static final CaptureState MANUAL_CAPTURE = new CaptureState("MANUAL_CAPTURE", 7, "manual_capture");
    public static final CaptureState HOLDING_STEADY = new CaptureState("HOLDING_STEADY", 8, "holding_steady");
    public static final CaptureState SCANNING_CREDIT_CARD = new CaptureState("SCANNING_CREDIT_CARD", 9, "scanning_credit_card");
    public static final CaptureState CREDIT_CARD_SCANNED = new CaptureState("CREDIT_CARD_SCANNED", 10, "credit_card_scanned");
    public static final CaptureState CAPTURING_AUTOMATIC = new CaptureState("CAPTURING_AUTOMATIC", 11, "capturing_automatic");
    public static final CaptureState CAPTURING_MANUAL = new CaptureState("CAPTURING_MANUAL", 12, "capturing_manual");

    public static final /* synthetic */ CaptureState[] $values() {
        return new CaptureState[]{INITIAL, DOWNLOADING_DEPS, DOWNLOAD_FAILED, ID_TYPE_DETECTION, ID_FOUND, BLUR_DETECTED, GLARE_DETECTED, MANUAL_CAPTURE, HOLDING_STEADY, SCANNING_CREDIT_CARD, CREDIT_CARD_SCANNED, CAPTURING_AUTOMATIC, CAPTURING_MANUAL};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        CaptureState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static CaptureState valueOf(String str) {
        return (CaptureState) Enum.valueOf(CaptureState.class, str);
    }

    public static CaptureState[] values() {
        return (CaptureState[]) $VALUES.clone();
    }

    public final String getText() {
        return this.text;
    }

    public CaptureState(String str, int i, String str2) {
        this.text = str2;
    }
}
