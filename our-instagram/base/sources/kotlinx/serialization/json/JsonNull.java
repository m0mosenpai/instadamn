package kotlinx.serialization.json;

import X.AbstractC09440dt;
import X.C65881Tvk;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import kotlinx.serialization.Serializable;

@Serializable(with = JsonNullSerializer.class)
/* loaded from: classes11.dex */
public final class JsonNull extends JsonPrimitive {
    public static final JsonNull A00 = new Object();
    public static final /* synthetic */ InterfaceC09390do A01 = AbstractC09440dt.A00(EnumC09460dv.A03, new C65881Tvk(11));

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String A00() {
        return "null";
    }
}
