package com.instagram.shopping.model.analytics;

import X.AbstractC111324zv;
import X.AbstractC166997dE;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC37302Gc3;
import X.C0T6;
import X.C0Zx;
import X.C14360o3;
import X.C37324GcR;
import X.C38535Gww;
import X.C4SX;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.user.model.Product;
import java.util.Map;

/* loaded from: classes7.dex */
public final class ProductDetailsPageLoggingInfo extends C0T6 implements Parcelable {
    public static final C37324GcR CREATOR = C37324GcR.A00(74);
    public final long A00;
    public final long A01;
    public final C4SX A02;
    public final String A03;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductDetailsPageLoggingInfo) {
                ProductDetailsPageLoggingInfo productDetailsPageLoggingInfo = (ProductDetailsPageLoggingInfo) obj;
                if (this.A00 != productDetailsPageLoggingInfo.A00 || this.A01 != productDetailsPageLoggingInfo.A01 || !C14360o3.A0K(this.A02, productDetailsPageLoggingInfo.A02) || !C14360o3.A0K(this.A03, productDetailsPageLoggingInfo.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C14360o3.A0B(parcel, 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        Long l = this.A02.A00;
        C14360o3.A07(l);
        parcel.writeLong(l.longValue());
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0Zx, X.Gww] */
    public final C38535Gww A00() {
        ?? c0Zx = new C0Zx();
        c0Zx.A05(AbstractC111324zv.A00(222), Long.valueOf(this.A00));
        c0Zx.A05("pdp_product_id", Long.valueOf(this.A01));
        C4SX c4sx = this.A02;
        Map map = c0Zx.A00;
        Object obj = c4sx;
        if (c4sx != null) {
            obj = c4sx.F7g();
        }
        map.put("pdp_merchant_id", obj);
        c0Zx.A06("central_pdp_version", this.A03);
        return c0Zx;
    }

    public final int hashCode() {
        long j = this.A00;
        return AbstractC166997dE.A0J(this.A02, AbstractC167007dF.A07(this.A01, ((int) (j ^ (j >>> 32))) * 31)) + AbstractC167017dG.A0O(this.A03);
    }

    public ProductDetailsPageLoggingInfo(Parcel parcel) {
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        C4SX c4sx = new C4SX(Long.valueOf(parcel.readLong()));
        this.A00 = readLong;
        this.A01 = readLong2;
        this.A02 = c4sx;
        this.A03 = null;
    }

    public ProductDetailsPageLoggingInfo(String str, String str2, String str3) {
        long parseLong = Long.parseLong(str);
        long parseLong2 = Long.parseLong(str2);
        C4SX A00 = C4SX.A00(str3);
        this.A00 = parseLong;
        this.A01 = parseLong2;
        this.A02 = A00;
        this.A03 = "v0.1";
    }

    public ProductDetailsPageLoggingInfo(Product product, Product product2) {
        long parseLong = Long.parseLong(product.A0H);
        long parseLong2 = Long.parseLong(product2.A0H);
        C4SX A00 = C4SX.A00(AbstractC37302Gc3.A0d(product2));
        this.A00 = parseLong;
        this.A01 = parseLong2;
        this.A02 = A00;
        this.A03 = null;
    }
}
