package X;

import com.facebook.dsp.core.ColorData;
import kotlin.enums.EnumEntries;

/* loaded from: classes11.dex */
public abstract class VLR {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        U6H u6h;
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        String A0I = A0O.A0I();
        if (A0I != null) {
            EnumEntries enumEntries = U6H.A03;
            u6h = U6E.A00(A0I);
        } else {
            u6h = null;
        }
        ColorData A02 = U6D.A02(A0O.A08(35));
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) C66224U4u.A01(c6fg.A00);
            if (interfaceC72040XGi != null) {
                if (interfaceC72040XGi.BUG() != U6H.A07) {
                    interfaceC72040XGi.FAP(A02, u6h);
                } else {
                    throw new IllegalStateException("Cannot update a full screen using the UpdateBottomSheet action.");
                }
            } else {
                throw new IllegalStateException("Cannot update bottom sheet without an existing bottom sheet.");
            }
        }
        return null;
    }
}
