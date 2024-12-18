package X;

import com.instagram.direct.msys.subtype.MsysThreadSubtype;

/* renamed from: X.KoL, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46878KoL {
    public static final MsysThreadSubtype A00(Integer num) {
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 0) {
                return MsysThreadSubtype.Standard.A00;
            }
            if (intValue == 2) {
                return MsysThreadSubtype.DualSendShadow.A00;
            }
            if (intValue == 3) {
                return MsysThreadSubtype.BtvCompanion.A00;
            }
            if (intValue == 4) {
                return MsysThreadSubtype.BlendDualSend.A00;
            }
            if (intValue == 5) {
                return MsysThreadSubtype.BlendDualSendNoNetwork.A00;
            }
        }
        return new MsysThreadSubtype.Unknown(num);
    }
}
