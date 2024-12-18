package com.facebook.smartcapture.docauth;

import X.AbstractC58318PtA;
import X.C14360o3;
import android.graphics.Point;
import com.facebook.smartcapture.diagnostic.DiagnosticInfo;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class DocAuthResult {
    public final boolean _hasGlare;
    public final CreditCardScannerResult creditCardScannerResult;
    public final Point[] detectedCorners;
    public final DiagnosticInfo diagnosticInfo;
    public final DocumentType documentType;
    public final boolean isAligned;
    public final boolean isBlurry;
    public final boolean isFound;
    public final boolean isMinWidthCoveragePassed;
    public final float widthToHeightRatio;

    public /* synthetic */ DocAuthResult(DocumentType documentType, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Point[] pointArr, CreditCardScannerResult creditCardScannerResult, DiagnosticInfo diagnosticInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(documentType, f, z, z2, z3, z4, z5, pointArr, creditCardScannerResult, (i & 512) != 0 ? null : diagnosticInfo);
    }

    public final CreditCardScannerResult getCreditCardScannerResult() {
        return this.creditCardScannerResult;
    }

    public final Point[] getDetectedCorners() {
        return this.detectedCorners;
    }

    public final DiagnosticInfo getDiagnosticInfo() {
        return this.diagnosticInfo;
    }

    public final DocumentType getDocumentType() {
        return this.documentType;
    }

    public final float getWidthToHeightRatio() {
        return this.widthToHeightRatio;
    }

    public final boolean get_hasGlare() {
        return this._hasGlare;
    }

    public final boolean hasGlare() {
        return this._hasGlare;
    }

    public final boolean isAligned() {
        return this.isAligned;
    }

    public final boolean isBlurry() {
        return this.isBlurry;
    }

    public final boolean isFound() {
        return this.isFound;
    }

    public final boolean isGoodImage() {
        if (this.isFound && this.isAligned && !this.isBlurry && !this._hasGlare) {
            return true;
        }
        return false;
    }

    public final boolean isMinWidthCoveragePassed() {
        return this.isMinWidthCoveragePassed;
    }

    public String toString() {
        return AbstractC58318PtA.A0o(Locale.UK, "Doc. type = %s, ratio = %f, is found = %b, is aligned = %b, min width coverage = %B, is blurry = %b, has glare = %b", Arrays.copyOf(new Object[]{this.documentType.getType(), Float.valueOf(this.widthToHeightRatio), Boolean.valueOf(this.isFound), Boolean.valueOf(this.isAligned), Boolean.valueOf(this.isMinWidthCoveragePassed), Boolean.valueOf(this.isBlurry), Boolean.valueOf(this._hasGlare)}, 7));
    }

    public DocAuthResult(DocumentType documentType, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Point[] pointArr, CreditCardScannerResult creditCardScannerResult, DiagnosticInfo diagnosticInfo) {
        C14360o3.A0B(documentType, 1);
        this.documentType = documentType;
        this.widthToHeightRatio = f;
        this.isFound = z;
        this.isAligned = z2;
        this.isMinWidthCoveragePassed = z3;
        this.isBlurry = z4;
        this._hasGlare = z5;
        this.detectedCorners = pointArr;
        this.creditCardScannerResult = creditCardScannerResult;
        this.diagnosticInfo = diagnosticInfo;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DocAuthResult(DocumentType documentType, float f, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Point[] pointArr, CreditCardScannerResult creditCardScannerResult) {
        this(documentType, f, z, z2, z3, z4, z5, pointArr, creditCardScannerResult, null);
        C14360o3.A0B(documentType, 1);
    }
}
