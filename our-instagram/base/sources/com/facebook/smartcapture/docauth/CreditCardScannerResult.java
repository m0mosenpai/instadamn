package com.facebook.smartcapture.docauth;

import X.AbstractC166987dD;
import X.AbstractC58318PtA;
import X.AnonymousClass001;
import X.C14360o3;
import android.content.Intent;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public final class CreditCardScannerResult {
    public static final Companion Companion = new Object();
    public final String digitOcrResult;
    public final String expiryDate;
    public final boolean isFound;
    public final String issueDate;
    public final String mergedOcrResult;
    public final String name;
    public final String number;
    public final String ocrResult;
    public final long processingTime;
    public final String textOcrResult;

    /* loaded from: classes10.dex */
    public final class Companion {
        public final CreditCardScannerResult fromIntent(Intent intent) {
            C14360o3.A0B(intent, 0);
            return new CreditCardScannerResult(true, intent.getStringExtra("credit_card_number"), intent.getStringExtra("credit_card_name"), intent.getStringExtra("credit_card_expiry_date"), null, 0L, null, null, null, null);
        }

        public final String getDebugReadableFormat(Intent intent) {
            C14360o3.A0B(intent, 0);
            return getDebugReadableFormat(intent.getStringExtra("credit_card_number"), intent.getStringExtra("credit_card_name"), intent.getStringExtra("credit_card_expiry_date"), intent.getStringExtra("credit_card_issue_date"));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String insertSpacesAtPositions(String str, int... iArr) {
            int length;
            if (str != null) {
                int length2 = str.length();
                if (length2 != 0 && (length = iArr.length) != 0) {
                    StringBuilder A1C = AbstractC166987dD.A1C();
                    int i = 0;
                    for (int i2 = 0; i2 < length2; i2++) {
                        if (i < length && i2 == iArr[i]) {
                            i++;
                            A1C.append(' ');
                        }
                        A1C.append(str.charAt(i2));
                    }
                    return A1C.toString();
                }
                return str;
            }
            return str;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }

        public final String getDebugReadableFormat(String str, String str2, String str3, String str4) {
            Locale locale = Locale.US;
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            if (str4 == null) {
                str4 = "";
            }
            return AbstractC58318PtA.A0o(locale, "Number: %s\nName: %s\nValid to: %s\nValid from: %s", Arrays.copyOf(new Object[]{str, str2, str3, str4}, 4));
        }
    }

    public static final String getDebugReadableFormat(Intent intent) {
        return Companion.getDebugReadableFormat(intent);
    }

    public static final String getDebugReadableFormat(String str, String str2, String str3, String str4) {
        return Companion.getDebugReadableFormat(str, str2, str3, str4);
    }

    public static final String insertSpacesAtPositions(String str, int... iArr) {
        return Companion.insertSpacesAtPositions(str, iArr);
    }

    public /* synthetic */ CreditCardScannerResult(boolean z, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? 0L : j, (i & 64) != 0 ? null : str5, (i & 128) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) == 0 ? str8 : null);
    }

    public final String getDigitOcrResult() {
        return this.digitOcrResult;
    }

    public final String getExpiryDate() {
        return this.expiryDate;
    }

    public final String getIssueDate() {
        return this.issueDate;
    }

    public final String getMergedOcrResult() {
        return this.mergedOcrResult;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final String getNumberWithSpaces() {
        Companion companion;
        int[] iArr;
        String str = this.number;
        if (str != null) {
            int length = str.length();
            if (Integer.valueOf(length) != null) {
                if (length == 15) {
                    companion = Companion;
                    iArr = new int[]{4, 10};
                } else {
                    if (length != 16) {
                        return str;
                    }
                    companion = Companion;
                    iArr = new int[]{4, 8, 12};
                }
                return companion.insertSpacesAtPositions(str, iArr);
            }
            return str;
        }
        return str;
    }

    public final String getOcrResult() {
        return this.ocrResult;
    }

    public final long getProcessingTime() {
        return this.processingTime;
    }

    public final String getTextOcrResult() {
        return this.textOcrResult;
    }

    public final boolean isFound() {
        return this.isFound;
    }

    public String toString() {
        return AnonymousClass001.A0R(AbstractC58318PtA.A0o(Locale.US, "Found: %b\nProcessing time: %d", Arrays.copyOf(new Object[]{Boolean.valueOf(this.isFound), Long.valueOf(this.processingTime)}, 2)), Companion.getDebugReadableFormat(this.number, this.name, this.expiryDate, this.issueDate));
    }

    public final String getDisplayFormat() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append(getNumberWithSpaces());
        String str = this.expiryDate;
        if (str != null && str.length() > 0) {
            A1C.append("\n");
            A1C.append(str);
        }
        return AbstractC166987dD.A19(A1C);
    }

    public CreditCardScannerResult(boolean z, String str, String str2, String str3, String str4, long j, String str5, String str6, String str7, String str8) {
        this.isFound = z;
        this.number = str;
        this.name = str2;
        this.expiryDate = str3;
        this.issueDate = str4;
        this.processingTime = j;
        this.ocrResult = str5;
        this.digitOcrResult = str6;
        this.textOcrResult = str7;
        this.mergedOcrResult = str8;
    }
}
