package X;

import com.facebook.common.dextricks.OptSvcAnalyticsStore;

/* renamed from: X.Ezf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34000Ezf {
    public static final Object A00(C6FW c6fw) {
        String A0d = AbstractC31177DnL.A0d(c6fw);
        int A0D = AbstractC25230BEn.A0D(c6fw.A02(), "null cannot be cast to non-null type kotlin.Number");
        int hashCode = A0d.hashCode();
        if (hashCode != -1867169789) {
            if (hashCode != -1367724422) {
                if (hashCode == -1086574198 && A0d.equals(OptSvcAnalyticsStore.LOGGING_KEY_DEX2OAT_FAILURE)) {
                    C63B.A01.ATD(719983200, A0D);
                    return null;
                }
                return null;
            }
            if (!A0d.equals("cancel")) {
                return null;
            }
            C006802i.A0p.markerEnd(719983200, A0D, (short) 4);
            return null;
        }
        if (!A0d.equals("success")) {
            return null;
        }
        C63B.A01.ATE(719983200, A0D);
        return null;
    }
}
