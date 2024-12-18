package com.facebook.cameracore.ardelivery.xplat.connectioninfo;

import X.C14360o3;
import X.C18150uz;
import X.InterfaceC149916ok;
import X.MYR;
import android.net.NetworkInfo;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class XplatDataConnectionManager {
    public final InterfaceC149916ok assetManagerDataConnectionManager;

    public XplatDataConnectionManager(InterfaceC149916ok interfaceC149916ok) {
        C14360o3.A0B(interfaceC149916ok, 1);
        this.assetManagerDataConnectionManager = interfaceC149916ok;
    }

    public final String getBandwidthConnectionQuality() {
        String str;
        MYR myr;
        NetworkInfo A03 = C18150uz.A0B.A01().A03();
        if (A03 != null && A03.isConnected()) {
            int type = A03.getType();
            int subtype = A03.getSubtype();
            if (type == 1 || type != 0 || (subtype != 1 && subtype != 2 && subtype != 4 && subtype != 7 && subtype != 11)) {
                myr = MYR.A04;
            } else {
                myr = MYR.A06;
            }
            str = myr.name();
        } else {
            str = "UNKNOWN";
        }
        C14360o3.A07(str);
        return str;
    }

    public final String getConnectionName() {
        String str;
        NetworkInfo A03 = C18150uz.A0B.A01().A03();
        if (A03 != null && A03.isConnected()) {
            if (A03.getType() == 1) {
                str = A03.getTypeName().toUpperCase(Locale.US);
            } else {
                str = A03.getSubtypeName();
            }
        } else {
            str = "UNKNOWN";
        }
        C14360o3.A07(str);
        return str;
    }
}
