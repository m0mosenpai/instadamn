package X;

import android.os.Bundle;

/* renamed from: X.1Xg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28021Xg {
    public final C32283EJu A00(Integer num, String str, String str2, String str3, String str4, String str5, double d, double d2) {
        int i;
        C14360o3.A0B(str, 2);
        C14360o3.A0B(str2, 3);
        C14360o3.A0B(str3, 4);
        C14360o3.A0B(str4, 5);
        C14360o3.A0B(str5, 6);
        C32283EJu c32283EJu = new C32283EJu();
        Bundle bundle = new Bundle();
        bundle.putDouble("ARG_LOCATION_LATITUDE", d);
        bundle.putDouble("ARG_LOCATION_LONGITUDE", d2);
        bundle.putString("ARG_DEVICE_NAME", str);
        bundle.putString("ARG_TIMESTAMP", str2);
        bundle.putString("ARG_LOCATION_NAME", str3);
        bundle.putString("ARG_REQUEST_DEVICE_ID", str4);
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        bundle.putInt("ARG_USER_ACTION", i);
        bundle.putString("ARG_TWO_FAC_IDENTIFIER", str5);
        c32283EJu.setArguments(bundle);
        return c32283EJu;
    }
}
