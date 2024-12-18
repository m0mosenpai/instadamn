package X;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.6oy, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150026oy {
    public final InterfaceC19630xq A00 = AbstractC19750y3.A01("ig_ard_nmlml_migration_capability_version_schema");
    public final Map A01 = Collections.synchronizedMap(new HashMap());

    public C150026oy() {
        for (C150046p0 c150046p0 : AbstractC150036oz.A00()) {
            InterfaceC19630xq interfaceC19630xq = this.A00;
            VersionedCapability versionedCapability = c150046p0.A01;
            String serverValue = versionedCapability.toServerValue();
            EnumC150056p1 enumC150056p1 = EnumC150056p1.ARD;
            String string = interfaceC19630xq.getString(serverValue, enumC150056p1.toString());
            Map map = this.A01;
            if (string != null) {
                EnumC150056p1 enumC150056p12 = EnumC150056p1.NMLML;
                if (!enumC150056p12.A00.equals(string)) {
                    enumC150056p12 = enumC150056p1;
                    if (!enumC150056p1.A00.equals(string)) {
                        enumC150056p12 = EnumC150056p1.INVALID;
                    }
                }
                enumC150056p1 = enumC150056p12;
            }
            map.put(versionedCapability, enumC150056p1);
        }
    }
}
