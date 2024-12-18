package com.google.android.gms.auth.api.accounttransfer;

import X.AbstractC128825rw;
import X.AbstractC166987dD;
import X.AbstractC58319PtB;
import X.C012504o;
import X.C63470SlB;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes10.dex */
public final class zzw extends zzbz {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = C63470SlB.A00(91);
    public int A00;
    public String A01;
    public byte[] A02;
    public PendingIntent A03;
    public DeviceMetaData A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A07 = A1G;
        A1G.put("accountType", new FastJsonResponse$Field(null, "accountType", 7, 7, 2, false, false));
        A1G.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, new FastJsonResponse$Field(null, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 0, 0, 3, false, false));
        A1G.put("transferBytes", new FastJsonResponse$Field(null, "transferBytes", 8, 8, 4, false, false));
    }

    public zzw() {
        this.A06 = new C012504o(3);
        this.A05 = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A04 = AbstractC58319PtB.A04(parcel);
        Set set = this.A06;
        if (AbstractC58319PtB.A1W(set, 1)) {
            AbstractC128825rw.A07(parcel, 1, this.A05);
        }
        if (AbstractC58319PtB.A1W(set, 2)) {
            AbstractC128825rw.A0C(parcel, this.A01, 2, true);
        }
        if (AbstractC58319PtB.A1W(set, 3)) {
            AbstractC128825rw.A07(parcel, 3, this.A00);
        }
        if (AbstractC58319PtB.A1W(set, 4)) {
            AbstractC128825rw.A0F(parcel, this.A02, 4, true);
        }
        if (AbstractC58319PtB.A1W(set, 5)) {
            AbstractC128825rw.A0A(parcel, this.A03, 5, i, true);
        }
        if (AbstractC58319PtB.A1W(set, 6)) {
            AbstractC128825rw.A0A(parcel, this.A04, 6, i, true);
        }
        AbstractC128825rw.A06(parcel, A04);
    }

    public zzw(PendingIntent pendingIntent, DeviceMetaData deviceMetaData, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A02 = bArr;
        this.A03 = pendingIntent;
        this.A04 = deviceMetaData;
    }
}
