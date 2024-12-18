package X;

import android.os.Build;
import java.util.HashMap;

/* renamed from: X.SCx, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62470SCx {
    public final int A00;
    public final HashMap A01;

    public C62470SCx() {
        int intValue;
        HashMap A02 = AbstractC06930Yk.A02(AbstractC166987dD.A1L("robolectric-BrandX/ProductX/Device30:11", 30), AbstractC166987dD.A1L("robolectric-BrandX/ProductX/Device31:12", 31), AbstractC166987dD.A1L("OPPO/CPH2025EEA/OP4BA2L1:12", 30), AbstractC166987dD.A1L("OPPO/CPH2207EEA/OP4F0BL1:12", 30), AbstractC166987dD.A1L("OPPO/PENM00/OP4EC1:11", 30), AbstractC166987dD.A1L("OnePlus/OnePlus7TTMO/OnePlus7TTMO:11", 30), AbstractC166987dD.A1L("OnePlus/OnePlus8_BETA/OnePlus8:11", 30), AbstractC166987dD.A1L("Xiaomi/umi_global/umi:11", 30), AbstractC166987dD.A1L("realme/RMX2085/RMX2085L1:11", 30), AbstractC166987dD.A1L("samsung/c1qsqw/c1q:12", 30), AbstractC166987dD.A1L("samsung/o1quew/o1q:12", 30), AbstractC166987dD.A1L("samsung/r0quew/r0q:12", 30), AbstractC166987dD.A1L("samsung/r0sxxx/r0s:12", 30));
        this.A01 = A02;
        if (Build.VERSION.SDK_INT < 31 || (intValue = Build.VERSION.MEDIA_PERFORMANCE_CLASS) < 30) {
            String str = Build.BRAND;
            String str2 = Build.PRODUCT;
            String str3 = Build.DEVICE;
            String str4 = Build.VERSION.RELEASE;
            StringBuilder A11 = AbstractC166997dE.A11(str);
            A11.append('/');
            A11.append(str2);
            A11.append('/');
            A11.append(str3);
            A11.append(':');
            Number number = (Number) A02.get(AbstractC166997dE.A0x(str4, A11));
            intValue = (number == null ? AbstractC25227BEk.A0p() : number).intValue();
            if (intValue < 30) {
                intValue = 0;
            }
        }
        this.A00 = intValue;
    }
}
