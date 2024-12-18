package X;

import com.instagram.api.schemas.InspirationSignalType;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.Hpg, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC40054Hpg {
    public static H47 parseFromJson(C16L c16l) {
        String A1P;
        C14360o3.A0B(c16l, 0);
        try {
            if (c16l.A11() != C16R.A0D) {
                c16l.A0z();
                return null;
            }
            ArrayList arrayList = null;
            while (c16l.A1J() != C16R.A09) {
                if (AbstractC31177DnL.A1V(c16l, "signal_types")) {
                    if (c16l.A11() == C16R.A0C) {
                        arrayList = AbstractC166987dD.A1E();
                        while (c16l.A1J() != C16R.A08) {
                            if (c16l.A11() == C16R.A0G) {
                                A1P = null;
                            } else {
                                A1P = c16l.A1P();
                            }
                            InspirationSignalType inspirationSignalType = (InspirationSignalType) InspirationSignalType.A01.get(A1P);
                            if (inspirationSignalType == null) {
                                inspirationSignalType = InspirationSignalType.A0E;
                            }
                            arrayList.add(inspirationSignalType);
                        }
                    } else {
                        arrayList = null;
                    }
                }
                c16l.A0z();
            }
            if (arrayList == null && (c16l instanceof C07950bF)) {
                AbstractC166997dE.A1V("signal_types", c16l, "LumenLoggingInfoImpl");
                throw C00O.createAndThrow();
            }
            return new H47(arrayList);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AbstractC166987dD.A0m(e2);
        }
    }
}
