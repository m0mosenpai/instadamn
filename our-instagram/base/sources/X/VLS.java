package X;

import com.facebook.dsp.core.ColorData;

/* loaded from: classes11.dex */
public abstract class VLS {
    public static final Object A00(C6FQ c6fq, C6FW c6fw) {
        C102884kP A0O = AbstractC65702TsY.A0O(c6fw);
        ColorData A01 = U6D.A01(A0O.A08(36));
        float A02 = A0O.A02(35, 0.0f);
        C6FG c6fg = c6fq.A03;
        if (c6fg != null) {
            InterfaceC72040XGi interfaceC72040XGi = (InterfaceC72040XGi) C66224U4u.A01(c6fg.A00);
            if (interfaceC72040XGi != null) {
                interfaceC72040XGi.FBS(A01, A02);
                return null;
            }
            throw new IllegalStateException("Cannot update modal container without an existing bottom sheet.");
        }
        throw AbstractC166997dE.A0g();
    }
}
