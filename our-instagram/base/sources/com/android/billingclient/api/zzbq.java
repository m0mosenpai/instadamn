package com.android.billingclient.api;

import X.C00O;
import X.InterfaceC65312Tho;
import X.InterfaceC65313Thp;
import X.InterfaceC65315Thr;
import X.InterfaceC65316Ths;
import X.InterfaceC65317Tht;
import X.InterfaceC65318Thu;
import X.InterfaceC65468Tkk;
import X.SYG;
import java.util.Collections;
import java.util.List;

/* loaded from: classes10.dex */
public final class zzbq implements InterfaceC65468Tkk, InterfaceC65312Tho, InterfaceC65313Thp, InterfaceC65316Ths, InterfaceC65317Tht, InterfaceC65318Thu, InterfaceC65315Thr {
    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // X.InterfaceC65312Tho
    public final void CuS(SYG syg) {
        nativeOnAcknowledgePurchaseResponse(syg.A00, syg.A01, 0L);
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzM(SYG syg) {
        nativeOnBillingSetupFinished(syg.A00, syg.A01, 0L);
    }

    @Override // X.InterfaceC65313Thp
    public final void D7L(SYG syg, String str) {
        nativeOnConsumePurchaseResponse(syg.A00, syg.A01, str, 0L);
    }

    @Override // X.InterfaceC65315Thr
    public final void DcX(SYG syg, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchaseHistoryResponse(syg.A00, syg.A01, (PurchaseHistoryRecord[]) list.toArray(new PurchaseHistoryRecord[list.size()]), 0L);
    }

    @Override // X.InterfaceC65318Thu
    public final void Dmw(SYG syg, List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(syg.A00, syg.A01, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), 0L);
    }

    @Override // X.InterfaceC65468Tkk
    public final void CzL() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // X.InterfaceC65317Tht
    public final void DcZ(SYG syg, List list) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC65316Ths
    public final void Dcc(SYG syg, List list) {
        nativeOnQueryPurchasesResponse(syg.A00, syg.A01, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }
}
