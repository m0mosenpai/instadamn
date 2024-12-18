package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;

/* renamed from: X.F2u, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC34092F2u {
    public static final ELx A00(UserSession userSession, Capabilities capabilities, InterfaceC83733oI interfaceC83733oI, int i, boolean z) {
        AbstractC167017dG.A1N(userSession, capabilities);
        ELx eLx = new ELx();
        Bundle A05 = AbstractC31178DnM.A05(userSession);
        AbstractC35077Fco.A01(A05, capabilities, interfaceC83733oI);
        A05.putInt(AbstractC111324zv.A00(18), i);
        A05.putBoolean("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_IS_ELIGIBLE_FOR_DMM", z);
        eLx.setArguments(A05);
        return eLx;
    }
}
