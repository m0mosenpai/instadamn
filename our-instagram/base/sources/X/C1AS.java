package X;

import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.1AS, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1AS {
    public final C1AZ A00;

    public static final void A01(C1AS c1as) {
        InterfaceC19630xq interfaceC19630xq = c1as.A00.A00;
        InterfaceC19610xo ARD = interfaceC19630xq.ARD();
        C14360o3.A0B(ARD, 1);
        ARD.AHW();
        ARD.apply();
        InterfaceC19610xo ARD2 = interfaceC19630xq.ARD();
        C14360o3.A0B(ARD2, 1);
        ARD2.E7D("cache_version", 4);
        ARD2.apply();
    }

    public static final boolean A02(C1AS c1as, C22951Aa c22951Aa, Integer num) {
        try {
            C1AZ c1az = c1as.A00;
            String A00 = c22951Aa.A00(num);
            C14360o3.A0B(A00, 0);
            String string = c1az.A00.getString(A00, null);
            if (string != null && string.length() != 0) {
                JSONObject jSONObject = new JSONObject(string);
                jSONObject.getString("exposureId");
                String string2 = jSONObject.getString("valueSource");
                C14360o3.A07(string2);
                MobileConfigValueSource valueOf = MobileConfigValueSource.valueOf(string2);
                boolean optBoolean = jSONObject.optBoolean("atSomePointHadServerValue");
                Boolean valueOf2 = Boolean.valueOf(optBoolean);
                C14360o3.A0B(valueOf, 2);
                if (valueOf2 != null) {
                    return optBoolean;
                }
            }
        } catch (ClassCastException | Exception unused) {
        }
        return false;
    }

    public C1AS(C1AZ c1az) {
        this.A00 = c1az;
        if (4 > c1az.A00.getInt("cache_version", -1)) {
            A01(this);
        }
    }

    public static final String A00(List list) {
        if (AbstractC001800i.A0k(list).size() > 1) {
            return "MULTIPLE_SOURCES";
        }
        return (String) list.get(0);
    }
}
