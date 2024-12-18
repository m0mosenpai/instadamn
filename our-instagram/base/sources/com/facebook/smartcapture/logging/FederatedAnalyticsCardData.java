package com.facebook.smartcapture.logging;

import android.graphics.Point;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class FederatedAnalyticsCardData {
    public static final Companion Companion = new Object();
    public final String cardNumber;
    public final Point[] detectedCorners;
    public final String digitOcrResult;
    public final String expiryDate;
    public final boolean isFound;
    public final boolean isUserEdited;
    public final String mergedOcrResult;
    public final String name;
    public final String ocrResult;
    public final long processingTime;
    public final String sessionId;
    public final String textOcrResult;

    public static final FederatedAnalyticsCardData userEditedCardData(String str, String str2, String str3, String str4) {
        return Companion.userEditedCardData(str, str2, str3, str4);
    }

    /* loaded from: classes10.dex */
    public final class Companion {
        public final FederatedAnalyticsCardData userEditedCardData(String str, String str2, String str3, String str4) {
            return new FederatedAnalyticsCardData(str, true, str2, str3, str4, null, true, 0L, null, null, null, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final String getCardNumber() {
        return this.cardNumber;
    }

    public final Point[] getDetectedCorners() {
        return this.detectedCorners;
    }

    public final String getDigitOcrResult() {
        return this.digitOcrResult;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getMergedOcrResult() {
        return this.mergedOcrResult;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOcrResult() {
        return this.ocrResult;
    }

    public final long getProcessingTime() {
        return this.processingTime;
    }

    public final String getSessionId() {
        return this.sessionId;
    }

    public final String getTextOcrResult() {
        return this.textOcrResult;
    }

    public final boolean isFound() {
        return this.isFound;
    }

    public final boolean isUserEdited() {
        return this.isUserEdited;
    }

    public FederatedAnalyticsCardData(String str, boolean z, String str2, String str3, String str4, Point[] pointArr, boolean z2, long j, String str5, String str6, String str7, String str8) {
        this.sessionId = str;
        this.isFound = z;
        this.cardNumber = str2;
        this.expiryDate = str3;
        this.name = str4;
        this.detectedCorners = pointArr;
        this.isUserEdited = z2;
        this.processingTime = j;
        this.ocrResult = str5;
        this.digitOcrResult = str6;
        this.textOcrResult = str7;
        this.mergedOcrResult = str8;
    }
}
