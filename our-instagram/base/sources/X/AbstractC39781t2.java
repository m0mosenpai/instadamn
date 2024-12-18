package X;

import com.facebook.common.dextricks.DexStore;
import java.util.Map;

/* renamed from: X.1t2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC39781t2 {
    public static int A00;
    public static C38654Gyv A01;

    public static final C38654Gyv A00() {
        C38654Gyv c38654Gyv = A01;
        if (c38654Gyv != null) {
            return c38654Gyv;
        }
        C14360o3.A0F(DexStore.CONFIG_FILENAME);
        throw C00O.createAndThrow();
    }

    public static final boolean A03() {
        if (A01 != null && A00().A09) {
            return true;
        }
        return false;
    }

    public static final void A01(Integer num, Map map) {
        C006802i c006802i = A00().A02;
        if (c006802i != null && num != null) {
            int intValue = num.intValue();
            c006802i.markerStart(intValue);
            for (Map.Entry entry : map.entrySet()) {
                c006802i.markerAnnotate(intValue, (String) entry.getKey(), (String) entry.getValue());
            }
            c006802i.markerEnd(intValue, (short) 2);
        }
    }

    public static final void A02(String str, String str2, String str3) {
        if (A03() && AbstractC001800i.A0u(A00().A07, str3)) {
            A01(A00().A05, AbstractC06930Yk.A06(new C09530e4("schema", str), new C09530e4("executor", str2), new C09530e4("callName", str3)));
        }
    }
}
