package X;

import com.facebook.odin.model.FeatureData;
import com.facebook.odin.model.OdinContext;
import com.facebook.odin.model.Type;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.OoW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55704OoW implements InterfaceC73623Ro {
    public final UserSession A00;
    public final InterfaceC58123Ppm A01;

    @Override // X.InterfaceC73623Ro
    public final String getId() {
        return "ReelsSwipeSource";
    }

    public C55704OoW(UserSession userSession, InterfaceC58123Ppm interfaceC58123Ppm) {
        AbstractC167017dG.A1P(userSession, interfaceC58123Ppm);
        this.A00 = userSession;
        this.A01 = interfaceC58123Ppm;
    }

    @Override // X.InterfaceC73623Ro
    public final C3SN ATr(OdinContext odinContext) {
        ArrayList A1E = AbstractC166987dD.A1E();
        C3R9[] c3r9Arr = FeatureData.A0E;
        Type type = Type.A09;
        UserSession userSession = this.A00;
        C06090Tz c06090Tz = C06090Tz.A06;
        A1E.add(new FeatureData(type, "111", null, null, 0.0d, 16376, C18U.A01(c06090Tz, userSession, 36598992586214772L)));
        A1E.add(new FeatureData(type, "222", null, null, 0.0d, 16376, C18U.A01(c06090Tz, userSession, 36598992586345846L)));
        A1E.add(new FeatureData(Type.A06, "333", null, null, C18U.A00(c06090Tz, userSession, 37161942539829446L), 16372, 0L));
        Type type2 = Type.A0A;
        InterfaceC58123Ppm interfaceC58123Ppm = this.A01;
        A1E.add(new FeatureData(type2, "444", null, interfaceC58123Ppm.E8R(C05F.A00), 0.0d, 16316, 0L));
        A1E.add(new FeatureData(type2, "555", null, interfaceC58123Ppm.E8R(C05F.A01), 0.0d, 16316, 0L));
        return MSW.A0L(A1E, null, true);
    }
}
