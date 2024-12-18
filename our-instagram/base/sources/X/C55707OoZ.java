package X;

import android.os.Build;
import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import java.util.Map;

/* renamed from: X.OoZ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55707OoZ implements InterfaceC73623Ro {
    public static final String A00;
    public static final String A01;
    public static final Map A02;

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "DeviceSpeedSource";
    }

    static {
        String str = Build.MANUFACTURER;
        C14360o3.A08(str);
        String A0h = AbstractC167007dF.A0h(str);
        A01 = A0h;
        A00 = AnonymousClass001.A0R("base speed missing for ", A0h);
        C09530e4 A1L = AbstractC166987dD.A1L("samsung", Float.valueOf(1.28f));
        C09530e4 A1L2 = AbstractC166987dD.A1L("xiaomi", Float.valueOf(1.24f));
        Float valueOf = Float.valueOf(1.2f);
        C09530e4 A1L3 = AbstractC166987dD.A1L("vivo", valueOf);
        Float valueOf2 = Float.valueOf(1.25f);
        A02 = AbstractC06930Yk.A06(A1L, A1L2, A1L3, AbstractC166987dD.A1L("motorola", valueOf2), AbstractC166987dD.A1L("oppo", valueOf), AbstractC166987dD.A1L("realme", Float.valueOf(1.21f)), AbstractC166987dD.A1L("huawei", Float.valueOf(1.43f)), AbstractC166987dD.A1L("oneplus", valueOf2), AbstractC166987dD.A1L("google", Float.valueOf(1.18f)), AbstractC166987dD.A1L("honor", Float.valueOf(1.52f)), AbstractC166987dD.A1L("infinix", Float.valueOf(1.3f)), AbstractC166987dD.A1L("infinix mobility limited", Float.valueOf(1.23f)), AbstractC166987dD.A1L("tecno mobile limited", Float.valueOf(1.17f)));
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        Map map = A02;
        String str = A01;
        if (!map.containsKey(str)) {
            return MSW.A0L(C16930sl.A00, A00, false);
        }
        try {
            C3R9[] c3r9Arr = FeatureData.A0E;
            if (map.get(str) != null) {
                return MSW.A0L(AbstractC166987dD.A1J(new FeatureData(null, "111", null, null, AbstractC166987dD.A09(r0), 16374, 0L)), null, true);
            }
            throw AbstractC166997dE.A0g();
        } catch (IllegalStateException e) {
            return MSZ.A0P(e);
        }
    }
}
