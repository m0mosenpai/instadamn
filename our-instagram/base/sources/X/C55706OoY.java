package X;

import android.os.Build;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import java.util.Map;

/* renamed from: X.OoY, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55706OoY implements InterfaceC73623Ro {
    public static final String A00;
    public static final Map A01;

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "ManufacturerIdSource";
    }

    static {
        String str = Build.MANUFACTURER;
        C14360o3.A08(str);
        A00 = AbstractC167007dF.A0h(str);
        A01 = AbstractC06930Yk.A06(AbstractC166987dD.A1L("samsung", Float.valueOf(1.0f)), AbstractC166987dD.A1L("xiaomi", Float.valueOf(2.0f)), AbstractC166987dD.A1L("vivo", Float.valueOf(3.0f)), AbstractC166987dD.A1L("motorola", Float.valueOf(4.0f)), AbstractC166987dD.A1L("oppo", Float.valueOf(5.0f)), AbstractC166987dD.A1L("realme", Float.valueOf(6.0f)), AbstractC166987dD.A1L("huawei", Float.valueOf(7.0f)), AbstractC166987dD.A1L("oneplus", Float.valueOf(8.0f)), AbstractC166987dD.A1L("google", Float.valueOf(9.0f)), AbstractC166987dD.A1L("honor", Float.valueOf(10.0f)), AbstractC166987dD.A1L("infinix", Float.valueOf(11.0f)), AbstractC166987dD.A1L("infinix mobility limited", Float.valueOf(12.0f)), AbstractC166987dD.A1L("tecno mobile limited", Float.valueOf(13.0f)));
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        double d;
        C3R9[] c3r9Arr = FeatureData.A0E;
        Number A0Q = AbstractC37300Gc1.A0Q(A00, A01);
        if (A0Q != null) {
            d = A0Q.floatValue();
        } else {
            d = 0.0d;
        }
        return MSW.A0L(AbstractC166987dD.A1J(new FeatureData(null, "4294", null, null, d, 16374, 0L)), null, true);
    }
}
