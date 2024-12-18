package com.facebook.smartcapture.logging;

import X.AbstractC12190kN;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class CancelReason {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ CancelReason[] $VALUES;
    public final String reason;
    public static final CancelReason SYSTEM_BACK_BUTTON = new CancelReason("SYSTEM_BACK_BUTTON", 0, "system_back_button");
    public static final CancelReason CAPTURE_STEP_BACK_BUTTON = new CancelReason("CAPTURE_STEP_BACK_BUTTON", 1, "capture_step_back_button");
    public static final CancelReason ENCRYPTION_FAILURE = new CancelReason("ENCRYPTION_FAILURE", 2, "encryption_failure");
    public static final CancelReason PHOTO_SAVE_FAILURE = new CancelReason("PHOTO_SAVE_FAILURE", 3, "photo_save_failure");

    public static final /* synthetic */ CancelReason[] $values() {
        return new CancelReason[]{SYSTEM_BACK_BUTTON, CAPTURE_STEP_BACK_BUTTON, ENCRYPTION_FAILURE, PHOTO_SAVE_FAILURE};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        CancelReason[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static CancelReason valueOf(String str) {
        return (CancelReason) Enum.valueOf(CancelReason.class, str);
    }

    public static CancelReason[] values() {
        return (CancelReason[]) $VALUES.clone();
    }

    public final String getReason() {
        return this.reason;
    }

    public CancelReason(String str, int i, String str2) {
        this.reason = str2;
    }
}
