package X;

import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.2U5, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2U5 implements C2U6 {
    public static final C2U5 A00 = new Object();

    @Override // X.C2U6
    public final boolean isEnabled() {
        return false;
    }

    @Override // X.C2U6
    public final Rl2 ELD(InterfaceC65349TiW interfaceC65349TiW, ZonePolicy zonePolicy, String str) {
        try {
            return new R2C(new ZonedValue(zonePolicy, interfaceC65349TiW.get(), "UNKNOWN"));
        } catch (Exception e) {
            return new R2B(e);
        }
    }

    @Override // X.C2U6
    public final Rl2 F9v(ZonedValue zonedValue) {
        return new R2C(zonedValue.A01);
    }

    @Override // X.C2U6
    public final Object F9x(ZonedValue zonedValue, Integer num) {
        return zonedValue.A01;
    }
}
