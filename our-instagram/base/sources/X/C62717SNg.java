package X;

import java.util.Map;

/* renamed from: X.SNg, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C62717SNg {
    public final Map A00;
    public final Map A01;

    public final Enum A00(Object objectEnum) {
        Enum r0 = (Enum) this.A01.get(objectEnum);
        if (r0 != null) {
            return r0;
        }
        throw AbstractC58320PtC.A19(objectEnum, "Unable to convert object enum: ", AbstractC166987dD.A1C());
    }

    public final Object A01(Enum protoEnum) {
        Object obj = this.A00.get(protoEnum);
        if (obj != null) {
            return obj;
        }
        throw AbstractC58320PtC.A19(protoEnum, "Unable to convert proto enum: ", AbstractC166987dD.A1C());
    }

    public C62717SNg(Map fromProtoEnumMap, Map toProtoEnumMap) {
        this.A00 = fromProtoEnumMap;
        this.A01 = toProtoEnumMap;
    }
}
