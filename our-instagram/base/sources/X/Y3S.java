package X;

import com.facebook.papaya.hash.DefaultHasher;
import com.facebook.papaya.mldw.DataValue;
import com.facebook.papaya.mldw.Host;
import com.google.common.collect.ImmutableMap;

/* loaded from: classes12.dex */
public final class Y3S {
    public final Host A00;
    public final ImmutableMap A01;
    public final C38951rU A02;

    public Y3S(Host host, ImmutableMap immutableMap, C38951rU c38951rU) {
        C14360o3.A0B(immutableMap, 2);
        this.A00 = host;
        this.A01 = immutableMap;
        this.A02 = c38951rU;
        XgZ xgZ = DefaultHasher.Companion;
    }

    public static final void A00(Y3S y3s, String str, String str2, String str3) {
        C38951rU c38951rU = y3s.A02;
        if (c38951rU.A01()) {
            c38951rU.A00().Ci2(1L, str, str2, str3, true);
        }
    }

    public static final void A01(ImmutableMap.Builder builder, Object obj, String str, String str2) {
        long A03;
        Long valueOf;
        DataValue dataValue;
        Float f;
        if (obj instanceof String) {
            dataValue = new DataValue((String) obj);
        } else {
            if (obj instanceof Double) {
                DataValue dataValue2 = DataValue.$redex_init_class;
                f = Float.valueOf((float) ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                f = (Float) obj;
            } else {
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (obj instanceof Integer) {
                        DataValue dataValue3 = DataValue.$redex_init_class;
                        A03 = AbstractC166987dD.A0H(obj);
                    } else if (obj instanceof Boolean) {
                        DataValue dataValue4 = DataValue.$redex_init_class;
                        A03 = AbstractC37302Gc3.A03(AbstractC166987dD.A1a(obj) ? 1 : 0);
                    } else {
                        C0K8.A0O("MldwFederatedAnalyticsLogger", "Event %s has an unsupported property %s", str, str2);
                        return;
                    }
                    valueOf = Long.valueOf(A03);
                }
                dataValue = new DataValue(valueOf);
            }
            dataValue = new DataValue(f);
        }
        builder.put(str2, dataValue);
    }
}
