package com.android.billingclient.api;

import X.AbstractC58318PtA;
import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class PurchaseHistoryRecord {
    public final String A00;
    public final String A01;
    public final JSONObject A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PurchaseHistoryRecord) {
                PurchaseHistoryRecord purchaseHistoryRecord = (PurchaseHistoryRecord) obj;
                if (!TextUtils.equals(this.A00, purchaseHistoryRecord.A00) || !TextUtils.equals(this.A01, purchaseHistoryRecord.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return "PurchaseHistoryRecord. Json: ".concat(String.valueOf(this.A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public PurchaseHistoryRecord(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = AbstractC58318PtA.A17(str);
    }
}
