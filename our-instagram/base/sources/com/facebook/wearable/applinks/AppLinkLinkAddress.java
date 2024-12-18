package com.facebook.wearable.applinks;

import X.C63472SlD;
import X.Rj5;
import android.os.Parcelable;
import com.oculus.applinks.LinkAddress;
import org.microg.safeparcel.AutoSafeParcelable;
import org.microg.safeparcel.SafeParcelable;

/* loaded from: classes10.dex */
public class AppLinkLinkAddress extends AutoSafeParcelable {
    public static final Parcelable.Creator CREATOR = C63472SlD.A00(AppLinkLinkAddress.class);

    @SafeParcelable.Field(2)
    public String address;

    @SafeParcelable.Field(1)
    public int addressType;

    public AppLinkLinkAddress(LinkAddress linkAddress) {
        Rj5 rj5;
        this.address = linkAddress.data_.A04();
        int i = linkAddress.addressType_;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        rj5 = Rj5.UNRECOGNIZED;
                    } else {
                        rj5 = Rj5.BTC;
                    }
                } else {
                    rj5 = Rj5.IPV6;
                }
            } else {
                rj5 = Rj5.IPV4;
            }
        } else {
            rj5 = Rj5.EMPTY;
        }
        this.addressType = rj5.BY9();
    }

    public AppLinkLinkAddress() {
    }
}
