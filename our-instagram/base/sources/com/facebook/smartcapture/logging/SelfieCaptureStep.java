package com.facebook.smartcapture.logging;

import X.AbstractC12190kN;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class SelfieCaptureStep {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ SelfieCaptureStep[] $VALUES;
    public final String text;
    public static final SelfieCaptureStep INITIAL = new SelfieCaptureStep("INITIAL", 0, "initial");
    public static final SelfieCaptureStep ONBOARDING = new SelfieCaptureStep("ONBOARDING", 1, "onboarding");
    public static final SelfieCaptureStep PERMISSIONS = new SelfieCaptureStep("PERMISSIONS", 2, "permissions_granting");
    public static final SelfieCaptureStep CAPTURE = new SelfieCaptureStep("CAPTURE", 3, "capture");
    public static final SelfieCaptureStep INSTRUCTIONS = new SelfieCaptureStep("INSTRUCTIONS", 4, "instructions");
    public static final SelfieCaptureStep CONFIRMATION = new SelfieCaptureStep("CONFIRMATION", 5, "confirmation");
    public static final SelfieCaptureStep TIMEOUT = new SelfieCaptureStep("TIMEOUT", 6, PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT);

    public static final /* synthetic */ SelfieCaptureStep[] $values() {
        return new SelfieCaptureStep[]{INITIAL, ONBOARDING, PERMISSIONS, CAPTURE, INSTRUCTIONS, CONFIRMATION, TIMEOUT};
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    static {
        SelfieCaptureStep[] $values = $values();
        $VALUES = $values;
        $ENTRIES = AbstractC12190kN.A00($values);
    }

    public static SelfieCaptureStep valueOf(String str) {
        return (SelfieCaptureStep) Enum.valueOf(SelfieCaptureStep.class, str);
    }

    public static SelfieCaptureStep[] values() {
        return (SelfieCaptureStep[]) $VALUES.clone();
    }

    public final String getText() {
        return this.text;
    }

    public SelfieCaptureStep(String str, int i, String str2) {
        this.text = str2;
    }
}
