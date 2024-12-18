package com.fbpay.w3c.ipc;

import X.AbstractC167017dG;
import X.C0f9;
import X.C62968SZl;
import X.TOP;
import X.TOQ;
import X.TOR;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.fbpay.w3c.FBPaymentService;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class BaseFBPaymentServiceImpl$handler$1 extends Binder implements FBPaymentService {
    public final /* synthetic */ FBPaymentServiceImpl A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BaseFBPaymentServiceImpl$handler$1(FBPaymentServiceImpl fBPaymentServiceImpl) {
        this();
        this.A00 = fBPaymentServiceImpl;
        C0f9.A0A(1046190929, C0f9.A03(1934758393));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.fbpay.w3c.FBPaymentService$Stub$Proxy, java.lang.Object, com.fbpay.w3c.FBPaymentService] */
    public static FBPaymentService A00(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.fbpay.w3c.FBPaymentService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof FBPaymentService)) {
            return (FBPaymentService) queryLocalInterface;
        }
        ?? obj = new Object();
        int A03 = C0f9.A03(1394179736);
        obj.A00 = iBinder;
        C0f9.A0A(1561766818, A03);
        return obj;
    }

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A7s(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
        int i;
        int A0N = AbstractC167017dG.A0N(fBPaymentServiceAddressCallback, -883036859);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        C62968SZl c62968SZl = fBPaymentServiceImpl.A01;
        if (c62968SZl != null && c62968SZl.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceImpl.A00.post(new TOP(fBPaymentServiceAddressCallback, fBPaymentServiceImpl));
            i = -695082795;
        } else {
            fBPaymentServiceAddressCallback.Dx1(Collections.emptyList());
            i = 2117006956;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A86(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
        int i;
        int A0N = AbstractC167017dG.A0N(fBPaymentServiceCardDetailsCallback, 172746894);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        C62968SZl c62968SZl = fBPaymentServiceImpl.A01;
        if (c62968SZl != null && c62968SZl.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceImpl.A00.post(new TOQ(fBPaymentServiceCardDetailsCallback, fBPaymentServiceImpl));
            i = 2026234444;
        } else {
            fBPaymentServiceCardDetailsCallback.Dx1(Collections.emptyList());
            i = -1033120705;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // com.fbpay.w3c.FBPaymentService
    public final void A8B(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
        int i;
        int A0N = AbstractC167017dG.A0N(fBPaymentServiceContactCallback, -497492689);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        C62968SZl c62968SZl = fBPaymentServiceImpl.A01;
        if (c62968SZl != null && c62968SZl.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceImpl.A00.post(new TOR(fBPaymentServiceContactCallback, fBPaymentServiceImpl));
            i = 1339713357;
        } else {
            fBPaymentServiceContactCallback.Dx1(Collections.emptyList());
            i = 289163115;
        }
        C0f9.A0A(i, A0N);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        C0f9.A0A(-96941445, C0f9.A03(-1508727806));
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        if (r0 != false) goto L52;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceContactCallback$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceAddressCallback$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceCardDetailsCallback$Stub$Proxy] */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.fbpay.w3c.FBPaymentServiceAddCardCallback$Stub$Proxy, java.lang.Object] */
    @Override // android.os.Binder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public BaseFBPaymentServiceImpl$handler$1() {
        int A03 = C0f9.A03(1080421960);
        attachInterface(this, "com.fbpay.w3c.FBPaymentService");
        C0f9.A0A(1959518567, A03);
    }
}
