package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class OTM {
    public final InterfaceC09390do A00;
    public final InterfaceC09390do A01;

    public static final boolean A00(OTM otm) {
        return AbstractC167007dF.A1Z(otm.A00);
    }

    public OTM(Context context, UserSession userSession) {
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A01 = AbstractC09440dt.A00(enumC09460dv, new C37015GSu(userSession, 33));
        this.A00 = AbstractC09440dt.A00(enumC09460dv, C57535Pg9.A00(context, userSession, 13));
    }
}
