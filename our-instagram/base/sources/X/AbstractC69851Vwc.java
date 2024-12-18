package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;

/* renamed from: X.Vwc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC69851Vwc {
    public static final String A00(C2I1 c2i1) {
        int ordinal;
        if (c2i1 != null && (ordinal = c2i1.ordinal()) != -1) {
            if (ordinal != 4) {
                if (ordinal != 5) {
                    if (ordinal != 3) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                return NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                            }
                            throw new RuntimeException("Migration result returned from migration call should not be unknown.");
                        }
                        return "FAILURE";
                    }
                    return "PARTIAL";
                }
                return "SUCCESS";
            }
            return "SKIPPED";
        }
        return "FAILURE";
    }

    public static final LinkedHashMap A01(String str, int i) {
        LinkedHashMap A07 = AbstractC06930Yk.A07(AbstractC25230BEn.A1b("init_count", String.valueOf(i)));
        if (str != null) {
            A07.put("error_extra_data", str);
        }
        return A07;
    }
}
